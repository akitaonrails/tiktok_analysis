package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13lF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20103113lF {
    public static final C20103213lG LJIIIIZZ = new ThreadLocal<SimpleDateFormat>() { // from class: X.13lG
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };
    public String LIZ;
    public String LIZIZ;
    public int LIZLLL;
    public List<String> LJ;
    public String LJFF;
    public Throwable LJII;
    public int LIZJ = 1;
    public long LJI = System.currentTimeMillis();

    public final String LIZ() {
        String str = this.LJFF;
        if (str != null && !str.isEmpty()) {
            return this.LJFF;
        }
        String str2 = this.LJFF;
        if (str2 == null) {
            return "";
        }
        str2.toString();
        return str2;
    }

    public final String toString() {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(this.LJI > 0 ? LJIIIIZZ.get().format(new Date(this.LJI)) : "--");
        sbLIZ.append("][");
        int i = this.LIZJ;
        String string = "";
        sbLIZ.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "ASSERT" : "ERROR" : "WARN" : "INFO" : "DEBUG" : "VERBOSE");
        sbLIZ.append("][");
        String str2 = this.LIZ;
        if (str2 != null) {
            str2.toString();
        } else {
            str2 = "";
        }
        sbLIZ.append(str2);
        sbLIZ.append("][");
        String str3 = this.LIZIZ;
        if (str3 != null) {
            str3.toString();
        } else {
            str3 = "";
        }
        sbLIZ.append(str3);
        sbLIZ.append("][");
        switch (this.LIZLLL) {
            case 1:
                str = "DEVICE_REGISTER";
                break;
            case 2:
                str = "ABTEST";
                break;
            case 3:
                str = "ALINK";
                break;
            case 4:
                str = "EVENT";
                break;
            case 5:
                str = "DATABASE";
                break;
            case 6:
                str = "EVENT_VERIFY";
                break;
            case 7:
                str = "VIEW_EXPOSURE";
                break;
            case 8:
                str = "MONITOR";
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                str = "USER_PROFILE";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                str = "PICKER";
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                str = "REQUEST";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                str = "EVENT_SAMPLING";
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                str = "EVENT_PRIORITY";
                break;
            case 14:
                str = "COMPRESS";
                break;
            case 15:
                str = "ONE_ID";
                break;
            default:
                str = LivePreviewCTASmartDisplayManager.DEFAULT;
                break;
        }
        sbLIZ.append(str);
        sbLIZ.append("][");
        List<String> list = this.LJ;
        if (list != null && list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < this.LJ.size(); i2++) {
                sb.append((String) ListProtector.get(this.LJ, i2));
                if (i2 < this.LJ.size() - 1) {
                    sb.append(",");
                }
            }
            string = sb.toString();
        }
        sbLIZ.append(string);
        sbLIZ.append("] ");
        sbLIZ.append(LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LJII == null) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("\nstacktrace: ");
        StringBuilder sb2 = new StringBuilder();
        for (Throwable cause = this.LJII; cause != null; cause = cause.getCause()) {
            sb2.append(cause.toString());
            for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                sb2.append("\n\tat ");
                sb2.append(stackTraceElement);
            }
        }
        sbLIZ2.append(sb2.toString());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
