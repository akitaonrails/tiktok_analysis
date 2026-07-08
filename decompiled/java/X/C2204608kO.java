package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08kO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.affinity.SocialAffinityManager", f = "SocialAffinityManager.kt", l = {197, 200}, m = "retryWithBackoff")
public final class C2204608kO<T> extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Function1 LLILZ;
    public Function2 LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C2204508kN LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2204608kO(C2204508kN c2204508kN, InterfaceC1364105Vn<? super C2204608kO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c2204508kN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAffinityManager@25b4.retryWithBackoff$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(0, null, null, this);
        C1C7U.LIZIZ("SocialAffinityManager@25b4.retryWithBackoff$1");
        return objLIZ;
    }
}
