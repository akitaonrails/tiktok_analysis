package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.18Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21252318Ev extends C18E7 {
    public static final C21252318Ev LJ = new C21252318Ev();

    public C21252318Ev() {
        super(EnumC21250718Ef.BackInternal, 1042, 1023);
    }

    public final void LJIIJ(Object obj, String str) {
        String name;
        Activity activityLIZJ = C789730UyR.LIZJ(obj);
        if (activityLIZJ == null || (name = activityLIZJ.getClass().getName()) == null) {
            name = "null";
        }
        C18CE.LIZ.LIZIZ(this.LIZJ, "", obj, null, false, new C20322814fa(name, str));
    }
}
