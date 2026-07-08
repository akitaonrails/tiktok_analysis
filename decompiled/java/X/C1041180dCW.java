package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dCW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041180dCW {
    public static ViewTreeObserverOnGlobalLayoutListenerC2373209Rq LIZIZ;
    public static C0P0T LIZJ;
    public static Integer LIZLLL;
    public static boolean LJ;
    public static final C1041180dCW LIZ = new C1041180dCW();
    public static final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());

    public static final boolean LIZ(C1035880d3y c1035880d3y) {
        String currentUrl;
        String strLJIILLIIL;
        if (c1035880d3y != null && (currentUrl = c1035880d3y.getCurrentUrl()) != null) {
            C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(currentUrl);
            if (c0xlqLJIIL != null) {
                strLJIILLIIL = c0xlqLJIIL.LJIILLIIL("is_instant_page");
            } else {
                strLJIILLIIL = null;
            }
            return Intrinsics.LJFF(strLJIILLIIL, "1");
        }
        return false;
    }

    public static final void LIZJ(SparkContext sparkContext, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        C1035880d3y c1035880d3y;
        boolean z;
        Context context;
        Activity activityLIZ;
        Activity activityLIZ2;
        Integer numValueOf;
        Context context2;
        Activity activityLIZ3;
        Window window;
        WindowManager.LayoutParams attributes;
        if (LIZIZ != null) {
            return;
        }
        Window window2 = null;
        if (C04WF.LIZ() && LIZLLL == null) {
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (context2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext()) != null && (activityLIZ3 = C1388190mED.LIZ(context2)) != null && (window = activityLIZ3.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                numValueOf = Integer.valueOf(attributes.softInputMode);
            } else {
                numValueOf = null;
            }
            LIZLLL = numValueOf;
        }
        LIZ.getClass();
        if (!C291640Bbu.LIZ()) {
            z = false;
        } else {
            if (sparkContext != null) {
                c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
            } else {
                c1035880d3y = null;
            }
            z = !LIZ(c1035880d3y);
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (context = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && activityLIZ.getWindow() != null) {
            Context context3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext();
            if (context3 != null && (activityLIZ2 = C1388190mED.LIZ(context3)) != null) {
                window2 = activityLIZ2.getWindow();
            }
            LIZIZ = new ViewTreeObserverOnGlobalLayoutListenerC2373209Rq(window2, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new C1037190d65(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, sparkContext, z));
        }
    }

    public static final void LJ(SparkContext sparkContext, boolean z) {
        InterfaceC1036850d5X interfaceC1036850d5X;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII;
        Context context;
        Activity activityLIZ;
        Window window;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII2;
        if (sparkContext != null) {
            InterfaceC1036190d4T interfaceC1036190d4T = (InterfaceC1036190d4T) sparkContext.LJFF(InterfaceC1036190d4T.class);
            if (interfaceC1036190d4T != null) {
                interfaceC1036190d4T.LIZLLL();
            }
            InterfaceC1036850d5X interfaceC1036850d5X2 = (InterfaceC1036850d5X) sparkContext.LJFF(InterfaceC1036850d5X.class);
            if (interfaceC1036850d5X2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII2 = interfaceC1036850d5X2.LJII()) != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII2);
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII2.setTranslationY(0.0f);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC2373209Rq viewTreeObserverOnGlobalLayoutListenerC2373209Rq = LIZIZ;
        if (viewTreeObserverOnGlobalLayoutListenerC2373209Rq != null) {
            C786410Ut5.C3(viewTreeObserverOnGlobalLayoutListenerC2373209Rq.LL.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC2373209Rq);
        }
        LIZIZ = null;
        if (C04WF.LIZ()) {
            Integer num = LIZLLL;
            if (num != null) {
                int iIntValue = num.intValue();
                if (sparkContext != null && (interfaceC1036850d5X = (InterfaceC1036850d5X) sparkContext.LJFF(InterfaceC1036850d5X.class)) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = interfaceC1036850d5X.LJII()) != null && (context = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (window = activityLIZ.getWindow()) != null) {
                    window.setSoftInputMode(iIntValue);
                }
            }
            if (z) {
                LIZLLL = null;
            }
        }
    }

    public static final void LIZLLL(TuxIconView tuxIconView, C1035880d3y c1035880d3y, C1069150dvd c1069150dvd) {
        int i;
        C0P0T c0p0t = LIZJ;
        if (c0p0t != null && c0p0t.isShowing()) {
            return;
        }
        if (!((Boolean) C283370B8t.LIZ.getValue()).booleanValue()) {
            C1041180dCW c1041180dCW = LIZ;
            Context context = tuxIconView.getContext();
            c1041180dCW.getClass();
            LIZIZ(context, tuxIconView, c1035880d3y, c1069150dvd);
            return;
        }
        if (Keva.getRepo("autofill_info").getBoolean("click_autofill_keyboard_expand_icon", false) || (i = Keva.getRepo("autofill_info").getInt("keyboard_tips_show_times", 0)) >= 3) {
            return;
        }
        long j = Keva.getRepo("autofill_info").getLong("last_show_keyboard_tips", 0L);
        if (j != 0 && System.currentTimeMillis() - j <= 2592000000L) {
            return;
        }
        Keva.getRepo("autofill_info").storeLong("last_show_keyboard_tips", System.currentTimeMillis());
        Keva.getRepo("autofill_info").storeInt("keyboard_tips_show_times", i + 1);
        C1041180dCW c1041180dCW2 = LIZ;
        Context context2 = tuxIconView.getContext();
        c1041180dCW2.getClass();
        LIZIZ(context2, tuxIconView, c1035880d3y, c1069150dvd);
    }

    public static void LIZIZ(Context context, TuxIconView tuxIconView, C1035880d3y c1035880d3y, C1069150dvd c1069150dvd) {
        AwemeRawAd awemeRawAd;
        C1069260dvo c1069260dvo = new C1069260dvo(c1069150dvd);
        C1023960ckk c1023960ckk = C1E1C.LIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c1069260dvo.logAd(c1023960ckk, awemeRawAd, AFwS252S0000000_16.get$arr$(678));
        C450720Hlu c450720Hlu = new C450720Hlu(context);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = tuxIconView;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LJII(R.attr.a0d);
        c450720Hlu.LLILZ = context.getString(2131834310);
        c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
        c1391600mJi2.LJIIIIZZ = iLIZIZ;
        c1391600mJi2.LJIJJ = true;
        c450720Hlu.LJIIIZ(true, new View.OnClickListener() { // from class: X.0d8d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0P0T c0p0t = C1041180dCW.LIZJ;
                if (c0p0t != null) {
                    c0p0t.dismiss();
                }
            }
        });
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        LIZJ = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
    }
}
