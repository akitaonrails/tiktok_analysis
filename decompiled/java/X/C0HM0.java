package X;

import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HM0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraBottomShutterGuideViewKt$SocialAvatarCameraBottomShutterGuideView$1$1$3$1$1$photoJob$1", f = "SocialAvatarCameraBottomShutterGuideView.kt", l = {}, m = "invokeSuspend")
public final class C0HM0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarCreationViewModelV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HM0(SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, InterfaceC1364105Vn<? super C0HM0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarCreationViewModelV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HM0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCameraBottomShutterGuideViewKt@ffbb.SocialAvatarCameraBottomShutterGuideView$1$1$3$1$1$photoJob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.EQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCameraBottomShutterGuideViewKt@ffbb.SocialAvatarCameraBottomShutterGuideView$1$1$3$1$1$photoJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
