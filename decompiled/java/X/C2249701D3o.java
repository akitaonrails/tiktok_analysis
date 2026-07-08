package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1D3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C2249701D3o {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2249691D3n.values().length];
        try {
            iArr[EnumC2249691D3n.QUICK_SHOOT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2249691D3n.SPLIT_SHOOT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2249691D3n.DUET.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC2249691D3n.NOW.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC2249691D3n.PHOTO.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC2249691D3n.SCAN.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC2249691D3n.LIVE.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC2249691D3n.DISABLE.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LIZ = iArr;
    }
}
