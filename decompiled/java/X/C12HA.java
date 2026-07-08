package X;

import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12HA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$loadBundleBeauty$2", f = "BeautySource.kt", l = {231}, m = "invokeSuspend")
public final class C12HA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C12HN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12HA(C12HN c12hn, InterfaceC1364105Vn<? super C12HA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12hn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12HA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BeautySource@786f.loadBundleBeauty$2");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ(C817503Hh.LL, C0PEM.LIZJ, null, new C12H9(this.LLILLJJLI, null), 2);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BeautySource@786f.loadBundleBeauty$2");
                return objLJFF;
            }
        }
        List<BeautyCategory> list = (List) obj;
        if (list != null) {
            C12HN c12hn = this.LLILLJJLI;
            C19570511hX.LIZIZ("assign allData from getPanelDataFromLocal");
            c12hn.LJJ(list);
            c12hn.LJJIII = false;
        } else {
            this.LLILLJJLI.LJIJJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BeautySource@786f.loadBundleBeauty$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
