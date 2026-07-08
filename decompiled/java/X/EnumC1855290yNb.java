package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855290yNb {
    public static final EnumC1855290yNb HIGH_VOLUME;
    public static final /* synthetic */ EnumC1855290yNb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1855290yNb LOW_VOLUME;
    public static final EnumC1855290yNb START;
    public static final EnumC1855290yNb STOP;

    public static InterfaceC2044707zh<EnumC1855290yNb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1855290yNb enumC1855290yNb = new EnumC1855290yNb("START", 0);
        START = enumC1855290yNb;
        EnumC1855290yNb enumC1855290yNb2 = new EnumC1855290yNb("LOW_VOLUME", 1);
        LOW_VOLUME = enumC1855290yNb2;
        EnumC1855290yNb enumC1855290yNb3 = new EnumC1855290yNb("HIGH_VOLUME", 2);
        HIGH_VOLUME = enumC1855290yNb3;
        EnumC1855290yNb enumC1855290yNb4 = new EnumC1855290yNb("STOP", 3);
        STOP = enumC1855290yNb4;
        EnumC1855290yNb[] enumC1855290yNbArr = {enumC1855290yNb, enumC1855290yNb2, enumC1855290yNb3, enumC1855290yNb4};
        LL = enumC1855290yNbArr;
        LLILLJJLI = new C2254308sP(enumC1855290yNbArr);
    }

    public static EnumC1855290yNb[] values() {
        return (EnumC1855290yNb[]) LL.clone();
    }

    public static EnumC1855290yNb valueOf(String str) {
        return (EnumC1855290yNb) C08FF.LIZ(EnumC1855290yNb.class, str);
    }

    public EnumC1855290yNb(String str, int i) {
    }
}
