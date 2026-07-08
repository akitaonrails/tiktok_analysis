package X;

import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import com.bytedance.createx.editor.gesture.GestureInteractItem;

/* JADX INFO: renamed from: X.0F2M, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1294060jmO
public final class C0F2M extends AbstractC2255721DQs<C05YF> implements InterfaceC379610EuV, C05YF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final C01GW LLILLL = C1449630npJ.LIZ(this, InterfaceC1460000o62.class);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0F2M.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    private final InterfaceC1461390o8H X1() {
        return (InterfaceC1461390o8H) this.LLILZ.getValue(this, LLILZIL[0]);
    }

    public final InterfaceC1460000o62 W1() {
        return (InterfaceC1460000o62) this.LLILLL.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().LIZIZ(new GestureInteractItem(0, new AbstractC21664419qU() { // from class: X.0F2N
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (this.LL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return false;
                }
                this.LL.W1().Ws(3);
                return this instanceof C1417630mzh;
            }
        }));
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0F2M(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
