package X;

import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0r05, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571630r05 {
    public static final C1571630r05 LIZ = new C1571630r05();
    public static final ConcurrentHashMap<Integer, C1571620r04> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Bundle> LIZJ = new ConcurrentHashMap<>();
    public static final C1571640r06 LIZLLL = new C1571640r06();
    public static volatile C1571620r04 LJ;

    public static C1571660r08 LIZ(C19EG c19eg) {
        C0CAK c0cak;
        boolean zIsChangingConfigurations = c19eg.isChangingConfigurations();
        boolean zLJI = C1906580ziK.LJI();
        if (zIsChangingConfigurations) {
            c0cak = C0CAK.CONFIG_CHANGES;
        } else if (zLJI) {
            c0cak = C0CAK.IN_BACKGROUND;
        } else {
            c0cak = C0CAK.OTHER;
        }
        return new C1571660r08(c0cak, c19eg.getResources().getConfiguration(), C0XQ7.LIZIZ());
    }
}
