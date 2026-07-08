package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0og7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1482370og7 {
    public static final EnumC1482370og7 COMMON_BLOCK;
    public static final EnumC1482370og7 INVALID;
    public static final /* synthetic */ EnumC1482370og7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1482370og7 PRE_BLOCK;
    public static final EnumC1482370og7 SEEK_BLOCK;

    public static InterfaceC2044707zh<EnumC1482370og7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1482370og7 enumC1482370og7 = new EnumC1482370og7("INVALID", 0);
        INVALID = enumC1482370og7;
        EnumC1482370og7 enumC1482370og72 = new EnumC1482370og7("PRE_BLOCK", 1);
        PRE_BLOCK = enumC1482370og72;
        EnumC1482370og7 enumC1482370og73 = new EnumC1482370og7("SEEK_BLOCK", 2);
        SEEK_BLOCK = enumC1482370og73;
        EnumC1482370og7 enumC1482370og74 = new EnumC1482370og7("COMMON_BLOCK", 3);
        COMMON_BLOCK = enumC1482370og74;
        EnumC1482370og7[] enumC1482370og7Arr = {enumC1482370og7, enumC1482370og72, enumC1482370og73, enumC1482370og74};
        LL = enumC1482370og7Arr;
        LLILLJJLI = new C2254308sP(enumC1482370og7Arr);
    }

    public static EnumC1482370og7[] values() {
        return (EnumC1482370og7[]) LL.clone();
    }

    public static EnumC1482370og7 valueOf(String str) {
        return (EnumC1482370og7) C08FF.LIZ(EnumC1482370og7.class, str);
    }

    public EnumC1482370og7(String str, int i) {
    }
}
