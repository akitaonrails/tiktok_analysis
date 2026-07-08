package X;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.WindowPageConfig;
import com.bytedance.android.livesdkapi.host.IHostEcommerce;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ihh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ViewOnTouchListenerC473590Ihh extends AbstractC473620Ihk implements Application.ActivityLifecycleCallbacks, View.OnTouchListener {
    public static WindowPageConfig LLILLL;
    public static boolean LLILZ;
    public static boolean LLILZIL;
    public static volatile boolean LLILZLL;
    public static volatile Boolean LLIZ;
    public static volatile C473600Ihi LLIZLLLIL;
    public static ViewGroup LLJ;
    public static int LLJI;
    public static ViewGroup.LayoutParams LLJIJIL;
    public static DialogFragment LLJILJIL;
    public static ViewGroup LLJILJILJ;
    public static View LLJILLL;
    public static boolean LLJJ;
    public static long LLJJI;
    public static long LLJJIII;
    public static C469090IaR LLJJIJIIJIL;
    public static WeakReference<LivePlayFragment> LLJJL;
    public static Map<String, String> LLJJLIIIJLLLLLLLZ;
    public static float LLJLIL;
    public static float LLJLL;
    public static float LLJLLIL;
    public static int LLJLLL;
    public static int LLJZ;
    public static long LLJZIJLIL;
    public static final ViewOnTouchListenerC473590Ihh LL = new ViewOnTouchListenerC473590Ihh();
    public static EnumC473610Ihj LLILLJJLI = EnumC473610Ihj.STATE_INIT;
    public static String LLJJIJI = "";
    public static final Map<String, String> LLJJIJIL = new LinkedHashMap();
    public static final C01GW LLJJJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(32));
    public static final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(34));
    public static final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(33));
    public static final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(31));
    public static String LLJJJJLIIL = "";
    public static Boolean LLJL = Boolean.FALSE;
    public static final int LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));

    @Override // X.AbstractC473620Ihk
    public final void LIZLLL() {
        boolean z;
        LLILZLL = true;
        ViewGroup viewGroup = LLJILJILJ;
        if (viewGroup != null) {
            LLJJI += SystemClock.elapsedRealtime() - LLJJIII;
            LLJJIII = 0L;
            Map<String, String> map = LLJJLIIIJLLLLLLLZ;
            if (Intrinsics.LJFF(map != null ? map.get("from_scene") : null, "sea_pdp")) {
                z = LLILZ;
                ViewOnTouchListenerC473590Ihh viewOnTouchListenerC473590Ihh = LL;
                Pair[] pairArr = {new Pair("duration", String.valueOf(LLJJI)), new Pair("close_type", "next")};
                viewOnTouchListenerC473590Ihh.getClass();
                LJIJI("livesdk_tiktokec_mini_window_live_duration", pairArr);
                LJIJI("livesdk_tiktokec_mini_window_close", new Pair("close_type", "next"), new Pair("stay_time", String.valueOf(LLJJI)));
            } else {
                z = true;
            }
            C500260Jjc.LJIILIIL(viewGroup);
            LL.getClass();
            LivePlayFragment livePlayFragmentLJIIIZ = LJIIIZ();
            if (livePlayFragmentLJIIIZ != null) {
                livePlayFragmentLJIIIZ.cD("internal window video play", z);
            }
        }
        if (Intrinsics.LJFF(LLJL, Boolean.TRUE)) {
            if (LLILLJJLI != EnumC473610Ihj.STATE_DESTROY) {
                LLILLJJLI = EnumC473610Ihj.STATE_CLOSE;
            }
            LJIIZILJ();
            float f = LLJLIL;
            if (f != 0.0f) {
                View view = LLJILLL;
                if (view != null) {
                    C786410Ut5.ed(view, f);
                }
                LLJLIL = 0.0f;
            }
        }
        LLJJLIIIJLLLLLLLZ = null;
        LLJL = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    public static boolean LJIIIIZZ() {
        return ((Boolean) LLJJJ.getValue()).booleanValue();
    }

    public static LivePlayFragment LJIIIZ() {
        WeakReference<LivePlayFragment> weakReference = LLJJL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static boolean LJIILJJIL() {
        return ((IHostEcommerce) C1161920gLG.LIZJ(IHostEcommerce.class)).lf() && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1();
    }

    public static final void LJIILLIIL() {
        LL.getClass();
        if (LJIIIIZZ()) {
            ViewGroup viewGroup = LLJILJILJ;
            if (viewGroup != null) {
                if (LLJJIII > 0) {
                    LLJJI += SystemClock.elapsedRealtime() - LLJJIII;
                }
                long j = LLJJI;
                if (j > 0) {
                    LJIJI("livesdk_tiktokec_mini_window_live_duration", new Pair("duration", String.valueOf(j)), new Pair("close_type", "return"));
                    LJIJI("livesdk_tiktokec_mini_window_close", new Pair("close_type", "return"), new Pair("stay_time", String.valueOf(LLJJI)));
                }
                C786410Ut5.LJJJLZIJ(viewGroup, (ViewGroup) viewGroup.getParent());
                float f = LLJLIL;
                if (f != 0.0f) {
                    View view = LLJILLL;
                    if (view != null) {
                        C786410Ut5.ed(view, f);
                    }
                    LLJLIL = 0.0f;
                    C20441214yg.LIZIZ("InternalWindow", "restore video translationY");
                }
                View view2 = LLJILLL;
                ViewGroup viewGroup2 = (ViewGroup) (view2 != null ? view2.getParent() : null);
                if (viewGroup2 != null) {
                    C786410Ut5.LJJJLZIJ(LLJILLL, viewGroup2);
                }
                ViewGroup viewGroup3 = LLJ;
                if (viewGroup3 != null) {
                    viewGroup3.addView(LLJILLL, LLJI, LLJIJIL);
                }
                LLJ = null;
                LLJIJIL = null;
                LLJILJILJ = null;
                LLJILLL = null;
            }
            LLJJI = 0L;
            LLJJIII = 0L;
            LLJJ = false;
            if (LLILZ) {
                LivePlayFragment livePlayFragmentLJIIIZ = LJIIIZ();
                if (livePlayFragmentLJIIIZ != null) {
                    livePlayFragmentLJIIIZ.cD("internal window reset", false);
                }
                LLILZ = false;
            }
            if (LLJILJIL != null) {
                LLJILJIL = null;
            }
            LLJJLIIIJLLLLLLLZ = null;
            LLJL = null;
        }
    }

    public static void LJIIZILJ() {
        ViewGroup viewGroup = LLJILJILJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(viewGroup, (ViewGroup) viewGroup.getParent());
            View view = LLJILLL;
            ViewGroup viewGroup2 = (ViewGroup) (view != null ? view.getParent() : null);
            if (viewGroup2 != null) {
                C786410Ut5.LJJJLZIJ(LLJILLL, viewGroup2);
            }
            ViewGroup viewGroup3 = LLJ;
            if (viewGroup3 != null) {
                viewGroup3.addView(LLJILLL, LLJI, LLJIJIL);
            }
            LLJILJILJ = null;
        }
    }

    public static void LJJI() {
        TuxIconView tuxIconView;
        ViewGroup viewGroup = LLJILJILJ;
        if (viewGroup == null || (tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.oxi)) == null) {
            return;
        }
        if (LLILZIL && Intrinsics.LJFF(LLJL, Boolean.TRUE)) {
            LLILZ = true;
            LL.getClass();
            LivePlayFragment livePlayFragmentLJIIIZ = LJIIIZ();
            if (livePlayFragmentLJIIIZ != null) {
                livePlayFragmentLJIIIZ.cD("user maual mute && internal window show again", LLILZ);
            }
        }
        tuxIconView.setSelected(LLILZ);
        tuxIconView.setIconRes(LLILZ ? R.raw.icon_speaker_x_mark_ltr : R.raw.icon_speaker_2_ltr);
    }

    public static final void LJI(boolean z) {
        ViewParent parent;
        Object obj;
        LL.getClass();
        if (!LJIIIIZZ()) {
            return;
        }
        ViewGroup viewGroup = LLJILJILJ;
        if (viewGroup != null) {
            if (LLJJIII > 0) {
                LLJJI += SystemClock.elapsedRealtime() - LLJJIII;
            }
            long j = LLJJI;
            if (j > 0) {
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("duration", String.valueOf(j));
                if (!z) {
                    obj = "manual";
                } else {
                    obj = "auto";
                }
                pairArr[1] = new Pair("close_type", obj);
                LJIJI("livesdk_tiktokec_mini_window_live_duration", pairArr);
            }
            if (z) {
                LJIJI("livesdk_tiktokec_mini_window_close", new Pair("close_type", "auto"), new Pair("stay_time", String.valueOf(LLJJI)));
            } else {
                if (!Intrinsics.LJFF(LLIZ, Boolean.TRUE)) {
                    LLILZ = true;
                    LivePlayFragment livePlayFragmentLJIIIZ = LJIIIZ();
                    if (livePlayFragmentLJIIIZ != null) {
                        livePlayFragmentLJIIIZ.cD("internal window user close", true);
                    }
                }
                LJIJI("livesdk_tiktokec_mini_window_close", new Pair("close_type", "manual"), new Pair("stay_time", String.valueOf(LLJJI)));
            }
            C786410Ut5.LJJJLZIJ(viewGroup, (ViewGroup) viewGroup.getParent());
            float f = LLJLIL;
            if (f != 0.0f) {
                View view = LLJILLL;
                if (view != null) {
                    C786410Ut5.ed(view, f);
                }
                LLJLIL = 0.0f;
                C20441214yg.LIZIZ("InternalWindow", "restore video translationY");
            }
            View view2 = LLJILLL;
            if (view2 != null) {
                parent = view2.getParent();
            } else {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null) {
                C786410Ut5.LJJJLZIJ(LLJILLL, viewGroup2);
            }
            ViewGroup viewGroup3 = LLJ;
            if (viewGroup3 != null) {
                viewGroup3.addView(LLJILLL, LLJI, LLJIJIL);
            }
            LLJ = null;
            LLJIJIL = null;
            LLJILJILJ = null;
            LLJILLL = null;
            LLILLJJLI = EnumC473610Ihj.STATE_DESTROY;
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(LJIIL(null)), "small_window_status_change"));
        }
        LLJJI = 0L;
        LLJJIII = 0L;
    }

    public static ViewGroup LJII(DialogFragment dialogFragment) {
        Window window;
        Dialog dialog = dialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            return (ViewGroup) C786410Ut5.qe(window, android.R.id.content);
        }
        return null;
    }

    public static String LJIIJ(Activity activity) {
        String strLJIJI;
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri2;
        String path;
        if (activity instanceof SparkActivity) {
            SparkContext sparkContext = ((SparkActivity) activity).LL;
            if (sparkContext != null && (strLJIJI = sparkContext.LJIJI()) != null && (uri = UriProtector.parse(strLJIJI)) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) != null && (uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null && (path = uri2.getPath()) != null) {
                LL.getClass();
                Map map = (Map) LLJJJIL.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (a0.LJJIIZI(path, (String) entry.getKey(), false)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (String) C13LP.LJJJLIIL(linkedHashMap.values());
            }
            return null;
        }
        String simpleName = activity.getClass().getSimpleName();
        LL.getClass();
        return (String) ((Map) LLJJJIL.getValue()).get(simpleName);
    }

    public static String LJIIJJI(Fragment fragment) {
        if (fragment instanceof TuxSheet) {
            String tag = fragment.getTag();
            if (tag != null) {
                LL.getClass();
                return (String) ((Map) LLJJJIL.getValue()).get(tag);
            }
            return null;
        }
        String simpleName = fragment.getClass().getSimpleName();
        LL.getClass();
        return (String) ((Map) LLJJJIL.getValue()).get(simpleName);
    }

    public static JSONObject LJIIL(String str) {
        boolean z;
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_mute", LLILZ);
            if (LLILLJJLI == EnumC473610Ihj.STATE_DESTROY) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("manual_close", z);
            if (str == null) {
                str = LLJJJJLIIL;
            }
            jSONObject.put("small_window_id", str);
            LL.getClass();
            LivePlayFragment livePlayFragmentLJIIIZ = LJIIIZ();
            if (livePlayFragmentLJIIIZ != null) {
                string = Long.valueOf(livePlayFragmentLJIIIZ.LLILLJJLI).toString();
            } else {
                string = null;
            }
            C189200o6.m2constructorimpl(jSONObject.put("room_id", string));
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObject;
        }
    }

    public static final void LJIILL(LivePlayFragment livePlayFragment) {
        C19EG activity;
        ViewOnTouchListenerC473590Ihh viewOnTouchListenerC473590Ihh = LL;
        viewOnTouchListenerC473590Ihh.getClass();
        if (!LJIIIIZZ() || (activity = livePlayFragment.getActivity()) == null) {
            return;
        }
        try {
            if (LJIIIZ() == null) {
                activity.getApplication().registerActivityLifecycleCallbacks(viewOnTouchListenerC473590Ihh);
                viewOnTouchListenerC473590Ihh.getClass();
                LJIJJ(livePlayFragment);
                LLILLJJLI = EnumC473610Ihj.STATE_INIT;
                LLJJIJIIJIL = null;
                LLILZIL = false;
                return;
            }
            if (!Intrinsics.LJFF(livePlayFragment, LJIIIZ())) {
                Application application = activity.getApplication();
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(viewOnTouchListenerC473590Ihh);
                }
                Application application2 = activity.getApplication();
                if (application2 != null) {
                    application2.registerActivityLifecycleCallbacks(viewOnTouchListenerC473590Ihh);
                }
                viewOnTouchListenerC473590Ihh.getClass();
                LJIJJ(livePlayFragment);
                LLILLJJLI = EnumC473610Ihj.STATE_INIT;
                LLJJIJIIJIL = null;
                LLILZIL = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r4) {
        /*
            r3 = 0
            if (r4 != 0) goto Ld
            java.lang.ref.WeakReference<com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment> r0 = X.ViewOnTouchListenerC473590Ihh.LLJJL
            if (r0 == 0) goto La
            r0.clear()
        La:
            X.ViewOnTouchListenerC473590Ihh.LLJJL = r3
            return
        Ld:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            X.ViewOnTouchListenerC473590Ihh.LLJJL = r0
            java.util.Map<java.lang.String, java.lang.String> r2 = X.ViewOnTouchListenerC473590Ihh.LLJJIJIL
            java.lang.String r1 = "EVENT_ORIGIN_FEATURE"
            java.lang.String r0 = "TEMAI"
            r2.put(r1, r0)
            java.lang.String r1 = "is_from_live"
            java.lang.String r0 = "1"
            r2.put(r1, r0)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.g1
            if (r0 == 0) goto Lc2
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lc2
            java.lang.String r0 = r0.userId
        L2e:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "author_id"
            r2.put(r0, r1)
            long r0 = r4.LLILLJJLI
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "room_id"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.g1
            if (r0 == 0) goto Lc0
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lc0
            java.lang.String r0 = r0.enterFromMerge
        L4c:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "enter_from_merge"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.g1
            if (r0 == 0) goto Lbe
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r0.enterFromMerge
        L5f:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "enter_from"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.g1
            if (r0 == 0) goto Lbc
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lbc
            java.lang.String r0 = r0.enterMethod
        L72:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "enter_method"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.g1
            if (r0 == 0) goto Lba
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lba
            java.lang.String r0 = r0.followStatus
        L85:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "follow_status"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.g1
            if (r0 == 0) goto Lb8
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            if (r0 == 0) goto Lb8
            boolean r1 = r0.enterFromAd
            r0 = 1
            if (r1 != r0) goto Lb8
        L9b:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_ad"
            r2.put(r0, r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r4.g1
            if (r0 == 0) goto Lae
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$LogData r0 = r0.mLogData
            if (r0 == 0) goto Lae
            java.lang.String r3 = r0.requestId
        Lae:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "request_id"
            r2.put(r0, r1)
            return
        Lb8:
            r0 = 0
            goto L9b
        Lba:
            r0 = r3
            goto L85
        Lbc:
            r0 = r3
            goto L72
        Lbe:
            r0 = r3
            goto L5f
        Lc0:
            r0 = r3
            goto L4c
        Lc2:
            r0 = r3
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC473590Ihh.LJIJJ(com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment):void");
    }

    @Override // X.AbstractC473620Ihk
    public final String LIZJ(String str) {
        return C786410Ut5.J3(LJIIL(str));
    }

    @Override // X.AbstractC473620Ihk
    public final void LJ(boolean z) {
        LLILZ = z;
        LivePlayFragment livePlayFragmentLJIIIZ = LJIIIZ();
        if (livePlayFragmentLJIIIZ != null) {
            livePlayFragmentLJIIIZ.cD("internal window mute form outer", z);
        }
        LJJI();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C19EG activity2;
        String disAppearService;
        String appearService;
        String appearService2;
        C19EG activity3;
        Application application;
        LivePlayFragment livePlayFragmentLJIIIZ = LJIIIZ();
        if (livePlayFragmentLJIIIZ != null && (activity2 = livePlayFragmentLJIIIZ.getActivity()) != null) {
            if (!Intrinsics.LJFF(activity2, activity)) {
                if (activity2.isFinishing()) {
                    LivePlayFragment livePlayFragmentLJIIIZ2 = LJIIIZ();
                    if (livePlayFragmentLJIIIZ2 != null && (activity3 = livePlayFragmentLJIIIZ2.getActivity()) != null && (application = activity3.getApplication()) != null) {
                        application.unregisterActivityLifecycleCallbacks(this);
                    }
                    LJIJJ(null);
                    LLJ = null;
                    LLJIJIL = null;
                    LLJILJILJ = null;
                    LLJILLL = null;
                    LLJJIII = 0L;
                    LLILZ = false;
                    LLJILJIL = null;
                    LLJLIL = 0.0f;
                    LLILZIL = false;
                    LLILZLL = false;
                    LLIZ = null;
                    LLIZLLLIL = null;
                    return;
                }
                if (LLJJ) {
                    activity.finish();
                    return;
                }
                LLILZLL = false;
                if (Intrinsics.LJFF(LLIZ, Boolean.FALSE) || LLILZLL) {
                    return;
                }
                if (LLILLJJLI != EnumC473610Ihj.STATE_DESTROY) {
                    WindowPageConfig windowPageConfig = LLILLL;
                    if (windowPageConfig != null) {
                        disAppearService = windowPageConfig.getDisAppearService();
                    } else {
                        disAppearService = null;
                    }
                    EnumC464650IJz enumC464650IJz = EnumC464650IJz.CONFIG_CLOSE;
                    if (Intrinsics.LJFF(disAppearService, enumC464650IJz.getConfig())) {
                        LLILLJJLI = EnumC473610Ihj.STATE_CLOSE;
                        LJIIZILJ();
                    }
                    String strLJIIJ = LJIIJ(activity);
                    if (strLJIIJ == null) {
                        strLJIIJ = null;
                    }
                    WindowPageConfig windowPageConfig2 = (WindowPageConfig) ((Map) LLJJJJ.getValue()).get(strLJIIJ);
                    LLILLL = windowPageConfig2;
                    if (windowPageConfig2 != null) {
                        appearService = windowPageConfig2.getAppearService();
                    } else {
                        appearService = null;
                    }
                    if (Intrinsics.LJFF(appearService, EnumC464650IJz.CONFIG_DISPLAY.getConfig())) {
                        LLILLJJLI = EnumC473610Ihj.STATE_SHOW;
                    } else {
                        if (windowPageConfig2 != null) {
                            appearService2 = windowPageConfig2.getAppearService();
                        } else {
                            appearService2 = null;
                        }
                        if (Intrinsics.LJFF(appearService2, enumC464650IJz.getConfig()) || Intrinsics.LJFF(LLIZ, Boolean.TRUE)) {
                            LLILLJJLI = EnumC473610Ihj.STATE_CLOSE;
                        }
                    }
                }
                LJIL(activity, null);
                return;
            }
            DialogFragment dialogFragment = LLJILJIL;
            if (dialogFragment != null) {
                if (!LLJJ) {
                    return;
                }
                dialogFragment.dismiss();
                return;
            }
            LJIILLIIL();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object parent;
        Context context;
        if (LLJJIII > 0) {
            ViewGroup viewGroup = LLJILJILJ;
            Activity activityLIZ = null;
            if (viewGroup != null) {
                parent = viewGroup.getParent();
            } else {
                parent = null;
            }
            View view = (View) parent;
            if (view != null && (context = view.getContext()) != null) {
                activityLIZ = C1388190mED.LIZ(context);
            }
            if (Intrinsics.LJFF(activityLIZ, activity)) {
                LLJJI += SystemClock.elapsedRealtime() - LLJJIII;
                LLJJIII = 0L;
            }
        }
    }

    public static void LJIJI(String str, Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(LLJJIJIL);
        String str2 = LLJJIJI;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("page_name", str2);
        C2097608Jq.LJIILL(linkedHashMap, pairArr);
        Map<String, String> map = LLJJLIIIJLLLLLLLZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(android.app.Activity r13, androidx.fragment.app.DialogFragment r14) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC473590Ihh.LJIL(android.app.Activity, androidx.fragment.app.DialogFragment):void");
    }

    @Override // X.AbstractC473620Ihk
    public final void LJFF(ComponentActivity componentActivity, boolean z) {
        LJIJJLI(componentActivity, null, Boolean.FALSE, null, null);
        LJ(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC473590Ihh.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x007d, TryCatch #0 {all -> 0x007d, blocks: (B:18:0x0030, B:20:0x003b, B:21:0x0041, B:36:0x0073, B:24:0x004a, B:26:0x0055, B:28:0x005b, B:30:0x0061, B:32:0x0067, B:34:0x006d), top: B:47:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    @Override // X.AbstractC473620Ihk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(androidx.activity.ComponentActivity r6, androidx.fragment.app.DialogFragment r7, java.lang.Long r8) {
        /*
            r5 = this;
            boolean r0 = LJIIIIZZ()
            r4 = 0
            if (r0 != 0) goto L8
            return r4
        L8:
            boolean r0 = LJIILJJIL()
            if (r0 == 0) goto Lf
            return r4
        Lf:
            java.lang.String r1 = LJIIJ(r6)
            r2 = 0
            if (r1 != 0) goto L1c
            if (r7 == 0) goto L2b
            java.lang.String r1 = LJIIJJI(r7)
        L1c:
            X.01GW r0 = X.ViewOnTouchListenerC473590Ihh.LLJJJJJIL
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = X.C13LP.LJJJJ(r1, r0)
            if (r0 != 0) goto L2d
            return r4
        L2b:
            r1 = r2
            goto L1c
        L2d:
            r3 = 1
            if (r8 == 0) goto L4a
            X.0Ihh r0 = X.ViewOnTouchListenerC473590Ihh.LL     // Catch: java.lang.Throwable -> L7d
            r0.getClass()     // Catch: java.lang.Throwable -> L7d
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = LJIIIZ()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L46
            long r0 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L7d
        L41:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)     // Catch: java.lang.Throwable -> L7d
            goto L48
        L46:
            r0 = r2
            goto L41
        L48:
            if (r0 == 0) goto L7b
        L4a:
            X.0Ihh r0 = X.ViewOnTouchListenerC473590Ihh.LL     // Catch: java.lang.Throwable -> L7d
            r0.getClass()     // Catch: java.lang.Throwable -> L7d
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = LJIIIZ()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L7b
            X.19EG r0 = r0.getActivity()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L7b
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7b
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = LJIIIZ()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L7b
            X.19EG r0 = r0.getActivity()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L7b
            boolean r0 = r0.isDestroyed()     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7b
        L73:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L7d
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7d
            goto L89
        L7b:
            r3 = 0
            goto L73
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L89:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L90
            r2 = r1
        L90:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L98
            boolean r4 = r2.booleanValue()
        L98:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC473590Ihh.LIZ(androidx.activity.ComponentActivity, androidx.fragment.app.DialogFragment, java.lang.Long):boolean");
    }

    public static void LJIJJLI(Activity activity, DialogFragment dialogFragment, Boolean bool, Map map, C473600Ihi c473600Ihi) {
        View viewFindViewById;
        if (map != null) {
            LLJJLIIIJLLLLLLLZ = map;
        }
        if (bool != null) {
            LLJL = Boolean.valueOf(bool.booleanValue());
        }
        if (c473600Ihi != null) {
            LLIZLLLIL = c473600Ihi;
        }
        if (!LJIIIIZZ() || LJIILJJIL() || Intrinsics.LJFF(LLIZ, Boolean.FALSE)) {
            return;
        }
        String strLJIIJ = LJIIJ(activity);
        if (strLJIIJ == null) {
            if (dialogFragment != null) {
                strLJIIJ = LJIIJJI(dialogFragment);
            } else {
                strLJIIJ = null;
            }
        }
        if (!C13LP.LJJJJ(strLJIIJ, (Set) LLJJJJJIL.getValue())) {
            return;
        }
        LLILZLL = false;
        LLILLL = (WindowPageConfig) ((Map) LLJJJJ.getValue()).get(strLJIIJ);
        if (((dialogFragment == null || (viewFindViewById = LJII(dialogFragment)) == null) && (viewFindViewById = activity.findViewById(android.R.id.content)) == null) || LLJILJILJ == null || viewFindViewById.findViewById(R.id.dgb) == null) {
            if (LLILLJJLI != EnumC473610Ihj.STATE_DESTROY) {
                LLILLJJLI = EnumC473610Ihj.STATE_SHOW;
            }
            LJIL(activity, dialogFragment);
            return;
        }
        ViewGroup viewGroup = LLJILJILJ;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
        LivePlayFragment livePlayFragmentLJIIIZ = LJIIIZ();
        if (livePlayFragmentLJIIIZ != null) {
            livePlayFragmentLJIIIZ.cD("internal window resume from media conflict", LLILZ);
        }
    }
}
