package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Wuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC838370Wuh {
    public static final EnumC838370Wuh FUZZY;
    public static final EnumC838370Wuh IGNORE;
    public static final /* synthetic */ EnumC838370Wuh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC838370Wuh STRICT;

    public static InterfaceC2044707zh<EnumC838370Wuh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC838370Wuh enumC838370Wuh = new EnumC838370Wuh("IGNORE", 0);
        IGNORE = enumC838370Wuh;
        EnumC838370Wuh enumC838370Wuh2 = new EnumC838370Wuh("FUZZY", 1);
        FUZZY = enumC838370Wuh2;
        EnumC838370Wuh enumC838370Wuh3 = new EnumC838370Wuh("STRICT", 2);
        STRICT = enumC838370Wuh3;
        EnumC838370Wuh[] enumC838370WuhArr = {enumC838370Wuh, enumC838370Wuh2, enumC838370Wuh3};
        LL = enumC838370WuhArr;
        LLILLJJLI = new C2254308sP(enumC838370WuhArr);
    }

    public static EnumC838370Wuh[] values() {
        return (EnumC838370Wuh[]) LL.clone();
    }

    public static EnumC838370Wuh valueOf(String str) {
        return (EnumC838370Wuh) C08FF.LIZ(EnumC838370Wuh.class, str);
    }

    public EnumC838370Wuh(String str, int i) {
    }
}
