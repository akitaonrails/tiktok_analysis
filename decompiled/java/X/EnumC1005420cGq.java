package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1005420cGq {
    public static final EnumC1005420cGq ENTER_FROM;
    public static final /* synthetic */ EnumC1005420cGq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1005420cGq REFER;

    public static InterfaceC2044707zh<EnumC1005420cGq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1005420cGq enumC1005420cGq = new EnumC1005420cGq("ENTER_FROM", 0);
        ENTER_FROM = enumC1005420cGq;
        EnumC1005420cGq enumC1005420cGq2 = new EnumC1005420cGq("REFER", 1);
        REFER = enumC1005420cGq2;
        EnumC1005420cGq[] enumC1005420cGqArr = {enumC1005420cGq, enumC1005420cGq2};
        LL = enumC1005420cGqArr;
        LLILLJJLI = new C2254308sP(enumC1005420cGqArr);
    }

    public static EnumC1005420cGq[] values() {
        return (EnumC1005420cGq[]) LL.clone();
    }

    public static EnumC1005420cGq valueOf(String str) {
        return (EnumC1005420cGq) C08FF.LIZ(EnumC1005420cGq.class, str);
    }

    public EnumC1005420cGq(String str, int i) {
    }
}
