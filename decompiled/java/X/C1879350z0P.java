package X;

import Y.AfS53S1100000_28;
import android.app.Activity;
import android.content.Context;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.model.FeedLynxOverlayConfig;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourServerDrivenConfig;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z0P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879350z0P implements InterfaceC1745040vVm {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(664));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(669));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(668));
    public C11JF LIZLLL;

    public final boolean LIZIZ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Activity activityLIZIZ = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZIZ() : null;
        if (activityLIZIZ instanceof SparkActivity) {
            List<String> list = (List) this.LIZJ.getValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    String strLLLLLZL = ((SparkActivity) activityLIZIZ).LLLLLZL();
                    if (strLLLLLZL != null && a0.LJJIIZI(strLLLLLZL, str, false)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC1745040vVm
    public final void LIZ(Context context, JSONObject jSONObject) {
        Activity activityLIZIZ;
        boolean z;
        String str;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        Integer numLIZ = C1907607da.LIZ("open_state", jSONObject);
        Integer numLIZ2 = C1907607da.LIZ("sleep_hours_type", jSONObject);
        C1865410ydv.LIZ("SleepHour.Meditation", new AwS429S0200000_28(numLIZ2, numLIZ, 133));
        EnumC2009607u2 enumC2009607u2 = EnumC2009607u2.SLEEP_HOUR_MEDITATION_RETURN_FOR_NOW;
        int i = enumC2009607u2.getI();
        if (numLIZ2 == null || numLIZ2.intValue() != i) {
            int i2 = EnumC2009607u2.SLEEP_HOUR_MEDITATION_RETURN_IN_15_MINS.getI();
            if (numLIZ2 == null || numLIZ2.intValue() != i2) {
                int i3 = EnumC2009607u2.SLEEP_HOUR_PUSH.getI();
                if (numLIZ2 != null && numLIZ2.intValue() == i3) {
                    String strLIZIZ = C1907607da.LIZIZ("schema", jSONObject);
                    if (strLIZIZ == null) {
                        C1865410ydv.LIZ("SleepHour.Meditation", AFwS217S0000000_28.get$arr$(667));
                        return;
                    } else {
                        if (!((Boolean) C257860A8q.LIZ.getValue()).booleanValue()) {
                            if (LIZIZ()) {
                                LIZJ(activityLIZIZ, strLIZIZ);
                                return;
                            } else {
                                this.LIZLLL = (C11JF) C1906580ziK.LIZJ().LJIIJ().LJL(C11S5.LIZIZ).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS53S1100000_28(this, strLIZIZ, 10));
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!C294510BgX.LIZ()) {
            C1865410ydv.LIZ("SleepHour.Meditation.ClientDriven", AFwS217S0000000_28.get$arr$(665));
            return;
        }
        int i4 = EnumC492210JRz.CLOSE.getI();
        if (numLIZ != null && numLIZ.intValue() == i4) {
            C1865410ydv.LIZ("SleepHour.Meditation.ServerDriven.Native", AFwS217S0000000_28.get$arr$(666));
            IProtectionService iProtectionService = (IProtectionService) this.LIZIZ.getValue();
            if (iProtectionService != null) {
                iProtectionService.LJIJ("server_close");
                return;
            }
            return;
        }
        if (numLIZ2.intValue() == enumC2009607u2.getI()) {
            z = true;
        } else {
            z = false;
        }
        SleepHourServerDrivenConfig sleepHourServerDrivenConfig = new SleepHourServerDrivenConfig(z, C1907607da.LIZIZ("start_time", jSONObject), C1907607da.LIZIZ("end_time", jSONObject));
        if (C288680BTe.LIZ()) {
            C1865410ydv.LIZ("SleepHour.Meditation.ServerDriven.Lynx", new AwS572S0100000_28(sleepHourServerDrivenConfig, 910));
            C0XI4 c0xi4 = new C0XI4("aweme://roma_redirect/?spark_page=sleep_hour_meditation");
            if (sleepHourServerDrivenConfig.isFirstShown()) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            c0xi4.LJ("page_type", str);
            String str2 = sleepHourServerDrivenConfig.startTime;
            if (str2 != null) {
                c0xi4.LJ("start_time", str2);
            }
            String str3 = sleepHourServerDrivenConfig.endTime;
            if (str3 != null) {
                c0xi4.LJ("end_time", str3);
            }
            String strLJFF = c0xi4.LJFF();
            IProtectionService iProtectionService2 = (IProtectionService) this.LIZIZ.getValue();
            if (iProtectionService2 != null) {
                iProtectionService2.LJIILL(new FeedLynxOverlayConfig(strLJFF));
                return;
            }
            return;
        }
        C1865410ydv.LIZ("SleepHour.Meditation.ServerDriven.Native", new AwS572S0100000_28(sleepHourServerDrivenConfig, 911));
        IProtectionService iProtectionService3 = (IProtectionService) this.LIZIZ.getValue();
        if (iProtectionService3 != null) {
            iProtectionService3.LJJJJL(sleepHourServerDrivenConfig);
        }
    }

    public final void LIZJ(Context context, String str) {
        if (context == null) {
            return;
        }
        if (!((Boolean) C257860A8q.LIZ.getValue()).booleanValue()) {
            SmartRouter.buildRoute(context, str).open();
            PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) this.LIZ.getValue();
            if (pnSDigitalWellbeingSDKService != null) {
                pnSDigitalWellbeingSDKService.LJIIJ(EnumC1879480z0c.SLEEP_HOUR, AnonymousClass0566.STATUS_ID_NOT_SHOW_REMINDER, null);
            }
        }
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
    }
}
