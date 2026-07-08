package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0Uqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784920Uqg {
    public static final Long LIZ(DataChannel dataChannel) {
        ActivePlaybook activePlaybookLIZIZ;
        Playbook playbook;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = LIZIZ(dataChannel);
        if (playbookAnchorServiceV2LIZIZ != null && (activePlaybookLIZIZ = playbookAnchorServiceV2LIZIZ.LIZIZ()) != null && (playbook = activePlaybookLIZIZ.playbook) != null) {
            return Long.valueOf(playbook.playbookId);
        }
        return null;
    }

    public static final PlaybookAnchorServiceV2 LIZIZ(DataChannel dataChannel) {
        C784930Uqh c784930Uqh = (C784930Uqh) dataChannel.gg0(PlaybookAnchorServiceV2Channel.class);
        if (c784930Uqh != null) {
            return c784930Uqh.LIZ;
        }
        return null;
    }

    public static final Fragment LIZJ(FragmentManager fragmentManager) {
        Fragment fragmentLIZJ;
        List<Fragment> listLJJLIIIJL = fragmentManager.LJJLIIIJL();
        int size = listLJJLIIIJL.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            Fragment fragment = (Fragment) ListProtector.get(listLJJLIIIJL, size);
            if (fragment.isVisible()) {
                if (LIZIZ(C0IJR.LIZ(ViewModelProviders.of(fragment), fragment)) == null && (fragmentLIZJ = LIZJ(fragment.getChildFragmentManager())) != null) {
                    return fragmentLIZJ;
                }
                return fragment;
            }
            if (i >= 0) {
                size = i;
            } else {
                return null;
            }
        }
    }
}
