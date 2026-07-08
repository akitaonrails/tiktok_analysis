package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1661320tKk {
    public static final EnumC1661320tKk EXCELLENT;
    public static final EnumC1661320tKk FAKE;
    public static final /* synthetic */ EnumC1661320tKk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1661320tKk MEDERATE;
    public static final EnumC1661320tKk OFFLINE;
    public static final EnumC1661320tKk SLOW;
    public static final EnumC1661320tKk UNDEFINED;
    public static final EnumC1661320tKk UNKNOWN;

    public static InterfaceC2044707zh<EnumC1661320tKk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1661320tKk enumC1661320tKk = new EnumC1661320tKk("UNDEFINED", 0);
        UNDEFINED = enumC1661320tKk;
        EnumC1661320tKk enumC1661320tKk2 = new EnumC1661320tKk("UNKNOWN", 1);
        UNKNOWN = enumC1661320tKk2;
        EnumC1661320tKk enumC1661320tKk3 = new EnumC1661320tKk("OFFLINE", 2);
        OFFLINE = enumC1661320tKk3;
        EnumC1661320tKk enumC1661320tKk4 = new EnumC1661320tKk("FAKE", 3);
        FAKE = enumC1661320tKk4;
        EnumC1661320tKk enumC1661320tKk5 = new EnumC1661320tKk("SLOW", 4);
        SLOW = enumC1661320tKk5;
        EnumC1661320tKk enumC1661320tKk6 = new EnumC1661320tKk("MEDERATE", 5);
        MEDERATE = enumC1661320tKk6;
        EnumC1661320tKk enumC1661320tKk7 = new EnumC1661320tKk("EXCELLENT", 6);
        EXCELLENT = enumC1661320tKk7;
        EnumC1661320tKk[] enumC1661320tKkArr = {enumC1661320tKk, enumC1661320tKk2, enumC1661320tKk3, enumC1661320tKk4, enumC1661320tKk5, enumC1661320tKk6, enumC1661320tKk7};
        LL = enumC1661320tKkArr;
        LLILLJJLI = new C2254308sP(enumC1661320tKkArr);
    }

    public static EnumC1661320tKk[] values() {
        return (EnumC1661320tKk[]) LL.clone();
    }

    public static EnumC1661320tKk valueOf(String str) {
        return (EnumC1661320tKk) C08FF.LIZ(EnumC1661320tKk.class, str);
    }

    public EnumC1661320tKk(String str, int i) {
    }
}
