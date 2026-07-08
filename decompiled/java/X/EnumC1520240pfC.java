package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1520240pfC {
    public static final EnumC1520240pfC EVENT_CREATE;
    public static final EnumC1520240pfC EVENT_SEND;
    public static final EnumC1520240pfC EVENT_TERMINATED;
    public static final EnumC1520240pfC EVENT_UPDATED;
    public static final EnumC1520240pfC EVENT_UPLOAD;
    public static final /* synthetic */ EnumC1520240pfC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1520240pfC SAMPLE_THROW;

    public static InterfaceC2044707zh<EnumC1520240pfC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1520240pfC enumC1520240pfC = new EnumC1520240pfC("EVENT_CREATE", 0);
        EVENT_CREATE = enumC1520240pfC;
        EnumC1520240pfC enumC1520240pfC2 = new EnumC1520240pfC("EVENT_TERMINATED", 1);
        EVENT_TERMINATED = enumC1520240pfC2;
        EnumC1520240pfC enumC1520240pfC3 = new EnumC1520240pfC("SAMPLE_THROW", 2);
        SAMPLE_THROW = enumC1520240pfC3;
        EnumC1520240pfC enumC1520240pfC4 = new EnumC1520240pfC("EVENT_UPLOAD", 3);
        EVENT_UPLOAD = enumC1520240pfC4;
        EnumC1520240pfC enumC1520240pfC5 = new EnumC1520240pfC("EVENT_SEND", 4);
        EVENT_SEND = enumC1520240pfC5;
        EnumC1520240pfC enumC1520240pfC6 = new EnumC1520240pfC("EVENT_UPDATED", 5);
        EVENT_UPDATED = enumC1520240pfC6;
        EnumC1520240pfC[] enumC1520240pfCArr = {enumC1520240pfC, enumC1520240pfC2, enumC1520240pfC3, enumC1520240pfC4, enumC1520240pfC5, enumC1520240pfC6};
        LL = enumC1520240pfCArr;
        LLILLJJLI = new C2254308sP(enumC1520240pfCArr);
    }

    public static EnumC1520240pfC[] values() {
        return (EnumC1520240pfC[]) LL.clone();
    }

    public static EnumC1520240pfC valueOf(String str) {
        return (EnumC1520240pfC) C08FF.LIZ(EnumC1520240pfC.class, str);
    }

    public EnumC1520240pfC(String str, int i) {
    }
}
