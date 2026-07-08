package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312710kGT implements Drawable.Callback {
    public C1311990kFJ LL;
    public final C1316700kMu LLILLJJLI;
    public final Paint LLILLL;
    public final Path LLILZ = new Path();
    public final RectF LLILZIL = new RectF();
    public final float[] LLILZLL = new float[8];
    public final int[] LLIZ = new int[4];
    public final EnumC1313350kHV[] LLIZLLLIL = new EnumC1313350kHV[4];
    public final PointF LLJ = new PointF();
    public final PointF LLJI = new PointF();
    public int[] LLJIJIL;
    public float[] LLJILJIL;
    public final PlatformRendererContext LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final WeakReference<View> LLJJIJI;
    public final ArrayList<C1312720kGU> LLJJIJIIJIL;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final float LJFF() {
        int i;
        float[] fArr = this.LL.LIZJ;
        if (fArr == null || (i = this.LLJJI) >= fArr.length) {
            return 0.0f;
        }
        this.LLJJI = i + 1;
        return fArr[i];
    }

    public final int LJI() {
        int i;
        int[] iArr = this.LL.LIZIZ;
        if (iArr == null || (i = this.LLJJ) >= iArr.length) {
            return 0;
        }
        this.LLJJ = i + 1;
        return iArr[i];
    }

    public final boolean LJII() {
        View view = this.LLJJIJI.get();
        return this.LLJJIII == 1 && view != null && view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0934, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("Invalid param count: ");
        r1.append(r3);
        r1.append(", ");
        r1.append(r5);
        com.lynx.base.log.LynxLog.e("DisplayListApplier", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x094f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.graphics.Canvas r56) {
        /*
            Method dump skipped, instruction units count: 2414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1312710kGT.LIZIZ(android.graphics.Canvas):void");
    }

    public final RectF LIZJ(boolean z) {
        float scrollX;
        float scrollY;
        View view = this.LLJJIJI.get();
        if (view == null) {
            return new RectF();
        }
        if (z && (view instanceof C1318590kPx)) {
            scrollX = view.getScrollX();
            scrollY = view.getScrollY();
        } else {
            scrollX = 0.0f;
            scrollY = 0.0f;
        }
        return new RectF(scrollX, scrollY, view.getWidth() + scrollX, view.getHeight() + scrollY);
    }

    public final C1312720kGU LIZLLL(int i) {
        C1312720kGU c1312720kGULJ = LJ(i);
        if (c1312720kGULJ != null && LJII()) {
            RectF rectF = new RectF(c1312720kGULJ.LIZ);
            if (!rectF.intersect(LIZJ(false))) {
                rectF.setEmpty();
            }
            if (rectF.equals(c1312720kGULJ.LIZ)) {
                return c1312720kGULJ;
            }
            return LIZ(rectF, c1312720kGULJ);
        }
        return c1312720kGULJ;
    }

    public final C1312720kGU LJ(int i) {
        if (i >= 0 && i < this.LLJJIJIIJIL.size()) {
            return (C1312720kGU) ListProtector.get(this.LLJJIJIIJIL, i);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.LLJJIJI.get();
        if (view != null) {
            view.invalidate();
        }
    }

    public static C1312720kGU LIZ(RectF rectF, C1312720kGU c1312720kGU) {
        float[] fArr;
        RectF rectF2 = new RectF(rectF);
        float[] fArr2 = c1312720kGU.LIZIZ;
        if (fArr2 == null) {
            fArr = null;
        } else {
            fArr = (float[]) fArr2.clone();
        }
        return new C1312720kGU(rectF2, fArr);
    }

    public C1312710kGT(C1311990kFJ c1311990kFJ, PlatformRendererContext platformRendererContext, View view) {
        float[] fArr;
        new PointF();
        new PointF();
        ArrayList<C1312720kGU> arrayList = new ArrayList<>();
        this.LLJJIJIIJIL = arrayList;
        this.LL = c1311990kFJ;
        Paint paint = new Paint();
        this.LLILLL = paint;
        paint.setAntiAlias(true);
        this.LLJILLL = 0;
        this.LLJJ = 0;
        this.LLJJI = 0;
        this.LLJJIII = 0;
        arrayList.clear();
        this.LLILLJJLI = platformRendererContext.LJIIIIZZ;
        this.LLJILJILJ = platformRendererContext;
        this.LLJJIJI = new WeakReference<>(view);
        if (c1311990kFJ != null && (fArr = c1311990kFJ.LIZJ) != null && fArr.length >= 2) {
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
        }
    }
}
