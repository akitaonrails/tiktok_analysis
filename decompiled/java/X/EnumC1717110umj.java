package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0umj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1717110umj {
    public static final EnumC1717110umj CHANGE_PHONE;
    public static final /* synthetic */ EnumC1717110umj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1717110umj REGISTRATION;

    public static InterfaceC2044707zh<EnumC1717110umj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1717110umj enumC1717110umj = new EnumC1717110umj("REGISTRATION", 0);
        REGISTRATION = enumC1717110umj;
        EnumC1717110umj enumC1717110umj2 = new EnumC1717110umj("CHANGE_PHONE", 1);
        CHANGE_PHONE = enumC1717110umj2;
        EnumC1717110umj[] enumC1717110umjArr = {enumC1717110umj, enumC1717110umj2};
        LL = enumC1717110umjArr;
        LLILLJJLI = new C2254308sP(enumC1717110umjArr);
    }

    public static EnumC1717110umj[] values() {
        return (EnumC1717110umj[]) LL.clone();
    }

    public static EnumC1717110umj valueOf(String str) {
        return (EnumC1717110umj) C08FF.LIZ(EnumC1717110umj.class, str);
    }

    public EnumC1717110umj(String str, int i) {
    }
}
