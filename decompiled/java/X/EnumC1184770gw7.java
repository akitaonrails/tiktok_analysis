package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gw7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1184770gw7 {
    public static final EnumC1184770gw7 FIRE_AS_CACHE;
    public static final EnumC1184770gw7 FIRE_AS_DEDUP;
    public static final EnumC1184770gw7 FIRE_NORMAL;
    public static final /* synthetic */ EnumC1184770gw7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1184770gw7 SKIP;

    public static InterfaceC2044707zh<EnumC1184770gw7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1184770gw7 enumC1184770gw7 = new EnumC1184770gw7("SKIP", 0);
        SKIP = enumC1184770gw7;
        EnumC1184770gw7 enumC1184770gw72 = new EnumC1184770gw7("FIRE_AS_CACHE", 1);
        FIRE_AS_CACHE = enumC1184770gw72;
        EnumC1184770gw7 enumC1184770gw73 = new EnumC1184770gw7("FIRE_AS_DEDUP", 2);
        FIRE_AS_DEDUP = enumC1184770gw73;
        EnumC1184770gw7 enumC1184770gw74 = new EnumC1184770gw7("FIRE_NORMAL", 3);
        FIRE_NORMAL = enumC1184770gw74;
        EnumC1184770gw7[] enumC1184770gw7Arr = {enumC1184770gw7, enumC1184770gw72, enumC1184770gw73, enumC1184770gw74};
        LL = enumC1184770gw7Arr;
        LLILLJJLI = new C2254308sP(enumC1184770gw7Arr);
    }

    public static EnumC1184770gw7[] values() {
        return (EnumC1184770gw7[]) LL.clone();
    }

    public static EnumC1184770gw7 valueOf(String str) {
        return (EnumC1184770gw7) C08FF.LIZ(EnumC1184770gw7.class, str);
    }

    public EnumC1184770gw7(String str, int i) {
    }
}
