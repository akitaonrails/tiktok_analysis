package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraSceneViewsKt$AimeCameraBottomControlView$1$1", f = "AimeCameraSceneViews.kt", l = {203}, m = "invokeSuspend")
public final class C1303460k1Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05P0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C05P0<EnumC1002550cCD> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303460k1Y(boolean z, C05P0<EnumC1002550cCD> c05p0, InterfaceC1364105Vn<? super C1303460k1Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1303460k1Y(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05P0<EnumC1002550cCD> c05p0;
        EnumC1002550cCD enumC1002550cCD;
        C1C7U.LIZ("AimeCameraSceneViewsKt@73e1.AimeCameraBottomControlView$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c05p0 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c05p0 = this.LLILZ;
            if (this.LLILLL) {
                this.LL = c05p0;
                this.LLILLJJLI = 1;
                if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                    C1C7U.LIZIZ("AimeCameraSceneViewsKt@73e1.AimeCameraBottomControlView$1$1");
                    return objLJFF;
                }
            } else {
                enumC1002550cCD = EnumC1002550cCD.DONE;
                c05p0.setValue(enumC1002550cCD);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AimeCameraSceneViewsKt@73e1.AimeCameraBottomControlView$1$1");
                return unit;
            }
        }
        enumC1002550cCD = EnumC1002550cCD.DONE_WITH_BUTTONS;
        c05p0.setValue(enumC1002550cCD);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AimeCameraSceneViewsKt@73e1.AimeCameraBottomControlView$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
