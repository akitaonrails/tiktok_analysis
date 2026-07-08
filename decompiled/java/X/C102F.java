package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.tiktok.pns.utils.network.api.UserSettingsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.102F, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.audiencecontrol.AudienceControlManager$enterAudienceControlPage$1", f = "AudienceControlManager.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C102F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DialogC1389620mGW LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C102F(DialogC1389620mGW dialogC1389620mGW, Context context, InterfaceC1364105Vn<? super C102F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = dialogC1389620mGW;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C102F c102f = new C102F(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c102f.LLILLJJLI = obj;
        return c102f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("AudienceControlManager@6b54.enterAudienceControlPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C15560067i c15560067i = C15560067i.LIZIZ;
                C09U0 c09u0 = c15560067i.LIZ;
                if (c09u0 == null) {
                    synchronized (c15560067i) {
                        c09u0 = c15560067i.LIZ;
                        if (c09u0 == null) {
                            c09u0 = (C09U0) C1807670x8n.p();
                            c15560067i.LIZ = c09u0;
                        }
                    }
                }
                AbstractC2252651DEx abstractC2252651DEx = c09u0.LIZ;
                C102G c102g = new C102G(null);
                this.LL = 1;
                obj = C23250099c.LJI(this, abstractC2252651DEx, c102g);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AudienceControlManager@6b54.enterAudienceControlPage$1");
                    return objLJFF;
                }
            }
            c098200Yq = (PushSettings) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        DialogC1389620mGW dialogC1389620mGW = this.LLILLL;
        Context context = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C102H c102h = UserSettingsApi.LIZ;
            String str = ((PushSettings) c098200Yq).settingsVersion;
            c102h.getClass();
            C813020Vuu c813020VuuLJIIL = C813020Vuu.LJIIL();
            C844470XAv.LIZ.getClass();
            c813020VuuLJIIL.LJIIJJI(C844470XAv.LIZ(), "last_user_setting_version", str);
            C0FNV.LIZ(dialogC1389620mGW);
            C20684815ws.onEventV3("click_aac_settings");
            SmartRouter.buildRoute(context, "aweme://setting/audience_control").open();
        }
        DialogC1389620mGW dialogC1389620mGW2 = this.LLILLL;
        Context context2 = this.LLILZ;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C0FNV.LIZ(dialogC1389620mGW2);
            C20684815ws.onEventV3("click_aac_settings");
            SmartRouter.buildRoute(context2, "aweme://setting/audience_control").open();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AudienceControlManager@6b54.enterAudienceControlPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
