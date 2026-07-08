package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class EnumC1273220jEm {
    public static final EnumC1273220jEm EFFECT_MIX;
    public static final EnumC1273220jEm HYBRID_MIX;
    public static final /* synthetic */ EnumC1273220jEm[] LL;

    public EnumC1273220jEm() {
        throw null;
    }

    static {
        EnumC1273220jEm enumC1273220jEm = new EnumC1273220jEm() { // from class: X.0jEr
            @Override // java.lang.Enum
            public final String toString() {
                return "HYBRID_MIX";
            }
        };
        HYBRID_MIX = enumC1273220jEm;
        EnumC1273220jEm enumC1273220jEm2 = new EnumC1273220jEm() { // from class: X.0jEs
            @Override // java.lang.Enum
            public final String toString() {
                return "EFFECT_MIX";
            }
        };
        EFFECT_MIX = enumC1273220jEm2;
        LL = new EnumC1273220jEm[]{enumC1273220jEm, enumC1273220jEm2};
    }

    public static EnumC1273220jEm[] values() {
        return (EnumC1273220jEm[]) LL.clone();
    }

    public static EnumC1273220jEm valueOf(String str) {
        return (EnumC1273220jEm) C08FF.LIZ(EnumC1273220jEm.class, str);
    }

    public EnumC1273220jEm(String str, int i) {
    }
}
