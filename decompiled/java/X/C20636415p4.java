package X;

import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyframePanelFragment;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.List;

/* JADX INFO: renamed from: X.15p4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20636415p4 {
    public static boolean LIZ(Context context, Aweme aweme, List list, EnumC436120H8g enumC436120H8g, VideoEventDispatchViewModel videoEventDispatchViewModel, VideoViewModel videoViewModel, IPlayerComponentAbility iPlayerComponentAbility, final VideoShrinkAbility videoShrinkAbility) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return false;
        }
        SearchDetailKeyframePanelFragment searchDetailKeyframePanelFragment = new SearchDetailKeyframePanelFragment(0);
        searchDetailKeyframePanelFragment.LLILLJJLI = aweme;
        searchDetailKeyframePanelFragment.LLILLL = list;
        searchDetailKeyframePanelFragment.LLILZLL = videoEventDispatchViewModel;
        searchDetailKeyframePanelFragment.LLIZ = videoViewModel;
        searchDetailKeyframePanelFragment.LLJ = iPlayerComponentAbility;
        searchDetailKeyframePanelFragment.LLILZ = enumC436120H8g;
        if (C301220BrM.LIZ()) {
            EnumC436120H8g.Companion.getClass();
            if (C436130H8h.LIZJ(enumC436120H8g)) {
                searchDetailKeyframePanelFragment.Bq(new InterfaceC1350190lEv() { // from class: X.0QEM
                    @Override // X.InterfaceC1350190lEv
                    public final Boolean LIZIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC1350190lEv
                    public final void LIZ(int i, int i2) {
                        VideoShrinkAbility videoShrinkAbility2 = videoShrinkAbility;
                        if (videoShrinkAbility2 != null) {
                            videoShrinkAbility2.t1(i, i2);
                        }
                    }
                }, new InterfaceC679410Qkt() { // from class: X.15p5
                    @Override // X.InterfaceC679410Qkt
                    public final void LLJLL(float f, float f2) {
                        VideoShrinkAbility videoShrinkAbility2 = videoShrinkAbility;
                        if (videoShrinkAbility2 != null) {
                            videoShrinkAbility2.ob(f, f2, new C20571215eY(false, 0, 1023));
                        }
                    }
                });
            }
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) C1389340mG4.LIZLLL()) * 0.73d)));
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJJIJI = searchDetailKeyframePanelFragment;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLILLJJLI = new C16HJ(searchDetailKeyframePanelFragment, 0);
        tuxSheet.LLJLILLLLZIIL = false;
        if (C301220BrM.LIZ()) {
            EnumC436120H8g.Companion.getClass();
            if (C436130H8h.LIZJ(enumC436120H8g)) {
                searchDetailKeyframePanelFragment.w2(tuxSheet);
                searchDetailKeyframePanelFragment.G2(3);
            }
        }
        tuxSheet.show(c19egLIZIZ.getSupportFragmentManager(), "SearchDetailKeyframe");
        return true;
    }
}
