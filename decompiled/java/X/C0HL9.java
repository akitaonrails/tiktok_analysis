package X;

import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HL9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2$CameraPage$3$1$1", f = "SocialAvatarCameraSceneV2.kt", l = {}, m = "invokeSuspend")
public final class C0HL9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarCameraSceneV2 LL;
    public final /* synthetic */ InterfaceC1676320tiw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HL9(SocialAvatarCameraSceneV2 socialAvatarCameraSceneV2, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C0HL9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarCameraSceneV2;
        this.LLILLJJLI = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HL9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZLLL = this.LLILLJJLI.LIZLLL();
        if (iLIZLLL == 2131826306) {
            this.LL.LLLF.LLJLLL.LJIJ++;
        } else if (iLIZLLL == 2131826307) {
            this.LL.LLLF.LLJLLL.LJIIZILJ++;
        } else if (iLIZLLL == 2131826305) {
            this.LL.LLLF.LLJLLL.LJIJJ++;
        } else if (iLIZLLL == 2131826307) {
            this.LL.LLLF.LLJLLL.LJIJJ++;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCameraSceneV2@19c6.CameraPage$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
