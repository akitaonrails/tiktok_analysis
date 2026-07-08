package X;

/* JADX INFO: renamed from: X.0gHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159490gHL {
    public static EnumC1159500gHM LIZ(float f) {
        EnumC1159500gHM[] enumC1159500gHMArrValues = EnumC1159500gHM.values();
        int length = enumC1159500gHMArrValues.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                EnumC1159500gHM enumC1159500gHM = enumC1159500gHMArrValues[length];
                if (enumC1159500gHM.getProgressValue() != f) {
                    if (i < 0) {
                        break;
                    }
                    length = i;
                } else {
                    return enumC1159500gHM;
                }
            }
        }
        return null;
    }
}
