package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: X.15ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20590015ha {
    public static final List<C20590215hc> LIZJ = C1697810uHb.LJIIJJI(C20590215hc.LIZJ, C20590215hc.LIZLLL, C20590215hc.LJ, C20590215hc.LJFF, C20590215hc.LJI);
    public final View LIZ;
    public EnumC20591315hn LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20590015ha(Context context) {
        View decorView;
        Window window;
        Activity activityLIZ = C20590515hf.LIZ(context);
        if (activityLIZ != null && (window = activityLIZ.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this(decorView);
    }

    public C20590015ha(View view) {
        this.LIZ = view;
        this.LIZIZ = EnumC20591315hn.HORIZONTAL;
    }
}
