package X;

import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiportrait.AiPortraitContentDataSource$fetchAiContentList$1$1", f = "AiPortraitContentDataSource.kt", l = {56, 63}, m = "invokeSuspend")
public final class C535160Kyo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C535140Kym LLILLJJLI;
    public final /* synthetic */ HashSet<String> LLILLL;
    public final /* synthetic */ C09AJ<List<C535020Kya>> LLILZ;
    public final /* synthetic */ InterfaceC535110Kyj LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535160Kyo(C535140Kym c535140Kym, HashSet<String> hashSet, C09AJ<List<C535020Kya>> c09aj, InterfaceC535110Kyj interfaceC535110Kyj, InterfaceC1364105Vn<? super C535160Kyo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c535140Kym;
        this.LLILLL = hashSet;
        this.LLILZ = c09aj;
        this.LLILZIL = interfaceC535110Kyj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535160Kyo(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "AiPortraitContentDataSource@8386.fetchAiContentList$1$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 0
            r5 = 2
            r8 = 1
            if (r0 == 0) goto L3f
            if (r0 == r8) goto L62
            if (r0 != r5) goto L9a
            X.C155000ia.LIZIZ(r11)
        L17:
            X.09AJ<java.util.List<X.0Kya>> r1 = r10.LLILZ
            java.util.List r11 = (java.util.List) r11
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L2c
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L2c
            r1.onNext(r11)
        L2c:
            X.09AJ<java.util.List<X.0Kya>> r0 = r10.LLILZ
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L39
            X.09AJ<java.util.List<X.0Kya>> r0 = r10.LLILZ
            r0.onComplete()
        L39:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L3f:
            X.C155000ia.LIZIZ(r11)
            X.0Kym r4 = r10.LLILLJJLI
            java.util.HashSet<java.lang.String> r3 = r10.LLILLL
            kotlin.jvm.internal.AwS552S0100000_8 r2 = new kotlin.jvm.internal.AwS552S0100000_8
            X.09AJ<java.util.List<X.0Kya>> r1 = r10.LLILZ
            r0 = 937(0x3a9, float:1.313E-42)
            r2.<init>(r1, r0)
            X.0Kyp r1 = new X.0Kyp
            X.0Kyj r0 = r10.LLILZIL
            r1.<init>(r0, r6)
            r10.LL = r8
            java.lang.Object r11 = r4.LIZJ(r3, r2, r1, r10)
            if (r11 != r7) goto L65
            X.C1C7U.LIZIZ(r9)
            return r7
        L62:
            X.C155000ia.LIZIZ(r11)
        L65:
            X.09AJ<java.util.List<X.0Kya>> r1 = r10.LLILZ
            java.util.List r11 = (java.util.List) r11
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L7a
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7a
            r1.onNext(r11)
        L7a:
            X.0Kym r4 = r10.LLILLJJLI
            java.util.HashSet<java.lang.String> r3 = r10.LLILLL
            kotlin.jvm.internal.AwS552S0100000_8 r2 = new kotlin.jvm.internal.AwS552S0100000_8
            X.09AJ<java.util.List<X.0Kya>> r1 = r10.LLILZ
            r0 = 938(0x3aa, float:1.314E-42)
            r2.<init>(r1, r0)
            X.0Kyq r1 = new X.0Kyq
            X.0Kyj r0 = r10.LLILZIL
            r1.<init>(r0, r6)
            r10.LL = r5
            java.lang.Object r11 = r4.LIZJ(r3, r2, r1, r10)
            if (r11 != r7) goto L17
            X.C1C7U.LIZIZ(r9)
            return r7
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C535160Kyo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
