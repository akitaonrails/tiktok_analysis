package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyFilterRestoreOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0U79, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U79 implements C0U7A {
    public static final C0U79 LIZ = new C0U79();
    public static AnonymousClass0956 LIZIZ;

    public final void LIZ(DataChannel dataChannel) {
        AnonymousClass0956 anonymousClass0956 = LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZIZ = null;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public static final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, boolean z) {
        if (TestEnableEffectSetting.INSTANCE.disable()) {
            return;
        }
        C770170UJb.LIZJ("LiveEffectRestoreManager");
        C770170UJb.LIZLLL = "restore";
        C770170UJb.LIZIZ("try to restore beauty effect");
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = (LiveSmallItemBeautyViewModel) new ViewModelProvider(C0UPT.LL, new C0U76()).get(LiveSmallItemBeautyViewModel.class);
        ComposerFilterViewModel composerFilterViewModel = (ComposerFilterViewModel) C0U61.LIZ(new C761460Ttw()).get(ComposerFilterViewModel.class);
        if (z) {
            if (LiveBeautyFilterRestoreOpt.INSTANCE.enable() && LiveBeautySwitchSetting.INSTANCE.inExperiment() && C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJIII.LIZIZ())) {
                C0UA1.LIZ().LJJLIIIJJI();
            }
            LIZIZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C510901yt(liveSmallItemBeautyViewModel, dataChannel, composerFilterViewModel, null), 3);
            C0UC4.LJIJJ.LIZIZ("data_request_time");
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C508701yX(liveSmallItemBeautyViewModel, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C511001yu(composerFilterViewModel, null), 3);
        } else {
            C767120U7i c767120U7i = C767120U7i.LIZ;
            C767120U7i.LIZJ("LiveEffectRestoreManager#logRestoreComposerFilter", false);
            C767120U7i.LJI(dataChannel, "LiveEffectRestoreManager#logRestoreComposerFilter", true, true);
            C767120U7i.LJ(dataChannel, "LiveEffectRestoreManager#logRestoreComposerFilter", true, true);
            C767120U7i.LIZ("LiveEffectRestoreManager#logRestoreComposerFilter");
        }
        if (LiveBeautyFilterRestoreOpt.INSTANCE.disable() || !z) {
            C20441214yg.LIZIZ("EffectMonitor#refreshBroadcast", "");
            Iterator<T> it2 = C768430UCj.LIZIZ.values().iterator();
            while (it2.hasNext()) {
                ((C0UC9) it2.next()).LIZJ = System.currentTimeMillis();
            }
            long jNanoTime = System.nanoTime();
            C0UA1.LIZ().zr(false);
            C20441214yg.LIZIZ("EffectTimer#tryRefreshRestore", String.valueOf(System.nanoTime() - jNanoTime));
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        c0uc4.LIZJ(false);
        C0UC4.LJJIJ(dataChannel);
        C0UC4.LJJIIZI(dataChannel);
        c0uc4.LIZ();
    }
}
