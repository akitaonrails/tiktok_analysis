package X;

import Y.AcS495S0100000_12;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UIJ implements InterfaceC773910UXl {
    public View LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ = "normal_click_icon";
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(505));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 922));
    public LifecycleOwner LLIZ;

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131842942;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_qa_quick_mode_entrance_show");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LJJII("interaction_panel", "enter_from");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        return LiveHostSettingsUIConfig.v2() ? R.attr.czt : LiveHostSettingsUIConfig.v1() ? R.attr.czs : LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine() ? R.attr.dkt : R.attr.da8;
    }

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
        ((Handler) this.LLILZIL.getValue()).removeCallbacks((Runnable) this.LLILZLL.getValue());
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        Context context;
        if (C0UID.LJIIJ(this.LLILLJJLI) && TryModeGuidanceSetting.INSTANCE.isV3()) {
            C0UID.LJIIIZ();
            ((Handler) this.LLILZIL.getValue()).removeCallbacks((Runnable) this.LLILZLL.getValue());
        }
        if (view == null || (context = view.getContext()) == null) {
            View view2 = this.LL;
            if (view2 != null) {
                context = view2.getContext();
            } else {
                context = null;
            }
        }
        Context contextLJJIIZI = C520010KaN.LJJIIZI(context, false);
        if (contextLJJIIZI != null) {
            AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 921);
            if (C1086800eO6.LIZJ) {
                C782110Um9 c782110Um9 = new C782110Um9(contextLJJIIZI);
                c782110Um9.LJIILLIIL = true;
                c782110Um9.LJIIZILJ(2131842939);
                c782110Um9.LJII(2131842938);
                c782110Um9.LJIIJ(2131842936, new AcS495S0100000_12(awS556S0100000_12, 68));
                c782110Um9.LJIIL(2131842937);
                C786410Ut5.E4(c782110Um9.LIZ());
            } else {
                awS556S0100000_12.invoke();
            }
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.FQ2(DismissToolbarPopEvent.class);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_qa_quick_mode_click");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        if (C500260Jjc.LJJJIL(this.LLILLJJLI)) {
            c474500IjALIZ.LJJII(this.LLILZ, "click_type");
        }
        c474500IjALIZ.LIZ();
        this.LLILZ = "normal_click_icon";
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LL = view;
        this.LLILLJJLI = dataChannel;
        this.LLIZ = lifecycleOwner;
        if (C0UID.LJIIJ(dataChannel) && TryModeGuidanceSetting.INSTANCE.isV3()) {
            C786410Ut5.LJLIIL(TryModeGuidanceConfigSetting.INSTANCE.enhancedBubbleDelay(), (Handler) this.LLILZIL.getValue(), (Runnable) this.LLILZLL.getValue());
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
