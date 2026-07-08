package X;

import Y.ARunnableS43S0300000_10;
import Y.ATListenerS444S0100000_10;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0Qn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680740Qn2 {
    public final Activity LIZ;
    public final C671260QUq LIZIZ;
    public ImageView LIZJ;
    public boolean LIZLLL;
    public InterfaceC214902198i LJ;
    public ViewTreeObserverOnDrawListenerC680750Qn3 LJFF;

    public final void LIZ() {
        Bitmap bitmap;
        ViewGroup viewGroup;
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        LIZIZ();
        ImageView imageView = this.LIZJ;
        if (imageView == null) {
            return;
        }
        this.LIZJ = null;
        View decorView = this.LIZ.getWindow().getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
            C786410Ut5.LJJJLZIJ(imageView, viewGroup);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[dismiss] overlay removed at lifecycleEnd=");
        sbLIZ.append(this.LIZIZ.LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        C671260QUq c671260QUq = this.LIZIZ;
        if (c671260QUq.LJFF && (bitmap = c671260QUq.LIZIZ) != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        InterfaceC214902198i interfaceC214902198i = this.LJ;
        if (interfaceC214902198i != null) {
            C0QLE.LIZ.getClass();
            C0QLE.LIZIZ.remove(interfaceC214902198i);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[SAFPlaceholder] unregistered for ");
            sbLIZ2.append(interfaceC214902198i.getClass().getSimpleName());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LJ = null;
    }

    public final void LIZIZ() {
        ViewTreeObserverOnDrawListenerC680750Qn3 viewTreeObserverOnDrawListenerC680750Qn3 = this.LJFF;
        if (viewTreeObserverOnDrawListenerC680750Qn3 == null) {
            return;
        }
        this.LJFF = null;
        ImageView imageView = this.LIZJ;
        if (imageView != null && imageView.getViewTreeObserver().isAlive()) {
            C786410Ut5.B3(imageView.getViewTreeObserver(), viewTreeObserverOnDrawListenerC680750Qn3);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Qn3, android.view.ViewTreeObserver$OnDrawListener] */
    public final void LIZJ() {
        ViewGroup viewGroup;
        if (this.LIZLLL || this.LIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[show] skip: dismissed=");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(", alreadyShowing=");
            sbLIZ.append(this.LIZJ != null);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        Bitmap bitmap = this.LIZIZ.LIZIZ;
        if (bitmap == null) {
            return;
        }
        View decorView = this.LIZ.getWindow().getDecorView();
        if (!(decorView instanceof ViewGroup) || (viewGroup = (ViewGroup) decorView) == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[show] bitmap=");
        sbLIZ2.append(bitmap.getWidth());
        sbLIZ2.append('x');
        sbLIZ2.append(bitmap.getHeight());
        sbLIZ2.append(", lifecycleEnd=");
        sbLIZ2.append(this.LIZIZ.LIZLLL);
        sbLIZ2.append(", hasClickCallback=");
        sbLIZ2.append(this.LIZIZ.LJI != null);
        sbLIZ2.append(", hasFirstDrawCallback=");
        sbLIZ2.append(this.LIZIZ.LJII != null);
        C2188811AlT.LIZIZ(sbLIZ2);
        final ImageView imageView = new ImageView(this.LIZ);
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setElevation(Float.MAX_VALUE);
        imageView.setOnTouchListener(new ATListenerS444S0100000_10(this, 1));
        viewGroup.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        this.LIZJ = imageView;
        final InterfaceC680770Qn5 interfaceC680770Qn5 = this.LIZIZ.LJII;
        if (interfaceC680770Qn5 != null) {
            ?? r1 = new ViewTreeObserver.OnDrawListener() { // from class: X.0Qn3
                public boolean LL;

                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    if (this.LL) {
                        return;
                    }
                    this.LL = true;
                    View view = imageView;
                    HandlerHook.viewPost(view, new ARunnableS43S0300000_10(interfaceC680770Qn5, this, view, 1));
                }
            };
            this.LJFF = r1;
            C786410Ut5.w3(imageView.getViewTreeObserver(), r1);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[show] overlay added to decorView, lifecycleEnd=");
        sbLIZ3.append(this.LIZIZ.LIZLLL);
        sbLIZ3.append(", dismissDelayMs=");
        sbLIZ3.append(this.LIZIZ.LJ);
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    public C680740Qn2(Activity activity, C671260QUq c671260QUq) {
        this.LIZ = activity;
        this.LIZIZ = c671260QUq;
    }
}
