package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1071070dyj {
    public static final EnumC1071070dyj CONTACT;
    public static final EnumC1071070dyj FACEBOOK;
    public static final /* synthetic */ EnumC1071070dyj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1071070dyj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1071070dyj enumC1071070dyj = new EnumC1071070dyj("FACEBOOK", 0);
        FACEBOOK = enumC1071070dyj;
        EnumC1071070dyj enumC1071070dyj2 = new EnumC1071070dyj("CONTACT", 1);
        CONTACT = enumC1071070dyj2;
        EnumC1071070dyj[] enumC1071070dyjArr = {enumC1071070dyj, enumC1071070dyj2};
        LL = enumC1071070dyjArr;
        LLILLJJLI = new C2254308sP(enumC1071070dyjArr);
    }

    public static EnumC1071070dyj[] values() {
        return (EnumC1071070dyj[]) LL.clone();
    }

    public static EnumC1071070dyj valueOf(String str) {
        return (EnumC1071070dyj) C08FF.LIZ(EnumC1071070dyj.class, str);
    }

    public EnumC1071070dyj(String str, int i) {
    }
}
