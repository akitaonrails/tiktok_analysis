package X;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionAnimationAdapter$captionTextAnimation$1$1", f = "CaptionAnimationAdapter.kt", l = {137}, m = "invokeSuspend")
public final class C327700Csy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C327670Csv LL;
    public int LLILLJJLI;
    public final /* synthetic */ C327670Csv LLILLL;
    public final /* synthetic */ C0CVI LLILZ;
    public final /* synthetic */ C327610Csp LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C327710Csz LLIZ;
    public final /* synthetic */ StringBuilder LLIZLLLIL;
    public final /* synthetic */ TextView LLJ;
    public final /* synthetic */ StringBuilder LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327700Csy(C327670Csv c327670Csv, C0CVI c0cvi, C327610Csp c327610Csp, C118300cf c118300cf, C327710Csz c327710Csz, StringBuilder sb, TextView textView, StringBuilder sb2, InterfaceC1364105Vn<? super C327700Csy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c327670Csv;
        this.LLILZ = c0cvi;
        this.LLILZIL = c327610Csp;
        this.LLILZLL = c118300cf;
        this.LLIZ = c327710Csz;
        this.LLIZLLLIL = sb;
        this.LLJ = textView;
        this.LLJI = sb2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327700Csy(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0016, code lost:
    
        if (r5 == null) goto L25;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "CaptionAnimationAdapter@686b.captionTextAnimation$1$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LLILLJJLI
            r4 = 0
            r2 = 1
            if (r0 == 0) goto L80
            if (r0 != r2) goto La8
            X.0Csv r5 = r11.LL
            X.C155000ia.LIZIZ(r12)
        L16:
            X.0CVI r0 = r11.LLILZ
            long r7 = r0.LIZ()
            long r0 = r5.LIZIZ
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 >= 0) goto L37
            X.0CVI r6 = r11.LLILZ
            long r6 = r6.LIZ()
            long r0 = r0 - r6
            r11.LL = r5
            r11.LLILLJJLI = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)
            if (r0 != r3) goto L16
            X.C1C7U.LIZIZ(r10)
            return r3
        L37:
            X.0Csp r6 = r11.LLILZIL
            X.0CVI r0 = r11.LLILZ
            long r0 = r0.LIZ()
            r6.LIZJ(r0)
            X.00cf r9 = r11.LLILZLL
            X.0Csp r1 = r11.LLILZIL
            int r0 = r1.LJFF
            r9.element = r0
            X.0Csv r0 = r1.LJII
            if (r0 == 0) goto L76
            X.0Csz r8 = r11.LLIZ
            java.lang.StringBuilder r7 = r11.LLJI
            android.widget.TextView r6 = r11.LLJ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = " "
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L76
            int r1 = r9.element
            r8.getClass()
            if (r1 < 0) goto L6b
            int r0 = r7.length()
            if (r1 <= r0) goto L6f
        L6b:
            int r1 = r7.length()
        L6f:
            java.lang.CharSequence r0 = r7.subSequence(r4, r1)
            r6.setText(r0)
        L76:
            X.0Csz r0 = r11.LLIZ
            r0.LLLI(r5)
            X.0Csp r0 = r11.LLILZIL
            X.0Csv r5 = r0.LJI
            goto L85
        L80:
            X.C155000ia.LIZIZ(r12)
            X.0Csv r5 = r11.LLILLL
        L85:
            if (r5 != 0) goto L16
            X.0Csz r3 = r11.LLIZ
            java.lang.StringBuilder r2 = r11.LLIZLLLIL
            android.widget.TextView r1 = r11.LLJ
            int r0 = r2.length()
            r3.getClass()
            java.lang.CharSequence r0 = r2.subSequence(r4, r0)
            r1.setText(r0)
            X.0Csz r1 = r11.LLIZ
            X.0Csp r0 = r11.LLILZIL
            r1.LLLFZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327700Csy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
