package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386950FFd implements C0FFP {
    public final Context LIZ;
    public final C1664680tQA<BaseStickerModel> LIZIZ;
    public final View LIZJ;
    public final FrameLayout LIZLLL;
    public final LifecycleOwner LJ;

    @Override // X.C0FFP
    public final void LIZLLL() {
    }

    @Override // X.C0FFP
    public final void LIZIZ() {
        View view = this.LIZJ;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 11));
        } else {
            LJ();
        }
    }

    @Override // X.C0FFP
    public final Bitmap LIZJ() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.LIZJ.getWidth(), this.LIZJ.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(this.LIZ.getResources().getDisplayMetrics().densityDpi);
        C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), this.LIZJ);
        return bitmapCreateBitmap;
    }

    public final void LJ() {
        int left = this.LIZJ.getLeft();
        int top = this.LIZJ.getTop();
        int width = this.LIZJ.getWidth();
        int height = this.LIZJ.getHeight();
        float rotation = this.LIZJ.getRotation();
        this.LIZIZ.LIZLLL(new C386960FFe(this.LIZLLL.getWidth() > 0 ? this.LIZLLL.getWidth() : this.LIZLLL.getLayoutParams().width, this.LIZLLL.getHeight() > 0 ? this.LIZLLL.getHeight() : this.LIZLLL.getLayoutParams().height, left, top, width, height, this.LIZLLL.getLeft(), this.LIZLLL.getTop(), rotation), true);
    }

    @Override // X.C0FFP
    public final void destroy() {
        C786410Ut5.LJJJZ(this.LIZJ, this.LIZLLL);
    }

    @Override // X.C0FFP
    public final void LIZ(Function0<Unit> function0) {
        if (this.LIZLLL.getVisibility() != 0) {
            LJ();
            function0.invoke();
            return;
        }
        View view = this.LIZJ;
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            LJ();
            function0.invoke();
        } else {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391520FWs(this, function0, 1));
        }
    }

    public C386950FFd(Context context, C1664680tQA<BaseStickerModel> c1664680tQA, View view, FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        FrameLayout.LayoutParams layoutParams;
        this.LIZ = context;
        this.LIZIZ = c1664680tQA;
        this.LIZJ = view;
        this.LIZLLL = frameLayout;
        this.LJ = lifecycleOwner;
        if (view.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = 17;
            }
            frameLayout.addView(view);
        } else {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            frameLayout.addView(view, layoutParams3);
        }
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0ERo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateX());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 834));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0EYu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getTranslateY());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 836));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0ESE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getScale());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 837));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0ERq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getRotation());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 839));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0FFf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((BaseStickerModel) obj).getVisible());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 864));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0FFc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((BaseStickerModel) obj).getAlpha());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 813));
        c1664680tQA.LIZ(new C2217381BqS() { // from class: X.0ERZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((BaseStickerModel) obj).getHighlightState();
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 816));
        c1664680tQA.LIZ(new C2217371BqR() { // from class: X.0EPB
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getZIndex());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((BaseStickerModel) obj).setZIndex(((Number) obj2).intValue());
            }
        }).LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 830));
        LIZIZ();
        frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 10));
    }
}
