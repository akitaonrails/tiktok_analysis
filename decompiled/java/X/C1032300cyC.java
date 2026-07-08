package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.Video;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032300cyC implements InterfaceC1032280cyA, InterfaceC1032080cxq, InterfaceC1032090cxr {
    public InterfaceC1032290cyB LIZ;
    public FrameLayout LIZIZ;
    public InterfaceC1032400cyM LIZJ;
    public InterfaceC1032120cxu LIZLLL;

    @Override // X.InterfaceC1032280cyA
    public final void LIZ() {
        InterfaceC1032290cyB interfaceC1032290cyB = this.LIZ;
        if (interfaceC1032290cyB != null) {
            interfaceC1032290cyB.destroy();
        }
    }

    public final void LJFF() {
        GmtRewardAdModel rewardAdModel;
        Video video;
        InterfaceC1032330cyF hostUtils;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LIZLLL;
        if (interfaceC1032120cxu == null || (rewardAdModel = interfaceC1032120cxu.getRewardAdModel()) == null || (video = rewardAdModel.video) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("videoInfo.width = ");
        sbLIZ.append(video.getWidth());
        sbLIZ.append(",videoInfo.height = ");
        sbLIZ.append(video.getHeight());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1032120cxu interfaceC1032120cxu2 = this.LIZLLL;
        if (interfaceC1032120cxu2 == null || (hostUtils = interfaceC1032120cxu2.getHostUtils()) == null) {
            return;
        }
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        Context context = frameLayout.getContext();
        FrameLayout frameLayout2 = this.LIZIZ;
        hostUtils.LIZJ(video.getWidth(), video.getHeight(), context, frameLayout2 != null ? frameLayout2 : null);
    }

    @Override // X.InterfaceC1032080cxq
    public final void LJII() {
        InterfaceC1032400cyM interfaceC1032400cyM = this.LIZJ;
        if (interfaceC1032400cyM != null) {
            interfaceC1032400cyM.N();
        }
        try {
            LJFF();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1032080cxq
    public final void LJJJJJL() {
        InterfaceC1032400cyM interfaceC1032400cyM;
        InterfaceC1032290cyB interfaceC1032290cyB = this.LIZ;
        if (interfaceC1032290cyB == null || !interfaceC1032290cyB.isPlaying() || (interfaceC1032400cyM = this.LIZJ) == null) {
            return;
        }
        interfaceC1032400cyM.M();
    }

    @Override // X.InterfaceC1032080cxq
    public final void LLIIII() {
        InterfaceC1032400cyM interfaceC1032400cyM = this.LIZJ;
        if (interfaceC1032400cyM != null) {
            interfaceC1032400cyM.l3();
        }
    }

    @Override // X.InterfaceC1032090cxr
    public final FrameLayout getPlayViewContainer() {
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    @Override // X.InterfaceC1032280cyA
    public final void onPause() {
        InterfaceC1032290cyB interfaceC1032290cyB;
        InterfaceC1032290cyB interfaceC1032290cyB2 = this.LIZ;
        if (interfaceC1032290cyB2 == null || !interfaceC1032290cyB2.isPlaying() || (interfaceC1032290cyB = this.LIZ) == null) {
            return;
        }
        interfaceC1032290cyB.pausePlay();
    }

    @Override // X.InterfaceC1032280cyA
    public final void onResume() {
        InterfaceC1032290cyB interfaceC1032290cyB;
        InterfaceC1032290cyB interfaceC1032290cyB2 = this.LIZ;
        if (interfaceC1032290cyB2 == null || interfaceC1032290cyB2.isPlaying() || (interfaceC1032290cyB = this.LIZ) == null) {
            return;
        }
        interfaceC1032290cyB.LJIILLIIL();
    }

    @Override // X.InterfaceC1032280cyA
    public final InterfaceC1032290cyB LIZLLL() {
        return this.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0cyS] */
    @Override // X.InterfaceC1032280cyA
    public final void LIZJ(InterfaceC1032400cyM interfaceC1032400cyM) {
        this.LIZJ = interfaceC1032400cyM;
        InterfaceC1032290cyB interfaceC1032290cyB = this.LIZ;
        if (interfaceC1032290cyB != null) {
            interfaceC1032290cyB.LIZJ(this);
        }
        InterfaceC1032120cxu interfaceC1032120cxu = this.LIZLLL;
        AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 387);
        ?? r1 = new Object() { // from class: X.0cyS
            public final void LIZ() {
                InterfaceC1032400cyM interfaceC1032400cyM2 = this.LIZ.LIZJ;
                if (interfaceC1032400cyM2 != null) {
                    interfaceC1032400cyM2.LIZJ();
                }
            }
        };
        if (interfaceC1032120cxu != null && interfaceC1032120cxu.getRewardAdModel() != null) {
            GmtRewardAdModel rewardAdModel = interfaceC1032120cxu.getRewardAdModel();
            if (rewardAdModel != null) {
                awS595S0100000_16.invoke(rewardAdModel);
                return;
            }
            return;
        }
        r1.LIZ();
    }

    @Override // X.InterfaceC1032280cyA
    public final void LJ(GmtRewardAdModel gmtRewardAdModel) {
        InterfaceC1032290cyB interfaceC1032290cyB = this.LIZ;
        if (interfaceC1032290cyB != null) {
            interfaceC1032290cyB.LIZLLL(gmtRewardAdModel.aid, gmtRewardAdModel.video, C1032730cyt.LIZ);
        }
    }

    @Override // X.InterfaceC1032080cxq
    public final void LJLLI(String str) {
        InterfaceC1032400cyM interfaceC1032400cyM = this.LIZJ;
        if (interfaceC1032400cyM != null) {
            interfaceC1032400cyM.H2(str);
        }
    }

    @Override // X.InterfaceC1032280cyA
    public final void LIZIZ(FrameLayout frameLayout, InterfaceC1032120cxu interfaceC1032120cxu) {
        InterfaceC1032290cyB customAdVideo;
        this.LIZIZ = frameLayout;
        this.LIZLLL = interfaceC1032120cxu;
        if (interfaceC1032120cxu != null) {
            customAdVideo = interfaceC1032120cxu.getCustomAdVideo();
        } else {
            customAdVideo = null;
        }
        this.LIZ = customAdVideo;
        if (customAdVideo != null) {
            customAdVideo.LIZ(this);
        }
    }

    @Override // X.InterfaceC1032080cxq
    public final void onPlayCompleted(String str, int i) {
        InterfaceC1032400cyM interfaceC1032400cyM = this.LIZJ;
        if (interfaceC1032400cyM != null) {
            interfaceC1032400cyM.h0();
        }
    }

    @Override // X.InterfaceC1032080cxq
    public final void onPlayProgressChange(String str, long j, long j2) {
        InterfaceC1032400cyM interfaceC1032400cyM = this.LIZJ;
        if (interfaceC1032400cyM != null) {
            interfaceC1032400cyM.onPlayProgressChange(str, j, j2);
        }
    }
}
