package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083220eIK {
    public static final EnumC1083220eIK IN_LIVE_ROOM;
    public static final /* synthetic */ EnumC1083220eIK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1083220eIK LOAD_P0_WIDGET;
    public static final EnumC1083220eIK LOAD_P1_WIDGET;
    public static final EnumC1083220eIK LOAD_P2_WIDGET;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1083220eIK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1083220eIK enumC1083220eIK = new EnumC1083220eIK("LOAD_P0_WIDGET", 0, "p0");
        LOAD_P0_WIDGET = enumC1083220eIK;
        EnumC1083220eIK enumC1083220eIK2 = new EnumC1083220eIK("LOAD_P1_WIDGET", 1, "p1");
        LOAD_P1_WIDGET = enumC1083220eIK2;
        EnumC1083220eIK enumC1083220eIK3 = new EnumC1083220eIK("LOAD_P2_WIDGET", 2, "p2");
        LOAD_P2_WIDGET = enumC1083220eIK3;
        EnumC1083220eIK enumC1083220eIK4 = new EnumC1083220eIK("IN_LIVE_ROOM", 3, "watch_live");
        IN_LIVE_ROOM = enumC1083220eIK4;
        EnumC1083220eIK[] enumC1083220eIKArr = {enumC1083220eIK, enumC1083220eIK2, enumC1083220eIK3, enumC1083220eIK4};
        LLILLJJLI = enumC1083220eIKArr;
        LLILLL = new C2254308sP(enumC1083220eIKArr);
    }

    public static EnumC1083220eIK[] values() {
        return (EnumC1083220eIK[]) LLILLJJLI.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static EnumC1083220eIK valueOf(String str) {
        return (EnumC1083220eIK) C08FF.LIZ(EnumC1083220eIK.class, str);
    }

    public EnumC1083220eIK(String str, int i, String str2) {
        this.LL = str2;
    }
}
