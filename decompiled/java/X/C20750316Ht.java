package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.fragment.EditShareSelectFragment;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16Ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750316Ht implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            case 2:
                return onApplyWindowInsets$2(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C20750316Ht(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C20750316Ht c20750316Ht, View view, C20246014Ju c20246014Ju) {
        boolean z;
        C16BC c16bc;
        C16G0 c16g0 = (C16G0) c20750316Ht.l0;
        if (!Objects.equals(c16g0.LLJJ, c20246014Ju)) {
            c16g0.LLJJ = c20246014Ju;
            boolean z2 = true;
            if (c20246014Ju.LJFF() > 0) {
                z = true;
            } else {
                z = false;
            }
            c16g0.LLJJI = z;
            if (z || c16g0.getBackground() != null) {
                z2 = false;
            }
            c16g0.setWillNotDraw(z2);
            if (!c20246014Ju.LJII()) {
                int childCount = c16g0.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = c16g0.getChildAt(i);
                    if (childAt.getFitsSystemWindows() && (c16bc = ((C16G1) childAt.getLayoutParams()).LIZ) != null) {
                        c16bc.onApplyWindowInsets(c16g0, childAt, c20246014Ju);
                        if (c20246014Ju.LJII()) {
                            break;
                        }
                    }
                }
            }
            c16g0.requestLayout();
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C20750316Ht c20750316Ht, View view, C20246014Ju c20246014Ju) {
        C20246014Ju c20246014Ju2;
        C16GW c16gw = (C16GW) c20750316Ht.l0;
        c16gw.getClass();
        if (c16gw.getFitsSystemWindows()) {
            c20246014Ju2 = c20246014Ju;
        } else {
            c20246014Ju2 = null;
        }
        if (!Intrinsics.LJFF(c16gw.LLILZLL, c20246014Ju2)) {
            c16gw.LLILZLL = c20246014Ju2;
            c16gw.LL = -1;
            c16gw.LLILLJJLI = -1;
            c16gw.LLILLL = -1;
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$2(C20750316Ht c20750316Ht, View view, C20246014Ju c20246014Ju) {
        C1749260vca c1749260vca;
        C0I7D editTextView;
        if (!c20246014Ju.LJIIIIZZ(8) && (c1749260vca = ((EditShareSelectFragment) c20750316Ht.l0).LLIZ) != null && (editTextView = c1749260vca.getEditTextView()) != null) {
            editTextView.clearFocus();
        }
        return c20246014Ju;
    }
}
