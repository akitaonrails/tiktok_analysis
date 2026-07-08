package X;

import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;
import com.bytedance.android.livesdk.model.message.Contributor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0es1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105350es1 {
    public static final String LIZ(boolean z, long j, C1105460esC c1105460esC) {
        if (c1105460esC.LJFF != EnumC187400no.TOP_BUYER && z) {
            if (Intrinsics.LJFF(c1105460esC.LIZLLL, "")) {
                C1105510esH c1105510esHLIZ = C1105510esH.LIZ();
                c1105510esHLIZ.getClass();
                String strLIZJ = C1850730yGF.LIZJ(c1105460esC.LIZIZ);
                Locale locale = Locale.ENGLISH;
                String upperCase = strLIZJ.toUpperCase(locale);
                OnlineAudienceDisplayStrategySetting onlineAudienceDisplayStrategySetting = OnlineAudienceDisplayStrategySetting.INSTANCE;
                int i = onlineAudienceDisplayStrategySetting.getValue().displayNumberN;
                if (i <= 0) {
                    i = onlineAudienceDisplayStrategySetting.getDefaultValue().displayNumberN;
                }
                long j2 = C1810700xDg.LJI;
                long j3 = C1810700xDg.LJII;
                if (c1105460esC.LIZ.getId() != j && c1105460esC.LIZIZ >= 10) {
                    long j4 = 0;
                    if (j2 > 0 && j3 != 0) {
                        long j5 = i;
                        if (j2 > j5) {
                            long j6 = c1105460esC.LIZJ;
                            long j7 = j2 - j5;
                            if (j6 < j7) {
                                long jMin = Math.min(j7, (((j5 - (j6 % j5)) % j5) + j6) + 1) - 1;
                                if (jMin >= 0 && jMin < ((ArrayList) c1105510esHLIZ.LIZ).size()) {
                                    j4 = ((Contributor) ListProtector.get(c1105510esHLIZ.LIZ, (int) jMin)).mScore;
                                }
                                return C1850730yGF.LIZ(j4).toUpperCase(locale);
                            }
                            return upperCase;
                        }
                        return upperCase;
                    }
                    long j8 = c1105510esHLIZ.LIZIZ;
                    long j9 = i;
                    long j10 = c1105460esC.LIZJ;
                    long jMin2 = Math.min(j8, (((j9 - (j10 % j9)) % j9) + j10) + 1) - 1;
                    if (jMin2 >= 0 && jMin2 < ((ArrayList) c1105510esHLIZ.LIZ).size()) {
                        j4 = ((Contributor) ListProtector.get(c1105510esHLIZ.LIZ, (int) jMin2)).mScore;
                    }
                    return C1850730yGF.LIZ(j4).toUpperCase(locale);
                }
                return upperCase;
            }
            if (C497740JfY.LJJ()) {
                String str = c1105460esC.LIZLLL;
                if (!str.contains("+") || str.contains("K") || str.contains("M") || str.contains("B")) {
                    return str;
                }
                String strSubstring = str.substring(0, str.length() - 1);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("+");
                sbLIZ.append(strSubstring);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return c1105460esC.LIZLLL;
        }
        C1105510esH c1105510esHLIZ2 = C1105510esH.LIZ();
        long j11 = c1105460esC.LIZIZ;
        c1105510esHLIZ2.getClass();
        return C1850730yGF.LIZJ(j11).toUpperCase(Locale.ENGLISH);
    }
}
