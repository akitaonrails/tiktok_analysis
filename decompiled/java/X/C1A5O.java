package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.1A5O, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5O {
    public static final Keva LIZ;
    public static String[] LIZIZ;

    static {
        Keva repo = Keva.getRepo("gesture_storage");
        LIZ = repo;
        LIZIZ = repo.getStringArray("gesture_alarm_records", new String[]{""});
    }
}
