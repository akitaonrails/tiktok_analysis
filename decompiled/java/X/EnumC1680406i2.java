package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06i2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1680406i2 {
    public static final EnumC1680406i2 FAILED;
    public static final /* synthetic */ EnumC1680406i2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1680406i2 SENDING;
    public static final EnumC1680406i2 SENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1680406i2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1680406i2 enumC1680406i2 = new EnumC1680406i2("SENDING", 0, "sending");
        SENDING = enumC1680406i2;
        EnumC1680406i2 enumC1680406i22 = new EnumC1680406i2("SENT", 1, "sent");
        SENT = enumC1680406i22;
        EnumC1680406i2 enumC1680406i23 = new EnumC1680406i2("FAILED", 2, "failed");
        FAILED = enumC1680406i23;
        EnumC1680406i2[] enumC1680406i2Arr = {enumC1680406i2, enumC1680406i22, enumC1680406i23};
        LLILLJJLI = enumC1680406i2Arr;
        LLILLL = new C2254308sP(enumC1680406i2Arr);
    }

    public static EnumC1680406i2[] values() {
        return (EnumC1680406i2[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static EnumC1680406i2 valueOf(String str) {
        return (EnumC1680406i2) C08FF.LIZ(EnumC1680406i2.class, str);
    }

    public EnumC1680406i2(String str, int i, String str2) {
        this.LL = str2;
    }
}
