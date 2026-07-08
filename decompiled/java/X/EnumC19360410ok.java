package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19360410ok {
    public static final /* synthetic */ EnumC19360410ok[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19360410ok SCORE;
    public static final EnumC19360410ok TIME_SECOND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19360410ok> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19360410ok enumC19360410ok = new EnumC19360410ok("SCORE", 0, 0);
        SCORE = enumC19360410ok;
        EnumC19360410ok enumC19360410ok2 = new EnumC19360410ok("TIME_SECOND", 1, 1);
        TIME_SECOND = enumC19360410ok2;
        EnumC19360410ok[] enumC19360410okArr = {enumC19360410ok, enumC19360410ok2};
        LLILLJJLI = enumC19360410okArr;
        LLILLL = new C2254308sP(enumC19360410okArr);
    }

    public static EnumC19360410ok[] values() {
        return (EnumC19360410ok[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC19360410ok valueOf(String str) {
        return (EnumC19360410ok) C08FF.LIZ(EnumC19360410ok.class, str);
    }

    public EnumC19360410ok(String str, int i, int i2) {
        this.LL = i2;
    }
}
