package X;

import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0TF9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TF9 {
    public static PlaybookAnchorServiceV2 LIZIZ() {
        FragmentManager topFragmentManager;
        C19EG topFragmentActivity;
        boolean z = C500260Jjc.LJIL() || C500260Jjc.LJJIL();
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null && (topFragmentManager = iHostAction.getTopFragmentManager()) != null) {
            Fragment fragmentLIZJ = C784920Uqg.LIZJ(topFragmentManager);
            if (fragmentLIZJ != null) {
                DataChannel dataChannelLIZ = C0IJR.LIZ(ViewModelProviders.of(fragmentLIZJ), fragmentLIZJ);
                dataChannelLIZ.SX0(C748880TZe.class, topFragmentManager);
                return C784920Uqg.LIZIZ(dataChannelLIZ) == null ? LIZ(dataChannelLIZ, fragmentLIZJ, null, fragmentLIZJ, z) : C784920Uqg.LIZIZ(dataChannelLIZ);
            }
            IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction2 != null && (topFragmentActivity = iHostAction2.getTopFragmentActivity()) != null) {
                DataChannel dataChannelLIZ2 = C0IJR.LIZ(ViewModelProviders.of(topFragmentActivity), topFragmentActivity);
                dataChannelLIZ2.SX0(C748880TZe.class, topFragmentActivity.getSupportFragmentManager());
                return C784920Uqg.LIZIZ(dataChannelLIZ2) == null ? LIZ(dataChannelLIZ2, null, topFragmentActivity, topFragmentActivity, z) : C784920Uqg.LIZIZ(dataChannelLIZ2);
            }
        }
        return null;
    }

    public static PlaybookAnchorServiceV2 LIZ(DataChannel dataChannel, Fragment fragment, C19EG c19eg, final LifecycleOwner lifecycleOwner, boolean z) {
        WeakReference weakReference;
        WeakReference weakReference2 = null;
        if (dataChannel != null) {
            if (C784920Uqg.LIZIZ(dataChannel) != null) {
                return C784920Uqg.LIZIZ(dataChannel);
            }
            if (dataChannel != null) {
                if (fragment != null) {
                    weakReference = new WeakReference(fragment);
                } else {
                    weakReference = null;
                }
                if (c19eg != null) {
                    weakReference2 = new WeakReference(c19eg);
                }
                final PlaybookAnchorServiceV2 playbookAnchorServiceV2 = new PlaybookAnchorServiceV2(dataChannel, weakReference, weakReference2, z);
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0T7u
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PlaybookAnchorServiceV2$Companion@b8f4.createPlaybookAnchorServiceV2$1$1");
                        try {
                            lifecycleOwner.getLifecycle().addObserver(playbookAnchorServiceV2);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PlaybookAnchorServiceV2$Companion@b8f4.createPlaybookAnchorServiceV2$1$1");
                    }
                });
                return playbookAnchorServiceV2;
            }
        }
        return null;
    }
}
