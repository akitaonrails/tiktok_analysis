package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0utW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1721320utW {
    public static final EnumC1721320utW BOLD;
    public static final EnumC1721320utW ITALICS;
    public static final EnumC1721320utW LINK;
    public static final /* synthetic */ EnumC1721320utW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1721320utW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1721320utW enumC1721320utW = new EnumC1721320utW("BOLD", 0);
        BOLD = enumC1721320utW;
        EnumC1721320utW enumC1721320utW2 = new EnumC1721320utW("LINK", 1);
        LINK = enumC1721320utW2;
        EnumC1721320utW enumC1721320utW3 = new EnumC1721320utW("ITALICS", 2);
        ITALICS = enumC1721320utW3;
        EnumC1721320utW[] enumC1721320utWArr = {enumC1721320utW, enumC1721320utW2, enumC1721320utW3};
        LL = enumC1721320utWArr;
        LLILLJJLI = new C2254308sP(enumC1721320utWArr);
    }

    public static EnumC1721320utW[] values() {
        return (EnumC1721320utW[]) LL.clone();
    }

    public static EnumC1721320utW valueOf(String str) {
        return (EnumC1721320utW) C08FF.LIZ(EnumC1721320utW.class, str);
    }

    public EnumC1721320utW(String str, int i) {
    }
}
