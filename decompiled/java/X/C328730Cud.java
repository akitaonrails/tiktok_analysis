package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328730Cud {
    public final InterfaceC497601wk LIZ;
    public AnonymousClass0956 LIZIZ;
    public final C603820NmG<String, String> LIZJ = new C603820NmG<>(8);

    public C328730Cud(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = lifecycleCoroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r12, X.InterfaceC1364105Vn<? super java.lang.String> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C328720Cuc
            if (r0 == 0) goto L5e
            r3 = r13
            X.0Cuc r3 = (X.C328720Cuc) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r1 = r3.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L7a
            java.lang.Object r12 = r3.LL
            java.lang.String r12 = (java.lang.String) r12
            X.C155000ia.LIZIZ(r1)
        L26:
            if (r1 == 0) goto L64
            return r1
        L29:
            X.C155000ia.LIZIZ(r1)
            X.0Cue r0 = com.ss.android.ugc.gamora.recorder.sticker.LyricsDownloadApi.LIZ
            r0.getClass()
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r5 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r1
            if (r1 == 0) goto L82
            java.lang.String r0 = X.C0CQT.LIZJ
            X.011f r1 = r1.LIZ(r0)
            if (r1 == 0) goto L82
            java.lang.Class<com.ss.android.ugc.gamora.recorder.sticker.LyricsDownloadApi> r0 = com.ss.android.ugc.gamora.recorder.sticker.LyricsDownloadApi.class
            java.lang.Object r0 = r1.create(r0)
            com.ss.android.ugc.gamora.recorder.sticker.LyricsDownloadApi r0 = (com.ss.android.ugc.gamora.recorder.sticker.LyricsDownloadApi) r0
            if (r0 == 0) goto L82
            r3.LL = r12
            r3.LLILZ = r2
            java.lang.Object r1 = r0.download(r12, r3)
            if (r1 != r4) goto L26
            return r4
        L5e:
            X.0Cuc r3 = new X.0Cuc
            r3.<init>(r11, r13)
            goto L12
        L64:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "LyricFetcher: empty body for "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L82:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "LyricFetcher: IRetrofitFactory unavailable"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328730Cud.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(String str, Function1<? super String, Unit> function1, Function1<? super Throwable, Unit> function12) {
        String strLIZJ = this.LIZJ.LIZJ(str);
        if (strLIZJ != null) {
            function1.invoke(strLIZJ);
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        InterfaceC497601wk interfaceC497601wk = this.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZIZ = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C328700Cua(this, str, function1, function12, null), 2);
    }
}
