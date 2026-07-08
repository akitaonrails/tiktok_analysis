package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import njp.a;

/* JADX INFO: renamed from: X.08W9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {279, 287, 291}, m = "invokeSuspend")
public final class C08W9 extends C09AW implements Function2<AbstractC1421005hI<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Regex LLILZLL;
    public final /* synthetic */ CharSequence LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08W9(Regex regex, CharSequence charSequence, int i, InterfaceC1364105Vn<? super C08W9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = regex;
        this.LLIZ = charSequence;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C08W9 c08w9 = new C08W9(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c08w9.LLILZIL = obj;
        return c08w9;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:19:0x005e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r4 = 3
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L17
            if (r0 == r8) goto La2
            if (r0 == r9) goto L51
            if (r0 != r4) goto L8b
            X.C155000ia.LIZIZ(r11)
        L14:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L17:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r2 = r10.LLILZIL
            X.05hI r2 = (X.AbstractC1421005hI) r2
            kotlin.text.Regex r0 = r10.LLILZLL
            java.util.regex.Pattern r1 = r0.nativePattern
            java.lang.CharSequence r0 = r10.LLIZ
            java.util.regex.Matcher r1 = r1.matcher(r0)
            int r0 = r10.LLIZLLLIL
            if (r0 == r8) goto L93
            boolean r0 = r1.find()
            if (r0 == 0) goto L93
            r7 = 0
            r6 = 0
        L34:
            java.lang.CharSequence r5 = r10.LLIZ
            int r0 = r1.start()
            java.lang.CharSequence r0 = r5.subSequence(r7, r0)
            java.lang.String r0 = r0.toString()
            r10.LLILZIL = r2
            r10.LLILLJJLI = r1
            r10.LLILLL = r6
            r10.LLILZ = r9
            java.lang.Object r0 = r2.LIZ(r0, r10)
            if (r0 != r3) goto L5e
            return r3
        L51:
            int r6 = r10.LLILLL
            java.lang.Object r1 = r10.LLILLJJLI
            java.util.regex.Matcher r1 = (java.util.regex.Matcher) r1
            java.lang.Object r2 = r10.LLILZIL
            X.05hI r2 = (X.AbstractC1421005hI) r2
            X.C155000ia.LIZIZ(r11)
        L5e:
            int r7 = r1.end()
            int r6 = r6 + 1
            int r0 = r10.LLIZLLLIL
            int r0 = r0 - r8
            if (r6 == r0) goto L6f
            boolean r0 = r1.find()
            if (r0 != 0) goto L34
        L6f:
            java.lang.CharSequence r1 = r10.LLIZ
            int r0 = r1.length()
            java.lang.CharSequence r0 = r1.subSequence(r7, r0)
            java.lang.String r1 = r0.toString()
            r0 = 0
            r10.LLILZIL = r0
            r10.LLILLJJLI = r0
            r10.LLILZ = r4
            java.lang.Object r0 = r2.LIZ(r1, r10)
            if (r0 != r3) goto L14
            return r3
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L93:
            java.lang.CharSequence r0 = r10.LLIZ
            java.lang.String r0 = r0.toString()
            r10.LLILZ = r8
            java.lang.Object r0 = r2.LIZ(r0, r10)
            if (r0 != r3) goto La5
            return r3
        La2:
            X.C155000ia.LIZIZ(r11)
        La5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08W9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super String> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
