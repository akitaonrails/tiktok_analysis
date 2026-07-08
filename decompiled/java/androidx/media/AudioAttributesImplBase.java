package androidx.media;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL = -1;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZLLL)});
    }

    public final String toString() {
        String strLIZIZ;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.LIZLLL != -1) {
            sb.append(" stream=");
            sb.append(this.LIZLLL);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.LIZ;
        int i2 = AudioAttributesCompat.LIZIZ;
        switch (i) {
            case 0:
                strLIZIZ = "USAGE_UNKNOWN";
                break;
            case 1:
                strLIZIZ = "USAGE_MEDIA";
                break;
            case 2:
                strLIZIZ = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strLIZIZ = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strLIZIZ = "USAGE_ALARM";
                break;
            case 5:
                strLIZIZ = "USAGE_NOTIFICATION";
                break;
            case 6:
                strLIZIZ = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strLIZIZ = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strLIZIZ = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                strLIZIZ = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                strLIZIZ = "USAGE_NOTIFICATION_EVENT";
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                strLIZIZ = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                strLIZIZ = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                strLIZIZ = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strLIZIZ = "USAGE_GAME";
                break;
            case 15:
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown usage ");
                sbLIZ.append(i);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                break;
            case 16:
                strLIZIZ = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strLIZIZ);
        sb.append(" content=");
        sb.append(this.LIZIZ);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.LIZJ).toUpperCase());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.media.AudioAttributesImplBase
            r7 = 0
            if (r0 != 0) goto L6
            return r7
        L6:
            androidx.media.AudioAttributesImplBase r9 = (androidx.media.AudioAttributesImplBase) r9
            int r1 = r8.LIZIZ
            int r0 = r9.LIZIZ
            if (r1 != r0) goto L2f
            int r6 = r8.LIZJ
            int r5 = r9.LIZJ
            int r4 = r9.LIZLLL
            r3 = 1
            r2 = -1
            r1 = 6
            r0 = 7
            if (r4 == r2) goto L30
            if (r4 == r1) goto L3e
            if (r4 != r0) goto L20
        L1e:
            r5 = r5 | 1
        L20:
            r0 = r5 & 273(0x111, float:3.83E-43)
            if (r6 != r0) goto L2f
            int r1 = r8.LIZ
            int r0 = r9.LIZ
            if (r1 != r0) goto L2f
            int r0 = r8.LIZLLL
            if (r0 != r4) goto L2f
            r7 = 1
        L2f:
            return r7
        L30:
            int r2 = r9.LIZ
            int r0 = androidx.media.AudioAttributesCompat.LIZIZ
            r0 = r5 & 1
            if (r0 == r3) goto L1e
            r1 = r5 & 4
            r0 = 4
            if (r1 == r0) goto L3e
            goto L20
        L3e:
            r5 = r5 | 4
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.AudioAttributesImplBase.equals(java.lang.Object):boolean");
    }
}
