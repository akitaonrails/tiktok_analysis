package X;

import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1119420fEi {
    public final RankTypeV2 LIZ;
    public final long LIZIZ;
    public final Text LIZJ;
    public long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public long LJI;
    public final long LJII;
    public final C1846810y9v LJIIIIZZ;
    public final C1846930yA7 LJIIIZ;
    public final Map<String, String> LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public String LJIILIIL;
    public final long LJIILJJIL;

    public final int hashCode() {
        return (((((((this.LIZ.type * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LJIILJJIL)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1119420fEi)) {
            return false;
        }
        C1119420fEi c1119420fEi = (C1119420fEi) obj;
        if (!Intrinsics.LJFF(this.LIZ, c1119420fEi.LIZ) || this.LIZIZ != c1119420fEi.LIZIZ || this.LJIILJJIL != c1119420fEi.LJIILJJIL || this.LIZLLL != c1119420fEi.LIZLLL || this.LJ != c1119420fEi.LJ || this.LJFF != c1119420fEi.LJFF || this.LJI != c1119420fEi.LJI || this.LJII != c1119420fEi.LJII || !Intrinsics.LJFF(this.LJIIIIZZ, c1119420fEi.LJIIIIZZ) || !Intrinsics.LJFF(this.LJIIIZ, c1119420fEi.LJIIIZ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1119420fEi(com.bytedance.android.livesdk.rank.api.RankTypeV2 r6, long r7, com.bytedance.android.livesdk.model.message.common.Text r9, long r10, long r12, long r14, long r16, long r18, X.C1846810y9v r20, X.C1846930yA7 r21, java.util.Map<java.lang.String, java.lang.String> r22) {
        /*
            r5 = this;
            r5.<init>()
            r5.LIZ = r6
            r5.LIZIZ = r7
            r5.LIZJ = r9
            r5.LIZLLL = r10
            r5.LJ = r12
            r5.LJFF = r14
            r0 = r16
            r5.LJI = r0
            r0 = r18
            r5.LJII = r0
            r0 = r20
            r5.LJIIIIZZ = r0
            r0 = r21
            r5.LJIIIZ = r0
            r0 = r22
            r5.LJIIJ = r0
            r3 = 1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r1 = 100
            if (r0 > 0) goto L3f
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3f
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r5.LJIIJJI = r0
            long r7 = r7 - r3
            java.lang.String r0 = java.lang.String.valueOf(r7)
            r5.LJIIL = r0
        L3c:
            if (r9 == 0) goto L4a
            goto L4d
        L3f:
            r5.LIZIZ = r1
            java.lang.String r0 = "99+"
            r5.LJIIJJI = r0
            java.lang.String r0 = "99"
            r5.LJIIL = r0
            goto L3c
        L4a:
            r3 = 0
            goto L67
        L4d:
            java.util.List<com.bytedance.android.livesdk.model.message.common.TextPiece> r0 = r9.pieces     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L4a
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)     // Catch: java.lang.Exception -> L84
            com.bytedance.android.livesdk.model.message.common.TextPiece r0 = (com.bytedance.android.livesdk.model.message.common.TextPiece) r0     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.stringValue     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L4a
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L4a
            long r3 = r0.longValue()     // Catch: java.lang.Exception -> L84
        L67:
            r5.LJIILJJIL = r3     // Catch: java.lang.Exception -> L84
            if (r9 == 0) goto L88
            java.util.List<com.bytedance.android.livesdk.model.message.common.TextPiece> r0 = r9.pieces     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L88
            java.lang.Object r2 = X.C13LP.LJJJLL(r0)     // Catch: java.lang.Exception -> L84
            com.bytedance.android.livesdk.model.message.common.TextPiece r2 = (com.bytedance.android.livesdk.model.message.common.TextPiece) r2     // Catch: java.lang.Exception -> L84
            if (r2 == 0) goto L88
            java.lang.String r1 = X.C1850730yGF.LIZJ(r3)     // Catch: java.lang.Exception -> L84
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = r1.toUpperCase(r0)     // Catch: java.lang.Exception -> L84
            r2.stringValue = r0     // Catch: java.lang.Exception -> L84
            goto L88
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L88:
            com.bytedance.android.livesdk.model.message.common.Text r1 = r5.LIZJ
            java.lang.String r0 = ""
            android.text.Spannable r0 = X.C1133830fbx.LJIILIIL(r1, r0)
            java.lang.String r0 = r0.toString()
            r5.LJIILIIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1119420fEi.<init>(com.bytedance.android.livesdk.rank.api.RankTypeV2, long, com.bytedance.android.livesdk.model.message.common.Text, long, long, long, long, long, X.0y9v, X.0yA7, java.util.Map):void");
    }
}
