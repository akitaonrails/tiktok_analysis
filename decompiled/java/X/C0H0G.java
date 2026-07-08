package X;

import X.C0H0J;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0H0G, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0H0G<T extends C0H0J> extends AppCompatImageView {
    public C0H6V<C1331070kk5> LL;
    public List<? extends T> LLILLJJLI;

    public final void LIZ() {
        int iLJFF = this.LL.LJFF();
        for (int i = 0; i < iLJFF; i++) {
            this.LL.LIZJ(i).LIZLLL().setCallback(null);
        }
        this.LL.LJ();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL.LIZLLL();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.LL.LIZLLL();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        LIZ();
    }

    public final List<T> getImageInfoList() {
        return this.LLILLJJLI;
    }

    public final C0H6V<C1331070kk5> getMultiDraweeHolder() {
        return this.LL;
    }

    public C0H0G(Context context) {
        super(context, null, 0);
        this.LL = new C0H6V<>();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setDrawables(List<? extends T> list) {
        this.LLILLJJLI = list;
        this.LL.LIZIZ();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0H0J c0h0j = (C0H0J) ListProtector.get(list, i);
            C1331090kk7 c1331090kk7 = new C1331090kk7(getResources());
            c1331090kk7.LJIIZILJ = c0h0j.LIZLLL;
            c1331090kk7.LJFF = InterfaceC1320380kSq.LJI;
            C1331070kk5 c1331070kk5LIZ = c1331090kk7.LIZ();
            c1331070kk5LIZ.LJFF(c0h0j.LIZ, 1.0f, true);
            getContext();
            this.LL.LIZ(new C1320770kTT(c1331070kk5LIZ));
        }
        int iLJFF = this.LL.LJFF();
        for (int i2 = 0; i2 < iLJFF; i2++) {
            this.LL.LIZJ(i2).LIZLLL().setCallback(this);
        }
        requestLayout();
    }

    public final void setImageInfoList(List<? extends T> list) {
        this.LLILLJJLI = list;
    }

    public final void setMultiDraweeHolder(C0H6V<C1331070kk5> c0h6v) {
        this.LL = c0h6v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return this.LL.LJI(drawable);
    }
}
