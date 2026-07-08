package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0t8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public /* synthetic */ class C1653880t8k {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1653890t8l.values().length];
        try {
            iArr[EnumC1653890t8l.STORY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
