package X;

import android.util.Log;
import com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarCameraSceneV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HLF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.view.BaseSocialAvatarCameraScene$onCreateView$1$1$1", f = "BaseSocialAvatarCameraScene.kt", l = {160}, m = "invokeSuspend")
public final class C0HLF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<C05P0<C0HLS>> LLILLJJLI;
    public final /* synthetic */ BaseSocialAvatarCameraScene LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HLF(C259800zU<C05P0<C0HLS>> c259800zU, BaseSocialAvatarCameraScene baseSocialAvatarCameraScene, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C0HLF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = baseSocialAvatarCameraScene;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HLF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSocialAvatarCameraScene@f160.onCreateView$1$1$1");
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
            if (this.LLILLJJLI.element.getValue() == C0HLS.DEFAULT) {
                C0HLI c0hli = C0HLI.LIZ;
                this.LL = 1;
                obj = c0hli.LJII(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaseSocialAvatarCameraScene@f160.onCreateView$1$1$1");
                    return objLJFF;
                }
            } else {
                if (!this.LLILZ.getValue().booleanValue()) {
                    C0HLG.LJ(C0HLE.SHOW, this.LLILLJJLI.element.getValue(), ((SocialAvatarCameraSceneV2) this.LLILLL).LLLF.LLJLLL.LJIILLIIL);
                    this.LLILZ.setValue(Boolean.TRUE);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaseSocialAvatarCameraScene@f160.onCreateView$1$1$1");
                return unit;
            }
        }
        if (obj != null) {
            this.LLILLJJLI.element.setValue(obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showing error dialog updated fail reason ");
            sbLIZ.append(obj);
            C2286608xc.LJ(Log.d("TikTokSAARootGroupScene", C2188811AlT.LIZIZ(sbLIZ)));
        }
        if (!this.LLILZ.getValue().booleanValue()) {
            C0HLG.LJ(C0HLE.SHOW, this.LLILLJJLI.element.getValue(), ((SocialAvatarCameraSceneV2) this.LLILLL).LLLF.LLJLLL.LJIILLIIL);
            this.LLILZ.setValue(Boolean.TRUE);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseSocialAvatarCameraScene@f160.onCreateView$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
