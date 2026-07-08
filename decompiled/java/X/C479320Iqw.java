package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Iqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479320Iqw implements C0IM1 {
    public InterfaceC480510Isr LIZ;
    public String LIZIZ;
    public Long LIZJ;
    public String LIZLLL;
    public Long LJ;
    public Long LJFF;
    public boolean LJI;
    public long LJII;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC480510Isr r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r6 = "HangoutRoomPlayerManager"
            r1 = 0
            r4 = 0
            java.lang.String r5 = r9.getPlayerTag()     // Catch: java.lang.Throwable -> L58
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L58
            r0 = 2
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L58
            r3.add(r10)     // Catch: java.lang.Throwable -> L58
            r7 = 1
            if (r5 == 0) goto L1e
            boolean r0 = kotlin.text.a0.LJJJIL(r5)     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L1e
            r3.add(r5)     // Catch: java.lang.Throwable -> L58
        L1e:
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L58
        L22:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L3a
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "hangout_audio_stream_destroy"
            r9.t0(r3, r0, r7)     // Catch: java.lang.Throwable -> L58
            r9.stop(r3)     // Catch: java.lang.Throwable -> L58
            r9.LJIJ(r3)     // Catch: java.lang.Throwable -> L58
            goto L22
        L3a:
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = "destroyPreviousController, previousTag="
            r3.append(r0)     // Catch: java.lang.Throwable -> L58
            r3.append(r10)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Throwable -> L58
            X.C20441214yg.LIZIZ(r6, r0)     // Catch: java.lang.Throwable -> L58
            r8.LJ = r4
            java.lang.String r0 = r8.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r10)
            if (r0 == 0) goto L83
            goto L79
        L58:
            r5 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "destroyPreviousController failed, previousTag="
            r3.append(r0)     // Catch: java.lang.Throwable -> L86
            r3.append(r10)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Throwable -> L86
            X.C20441214yg.LJFF(r6, r0, r5)     // Catch: java.lang.Throwable -> L86
            r8.LJ = r4
            java.lang.String r0 = r8.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r10)
            if (r0 == 0) goto L83
        L79:
            r8.LIZ = r4
            r8.LIZIZ = r4
            r8.LIZJ = r4
            r8.LJII = r1
            r8.LJFF = r4
        L83:
            r8.LIZLLL = r4
            return
        L86:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L86
            r8.LJ = r4
            java.lang.String r0 = r8.LIZIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r10)
            if (r0 == 0) goto L9e
            r8.LIZ = r4
            r8.LIZIZ = r4
            r8.LIZJ = r4
            r8.LJII = r1
            r8.LJFF = r4
        L9e:
            r8.LIZLLL = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C479320Iqw.LIZ(X.0Isr, java.lang.String):void");
    }

    public final void LIZIZ(String str, boolean z) {
        long jLongValue;
        if (a0.LJJJIL(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            long j = this.LJII;
            Long l = this.LJFF;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = jCurrentTimeMillis;
            }
            this.LJII = j + (jCurrentTimeMillis - jLongValue);
            this.LJFF = null;
        } else {
            this.LJFF = Long.valueOf(jCurrentTimeMillis);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("muteAudioStream, tag=");
        sbLIZ.append(str);
        sbLIZ.append(", isMute=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("HangoutRoomPlayerManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC480510Isr interfaceC480510Isr = this.LIZ;
        if (interfaceC480510Isr != null) {
            interfaceC480510Isr.t0(str, "hangout_audio_stream", z);
        }
    }
}
