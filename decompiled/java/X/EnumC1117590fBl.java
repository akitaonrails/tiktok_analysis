package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1117590fBl {
    public static final C1117580fBk Companion;
    public static final /* synthetic */ EnumC1117590fBl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1117590fBl OFF;
    public static final EnumC1117590fBl ON;
    public static final EnumC1117590fBl UNKNOWN;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1117590fBl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1117590fBl enumC1117590fBl = new EnumC1117590fBl("UNKNOWN", 0, 0L);
        UNKNOWN = enumC1117590fBl;
        EnumC1117590fBl enumC1117590fBl2 = new EnumC1117590fBl("ON", 1, 1L);
        ON = enumC1117590fBl2;
        EnumC1117590fBl enumC1117590fBl3 = new EnumC1117590fBl("OFF", 2, 2L);
        OFF = enumC1117590fBl3;
        EnumC1117590fBl[] enumC1117590fBlArr = {enumC1117590fBl, enumC1117590fBl2, enumC1117590fBl3};
        LLILLJJLI = enumC1117590fBlArr;
        LLILLL = new C2254308sP(enumC1117590fBlArr);
        Companion = new C1117580fBk();
    }

    public static EnumC1117590fBl[] values() {
        return (EnumC1117590fBl[]) LLILLJJLI.clone();
    }

    public final boolean isOn() {
        return this == ON;
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1117590fBl valueOf(String str) {
        return (EnumC1117590fBl) C08FF.LIZ(EnumC1117590fBl.class, str);
    }

    public EnumC1117590fBl(String str, int i, long j) {
        this.LL = j;
    }
}
