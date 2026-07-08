package X;

import com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM$triggerTypingRecommendation$1", f = "TypingRecommendationVM.kt", l = {113, 141, 157, 173, 193}, m = "invokeSuspend")
public final class C452430Hof extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ TypingRecommendationVM LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452430Hof(TypingRecommendationVM typingRecommendationVM, String str, boolean z, long j, String str2, InterfaceC1364105Vn<? super C452430Hof> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = typingRecommendationVM;
        this.LLIZLLLIL = str;
        this.LLJ = z;
        this.LLJI = j;
        this.LLJIJIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452430Hof(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452430Hof.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
