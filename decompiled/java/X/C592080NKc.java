package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.exts.TabIconExtsKt$download$2$downloadAll$2", f = "TabIconExts.kt", l = {25}, m = "invokeSuspend")
public final class C592080NKc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C592100NKe>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TabDynamicIconInfo LLILLL;
    public final /* synthetic */ C0NKZ LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592080NKc(TabDynamicIconInfo tabDynamicIconInfo, C0NKZ c0nkz, boolean z, InterfaceC1364105Vn<? super C592080NKc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = tabDynamicIconInfo;
        this.LLILZ = c0nkz;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592080NKc c592080NKc = new C592080NKc(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c592080NKc.LLILLJJLI = obj;
        return c592080NKc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconExtsKt@747f.download$2$downloadAll$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            TabDynamicIconInfo tabDynamicIconInfo = this.LLILLL;
            List listLJJJJLI = C13LP.LJJJJLI(C13LQ.LJLIIL(new TabIconViewConfig[]{tabDynamicIconInfo.topTabIconConfig, tabDynamicIconInfo.bottomTabIconConfig}));
            C0NKZ c0nkz = this.LLILZ;
            boolean z2 = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C592070NKb((TabIconViewConfig) it2.next(), c0nkz, z2, null), 2));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TabIconExtsKt@747f.download$2$downloadAll$2");
                return objLJFF;
            }
        }
        List list = (List) obj;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((C592100NKe) it3.next()).LIZIZ, arrayList2);
        }
        if (!list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                if (!((C592100NKe) it4.next()).LIZ) {
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        C592100NKe c592100NKe = new C592100NKe(z, arrayList2, null);
        C1C7U.LIZIZ("TabIconExtsKt@747f.download$2$downloadAll$2");
        return c592100NKe;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C592100NKe> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
