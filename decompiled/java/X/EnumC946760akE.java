package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0akE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC946760akE {
    public static final EnumC946760akE FOLLOW_GUIDE_ACTION;
    public static final EnumC946760akE FOLLOW_GUIDE_NORMAL;
    public static final /* synthetic */ EnumC946760akE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC946760akE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC946760akE enumC946760akE = new EnumC946760akE("FOLLOW_GUIDE_NORMAL", 0, "follow_guide_normal");
        FOLLOW_GUIDE_NORMAL = enumC946760akE;
        EnumC946760akE enumC946760akE2 = new EnumC946760akE("FOLLOW_GUIDE_ACTION", 1, "follow_guide_action");
        FOLLOW_GUIDE_ACTION = enumC946760akE2;
        EnumC946760akE[] enumC946760akEArr = {enumC946760akE, enumC946760akE2};
        LLILLJJLI = enumC946760akEArr;
        LLILLL = new C2254308sP(enumC946760akEArr);
    }

    public static EnumC946760akE[] values() {
        return (EnumC946760akE[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC946760akE valueOf(String str) {
        return (EnumC946760akE) C08FF.LIZ(EnumC946760akE.class, str);
    }

    public EnumC946760akE(String str, int i, String str2) {
        this.LL = str2;
    }
}
