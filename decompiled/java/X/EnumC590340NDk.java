package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590340NDk {
    public static final EnumC590340NDk GOLDEN_SOURCE_COLD_REMAIN;
    public static final EnumC590340NDk GOLDEN_SOURCE_OFFLINE_API;
    public static final /* synthetic */ EnumC590340NDk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC590340NDk UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC590340NDk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC590340NDk enumC590340NDk = new EnumC590340NDk("UNKNOWN", 0, -1);
        UNKNOWN = enumC590340NDk;
        EnumC590340NDk enumC590340NDk2 = new EnumC590340NDk("GOLDEN_SOURCE_OFFLINE_API", 1, 0);
        GOLDEN_SOURCE_OFFLINE_API = enumC590340NDk2;
        EnumC590340NDk enumC590340NDk3 = new EnumC590340NDk("GOLDEN_SOURCE_COLD_REMAIN", 2, 1);
        GOLDEN_SOURCE_COLD_REMAIN = enumC590340NDk3;
        EnumC590340NDk[] enumC590340NDkArr = {enumC590340NDk, enumC590340NDk2, enumC590340NDk3};
        LLILLJJLI = enumC590340NDkArr;
        LLILLL = new C2254308sP(enumC590340NDkArr);
    }

    public static EnumC590340NDk[] values() {
        return (EnumC590340NDk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC590340NDk valueOf(String str) {
        return (EnumC590340NDk) C08FF.LIZ(EnumC590340NDk.class, str);
    }

    public EnumC590340NDk(String str, int i, int i2) {
        this.LL = i2;
    }
}
