package X;

import android.view.MotionEvent;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0eWV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092010eWV extends C09AY implements InterfaceC1685420txc<Float, Float, Float, Float, MotionEvent, Unit> {
    public final /* synthetic */ C1092100eWe LL;
    public final /* synthetic */ C1092090eWd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092010eWV(C1092100eWe c1092100eWe, C1092090eWd c1092090eWd) {
        super(5);
        this.LL = c1092100eWe;
        this.LLILLJJLI = c1092090eWd;
    }

    @Override // X.InterfaceC1685420txc
    public final Unit invoke(Float f, Float f2, Float f3, Float f4, MotionEvent motionEvent) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        float fFloatValue3 = f3.floatValue();
        float fFloatValue4 = f4.floatValue();
        MotionEvent motionEvent2 = motionEvent;
        InterfaceC1631630sYr<Float, Float, Float, Float, Unit> interfaceC1631630sYr = this.LL.LJIILIIL;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3), Float.valueOf(fFloatValue4));
        }
        this.LLILLJJLI.LIZLLL(this.LL, fFloatValue2, motionEvent2);
        return Unit.LIZ;
    }
}
