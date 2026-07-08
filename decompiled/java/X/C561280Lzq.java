package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$loadRestAll$2$1", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561280Lzq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxFragment LL;
    public final /* synthetic */ EnumC562200M3e LLILLJJLI;
    public final /* synthetic */ List<C561950M2f> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C561280Lzq(DraftBoxFragment draftBoxFragment, EnumC562200M3e enumC562200M3e, List<? extends C561950M2f> list, InterfaceC1364105Vn<? super C561280Lzq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxFragment;
        this.LLILLJJLI = enumC562200M3e;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561280Lzq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.loadRestAll$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftBoxFragment", "load more end");
        this.LL.ZR().LJ(this.LLILLJJLI);
        this.LL.ZR().LIZ(this.LLILLL);
        this.LL.dS().vQ2().Dw(new ArrayList(this.LLILLL));
        DraftBoxFragment draftBoxFragment = this.LL;
        draftBoxFragment.LLLLIILLL = draftBoxFragment.cS().LJI;
        this.LL.VR().LLILZLL = false;
        this.LL.VR().LLLIIIIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.loadRestAll$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
