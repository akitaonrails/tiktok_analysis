package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC756320Tle {
    public static final EnumC756320Tle BeforeLive;
    public static final EnumC756320Tle DuringLive;
    public static final /* synthetic */ EnumC756320Tle[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC756320Tle Settings;

    public static InterfaceC2044707zh<EnumC756320Tle> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC756320Tle enumC756320Tle = new EnumC756320Tle("Settings", 0);
        Settings = enumC756320Tle;
        EnumC756320Tle enumC756320Tle2 = new EnumC756320Tle("BeforeLive", 1);
        BeforeLive = enumC756320Tle2;
        EnumC756320Tle enumC756320Tle3 = new EnumC756320Tle("DuringLive", 2);
        DuringLive = enumC756320Tle3;
        EnumC756320Tle[] enumC756320TleArr = {enumC756320Tle, enumC756320Tle2, enumC756320Tle3};
        LL = enumC756320TleArr;
        LLILLJJLI = new C2254308sP(enumC756320TleArr);
    }

    public static EnumC756320Tle[] values() {
        return (EnumC756320Tle[]) LL.clone();
    }

    public static EnumC756320Tle valueOf(String str) {
        return (EnumC756320Tle) C08FF.LIZ(EnumC756320Tle.class, str);
    }

    public EnumC756320Tle(String str, int i) {
    }
}
