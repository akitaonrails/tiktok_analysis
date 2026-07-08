package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mE3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1388090mE3 {
    public static final EnumC1388090mE3 EMAIL;
    public static final /* synthetic */ EnumC1388090mE3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1388090mE3 MESSAGE;
    public static final EnumC1388090mE3 SMS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1388090mE3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1388090mE3 enumC1388090mE3 = new EnumC1388090mE3("EMAIL", 0, "Email");
        EMAIL = enumC1388090mE3;
        EnumC1388090mE3 enumC1388090mE32 = new EnumC1388090mE3("SMS", 1, "SMS");
        SMS = enumC1388090mE32;
        EnumC1388090mE3 enumC1388090mE33 = new EnumC1388090mE3("MESSAGE", 2, "Message");
        MESSAGE = enumC1388090mE33;
        EnumC1388090mE3[] enumC1388090mE3Arr = {enumC1388090mE3, enumC1388090mE32, enumC1388090mE33};
        LLILLJJLI = enumC1388090mE3Arr;
        LLILLL = new C2254308sP(enumC1388090mE3Arr);
    }

    public static EnumC1388090mE3[] values() {
        return (EnumC1388090mE3[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1388090mE3 valueOf(String str) {
        return (EnumC1388090mE3) C08FF.LIZ(EnumC1388090mE3.class, str);
    }

    public EnumC1388090mE3(String str, int i, String str2) {
        this.LL = str2;
    }
}
