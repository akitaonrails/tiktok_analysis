package X;

import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.dataChannel.NotifyRemoveLiveBroadcastFragmentEvent;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorEndPageBugFixABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostFixAbnormalExitEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeLaunchBroadcastOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.live.LiveBroadcastRootFragment;
import com.ss.android.ugc.aweme.live.LiveEndFragmentObserver;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AKT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AKT implements InterfaceC773130UUl {
    public final /* synthetic */ LiveBroadcastRootFragment LIZ;

    @Override // X.InterfaceC773130UUl
    public final void LIZJ() {
        Bundle arguments = this.LIZ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        int i = 0;
        arguments.putBoolean("is_try_mode", false);
        arguments.putBoolean("is_from_try_mode", true);
        this.LIZ.sS(arguments);
        LiveBroadcastRootFragment liveBroadcastRootFragment = this.LIZ;
        liveBroadcastRootFragment.getClass();
        LivePitayaEnv.LJIIIZ(liveBroadcastRootFragment);
        C01GW c01gw = C300920Bqs.LIZ;
        if (((Number) c01gw.getValue()).intValue() >= 0) {
            BPEAHandler bPEAHandler = liveBroadcastRootFragment.LLLIIL;
            RunnableC1604300rqm runnableC1604300rqm = liveBroadcastRootFragment.LLLLIIL;
            int iIntValue = ((Number) c01gw.getValue()).intValue();
            if (iIntValue >= 0 && (i = iIntValue) > 60) {
                i = 60;
            }
            C786410Ut5.LJLIIL(i * LSPassThroughRecordSizeConfig.DEFAULT, bPEAHandler, runnableC1604300rqm);
        }
    }

    public C1AKT(LiveBroadcastRootFragment liveBroadcastRootFragment) {
        this.LIZ = liveBroadcastRootFragment;
    }

    @Override // X.InterfaceC773130UUl
    public final void LIZ(Bundle bundle) {
        Fragment fragment;
        this.LIZ.getClass();
        if (LiveHostFixAbnormalExitEvent.enable()) {
            InterfaceC772190UQv.P3.LJFF(0L);
            InterfaceC772190UQv.Q3.LJFF(0L);
            InterfaceC772190UQv.R3.LJFF("");
            InterfaceC772190UQv.S3.LJFF(0);
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(this.LIZ.LLLIIL, new ARunnableS82S0200000_13(bundle, this, 33));
            return;
        }
        LiveBroadcastRootFragment liveBroadcastRootFragment = this.LIZ;
        if (liveBroadcastRootFragment.LLLIILIL) {
            C20441214yg.LJIIL("LiveBroadcastRootFragment", "enterEndFragment is already in progress, ignoring duplicate call.");
            return;
        }
        liveBroadcastRootFragment.LLLIILIL = true;
        C1AKS c1aks = liveBroadcastRootFragment.LLJJIJIIJIL;
        if (c1aks == null) {
            return;
        }
        liveBroadcastRootFragment.LLJJIJIIJIL = null;
        FragmentManager fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI(liveBroadcastRootFragment);
        if (fragmentManagerLJIIJJI != null) {
            LiveBroadcastRootFragment liveBroadcastRootFragment2 = this.LIZ;
            C1AKR c1akr = liveBroadcastRootFragment2.LLJJIJIL;
            if ((c1akr != null && (fragment = c1akr.getFragment()) != null && fragment.isAdded()) || fragmentManagerLJIIJJI.LJL()) {
                C20441214yg.LJIIL("LiveBroadcastRootFragment", "liveEndFragment is already added.");
                return;
            }
            C1AKR c1akrCreateLiveBroadcastEndFragment = Live.getService().createLiveBroadcastEndFragment(bundle);
            liveBroadcastRootFragment2.LLJJIJIL = c1akrCreateLiveBroadcastEndFragment;
            if (c1akrCreateLiveBroadcastEndFragment == null) {
                return;
            }
            boolean zShowFinishEncourage = Live.getService().showFinishEncourage();
            LiveEndFragmentObserver.LIZ(c1akrCreateLiveBroadcastEndFragment.getFragment());
            if (zShowFinishEncourage) {
                if (AnchorEndPageBugFixABSetting.INSTANCE.enable()) {
                    C19EH c19ehLJIIJ = fragmentManagerLJIIJJI.LJIIJ();
                    c19ehLJIIJ.LIZIZ(R.id.iiv, c1akrCreateLiveBroadcastEndFragment.getFragment());
                    c19ehLJIIJ.LJIIJ();
                } else {
                    C19EH c19ehLJIIJ2 = fragmentManagerLJIIJJI.LJIIJ();
                    c19ehLJIIJ2.LIZIZ(R.id.iiv, c1akrCreateLiveBroadcastEndFragment.getFragment());
                    c19ehLJIIJ2.LJIIL();
                }
                DataChannelGlobal.LLILZ.BQ2(c1akrCreateLiveBroadcastEndFragment.getFragment(), c1akrCreateLiveBroadcastEndFragment.getFragment(), NotifyRemoveLiveBroadcastFragmentEvent.class, new AwS399S0200000_33(c1aks, fragmentManagerLJIIJJI, 11));
            } else {
                C19EH c19ehLJIIJ3 = fragmentManagerLJIIJJI.LJIIJ();
                c19ehLJIIJ3.LJIJ(R.id.iiv, c1akrCreateLiveBroadcastEndFragment.getFragment(), null);
                c19ehLJIIJ3.LJIIL();
            }
            liveBroadcastRootFragment2.LLJJJJLIIL = false;
        }
    }

    @Override // X.InterfaceC773130UUl
    public final void LIZLLL(boolean z) {
        C772290URf c772290URfLJI = C0UF5.LJI();
        if (z) {
            if (LiveTryModeLaunchBroadcastOptSetting.INSTANCE.enable() || (c772290URfLJI != null && c772290URfLJI.LIZ)) {
                this.LIZ.release();
            }
        }
    }

    @Override // X.InterfaceC773130UUl
    public final void LJ(C779220UhU c779220UhU) {
        Context context = this.LIZ.getContext();
        if (context != null) {
            C786410Ut5.LJJIFFI(context, c779220UhU);
        }
    }

    @Override // X.InterfaceC773130UUl
    public final void LIZIZ(C779220UhU c779220UhU, IntentFilter intentFilter) throws Exception {
        Context context = this.LIZ.getContext();
        if (context != null) {
            C786410Ut5.LJIJJ(context, c779220UhU, intentFilter);
        }
    }
}
