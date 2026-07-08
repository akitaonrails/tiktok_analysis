package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0KP3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KP3 extends C0KNX {
    public final C0KS8 LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final C0KP5 LJIILJJIL;
    public String LJIILL;

    @Override // X.C0KNX
    public final boolean LIZ() {
        return this.LJI.LIZLLL != 1;
    }

    public C0KP3(WeakReference<Activity> weakReference, String str, Map<String, String> map, String str2, C0KS8 c0ks8, int i, String str3, String str4, String str5, String str6, String str7, String str8, C0KP5 c0kp5) {
        super(weakReference, str, map);
        this.LJI = c0ks8;
        this.LJII = i;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
        this.LJIIJ = str5;
        this.LJIIJJI = str6;
        this.LJIIL = str7;
        this.LJIILIIL = str8;
        this.LJIILJJIL = c0kp5;
        this.LJIILL = "";
        this.LIZIZ = str2;
    }
}
