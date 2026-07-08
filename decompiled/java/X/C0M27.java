package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M27, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.components.DraftBoxOrganizerComponent$IntroContent$1$1", f = "DraftBoxOrganizerComponent.kt", l = {}, m = "invokeSuspend")
public final class C0M27 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0M22 LL;
    public final /* synthetic */ C0M29 LLILLJJLI;
    public final /* synthetic */ C0M26 LLILLL;
    public final /* synthetic */ C05JA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M27(C0M22 c0m22, C0M29 c0m29, C0M26 c0m26, C05JA c05ja, InterfaceC1364105Vn<? super C0M27> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m22;
        this.LLILLJJLI = c0m29;
        this.LLILLL = c0m26;
        this.LLILZ = c05ja;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M27(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("DraftBoxOrganizerComponent@6d25.IntroContent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C561700M1g c561700M1g = C561700M1g.LIZ;
        C0M22 c0m22 = this.LL;
        C0M29 c0m29 = this.LLILLJJLI;
        int i = c0m29.LIZIZ;
        long j = c0m29.LIZLLL;
        int i2 = c0m29.LIZ;
        long j2 = c0m29.LIZJ;
        String str2 = this.LLILLL.LJFF;
        c561700M1g.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c0m22 instanceof C0M20) {
            str = "draft_cnt";
        } else if (c0m22 instanceof C561890M1z) {
            str = "draft_size";
        } else {
            throw new C1954807lC();
        }
        c2344009Gk.LJIIIIZZ("alert_type", str);
        c2344009Gk.LJIIIIZZ("component_type", "popup");
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LIZJ(i, "alert_draft_cnt");
        c2344009Gk.LIZLLL(j, "alert_draft_size");
        c2344009Gk.LIZJ(i2, "draft_cnt");
        c2344009Gk.LIZLLL(j2, "draft_size");
        C20684815ws.LJIILLIIL("ttcrt_draft_guide_show", c2344009Gk.LIZ);
        C05JA c05ja = this.LLILZ;
        c05ja.getClass();
        C05J9.LIZ().storeBoolean(c05ja.LIZLLL, true);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markShown [");
        sbLIZ.append(c05ja.LIZ);
        sbLIZ.append("]: pendingShown=true");
        C201955140j.LIZLLL(c0may, "DraftOrganizerGuard", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxOrganizerComponent@6d25.IntroContent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
