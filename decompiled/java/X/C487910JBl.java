package X;

/* JADX INFO: renamed from: X.0JBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487910JBl implements InterfaceC487850JBf {
    public final /* synthetic */ C487930JBn LL;

    public C487910JBl(C487930JBn c487930JBn) {
        this.LL = c487930JBn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // X.InterfaceC487850JBf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r6, boolean r7, boolean r8, X.InterfaceC1364105Vn r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C487920JBm
            if (r0 == 0) goto L20
            r4 = r9
            X.0JBm r4 = (X.C487920JBm) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L44
        L20:
            X.0JBm r4 = new X.0JBm
            r4.<init>(r5, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.0JBn r0 = r5.LL     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            X.01GW r0 = r0.LL     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            java.lang.Object r0 = r0.getValue()     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionApi r0 = (com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionApi) r0     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            r4.LLILLL = r1     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            java.lang.Object r3 = r0.getVoiceDetailsInfo(r6, r4)     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            if (r3 != r2) goto L47
            return r2
        L44:
            X.C155000ia.LIZIZ(r3)     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
        L47:
            X.0X52 r3 = (X.C0X52) r3     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            boolean r0 = r3.LIZJ()     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            if (r0 == 0) goto L7a
            T r0 = r3.LIZIZ     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r0 = (com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse) r0     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            if (r0 == 0) goto L60
            java.lang.Integer r0 = r0.statusCode     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            if (r0 == 0) goto L60
            int r0 = r0.intValue()     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            if (r0 != 0) goto L60
            goto L62
        L60:
            r0 = 0
            goto L63
        L62:
            r0 = 1
        L63:
            if (r0 == 0) goto L7a
            T r2 = r3.LIZIZ     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            r0 = r2
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r0 = (com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse) r0     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionStruct r0 = r0.info     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = 0
        L72:
            if (r1 == 0) goto L7a
            X.06Xi r1 = new X.06Xi     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            r1.<init>(r2)     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            return r1
        L7a:
            X.01vg r1 = new X.01vg     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            r0.<init>()     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            r1.<init>(r0)     // Catch: X.C1500760p9m -> L85 java.io.IOException -> L8f
            return r1
        L85:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.01vg r1 = new X.01vg
            r1.<init>(r0)
            return r1
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.01vg r1 = new X.01vg
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C487910JBl.LJIILL(java.lang.String, boolean, boolean, X.05Vn):java.lang.Object");
    }
}
