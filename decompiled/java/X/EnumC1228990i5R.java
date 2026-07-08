package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i5R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1228990i5R {
    public static final C1229000i5S Companion;
    public static final /* synthetic */ EnumC1228990i5R[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1228990i5R PRIVATE_GROUP;
    public static final EnumC1228990i5R PUBLIC_GROUP;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1228990i5R> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0i5S] */
    static {
        EnumC1228990i5R enumC1228990i5R = new EnumC1228990i5R("PRIVATE_GROUP", 0, "private_group", "private");
        PRIVATE_GROUP = enumC1228990i5R;
        EnumC1228990i5R enumC1228990i5R2 = new EnumC1228990i5R("PUBLIC_GROUP", 1, "public_group", "public");
        PUBLIC_GROUP = enumC1228990i5R2;
        EnumC1228990i5R[] enumC1228990i5RArr = {enumC1228990i5R, enumC1228990i5R2};
        LLILLL = enumC1228990i5RArr;
        LLILZ = new C2254308sP(enumC1228990i5RArr);
        Companion = new Object() { // from class: X.0i5S
        };
    }

    public static EnumC1228990i5R[] values() {
        return (EnumC1228990i5R[]) LLILLL.clone();
    }

    public final String getMobValue() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public final String toMobValue() {
        return this.LLILLJJLI;
    }

    public static EnumC1228990i5R valueOf(String str) {
        return (EnumC1228990i5R) C08FF.LIZ(EnumC1228990i5R.class, str);
    }

    public EnumC1228990i5R(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
