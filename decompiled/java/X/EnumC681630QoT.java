package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC681630QoT {
    public static final EnumC681630QoT HISTORY_INIT;
    public static final /* synthetic */ EnumC681630QoT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC681630QoT TRENDING;

    public static InterfaceC2044707zh<EnumC681630QoT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC681630QoT enumC681630QoT = new EnumC681630QoT("HISTORY_INIT", 0);
        HISTORY_INIT = enumC681630QoT;
        EnumC681630QoT enumC681630QoT2 = new EnumC681630QoT("TRENDING", 1);
        TRENDING = enumC681630QoT2;
        EnumC681630QoT[] enumC681630QoTArr = {enumC681630QoT, enumC681630QoT2};
        LL = enumC681630QoTArr;
        LLILLJJLI = new C2254308sP(enumC681630QoTArr);
    }

    public static EnumC681630QoT[] values() {
        return (EnumC681630QoT[]) LL.clone();
    }

    public static EnumC681630QoT valueOf(String str) {
        return (EnumC681630QoT) C08FF.LIZ(EnumC681630QoT.class, str);
    }

    public EnumC681630QoT(String str, int i) {
    }
}
