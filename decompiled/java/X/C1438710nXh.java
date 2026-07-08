package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0nXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438710nXh {
    public static final C1438740nXk LIZ = new InterfaceC569420MUy() { // from class: X.0nXk
        @Override // X.InterfaceC569420MUy
        public final String LIZ(EnumC2273951DzV enumC2273951DzV) {
            return null;
        }
    };
    public static final C1438750nXl LIZIZ = new InterfaceC569410MUx() { // from class: X.0nXl
        @Override // X.InterfaceC569410MUx
        public final void LIZ(EnumC2273951DzV enumC2273951DzV, String str) {
        }
    };

    public static InterfaceC569410MUx LIZ(ShortVideoContext shortVideoContext) {
        return new C1443750nfp(shortVideoContext);
    }

    public static InterfaceC569420MUy LIZIZ(final BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null) {
            return LIZ;
        }
        return new InterfaceC569420MUy() { // from class: X.0nXg
            @Override // X.InterfaceC569420MUy
            public final String LIZ(EnumC2273951DzV enumC2273951DzV) {
                BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
                switch (C2273961DzW.LIZ[enumC2273951DzV.ordinal()]) {
                    case 1:
                        return baseShortVideoContext2.getMainBusinessData();
                    case 2:
                        return baseShortVideoContext2.socialData;
                    case 3:
                        return baseShortVideoContext2.commerceData;
                    case 4:
                        return baseShortVideoContext2.ugData;
                    case 5:
                        return baseShortVideoContext2.techData;
                    case 6:
                        return baseShortVideoContext2.globalData;
                    default:
                        return null;
                }
            }
        };
    }
}
