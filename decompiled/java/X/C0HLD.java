package X;

import com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HLD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene$onCreateView$1$1$9$1", f = "BaseSocialAvatarCameraScene.kt", l = {}, m = "invokeSuspend")
public final class C0HLD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseSocialAvatarCameraScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HLD(BaseSocialAvatarCameraScene baseSocialAvatarCameraScene, InterfaceC1364105Vn<? super C0HLD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseSocialAvatarCameraScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HLD(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSocialAvatarCameraScene@f160.onCreateView$1$1$9$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BaseSocialAvatarCameraScene baseSocialAvatarCameraScene = this.LL;
        ((SocialAvatarCameraSceneV2) baseSocialAvatarCameraScene).LLLF.LLJLLL.LJIILIIL = "complete_creation";
        baseSocialAvatarCameraScene.finish();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSocialAvatarCameraScene@f160.onCreateView$1$1$9$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
