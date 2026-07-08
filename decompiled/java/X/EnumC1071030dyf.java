package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1071030dyf {
    public static final EnumC1071030dyf CONTACT;
    public static final EnumC1071030dyf FACEBOOK;
    public static final /* synthetic */ EnumC1071030dyf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1071030dyf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1071030dyf enumC1071030dyf = new EnumC1071030dyf("CONTACT", 0);
        CONTACT = enumC1071030dyf;
        EnumC1071030dyf enumC1071030dyf2 = new EnumC1071030dyf("FACEBOOK", 1);
        FACEBOOK = enumC1071030dyf2;
        EnumC1071030dyf[] enumC1071030dyfArr = {enumC1071030dyf, enumC1071030dyf2};
        LL = enumC1071030dyfArr;
        LLILLJJLI = new C2254308sP(enumC1071030dyfArr);
    }

    public static EnumC1071030dyf[] values() {
        return (EnumC1071030dyf[]) LL.clone();
    }

    public static EnumC1071030dyf valueOf(String str) {
        return (EnumC1071030dyf) C08FF.LIZ(EnumC1071030dyf.class, str);
    }

    public EnumC1071030dyf(String str, int i) {
    }
}
