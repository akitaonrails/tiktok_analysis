package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0641, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.video.VideoSaveKt$saveVideo$videoPath$1", f = "VideoSave.kt", l = {150, 157, 161, 163}, m = "invokeSuspend")
public final class AnonymousClass0641 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0641(String str, String str2, String str3, Context context, String str4, InterfaceC1364105Vn<? super AnonymousClass0641> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = context;
        this.LLIZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0641(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r9 = "VideoSaveKt@32a8.saveVideo$videoPath$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r6 = 4
            r8 = 3
            r7 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 == r3) goto L3c
            if (r0 == r7) goto L22
            if (r0 == r8) goto L99
            if (r0 == r6) goto L22
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L22:
            X.C155000ia.LIZIZ(r11)
            goto La7
        L27:
            X.C155000ia.LIZIZ(r11)
            java.lang.String r2 = r10.LLILLL
            java.lang.String r1 = r10.LLILZ
            java.lang.String r0 = r10.LLILZIL
            r10.LLILLJJLI = r3
            java.lang.Object r11 = X.C2248908rX.LIZ(r2, r1, r0, r10)
            if (r11 != r5) goto L3f
            X.C1C7U.LIZIZ(r9)
            return r5
        L3c:
            X.C155000ia.LIZIZ(r11)
        L3f:
            X.08rY r11 = (X.C2249008rY) r11
            int r0 = r11.LIZ
            if (r0 == r3) goto L5c
            android.content.Context r3 = r10.LLILZLL
            java.lang.String r2 = r10.LLIZ
            r10.LLILLJJLI = r7
            X.1DFB r1 = X.C0PEM.LIZJ
            X.01R5 r0 = new X.01R5
            r0.<init>(r3, r2, r4)
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r5) goto La7
            X.C1C7U.LIZIZ(r9)
            return r5
        L5c:
            java.lang.String r3 = r11.LIZIZ
            if (r3 == 0) goto L80
            int r0 = r3.length()
            if (r0 == 0) goto L80
            X.0VSJ r2 = new X.0VSJ
            r2.<init>(r3)
            r10.LL = r3
            r10.LLILLJJLI = r8
            X.1DFB r1 = X.C0PEM.LIZJ
            X.09mN r0 = new X.09mN
            r0.<init>(r2, r4)
            java.lang.Object r11 = X.C23250099c.LJI(r10, r1, r0)
            if (r11 != r5) goto L9e
            X.C1C7U.LIZIZ(r9)
            return r5
        L80:
            android.content.Context r3 = r10.LLILZLL
            java.lang.String r2 = r10.LLIZ
            r10.LL = r4
            r10.LLILLJJLI = r6
            X.1DFB r1 = X.C0PEM.LIZJ
            X.01R5 r0 = new X.01R5
            r0.<init>(r3, r2, r4)
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r5) goto La7
            X.C1C7U.LIZIZ(r9)
            return r5
        L99:
            java.lang.Object r3 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L9e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r0 = r11.booleanValue()
            if (r0 == 0) goto L80
            r4 = r3
        La7:
            X.C1C7U.LIZIZ(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0641.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
