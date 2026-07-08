package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973940bS4 {
    public static final /* synthetic */ EnumC973940bS4[] LL;

    static {
        EnumC973940bS4[] enumC973940bS4Arr = {new EnumC973940bS4("SWITCH", 0, "switch"), new EnumC973940bS4("AUTO_SWITCH", 1, "auto_switch"), new EnumC973940bS4("PERFORMER_QUIT", 2, "performer_quit"), new EnumC973940bS4("OTHERS_QUIT", 3, "others_quit")};
        LL = enumC973940bS4Arr;
        new C2254308sP(enumC973940bS4Arr);
    }

    public static EnumC973940bS4[] values() {
        return (EnumC973940bS4[]) LL.clone();
    }

    public static EnumC973940bS4 valueOf(String str) {
        return (EnumC973940bS4) C08FF.LIZ(EnumC973940bS4.class, str);
    }

    public EnumC973940bS4(String str, int i, String str2) {
    }
}
