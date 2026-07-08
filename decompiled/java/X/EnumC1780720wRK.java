package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780720wRK {
    public static final EnumC1780720wRK INAPP;
    public static final /* synthetic */ EnumC1780720wRK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780720wRK SUBSCRIPTION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1780720wRK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780720wRK enumC1780720wRK = new EnumC1780720wRK("INAPP", 0, "inapp");
        INAPP = enumC1780720wRK;
        EnumC1780720wRK enumC1780720wRK2 = new EnumC1780720wRK("SUBSCRIPTION", 1, "subs");
        SUBSCRIPTION = enumC1780720wRK2;
        EnumC1780720wRK[] enumC1780720wRKArr = {enumC1780720wRK, enumC1780720wRK2};
        LLILLJJLI = enumC1780720wRKArr;
        LLILLL = new C2254308sP(enumC1780720wRKArr);
    }

    public static EnumC1780720wRK[] values() {
        return (EnumC1780720wRK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1780720wRK valueOf(String str) {
        return (EnumC1780720wRK) C08FF.LIZ(EnumC1780720wRK.class, str);
    }

    public EnumC1780720wRK(String str, int i, String str2) {
        this.LL = str2;
    }
}
