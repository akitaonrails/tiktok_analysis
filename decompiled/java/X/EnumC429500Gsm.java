package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429500Gsm {
    public static final EnumC429500Gsm LEFT;
    public static final /* synthetic */ EnumC429500Gsm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429500Gsm RIGHT;

    public static InterfaceC2044707zh<EnumC429500Gsm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429500Gsm enumC429500Gsm = new EnumC429500Gsm("LEFT", 0);
        LEFT = enumC429500Gsm;
        EnumC429500Gsm enumC429500Gsm2 = new EnumC429500Gsm("RIGHT", 1);
        RIGHT = enumC429500Gsm2;
        EnumC429500Gsm[] enumC429500GsmArr = {enumC429500Gsm, enumC429500Gsm2};
        LL = enumC429500GsmArr;
        LLILLJJLI = new C2254308sP(enumC429500GsmArr);
    }

    public static EnumC429500Gsm[] values() {
        return (EnumC429500Gsm[]) LL.clone();
    }

    public static EnumC429500Gsm valueOf(String str) {
        return (EnumC429500Gsm) C08FF.LIZ(EnumC429500Gsm.class, str);
    }

    public EnumC429500Gsm(String str, int i) {
    }
}
