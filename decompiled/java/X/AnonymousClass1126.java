package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;

/* JADX INFO: renamed from: X.1126, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1126 {
    public static final AnonymousClass1126 LIZ = new AnonymousClass1126();
    public static final int LIZIZ = 15000;
    public static final C603820NmG<String, AnonymousClass1127> LIZJ = new C603820NmG<>(16);
    public static final C603820NmG<String, AnonymousClass1125> LIZLLL = new C603820NmG<>(16);

    public static ChallengeDetail LIZIZ(int i, String str, boolean z) {
        C603820NmG<String, AnonymousClass1127> c603820NmG = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(i);
        sbLIZ.append('&');
        sbLIZ.append(z);
        AnonymousClass1127 anonymousClass1127LIZJ = c603820NmG.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (anonymousClass1127LIZJ != null && System.currentTimeMillis() - anonymousClass1127LIZJ.LIZIZ < LIZIZ) {
            return anonymousClass1127LIZJ.LIZ;
        }
        return null;
    }

    public static void LIZ(int i, String str, String str2, String str3, boolean z, long j) {
        if (j == 0) {
            C603820NmG<String, AnonymousClass1125> c603820NmG = LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('&');
            sbLIZ.append(j);
            sbLIZ.append('&');
            sbLIZ.append(20);
            sbLIZ.append('&');
            sbLIZ.append(i);
            sbLIZ.append('&');
            sbLIZ.append(z);
            sbLIZ.append('&');
            sbLIZ.append(str2);
            sbLIZ.append('&');
            sbLIZ.append(str3);
            sbLIZ.append('&');
            sbLIZ.append((String) null);
            if (c603820NmG.LIZJ(C2188811AlT.LIZIZ(sbLIZ)) != null) {
                System.currentTimeMillis();
            }
        }
    }
}
