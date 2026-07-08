package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0EyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C381970EyJ {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;
    public static final /* synthetic */ int[] LIZLLL;
    public static final /* synthetic */ int[] LJ;
    public static final /* synthetic */ int[] LJFF;

    static {
        int[] iArr = new int[EnumC2331909Bt.values().length];
        try {
            iArr[EnumC2331909Bt.TASK_ID.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2331909Bt.CREATION_ID.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC382030EyP.values().length];
        try {
            iArr2[EnumC382030EyP.CANCEL.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC382030EyP.CANCEL_AND_DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC382030EyP.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC382030EyP.STOP_FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[EnumC382030EyP.RETRY.ordinal()] = 5;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[EnumC382030EyP.RESTORE.ordinal()] = 6;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[EnumC382030EyP.EXECUTE_IF_NEEDED.ordinal()] = 7;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC381980EyK.values().length];
        try {
            iArr3[EnumC381980EyK.EDITOR_PRO_AIGC_T2I.ordinal()] = 1;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr3[EnumC381980EyK.EDITOR_PRO_AIGC_T2V.ordinal()] = 2;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        try {
            iArr3[EnumC381980EyK.EDITOR_PRO_AIGC_V2V.ordinal()] = 3;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr3[EnumC381980EyK.TEMPLATE_FL2V.ordinal()] = 4;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr3[EnumC381980EyK.TEMPLATE_I2I.ordinal()] = 5;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr3[EnumC381980EyK.I2V.ordinal()] = 6;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr3[EnumC381980EyK.TRANSITION_FRAME.ordinal()] = 7;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        LIZJ = iArr3;
        int[] iArr4 = new int[EnumC381960EyI.values().length];
        try {
            iArr4[EnumC381960EyI.EDITOR_PRO.ordinal()] = 1;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr4[EnumC381960EyI.EDITOR_PRO_AIGC_T2I.ordinal()] = 2;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr4[EnumC381960EyI.EDITOR_PRO_AIGC_T2V.ordinal()] = 3;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr4[EnumC381960EyI.EDIT_AI_PLAYGROUND.ordinal()] = 4;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr4[EnumC381960EyI.TEMPLATE.ordinal()] = 5;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        LIZLLL = iArr4;
        int[] iArr5 = new int[EnumC382100EyW.values().length];
        try {
            iArr5[EnumC382100EyW.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        try {
            iArr5[EnumC382100EyW.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        LJ = iArr5;
        int[] iArr6 = new int[EnumC381990EyL.values().length];
        try {
            iArr6[EnumC381990EyL.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        try {
            iArr6[EnumC381990EyL.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError e25) {
            TryCatchGuardChecker.doCheck(e25);
        }
        try {
            iArr6[EnumC381990EyL.IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError e26) {
            TryCatchGuardChecker.doCheck(e26);
        }
        try {
            iArr6[EnumC381990EyL.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError e27) {
            TryCatchGuardChecker.doCheck(e27);
        }
        try {
            iArr6[EnumC381990EyL.AUDIO.ordinal()] = 5;
        } catch (NoSuchFieldError e28) {
            TryCatchGuardChecker.doCheck(e28);
        }
        try {
            iArr6[EnumC381990EyL.FILE.ordinal()] = 6;
        } catch (NoSuchFieldError e29) {
            TryCatchGuardChecker.doCheck(e29);
        }
        LJFF = iArr6;
    }
}
