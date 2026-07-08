package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C974610bT9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC975850bV9.values().length];
        try {
            iArr[EnumC975850bV9.BATTLE_INFO_SCENE_FINISH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC975850bV9.BATTLE_INFO_SCENE_TASK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC975850bV9.AUDIENCE_BATTLE_INFO_ROOM_ENTER.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
