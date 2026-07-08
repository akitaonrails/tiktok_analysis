package X;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0RPV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0RPV {
    public final View LIZ;
    public final Map<String, C0RPW> LIZIZ = new LinkedHashMap();

    public abstract C695280RPa LIZIZ(String str);

    public final C695280RPa LIZ(String str) {
        C0RPW c0rpw = (C0RPW) ((LinkedHashMap) this.LIZIZ).get(str);
        if (c0rpw != null && c0rpw.LIZ()) {
            c0rpw.LIZIZ();
        }
        return LIZIZ(str);
    }

    public C0RPV(View view, C0RPT c0rpt) {
        this.LIZ = view;
    }
}
