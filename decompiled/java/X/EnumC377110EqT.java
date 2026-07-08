package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC377110EqT {
    public static final EnumC377110EqT CONFIRM;
    public static final /* synthetic */ EnumC377110EqT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC377110EqT RESET;

    public static InterfaceC2044707zh<EnumC377110EqT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC377110EqT enumC377110EqT = new EnumC377110EqT("RESET", 0);
        RESET = enumC377110EqT;
        EnumC377110EqT enumC377110EqT2 = new EnumC377110EqT("CONFIRM", 1);
        CONFIRM = enumC377110EqT2;
        EnumC377110EqT[] enumC377110EqTArr = {enumC377110EqT, enumC377110EqT2};
        LL = enumC377110EqTArr;
        LLILLJJLI = new C2254308sP(enumC377110EqTArr);
    }

    public static EnumC377110EqT[] values() {
        return (EnumC377110EqT[]) LL.clone();
    }

    public static EnumC377110EqT valueOf(String str) {
        return (EnumC377110EqT) C08FF.LIZ(EnumC377110EqT.class, str);
    }

    public EnumC377110EqT(String str, int i) {
    }
}
