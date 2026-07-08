package X;

import android.graphics.PointF;
import android.util.Size;
import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FD2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FD2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C817403Hg LL;
    public final /* synthetic */ C817403Hg LLILLJJLI;
    public final /* synthetic */ C0FD1 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ PointF LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ SurfaceView LLJIJIL;
    public final /* synthetic */ InterfaceC1685420txc<SurfaceView, Float, Float, Float, Float, Unit> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FD2(C817403Hg c817403Hg, C817403Hg c817403Hg2, C0FD1 c0fd1, int i, int i2, float f, float f2, PointF pointF, float f3, int i3, SurfaceView surfaceView, InterfaceC1685420txc<? super SurfaceView, ? super Float, ? super Float, ? super Float, ? super Float, Unit> interfaceC1685420txc) {
        super(0);
        this.LL = c817403Hg;
        this.LLILLJJLI = c817403Hg2;
        this.LLILLL = c0fd1;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = f;
        this.LLIZ = f2;
        this.LLIZLLLIL = pointF;
        this.LLJ = f3;
        this.LLJI = i3;
        this.LLJIJIL = surfaceView;
        this.LLJILJIL = interfaceC1685420txc;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        if (Math.abs(this.LL.element) <= Float.MAX_VALUE && Math.abs(this.LLILLJJLI.element) <= Float.MAX_VALUE) {
            Size sizeLJJIJIIJI = C0FD1.LJJIJIIJI(C350870DpF.LJI(this.LLILLL.LIZ).getCanvasRatio(), this.LLILZ, this.LLILZIL);
            this.LL.element = this.LLILZLL / sizeLJJIJIIJI.getWidth();
            this.LLILLJJLI.element = this.LLIZ / sizeLJJIJIIJI.getHeight();
            this.LLJIJIL.setPivotX(this.LLIZLLLIL.x);
            this.LLJIJIL.setPivotY(this.LLIZLLLIL.y);
            InterfaceC1685420txc<SurfaceView, Float, Float, Float, Float, Unit> interfaceC1685420txc = this.LLJILJIL;
            if (interfaceC1685420txc != null) {
                interfaceC1685420txc.invoke(this.LLJIJIL, Float.valueOf(this.LL.element), Float.valueOf(this.LLILLJJLI.element), Float.valueOf(-this.LLJI), Float.valueOf(-this.LLJ));
            } else {
                C786410Ut5.Nb(this.LLJIJIL, this.LL.element);
                C786410Ut5.oc(this.LLJIJIL, this.LLILLJJLI.element);
                C786410Ut5.dd(this.LLJIJIL, -this.LLJ);
                C786410Ut5.Ic(this.LLJIJIL, -this.LLJI);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getSurfaceView, thread=");
                sbLIZ.append(C786410Ut5.u3().getName());
                C355090Dw3.LIZIZ("EP_ANR_OPT", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return Unit.LIZ;
    }
}
