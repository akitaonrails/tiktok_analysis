package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0nfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443750nfp implements InterfaceC569410MUx {
    public final /* synthetic */ ShortVideoContext LIZ;

    public C1443750nfp(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.InterfaceC569410MUx
    public final void LIZ(EnumC2273951DzV enumC2273951DzV, String str) {
        switch (C2273961DzW.LIZ[enumC2273951DzV.ordinal()]) {
            case 1:
                this.LIZ.extraSession.mainBusinessData = str;
                break;
            case 2:
                this.LIZ.extraSession.socialData = str;
                break;
            case 3:
                this.LIZ.extraSession.commerceData = str;
                break;
            case 4:
                this.LIZ.extraSession.ugData = str;
                break;
            case 5:
                this.LIZ.extraSession.techData = str;
                break;
            case 6:
                this.LIZ.extraSession.globalData = str;
                break;
        }
    }
}
