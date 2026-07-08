package X;

import com.ss.android.ugc.aweme.services.audio.IVoiceHandler;

/* JADX INFO: renamed from: X.0Cs1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327110Cs1 implements IVoiceHandler {
    public C099G LIZ;
    public String LIZIZ = "";

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onUpdateResult(com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C327120Cs2
            if (r0 == 0) goto L6c
            r8 = r12
            X.0Cs2 r8 = (X.C327120Cs2) r8
            int r2 = r8.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r8.LLILZIL = r2
        L12:
            java.lang.Object r1 = r8.LLILLL
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r7 = 1
            if (r0 == 0) goto L3e
            if (r0 != r7) goto L95
            long r3 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult r11 = r8.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r5 = "wait_detect_loudness"
            if (r1 != 0) goto L72
            java.util.Map<java.lang.String, java.lang.Long> r2 = r11.waitHandlerDuration
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r2.put(r5, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            X.C155000ia.LIZIZ(r1)
            long r3 = java.lang.System.currentTimeMillis()
            X.099G r6 = r10.LIZ
            if (r6 != 0) goto L4c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            X.01GW r0 = X.C265330AaZ.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r1 = (long) r0
            X.0Cs0 r5 = new X.0Cs0
            r0 = 0
            r5.<init>(r6, r0)
            r8.LL = r11
            r8.LLILLJJLI = r3
            r8.LLILZIL = r7
            java.lang.Object r1 = X.C099A.LIZJ(r1, r5, r8)
            if (r1 != r9) goto L26
            return r9
        L6c:
            X.0Cs2 r8 = new X.0Cs2
            r8.<init>(r10, r12)
            goto L12
        L72:
            java.lang.String r0 = r10.LIZIZ
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L7d
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7d:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r11.setLoudnessList(r0)
            java.util.Map<java.lang.String, java.lang.Long> r2 = r11.waitHandlerDuration
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r2.put(r5, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327110Cs1.onUpdateResult(com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceHandler
    public final void onExtractAudio(String str, int i, int i2) {
        this.LIZIZ = str;
        this.LIZ = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1407320mj4(i, i2, str, null), 3);
    }
}
