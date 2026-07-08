package X;

import com.bytedance.ies.abmock.SaveConfigType$ConfigType;

/* JADX INFO: renamed from: X.0C4O, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C0C4O {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SaveConfigType$ConfigType.values().length];
        iArr[SaveConfigType$ConfigType.BOOLEAN.ordinal()] = 1;
        iArr[SaveConfigType$ConfigType.INT.ordinal()] = 2;
        iArr[SaveConfigType$ConfigType.LONG.ordinal()] = 3;
        iArr[SaveConfigType$ConfigType.DOUBLE.ordinal()] = 4;
        iArr[SaveConfigType$ConfigType.FLOAT.ordinal()] = 5;
        iArr[SaveConfigType$ConfigType.STRING.ordinal()] = 6;
        iArr[SaveConfigType$ConfigType.STRING_ARRAY.ordinal()] = 7;
        iArr[SaveConfigType$ConfigType.OBJECT.ordinal()] = 8;
        LIZ = iArr;
    }
}
