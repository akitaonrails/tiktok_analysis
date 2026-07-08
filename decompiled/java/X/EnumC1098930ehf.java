package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ehf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1098930ehf {
    public static final /* synthetic */ EnumC1098930ehf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1098930ehf RUNNING;
    public static final EnumC1098930ehf STARTING;
    public static final EnumC1098930ehf STOPPED;

    public static InterfaceC2044707zh<EnumC1098930ehf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1098930ehf enumC1098930ehf = new EnumC1098930ehf("STOPPED", 0);
        STOPPED = enumC1098930ehf;
        EnumC1098930ehf enumC1098930ehf2 = new EnumC1098930ehf("STARTING", 1);
        STARTING = enumC1098930ehf2;
        EnumC1098930ehf enumC1098930ehf3 = new EnumC1098930ehf("RUNNING", 2);
        RUNNING = enumC1098930ehf3;
        EnumC1098930ehf[] enumC1098930ehfArr = {enumC1098930ehf, enumC1098930ehf2, enumC1098930ehf3};
        LL = enumC1098930ehfArr;
        LLILLJJLI = new C2254308sP(enumC1098930ehfArr);
    }

    public static EnumC1098930ehf[] values() {
        return (EnumC1098930ehf[]) LL.clone();
    }

    public static EnumC1098930ehf valueOf(String str) {
        return (EnumC1098930ehf) C08FF.LIZ(EnumC1098930ehf.class, str);
    }

    public EnumC1098930ehf(String str, int i) {
    }
}
