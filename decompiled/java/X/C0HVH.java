package X;

import com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0HVH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent", f = "IMDetailPageComponent.kt", l = {379}, m = "onAwemeChangedAsync")
public final class C0HVH extends AbstractC23140094w {
    public Aweme LL;
    public Aweme LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IMDetailPageComponent LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HVH(IMDetailPageComponent iMDetailPageComponent, InterfaceC1364105Vn<? super C0HVH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = iMDetailPageComponent;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IMDetailPageComponent@9866.onAwemeChangedAsync$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objWp = this.LLILZ.Wp(null, this);
        C1C7U.LIZIZ("IMDetailPageComponent@9866.onAwemeChangedAsync$1");
        return objWp;
    }
}
