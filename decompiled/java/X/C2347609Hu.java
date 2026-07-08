package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.resize.StickerBitmapResizeHelperKt$resizeStickerBitmap$1", f = "StickerBitmapResizeHelper.kt", l = {61, 73}, m = "invokeSuspend")
public final class C2347609Hu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21356918hz LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C259800zU<int[]> LLILZIL;
    public final /* synthetic */ Function1<String, Unit> LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2347609Hu(C21356918hz c21356918hz, String str, String str2, C259800zU<int[]> c259800zU, Function1<? super String, Unit> function1, Context context, InterfaceC1364105Vn<? super C2347609Hu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21356918hz;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c259800zU;
        this.LLILZLL = function1;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2347609Hu(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.String r5 = "StickerBitmapResizeHelperKt@959a.resizeStickerBitmap$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r0 = X.C099R.LJFF()
            int r2 = r14.LL
            r1 = 2
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L62
            if (r2 != r1) goto L8b
            X.C155000ia.LIZIZ(r15)
        L16:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r0 = r15.booleanValue()
            if (r0 == 0) goto L33
            java.lang.String r0 = r14.LLILZ
            boolean r0 = X.C2286708xd.LIZJ(r0)
            if (r0 == 0) goto L33
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r14.LLILZLL
            java.lang.String r0 = r14.LLILZ
            r1.invoke(r0)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L33:
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r1 = r14.LLILZLL
            java.lang.String r0 = r14.LLILLL
            r1.invoke(r0)
            goto L2d
        L3b:
            X.C155000ia.LIZIZ(r15)
            boolean r8 = X.C2348109Hz.LIZ()
            if (r8 == 0) goto L65
            X.18hz r9 = r14.LLILLJJLI
            if (r9 == 0) goto L65
            X.1DFB r2 = X.C0PEM.LIZJ
            X.09Hv r6 = new X.09Hv
            X.00zU<int[]> r7 = r14.LLILZIL
            android.content.Context r10 = r14.LLIZ
            java.lang.String r11 = r14.LLILLL
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.LL = r3
            java.lang.Object r2 = X.C23250099c.LJI(r14, r2, r6)
            if (r2 != r0) goto L65
            X.C1C7U.LIZIZ(r5)
            return r0
        L62:
            X.C155000ia.LIZIZ(r15)
        L65:
            java.lang.String r11 = r14.LLILLL
            java.lang.String r12 = r14.LLILZ
            X.00zU<int[]> r2 = r14.LLILZIL
            T r4 = r2.element
            int[] r4 = (int[]) r4
            r2 = 0
            r7 = r4[r2]
            r8 = r4[r3]
            r9 = 4
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG
            r14.LL = r1
            X.1DFB r1 = X.C0PEM.LIZJ
            X.09Hs r6 = new X.09Hs
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r15 = X.C23250099c.LJI(r14, r1, r6)
            if (r15 != r0) goto L16
            X.C1C7U.LIZIZ(r5)
            return r0
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2347609Hu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
