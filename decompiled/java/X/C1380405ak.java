package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS368S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.05ak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "invokeSuspend")
public final class C1380405ak extends C09AX implements Function2<InterfaceC1380505al, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function2<Function1<? super C1394605d2, Unit>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ C1380605am LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1380405ak(Function2<? super Function1<? super C1394605d2, Unit>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, C1380605am c1380605am, InterfaceC1364105Vn<? super C1380405ak> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function2;
        this.LLILZ = c1380605am;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1380405ak c1380405ak = new C1380405ak(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1380405ak.LLILLJJLI = obj;
        return c1380405ak;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC1380505al interfaceC1380505al = (InterfaceC1380505al) this.LLILLJJLI;
            Function2<Function1<? super C1394605d2, Unit>, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
            AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2(interfaceC1380505al, this.LLILZ, 108);
            this.LL = 1;
            if (function2.invoke(awS368S0200000_2, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1380505al interfaceC1380505al, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1380505al, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
