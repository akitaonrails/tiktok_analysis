package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qH6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1543740qH6 {
    public static final /* synthetic */ EnumC1543740qH6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1543740qH6 Lynx;
    public static final EnumC1543740qH6 NATIVEVIEW;
    public static final EnumC1543740qH6 Other;
    public static final EnumC1543740qH6 SDUI;
    public static final EnumC1543740qH6 Web;
    public static final EnumC1543740qH6 Worker;

    public static InterfaceC2044707zh<EnumC1543740qH6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1543740qH6 enumC1543740qH6 = new EnumC1543740qH6("Lynx", 0);
        Lynx = enumC1543740qH6;
        EnumC1543740qH6 enumC1543740qH62 = new EnumC1543740qH6("Web", 1);
        Web = enumC1543740qH62;
        EnumC1543740qH6 enumC1543740qH63 = new EnumC1543740qH6("Worker", 2);
        Worker = enumC1543740qH63;
        EnumC1543740qH6 enumC1543740qH64 = new EnumC1543740qH6("SDUI", 3);
        SDUI = enumC1543740qH64;
        EnumC1543740qH6 enumC1543740qH65 = new EnumC1543740qH6("Other", 4);
        Other = enumC1543740qH65;
        EnumC1543740qH6 enumC1543740qH66 = new EnumC1543740qH6("NATIVEVIEW", 5);
        NATIVEVIEW = enumC1543740qH66;
        EnumC1543740qH6[] enumC1543740qH6Arr = {enumC1543740qH6, enumC1543740qH62, enumC1543740qH63, enumC1543740qH64, enumC1543740qH65, enumC1543740qH66};
        LL = enumC1543740qH6Arr;
        LLILLJJLI = new C2254308sP(enumC1543740qH6Arr);
    }

    public static EnumC1543740qH6[] values() {
        return (EnumC1543740qH6[]) LL.clone();
    }

    public static EnumC1543740qH6 valueOf(String str) {
        return (EnumC1543740qH6) C08FF.LIZ(EnumC1543740qH6.class, str);
    }

    public EnumC1543740qH6(String str, int i) {
    }
}
