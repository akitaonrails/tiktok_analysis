package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.127P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127P extends C127M {
    public final View LIZIZ;
    public final TuxIconView LIZJ;
    public C127Q LIZLLL;
    public boolean LJ;
    public final CharSequence LJFF;
    public final CharSequence LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    @Override // X.C127M
    public final void LIZJ() {
        ((Animation) this.LJII.getValue()).cancel();
        ((Animation) this.LJIIIIZZ.getValue()).cancel();
    }

    @Override // X.C127M
    public final void LJIIJ() {
        C426750GoL.LJIIIZ(this.LIZJ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), null, null, false, 29);
    }

    @Override // X.C127M
    public final C127C LIZ() {
        return C127E.LIZIZ;
    }

    @Override // X.C127M
    public final View LJFF() {
        return this.LIZJ;
    }

    @Override // X.C127M
    public final void LJII(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        if (this.LJ) {
            accessibilityNodeInfoCompat.addAction(new C20092413jW(16, this.LJI));
        } else {
            accessibilityNodeInfoCompat.addAction(new C20092413jW(16, this.LJFF));
        }
    }

    @Override // X.C127M
    public final void LJIIIZ(boolean z) {
        this.LIZJ.setEnabled(z);
    }

    public C127P(Context context, TuxTextView tuxTextView, AttributeSet attributeSet) {
        this.LIZIZ = tuxTextView;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LIZJ = tuxIconView;
        this.LJII = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(354));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(353));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextCell, R.attr.z2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTextCell__tux_textCellExpansionIconColor, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxTextCell__tux_textCellExpansionIcon, 0);
        this.LJFF = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell__tux_textCellExpand);
        this.LJI = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTextCell__tux_textCellCollapse);
        typedArrayObtainStyledAttributes.recycle();
        tuxIconView.setIconRes(resourceId);
        tuxIconView.setTintColor(color);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 217));
    }
}
