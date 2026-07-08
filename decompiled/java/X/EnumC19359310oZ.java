package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10oZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19359310oZ {
    public static final EnumC19359310oZ FYP;
    public static final EnumC19359310oZ INBOX_PROFILE;
    public static final /* synthetic */ EnumC19359310oZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19359310oZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19359310oZ enumC19359310oZ = new EnumC19359310oZ("FYP", 0);
        FYP = enumC19359310oZ;
        EnumC19359310oZ enumC19359310oZ2 = new EnumC19359310oZ("INBOX_PROFILE", 1);
        INBOX_PROFILE = enumC19359310oZ2;
        EnumC19359310oZ[] enumC19359310oZArr = {enumC19359310oZ, enumC19359310oZ2};
        LL = enumC19359310oZArr;
        LLILLJJLI = new C2254308sP(enumC19359310oZArr);
    }

    public static EnumC19359310oZ[] values() {
        return (EnumC19359310oZ[]) LL.clone();
    }

    public static EnumC19359310oZ valueOf(String str) {
        return (EnumC19359310oZ) C08FF.LIZ(EnumC19359310oZ.class, str);
    }

    public EnumC19359310oZ(String str, int i) {
    }
}
