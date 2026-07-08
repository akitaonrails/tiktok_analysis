package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/* JADX INFO: renamed from: X.0S2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714950S2r {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ViewGroup viewGroup, ViewStub viewStub, ViewGroup.LayoutParams layoutParams, AbstractC714940S2q abstractC714940S2q) {
        int iIndexOfChild = viewGroup.indexOfChild(viewStub);
        C786410Ut5.LJJLJLI(viewStub, viewGroup);
        if (layoutParams != null) {
            viewGroup.addView((View) viewStub.getTag(-2), iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView((View) viewStub.getTag(-2), iIndexOfChild);
        }
        abstractC714940S2q.LJII = (View) viewStub.getTag(-2);
        viewStub.setTag(-2, null);
    }
}
