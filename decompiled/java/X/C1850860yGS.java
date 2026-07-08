package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.livesdk.model.message.GameTricksGiftInfo;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0yGS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850860yGS implements InterfaceC2176981AHw {
    public final DataChannel LL;
    public C1850830yGP LLILLJJLI;

    @Override // X.InterfaceC2176981AHw
    public final void b(GameTricksGiftInfo gameTricksGiftInfo) {
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLFII() {
        C1850830yGP c1850830yGP = this.LLILLJJLI;
        if (c1850830yGP != null) {
            c1850830yGP.LLFII();
        }
    }

    public C1850860yGS(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.InterfaceC2176981AHw
    public final void LJLI(long j) {
        C1850830yGP c1850830yGP = this.LLILLJJLI;
        if (c1850830yGP != null) {
            c1850830yGP.LJLI(j);
        }
    }

    @Override // X.InterfaceC2176981AHw
    public final void onFinish(boolean z) {
        C011V c011v;
        long jLJJLIIIJ;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            c011v = C011V.BROADCAST;
        } else {
            c011v = C011V.AUDIENCE;
        }
        if (z) {
            IBillboardService iBillboardService = (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel2);
            } else {
                jLJJLIIIJ = 0;
            }
            iBillboardService.rN2("vertical_fixed", c011v, Long.valueOf(jLJJLIIIJ));
        }
        C1850830yGP c1850830yGP = this.LLILLJJLI;
        if (c1850830yGP != null) {
            c1850830yGP.onFinish(z);
        }
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLIZLLLIL(ViewerPicksInfo viewerPicksInfo, boolean z) {
        C1850830yGP c1850830yGP = this.LLILLJJLI;
        if (c1850830yGP != null) {
            c1850830yGP.LLIZLLLIL(viewerPicksInfo, z);
        }
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLFF(final ViewerPicksInfo viewerPicksInfo, final boolean z, final DataChannel dataChannel, final Long l) {
        C011V c011v;
        long jLJJLIIIJ;
        AnonymousClass0151 anonymousClass0151 = new AnonymousClass0151() { // from class: X.0yGR
            @Override // X.AnonymousClass0151
            public final void LIZJ() {
            }

            @Override // X.AnonymousClass0151
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.AnonymousClass0151
            public final void LJFF() {
            }

            @Override // X.AnonymousClass0151
            public final void getBizType() {
            }

            @Override // X.AnonymousClass0151
            public final void getBoardId() {
            }

            @Override // X.AnonymousClass0151
            public final void onAttach() {
            }

            @Override // X.AnonymousClass0151
            public final void onDetach() {
            }

            @Override // X.AnonymousClass0151
            public final void onHide() {
            }

            @Override // X.AnonymousClass0151
            public final void onShow() {
            }

            @Override // X.AnonymousClass0151
            public final boolean LJ() {
                return viewerPicksInfo.giftPickList.size() >= 2;
            }

            @Override // X.AnonymousClass0151
            public final void LJJJJLI() {
                C19563611gQ c19563611gQ;
                C1850830yGP c1850830yGP = this.LIZ.LLILLJJLI;
                if (c1850830yGP == null || (c19563611gQ = c1850830yGP.LLILLJJLI) == null) {
                    return;
                }
                c19563611gQ.scrollToPosition(0);
            }

            @Override // X.AnonymousClass0151
            public final View LIZ(Context context) {
                C1850830yGP c1850830yGP = this.LIZ.LLILLJJLI;
                if (c1850830yGP != null) {
                    return c1850830yGP;
                }
                C1850830yGP c1850830yGP2 = new C1850830yGP(context);
                this.LIZ.LLILLJJLI = c1850830yGP2;
                c1850830yGP2.LLFF(viewerPicksInfo, z, dataChannel, l);
                return c1850830yGP2;
            }

            @Override // X.AnonymousClass0151
            public final void LIZIZ(boolean z2) {
                C1850830yGP c1850830yGP = this.LIZ.LLILLJJLI;
                if (c1850830yGP != null) {
                    c1850830yGP.LIZIZ(z2);
                }
            }
        };
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            c011v = C011V.BROADCAST;
        } else {
            c011v = C011V.AUDIENCE;
        }
        IBillboardService iBillboardService = (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        iBillboardService.kF1(anonymousClass0151, c011v, Long.valueOf(jLJJLIIIJ), null);
    }
}
