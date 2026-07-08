package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07xF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2029507xF {
    public static final EnumC2029507xF INSTANCE;
    public static final /* synthetic */ EnumC2029507xF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2029507xF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2029507xF enumC2029507xF = new EnumC2029507xF();
        INSTANCE = enumC2029507xF;
        EnumC2029507xF[] enumC2029507xFArr = {enumC2029507xF};
        LL = enumC2029507xFArr;
        LLILLJJLI = new C2254308sP(enumC2029507xFArr);
    }

    public static EnumC2029507xF[] values() {
        return (EnumC2029507xF[]) LL.clone();
    }

    public static EnumC2029507xF valueOf(String str) {
        return (EnumC2029507xF) C08FF.LIZ(EnumC2029507xF.class, str);
    }
}
