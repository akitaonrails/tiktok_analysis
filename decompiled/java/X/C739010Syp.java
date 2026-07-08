package X;

import android.view.View;

/* JADX INFO: renamed from: X.0Syp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C739010Syp implements C0TVI {
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

    public C739010Syp(View view, int i) {
        this.$t = i;
        this.l0 = view;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C739010Syp c739010Syp, View view, C20246014Ju c20246014Ju) {
        ((View) c739010Syp.l0).setPadding(0, c20246014Ju.LIZ(7).LIZIZ, 0, 0);
        return c20246014Ju;
    }

    public static final C20246014Ju onApplyWindowInsets$1(C739010Syp c739010Syp, View view, C20246014Ju c20246014Ju) {
        ((View) c739010Syp.l0).setPadding(0, 0, 0, c20246014Ju.LIZ(7).LIZLLL);
        return c20246014Ju;
    }
}
