package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.ui.KeyboardAttachedDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0yd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864920yd8 implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C1864920yd8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C1864920yd8 c1864920yd8, View view, C20246014Ju c20246014Ju) {
        boolean zLJIIIIZZ = c20246014Ju.LJIIIIZZ(8);
        int i = c20246014Ju.LIZ(8).LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeKeyboard: imeVisible -> ");
        sbLIZ.append(zLJIIIIZZ);
        sbLIZ.append(", imeHeight -> ");
        sbLIZ.append(i);
        C1022620cia.LIZ("KeyboardDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (zLJIIIIZZ) {
            ((KeyboardAttachedDialogFragment) c1864920yd8.l0).LLILLL = true;
            View viewFindViewById = view.findViewById(R.id.q1i);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = i;
            C786410Ut5.W5(viewFindViewById, layoutParams);
        } else {
            KeyboardAttachedDialogFragment keyboardAttachedDialogFragment = (KeyboardAttachedDialogFragment) c1864920yd8.l0;
            if (keyboardAttachedDialogFragment.LLILLL) {
                keyboardAttachedDialogFragment.LLILLL = false;
                C786410Ut5.LJLLLLLL(8, view);
                if (((KeyboardAttachedDialogFragment) c1864920yd8.l0).isAdded() && !((KeyboardAttachedDialogFragment) c1864920yd8.l0).isRemoving()) {
                    ((KeyboardAttachedDialogFragment) c1864920yd8.l0).dismissAllowingStateLoss();
                    return c20246014Ju;
                }
            }
        }
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C1864920yd8 c1864920yd8, View view, C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        int rootViewPaddingTop = ((AbstractC214814194y) c1864920yd8.l0).getRootViewPaddingTop(c20244914JjLIZ);
        int rootViewPaddingBottom = ((AbstractC214814194y) c1864920yd8.l0).getRootViewPaddingBottom(c20244914JjLIZ);
        view.setPadding(c20244914JjLIZ.LIZ, rootViewPaddingTop, c20244914JjLIZ.LIZJ, rootViewPaddingBottom);
        C20246414Jy c20246414Jy = new C20246414Jy(c20246014Ju);
        c20246414Jy.LIZ.LIZJ(7, C20244914Jj.LIZIZ(0, c20244914JjLIZ.LIZIZ - rootViewPaddingTop, 0, c20244914JjLIZ.LIZLLL - rootViewPaddingBottom));
        return c20246414Jy.LIZ();
    }
}
