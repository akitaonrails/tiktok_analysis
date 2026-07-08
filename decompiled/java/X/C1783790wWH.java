package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.camera.core.scheduler.IMCameraCoreStatusFlow$notify$1", f = "IMCameraCoreStatusFlow.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1783790wWH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1783840wWM LLILLJJLI;
    public final /* synthetic */ C0N6K LLILLL;
    public final /* synthetic */ EnumC1778630wNx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783790wWH(C1783840wWM c1783840wWM, C0N6K c0n6k, EnumC1778630wNx enumC1778630wNx, InterfaceC1364105Vn<? super C1783790wWH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1783840wWM;
        this.LLILLL = c0n6k;
        this.LLILZ = enumC1778630wNx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783790wWH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCameraCoreStatusFlow@63e0.notify$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    ((C05YC) obj).LIZJ(new C1779160wOo(this.LLILZ));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMCameraCoreStatusFlow@63e0.notify$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1783840wWM c1783840wWM = this.LLILLJJLI;
            C0N6K c0n6k = this.LLILLL;
            this.LL = 1;
            obj = c1783840wWM.LIZIZ(c0n6k, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMCameraCoreStatusFlow@63e0.notify$1");
                return objLJFF;
            }
        }
        ((C05YC) obj).LIZJ(new C1779160wOo(this.LLILZ));
        C1783840wWM c1783840wWM2 = this.LLILLJJLI;
        C0N6K c0n6k2 = this.LLILLL;
        this.LL = 2;
        obj = c1783840wWM2.LIZ(c0n6k2, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("IMCameraCoreStatusFlow@63e0.notify$1");
            return objLJFF;
        }
        ((C05YC) obj).LIZJ(new C1779160wOo(this.LLILZ));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMCameraCoreStatusFlow@63e0.notify$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
