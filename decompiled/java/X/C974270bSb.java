package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C974270bSb {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC974260bSa.values().length];
        try {
            iArr[EnumC974260bSa.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC974260bSa.PREPARE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC974260bSa.INVITED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC974260bSa.RECEIVED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC974260bSa.ACCEPTED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC974260bSa.START.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC974260bSa.START_FINAL_CALL.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[EnumC974260bSa.SETTLE.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[EnumC974260bSa.PUNISH.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[EnumC974260bSa.DRAW.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[EnumC974260bSa.FINISH.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC964170bCJ.values().length];
        try {
            iArr2[EnumC964170bCJ.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr2[EnumC964170bCJ.PREPARING.ordinal()] = 2;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr2[EnumC964170bCJ.INVITED.ordinal()] = 3;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr2[EnumC964170bCJ.RECEIVED.ordinal()] = 4;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr2[EnumC964170bCJ.ACCEPTED.ordinal()] = 5;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr2[EnumC964170bCJ.MATCH_START.ordinal()] = 6;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr2[EnumC964170bCJ.SETTLE_START.ordinal()] = 7;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr2[EnumC964170bCJ.PUNISH_START.ordinal()] = 8;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr2[EnumC964170bCJ.DRAW.ordinal()] = 9;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr2[EnumC964170bCJ.MATCH_END.ordinal()] = 10;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        LIZIZ = iArr2;
    }
}
