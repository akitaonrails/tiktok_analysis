package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1BB5, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BB5 extends AbstractC19907912ur implements InterfaceC19900612tg {
    public static final C1BB5 zzb;
    public int zzd;
    public int zze;

    public static /* synthetic */ void LJIL(C1BB5 c1bb5, int i) {
        c1bb5.zze = i - 1;
        c1bb5.zzd |= 1;
    }

    static {
        C1BB5 c1bb5 = new C1BB5();
        zzb = c1bb5;
        AbstractC19907912ur.LJI(C1BB5.class, c1bb5);
    }

    public static C1BBH LJIJJ() {
        return (C1BBH) zzb.LJIIJJI();
    }

    @Override // X.AbstractC19907912ur
    public final Object LJIIJ(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            int i3 = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new C1BBH(i3);
                }
                return new C1BB5();
            }
            return new C19911412vQ(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", new InterfaceC19912612vc() { // from class: X.1BBR
                @Override // X.InterfaceC19912612vc
                public final boolean LJII(int i4) {
                    switch (i4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        case 19:
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            return true;
                        case 14:
                        case 15:
                        case 16:
                        default:
                            return false;
                    }
                }
            }});
        }
        return (byte) 1;
    }
}
