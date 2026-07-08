package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;

/* JADX INFO: renamed from: X.0nXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1438680nXe implements InterfaceC569410MUx {
    public final /* synthetic */ BaseShortVideoContext LIZ;

    public /* synthetic */ C1438680nXe(BaseShortVideoContext baseShortVideoContext) {
        this.LIZ = baseShortVideoContext;
    }

    @Override // X.InterfaceC569410MUx
    public final void LIZ(EnumC2273951DzV enumC2273951DzV, String str) {
        BaseShortVideoContext baseShortVideoContext = this.LIZ;
        switch (C2273961DzW.LIZ[enumC2273951DzV.ordinal()]) {
            case 1:
                baseShortVideoContext.setMainBusinessData(str);
                break;
            case 2:
                baseShortVideoContext.socialData = str;
                break;
            case 3:
                baseShortVideoContext.commerceData = str;
                break;
            case 4:
                baseShortVideoContext.ugData = str;
                break;
            case 5:
                baseShortVideoContext.techData = str;
                break;
            case 6:
                baseShortVideoContext.globalData = str;
                break;
        }
    }
}
