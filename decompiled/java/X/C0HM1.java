package X;

import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HM1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraBottomShutterGuideViewKt$SocialAvatarCameraBottomShutterGuideView$1$1$3$1$1", f = "SocialAvatarCameraBottomShutterGuideView.kt", l = {214, 216, 218, 221, 221}, m = "invokeSuspend")
public final class C0HM1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SocialAvatarCreationViewModelV2 LLILLL;
    public final /* synthetic */ C0HML LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HM1(SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, C0HML c0hml, Function0<Unit> function0, InterfaceC1364105Vn<? super C0HM1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = socialAvatarCreationViewModelV2;
        this.LLILZ = c0hml;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HM1 c0hm1 = new C0HM1(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0hm1.LLILLJJLI = obj;
        return c0hm1;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HM1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
