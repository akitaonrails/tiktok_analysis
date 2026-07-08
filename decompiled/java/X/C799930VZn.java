package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799930VZn {
    public static final C799930VZn LIZIZ = new C799930VZn();
    public final Map<Object, EnumC799980VZs> LIZ;

    public C799930VZn() {
        HashMap map = new HashMap();
        this.LIZ = map;
        map.put(EnumC799870VZh.MAIN, EnumC799980VZs.TASK_MAIN);
        map.put(EnumC799870VZh.BACKGROUND, EnumC799980VZs.TASK_BACKGROUND);
        map.put(EnumC799870VZh.FIRST_WINDOW_FOCUS, EnumC799980VZs.TASK_FIRST_WINDOW_FOCUS);
        map.put(EnumC799870VZh.SPARSE, EnumC799980VZs.TASK_SPARSE);
        map.put(EnumC799870VZh.BOOT_FINISH, EnumC799980VZs.TASK_BOOT_FINISH);
        map.put(EnumC799870VZh.APP_BACKGROUND, EnumC799980VZs.TASK_APP_BACKGROUND);
        map.put(EnumC799870VZh.IDLE, EnumC799980VZs.TASK_IDLE);
        map.put(C0CO3.P0, EnumC799980VZs.REQUEST_P0);
        map.put(C0CO3.NORMAL, EnumC799980VZs.REQUEST_NORMAL);
        map.put(C0CO3.BOOT_FINISH, EnumC799980VZs.REQUEST_BOOT_FINISH);
        map.put(C0CO3.IDLE, EnumC799980VZs.REQUEST_IDLE);
    }
}
