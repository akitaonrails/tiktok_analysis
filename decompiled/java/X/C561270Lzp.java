package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initLoadMore$2$4", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561270Lzp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ DraftBoxFragment LLILZ;
    public final /* synthetic */ EnumC562200M3e LLILZIL;
    public final /* synthetic */ List<C561950M2f> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C561270Lzp(int i, int i2, long j, DraftBoxFragment draftBoxFragment, EnumC562200M3e enumC562200M3e, List<? extends C561950M2f> list, InterfaceC1364105Vn<? super C561270Lzp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = j;
        this.LLILZ = draftBoxFragment;
        this.LLILZIL = enumC562200M3e;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561270Lzp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.initLoadMore$2$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load more success, pageSize = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(",totalPageSize = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(",  cost ");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLL);
        C201955140j.LIZLLL(c0may, "DraftBoxFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ.ZR().LJ(this.LLILZIL);
        this.LLILZ.ZR().LIZ(this.LLILZLL);
        this.LLILZ.dS().vQ2().Dw(new ArrayList(this.LLILZLL));
        DraftBoxFragment draftBoxFragment = this.LLILZ;
        draftBoxFragment.LLLLIILLL++;
        draftBoxFragment.dS().LLJILJIL.setValue(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.initLoadMore$2$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
