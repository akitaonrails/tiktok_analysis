package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookUEOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookNonMultiGuestEnableSetting;
import kotlin.Pair;

/* JADX INFO: renamed from: X.14pj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20385714pj {
    public static final int LIZ(PlaybookAnchorViewModel playbookAnchorViewModel) {
        C20384514pX c20384514pX;
        if (playbookAnchorViewModel != null && (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) != null) {
            return c20384514pX.LJJIJLIJ();
        }
        return 2;
    }

    public static final int LIZIZ(PlaybookAnchorViewModel playbookAnchorViewModel) {
        EnumC20429314wl enumC20429314wl;
        if (!PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && !MultiGuestPlaybookUEOptSetting.INSTANCE.isEnable()) {
            return 0;
        }
        if (playbookAnchorViewModel != null) {
            enumC20429314wl = playbookAnchorViewModel.LLIZ;
        } else {
            enumC20429314wl = null;
        }
        if (enumC20429314wl == EnumC20429314wl.MULTI_GUEST) {
            return playbookAnchorViewModel.MQ2(2);
        }
        if (playbookAnchorViewModel == null) {
            return 0;
        }
        return playbookAnchorViewModel.MQ2(playbookAnchorViewModel.LLJJJ);
    }

    public static final Pair<Integer, Integer> LIZJ(int i) {
        return new Pair<>(Integer.valueOf(i & 255), Integer.valueOf((i >> 8) & 255));
    }
}
