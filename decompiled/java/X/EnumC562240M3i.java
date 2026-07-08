package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562240M3i {
    public static final EnumC562240M3i BY_CREATE_TIME;
    public static final EnumC562240M3i BY_EDIT_TIME;
    public static final /* synthetic */ EnumC562240M3i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC562240M3i> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC562240M3i enumC562240M3i = new EnumC562240M3i("BY_CREATE_TIME", 0);
        BY_CREATE_TIME = enumC562240M3i;
        EnumC562240M3i enumC562240M3i2 = new EnumC562240M3i("BY_EDIT_TIME", 1);
        BY_EDIT_TIME = enumC562240M3i2;
        EnumC562240M3i[] enumC562240M3iArr = {enumC562240M3i, enumC562240M3i2};
        LL = enumC562240M3iArr;
        LLILLJJLI = new C2254308sP(enumC562240M3iArr);
    }

    public static EnumC562240M3i[] values() {
        return (EnumC562240M3i[]) LL.clone();
    }

    public static EnumC562240M3i valueOf(String str) {
        return (EnumC562240M3i) C08FF.LIZ(EnumC562240M3i.class, str);
    }

    public EnumC562240M3i(String str, int i) {
    }
}
