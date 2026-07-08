package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC680310QmL {
    public static final EnumC680310QmL DRAMA_PRIORITY;
    public static final /* synthetic */ EnumC680310QmL[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC680310QmL SEARCH_PRIORITY;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC680310QmL> getEntries() {
        return LLILZ;
    }

    static {
        EnumC680310QmL enumC680310QmL = new EnumC680310QmL("SEARCH_PRIORITY", 0, 0, "search_lynx_container");
        SEARCH_PRIORITY = enumC680310QmL;
        EnumC680310QmL enumC680310QmL2 = new EnumC680310QmL("DRAMA_PRIORITY", 1, 1, "drama_lynx_container");
        DRAMA_PRIORITY = enumC680310QmL2;
        EnumC680310QmL[] enumC680310QmLArr = {enumC680310QmL, enumC680310QmL2};
        LLILLL = enumC680310QmLArr;
        LLILZ = new C2254308sP(enumC680310QmLArr);
    }

    public static EnumC680310QmL[] values() {
        return (EnumC680310QmL[]) LLILLL.clone();
    }

    public final String getContainerType() {
        return this.LLILLJJLI;
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC680310QmL valueOf(String str) {
        return (EnumC680310QmL) C08FF.LIZ(EnumC680310QmL.class, str);
    }

    public EnumC680310QmL(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
