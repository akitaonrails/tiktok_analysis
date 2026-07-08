package X;

import com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07MB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MB {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS189S0000000_3.get$arr$(1623));

    public static final PlayeAbBufferConfigData LIZIZ() {
        return (PlayeAbBufferConfigData) LIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[PHI: r4
      0x0055: PHI (r4v1 int) = (r4v0 int), (r4v8 int) binds: [B:22:0x0052, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a A[PHI: r3 r4
      0x005a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:25:0x0057, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r4v2 int) = (r4v1 int), (r4v7 int) binds: [B:25:0x0057, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[PHI: r2 r3 r4
      0x005f: PHI (r2v1 int) = (r2v0 int), (r2v4 int) binds: [B:28:0x005c, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r3v2 int) = (r3v1 int), (r3v5 int) binds: [B:28:0x005c, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r4v3 int) = (r4v2 int), (r4v6 int) binds: [B:28:0x005c, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData r6, com.google.gson.n r7) {
        /*
            r5 = 200(0xc8, float:2.8E-43)
            if (r7 == 0) goto L50
            java.lang.String r0 = "interactionBlockDurationPreloaded"
            com.google.gson.k r0 = r7.LJJIIZ(r0)
            if (r0 == 0) goto L50
            int r4 = r0.LJIIJJI()
        L10:
            java.lang.String r0 = "interactionBlockDurationNonPreloaded"
            com.google.gson.k r0 = r7.LJJIIZ(r0)
            if (r0 == 0) goto L55
            int r3 = r0.LJIIJJI()
        L1c:
            java.lang.String r0 = "netBlockDurationMax"
            com.google.gson.k r0 = r7.LJJIIZ(r0)
            if (r0 == 0) goto L5a
            int r2 = r0.LJIIJJI()
        L28:
            java.lang.String r0 = "netBlockIncFactor"
            com.google.gson.k r0 = r7.LJJIIZ(r0)
            if (r0 == 0) goto L5f
            float r1 = r0.LJIIJ()
        L34:
            java.lang.String r0 = "netBlockDurationInitial"
            com.google.gson.k r0 = r7.LJJIIZ(r0)
            if (r0 == 0) goto L40
            int r5 = r0.LJIIJJI()
        L40:
            r6.setInteractionBlockDurationPreloaded(r4)
            r6.setInteractionBlockDurationNonPreloaded(r3)
            r6.setNetBlockDurationMax(r2)
            r6.setNetBlockIncFactor(r1)
            r6.setNetBlockDurationInitial(r5)
            return
        L50:
            r4 = 200(0xc8, float:2.8E-43)
            if (r7 == 0) goto L55
            goto L10
        L55:
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r7 == 0) goto L5a
            goto L1c
        L5a:
            r2 = 5000(0x1388, float:7.006E-42)
            if (r7 == 0) goto L5f
            goto L28
        L5f:
            r1 = 1091567616(0x41100000, float:9.0)
            if (r7 == 0) goto L40
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07MB.LIZ(com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData, com.google.gson.n):void");
    }
}
