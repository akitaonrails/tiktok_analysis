package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aialive.AiAliveContentDataSource$fetchAiContentList$1$2", f = "AiAliveContentDataSource.kt", l = {58}, m = "invokeSuspend")
public final class C534960KyU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C535040Kyc LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<AwemeDraft> LLILZIL;
    public final /* synthetic */ C09AJ<List<C535020Kya>> LLILZLL;
    public final /* synthetic */ C535040Kyc LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534960KyU(List<AwemeDraft> list, C09AJ<List<C535020Kya>> c09aj, C535040Kyc c535040Kyc, InterfaceC1364105Vn<? super C534960KyU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = c09aj;
        this.LLIZ = c535040Kyc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534960KyU(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003a -> B:6:0x001d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AiAliveContentDataSource@2c87.fetchAiContentList$1$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r4 = 1
            if (r0 == 0) goto L40
            if (r0 != r4) goto L76
            java.lang.Object r2 = r7.LLILLL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r3 = r7.LLILLJJLI
            java.util.Collection r3 = (java.util.Collection) r3
            X.0Kyc r1 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L1d:
            if (r8 == 0) goto L22
            r3.add(r8)
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r0 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r0
            r7.LL = r1
            r7.LLILLJJLI = r3
            r7.LLILLL = r2
            r7.LLILZ = r4
            java.lang.Object r8 = r1.LIZJ(r0, r7)
            if (r8 != r5) goto L1d
            X.C1C7U.LIZIZ(r6)
            return r5
        L40:
            X.C155000ia.LIZIZ(r8)
            java.util.List<com.ss.android.ugc.aweme.draft.model.AwemeDraft> r0 = r7.LLILZIL
            X.0Kyc r1 = r7.LLIZ
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
            goto L22
        L51:
            X.0Lm0 r2 = X.C552700Lm0.LIZIZ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "fetchAiContentList aiContents:"
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AiAliveCDS"
            X.C201955140j.LIZLLL(r2, r0, r1)
            X.09AJ<java.util.List<X.0Kya>> r0 = r7.LLILZLL
            r0.onNext(r3)
            X.09AJ<java.util.List<X.0Kya>> r0 = r7.LLILZLL
            r0.onComplete()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C534960KyU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
