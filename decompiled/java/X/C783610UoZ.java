package X;

import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.billboard.ViewerWishesFeedWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.billboard.ViewerWishesFeedWidget$createDismissTask$1", f = "ViewerWishesFeedWidget.kt", l = {169}, m = "invokeSuspend")
public final class C783610UoZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ViewerWishesFeedWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783610UoZ(ViewerWishesFeedWidget viewerWishesFeedWidget, InterfaceC1364105Vn<? super C783610UoZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = viewerWishesFeedWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783610UoZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ViewerWishesFeedWidget@c16a.createDismissTask$1");
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
            long j = ((long) ViewerWishesConfig.INSTANCE.getGetValue().resultDisplaySec) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ViewerWishesFeedWidget@c16a.createDismissTask$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.O1();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewerWishesFeedWidget@c16a.createDismissTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
