package X;

import Y.ACallableS420S0100000_13;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0VhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804530VhD implements InterfaceC1474770oTr {
    public volatile EnumC804620VhM LIZ = EnumC804620VhM.UNKNOWN;

    @Override // X.InterfaceC1474770oTr
    public final String key() {
        return "network_type";
    }

    @Override // X.InterfaceC1474770oTr
    public final String LIZ(String str) {
        C15O7.LIZJ(new ACallableS420S0100000_13(this, 12));
        switch (C804520VhC.LIZ[this.LIZ.ordinal()]) {
            case 1:
                return "none";
            case 2:
            case 3:
                return "2g";
            case 4:
            case 5:
            case 6:
                return "3g";
            case 7:
                return "4g";
            case 8:
                return "5g";
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "wifi";
            default:
                return "unknown";
        }
    }
}
