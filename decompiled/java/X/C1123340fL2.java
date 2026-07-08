package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import avg.f;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS2S2300100_17;
import mf.a;

/* JADX INFO: renamed from: X.0fL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123340fL2 extends FrameLayout implements C0T8B {
    public static final /* synthetic */ int LLILZIL = 0;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public String LLILLJJLI;
    public String LLILLL;
    public Function0<Boolean> LLILZ;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIFFI(true);
        }
    }

    public final String getLynxExtra() {
        return this.LLILLL;
    }

    public final Function0<Boolean> getShouldBlockClick() {
        return this.LLILZ;
    }

    public final String getShowingUrl() {
        return this.LLILLJJLI;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB getSparkView() {
        return this.LL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Function0<Boolean> function0;
        if (motionEvent != null && motionEvent.getAction() == 0 && (function0 = this.LLILZ) != null && !function0.invoke().booleanValue() && C1123380fL6.LIZIZ()) {
            C1123380fL6.LIZJ(303, false);
        }
        Function0<Boolean> function02 = this.LLILZ;
        if (function02 != null) {
            return function02.invoke().booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setLynxExtra(String str) {
        this.LLILLL = str;
    }

    public final void setShouldBlockClick(Function0<Boolean> function0) {
        this.LLILZ = function0;
    }

    public final void setShowingUrl(String str) {
        this.LLILLJJLI = str;
    }

    public final void setSparkView(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    public C1123340fL2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void LIZIZ(String str, String str2, Fragment fragment, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (getChildCount() > 0) {
            try {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                removeAllViews();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                interfaceC1631620sYq.invoke(-1L, -1, "Cannot remove existing views");
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(getContext(), str, fragment, true, new AwS2S2300100_17(jUptimeMillis, this, str2, str, function1, interfaceC1631620sYq, 0));
        this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
        addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -1);
        View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0fL4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        if (C1848410yCV.LIZ) {
            fVar = new f(fVar);
        }
        View.OnClickListener aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public static String LIZ(String str, Long l, Long l2, String str2, String str3, String str4, Long l3, Integer num, boolean z) {
        long jLongValue;
        C495520Jby c495520Jby = new C495520Jby(str);
        int i = 1;
        c495520Jby.LIZ(1, "hide_loading");
        if (l2 != null) {
            c495520Jby.LIZIZ(l2.longValue(), "gift_to_user_id");
        }
        if (l3 != null) {
            l3.longValue();
            c495520Jby.LIZIZ(l3.longValue(), "gift_to_room_id");
        }
        if (str2 != null) {
            c495520Jby.LIZJ("gift_to_sec_user_id", str2);
        }
        if (str3 != null) {
            c495520Jby.LIZJ("gift_to_user_nick_name", str3);
        }
        if (str4 != null) {
            c495520Jby.LIZJ("gift_from_user_nick_name", str4);
        }
        if (num != null) {
            c495520Jby.LIZ(num.intValue(), "gift_to_user_type");
        }
        c495520Jby.LIZJ("new_ui_container", String.valueOf(C1125810fP1.LIZJ()));
        try {
            C1094490eaV c1094490eaVDX = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).DX();
            c495520Jby.LIZ(c1094490eaVDX.LIZ.ordinal(), "task_status");
            c495520Jby.LIZIZ(c1094490eaVDX.LIZIZ, "num_gift_left");
            c495520Jby.LIZIZ(c1094490eaVDX.LIZLLL, "current_progress");
            c495520Jby.LIZIZ(c1094490eaVDX.LJ, "overall_progress");
            c495520Jby.LIZ(c1094490eaVDX.LJFF, "current_level");
            c495520Jby.LIZJ("activity_id", c1094490eaVDX.LJI);
            c495520Jby.LIZ(c1094490eaVDX.LJII, "user_status");
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            c495520Jby.LIZ(i, "is_upgrade_gift");
            int i3 = C1138640fji.LIZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Gift giftLJI = C1138640fji.LJI(jLongValue);
            if (giftLJI != null) {
                i2 = giftLJI.diamondCount;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("task_status, ");
            sbLIZ.append(c1094490eaVDX.LIZ);
            sbLIZ.append(", num_gift_left, ");
            sbLIZ.append(c1094490eaVDX.LIZIZ);
            sbLIZ.append(", current_progress, ");
            sbLIZ.append(c1094490eaVDX.LIZLLL);
            sbLIZ.append(", overall_progress, ");
            sbLIZ.append(c1094490eaVDX.LJ);
            sbLIZ.append(",current_gift_cost = ");
            sbLIZ.append(i2);
            sbLIZ.append(", giftId = ");
            sbLIZ.append(l);
            sbLIZ.append(", is_uprgade_gift = ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("buildNormalUrl", C2188811AlT.LIZIZ(sbLIZ));
            c495520Jby.LIZ(i2, "current_gift_cost");
            c495520Jby.LIZIZ(c1094490eaVDX.LIZJ, "blast_end_timestamp");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("Gameplay banner exception", e);
        }
        String strLIZLLL = c495520Jby.LIZLLL();
        strLIZLLL.toString();
        return strLIZLLL;
    }
}
