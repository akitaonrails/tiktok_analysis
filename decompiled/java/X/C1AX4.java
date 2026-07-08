package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: renamed from: X.1AX4, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1AX4 extends C972430bPd implements InterfaceC937820aVo {
    public Rect LLILLJJLI;
    public Rect LLILLL;
    public Rect LLILZ;
    public int[] LLILZIL;
    public int LLILZLL;

    @Override // X.InterfaceC937820aVo
    public final boolean LJZI() {
        return false;
    }

    public abstract /* synthetic */ List<InterfaceC937840aVq> getAllLayoutWindows();

    public abstract /* synthetic */ Rect getContainerActualRange();

    @InterfaceC1294060jmO
    public abstract /* synthetic */ Rect getContainerAllRange();

    public abstract /* synthetic */ String getLayoutBusinessType();

    public abstract /* synthetic */ String getLayoutId();

    @InterfaceC1294060jmO
    public abstract /* synthetic */ String getLayoutName();

    public abstract /* synthetic */ Integer getLayoutScene();

    @InterfaceC1294060jmO
    public abstract /* synthetic */ Rect getPlayerRange();

    public abstract /* synthetic */ String getRealDrawLayoutId();

    public final Rect getMActualShowAreaInWindow() {
        return this.LLILLJJLI;
    }

    public final Rect getMAllAreaInWindow() {
        return this.LLILLL;
    }

    public final int[] getMParentLeftAndTop() {
        return this.LLILZIL;
    }

    public final Rect getMPlayerAreaRect() {
        return this.LLILZ;
    }

    public int getNotAddViewOpt() {
        return this.LLILZLL;
    }

    public C1AX4(Context context) {
        super(context);
        this.LLILLJJLI = new Rect();
        this.LLILLL = new Rect();
        this.LLILZ = new Rect();
        this.LLILZIL = new int[2];
    }

    public final boolean LIZIZ(C1AXI c1axi) {
        if (getNotAddViewOpt() < 2) {
            if (getNotAddViewOpt() == 1) {
                String str = c1axi.LIZJ;
                if (str != null && str.length() != 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final void setMActualShowAreaInWindow(Rect rect) {
        this.LLILLJJLI = rect;
    }

    public final void setMAllAreaInWindow(Rect rect) {
        this.LLILLL = rect;
    }

    public final void setMParentLeftAndTop(int[] iArr) {
        this.LLILZIL = iArr;
    }

    public final void setMPlayerAreaRect(Rect rect) {
        this.LLILZ = rect;
    }

    @Override // X.InterfaceC937820aVo
    public void setNotAddViewOpt(int i) {
        this.LLILZLL = i;
    }
}
