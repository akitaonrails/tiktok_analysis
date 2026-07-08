package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.058b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13031058b {
    public static final /* synthetic */ EnumC13031058b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC13031058b START;
    public static final EnumC13031058b STOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC13031058b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC13031058b enumC13031058b = new EnumC13031058b("STOP", 0, 0);
        STOP = enumC13031058b;
        EnumC13031058b enumC13031058b2 = new EnumC13031058b("START", 1, 1);
        START = enumC13031058b2;
        EnumC13031058b[] enumC13031058bArr = {enumC13031058b, enumC13031058b2};
        LLILLJJLI = enumC13031058bArr;
        LLILLL = new C2254308sP(enumC13031058bArr);
    }

    public static EnumC13031058b[] values() {
        return (EnumC13031058b[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC13031058b valueOf(String str) {
        return (EnumC13031058b) C08FF.LIZ(EnumC13031058b.class, str);
    }

    public EnumC13031058b(String str, int i, int i2) {
        this.LL = i2;
    }
}
