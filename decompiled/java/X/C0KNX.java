package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KNX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0KNX {
    public C0KN4 LIZ;
    public final WeakReference<Activity> LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public String LIZIZ = "";
    public final Map<String, String> LJFF = new LinkedHashMap();

    public abstract boolean LIZ();

    public C0KNX(WeakReference<Activity> weakReference, String str, Map<String, String> map) {
        this.LIZJ = weakReference;
        this.LIZLLL = str;
        this.LJ = map;
    }
}
