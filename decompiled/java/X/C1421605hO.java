package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.turtle.ext.url.CharSequenceOptViewKt$splitToCharSequence$1", f = "CharSequenceOptView.kt", l = {15}, m = "invokeSuspend")
public final class C1421605hO extends C09AW implements Function2<AbstractC1421005hI<? super CharSequence>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ CharSequence LLILZIL;
    public final /* synthetic */ char LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421605hO(CharSequence charSequence, char c, InterfaceC1364105Vn<? super C1421605hO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = charSequence;
        this.LLILZLL = c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1421605hO c1421605hO = new C1421605hO(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1421605hO.LLILZ = obj;
        return c1421605hO;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:6:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "CharSequenceOptViewKt@d7cf.splitToCharSequence$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L4d
            if (r0 != r4) goto L5c
            int r3 = r9.LLILLJJLI
            java.lang.Object r0 = r9.LLILZ
            X.05hI r0 = (X.AbstractC1421005hI) r0
            X.C155000ia.LIZIZ(r10)
        L1a:
            int r7 = r3 + 1
        L1c:
            java.lang.CharSequence r1 = r9.LLILZIL
            int r1 = r1.length()
            if (r7 > r1) goto L56
            java.lang.CharSequence r3 = r9.LLILZIL
            char r2 = r9.LLILZLL
            r1 = 4
            int r3 = kotlin.text.a0.LJJIZ(r3, r2, r7, r5, r1)
            java.lang.CharSequence r2 = r9.LLILZIL
            r1 = -1
            if (r3 != r1) goto L36
            int r3 = r2.length()
        L36:
            X.13aW r2 = new X.13aW
            java.lang.CharSequence r1 = r9.LLILZIL
            r2.<init>(r7, r3, r1)
            r9.LLILZ = r0
            r9.LLILLJJLI = r3
            r9.LLILLL = r4
            java.lang.Object r1 = r0.LIZ(r2, r9)
            if (r1 != r6) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r6
        L4d:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r0 = r9.LLILZ
            X.05hI r0 = (X.AbstractC1421005hI) r0
            r7 = 0
            goto L1c
        L56:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421605hO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super CharSequence> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
