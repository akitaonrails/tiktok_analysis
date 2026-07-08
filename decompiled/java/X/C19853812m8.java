package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.12m8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19853812m8 {
    public static String LIZ(AbstractC19851412lk abstractC19851412lk) {
        StringBuilder sb = new StringBuilder(abstractC19851412lk.zzd());
        for (int i = 0; i < abstractC19851412lk.zzd(); i++) {
            byte bZza = abstractC19851412lk.zza(i);
            if (bZza != 34) {
                if (bZza != 39) {
                    if (bZza != 92) {
                        switch (bZza) {
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
                                if (bZza >= 32 && bZza <= 126) {
                                    sb.append((char) bZza);
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((bZza >>> 6) & 3) + 48));
                                    sb.append((char) (((bZza >>> 3) & 7) + 48));
                                    sb.append((char) ((bZza & 7) + 48));
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
