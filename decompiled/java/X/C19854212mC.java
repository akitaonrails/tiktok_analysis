package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.12mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19854212mC {
    public static String LIZ(final AbstractC19922812xG abstractC19922812xG) {
        return LIZIZ(new InterfaceC19854412mE() { // from class: X.12mD
            @Override // X.InterfaceC19854412mE
            public final int size() {
                return abstractC19922812xG.size();
            }

            @Override // X.InterfaceC19854412mE
            public final byte LIZ(int i) {
                return abstractC19922812xG.byteAt(i);
            }
        });
    }

    public static String LIZIZ(InterfaceC19854412mE interfaceC19854412mE) {
        StringBuilder sb = new StringBuilder(interfaceC19854412mE.size());
        for (int i = 0; i < interfaceC19854412mE.size(); i++) {
            byte bLIZ = interfaceC19854412mE.LIZ(i);
            if (bLIZ != 34) {
                if (bLIZ != 39) {
                    if (bLIZ != 92) {
                        switch (bLIZ) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                sb.append("\\t");
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                sb.append("\\n");
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                sb.append("\\v");
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                sb.append("\\f");
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                sb.append("\\r");
                                break;
                            default:
                                if (bLIZ >= 32 && bLIZ <= 126) {
                                    sb.append((char) bLIZ);
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((bLIZ >>> 6) & 3) + 48));
                                    sb.append((char) (((bLIZ >>> 3) & 7) + 48));
                                    sb.append((char) ((bLIZ & 7) + 48));
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
