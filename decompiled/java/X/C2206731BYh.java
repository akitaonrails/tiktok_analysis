package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1BYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206731BYh extends C09AY implements Function0<C2206761BYk> {
    public C2206731BYh() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final C2206761BYk invoke() {
        C2206741BYi.LIZ.getClass();
        if (C2206721BYg.LIZLLL() == 0) {
            return new C2206761BYk(0L, new ArrayList(Collections.nCopies(24, CardStruct.IStatusCode.DEFAULT)), new ArrayList(Collections.nCopies(24, "-1")), new ArrayList(Collections.nCopies(24, CardStruct.IStatusCode.DEFAULT)), new ArrayList(Collections.nCopies(24, "-1")));
        }
        System.currentTimeMillis();
        ?? LIZIZ = C2206721BYg.LIZIZ();
        int i = 0;
        if (LIZIZ.isEmpty()) {
            LIZIZ = new ArrayList(24);
            int i2 = 0;
            do {
                LIZIZ.add(CardStruct.IStatusCode.DEFAULT);
                i2++;
            } while (i2 < 24);
        }
        String[] strArrLIZ = C0NHX.LIZ(C2206721BYg.LIZJ(), "phase2NPV");
        if (strArrLIZ == null) {
            strArrLIZ = new String[0];
        }
        ?? LJJLL = C13LQ.LJJLL(strArrLIZ);
        if (LJJLL.isEmpty()) {
            LJJLL = new ArrayList(24);
            int i3 = 0;
            do {
                LJJLL.add(CardStruct.IStatusCode.DEFAULT);
                i3++;
            } while (i3 < 24);
        }
        ?? LIZ = C2206721BYg.LIZ();
        if (LIZ.isEmpty()) {
            LIZ = new ArrayList(24);
            int i4 = 0;
            do {
                LIZ.add("-1");
                i4++;
            } while (i4 < 24);
        }
        String[] strArrLIZ2 = C0NHX.LIZ(C2206721BYg.LIZJ(), "phase2AvgVol");
        if (strArrLIZ2 == null) {
            strArrLIZ2 = new String[0];
        }
        ?? LJJLL2 = C13LQ.LJJLL(strArrLIZ2);
        if (LJJLL2.isEmpty()) {
            LJJLL2 = new ArrayList(24);
            do {
                LJJLL2.add("-1");
                i++;
            } while (i < 24);
        }
        return new C2206761BYk(C2206721BYg.LIZLLL(), (ArrayList) LIZIZ, (ArrayList) LIZ, (ArrayList) LJJLL, (ArrayList) LJJLL2);
    }
}
