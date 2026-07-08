package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ah5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC944810ah5 {
    public static final EnumC944810ah5 ANCHOR;
    public static final /* synthetic */ EnumC944810ah5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC944810ah5 MANUAL_PK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC944810ah5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC944810ah5 enumC944810ah5 = new EnumC944810ah5("ANCHOR", 0, "anchor");
        ANCHOR = enumC944810ah5;
        EnumC944810ah5 enumC944810ah52 = new EnumC944810ah5("MANUAL_PK", 1, "manual_pk");
        MANUAL_PK = enumC944810ah52;
        EnumC944810ah5[] enumC944810ah5Arr = {enumC944810ah5, enumC944810ah52};
        LLILLJJLI = enumC944810ah5Arr;
        LLILLL = new C2254308sP(enumC944810ah5Arr);
    }

    public static EnumC944810ah5[] values() {
        return (EnumC944810ah5[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC944810ah5 valueOf(String str) {
        return (EnumC944810ah5) C08FF.LIZ(EnumC944810ah5.class, str);
    }

    public EnumC944810ah5(String str, int i, String str2) {
        this.LL = str2;
    }
}
