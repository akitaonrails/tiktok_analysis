package X;

import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.shooting.PhotoProcessor$enterEditPageAfterImageCapture$getAuditFileTask$1", f = "PhotoProcessor.kt", l = {163, 175}, m = "invokeSuspend")
public final class C2224208nY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ AnonymousClass0957<Pair<Bitmap, Long>> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C578810Mn1 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2224208nY(AnonymousClass0957<Pair<Bitmap, Long>> anonymousClass0957, C259800zU<String> c259800zU, C578810Mn1 c578810Mn1, InterfaceC1364105Vn<? super C2224208nY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = anonymousClass0957;
        this.LLILLL = c259800zU;
        this.LLILZ = c578810Mn1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2224208nY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r12 = "PhotoProcessor@9c21.enterEditPageAfterImageCapture$getAuditFileTask$1"
            X.C1C7U.LIZ(r12)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r13.LL
            r7 = 2
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L2f
            if (r0 != r7) goto L7f
            X.C155000ia.LIZIZ(r14)
        L17:
            r6 = r14
        L18:
            X.C1C7U.LIZIZ(r12)
            return r6
        L1c:
            X.C155000ia.LIZIZ(r14)
            X.0957<kotlin.Pair<android.graphics.Bitmap, java.lang.Long>> r0 = r13.LLILLJJLI
            if (r0 == 0) goto L36
            r13.LL = r1
            java.lang.Object r14 = r0.LJLIIIL(r13)
            if (r14 != r8) goto L32
            X.C1C7U.LIZIZ(r12)
            return r8
        L2f:
            X.C155000ia.LIZIZ(r14)
        L32:
            kotlin.Pair r14 = (kotlin.Pair) r14
            if (r14 != 0) goto L3b
        L36:
            kotlin.Pair r14 = new kotlin.Pair
            r14.<init>(r6, r6)
        L3b:
            java.lang.Object r11 = r14.getFirst()
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            if (r11 == 0) goto L7a
            int[] r1 = X.C2224308nZ.LIZ
            r0 = 0
            r10 = r1[r0]
            int r9 = r11.getWidth()
            int r0 = r11.getHeight()
            if (r10 >= r9) goto L78
            double r4 = (double) r10
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r0
            double r0 = (double) r9
            double r2 = r2 / r0
            double r4 = r4 * r2
            int r0 = (int) r4
        L5b:
            android.graphics.Bitmap r2 = com.bytedance.common.utility.BitmapUtils.resizeBitmap(r11, r10, r0)
            X.00zU<java.lang.String> r0 = r13.LLILLL
            T r1 = r0.element
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L18
            X.0Mn1 r0 = r13.LLILZ
            r13.LL = r7
            r0.getClass()
            java.lang.Object r14 = X.C578810Mn1.LJII(r2, r1, r13)
            if (r14 != r8) goto L17
            X.C1C7U.LIZIZ(r12)
            return r8
        L78:
            r10 = r9
            goto L5b
        L7a:
            X.00zU<java.lang.String> r0 = r13.LLILLL
            r0.element = r6
            goto L18
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2224208nY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
