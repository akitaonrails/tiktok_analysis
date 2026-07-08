package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;

/* JADX INFO: renamed from: X.0mrh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1412670mrh {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[AssetType.values().length];
        try {
            iArr[AssetType.CAPCUT_TEMPLATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AssetType.UGC_TEMPLATE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AssetType.AUTOCUT_AI_TEMPLATE_V2.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[AssetType.PUGC_TEMPLATE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[AssetType.IMAGE_TEXT_TEMPLATE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[AssetType.AIGT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[AssetType.SGT.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[AssetType.SOUND_SYNC.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr[AssetType.AI_ALIVE_TEMPLATE.ordinal()] = 9;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr[AssetType.AUTO_PICK_TEMPLATE.ordinal()] = 10;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        try {
            iArr[AssetType.LYRICS_RULE_TEMPLATE.ordinal()] = 11;
        } catch (NoSuchFieldError e11) {
            TryCatchGuardChecker.doCheck(e11);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC1412640mre.values().length];
        try {
            iArr2[EnumC1412640mre.CUT_SAME.ordinal()] = 1;
        } catch (NoSuchFieldError e12) {
            TryCatchGuardChecker.doCheck(e12);
        }
        try {
            iArr2[EnumC1412640mre.UGC_TEMPLATE.ordinal()] = 2;
        } catch (NoSuchFieldError e13) {
            TryCatchGuardChecker.doCheck(e13);
        }
        try {
            iArr2[EnumC1412640mre.ALGORITHM_TEMPLATE.ordinal()] = 3;
        } catch (NoSuchFieldError e14) {
            TryCatchGuardChecker.doCheck(e14);
        }
        try {
            iArr2[EnumC1412640mre.PUGC_TEMPLATE.ordinal()] = 4;
        } catch (NoSuchFieldError e15) {
            TryCatchGuardChecker.doCheck(e15);
        }
        try {
            iArr2[EnumC1412640mre.PHOTO_MODE_TEMPLATE.ordinal()] = 5;
        } catch (NoSuchFieldError e16) {
            TryCatchGuardChecker.doCheck(e16);
        }
        try {
            iArr2[EnumC1412640mre.AIGT.ordinal()] = 6;
        } catch (NoSuchFieldError e17) {
            TryCatchGuardChecker.doCheck(e17);
        }
        try {
            iArr2[EnumC1412640mre.SOUND_SYNC_TEMPLATE.ordinal()] = 7;
        } catch (NoSuchFieldError e18) {
            TryCatchGuardChecker.doCheck(e18);
        }
        try {
            iArr2[EnumC1412640mre.AI_ALIVE_TEMPLATE.ordinal()] = 8;
        } catch (NoSuchFieldError e19) {
            TryCatchGuardChecker.doCheck(e19);
        }
        try {
            iArr2[EnumC1412640mre.AUTO_PICK_TEMPLATE.ordinal()] = 9;
        } catch (NoSuchFieldError e20) {
            TryCatchGuardChecker.doCheck(e20);
        }
        try {
            iArr2[EnumC1412640mre.LYRICS_RULE_TEMPLATE.ordinal()] = 10;
        } catch (NoSuchFieldError e21) {
            TryCatchGuardChecker.doCheck(e21);
        }
        try {
            iArr2[EnumC1412640mre.SGT.ordinal()] = 11;
        } catch (NoSuchFieldError e22) {
            TryCatchGuardChecker.doCheck(e22);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC1394530mOR.values().length];
        try {
            iArr3[EnumC1394530mOR.UGC.ordinal()] = 1;
        } catch (NoSuchFieldError e23) {
            TryCatchGuardChecker.doCheck(e23);
        }
        try {
            iArr3[EnumC1394530mOR.UGC_ALGO.ordinal()] = 2;
        } catch (NoSuchFieldError e24) {
            TryCatchGuardChecker.doCheck(e24);
        }
        try {
            iArr3[EnumC1394530mOR.UGC_LABEL.ordinal()] = 3;
        } catch (NoSuchFieldError e25) {
            TryCatchGuardChecker.doCheck(e25);
        }
        try {
            iArr3[EnumC1394530mOR.PUGC.ordinal()] = 4;
        } catch (NoSuchFieldError e26) {
            TryCatchGuardChecker.doCheck(e26);
        }
        try {
            iArr3[EnumC1394530mOR.CAPCUT.ordinal()] = 5;
        } catch (NoSuchFieldError e27) {
            TryCatchGuardChecker.doCheck(e27);
        }
        try {
            iArr3[EnumC1394530mOR.AIGT.ordinal()] = 6;
        } catch (NoSuchFieldError e28) {
            TryCatchGuardChecker.doCheck(e28);
        }
        try {
            iArr3[EnumC1394530mOR.SGT.ordinal()] = 7;
        } catch (NoSuchFieldError e29) {
            TryCatchGuardChecker.doCheck(e29);
        }
        LIZJ = iArr3;
    }
}
