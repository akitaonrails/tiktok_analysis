package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1716530uln {
    public static final EnumC1716530uln CLOSE;
    public static final /* synthetic */ EnumC1716530uln[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1716530uln NEXT;
    public static final EnumC1716530uln RETURN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1716530uln> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1716530uln enumC1716530uln = new EnumC1716530uln("RETURN", 0, "return");
        RETURN = enumC1716530uln;
        EnumC1716530uln enumC1716530uln2 = new EnumC1716530uln("NEXT", 1, "next");
        NEXT = enumC1716530uln2;
        EnumC1716530uln enumC1716530uln3 = new EnumC1716530uln("CLOSE", 2, "close");
        CLOSE = enumC1716530uln3;
        EnumC1716530uln[] enumC1716530ulnArr = {enumC1716530uln, enumC1716530uln2, enumC1716530uln3};
        LLILLJJLI = enumC1716530ulnArr;
        LLILLL = new C2254308sP(enumC1716530ulnArr);
    }

    public static EnumC1716530uln[] values() {
        return (EnumC1716530uln[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1716530uln valueOf(String str) {
        return (EnumC1716530uln) C08FF.LIZ(EnumC1716530uln.class, str);
    }

    public EnumC1716530uln(String str, int i, String str2) {
        this.LL = str2;
    }
}
