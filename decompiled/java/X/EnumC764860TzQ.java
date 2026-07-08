package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC764860TzQ {
    public static final EnumC764860TzQ CLOSE;
    public static final EnumC764860TzQ FORBID_CLOSE;
    public static final /* synthetic */ EnumC764860TzQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC764860TzQ OPEN;

    public static InterfaceC2044707zh<EnumC764860TzQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC764860TzQ enumC764860TzQ = new EnumC764860TzQ("OPEN", 0);
        OPEN = enumC764860TzQ;
        EnumC764860TzQ enumC764860TzQ2 = new EnumC764860TzQ("CLOSE", 1);
        CLOSE = enumC764860TzQ2;
        EnumC764860TzQ enumC764860TzQ3 = new EnumC764860TzQ("FORBID_CLOSE", 2);
        FORBID_CLOSE = enumC764860TzQ3;
        EnumC764860TzQ[] enumC764860TzQArr = {enumC764860TzQ, enumC764860TzQ2, enumC764860TzQ3};
        LL = enumC764860TzQArr;
        LLILLJJLI = new C2254308sP(enumC764860TzQArr);
    }

    public static EnumC764860TzQ[] values() {
        return (EnumC764860TzQ[]) LL.clone();
    }

    public static EnumC764860TzQ valueOf(String str) {
        return (EnumC764860TzQ) C08FF.LIZ(EnumC764860TzQ.class, str);
    }

    public EnumC764860TzQ(String str, int i) {
    }
}
