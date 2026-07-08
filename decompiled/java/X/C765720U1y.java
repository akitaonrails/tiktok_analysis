package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeEducationSheet;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorWidgetLazyInit;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMicDetectionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765720U1y implements InterfaceC765730U1z {
    public C0U1C LIZ;
    public boolean LIZIZ;

    public final void LIZ(boolean z) {
        this.LIZIZ = z;
    }

    public final void LIZIZ(DataChannel dataChannel, boolean z) {
        boolean zLJFF;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        FragmentManager fragmentManager;
        KaraokeViewModel karaokeViewModelLIZJ;
        LifecycleOwner lifecycleOwner2;
        boolean z2;
        if (dataChannel != null && (lifecycleOwner2 = dataChannel.LLILZ) != null) {
            if (!C500260Jjc.LJIIZILJ(dataChannel) || (C500260Jjc.LJIIZILJ(dataChannel) && LiveAnchorWidgetLazyInit.INSTANCE.enable())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.LIZ == null) {
                this.LIZ = new C0U1C(lifecycleOwner2, dataChannel, z2);
            }
        }
        if (z) {
            if (!C765700U1w.LIZ && (karaokeViewModelLIZJ = C765700U1w.LIZJ(dataChannel)) != null) {
                karaokeViewModelLIZJ.cR2(C765430U0v.LIZ);
                return;
            }
            return;
        }
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(Boolean.TRUE, dataChannel.gg0(UserIsAnchorChannel.class));
        } else {
            zLJFF = false;
        }
        if (LiveKaraokeMicDetectionSetting.INSTANCE.enabled()) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJZZI;
            if (!c20337914i1.LIZIZ().booleanValue() && zLJFF) {
                c20337914i1.LJFF(Boolean.TRUE);
                Bundle bundle = new Bundle();
                bundle.putInt("karaoke_action_type", 0);
                if (dataChannel != null) {
                    fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
                } else {
                    fragmentManager = null;
                }
                C19322110iZ.LIZLLL(fragmentManager, KaraokeEducationSheet.class, "live_karaoke_education", null, bundle);
                return;
            }
        }
        if (dataChannel != null && (lifecycleOwner = dataChannel.LLILZ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C763710TxZ(dataChannel, null), 3);
        }
    }
}
