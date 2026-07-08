package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0CYH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CYH extends AnonymousClass0555<Integer> {
    public static final C0CYH LIZJ = new C0CYH();
    public static final String LIZLLL = "dm_unread_dot_display_degrade_strategy";
    public static final C19719912Dl LJ = C13LE.LIZ(Integer.TYPE);

    @Override // X.AnonymousClass0555
    public final Integer LIZIZ() {
        return 0;
    }

    @Override // X.AnonymousClass0555
    public final String LIZLLL() {
        return "DmDegradeUnreadShowWhenMessagesExpireExp";
    }

    @Override // X.AnonymousClass0555
    public final Integer LJ() {
        return Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "dm_unread_dot_display_degrade_strategy", false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.ies.abmock.SettingsManager] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public final long LJIIIIZZ() {
        ?? linkedHashMap;
        if (!LJIIIZ()) {
            return Long.MAX_VALUE;
        }
        int iIntValue = ((Number) AnonymousClass0555.LIZ(this)).intValue();
        Map<String, Integer> map = C00HE.LIZ;
        try {
            ?? LIZLLL2 = SettingsManager.LIZLLL();
            linkedHashMap = C00HE.LIZ;
            Map map2 = (Map) LIZLLL2.LJIIIIZZ("dm_unread_dot_display_degrade_config", Map.class, linkedHashMap);
            if (map2 != null) {
                linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                for (Object obj : map2.entrySet()) {
                    linkedHashMap.put(((Map.Entry) obj).getKey(), Integer.valueOf((int) ((Number) ((Map.Entry) obj).getValue()).doubleValue()));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            linkedHashMap = C00HE.LIZ;
        }
        if (((Integer) linkedHashMap.get(String.valueOf(iIntValue))) == null) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.DAYS.toMillis(r0.intValue());
    }

    public final boolean LJIIIZ() {
        return ((Number) AnonymousClass0555.LIZ(this)).intValue() > 0;
    }

    @Override // X.AnonymousClass0555
    public final String LIZJ() {
        return LIZLLL;
    }

    @Override // X.AnonymousClass0555
    public final C19719912Dl LJI() {
        return LJ;
    }

    @Override // X.AnonymousClass0555
    public final void LJII(AnonymousClass0556 anonymousClass0556) {
        C0C5P.LIZJ().LJIIJJI("dm_unread_dot_display_degrade_strategy", anonymousClass0556);
    }
}
