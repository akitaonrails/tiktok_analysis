package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19SF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19SF extends AbstractC1324060kYm {
    public final /* synthetic */ C19SE LJIILIIL;

    @Override // X.AbstractC1324060kYm
    public final void LIZJ(List<Integer> list) {
        C19SE c19se;
        C19SD c19sd;
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(0);
        if (this.LJIILIIL.LIZJ() && (c19sd = (c19se = this.LJIILIIL).LLILZIL) != null && c19sd.LLLF && c19se.LLIZLLLIL != null) {
            arrayList.add(1);
        }
    }

    @Override // X.AbstractC1324060kYm
    public final void LJI(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String str;
        accessibilityNodeInfoCompat.setCheckable(this.LJIILIIL.LIZLLL());
        accessibilityNodeInfoCompat.setClickable(this.LJIILIIL.isClickable());
        if (!this.LJIILIIL.LIZLLL() && !this.LJIILIIL.isClickable()) {
            accessibilityNodeInfoCompat.setClassName("android.view.View");
        } else {
            if (this.LJIILIIL.LIZLLL()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            accessibilityNodeInfoCompat.setClassName(str);
        }
        accessibilityNodeInfoCompat.setText(this.LJIILIIL.getText());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19SF(C19SE c19se, C19SE c19se2) {
        super(c19se2);
        this.LJIILIIL = c19se;
    }

    @Override // X.AbstractC1324060kYm
    public final boolean LJFF(int i, int i2) {
        boolean z = false;
        if (i2 == 16) {
            if (i == 0) {
                return this.LJIILIIL.performClick();
            }
            if (i == 1) {
                C19SE c19se = this.LJIILIIL;
                c19se.playSoundEffect(0);
                View.OnClickListener onClickListener = c19se.LLIZLLLIL;
                if (onClickListener != null) {
                    onClickListener.onClick(c19se);
                    z = true;
                }
                c19se.LLJJIII.LJIIJ(1, 1);
            }
        }
        return z;
    }

    @Override // X.AbstractC1324060kYm
    public final void LJII(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence charSequence = "";
        if (i == 1) {
            CharSequence closeIconContentDescription = this.LJIILIIL.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = this.LJIILIIL.getText();
                Context context = this.LJIILIIL.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                accessibilityNodeInfoCompat.setContentDescription(context.getString(2131837537, objArr).trim());
            }
            accessibilityNodeInfoCompat.setBoundsInParent(this.LJIILIIL.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
            accessibilityNodeInfoCompat.setEnabled(this.LJIILIIL.isEnabled());
            return;
        }
        accessibilityNodeInfoCompat.setContentDescription("");
        accessibilityNodeInfoCompat.setBoundsInParent(C19SE.LLJJJ);
    }

    @Override // X.AbstractC1324060kYm
    public final void LJIIIIZZ(int i, boolean z) {
        if (i == 1) {
            C19SE c19se = this.LJIILIIL;
            c19se.LLJILJILJ = z;
            c19se.refreshDrawableState();
        }
    }

    public final int LJIIL(float f, float f2) {
        if (this.LJIILIIL.LIZJ() && this.LJIILIIL.getCloseIconTouchBounds().contains(f, f2)) {
            return 1;
        }
        return 0;
    }
}
