package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.vh.DMPushBannerVH$updateDMPush$1", f = "DMPushBannerVH.kt", l = {139}, m = "invokeSuspend")
public final class C1642606bw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1890460zIK LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642606bw(String str, boolean z, boolean z2, C1890460zIK c1890460zIK, InterfaceC1364105Vn<? super C1642606bw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = c1890460zIK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1642606bw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMPushBannerVH@faf8.updateDMPush$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C19296410eQ.LIZIZ.batchSetPushSettingItems(this.LLILLJJLI, 1, this.LLILLL, null, null);
                C19328310jZ.LIZIZ.LIZIZ(((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJII());
                if (this.LLILZ) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
                    c2344009Gk.LJIIIIZZ("from_status", "off");
                    c2344009Gk.LJIIIIZZ("label", "im_push");
                    c2344009Gk.LJIIIIZZ("to_status", "on");
                    C20684815ws.LJIILLIIL("notification_switch", c2344009Gk.LIZ);
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C1642706bx c1642706bx = new C1642706bx(this.LLILZIL, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c1642706bx) == objLJFF) {
                        C1C7U.LIZIZ("DMPushBannerVH@faf8.updateDMPush$1");
                        return objLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMPushBannerVH@faf8.updateDMPush$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
