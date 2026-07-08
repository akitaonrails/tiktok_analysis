package X;

import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10k1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19331110k1 {
    public static final C19331010k0 Companion;
    public static final EnumC19331110k1 FROM_DM;
    public static final EnumC19331110k1 FROM_EXTERNAL;
    public static final EnumC19331110k1 FROM_FRONTIER;
    public static final EnumC19331110k1 FROM_LOCAL;
    public static final EnumC19331110k1 FROM_PULLER;
    public static final EnumC19331110k1 FROM_TEST;
    public static final /* synthetic */ EnumC19331110k1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C01GW<EnumC19331110k1[]> PLATFORMS$delegate;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19331110k1> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.10k0] */
    static {
        EnumC19331110k1 enumC19331110k1 = new EnumC19331110k1("FROM_PULLER", 0, "FROM_PULLER");
        FROM_PULLER = enumC19331110k1;
        EnumC19331110k1 enumC19331110k12 = new EnumC19331110k1("FROM_FRONTIER", 1, "FROM_FRONTIER");
        FROM_FRONTIER = enumC19331110k12;
        EnumC19331110k1 enumC19331110k13 = new EnumC19331110k1("FROM_EXTERNAL", 2, "FROM_EXTERNAL");
        FROM_EXTERNAL = enumC19331110k13;
        EnumC19331110k1 enumC19331110k14 = new EnumC19331110k1("FROM_LOCAL", 3, "FROM_LOCAL");
        FROM_LOCAL = enumC19331110k14;
        EnumC19331110k1 enumC19331110k15 = new EnumC19331110k1("FROM_TEST", 4, "FROM_TEST");
        FROM_TEST = enumC19331110k15;
        EnumC19331110k1 enumC19331110k16 = new EnumC19331110k1("FROM_DM", 5, "FROM_DM");
        FROM_DM = enumC19331110k16;
        EnumC19331110k1[] enumC19331110k1Arr = {enumC19331110k1, enumC19331110k12, enumC19331110k13, enumC19331110k14, enumC19331110k15, enumC19331110k16};
        LLILLJJLI = enumC19331110k1Arr;
        LLILLL = new C2254308sP(enumC19331110k1Arr);
        Companion = new Object() { // from class: X.10k0
        };
        PLATFORMS$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(227));
    }

    public static EnumC19331110k1[] values() {
        return (EnumC19331110k1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC19331110k1 valueOf(String str) {
        return (EnumC19331110k1) C08FF.LIZ(EnumC19331110k1.class, str);
    }

    public EnumC19331110k1(String str, int i, String str2) {
        this.LL = str2;
    }
}
