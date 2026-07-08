package X;

/* JADX INFO: renamed from: X.0kpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1334360kpO {
    LOW,
    MEDIUM,
    HIGH,
    IMMEDIATE;

    public static EnumC1334360kpO valueOf(String str) {
        return (EnumC1334360kpO) C08FF.LIZ(EnumC1334360kpO.class, str);
    }

    public static EnumC1334360kpO getHigherPriority(EnumC1334360kpO enumC1334360kpO, EnumC1334360kpO enumC1334360kpO2) {
        if (enumC1334360kpO == null) {
            return enumC1334360kpO2;
        }
        if (enumC1334360kpO2 == null || enumC1334360kpO.ordinal() > enumC1334360kpO2.ordinal()) {
            return enumC1334360kpO;
        }
        return enumC1334360kpO2;
    }
}
