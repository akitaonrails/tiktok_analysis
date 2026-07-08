package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19645311tb {
    public static final EnumC19645311tb EDIT;
    public static final /* synthetic */ EnumC19645311tb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19645311tb NONE;
    public static final EnumC19645311tb PASTE;

    public static InterfaceC2044707zh<EnumC19645311tb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19645311tb enumC19645311tb = new EnumC19645311tb("NONE", 0);
        NONE = enumC19645311tb;
        EnumC19645311tb enumC19645311tb2 = new EnumC19645311tb("PASTE", 1);
        PASTE = enumC19645311tb2;
        EnumC19645311tb enumC19645311tb3 = new EnumC19645311tb("EDIT", 2);
        EDIT = enumC19645311tb3;
        EnumC19645311tb[] enumC19645311tbArr = {enumC19645311tb, enumC19645311tb2, enumC19645311tb3};
        LL = enumC19645311tbArr;
        LLILLJJLI = new C2254308sP(enumC19645311tbArr);
    }

    public static EnumC19645311tb[] values() {
        return (EnumC19645311tb[]) LL.clone();
    }

    public static EnumC19645311tb valueOf(String str) {
        return (EnumC19645311tb) C08FF.LIZ(EnumC19645311tb.class, str);
    }

    public EnumC19645311tb(String str, int i) {
    }
}
