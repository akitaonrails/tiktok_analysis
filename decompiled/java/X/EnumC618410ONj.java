package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ONj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC618410ONj {
    public static final /* synthetic */ EnumC618410ONj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC618410ONj RESOURCE_ENTRY_STATUS_CLOSE;
    public static final EnumC618410ONj RESOURCE_ENTRY_STATUS_OPEN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC618410ONj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC618410ONj enumC618410ONj = new EnumC618410ONj("RESOURCE_ENTRY_STATUS_CLOSE", 0, 0);
        RESOURCE_ENTRY_STATUS_CLOSE = enumC618410ONj;
        EnumC618410ONj enumC618410ONj2 = new EnumC618410ONj("RESOURCE_ENTRY_STATUS_OPEN", 1, 1);
        RESOURCE_ENTRY_STATUS_OPEN = enumC618410ONj2;
        EnumC618410ONj[] enumC618410ONjArr = {enumC618410ONj, enumC618410ONj2};
        LLILLJJLI = enumC618410ONjArr;
        LLILLL = new C2254308sP(enumC618410ONjArr);
    }

    public static EnumC618410ONj[] values() {
        return (EnumC618410ONj[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC618410ONj valueOf(String str) {
        return (EnumC618410ONj) C08FF.LIZ(EnumC618410ONj.class, str);
    }

    public EnumC618410ONj(String str, int i, int i2) {
        this.LL = i2;
    }
}
