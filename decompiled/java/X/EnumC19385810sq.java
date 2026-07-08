package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19385810sq {
    public static final /* synthetic */ EnumC19385810sq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19385810sq LOADING;
    public static final EnumC19385810sq LOADING_BLACKOUT;
    public static final EnumC19385810sq NET_ERROR;
    public static final EnumC19385810sq NO_STATUS;
    public static final EnumC19385810sq SCREEN_TIME_LIMIT;
    public static final EnumC19385810sq TRANSITION;

    public static InterfaceC2044707zh<EnumC19385810sq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19385810sq enumC19385810sq = new EnumC19385810sq("NO_STATUS", 0);
        NO_STATUS = enumC19385810sq;
        EnumC19385810sq enumC19385810sq2 = new EnumC19385810sq("NET_ERROR", 1);
        NET_ERROR = enumC19385810sq2;
        EnumC19385810sq enumC19385810sq3 = new EnumC19385810sq("LOADING", 2);
        LOADING = enumC19385810sq3;
        EnumC19385810sq enumC19385810sq4 = new EnumC19385810sq("LOADING_BLACKOUT", 3);
        LOADING_BLACKOUT = enumC19385810sq4;
        EnumC19385810sq enumC19385810sq5 = new EnumC19385810sq("SCREEN_TIME_LIMIT", 4);
        SCREEN_TIME_LIMIT = enumC19385810sq5;
        EnumC19385810sq enumC19385810sq6 = new EnumC19385810sq("TRANSITION", 5);
        TRANSITION = enumC19385810sq6;
        EnumC19385810sq[] enumC19385810sqArr = {enumC19385810sq, enumC19385810sq2, enumC19385810sq3, enumC19385810sq4, enumC19385810sq5, enumC19385810sq6};
        LL = enumC19385810sqArr;
        LLILLJJLI = new C2254308sP(enumC19385810sqArr);
    }

    public static EnumC19385810sq[] values() {
        return (EnumC19385810sq[]) LL.clone();
    }

    public static EnumC19385810sq valueOf(String str) {
        return (EnumC19385810sq) C08FF.LIZ(EnumC19385810sq.class, str);
    }

    public EnumC19385810sq(String str, int i) {
    }
}
