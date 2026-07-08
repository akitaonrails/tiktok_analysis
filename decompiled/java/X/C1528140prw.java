package X;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0prw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.translate.AutoTranslateTextView$setText$1", f = "AutoTranslateTextView.kt", l = {41, 45, 48, 49}, m = "invokeSuspend")
public final class C1528140prw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CharSequence LLILLJJLI;
    public final /* synthetic */ C1528180ps0 LLILLL;
    public final /* synthetic */ TextView.BufferType LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528140prw(TextView.BufferType bufferType, C1528180ps0 c1528180ps0, CharSequence charSequence, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = charSequence;
        this.LLILLL = c1528180ps0;
        this.LLILZ = bufferType;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        CharSequence charSequence = this.LLILLJJLI;
        return new C1528140prw(this.LLILZ, this.LLILLL, charSequence, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "AutoTranslateTextView@9fc4.setText$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LL
            r6 = 4
            r8 = 3
            r9 = 2
            r5 = 0
            r10 = 1
            if (r0 == 0) goto L22
            if (r0 == r10) goto La4
            if (r0 == r9) goto L6f
            if (r0 == r8) goto L86
            if (r0 == r6) goto La4
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L22:
            X.C155000ia.LIZIZ(r13)
            java.lang.CharSequence r0 = r12.LLILLJJLI
            java.lang.String r1 = r0.toString()
            java.util.HashMap<java.lang.String, java.lang.String> r0 = X.C1528120pru.LIZIZ
            java.lang.Object r7 = r0.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L54
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            if (r0 != 0) goto L54
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0prx r2 = new X.0prx
            X.0ps0 r1 = r12.LLILLL
            android.widget.TextView$BufferType r0 = r12.LLILZ
            r2.<init>(r1, r7, r0, r5)
            r12.LL = r10
            java.lang.Object r0 = X.C23250099c.LJI(r12, r3, r2)
            if (r0 != r4) goto La7
            X.C1C7U.LIZIZ(r11)
            return r4
        L54:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r7 = X.C2107308Nj.LIZ
            X.0prz r3 = new X.0prz
            X.0ps0 r2 = r12.LLILLL
            java.lang.CharSequence r1 = r12.LLILLJJLI
            android.widget.TextView$BufferType r0 = r12.LLILZ
            r3.<init>(r0, r2, r1, r5)
            r12.LL = r9
            java.lang.Object r0 = X.C23250099c.LJI(r12, r7, r3)
            if (r0 != r4) goto L72
            X.C1C7U.LIZIZ(r11)
            return r4
        L6f:
            X.C155000ia.LIZIZ(r13)
        L72:
            X.0pru r1 = X.C1528120pru.LIZ
            java.lang.CharSequence r0 = r12.LLILLJJLI
            java.lang.String r0 = r0.toString()
            r12.LL = r8
            java.lang.Object r13 = r1.LIZ(r0, r12)
            if (r13 != r4) goto L89
            X.C1C7U.LIZIZ(r11)
            return r4
        L86:
            X.C155000ia.LIZIZ(r13)
        L89:
            java.lang.String r13 = (java.lang.String) r13
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0pry r2 = new X.0pry
            X.0ps0 r1 = r12.LLILLL
            android.widget.TextView$BufferType r0 = r12.LLILZ
            r2.<init>(r1, r13, r0, r5)
            r12.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r12, r3, r2)
            if (r0 != r4) goto La7
            X.C1C7U.LIZIZ(r11)
            return r4
        La4:
            X.C155000ia.LIZIZ(r13)
        La7:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1528140prw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
