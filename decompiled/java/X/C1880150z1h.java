package X;

import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.JumpLinkInfo;

/* JADX INFO: renamed from: X.0z1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880150z1h implements InterfaceC1880710z2b {
    public final GameCTAInfo LIZIZ;
    public final int LIZJ;

    @Override // X.InterfaceC1880710z2b
    public final C843930X8t LIZ(InterfaceC1881340z3c interfaceC1881340z3c) {
        String str;
        JumpLinkInfo jumpLinkInfo = new JumpLinkInfo();
        GameCTAInfo gameCTAInfo = this.LIZIZ;
        int i = gameCTAInfo.jumpLinkType;
        jumpLinkInfo.jumpLinkType = i;
        jumpLinkInfo.androidPackage = gameCTAInfo.androidPackage;
        if (i == 2) {
            str = gameCTAInfo.androidDeepLink;
        } else {
            str = gameCTAInfo.webJumpLink;
        }
        jumpLinkInfo.jumpLink = str;
        return new C1880160z1i(jumpLinkInfo, this.LIZJ).LIZ(interfaceC1881340z3c);
    }

    public C1880150z1h(GameCTAInfo gameCTAInfo, int i) {
        this.LIZIZ = gameCTAInfo;
        this.LIZJ = i;
    }
}
