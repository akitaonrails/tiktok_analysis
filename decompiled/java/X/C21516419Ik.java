package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19Ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21516419Ik extends C214906198m {
    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public C21516419Ik(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, R$styleable.PopupWindow, i, i2);
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.PopupWindow_overlapAnchor)) {
            C21516519Il.LIZJ(this, c21411918qrLJIILIIL.LIZ(R$styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(c21411918qrLJIILIIL.LJ(R$styleable.PopupWindow_android_popupBackground));
        c21411918qrLJIILIIL.LJIILJJIL();
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }
}
