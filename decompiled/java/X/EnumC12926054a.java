package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12926054a {
    public static final C12943054r Companion;
    public static final EnumC12926054a EXIT_AT_SPECIFIC_TIME_IN_DAY;
    public static final EnumC12926054a EXIT_DURATION;
    public static final EnumC12926054a EXIT_FOREVER;
    public static final /* synthetic */ EnumC12926054a[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12926054a NULL;
    public static final C01GW<Map<String, EnumC12926054a>> map$delegate;
    public final String LL;

    public static InterfaceC2044707zh<EnumC12926054a> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.054r] */
    static {
        EnumC12926054a enumC12926054a = new EnumC12926054a("NULL", 0, "nullexit");
        NULL = enumC12926054a;
        EnumC12926054a enumC12926054a2 = new EnumC12926054a("EXIT_FOREVER", 1, "exitforever");
        EXIT_FOREVER = enumC12926054a2;
        EnumC12926054a enumC12926054a3 = new EnumC12926054a("EXIT_DURATION", 2, "exitduration");
        EXIT_DURATION = enumC12926054a3;
        EnumC12926054a enumC12926054a4 = new EnumC12926054a("EXIT_AT_SPECIFIC_TIME_IN_DAY", 3, "exitinday");
        EXIT_AT_SPECIFIC_TIME_IN_DAY = enumC12926054a4;
        EnumC12926054a[] enumC12926054aArr = {enumC12926054a, enumC12926054a2, enumC12926054a3, enumC12926054a4};
        LLILLJJLI = enumC12926054aArr;
        LLILLL = new C2254308sP(enumC12926054aArr);
        Companion = new Object() { // from class: X.054r
        };
        map$delegate = C452501pT.LIZIZ(new C054Z());
    }

    public static EnumC12926054a[] values() {
        return (EnumC12926054a[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC12926054a valueOf(String str) {
        return (EnumC12926054a) C08FF.LIZ(EnumC12926054a.class, str);
    }

    public EnumC12926054a(String str, int i, String str2) {
        this.LL = str2;
    }
}
