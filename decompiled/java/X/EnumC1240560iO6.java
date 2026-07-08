package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1240560iO6 {
    public static final EnumC1240560iO6 FOLLOWING;
    public static final EnumC1240560iO6 FOLLOW_EACH_OTHER;
    public static final EnumC1240560iO6 FOLLOW_REQUEST;
    public static final /* synthetic */ EnumC1240560iO6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1240560iO6 NO_RELATION;
    public static final EnumC1240560iO6 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1240560iO6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1240560iO6 enumC1240560iO6 = new EnumC1240560iO6("UNKNOWN", 0, -1);
        UNKNOWN = enumC1240560iO6;
        EnumC1240560iO6 enumC1240560iO62 = new EnumC1240560iO6("NO_RELATION", 1, 0);
        NO_RELATION = enumC1240560iO62;
        EnumC1240560iO6 enumC1240560iO63 = new EnumC1240560iO6("FOLLOWING", 2, 1);
        FOLLOWING = enumC1240560iO63;
        EnumC1240560iO6 enumC1240560iO64 = new EnumC1240560iO6("FOLLOW_EACH_OTHER", 3, 2);
        FOLLOW_EACH_OTHER = enumC1240560iO64;
        EnumC1240560iO6 enumC1240560iO65 = new EnumC1240560iO6("FOLLOW_REQUEST", 4, 4);
        FOLLOW_REQUEST = enumC1240560iO65;
        EnumC1240560iO6[] enumC1240560iO6Arr = {enumC1240560iO6, enumC1240560iO62, enumC1240560iO63, enumC1240560iO64, enumC1240560iO65};
        LLILLJJLI = enumC1240560iO6Arr;
        LLILLL = new C2254308sP(enumC1240560iO6Arr);
    }

    public static EnumC1240560iO6[] values() {
        return (EnumC1240560iO6[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC1240560iO6 valueOf(String str) {
        return (EnumC1240560iO6) C08FF.LIZ(EnumC1240560iO6.class, str);
    }

    public EnumC1240560iO6(String str, int i, int i2) {
        this.LL = i2;
    }
}
