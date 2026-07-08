package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993380bxQ {
    public static final /* synthetic */ EnumC993380bxQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993380bxQ TYPE_LINK;
    public static final EnumC993380bxQ TYPE_NO_LINK;

    public static InterfaceC2044707zh<EnumC993380bxQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993380bxQ enumC993380bxQ = new EnumC993380bxQ("TYPE_LINK", 0);
        TYPE_LINK = enumC993380bxQ;
        EnumC993380bxQ enumC993380bxQ2 = new EnumC993380bxQ("TYPE_NO_LINK", 1);
        TYPE_NO_LINK = enumC993380bxQ2;
        EnumC993380bxQ[] enumC993380bxQArr = {enumC993380bxQ, enumC993380bxQ2};
        LL = enumC993380bxQArr;
        LLILLJJLI = new C2254308sP(enumC993380bxQArr);
    }

    public static EnumC993380bxQ[] values() {
        return (EnumC993380bxQ[]) LL.clone();
    }

    public static EnumC993380bxQ valueOf(String str) {
        return (EnumC993380bxQ) C08FF.LIZ(EnumC993380bxQ.class, str);
    }

    public EnumC993380bxQ(String str, int i) {
    }
}
