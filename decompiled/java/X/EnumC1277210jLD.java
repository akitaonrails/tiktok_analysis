package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class EnumC1277210jLD {
    public static final /* synthetic */ EnumC1277210jLD[] LL;
    public static final EnumC1277210jLD MULTI_VIEW;
    public static final EnumC1277210jLD SINGLE_VIEW;

    public EnumC1277210jLD() {
        throw null;
    }

    static {
        EnumC1277210jLD enumC1277210jLD = new EnumC1277210jLD() { // from class: X.0jLE
            @Override // java.lang.Enum
            public final String toString() {
                return "MULTI_VIEW";
            }
        };
        MULTI_VIEW = enumC1277210jLD;
        EnumC1277210jLD enumC1277210jLD2 = new EnumC1277210jLD() { // from class: X.0jLF
            @Override // java.lang.Enum
            public final String toString() {
                return "SINGLE_VIEW";
            }
        };
        SINGLE_VIEW = enumC1277210jLD2;
        LL = new EnumC1277210jLD[]{enumC1277210jLD, enumC1277210jLD2};
    }

    public static EnumC1277210jLD[] values() {
        return (EnumC1277210jLD[]) LL.clone();
    }

    public static EnumC1277210jLD valueOf(String str) {
        return (EnumC1277210jLD) C08FF.LIZ(EnumC1277210jLD.class, str);
    }

    public EnumC1277210jLD(String str, int i) {
    }
}
