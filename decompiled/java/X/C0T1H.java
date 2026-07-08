package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T1H, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T1H {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static Runnable LJ;
    public static final C0T1H LIZ = new C0T1H();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0T1J());
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(523));
    public static final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());

    public static InterfaceC739160Sz4 LIZ() {
        return (InterfaceC739160Sz4) LJFF.getValue();
    }

    public static void LIZIZ(String str, float f, long j, Aweme aweme, C0T1G c0t1g) {
        C0TA0 currentPluginData;
        IPluginService.PluginDataWrapper value;
        IPluginService.LowActiveUserSurveyData lowActiveUserSurveyData;
        Boolean bool;
        IPluginService iPluginService;
        C0TA0 currentPluginData2;
        IPluginService.PluginDataWrapper value2;
        IPluginService.LowActiveUserSurveyData lowActiveUserSurveyData2;
        Integer num;
        if (str != null) {
            C1393430mMf.LIZ.getClass();
            if (Intrinsics.LJFF(str, C1393430mMf.LIZJ) && aweme != null && aweme.getAwemeType() == 0) {
                if (LIZLLL) {
                    LIZLLL = false;
                    Runnable runnable = LJ;
                    if (runnable != null) {
                        C786410Ut5.LJLIIL(3000L, LJI, runnable);
                    }
                }
                IPluginService iPluginService2 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                if (iPluginService2 != null && (currentPluginData = iPluginService2.getCurrentPluginData(EnumC19241510Pl.LOW_ACTIVE_SURVEY)) != null && (value = currentPluginData.getValue()) != null && (lowActiveUserSurveyData = value.lowActiveUserSurveyData) != null && (bool = lowActiveUserSurveyData.showSwipeUpGuide) != null && bool.booleanValue() && (iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null)) != null && (currentPluginData2 = iPluginService.getCurrentPluginData(EnumC19241510Pl.LOW_ACTIVE_SURVEY)) != null && (value2 = currentPluginData2.getValue()) != null && (lowActiveUserSurveyData2 = value2.lowActiveUserSurveyData) != null && (num = lowActiveUserSurveyData2.swipeUpGuideType) != null) {
                    int iIntValue = num.intValue();
                    int i = 2;
                    if (iIntValue != 1 && iIntValue != 2) {
                        if (iIntValue != 3 && iIntValue != 4) {
                            return;
                        } else {
                            i = 1;
                        }
                    }
                    if (f < 90.0f && ((iIntValue != 1 && iIntValue != 3) || j < Mp4ScreenVideoLoadTimeout.CONTROL)) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C01GW c01gw = LIZIZ;
                    if (jCurrentTimeMillis - ((Keva) c01gw.getValue()).getLong("last_show_low_active_swipeup_time", 0L) >= 172800000 && c0t1g.LJI(i, str)) {
                        ((Keva) c01gw.getValue()).storeLong("last_show_low_active_swipeup_time", System.currentTimeMillis());
                    }
                }
            }
        }
    }
}
