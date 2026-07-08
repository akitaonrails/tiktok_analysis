package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0daZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1056090daZ {
    public static final EnumC1056090daZ CONTACT_BOOK_SYNCING;
    public static final /* synthetic */ EnumC1056090daZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 5;

    public static InterfaceC2044707zh<EnumC1056090daZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1056090daZ enumC1056090daZ = new EnumC1056090daZ();
        CONTACT_BOOK_SYNCING = enumC1056090daZ;
        EnumC1056090daZ[] enumC1056090daZArr = {enumC1056090daZ};
        LLILLJJLI = enumC1056090daZArr;
        LLILLL = new C2254308sP(enumC1056090daZArr);
    }

    public static EnumC1056090daZ[] values() {
        return (EnumC1056090daZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1056090daZ valueOf(String str) {
        return (EnumC1056090daZ) C08FF.LIZ(EnumC1056090daZ.class, str);
    }
}
