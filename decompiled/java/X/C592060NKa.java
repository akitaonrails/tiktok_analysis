package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.exts.TabIconExtsKt$download$4", f = "TabIconExts.kt", l = {47}, m = "invokeSuspend")
public final class C592060NKa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C592100NKe>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TabIconViewConfig LLILLL;
    public final /* synthetic */ C0NKZ LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592060NKa(TabIconViewConfig tabIconViewConfig, C0NKZ c0nkz, boolean z, InterfaceC1364105Vn<? super C592060NKa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = tabIconViewConfig;
        this.LLILZ = c0nkz;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592060NKa c592060NKa = new C592060NKa(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c592060NKa.LLILLJJLI = obj;
        return c592060NKa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconExtsKt@747f.download$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<String> listLIZ = C0NLV.LIZ(this.LLILLL);
            if (listLIZ == null) {
                C592100NKe c592100NKe = new C592100NKe(false, C13BV.INSTANCE, null);
                C1C7U.LIZIZ("TabIconExtsKt@747f.download$4");
                return c592100NKe;
            }
            C0NKZ c0nkz = this.LLILZ;
            boolean z = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator<String> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C0NKY(it2.next(), c0nkz, z, null), 2));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TabIconExtsKt@747f.download$4");
                return objLJFF;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (!((Boolean) ((Pair) obj2).getSecond()).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Pair) it3.next()).getFirst());
        }
        C592100NKe c592100NKe2 = new C592100NKe(arrayList3.isEmpty(), arrayList3, null);
        C1C7U.LIZIZ("TabIconExtsKt@747f.download$4");
        return c592100NKe2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C592100NKe> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
