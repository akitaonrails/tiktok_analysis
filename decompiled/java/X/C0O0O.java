package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O0O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent$preloadHorizontalImage$1", f = "PhotoSlideViewPagerComponent.kt", l = {}, m = "invokeSuspend")
public final class C0O0O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PhotoSlideViewPagerComponent LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O0O(PhotoSlideViewPagerComponent photoSlideViewPagerComponent, Context context, int i, InterfaceC1364105Vn<? super C0O0O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoSlideViewPagerComponent;
        this.LLILLJJLI = context;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O0O(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("PhotoSlideViewPagerComponent@2e84.preloadHorizontalImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0RF0 c0rf0 = this.LL.jm().LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        C0SPO.LJFF(this.LLILLJJLI, ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme(), str, this.LLILLL, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSlideViewPagerComponent@2e84.preloadHorizontalImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
