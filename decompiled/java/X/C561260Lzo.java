package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$getAllDraftSize$2", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C561260Lzo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0M03 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561260Lzo(C0M03 c0m03, InterfaceC1364105Vn<? super C561260Lzo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561260Lzo(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftLoader@8d42.getAllDraftSize$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0M03 c0m03 = this.LL;
        c0m03.getClass();
        int iLIZLLL = C0M4A.LIZLLL(new C0M4E(null, null, null, false, EnumC562220M3g.NORMAL, null, null, null, false, null, 1007));
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" getAllDraftSize: ");
        sbLIZ.append(iLIZLLL);
        C201955140j.LJIIIIZZ(c0may, "DraftLoader", C2188811AlT.LIZIZ(sbLIZ));
        c0m03.LJIIIZ = iLIZLLL;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftLoader@8d42.getAllDraftSize$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
