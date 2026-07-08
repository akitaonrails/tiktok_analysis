package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl", f = "TabCommerceFragmentImpl.kt", l = {104, 107, 111}, m = "retryOrEnter")
public final class C598200NdC<T> extends AbstractC23140094w {
    public C1749280vcc LL;
    public Function1 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TabCommerceFragmentImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598200NdC(TabCommerceFragmentImpl tabCommerceFragmentImpl, InterfaceC1364105Vn<? super C598200NdC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = tabCommerceFragmentImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabCommerceFragmentImpl@8414.retryOrEnter$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objGS = this.LLILZ.GS(null, null, this);
        C1C7U.LIZIZ("TabCommerceFragmentImpl@8414.retryOrEnter$1");
        return objGS;
    }
}
