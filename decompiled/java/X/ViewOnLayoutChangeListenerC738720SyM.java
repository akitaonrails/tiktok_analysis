package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewOnLayoutChangeListenerC738720SyM implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC738720SyM(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC738720SyM viewOnLayoutChangeListenerC738720SyM, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((InteractRightAreaComponent) viewOnLayoutChangeListenerC738720SyM.l0).op((ViewGroup) viewOnLayoutChangeListenerC738720SyM.l1);
        ((InteractRightAreaComponent) viewOnLayoutChangeListenerC738720SyM.l0).Ap();
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC738720SyM viewOnLayoutChangeListenerC738720SyM, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z;
        Boolean boolValueOf = null;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C12EJ.class);
            int childCount = viewGroup.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 < childCount) {
                    View childAt = viewGroup.getChildAt(i9);
                    if (childAt != null && c19719912DlLIZ.LIZIZ(childAt)) {
                        z = true;
                        break;
                    }
                    i9++;
                } else {
                    z = false;
                    break;
                }
            }
            boolValueOf = Boolean.valueOf(z);
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            View view2 = (View) viewOnLayoutChangeListenerC738720SyM.l0;
            if ((view2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view2) != null) {
                int i10 = ((C719660SKu) viewOnLayoutChangeListenerC738720SyM.l1).LJJIJIIJI;
                C0SLH.LIZ(viewGroup2, i10, i10, 0, 4);
            }
            view.removeOnLayoutChangeListener(((C719660SKu) viewOnLayoutChangeListenerC738720SyM.l1).LJLJLLL);
        }
    }
}
