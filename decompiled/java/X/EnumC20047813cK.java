package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13cK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20047813cK {
    public static final EnumC20047813cK Idle;
    public static final /* synthetic */ EnumC20047813cK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20047813cK LayingOut;
    public static final EnumC20047813cK LookaheadLayingOut;
    public static final EnumC20047813cK LookaheadMeasuring;
    public static final EnumC20047813cK Measuring;

    public static InterfaceC2044707zh<EnumC20047813cK> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC20047813cK valueOf(String str) {
        return (EnumC20047813cK) C08FF.LIZ(EnumC20047813cK.class, str);
    }

    public static EnumC20047813cK[] values() {
        return (EnumC20047813cK[]) LL.clone();
    }

    static {
        EnumC20047813cK enumC20047813cK = new EnumC20047813cK("Measuring", 0);
        Measuring = enumC20047813cK;
        EnumC20047813cK enumC20047813cK2 = new EnumC20047813cK("LookaheadMeasuring", 1);
        LookaheadMeasuring = enumC20047813cK2;
        EnumC20047813cK enumC20047813cK3 = new EnumC20047813cK("LayingOut", 2);
        LayingOut = enumC20047813cK3;
        EnumC20047813cK enumC20047813cK4 = new EnumC20047813cK("LookaheadLayingOut", 3);
        LookaheadLayingOut = enumC20047813cK4;
        EnumC20047813cK enumC20047813cK5 = new EnumC20047813cK("Idle", 4);
        Idle = enumC20047813cK5;
        EnumC20047813cK[] enumC20047813cKArr = {enumC20047813cK, enumC20047813cK2, enumC20047813cK3, enumC20047813cK4, enumC20047813cK5};
        LL = enumC20047813cKArr;
        LLILLJJLI = new C2254308sP(enumC20047813cKArr);
    }

    public EnumC20047813cK(String str, int i) {
    }
}
