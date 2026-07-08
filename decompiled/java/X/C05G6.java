package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05G6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.compose.QrCodePageComposeKt$GeckoImageBackground$1$1", f = "QrCodePageCompose.kt", l = {257, 258, 259}, m = "invokeSuspend")
public final class C05G6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05P0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C05P0<Bitmap> LLILLL;
    public final /* synthetic */ C05P0<Bitmap> LLILZ;
    public final /* synthetic */ C05P0<Bitmap> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05G6(C05P0<Bitmap> c05p0, C05P0<Bitmap> c05p02, C05P0<Bitmap> c05p03, InterfaceC1364105Vn<? super C05G6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05p0;
        this.LLILZ = c05p02;
        this.LLILZIL = c05p03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05G6(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "QrCodePageComposeKt@a83a.GeckoImageBackground$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILLJJLI
            r3 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L24
            if (r1 == r0) goto L39
            if (r1 == r2) goto L53
            if (r1 != r3) goto L6d
            X.05P0 r1 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L1b:
            r1.setValue(r7)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L24:
            X.C155000ia.LIZIZ(r7)
            X.05P0<android.graphics.Bitmap> r1 = r6.LLILLL
            r6.LL = r1
            r6.LLILLJJLI = r0
            java.lang.String r0 = "profile_background_style_01.webp"
            java.lang.Object r7 = X.C1669890tYZ.LJFF(r0, r6)
            if (r7 != r4) goto L3e
            X.C1C7U.LIZIZ(r5)
            return r4
        L39:
            X.05P0 r1 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L3e:
            r1.setValue(r7)
            X.05P0<android.graphics.Bitmap> r1 = r6.LLILZ
            r6.LL = r1
            r6.LLILLJJLI = r2
            java.lang.String r0 = "profile_background_style_02.webp"
            java.lang.Object r7 = X.C1669890tYZ.LJFF(r0, r6)
            if (r7 != r4) goto L58
            X.C1C7U.LIZIZ(r5)
            return r4
        L53:
            X.05P0 r1 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L58:
            r1.setValue(r7)
            X.05P0<android.graphics.Bitmap> r1 = r6.LLILZIL
            r6.LL = r1
            r6.LLILLJJLI = r3
            java.lang.String r0 = "profile_background_style_03.webp"
            java.lang.Object r7 = X.C1669890tYZ.LJFF(r0, r6)
            if (r7 != r4) goto L1b
            X.C1C7U.LIZIZ(r5)
            return r4
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05G6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
