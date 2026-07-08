package X;

import com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0mmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409480mmY {
    public final InterfaceC1635410sex LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(31));
    public RequestLabelResponse LIZJ;

    public C1409480mmY(InterfaceC1635410sex interfaceC1635410sex) {
        this.LIZ = interfaceC1635410sex;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1409460mmW
            if (r0 == 0) goto L22
            r6 = r10
            X.0mmW r6 = (X.C1409460mmW) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r3 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L28
            X.0mmY r1 = r6.LL
            goto L74
        L22:
            X.0mmW r6 = new X.0mmW
            r6.<init>(r8, r10)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse r3 = r8.LIZJ
            if (r3 != 0) goto La9
            X.01GW r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r0.getValue()     // Catch: java.lang.Throwable -> L82
            X.0mq7 r5 = (X.C1411690mq7) r5     // Catch: java.lang.Throwable -> L82
            r6.LL = r8     // Catch: java.lang.Throwable -> L82
            r6.LLILZ = r1     // Catch: java.lang.Throwable -> L82
            X.1DEt r4 = new X.1DEt     // Catch: java.lang.Throwable -> L82
            X.05Vn r0 = X.C099M.LIZLLL(r6)     // Catch: java.lang.Throwable -> L82
            r4.<init>(r1, r0)     // Catch: java.lang.Throwable -> L82
            r4.LJIJJ()     // Catch: java.lang.Throwable -> L82
            X.0mqE r3 = X.EnumC1411760mqE.EDIT     // Catch: java.lang.Throwable -> L82
            kotlin.jvm.internal.AwS601S0100000_22 r2 = new kotlin.jvm.internal.AwS601S0100000_22     // Catch: java.lang.Throwable -> L82
            r0 = 28
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L82
            kotlin.jvm.internal.AwS601S0100000_22 r1 = new kotlin.jvm.internal.AwS601S0100000_22     // Catch: java.lang.Throwable -> L82
            r0 = 29
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L82
            r5.LJ(r9, r3, r2, r1)     // Catch: java.lang.Throwable -> L82
            java.lang.Object r3 = r4.LJIJ()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L82
            if (r3 != r0) goto L6f
            X.C099Q.LIZJ(r6)     // Catch: java.lang.Throwable -> L82
        L6f:
            if (r3 != r7) goto L72
            return r7
        L72:
            r1 = r8
            goto L77
        L74:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L82
        L77:
            r0 = r3
            com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse r0 = (com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse) r0     // Catch: java.lang.Throwable -> L82
            r1.LIZJ = r0     // Catch: java.lang.Throwable -> L82
            com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse r3 = (com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse) r3     // Catch: java.lang.Throwable -> L82
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L82
            goto L8e
        L82:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L8e:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r2 == 0) goto La9
            X.0n65 r1 = X.C1421590n65.LIZIZ
            java.lang.String r0 = "Failed to fetch label data, using default empty response."
            X.C201955140j.LJIIJ(r1, r0, r2)
            X.13BV r2 = X.C13BV.INSTANCE
            com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse r3 = new com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse
            r0 = 0
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.String r0 = "Failed to fetch label"
            r3.<init>(r2, r1, r0)
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409480mmY.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1409380mmO LIZ(com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse r9, com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r10, com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse r11) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409480mmY.LIZ(com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RecommendDescResponse, com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse, com.ss.android.ugc.gamora.editor.sticker.inspiration.api.RequestLabelResponse):X.0mmO");
    }
}
