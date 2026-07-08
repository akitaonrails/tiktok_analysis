package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;

/* JADX INFO: renamed from: X.0NdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment", f = "TabStoreFragment.kt", l = {294}, m = "productsAsync")
public final class C598240NdG extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public AnonymousClass0957 LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ TabStoreFragment LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598240NdG(TabStoreFragment tabStoreFragment, InterfaceC1364105Vn<? super C598240NdG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = tabStoreFragment;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabStoreFragment@633c.productsAsync$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objZS = this.LLILZLL.ZS(null, null, null, false, this);
        C1C7U.LIZIZ("TabStoreFragment@633c.productsAsync$1");
        return objZS;
    }
}
