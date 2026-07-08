package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraScene$AimeCameraView$1$1", f = "AimeCameraScene.kt", l = {}, m = "invokeSuspend")
public final class C1684450tw3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AimeCameraScene LL;
    public final /* synthetic */ C05P1<C1684510tw9> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1684450tw3(AimeCameraScene aimeCameraScene, C05P1<C1684510tw9> c05p1, InterfaceC1364105Vn<? super C1684450tw3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aimeCameraScene;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1684450tw3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AimeCameraScene@a30c.AimeCameraView$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (AimeCameraScene.LLLLLLLLL(this.LLILLJJLI).LIZ == EnumC1684470tw5.DONE || AimeCameraScene.LLLLLLLLL(this.LLILLJJLI).LIZ == EnumC1684470tw5.NO_CAMERA_PERMISSION) {
            this.LL.LLLLLLJ(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AimeCameraScene@a30c.AimeCameraView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
