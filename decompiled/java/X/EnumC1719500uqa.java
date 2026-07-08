package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1719500uqa {
    public static final EnumC1719500uqa LAYOUT;
    public static final /* synthetic */ EnumC1719500uqa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1719500uqa LTR;
    public static final EnumC1719500uqa RTL;

    public static InterfaceC2044707zh<EnumC1719500uqa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1719500uqa enumC1719500uqa = new EnumC1719500uqa("LTR", 0);
        LTR = enumC1719500uqa;
        EnumC1719500uqa enumC1719500uqa2 = new EnumC1719500uqa("RTL", 1);
        RTL = enumC1719500uqa2;
        EnumC1719500uqa enumC1719500uqa3 = new EnumC1719500uqa("LAYOUT", 2);
        LAYOUT = enumC1719500uqa3;
        EnumC1719500uqa[] enumC1719500uqaArr = {enumC1719500uqa, enumC1719500uqa2, enumC1719500uqa3};
        LL = enumC1719500uqaArr;
        LLILLJJLI = new C2254308sP(enumC1719500uqaArr);
    }

    public static EnumC1719500uqa[] values() {
        return (EnumC1719500uqa[]) LL.clone();
    }

    public static EnumC1719500uqa valueOf(String str) {
        return (EnumC1719500uqa) C08FF.LIZ(EnumC1719500uqa.class, str);
    }

    public EnumC1719500uqa(String str, int i) {
    }
}
