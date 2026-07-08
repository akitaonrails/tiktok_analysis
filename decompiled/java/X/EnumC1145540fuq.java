package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fuq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1145540fuq {
    public static final EnumC1145540fuq FONT;
    public static final EnumC1145540fuq IMAGE;
    public static final /* synthetic */ EnumC1145540fuq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1145540fuq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1145540fuq enumC1145540fuq = new EnumC1145540fuq("IMAGE", 0);
        IMAGE = enumC1145540fuq;
        EnumC1145540fuq enumC1145540fuq2 = new EnumC1145540fuq("FONT", 1);
        FONT = enumC1145540fuq2;
        EnumC1145540fuq[] enumC1145540fuqArr = {enumC1145540fuq, enumC1145540fuq2};
        LL = enumC1145540fuqArr;
        LLILLJJLI = new C2254308sP(enumC1145540fuqArr);
    }

    public static EnumC1145540fuq[] values() {
        return (EnumC1145540fuq[]) LL.clone();
    }

    public static EnumC1145540fuq valueOf(String str) {
        return (EnumC1145540fuq) C08FF.LIZ(EnumC1145540fuq.class, str);
    }

    public EnumC1145540fuq(String str, int i) {
    }
}
