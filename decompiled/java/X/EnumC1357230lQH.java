package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1357230lQH {
    public static final /* synthetic */ EnumC1357230lQH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1357230lQH NORMAL;
    public static final EnumC1357230lQH NO_PREFIX;

    public static InterfaceC2044707zh<EnumC1357230lQH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1357230lQH enumC1357230lQH = new EnumC1357230lQH("NO_PREFIX", 0);
        NO_PREFIX = enumC1357230lQH;
        EnumC1357230lQH enumC1357230lQH2 = new EnumC1357230lQH("NORMAL", 1);
        NORMAL = enumC1357230lQH2;
        EnumC1357230lQH[] enumC1357230lQHArr = {enumC1357230lQH, enumC1357230lQH2};
        LL = enumC1357230lQHArr;
        LLILLJJLI = new C2254308sP(enumC1357230lQHArr);
    }

    public static EnumC1357230lQH[] values() {
        return (EnumC1357230lQH[]) LL.clone();
    }

    public static EnumC1357230lQH valueOf(String str) {
        return (EnumC1357230lQH) C08FF.LIZ(EnumC1357230lQH.class, str);
    }

    public EnumC1357230lQH(String str, int i) {
    }
}
