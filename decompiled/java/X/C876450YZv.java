package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushLocalCompensationProcessor$observeMessageRequest$1", f = "IMInnerPushLocalCompensationProcessor.kt", l = {228}, m = "invokeSuspend")
public final class C876450YZv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C876390YZp LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876450YZv(long j, C876390YZp c876390YZp, InterfaceC1364105Vn<? super C876450YZv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c876390YZp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C876450YZv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0YG2, X.0YZw] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInnerPushLocalCompensationProcessor@8d0b.observeMessageRequest$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.observeMessageRequest$1");
                return objLJFF;
            }
        }
        this.LLILLL.getClass();
        if ((C1906580ziK.LIZ || !C1906580ziK.LJI()) && !this.LLILLL.LIZ.LIZJ().LJI && C0C64.LJIILLIIL().LJIIIZ(31744, "dm_msg_req_polymeric_in_app_push_enable", true, false) && !C0C64.LJIILLIIL().LJIIIZ(31744, "im_enable_message_request_ci_push", true, false)) {
            C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
            if (c19328310jZ.LIZLLL("in_app_im_msg_req_push") != 0 && c19328310jZ.LIZLLL("in_app_im_push") != 0) {
                List<C0Y9G> listLJIIJ = C876470YZx.LIZ().LJIIJ(EnumC871430YGn.STRANGER_NOT_RISKY);
                if (!listLJIIJ.isEmpty()) {
                    C876390YZp c876390YZp = this.LLILLL;
                    C23250099c.LIZLLL(c876390YZp.LJIIIIZZ, null, null, new C0YZH(c876390YZp, listLJIIJ, null), 3);
                } else {
                    final C876390YZp c876390YZp2 = this.LLILLL;
                    ?? r1 = new C0YG2() { // from class: X.0YZw
                        @Override // X.C0YG2
                        public final void I02(List<String> list) {
                        }

                        @Override // X.C0YG2
                        public final void xf0(C876610YaB c876610YaB) {
                            List<C0Y9G> listLJIIJ2 = C876470YZx.LIZ().LJIIJ(EnumC871430YGn.STRANGER_NOT_RISKY);
                            if (!listLJIIJ2.isEmpty()) {
                                C876390YZp c876390YZp3 = c876390YZp2;
                                C23250099c.LIZLLL(c876390YZp3.LJIIIIZZ, null, null, new C0YZH(c876390YZp3, listLJIIJ2, null), 3);
                                C876470YZx.LIZ().LJIIL(this);
                            }
                        }
                    };
                    c876390YZp2.LJII = r1;
                    C876470YZx.LIZ().LJIIIZ(r1);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.observeMessageRequest$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMInnerPushLocalCompensationProcessor@8d0b.observeMessageRequest$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
