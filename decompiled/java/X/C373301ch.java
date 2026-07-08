package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.utils.SparkLitePreLayoutHelper$preLoadAndDecodeBySchema$1", f = "SparkLitePreLayoutHelper.kt", l = {1156, 1156, 1159, 1159}, m = "invokeSuspend")
public final class C373301ch extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1537480q70 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C373301ch(String str, C1537480q70 c1537480q70, InterfaceC1364105Vn<? super C373301ch> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1537480q70;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C373301ch(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SparkLitePreLayoutHelper@fd49.preLoadAndDecodeBySchema$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 4
            r1 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L46
            if (r0 == r3) goto L22
            if (r0 == r1) goto L65
            if (r0 != r4) goto L76
            X.C155000ia.LIZIZ(r8)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L22:
            X.C155000ia.LIZIZ(r8)
            goto L1c
        L26:
            X.C155000ia.LIZIZ(r8)
            X.01GW r0 = X.C373401ci.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L57
            X.0q70 r1 = r7.LLILLL
            r7.LL = r2
            r0 = 0
            X.099G r8 = X.C1536900q64.LIZIZ(r1, r0)
            if (r8 != r5) goto L49
            X.C1C7U.LIZIZ(r6)
            return r5
        L46:
            X.C155000ia.LIZIZ(r8)
        L49:
            X.0957 r8 = (X.AnonymousClass0957) r8
            r7.LL = r3
            java.lang.Object r0 = r8.LJLIIIL(r7)
            if (r0 != r5) goto L1c
            X.C1C7U.LIZIZ(r6)
            return r5
        L57:
            X.0q70 r0 = r7.LLILLL
            r7.LL = r1
            X.099G r8 = X.C1536900q64.LIZLLL(r0)
            if (r8 != r5) goto L68
            X.C1C7U.LIZIZ(r6)
            return r5
        L65:
            X.C155000ia.LIZIZ(r8)
        L68:
            X.0957 r8 = (X.AnonymousClass0957) r8
            r7.LL = r4
            java.lang.Object r0 = r8.LJLIIIL(r7)
            if (r0 != r5) goto L1c
            X.C1C7U.LIZIZ(r6)
            return r5
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C373301ch.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
