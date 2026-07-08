package X;

import com.google.gson.n;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ncr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment$enablePrefetchAction$deferred$1", f = "TabStoreFragment.kt", l = {255}, m = "invokeSuspend")
public final class C597990Ncr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TemplateData>, Object> {
    public TabStoreFragment LL;
    public Object LLILLJJLI;
    public Response LLILLL;
    public int LLILZ;
    public final /* synthetic */ TabStoreFragment LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Response<n> LLIZ;
    public final /* synthetic */ C259800zU<AnonymousClass0957<Response<n>>> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597990Ncr(TabStoreFragment tabStoreFragment, String str, Response<n> response, C259800zU<AnonymousClass0957<Response<n>>> c259800zU, InterfaceC1364105Vn<? super C597990Ncr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = tabStoreFragment;
        this.LLILZLL = str;
        this.LLIZ = response;
        this.LLIZLLLIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597990Ncr(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TabStoreFragment tabStoreFragment;
        String str;
        Response<n> response;
        C1C7U.LIZ("TabStoreFragment@633c.enablePrefetchAction$deferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                response = this.LLILLL;
                str = (String) this.LLILLJJLI;
                tabStoreFragment = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            tabStoreFragment = this.LLILZIL;
            str = this.LLILZLL;
            response = this.LLIZ;
            AnonymousClass0957<Response<n>> anonymousClass0957 = this.LLIZLLLIL.element;
            this.LL = tabStoreFragment;
            this.LLILLJJLI = str;
            this.LLILLL = response;
            this.LLILZ = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TabStoreFragment@633c.enablePrefetchAction$deferred$1");
                return objLJFF;
            }
        }
        TemplateData templateDataFT = tabStoreFragment.fT(str, response, obj);
        C1C7U.LIZIZ("TabStoreFragment@633c.enablePrefetchAction$deferred$1");
        return templateDataFT;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TemplateData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
