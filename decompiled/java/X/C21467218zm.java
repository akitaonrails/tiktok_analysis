package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.18zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21467218zm extends AbstractC21468118zv {
    public C21467218zm(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void LJIILIIL(View view, C830490Whz c830490Whz) {
        String strLJIIJ = C14K9.LJIIJ(view);
        if (strLJIIJ != null) {
            c830490Whz.put(strLJIIJ, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    LJIILIIL(childAt, c830490Whz);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x037f A[LOOP:20: B:141:0x0379->B:143:0x037f, LOOP_END] */
    @Override // X.AbstractC21468118zv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.List<? extends X.C21468018zu> r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21467218zm.LIZIZ(java.util.List, boolean):void");
    }
}
