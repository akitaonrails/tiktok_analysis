package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C770280UJm {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC770260UJk.values().length];
        try {
            iArr[EnumC770260UJk.BULLETIN_EDIT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
