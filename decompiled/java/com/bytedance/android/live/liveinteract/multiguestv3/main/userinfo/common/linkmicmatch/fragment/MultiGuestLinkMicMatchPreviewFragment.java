package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment;

import X.AbstractC923750a97;
import X.AbstractC929640aIc;
import X.C01GW;
import X.C19EH;
import X.C452501pT;
import X.C472820IgS;
import X.C748880TZe;
import X.C781520UlC;
import X.C927170aEd;
import X.C929860aIy;
import X.C929960aJ8;
import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DialogPageChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRecommendRoomAb;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestLinkMicMatchPreviewFragment extends BaseMultiGuestLinkMicMatchFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzogLTclJyk8ZiHELIOSYjJCI8JmsgICE4JSwvJC4nKy1iLz0yLygpJzt9BTAgPSYUPSA/PQM6Ji4BICweKTEvIR8hLTMlLDgVOiQrJCo9PA==";
    public boolean needReturn;
    public final C01GW previewFragment$delegate = C452501pT.LIZIZ(new AwS559S0100000_15(this, 384));
    public static final C929960aJ8 Companion = new Object() { // from class: X.0aJ8
    };
    public static final int $stable = 8;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final int getLayoutId() {
        return R.layout.g9j;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void kS() {
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII())) ? new FrameLayout.LayoutParams(-1, -2) : super.getCustomLayoutParams();
    }

    public final MultiGuestPreviewFragment mS() {
        return (MultiGuestPreviewFragment) this.previewFragment$delegate.getValue();
    }

    public final void nS() {
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        if (!this.needReturn || (dataChannel = this.dataChannel) == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        DataChannel dataChannel2 = C927170aEd.LIZ;
        WeakReference<AbstractC923750a97> weakReference = this.guestPresenter;
        AbstractC929640aIc abstractC929640aIc = this.applyPresenter;
        MultiGuestRecommendRoomAb multiGuestRecommendRoomAb = MultiGuestRecommendRoomAb.INSTANCE;
        if (multiGuestRecommendRoomAb.isEnable()) {
            C472820IgS.LIZ("showMatchDialog");
            C927170aEd.LJ = true;
            if (multiGuestRecommendRoomAb.getAbResult() == 1) {
                MultiGuestLinkMicMatchFragmentA.Companion.getClass();
                MultiGuestLinkMicMatchFragmentA multiGuestLinkMicMatchFragmentA = new MultiGuestLinkMicMatchFragmentA();
                multiGuestLinkMicMatchFragmentA.guestPresenter = weakReference;
                multiGuestLinkMicMatchFragmentA.applyPresenter = abstractC929640aIc;
                C927170aEd.LJIIJ = multiGuestLinkMicMatchFragmentA;
                C929860aIy.LIZ.LJIILJJIL(fragmentManager, C927170aEd.LJIIJ);
            } else if (multiGuestRecommendRoomAb.getAbResult() == 2) {
                MultiGuestLinkMicMatchFragmentB.Companion.getClass();
                MultiGuestLinkMicMatchFragmentB multiGuestLinkMicMatchFragmentB = new MultiGuestLinkMicMatchFragmentB();
                multiGuestLinkMicMatchFragmentB.guestPresenter = weakReference;
                multiGuestLinkMicMatchFragmentB.applyPresenter = abstractC929640aIc;
                C927170aEd.LJIIJ = multiGuestLinkMicMatchFragmentB;
                C929860aIy.LIZ.LJIILJJIL(fragmentManager, C927170aEd.LJIIJ);
            }
        } else {
            C472820IgS.LIZ("not in ab group!");
        }
        this.needReturn = false;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void WR(View view) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, DialogPageChannel.class, new AwS594S0100000_15(this, 459));
        }
        try {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.i64, mS());
            c19ehLJIIJ.LJIIIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        nS();
    }
}
