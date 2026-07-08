package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6K, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.navigation.StoryRouterParamsBuilder$mobShoot$1", f = "StoryRouterParamsBuilder.kt", l = {}, m = "invokeSuspend")
public final class C0L6K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C563760M9e LL;
    public final /* synthetic */ EnterStoryParam LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L6K(C563760M9e c563760M9e, EnterStoryParam enterStoryParam, ShortVideoContext shortVideoContext, InterfaceC1364105Vn<? super C0L6K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c563760M9e;
        this.LLILLJJLI = enterStoryParam;
        this.LLILLL = shortVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L6K(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryRouterParamsBuilder@b7.mobShoot$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C563760M9e c563760M9e = this.LL;
        EnterStoryParam enterStoryParam = this.LLILLJJLI;
        ShortVideoContext shortVideoContext = this.LLILLL;
        c563760M9e.getClass();
        C563760M9e.LIZJ(enterStoryParam, shortVideoContext);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryRouterParamsBuilder@b7.mobShoot$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
