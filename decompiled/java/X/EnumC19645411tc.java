package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19645411tc {
    public static final /* synthetic */ EnumC19645411tc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19645411tc ON_CLOSED;
    public static final EnumC19645411tc ON_CONFIRMED;
    public static final EnumC19645411tc ON_EDIT;

    public static InterfaceC2044707zh<EnumC19645411tc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19645411tc enumC19645411tc = new EnumC19645411tc("ON_CLOSED", 0);
        ON_CLOSED = enumC19645411tc;
        EnumC19645411tc enumC19645411tc2 = new EnumC19645411tc("ON_CONFIRMED", 1);
        ON_CONFIRMED = enumC19645411tc2;
        EnumC19645411tc enumC19645411tc3 = new EnumC19645411tc("ON_EDIT", 2);
        ON_EDIT = enumC19645411tc3;
        EnumC19645411tc[] enumC19645411tcArr = {enumC19645411tc, enumC19645411tc2, enumC19645411tc3};
        LL = enumC19645411tcArr;
        LLILLJJLI = new C2254308sP(enumC19645411tcArr);
    }

    public static EnumC19645411tc[] values() {
        return (EnumC19645411tc[]) LL.clone();
    }

    public static EnumC19645411tc valueOf(String str) {
        return (EnumC19645411tc) C08FF.LIZ(EnumC19645411tc.class, str);
    }

    public EnumC19645411tc(String str, int i) {
    }
}
