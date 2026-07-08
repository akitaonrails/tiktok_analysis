package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009607u2 {
    public static final /* synthetic */ EnumC2009607u2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2009607u2 SLEEP_HOUR_MEDITATION_RETURN_FOR_NOW;
    public static final EnumC2009607u2 SLEEP_HOUR_MEDITATION_RETURN_IN_15_MINS;
    public static final EnumC2009607u2 SLEEP_HOUR_PUSH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009607u2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009607u2 enumC2009607u2 = new EnumC2009607u2("SLEEP_HOUR_MEDITATION_RETURN_FOR_NOW", 0, 0);
        SLEEP_HOUR_MEDITATION_RETURN_FOR_NOW = enumC2009607u2;
        EnumC2009607u2 enumC2009607u22 = new EnumC2009607u2("SLEEP_HOUR_MEDITATION_RETURN_IN_15_MINS", 1, 1);
        SLEEP_HOUR_MEDITATION_RETURN_IN_15_MINS = enumC2009607u22;
        EnumC2009607u2 enumC2009607u23 = new EnumC2009607u2("SLEEP_HOUR_PUSH", 2, 2);
        SLEEP_HOUR_PUSH = enumC2009607u23;
        EnumC2009607u2[] enumC2009607u2Arr = {enumC2009607u2, enumC2009607u22, enumC2009607u23};
        LLILLJJLI = enumC2009607u2Arr;
        LLILLL = new C2254308sP(enumC2009607u2Arr);
    }

    public static EnumC2009607u2[] values() {
        return (EnumC2009607u2[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static EnumC2009607u2 valueOf(String str) {
        return (EnumC2009607u2) C08FF.LIZ(EnumC2009607u2.class, str);
    }

    public EnumC2009607u2(String str, int i, int i2) {
        this.LL = i2;
    }
}
