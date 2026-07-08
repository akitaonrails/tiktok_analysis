package X;

/* JADX INFO: renamed from: X.0n3T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public enum EnumC1419970n3T {
    FACE(0),
    SCENEV1(1),
    SCENEV3(2),
    NH(3),
    RELEATION(4),
    CLASSIFICATION(5);

    public final int LL;

    public final int swigValue() {
        return this.LL;
    }

    public static EnumC1419970n3T swigToEnum(int i) {
        EnumC1419970n3T[] enumC1419970n3TArr = (EnumC1419970n3T[]) EnumC1419970n3T.class.getEnumConstants();
        if (i < enumC1419970n3TArr.length && i >= 0) {
            EnumC1419970n3T enumC1419970n3T = enumC1419970n3TArr[i];
            if (enumC1419970n3T.LL == i) {
                return enumC1419970n3T;
            }
        }
        for (EnumC1419970n3T enumC1419970n3T2 : enumC1419970n3TArr) {
            if (enumC1419970n3T2.LL == i) {
                return enumC1419970n3T2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(EnumC1419970n3T.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static EnumC1419970n3T valueOf(String str) {
        return (EnumC1419970n3T) C08FF.LIZ(EnumC1419970n3T.class, str);
    }

    EnumC1419970n3T(int i) {
        this.LL = i;
    }
}
