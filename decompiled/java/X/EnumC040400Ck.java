package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040400Ck {
    public static final EnumC040400Ck AWAY;
    public static final EnumC040400Ck FAILED;
    public static final /* synthetic */ EnumC040400Ck[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040400Ck REQUEST;
    public static final EnumC040400Ck SUCCESS;

    public static InterfaceC2044707zh<EnumC040400Ck> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040400Ck enumC040400Ck = new EnumC040400Ck("FAILED", 0);
        FAILED = enumC040400Ck;
        EnumC040400Ck enumC040400Ck2 = new EnumC040400Ck("SUCCESS", 1);
        SUCCESS = enumC040400Ck2;
        EnumC040400Ck enumC040400Ck3 = new EnumC040400Ck("AWAY", 2);
        AWAY = enumC040400Ck3;
        EnumC040400Ck enumC040400Ck4 = new EnumC040400Ck("REQUEST", 3);
        REQUEST = enumC040400Ck4;
        EnumC040400Ck[] enumC040400CkArr = {enumC040400Ck, enumC040400Ck2, enumC040400Ck3, enumC040400Ck4};
        LL = enumC040400CkArr;
        LLILLJJLI = new C2254308sP(enumC040400CkArr);
    }

    public static EnumC040400Ck[] values() {
        return (EnumC040400Ck[]) LL.clone();
    }

    public static EnumC040400Ck valueOf(String str) {
        return (EnumC040400Ck) C08FF.LIZ(EnumC040400Ck.class, str);
    }

    public EnumC040400Ck(String str, int i) {
    }
}
