package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC964530bCt {
    public static final EnumC964530bCt APPLY_PREFERENCE_AND_QUICKMATCH;
    public static final EnumC964530bCt APPLY_PREFERENCE_ONLY;
    public static final C964590bCz Companion;
    public static final /* synthetic */ EnumC964530bCt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC964530bCt> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0bCz] */
    static {
        EnumC964530bCt enumC964530bCt = new EnumC964530bCt("APPLY_PREFERENCE_ONLY", 0, 0);
        APPLY_PREFERENCE_ONLY = enumC964530bCt;
        EnumC964530bCt enumC964530bCt2 = new EnumC964530bCt("APPLY_PREFERENCE_AND_QUICKMATCH", 1, 1);
        APPLY_PREFERENCE_AND_QUICKMATCH = enumC964530bCt2;
        EnumC964530bCt[] enumC964530bCtArr = {enumC964530bCt, enumC964530bCt2};
        LLILLJJLI = enumC964530bCtArr;
        LLILLL = new C2254308sP(enumC964530bCtArr);
        Companion = new Object() { // from class: X.0bCz
        };
    }

    public static EnumC964530bCt[] values() {
        return (EnumC964530bCt[]) LLILLJJLI.clone();
    }

    public final int getRawValue() {
        return this.LL;
    }

    public static EnumC964530bCt valueOf(String str) {
        return (EnumC964530bCt) C08FF.LIZ(EnumC964530bCt.class, str);
    }

    public EnumC964530bCt(String str, int i, int i2) {
        this.LL = i2;
    }
}
