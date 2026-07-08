package X;

import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$collectSharerState$1$state$1", f = "SharedVideoDeepLinkHelper.kt", l = {275}, m = "invokeSuspend")
public final class C612530O0t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C612550O0v>, Object> {
    public int LL;
    public final /* synthetic */ SharedVideoDeepLinkHelper LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612530O0t(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, InterfaceC1364105Vn<? super C612530O0t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sharedVideoDeepLinkHelper;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C612530O0t(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharedVideoDeepLinkHelper@a50d.collectSharerState$1$state$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<C612550O0v> c05yd = this.LLILLJJLI.LLILZ;
            C612520O0s c612520O0s = new C612520O0s(null);
            this.LL = 1;
            obj = C09IC.LJIJJ(c05yd, this, c612520O0s);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SharedVideoDeepLinkHelper@a50d.collectSharerState$1$state$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SharedVideoDeepLinkHelper@a50d.collectSharerState$1$state$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C612550O0v> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
