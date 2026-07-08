package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.actionsv2.GoLiveAction$onClick$1", f = "GoLiveAction.kt", l = {71}, m = "invokeSuspend")
public final class C1598306Np extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1606906Qx LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C19EG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598306Np(C1606906Qx c1606906Qx, int i, C19EG c19eg, InterfaceC1364105Vn<? super C1598306Np> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1606906Qx;
        this.LLILLL = i;
        this.LLILZ = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1598306Np(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLIZIZ;
        boolean z;
        C1C7U.LIZ("GoLiveAction@299c.onClick$1");
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
            if (this.LLILLJJLI.LIZJ) {
                C1598206No.LJFF();
                C1598206No.LJ();
            } else {
                Keva kevaLIZJ = C1598206No.LIZJ();
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("action_bar_live_button_show_times");
                sbLIZ.append(curUserId);
                kevaLIZJ.storeInt(C2188811AlT.LIZIZ(sbLIZ), 1);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("action_bar_live_button_last_show_time");
                sbLIZ2.append(curUserId);
                kevaLIZJ.storeLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis());
                C1598206No.LJ();
                C1598206No.LJFF();
                C1598206No.LJI(false);
            }
            C1598206No c1598206No = C1598206No.LIZ;
            int iLIZLLL = C1598206No.LIZLLL(c1598206No) + 1;
            IMLiveService.LIZ.getClass();
            IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
            if (iMLiveServiceLIZ != null) {
                zLIZIZ = iMLiveServiceLIZ.LIZIZ();
            } else {
                zLIZIZ = false;
            }
            if (C1598206No.LIZLLL(c1598206No) >= 3 && !zLIZIZ) {
                z = false;
            } else {
                z = true;
            }
            C2238608ps c2238608ps = C2108208Ns.LIZ;
            C1598506Nr c1598506Nr = new C1598506Nr(z, this.LLILLL, this.LLILLJJLI, this.LLILZ, iLIZLLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c1598506Nr) == objLJFF) {
                C1C7U.LIZIZ("GoLiveAction@299c.onClick$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoLiveAction@299c.onClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
