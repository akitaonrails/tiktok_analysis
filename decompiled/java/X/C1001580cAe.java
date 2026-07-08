package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.hybrid.container.prerender.AdHybridCarouselTagPreRender$onPreRender$1$optionArray$1", f = "AdHybridCarouselTagPreRender.kt", l = {}, m = "invokeSuspend")
public final class C1001580cAe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1051290dSp[]>, Object> {
    public final /* synthetic */ C998450c5b LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001580cAe(C998450c5b c998450c5b, Context context, Aweme aweme, InterfaceC1364105Vn<? super C1001580cAe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c998450c5b;
        this.LLILLJJLI = context;
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001580cAe(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdHybridCarouselTagPreRender@72ca.onPreRender$1$optionArray$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1028360crq[] abstractC1028360crqArr = this.LL.LIZJ;
        C1051290dSp[] c1051290dSpArr = new C1051290dSp[abstractC1028360crqArr.length];
        int length = abstractC1028360crqArr.length;
        for (int i = 0; i < length; i++) {
            c1051290dSpArr[i] = C1000490c8t.LIZIZ(this.LLILLJJLI, this.LLILLL, i);
        }
        C1C7U.LIZIZ("AdHybridCarouselTagPreRender@72ca.onPreRender$1$optionArray$1");
        return c1051290dSpArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1051290dSp[]> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
