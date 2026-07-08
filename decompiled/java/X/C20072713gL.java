package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13gL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {88}, m = "invokeSuspend")
public final class C20072713gL extends C09AX implements Function2<Float, InterfaceC1364105Vn<? super Float>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public /* synthetic */ float LLILLL;
    public final /* synthetic */ ScrollCaptureCallbackC20081513hl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20072713gL(ScrollCaptureCallbackC20081513hl scrollCaptureCallbackC20081513hl, InterfaceC1364105Vn<? super C20072713gL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = scrollCaptureCallbackC20081513hl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20072713gL c20072713gL = new C20072713gL(this.LLILZ, interfaceC1364105Vn);
        c20072713gL.LLILLL = ((Number) obj).floatValue();
        return c20072713gL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        float fIntBitsToFloat;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                z = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            float f = this.LLILLL;
            Function2 function2 = (Function2) C20069413fo.LIZ(this.LLILZ.LIZ.LIZLLL, C1694480uCE.LJ);
            if (function2 != null) {
                z = ((C1869430ykP) this.LLILZ.LIZ.LIZLLL.LJIIIIZZ(C1696500uFU.LJIJJ)).LIZJ;
                if (z) {
                    f = -f;
                }
                C1378605aS c1378605aS = new C1378605aS((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
                this.LL = z;
                this.LLILLJJLI = 1;
                obj = function2.invoke(c1378605aS, this);
                if (obj == objLJFF) {
                    return objLJFF;
                }
            } else {
                C1696250uF5.LIZJ("Required value was null.");
                throw new C2197108jB();
            }
        }
        long j = ((C1378605aS) obj).LIZ;
        if (z) {
            fIntBitsToFloat = -Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return C2286608xc.LIZLLL(fIntBitsToFloat);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Float f, InterfaceC1364105Vn<? super Float> interfaceC1364105Vn) {
        return ((a) create(Float.valueOf(f.floatValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
