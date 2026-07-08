package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.feed.platform.popup.dynamic.InteractionConfig;
import com.ss.android.ugc.feed.platform.popup.exp.FeedDynamicBugfixConfig;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15hT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class DialogC20589315hT extends DialogC19728412Gs {
    public final C19EG LL;
    public final View LLILLJJLI;
    public final C0TXP LLILLL;
    public final FrameLayout LLILZ;
    public boolean LLILZIL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.LLILZIL = true;
        super.onBackPressed();
        this.LLILZIL = false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() throws JSONException {
        String str;
        if (this.LLILZIL) {
            InteractionConfig interactionConfig = this.LLILLL.LJI().interactionConfig;
            if (interactionConfig == null || (str = interactionConfig.backKeyMode) == null) {
                str = "native_close";
            }
            if (Intrinsics.LJFF(str, "none")) {
                return;
            }
            if (Intrinsics.LJFF(str, "handle_by_fe")) {
                C20589415hU.LIZIZ("dialog: dismiss: send on_pop_dismiss");
                JSONObject jSONObject = new JSONObject();
                String sparkContainerId = this.LLILLL.getSparkContainerId();
                if (sparkContainerId == null) {
                    sparkContainerId = "";
                }
                jSONObject.put("spark_container_id", sparkContainerId);
                C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323890kYV(jSONObject), "on_pop_dismiss"));
                return;
            }
        }
        C786410Ut5.LJJJZ(this.LLILLJJLI, this.LLILZ);
        super.dismiss();
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        C20589415hU.LIZ("FeedDynamicPopupDialog onAttachedToWindow");
        C20588615hM.LIZ.getClass();
        C20588615hM.LJFF = true;
        JSONObject jSONObject = new JSONObject();
        String enterFrom = this.LLILLL.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        jSONObject.put("enter_from", enterFrom);
        String sparkContainerId = this.LLILLL.getSparkContainerId();
        jSONObject.put("spark_container_id", sparkContainerId != null ? sparkContainerId : "");
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323890kYV(jSONObject), "on_pop_appear"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20589415hU.LIZ("FeedDynamicPopupDialog onDetachedFromWindow");
        C20588615hM.LIZ.getClass();
        C20588615hM.LJFF = false;
        if (((FeedDynamicBugfixConfig) C20589115hR.LIZIZ.getValue()).enableImmersiveMode) {
            C1766560w4U.LIZ(this.LL, this);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setLayout(-1, -1);
        if (((FeedDynamicBugfixConfig) C20589115hR.LIZIZ.getValue()).enableImmersiveMode) {
            C0DRA.LIZ(window, false);
            TuxImmersionBar tuxImmersionBarLJFF = C1766560w4U.LJFF(this.LL, this);
            tuxImmersionBarLJFF.LJIIJJI();
            tuxImmersionBarLJFF.LIZLLL();
        }
    }

    public DialogC20589315hT(C19EG c19eg, Context context, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, C0TXP c0txp) {
        super(context);
        this.LL = c19eg;
        this.LLILLJJLI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        this.LLILLL = c0txp;
        FrameLayout frameLayout = new FrameLayout(context);
        this.LLILZ = frameLayout;
        C786410Ut5.a6(this.LLILZ, new ViewGroup.LayoutParams(-1, -1));
        setContentView(frameLayout);
        frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new FrameLayout.LayoutParams(-1, -1));
    }
}
