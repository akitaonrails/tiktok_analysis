package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0by5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C993790by5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, EnumC993780by4 enumC993780by4) {
        if (view instanceof ViewGroup) {
            view.setTag(1610612742, enumC993780by4.getType());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setTag(1610612742, enumC993780by4.getType());
                if (childAt instanceof ViewGroup) {
                    LIZ(childAt, enumC993780by4);
                }
            }
            return;
        }
        view.setTag(1610612742, enumC993780by4.getType());
    }
}
