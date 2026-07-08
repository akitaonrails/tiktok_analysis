package X;

import com.ss.android.vesdk.VECameraSettings;

/* JADX INFO: renamed from: X.0tJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660530tJT {
    public static final boolean LIZ(int i) {
        return ((i & 536870912) >> 29) == 1;
    }

    static {
        LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_9_16, false);
    }

    public static final VECameraSettings.CAMERA_MODE_TYPE LIZIZ(int i) {
        int i2 = (i & (-1073741824)) >> 30;
        if (i2 == EnumC1660550tJV.VIDEO_MODE.ordinal()) {
            return VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE;
        }
        if (i2 == EnumC1660550tJV.IMAGE_MODE.ordinal()) {
            return VECameraSettings.CAMERA_MODE_TYPE.IMAGE_MODE;
        }
        if (i2 == EnumC1660550tJV.AR_MODE.ordinal()) {
            return VECameraSettings.CAMERA_MODE_TYPE.AR_MODE;
        }
        return VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE;
    }

    public static final EnumC1660550tJV LIZJ(int i) {
        int i2 = (i & (-1073741824)) >> 30;
        EnumC1660550tJV enumC1660550tJV = EnumC1660550tJV.VIDEO_MODE;
        if (i2 != enumC1660550tJV.ordinal()) {
            EnumC1660550tJV enumC1660550tJV2 = EnumC1660550tJV.IMAGE_MODE;
            if (i2 == enumC1660550tJV2.ordinal()) {
                return enumC1660550tJV2;
            }
            EnumC1660550tJV enumC1660550tJV3 = EnumC1660550tJV.AR_MODE;
            if (i2 == enumC1660550tJV3.ordinal()) {
                return enumC1660550tJV3;
            }
        }
        return enumC1660550tJV;
    }

    public static final EnumC1448590nnd LIZLLL(int i) {
        int i2 = i & 536870911;
        EnumC1448590nnd enumC1448590nnd = EnumC1448590nnd.RATIO_9_16;
        if (i2 != enumC1448590nnd.ordinal()) {
            EnumC1448590nnd enumC1448590nnd2 = EnumC1448590nnd.RATIO_3_4;
            if (i2 != enumC1448590nnd2.ordinal()) {
                enumC1448590nnd2 = EnumC1448590nnd.RATIO_1_1;
                if (i2 == enumC1448590nnd2.ordinal()) {
                }
            }
            return enumC1448590nnd2;
        }
        return enumC1448590nnd;
    }

    public static final EnumC1448590nnd LJ(int i) {
        int i2 = i & 536870911;
        EnumC1448590nnd enumC1448590nnd = EnumC1448590nnd.RATIO_9_16;
        if (i2 == enumC1448590nnd.ordinal()) {
            return EnumC1448590nnd.RATIO_3_4;
        }
        if (i2 == EnumC1448590nnd.RATIO_3_4.ordinal()) {
            return enumC1448590nnd;
        }
        EnumC1448590nnd.RATIO_1_1.ordinal();
        return enumC1448590nnd;
    }

    public static final int LJFF(EnumC1660550tJV enumC1660550tJV, EnumC1448590nnd enumC1448590nnd, boolean z) {
        return ((enumC1660550tJV.ordinal() << 30) & (-1073741824)) | (enumC1448590nnd.ordinal() & 1073741823) | (((z ? 1 : 0) << 29) & 536870912);
    }
}
