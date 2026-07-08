package X;

import Y.ARunnableS116S0100000_16;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.AnolePlayerVideoDataModel;
import java.util.List;
import kotlin.jvm.internal.AwS50S0100100_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018330cbf implements InterfaceC1013520cTu {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C259800zU<List<String>> LIZIZ;
    public final /* synthetic */ C1018320cbe LIZJ;

    @Override // X.InterfaceC1013520cTu
    public final void LIZ(int i) {
    }

    @Override // X.InterfaceC1013520cTu
    public final void LIZJ(int i) {
    }

    @Override // X.InterfaceC1013520cTu
    public final void LIZIZ() {
        C1018320cbe c1018320cbe = this.LIZJ.LLLIIII.get();
        if (c1018320cbe != null) {
            C1018320cbe c1018320cbe2 = this.LIZJ;
            C1013610cU3 c1013610cU3 = c1018320cbe.LLJLIL;
            if (c1013610cU3 != null) {
                c1013610cU3.LJI();
            }
            C786410Ut5.LJJJJIZL(M4());
            View view = c1018320cbe.LLJJIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            FrameLayout frameLayout = c1018320cbe.LLLF;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            FrameLayout frameLayout2 = c1018320cbe.LLLFF;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
            c1018320cbe2.LJJIIJZLJL(true);
            C1022620cia.LIZ("AnolePlayerComponent", "playModule onOver");
        }
    }

    public final List<String> LJFF() {
        return this.LIZIZ.element;
    }

    @Override // X.InterfaceC1013520cTu
    public final FrameLayout M4() {
        FrameLayout frameLayout = this.LIZJ.LLJLILLLLZIIL;
        return frameLayout == null ? new FrameLayout(this.LIZJ.LLILZ) : frameLayout;
    }

    @Override // X.InterfaceC1013520cTu
    public final void onStart() {
        TuxIconView tuxIconView;
        C1018340cbg c1018340cbgLJJIIJ;
        C1018320cbe c1018320cbe;
        C1018340cbg c1018340cbgLJJIIJ2;
        C1018320cbe c1018320cbe2 = this.LIZJ.LLLIIII.get();
        if (c1018320cbe2 != null) {
            C1018320cbe c1018320cbe3 = this.LIZJ;
            View view = c1018320cbe2.LLJJIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII = c1018320cbe3.LJJIII();
            if (anolePlayerVideoDataModelLJJIII != null && Intrinsics.LJFF(anolePlayerVideoDataModelLJJIII.needMask, Boolean.TRUE)) {
                FrameLayout frameLayout = c1018320cbe2.LLLF;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                FrameLayout frameLayout2 = c1018320cbe2.LLLFF;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(0, frameLayout2);
                }
            }
            C1022620cia.LIZ("AnolePlayerComponent", "playModule start");
            c1018320cbe3.LJJI();
            if (!c1018320cbe3.LJJIJ() && (c1018320cbe = c1018320cbe3.LLLIIII.get()) != null && (c1018340cbgLJJIIJ2 = c1018320cbe.LJJIIJ()) != null) {
                c1018340cbgLJJIIJ2.LIZJ(c1018320cbe3.LLL);
            }
            C1018320cbe c1018320cbe4 = c1018320cbe3.LLLIIII.get();
            if (c1018320cbe4 != null && (c1018340cbgLJJIIJ = c1018320cbe4.LJJIIJ()) != null && c1018340cbgLJJIIJ.LIZIZ()) {
                C1018400cbm c1018400cbmLIZ = c1018340cbgLJJIIJ.LIZ();
                c1018400cbmLIZ.logAd(c1018400cbmLIZ.LIZIZ, new AwS595S0100000_16(c1018400cbmLIZ, 56));
            }
            ILikeEffectService iLikeEffectService = (ILikeEffectService) c1018320cbe2.LLLII.getValue();
            if (iLikeEffectService != null) {
                iLikeEffectService.LJIIZILJ(true);
            }
            AnolePlayerVideoDataModel anolePlayerVideoDataModelLJJIII2 = c1018320cbe3.LJJIII();
            if (anolePlayerVideoDataModelLJJIII2 == null || anolePlayerVideoDataModelLJJIII2.closeInfo == null || (tuxIconView = c1018320cbe3.LLJLLL) == null) {
                return;
            }
            HandlerHook.viewPost(tuxIconView, new ARunnableS116S0100000_16(c1018320cbe3, 8));
        }
    }

    @Override // X.InterfaceC1013520cTu
    public final void LIZLLL(Integer num) {
        C1018320cbe c1018320cbe = this.LIZJ.LLLIIII.get();
        if (c1018320cbe != null) {
            C1018320cbe c1018320cbe2 = this.LIZJ;
            View view = c1018320cbe.LLJJIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            FrameLayout frameLayout = c1018320cbe.LLLF;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            FrameLayout frameLayout2 = c1018320cbe.LLLFF;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
            c1018320cbe.LJJIIJZLJL(true);
            C1022620cia.LIZ("AnolePlayerComponent", "playModule onFailed");
            c1018320cbe2.LJJIIZ(String.valueOf(num));
            ILikeEffectService iLikeEffectService = (ILikeEffectService) c1018320cbe.LLLII.getValue();
            if (iLikeEffectService != null) {
                iLikeEffectService.LJIIZILJ(false);
            }
        }
    }

    @Override // X.InterfaceC1013520cTu
    public final void LJ(long j) {
        C1018320cbe c1018320cbe;
        C1018340cbg c1018340cbgLJJIIJ;
        C1018320cbe c1018320cbe2 = this.LIZJ;
        if (!c1018320cbe2.LJJIJ() && (c1018320cbe = c1018320cbe2.LLLIIII.get()) != null && (c1018340cbgLJJIIJ = c1018320cbe.LJJIIJ()) != null) {
            Aweme aweme = c1018320cbe2.LLL;
            if (c1018340cbgLJJIIJ.LIZIZ()) {
                C1018400cbm c1018400cbmLIZ = c1018340cbgLJJIIJ.LIZ();
                c1018400cbmLIZ.logAd(c1018400cbmLIZ.LJI, new AwS50S0100100_16(j, c1018400cbmLIZ, 3));
            } else {
                ((C1018380cbk) c1018340cbgLJJIIJ.LJ.getValue()).LJJIIZ(j, c1018340cbgLJJIIJ.LIZLLL, aweme);
            }
        }
        this.LIZJ.LLLI = -1;
    }

    public C1018330cbf(String str, C259800zU<List<String>> c259800zU, C1018320cbe c1018320cbe) {
        this.LIZ = str;
        this.LIZIZ = c259800zU;
        this.LIZJ = c1018320cbe;
    }
}
