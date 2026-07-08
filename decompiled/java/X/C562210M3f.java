package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0M3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C562210M3f {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;
    public static final /* synthetic */ int[] LJ;
    public static final /* synthetic */ int[] LJFF;
    public static final /* synthetic */ int[] LJI;

    static {
        int[] iArr = new int[EnumC562220M3g.values().length];
        try {
            iArr[EnumC562220M3g.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC562220M3g.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC562220M3g.POSTED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC562220M3g.INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC562240M3i.values().length];
        try {
            iArr2[EnumC562240M3i.BY_CREATE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC562240M3i.BY_EDIT_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC562200M3e.values().length];
        try {
            iArr3[EnumC562200M3e.FREE_UP_SPACE.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr3[EnumC562200M3e.FIRST_SAVE_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr3[EnumC562200M3e.LAST_SAVE_TIME.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        LIZJ = iArr3;
        int[] iArr4 = new int[EnumC562230M3h.values().length];
        try {
            iArr4[EnumC562230M3h.EFFECT.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr4[EnumC562230M3h.MUSIC.ordinal()] = 2;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        LIZLLL = iArr4;
        int[] iArr5 = new int[EnumC562250M3j.values().length];
        try {
            iArr5[EnumC562250M3j.LIKE.ordinal()] = 1;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        LJ = iArr5;
        int[] iArr6 = new int[EnumC561380M0a.values().length];
        try {
            iArr6[EnumC561380M0a.EFFECT.ordinal()] = 1;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr6[EnumC561380M0a.TEMPLATE.ordinal()] = 2;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        LJFF = iArr6;
        int[] iArr7 = new int[C0M0Y.values().length];
        try {
            iArr7[C0M0Y.NOT_ZERO.ordinal()] = 1;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        LJI = iArr7;
    }
}
