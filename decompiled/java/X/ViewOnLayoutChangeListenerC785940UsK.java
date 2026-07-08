package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.api.PreviewPackageContainerTopValueChannel;
import com.bytedance.android.live.broadcast.api.PreviewToolBarTopValueChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionMoreWidget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastInteractionFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastCpuOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnLayoutChangeListenerC785940UsK implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLayoutChange$9(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC785940UsK(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewRevisionMoreWidget top: ");
        sbLIZ.append(i2);
        sbLIZ.append(", oldTop: ");
        sbLIZ.append(i6);
        C20441214yg.LIZIZ("PreviewRevisionMoreWidget", C2188811AlT.LIZIZ(sbLIZ));
        ((PreviewRevisionMoreWidget) viewOnLayoutChangeListenerC785940UsK.l0).dataChannel.zW(PreviewToolBarTopValueChannel.class, Integer.valueOf(i2));
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = ((TryModeBroadcastFragment) viewOnLayoutChangeListenerC785940UsK.l0).qS().getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (layoutParams.width == i9 && layoutParams.height == i10) {
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        ((TryModeBroadcastFragment) viewOnLayoutChangeListenerC785940UsK.l0).qS().requestLayout();
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC785940UsK);
        ((Function0) viewOnLayoutChangeListenerC785940UsK.l0).invoke();
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AnonymousClass0956 anonymousClass0956LIZLLL;
        if (((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0).getAllBannerContainerFromXml().getHeight() < ((int) C497740JfY.LIZIZ(54.0f))) {
            C20441214yg.LIZIZ("VideoModeContainer", "all_banner_container cancel");
            if (C500260Jjc.LJJJJIZL(((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0).getAllBannerContainerFromXml())) {
                C20441214yg.LIZIZ("VideoModeContainer", "all_banner_container invisible");
                C500260Jjc.LJIILLIIL(((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0).getAllBannerContainerFromXml());
            }
            AnonymousClass0956 anonymousClass0956 = ((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0).LLLZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            ((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0).LLLZ = null;
            return;
        }
        C20441214yg.LIZIZ("VideoModeContainer", "all_banner_container try visible1");
        C770200UJe c770200UJe = (C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0;
        if (c770200UJe.LLLZ != null) {
            return;
        }
        if (LiveBroadcastCpuOptSetting.enableCoroutineOpt()) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0).LLILLL), null, null, new C770340UJs((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0, null), 3);
        } else {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0).LLILLL), C0PEM.LIZJ, null, new C770350UJt((C770200UJe) viewOnLayoutChangeListenerC785940UsK.l0, null), 2);
        }
        c770200UJe.LLLZ = anonymousClass0956LIZLLL;
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC785940UsK);
        ((Function0) viewOnLayoutChangeListenerC785940UsK.l0).invoke();
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        DataChannel dataChannel;
        if (i2 != i6 && (dataChannel = ((C770190UJd) viewOnLayoutChangeListenerC785940UsK.l0).LLLIIL) != null) {
            dataChannel.zW(PreviewPackageContainerTopValueChannel.class, Integer.valueOf(i2));
        }
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        DialogC1393760mNC dialogC1393760mNC = (DialogC1393760mNC) viewOnLayoutChangeListenerC785940UsK.l0;
        int measuredHeight = view.getMeasuredHeight();
        dialogC1393760mNC.getClass();
        try {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((View) ((C1393820mNI) dialogC1393760mNC.findViewById(R.id.b24)).getParent());
            if (bottomSheetBehaviorFrom != null) {
                bottomSheetBehaviorFrom.setPeekHeight(measuredHeight);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC785940UsK);
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = ((LiveBroadcastFragment) viewOnLayoutChangeListenerC785940UsK.l0).uS().getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (layoutParams.width == i9 && layoutParams.height == i10) {
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        ((LiveBroadcastFragment) viewOnLayoutChangeListenerC785940UsK.l0).uS().requestLayout();
    }

    public static final void onLayoutChange$8(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = ((VoiceChatBroadcastInteractionFragment) viewOnLayoutChangeListenerC785940UsK.l0).PR().getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (layoutParams.width == i9 && layoutParams.height == i10) {
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        ((VoiceChatBroadcastInteractionFragment) viewOnLayoutChangeListenerC785940UsK.l0).PR().requestLayout();
    }

    public static final void onLayoutChange$9(ViewOnLayoutChangeListenerC785940UsK viewOnLayoutChangeListenerC785940UsK, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C781840Uli) viewOnLayoutChangeListenerC785940UsK.l0).LIZ();
    }
}
