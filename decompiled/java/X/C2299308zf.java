package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.helper.DownloadUtils$downloadAndCopyImage$2", f = "DownloadUtils.kt", l = {80}, m = "invokeSuspend")
public final class C2299308zf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UploadImageParam>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ CreativeInfo LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2299308zf(int i, CreativeInfo creativeInfo, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = creativeInfo;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2299308zf(this.LLILZIL, this.LLILZ, this.LLILZLL, interfaceC1364105Vn, this.LLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "DownloadUtils@c1b0.downloadAndCopyImage$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r5 = 1
            if (r0 == 0) goto L1d
            if (r0 != r5) goto L15
            java.lang.Object r4 = r9.LL
            java.lang.String r4 = (java.lang.String) r4
            goto L81
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1d:
            X.C155000ia.LIZIZ(r10)
            X.1Ds4 r0 = X.C0CHQ.LIZ()     // Catch: java.lang.Exception -> Lb8
            X.0Moe r0 = r0.LJJIIJZLJL()     // Catch: java.lang.Exception -> Lb8
            X.0MYj r7 = r0.getPathService()     // Catch: java.lang.Exception -> Lb8
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r6 = r9.LLILZ     // Catch: java.lang.Exception -> Lb8
            X.14Cy r4 = X.EnumC20228214Cy.EDITOR_PRO_AIGC     // Catch: java.lang.Exception -> Lb8
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lb8
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lb8
            r2.append(r0)     // Catch: java.lang.Exception -> Lb8
            r0 = 95
            r2.append(r0)     // Catch: java.lang.Exception -> Lb8
            int r0 = r9.LLILZIL     // Catch: java.lang.Exception -> Lb8
            r2.append(r0)     // Catch: java.lang.Exception -> Lb8
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Exception -> Lb8
            java.lang.String r4 = r7.LJIILJJIL(r6, r4, r0, r5)     // Catch: java.lang.Exception -> Lb8
            java.lang.String r1 = r9.LLILZLL     // Catch: java.lang.Exception -> Lb8
            r9.LL = r4     // Catch: java.lang.Exception -> Lb8
            r9.LLILLJJLI = r1     // Catch: java.lang.Exception -> Lb8
            r9.LLILLL = r5     // Catch: java.lang.Exception -> Lb8
            X.099m r2 = new X.099m     // Catch: java.lang.Exception -> Lb8
            X.05Vn r0 = X.C099M.LIZLLL(r9)     // Catch: java.lang.Exception -> Lb8
            r2.<init>(r0)     // Catch: java.lang.Exception -> Lb8
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZJ(r1)     // Catch: java.lang.Exception -> Lb8
            X.0kl3 r1 = X.C1331660kl2.LJIIIIZZ(r0)     // Catch: java.lang.Exception -> Lb8
            X.01sf r0 = new X.01sf     // Catch: java.lang.Exception -> Lb8
            r0.<init>()     // Catch: java.lang.Exception -> Lb8
            r1.LJIILJJIL(r0)     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r10 = r2.LIZ()     // Catch: java.lang.Exception -> Lb8
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Exception -> Lb8
            if (r10 != r0) goto L7b
            X.C099Q.LIZJ(r9)     // Catch: java.lang.Exception -> Lb8
        L7b:
            if (r10 != r3) goto L84
            X.C1C7U.LIZIZ(r8)
            return r3
        L81:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> Lb8
        L84:
            java.io.File r10 = (java.io.File) r10     // Catch: java.lang.Exception -> Lb8
            if (r10 == 0) goto Lbc
            boolean r3 = r9.LLIZ     // Catch: java.lang.Exception -> Lb8
            boolean r0 = r10.exists()     // Catch: java.lang.Exception -> Lb8
            if (r0 == 0) goto Lbc
            X.08Zd r0 = X.C2137908Zd.LIZJ     // Catch: java.lang.Exception -> Lb8
            java.lang.String r1 = r10.getAbsolutePath()     // Catch: java.lang.Exception -> Lb8
            X.08Zf r0 = r0.LIZIZ     // Catch: java.lang.Exception -> Lb8
            r0.getClass()     // Catch: java.lang.Exception -> Lb8
            boolean r0 = X.C2354709Kn.LIZLLL(r1, r4)     // Catch: java.lang.Exception -> Lb8
            if (r0 == 0) goto Lbc
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> Lb8
            r0.<init>()     // Catch: java.lang.Exception -> Lb8
            r0.inJustDecodeBounds = r5     // Catch: java.lang.Exception -> Lb8
            android.graphics.BitmapFactory.decodeFile(r4, r0)     // Catch: java.lang.Exception -> Lb8
            int r2 = r0.outWidth     // Catch: java.lang.Exception -> Lb8
            int r1 = r0.outHeight     // Catch: java.lang.Exception -> Lb8
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam r0 = new com.ss.android.ugc.aweme.creative.model.editorpro.aigc.UploadImageParam     // Catch: java.lang.Exception -> Lb8
            if (r3 != 0) goto Lb4
            r5 = 0
        Lb4:
            r0.<init>(r4, r2, r1, r5)     // Catch: java.lang.Exception -> Lb8
            goto Lbd
        Lb8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lbc:
            r0 = 0
        Lbd:
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2299308zf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UploadImageParam> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
