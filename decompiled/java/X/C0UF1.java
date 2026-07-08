package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UF1, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UF1 implements InterfaceViewOnClickListenerC1102800enu {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public ViewOnLayoutChangeListenerC769370UFz LLILZ;
    public DataChannel LLILZIL;
    public ARunnableS112S0100000_12 LLILZLL;
    public ARunnableS112S0100000_12 LLIZ;
    public final ArrayList<EnumC1102750enp> LLILLL = new ArrayList<>();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(258));

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean x0(View view) {
        return false;
    }

    public final void LIZ() {
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz = this.LLILZ;
        if (viewOnLayoutChangeListenerC769370UFz != null) {
            viewOnLayoutChangeListenerC769370UFz.setFocusable(false);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz2 = this.LLILZ;
        if (viewOnLayoutChangeListenerC769370UFz2 != null) {
            viewOnLayoutChangeListenerC769370UFz2.setOutsideTouchable(false);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz3 = this.LLILZ;
        if (viewOnLayoutChangeListenerC769370UFz3 != null) {
            viewOnLayoutChangeListenerC769370UFz3.setTouchable(false);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz4 = this.LLILZ;
        if (viewOnLayoutChangeListenerC769370UFz4 != null) {
            viewOnLayoutChangeListenerC769370UFz4.update();
        }
    }

    public final void LIZIZ() {
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz = this.LLILZ;
        if (viewOnLayoutChangeListenerC769370UFz != null) {
            viewOnLayoutChangeListenerC769370UFz.setFocusable(true);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz2 = this.LLILZ;
        if (viewOnLayoutChangeListenerC769370UFz2 != null) {
            viewOnLayoutChangeListenerC769370UFz2.setOutsideTouchable(true);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz3 = this.LLILZ;
        if (viewOnLayoutChangeListenerC769370UFz3 != null) {
            viewOnLayoutChangeListenerC769370UFz3.setTouchable(true);
        }
        ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz4 = this.LLILZ;
        if (viewOnLayoutChangeListenerC769370UFz4 != null) {
            viewOnLayoutChangeListenerC769370UFz4.update();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.LLILLL.isEmpty()) {
            if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
                int i = 0;
                do {
                    C01GW c01gw = C485950J3x.LIZ;
                    C485950J3x.LIZLLL(R.layout.h5k, this.LL);
                    i++;
                } while (i < 7);
            }
            ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz = new ViewOnLayoutChangeListenerC769370UFz(this.LL, this.LLILZIL, this.LLILLL);
            this.LLILZ = viewOnLayoutChangeListenerC769370UFz;
            viewOnLayoutChangeListenerC769370UFz.LJJIJ(view);
            C0UF4 c0uf4LIZIZ = C771670UOv.LIZIZ();
            if (c0uf4LIZIZ != null) {
                c0uf4LIZIZ.LIZ = true;
            }
            InterfaceC766480U4w.LJJJLL.LJFF(Boolean.FALSE);
            if (C0UID.LJIIJ(this.LLILZIL) && TryModeGuidanceSetting.INSTANCE.isV2()) {
                if (C0UID.LIZIZ()) {
                    if (view != null) {
                        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 257);
                        this.LLILZLL = aRunnableS112S0100000_12;
                        HandlerHook.viewPostDelay(view, aRunnableS112S0100000_12, TryModeGuidanceConfigSetting.INSTANCE.enhancedBubbleDelay());
                    }
                    TryModeGuidanceConfigSetting tryModeGuidanceConfigSetting = TryModeGuidanceConfigSetting.INSTANCE;
                    long jGuidanceInterval = tryModeGuidanceConfigSetting.guidanceInterval() + tryModeGuidanceConfigSetting.guidanceShowDuration();
                    if (C0UID.LJFF()) {
                        Handler handler = (Handler) this.LLIZLLLIL.getValue();
                        ARunnableS112S0100000_12 aRunnableS112S0100000_122 = new ARunnableS112S0100000_12(this, 256);
                        this.LLIZ = aRunnableS112S0100000_122;
                        C786410Ut5.LJLIIL(jGuidanceInterval, handler, aRunnableS112S0100000_122);
                    }
                } else {
                    long jEnhancedBubbleDelay = TryModeGuidanceConfigSetting.INSTANCE.enhancedBubbleDelay();
                    if (C0UID.LJFF()) {
                        Handler handler2 = (Handler) this.LLIZLLLIL.getValue();
                        ARunnableS112S0100000_12 aRunnableS112S0100000_123 = new ARunnableS112S0100000_12(this, 256);
                        this.LLIZ = aRunnableS112S0100000_123;
                        C786410Ut5.LJLIIL(jEnhancedBubbleDelay, handler2, aRunnableS112S0100000_123);
                    }
                }
                ViewOnLayoutChangeListenerC769370UFz viewOnLayoutChangeListenerC769370UFz2 = this.LLILZ;
                if (viewOnLayoutChangeListenerC769370UFz2 != null) {
                    viewOnLayoutChangeListenerC769370UFz2.LLILZ = new AwS556S0100000_12(this, 732);
                }
            }
        }
    }

    public C0UF1(Context context, LifecycleOwner lifecycleOwner) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WH(X.InterfaceC1103130eoR r12, com.bytedance.ies.sdk.datachannel.DataChannel r13) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UF1.WH(X.0eoR, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
