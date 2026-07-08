package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429600Gsw {
    public static final void LIZ(ViewStub viewStub, View view) {
        ViewGroup viewGroup;
        ViewParent parent = viewStub.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            int iIndexOfChild = viewGroup.indexOfChild(viewStub);
            Intrinsics.LJFF(view.getLayoutParams(), viewStub.getLayoutParams());
            C786410Ut5.LJJJLZIJ(viewStub, viewGroup);
            viewGroup.addView(view, iIndexOfChild, view.getLayoutParams());
            if (viewStub.getInflatedId() != -1) {
                view.setId(viewStub.getInflatedId());
                return;
            }
            return;
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup parent");
    }
}
