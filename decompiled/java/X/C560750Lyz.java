package X;

import android.view.View;

/* JADX INFO: renamed from: X.0Lyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560750Lyz implements C0TVI {
    public static final C560750Lyz LL = new C560750Lyz();

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
        C20244914Jj c20244914JjLIZ2 = c20246014Ju.LIZ(8);
        int i = c20244914JjLIZ.LIZ;
        int paddingTop = view.getPaddingTop();
        int i2 = c20244914JjLIZ.LIZJ;
        int i3 = c20244914JjLIZ2.LIZLLL;
        if (i3 <= 0) {
            i3 = c20244914JjLIZ.LIZLLL;
        }
        view.setPadding(i, paddingTop, i2, i3);
        return c20246014Ju;
    }
}
