package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21299118Wv extends C16G0 {
    public static final /* synthetic */ int LLJLLL = 0;
    public C18X6 LLJJL;
    public C1776840wL4 LLJJLIIIJLLLLLLLZ;
    public final C21299218Ww LLJL;
    public final C21299318Wx LLJLIL;
    public WindowInsets LLJLILLLLZIIL;
    public final C18X1 LLJLL;
    public View LLJLLIL;

    public final EnumC21299518Wz getState() {
        return C21299318Wx.LIZIZ(this.LLJLIL.LIZJ.getState());
    }

    public final C1776840wL4 getConfig() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final C18X6 getInsetsHandler() {
        return this.LLJJL;
    }

    public final void LJIJJLI(boolean z) {
        if (!z) {
            View view = this.LLJLLIL;
            if (view != null) {
                view.setOutlineProvider(new C0IDA(0.0f, 18));
                view.setClipToOutline(true);
                return;
            }
            return;
        }
        C1776840wL4 c1776840wL4 = this.LLJJLIIIJLLLLLLLZ;
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            view2.setOutlineProvider(new C0IDA(c1776840wL4.LIZLLL, 18));
            view2.setClipToOutline(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        this.LLJLILLLLZIIL = windowInsets;
        C14K9.LJIJJ(this, new C0TVI() { // from class: X.18X5
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                return c20246014Ju;
            }
        });
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // X.C16G0, android.view.View
    public final void onDraw(Canvas canvas) {
        WindowInsets windowInsets;
        int iLIZ;
        if (getStatusBarBackground() != null && (windowInsets = this.LLJLILLLLZIIL) != null && (iLIZ = this.LLJJL.LIZ(windowInsets)) > 0) {
            Drawable statusBarBackground = getStatusBarBackground();
            if (statusBarBackground != null) {
                statusBarBackground.setBounds(0, 0, getWidth(), iLIZ);
            }
            Drawable statusBarBackground2 = getStatusBarBackground();
            if (statusBarBackground2 != null) {
                statusBarBackground2.draw(canvas);
            }
        }
    }

    public final void setConfig(C1776840wL4 c1776840wL4) {
        boolean z;
        if (!Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c1776840wL4)) {
            this.LLJJLIIIJLLLLLLLZ = c1776840wL4;
            C21299318Wx c21299318Wx = this.LLJLIL;
            c21299318Wx.LIZIZ = c1776840wL4;
            View view = c21299318Wx.LJ;
            if (view != null) {
                c21299318Wx.LIZ(view);
            }
            if (C21299318Wx.LIZIZ(this.LLJLIL.LIZJ.getState()) != EnumC21299518Wz.EXPANDED) {
                z = true;
            } else {
                z = false;
            }
            LJIJJLI(z);
            requestLayout();
        }
    }

    public final void setInsetsHandler(C18X6 c18x6) {
        this.LLJJL = c18x6;
        this.LLJL.setInsetsHandler(c18x6);
    }

    public C21299118Wv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21299118Wv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJL = new C18X6() { // from class: X.18X7
            @Override // X.C18X6
            public final int LIZ(WindowInsets windowInsets) {
                return 0;
            }

            @Override // X.C18X6
            public final WindowInsets LIZIZ(WindowInsets windowInsets) {
                return windowInsets;
            }
        };
        this.LLJJLIIIJLLLLLLLZ = C1776840wL4.LJ;
        C21299218Ww c21299218Ww = new C21299218Ww(context, null, 0);
        this.LLJL = c21299218Ww;
        C21299318Wx c21299318Wx = new C21299318Wx(c21299218Ww);
        this.LLJLIL = c21299318Wx;
        C18X1 c18x1 = new C18X1();
        this.LLJLL = c18x1;
        c21299318Wx.LIZLLL = c18x1;
        c21299218Ww.getContentContainer();
        super.addView(c21299218Ww, new C16G1(-1, -1));
        ((ArrayList) c18x1.LIZIZ).add(new C18X4() { // from class: X.18Ws
            @Override // X.C18X4
            public final void LJJJIL() {
            }

            @Override // X.C18X4
            public final void LJJJJ() {
            }

            @Override // X.C18X4
            public final void e0() {
            }

            @Override // X.C18X4
            public final void f0(EnumC21299518Wz enumC21299518Wz) {
            }

            @Override // X.C18X4
            public final void g0() {
            }

            @Override // X.C18X4
            public final void LJJJI(float f) {
                boolean z;
                if (C21299318Wx.LIZIZ(this.LIZ.LLJLIL.LIZJ.getState()) != EnumC21299518Wz.EXPANDED && f > 0.0f) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z2 = !z;
                this.LIZ.LJIJJLI(z2);
                this.LIZ.setWillNotDraw(z2);
            }
        });
    }
}
