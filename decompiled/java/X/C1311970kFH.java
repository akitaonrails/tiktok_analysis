package X;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.PropBundle;

/* JADX INFO: renamed from: X.0kFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1311970kFH {
    public final int LIZJ;
    public final PlatformRendererContext LIZLLL;
    public InterfaceC1311940kFE LJI;
    public LynxUI<ViewGroup> LJII;
    public final Rect LIZ = new Rect();
    public final Point LIZIZ = new Point();
    public C1312710kGT LJ = null;
    public final C1311990kFJ LJFF = new C1311990kFJ();
    public C1313230kHJ LJIIIIZZ = null;
    public int LJIIIZ = 2;

    public void LIZLLL() {
    }

    public void LJI(PropBundle propBundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF() {
        View view = this.LJI.getView();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof InterfaceC1311940kFE) {
                    Rect rect = ((InterfaceC1311940kFE) childAt).getRenderer().LIZ;
                    childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
            }
        }
    }

    public final void LIZ(Canvas canvas) {
        this.LJ.LIZIZ(canvas);
        C1312710kGT c1312710kGT = this.LJ;
        c1312710kGT.LLJILLL = 0;
        c1312710kGT.LLJJ = 0;
        c1312710kGT.LLJJI = 0;
        c1312710kGT.LLJJIII = 0;
        c1312710kGT.LLJJIJIIJIL.clear();
    }

    public final void LIZJ(int i) {
        if (this.LJI.getView() == null) {
            return;
        }
        this.LJI.getView().invalidate();
        if ((i & 1) != 0 && (this.LJI.getView().getParent() instanceof View) && (this.LJI.getView().getParent() instanceof View)) {
            ((View) this.LJI.getView().getParent()).invalidate();
        }
        if ((i & 2) != 0) {
            this.LJIIIZ = 2;
        }
    }

    public void LJ(Canvas canvas) {
        float[] fArr;
        int[] iArrNativeGetDisplayListLengths;
        if (this.LJIIIZ == 2) {
            PlatformRendererContext platformRendererContext = this.LIZLLL;
            int i = this.LIZJ;
            C1311990kFJ c1311990kFJ = this.LJFF;
            if (c1311990kFJ != null) {
                if (!platformRendererContext.LJI) {
                    long j = platformRendererContext.LJ;
                    if (j != 0 && (iArrNativeGetDisplayListLengths = platformRendererContext.nativeGetDisplayListLengths(j, i)) != null && iArrNativeGetDisplayListLengths.length == 3) {
                        int i2 = iArrNativeGetDisplayListLengths[0];
                        int i3 = iArrNativeGetDisplayListLengths[1];
                        int i4 = iArrNativeGetDisplayListLengths[2];
                        int[] iArr = new int[i2];
                        c1311990kFJ.LIZ = iArr;
                        int[] iArr2 = new int[i3];
                        c1311990kFJ.LIZIZ = iArr2;
                        float[] fArr2 = new float[i4];
                        c1311990kFJ.LIZJ = fArr2;
                        platformRendererContext.nativeGetDisplayListData(platformRendererContext.LJ, i, iArr, iArr2, fArr2);
                    }
                }
            } else {
                platformRendererContext.getClass();
            }
        }
        C1312710kGT c1312710kGT = this.LJ;
        if (c1312710kGT == null) {
            this.LJ = new C1312710kGT(this.LJFF, this.LIZLLL, this.LJI.getView());
        } else {
            C1311990kFJ c1311990kFJ2 = this.LJFF;
            if (c1311990kFJ2 != null && (fArr = c1311990kFJ2.LIZJ) != null && fArr.length >= 2) {
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
            }
            c1312710kGT.LL = c1311990kFJ2;
            c1312710kGT.LLJILLL = 0;
            c1312710kGT.LLJJ = 0;
            c1312710kGT.LLJJI = 0;
            c1312710kGT.LLJJIII = 0;
            c1312710kGT.LLJJIJIIJIL.clear();
        }
        this.LJIIIZ = 1;
    }

    public C1311970kFH(PlatformRendererContext platformRendererContext, int i) {
        this.LIZLLL = platformRendererContext;
        this.LIZJ = i;
    }

    public final void LIZIZ(Canvas canvas, View view) {
        this.LJ.LIZIZ(canvas);
        canvas.save();
        if (view instanceof C1311980kFI) {
            C1311980kFI c1311980kFI = (C1311980kFI) view;
            canvas.translate(-c1311980kFI.getRenderer().LIZIZ.x, -c1311980kFI.getRenderer().LIZIZ.y);
        }
    }
}
