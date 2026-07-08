package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0VfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C803420VfQ {
    public boolean LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public final boolean LIZ(String str) {
        String str2;
        if (str.startsWith("Dump cost time:")) {
            this.LIZ = true;
            int iIndexOf = str.indexOf(58);
            if (iIndexOf != -1) {
                try {
                    long j = CastLongProtector.parseLong(str.substring(iIndexOf + 1).trim());
                    if (j <= 50) {
                        str2 = "0~50ms";
                    } else if (j <= 100) {
                        str2 = "50~100ms";
                    } else if (j <= 150) {
                        str2 = "100~150ms";
                    } else if (j <= 200) {
                        str2 = "150~200ms";
                    } else if (j <= 300) {
                        str2 = "200~300ms";
                    } else if (j <= 400) {
                        str2 = "300~400ms";
                    } else if (j <= 500) {
                        str2 = "400~500ms";
                    } else if (j <= 700) {
                        str2 = "500~700ms";
                    } else if (j <= 1000) {
                        str2 = "700~1000ms";
                    } else if (j <= 1500) {
                        str2 = "1000~1500ms";
                    } else if (j <= 2000) {
                        str2 = "1500~2000ms";
                    } else if (j <= 3000) {
                        str2 = "2000~3000ms";
                    } else if (j <= 4000) {
                        str2 = "3000~4000ms";
                    } else if (j <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                        str2 = "4000~5000ms";
                    } else if (j <= 7000) {
                        str2 = "5000~7000ms";
                    } else if (j <= 10000) {
                        str2 = "7000~10000ms";
                    } else {
                        str2 = "> 10000ms";
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    str2 = "none";
                }
                this.LIZJ = str2;
            }
            return true;
        }
        if (str.startsWith("Dump crash")) {
            this.LIZIZ = true;
            return true;
        }
        return false;
    }
}
