package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.137z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class EnumC199605137z {
    public static final EnumC199605137z COLLECTED;
    public static final EnumC199605137z EXPIRED;
    public static final EnumC199605137z EXPLICIT;
    public static final /* synthetic */ EnumC199605137z[] LL;
    public static final EnumC199605137z REPLACED;
    public static final EnumC199605137z SIZE;

    public EnumC199605137z() {
        throw null;
    }

    public abstract boolean LIZJ();

    static {
        EnumC199605137z enumC199605137z = new EnumC199605137z() { // from class: X.1389
            @Override // X.EnumC199605137z
            public final boolean LIZJ() {
                return false;
            }
        };
        EXPLICIT = enumC199605137z;
        EnumC199605137z enumC199605137z2 = new EnumC199605137z() { // from class: X.138G
            @Override // X.EnumC199605137z
            public final boolean LIZJ() {
                return false;
            }
        };
        REPLACED = enumC199605137z2;
        EnumC199605137z enumC199605137z3 = new EnumC199605137z() { // from class: X.138H
            @Override // X.EnumC199605137z
            public final boolean LIZJ() {
                return true;
            }
        };
        COLLECTED = enumC199605137z3;
        EnumC199605137z enumC199605137z4 = new EnumC199605137z() { // from class: X.138I
            @Override // X.EnumC199605137z
            public final boolean LIZJ() {
                return true;
            }
        };
        EXPIRED = enumC199605137z4;
        EnumC199605137z enumC199605137z5 = new EnumC199605137z() { // from class: X.138J
            @Override // X.EnumC199605137z
            public final boolean LIZJ() {
                return true;
            }
        };
        SIZE = enumC199605137z5;
        LL = new EnumC199605137z[]{enumC199605137z, enumC199605137z2, enumC199605137z3, enumC199605137z4, enumC199605137z5};
    }

    public static EnumC199605137z[] values() {
        return (EnumC199605137z[]) LL.clone();
    }

    public static EnumC199605137z valueOf(String str) {
        return (EnumC199605137z) C08FF.LIZ(EnumC199605137z.class, str);
    }

    public EnumC199605137z(String str, int i) {
    }
}
