package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13at, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20038913at {
    public static final /* synthetic */ EnumC20038913at[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20038913at OFFLINE;
    public static final EnumC20038913at REALTIME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20038913at> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20038913at enumC20038913at = new EnumC20038913at("OFFLINE", 0, "offline");
        OFFLINE = enumC20038913at;
        EnumC20038913at enumC20038913at2 = new EnumC20038913at("REALTIME", 1, "realtime");
        REALTIME = enumC20038913at2;
        EnumC20038913at[] enumC20038913atArr = {enumC20038913at, enumC20038913at2};
        LLILLJJLI = enumC20038913atArr;
        LLILLL = new C2254308sP(enumC20038913atArr);
    }

    public static EnumC20038913at[] values() {
        return (EnumC20038913at[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20038913at valueOf(String str) {
        return (EnumC20038913at) C08FF.LIZ(EnumC20038913at.class, str);
    }

    public EnumC20038913at(String str, int i, String str2) {
        this.LL = str2;
    }
}
