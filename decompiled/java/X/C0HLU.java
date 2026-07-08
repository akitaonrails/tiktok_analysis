package X;

import com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HLU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene$onCreateView$1$1$8$1", f = "BaseSocialAvatarCameraScene.kt", l = {}, m = "invokeSuspend")
public final class C0HLU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseSocialAvatarCameraScene LL;
    public final /* synthetic */ EnumC439280HKk LLILLJJLI;
    public final /* synthetic */ C05P1<EnumC439580HLo> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0HLU(BaseSocialAvatarCameraScene baseSocialAvatarCameraScene, EnumC439280HKk enumC439280HKk, C05P1<? extends EnumC439580HLo> c05p1, InterfaceC1364105Vn<? super C0HLU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseSocialAvatarCameraScene;
        this.LLILLJJLI = enumC439280HKk;
        this.LLILLL = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HLU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0HLV c0hlv;
        C1C7U.LIZ("BaseSocialAvatarCameraScene@f160.onCreateView$1$1$8$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0HL8 c0hl8 = ((SocialAvatarCameraSceneV2) this.LL).LLLF.LLJLLL;
        EnumC439680HLy enumC439680HLy = EnumC439680HLy.SHOW;
        int i = C439290HKl.LIZ[this.LLILLJJLI.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c0hlv = null;
                } else {
                    c0hlv = C0HLV.UPLOADING;
                }
            } else {
                c0hlv = C0HLV.QUEUE;
            }
        } else {
            c0hlv = C0HLV.GENERATING;
        }
        if (this.LLILLL.getValue() != EnumC439580HLo.ALLOWED) {
            z = false;
        }
        C0HLG.LJFF(c0hl8, enumC439680HLy, c0hlv, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSocialAvatarCameraScene@f160.onCreateView$1$1$8$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
