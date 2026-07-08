package X;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.0j0I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264240j0I {
    public final C1264250j0J LIZ = new C1264250j0J();
    public final Context LIZIZ;
    public final View LIZJ;

    public C1264240j0I(ActivityC2186501Ahk activityC2186501Ahk) {
        View decorView;
        Window window = activityC2186501Ahk.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZJ = decorView;
        this.LIZIZ = activityC2186501Ahk;
    }
}
