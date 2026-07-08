package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC342220DbI {
    public static final EnumC342220DbI CANCEL;
    public static final EnumC342220DbI EFFECT;
    public static final /* synthetic */ EnumC342220DbI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC342220DbI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC342220DbI enumC342220DbI = new EnumC342220DbI("CANCEL", 0);
        CANCEL = enumC342220DbI;
        EnumC342220DbI enumC342220DbI2 = new EnumC342220DbI("EFFECT", 1);
        EFFECT = enumC342220DbI2;
        EnumC342220DbI[] enumC342220DbIArr = {enumC342220DbI, enumC342220DbI2};
        LL = enumC342220DbIArr;
        LLILLJJLI = new C2254308sP(enumC342220DbIArr);
    }

    public static EnumC342220DbI[] values() {
        return (EnumC342220DbI[]) LL.clone();
    }

    public static EnumC342220DbI valueOf(String str) {
        return (EnumC342220DbI) C08FF.LIZ(EnumC342220DbI.class, str);
    }

    public EnumC342220DbI(String str, int i) {
    }
}
