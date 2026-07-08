package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.17sF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C21165717sF {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC21165617sE.values().length];
        try {
            iArr[EnumC21165617sE.START_HIGHLIGHT_GUIDE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC21165617sE.SHOW_LIVE_GUIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC21165617sE.HIGHLIGHT_TO_LIVE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC21165617sE.PAUSE_HIGHLIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC21165617sE.RESUME_HIGHLIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
