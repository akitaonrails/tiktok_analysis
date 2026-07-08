package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0nfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443770nfr implements InterfaceC569420MUy {
    public final /* synthetic */ ShortVideoContext LIZ;

    public C1443770nfr(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    @Override // X.InterfaceC569420MUy
    public final String LIZ(EnumC2273951DzV enumC2273951DzV) {
        switch (C2273961DzW.LIZ[enumC2273951DzV.ordinal()]) {
            case 1:
                return this.LIZ.extraSession.mainBusinessData;
            case 2:
                return this.LIZ.extraSession.socialData;
            case 3:
                return this.LIZ.extraSession.commerceData;
            case 4:
                return this.LIZ.extraSession.ugData;
            case 5:
                return this.LIZ.extraSession.techData;
            case 6:
                return this.LIZ.extraSession.globalData;
            default:
                return null;
        }
    }
}
