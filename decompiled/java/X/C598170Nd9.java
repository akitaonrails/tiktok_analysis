package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Nd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment$enablePrefetchAction$creatorInfo$1", f = "TabStoreFragment.kt", l = {249, 250}, m = "invokeSuspend")
public final class C598170Nd9 extends C09AX implements Function1<InterfaceC1364105Vn<? super Response<n>>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<AnonymousClass0957<Response<n>>> LLILLL;
    public final /* synthetic */ TabStoreFragment LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598170Nd9(C259800zU<AnonymousClass0957<Response<n>>> c259800zU, TabStoreFragment tabStoreFragment, String str, String str2, InterfaceC1364105Vn<? super C598170Nd9> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = tabStoreFragment;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598170Nd9(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<AnonymousClass0957<Response<n>>> c259800zU;
        T t;
        Object obj2;
        Object obj3 = obj;
        C1C7U.LIZ("TabStoreFragment@633c.enablePrefetchAction$creatorInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj3);
                    obj2 = obj3;
                    C1C7U.LIZIZ("TabStoreFragment@633c.enablePrefetchAction$creatorInfo$1");
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c259800zU = this.LL;
            C155000ia.LIZIZ(obj3);
            t = obj3;
        } else {
            C155000ia.LIZIZ(obj3);
            c259800zU = this.LLILLL;
            TabStoreFragment tabStoreFragment = this.LLILZ;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            AnonymousClass0957<Response<n>> anonymousClass0957 = c259800zU.element;
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            Object objZS = tabStoreFragment.ZS(str, str2, anonymousClass0957, true, this);
            t = objZS;
            if (objZS == objLJFF) {
                C1C7U.LIZIZ("TabStoreFragment@633c.enablePrefetchAction$creatorInfo$1");
                return objLJFF;
            }
        }
        c259800zU.element = t;
        IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
        obj2 = null;
        if (iECommerceShowcaseService != null) {
            String str3 = this.LLILZ.zS().id;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("current_page", "profile"));
            this.LL = null;
            this.LLILLJJLI = 2;
            Object objLJFF2 = iECommerceShowcaseService.LJFF(str3, mapLJIIJ, this, true);
            obj2 = objLJFF2;
            if (objLJFF2 == objLJFF) {
                C1C7U.LIZIZ("TabStoreFragment@633c.enablePrefetchAction$creatorInfo$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TabStoreFragment@633c.enablePrefetchAction$creatorInfo$1");
        return obj2;
    }
}
