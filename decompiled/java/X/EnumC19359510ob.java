package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19359510ob {
    public static final EnumC19359510ob BACK_BUTTON;
    public static final /* synthetic */ EnumC19359510ob[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19359510ob SEND_BUTTON;
    public static final EnumC19359510ob TOOL_BAR;

    public static InterfaceC2044707zh<EnumC19359510ob> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19359510ob enumC19359510ob = new EnumC19359510ob("BACK_BUTTON", 0);
        BACK_BUTTON = enumC19359510ob;
        EnumC19359510ob enumC19359510ob2 = new EnumC19359510ob("SEND_BUTTON", 1);
        SEND_BUTTON = enumC19359510ob2;
        EnumC19359510ob enumC19359510ob3 = new EnumC19359510ob("TOOL_BAR", 2);
        TOOL_BAR = enumC19359510ob3;
        EnumC19359510ob[] enumC19359510obArr = {enumC19359510ob, enumC19359510ob2, enumC19359510ob3};
        LL = enumC19359510obArr;
        LLILLJJLI = new C2254308sP(enumC19359510obArr);
    }

    public static EnumC19359510ob[] values() {
        return (EnumC19359510ob[]) LL.clone();
    }

    public static EnumC19359510ob valueOf(String str) {
        return (EnumC19359510ob) C08FF.LIZ(EnumC19359510ob.class, str);
    }

    public EnumC19359510ob(String str, int i) {
    }
}
