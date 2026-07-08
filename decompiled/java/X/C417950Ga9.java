package X;

import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Ga9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417950Ga9 {
    public static final void LIZ(int i, View view) {
        C417940Ga8 c417940Ga8;
        view.setClipToOutline(true);
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        if ((outlineProvider instanceof C417940Ga8) && (c417940Ga8 = (C417940Ga8) outlineProvider) != null) {
            c417940Ga8.LIZ = i;
            view.invalidateOutline();
        } else {
            view.setOutlineProvider(new C417940Ga8(i));
        }
    }
}
