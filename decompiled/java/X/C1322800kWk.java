package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0kWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322800kWk {
    public static String LIZ(AbstractC1322720kWc abstractC1322720kWc) {
        C1322790kWj c1322790kWj = new C1322790kWj(abstractC1322720kWc);
        StringBuilder sb = new StringBuilder(abstractC1322720kWc.size());
        for (int i = 0; i < c1322790kWj.LIZ.size(); i++) {
            byte bByteAt = c1322790kWj.LIZ.byteAt(i);
            if (bByteAt != 34) {
                if (bByteAt != 39) {
                    if (bByteAt != 92) {
                        switch (bByteAt) {
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
                                if (bByteAt >= 32 && bByteAt <= 126) {
                                    sb.append((char) bByteAt);
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                                    sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                                    sb.append((char) ((bByteAt & 7) + 48));
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
