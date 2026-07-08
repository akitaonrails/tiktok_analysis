package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0krk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1335820krk {
    public static final C1335840krm Companion;
    public static final EnumC1335820krk HIGH;
    public static final /* synthetic */ EnumC1335820krk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1335820krk LOW;
    public static final EnumC1335820krk MEDIUM;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1335820krk> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0krm] */
    static {
        EnumC1335820krk enumC1335820krk = new EnumC1335820krk("LOW", 0, "low");
        LOW = enumC1335820krk;
        EnumC1335820krk enumC1335820krk2 = new EnumC1335820krk("MEDIUM", 1, "medium");
        MEDIUM = enumC1335820krk2;
        EnumC1335820krk enumC1335820krk3 = new EnumC1335820krk("HIGH", 2, "high");
        HIGH = enumC1335820krk3;
        EnumC1335820krk[] enumC1335820krkArr = {enumC1335820krk, enumC1335820krk2, enumC1335820krk3};
        LLILLJJLI = enumC1335820krkArr;
        LLILLL = new C2254308sP(enumC1335820krkArr);
        Companion = new Object() { // from class: X.0krm
        };
    }

    public static EnumC1335820krk[] values() {
        return (EnumC1335820krk[]) LLILLJJLI.clone();
    }

    public final EnumC1331380kka getFrescoPriority() {
        int i = C1335830krl.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1331380kka.LOW;
        }
        if (i == 2) {
            return EnumC1331380kka.MEDIUM;
        }
        if (i == 3) {
            return EnumC1331380kka.MEDIUM;
        }
        throw new C1954807lC();
    }

    public final int getPreloadTaskPriority() {
        int i = C1335830krl.LIZ[ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        throw new C1954807lC();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1335820krk valueOf(String str) {
        return (EnumC1335820krk) C08FF.LIZ(EnumC1335820krk.class, str);
    }

    public EnumC1335820krk(String str, int i, String str2) {
        this.LL = str2;
    }
}
