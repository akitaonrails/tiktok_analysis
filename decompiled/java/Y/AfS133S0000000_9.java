package Y;

import X.AbstractC1387200mCc;
import X.AbstractC1616230sA1;
import X.C08JS;
import X.C09JN;
import X.C0N1E;
import X.C1030680cva;
import X.C1483410ohn;
import X.C19EG;
import X.C1C7U;
import X.C2487409ou;
import X.C446900Hfk;
import X.C584470Mw9;
import X.C596490NaR;
import X.C606810Nr5;
import X.C740740T3w;
import X.C823050WQl;
import X.EnumC584340Mvw;
import X.InterfaceC1007910cKr;
import X.InterfaceC1008930cMV;
import X.InterfaceC1603190roz;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.landscape.PaidContentVideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public class AfS133S0000000_9 implements C09JN {
    public final int $t;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public AfS133S0000000_9(int i) {
        this.$t = i;
    }

    public AfS133S0000000_9(PaidContentVideoViewCell paidContentVideoViewCell, int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS133S0000000_9 afS133S0000000_9, Object obj) {
        C1C7U.LIZ("PlayerKitInitTask@e49.run$1L");
        C823050WQl.LIZJ().execute(new ARunnableS113S0100000_13((Boolean) obj, 107));
        C1C7U.LIZIZ("PlayerKitInitTask@e49.run$1L");
    }

    public static final void accept$1(AfS133S0000000_9 afS133S0000000_9, Object obj) {
        C1C7U.LIZ("NewUserVodInitTask@8a27.run$1L");
        C823050WQl.LIZJ().execute(new ARunnableS113S0100000_13((Boolean) obj, 109));
        C1C7U.LIZIZ("NewUserVodInitTask@8a27.run$1L");
    }

    public static final void accept$2(AfS133S0000000_9 afS133S0000000_9, Object obj) {
        C1C7U.LIZ("PaidContentVideoViewCell@e836.reportVideoProgress$disposable$2");
        ((Throwable) obj).getMessage();
        C1C7U.LIZIZ("PaidContentVideoViewCell@e836.reportVideoProgress$disposable$2");
    }

    public static final void accept$3(AfS133S0000000_9 afS133S0000000_9, Object obj) {
        C1C7U.LIZ("VideoRequestStatus@8cd2.start$1L");
        if ((((AbstractC1387200mCc) obj).LIZ instanceof InterfaceC1603190roz) && C0N1E.LIZ) {
            C0N1E.LIZIZ("1", null);
        }
        C1C7U.LIZIZ("VideoRequestStatus@8cd2.start$1L");
    }

    public static final void accept$4(AfS133S0000000_9 afS133S0000000_9, Object obj) {
        C19EG c19eg;
        Aweme awemeLJFF;
        int iIntValue;
        long jLJJLIL;
        long jLongValue;
        InterfaceC1007910cKr interfaceC1007910cKr;
        Fragment fragmentKi;
        View view;
        AbstractC1616230sA1 abstractC1616230sA1;
        int count;
        C1C7U.LIZ("AdAppBackgroundOrExitReport@4b07.backGroundListener$1");
        C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
        if (c606810Nr5 != null) {
            if (c606810Nr5.LIZIZ) {
                C596490NaR c596490NaR = C596490NaR.LIZ;
                AbstractC1387200mCc abstractC1387200mCc = c606810Nr5.LIZ;
                Activity activityLIZIZ = null;
                if (abstractC1387200mCc != null) {
                    activityLIZIZ = abstractC1387200mCc.LIZIZ();
                }
                c596490NaR.getClass();
                if ((activityLIZIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZIZ) != null) {
                    C446900Hfk c446900Hfk = Hox.LLJILJIL;
                    if (c446900Hfk.LIZ(c19eg).KQ2("For You") && (awemeLJFF = C740740T3w.LJFF(c19eg)) != null && AwemeExtKt.isAdTraffic(awemeLJFF)) {
                        int iIntValue2 = 0;
                        try {
                            fragmentKi = c446900Hfk.LIZ(c19eg).Ki("For You");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        if (fragmentKi != null && (view = fragmentKi.getView()) != null && (abstractC1616230sA1 = (AbstractC1616230sA1) view.findViewById(R.id.viewpager)) != null) {
                            int currentItem = abstractC1616230sA1.getCurrentItem();
                            PagerAdapter adapter = abstractC1616230sA1.getAdapter();
                            if (adapter != null) {
                                count = adapter.getCount();
                            } else {
                                count = 0;
                            }
                            Pair pair = new Pair(Integer.valueOf(currentItem), Integer.valueOf(count));
                            iIntValue = ((Number) pair.getFirst()).intValue();
                            iIntValue2 = ((Number) pair.getSecond()).intValue();
                        } else {
                            iIntValue = 0;
                        }
                        IFeedService iFeedService = (IFeedService) PluggableExtentionKt.pluggableSpi$default(IFeedService.class, false, false, false, 14, null);
                        long jLongValue2 = 0;
                        if (iFeedService == null) {
                            jLongValue = 0;
                        } else {
                            InterfaceC1008930cMV interfaceC1008930cMVLIZJ = iFeedService.LIZJ(c19eg, awemeLJFF, "homepage_hot", true);
                            if ((interfaceC1008930cMVLIZJ instanceof InterfaceC1007910cKr) && (interfaceC1007910cKr = (InterfaceC1007910cKr) interfaceC1008930cMVLIZJ) != null) {
                                jLJJLIL = interfaceC1007910cKr.LJJLIL();
                            } else {
                                jLJJLIL = 0;
                            }
                            Pair pair2 = new Pair(Long.valueOf(jLJJLIL), Long.valueOf(C1483410ohn.LJLJJI().getCurrentPosition()));
                            jLongValue = ((Number) pair2.getFirst()).longValue();
                            jLongValue2 = ((Number) pair2.getSecond()).longValue();
                        }
                        try {
                            String strLJIILL = C08JS.LIZIZ().LJIILL(awemeLJFF.getAwemeRawAd());
                            Keva kevaLIZ = C596490NaR.LIZ();
                            kevaLIZ.storeString("cached_aweme_raw_ad", strLJIILL);
                            kevaLIZ.storeInt("video_nums", iIntValue2);
                            kevaLIZ.storeInt("current_position", iIntValue);
                            kevaLIZ.storeLong("play_order", jLongValue);
                            kevaLIZ.storeLong("play_duration", jLongValue2);
                            kevaLIZ.storeInt("launch_type", C1030680cva.LJ ? 1 : 0);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                }
            } else {
                C596490NaR.LIZ.getClass();
                C596490NaR.LIZIZ();
            }
        }
        C1C7U.LIZIZ("AdAppBackgroundOrExitReport@4b07.backGroundListener$1");
    }

    public static final void accept$5(AfS133S0000000_9 afS133S0000000_9, Object obj) {
        C1C7U.LIZ("FpsReportHelper@46a.listenAppState$1L");
        if (((Boolean) obj).booleanValue()) {
            if (C584470Mw9.LJII("system_launch_1_minute", null)) {
                C2487409ou.LIZ(C584470Mw9.LJIIL);
            }
            if (C584470Mw9.LJII("system_launch_1_minute_feed", null)) {
                C2487409ou.LIZ(C584470Mw9.LJIILIIL);
            }
            if (C584470Mw9.LJII("system_launch_1_to_2_minute", null)) {
                C2487409ou.LIZ(C584470Mw9.LJIILJJIL);
            }
            if (C584470Mw9.LJII("system_launch_1_to_2_minute_feed", null)) {
                C2487409ou.LIZ(C584470Mw9.LJIILL);
            }
            C584470Mw9.LJII("three_vv", null);
            ((HashMap) C584470Mw9.LIZ).put("three_vv", EnumC584340Mvw.NOT_MONITORED);
        }
        C1C7U.LIZIZ("FpsReportHelper@46a.listenAppState$1L");
    }
}
