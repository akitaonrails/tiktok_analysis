package X;

import Y.ARunnableS12S0310000_23;
import android.util.LruCache;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateBundle;

/* JADX INFO: renamed from: X.0q5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536800q5u {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0q5v] */
    public static void LIZ(final SparkContext sparkContext) {
        LruCache<String, C1536930q67> lruCache = C1536910q65.LIZ;
        C1536930q67 c1536930q67LIZ = C1536910q65.LIZ(sparkContext.LJIJI());
        if (c1536930q67LIZ != null) {
            sparkContext.LJJ(TemplateBundle.class, c1536930q67LIZ.LIZ);
            sparkContext.LJJ(C1536830q5x.class, new C1536830q5x("memory"));
        } else {
            new ARunnableS12S0310000_23(null, sparkContext, new AbstractC1536820q5w() { // from class: X.0q5v
                public final /* synthetic */ AbstractC1536820q5w LIZ = null;

                @Override // X.AbstractC1536820q5w
                public final void LIZ(String str) {
                    AbstractC1536820q5w abstractC1536820q5w = this.LIZ;
                    if (abstractC1536820q5w != null) {
                        abstractC1536820q5w.LIZ(str);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0044 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:6:0x000b, B:8:0x001a, B:18:0x002c, B:20:0x0030, B:22:0x0034, B:23:0x0036, B:28:0x0040, B:30:0x0044, B:31:0x0046, B:25:0x003a, B:27:0x003e, B:35:0x006c, B:37:0x008b, B:34:0x0058), top: B:46:0x000b }] */
                @Override // X.AbstractC1536820q5w
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(byte[] r11, X.C1533790q13 r12, X.C1532310pyf r13) {
                    /*
                        r10 = this;
                        X.0q5w r0 = r10.LIZ
                        if (r0 == 0) goto L7
                        r0.LIZIZ(r11, r12, r13)
                    L7:
                        X.0q70 r6 = r2
                        X.0q5w r5 = r10.LIZ
                        long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L94
                        java.lang.Class<com.lynx.tasm.TemplateBundle> r0 = com.lynx.tasm.TemplateBundle.class
                        java.lang.Object r4 = r6.LJFF(r0)     // Catch: java.lang.Throwable -> L94
                        com.lynx.tasm.TemplateBundle r4 = (com.lynx.tasm.TemplateBundle) r4     // Catch: java.lang.Throwable -> L94
                        r7 = 0
                        if (r4 != 0) goto L54
                        X.0q7I r2 = new X.0q7I     // Catch: java.lang.Throwable -> L94
                        r2.<init>()     // Catch: java.lang.Throwable -> L94
                        if (r12 == 0) goto L22
                        goto L2c
                    L22:
                        r3 = r7
                        if (r12 == 0) goto L26
                        goto L36
                    L26:
                        r1 = r7
                        if (r12 == 0) goto L2a
                        goto L40
                    L2a:
                        r0 = r7
                        goto L46
                    L2c:
                        X.0q0Z r0 = r12.LIZ     // Catch: java.lang.Throwable -> L94
                        if (r0 == 0) goto L22
                        X.0q0b r0 = r0.LJJJJLI     // Catch: java.lang.Throwable -> L94
                        if (r0 == 0) goto L22
                        java.lang.String r3 = r0.LIZIZ     // Catch: java.lang.Throwable -> L94
                    L36:
                        X.0q0Z r0 = r12.LIZ     // Catch: java.lang.Throwable -> L94
                        if (r0 == 0) goto L26
                        X.0q0b r0 = r0.LJJJJLI     // Catch: java.lang.Throwable -> L94
                        if (r0 == 0) goto L26
                        java.lang.String r1 = r0.LIZJ     // Catch: java.lang.Throwable -> L94
                    L40:
                        X.0q0Z r0 = r12.LIZ     // Catch: java.lang.Throwable -> L94
                        if (r0 == 0) goto L2a
                        java.lang.String r0 = r0.LJJJJIZL     // Catch: java.lang.Throwable -> L94
                    L46:
                        java.lang.String r0 = X.C1533270q0D.LIZ(r3, r1, r0)     // Catch: java.lang.Throwable -> L94
                        r2.LIZ = r0     // Catch: java.lang.Throwable -> L94
                        X.0q7J r0 = r2.LIZ()     // Catch: java.lang.Throwable -> L94
                        com.lynx.tasm.TemplateBundle r4 = com.lynx.tasm.TemplateBundle.LIZIZ(r11, r0)     // Catch: java.lang.Throwable -> L94
                    L54:
                        if (r12 != 0) goto L58
                        if (r13 == 0) goto L6c
                    L58:
                        android.util.LruCache<java.lang.String, X.0q67> r0 = X.C1536910q65.LIZ     // Catch: java.lang.Throwable -> L94
                        java.lang.String r0 = r6.LJIJI()     // Catch: java.lang.Throwable -> L94
                        X.0q67 r2 = new X.0q67     // Catch: java.lang.Throwable -> L94
                        r2.<init>(r4, r12, r13, r7)     // Catch: java.lang.Throwable -> L94
                        android.util.LruCache<java.lang.String, X.0q67> r1 = X.C1536910q65.LIZ     // Catch: java.lang.Throwable -> L94
                        java.lang.String r0 = X.C01CL.LIZ(r0)     // Catch: java.lang.Throwable -> L94
                        r1.put(r0, r2)     // Catch: java.lang.Throwable -> L94
                    L6c:
                        X.0otc r3 = X.C1490740otc.LIZ     // Catch: java.lang.Throwable -> L94
                        java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L94
                        java.lang.String r0 = "decode templateBundle cost: "
                        r2.append(r0)     // Catch: java.lang.Throwable -> L94
                        long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L94
                        long r0 = r0 - r8
                        r2.append(r0)     // Catch: java.lang.Throwable -> L94
                        java.lang.String r2 = X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Throwable -> L94
                        java.lang.String r1 = "PdpLynxTemplateTool"
                        r0 = 2
                        X.C1490740otc.LIZIZ(r3, r2, r7, r1, r0)     // Catch: java.lang.Throwable -> L94
                        if (r4 == 0) goto L91
                        java.lang.Class<com.lynx.tasm.TemplateBundle> r0 = com.lynx.tasm.TemplateBundle.class
                        r6.LJJ(r0, r4)     // Catch: java.lang.Throwable -> L94
                        goto L9e
                    L91:
                        if (r5 == 0) goto L9e
                        return
                    L94:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        if (r5 == 0) goto L9e
                        r0.getMessage()
                        return
                    L9e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1536810q5v.LIZIZ(byte[], X.0q13, X.0pyf):void");
                }
            }, 3).run();
        }
    }
}
