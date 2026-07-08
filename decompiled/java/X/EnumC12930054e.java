package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12930054e {
    public static final C12944054s Companion;
    public static final EnumC12930054e EXECUTE_LOOP;
    public static final /* synthetic */ EnumC12930054e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12930054e MAX_COUNT_AND_MAX_DURATION;
    public static final EnumC12930054e MAX_DURATION;
    public static final EnumC12930054e MAX_TIMES;
    public static final EnumC12930054e NULL;
    public static final EnumC12930054e X_TIMES_IN_DURATION;
    public static final EnumC12930054e X_TIMES_IN_TIME_SLOT_IN_DAY;
    public static final C01GW<Map<String, EnumC12930054e>> map$delegate;
    public final String LL;

    public static InterfaceC2044707zh<EnumC12930054e> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.054s] */
    static {
        EnumC12930054e enumC12930054e = new EnumC12930054e("NULL", 0, "null");
        NULL = enumC12930054e;
        EnumC12930054e enumC12930054e2 = new EnumC12930054e("MAX_TIMES", 1, "maxtimes");
        MAX_TIMES = enumC12930054e2;
        EnumC12930054e enumC12930054e3 = new EnumC12930054e("MAX_DURATION", 2, "maxduration");
        MAX_DURATION = enumC12930054e3;
        EnumC12930054e enumC12930054e4 = new EnumC12930054e("X_TIMES_IN_TIME_SLOT_IN_DAY", 3, "timesinday");
        X_TIMES_IN_TIME_SLOT_IN_DAY = enumC12930054e4;
        EnumC12930054e enumC12930054e5 = new EnumC12930054e("X_TIMES_IN_DURATION", 4, "timesinduration");
        X_TIMES_IN_DURATION = enumC12930054e5;
        EnumC12930054e enumC12930054e6 = new EnumC12930054e("EXECUTE_LOOP", 5, "executeloop");
        EXECUTE_LOOP = enumC12930054e6;
        EnumC12930054e enumC12930054e7 = new EnumC12930054e("MAX_COUNT_AND_MAX_DURATION", 6, "maxcountandmaxduration");
        MAX_COUNT_AND_MAX_DURATION = enumC12930054e7;
        EnumC12930054e[] enumC12930054eArr = {enumC12930054e, enumC12930054e2, enumC12930054e3, enumC12930054e4, enumC12930054e5, enumC12930054e6, enumC12930054e7};
        LLILLJJLI = enumC12930054eArr;
        LLILLL = new C2254308sP(enumC12930054eArr);
        Companion = new Object() { // from class: X.054s
        };
        map$delegate = C452501pT.LIZIZ(new C12935054j());
    }

    public static EnumC12930054e[] values() {
        return (EnumC12930054e[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC12930054e valueOf(String str) {
        return (EnumC12930054e) C08FF.LIZ(EnumC12930054e.class, str);
    }

    public EnumC12930054e(String str, int i, String str2) {
        this.LL = str2;
    }
}
