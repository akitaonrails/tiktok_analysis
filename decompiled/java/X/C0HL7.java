package X;

import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HL7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2$CameraPage$3$2$1", f = "SocialAvatarCameraSceneV2.kt", l = {}, m = "invokeSuspend")
public final class C0HL7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC439650HLv LL;
    public final /* synthetic */ SocialAvatarCameraSceneV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HL7(InterfaceC439650HLv interfaceC439650HLv, SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2, InterfaceC1364105Vn<? super C0HL7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC439650HLv;
        this.LLILLJJLI = socialAvatarCameraSceneV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HL7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == EnumC444760HcI.MUGSHOT_TAKEN) {
            SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2 = this.LLILLJJLI.LLLF;
            C0HLG.LIZIZ(socialAvatarCreationViewModelV2.LLJLLL, C0HLB.SHOW, socialAvatarCreationViewModelV2.LLJLLIL ? 1 : 0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
