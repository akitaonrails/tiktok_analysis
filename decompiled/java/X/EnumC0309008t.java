package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0309008t {
    public static final EnumC0309008t ANIMATED_APPLY;
    public static final EnumC0309008t LANDING_GUIDANCE;
    public static final /* synthetic */ EnumC0309008t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC0309008t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0309008t enumC0309008t = new EnumC0309008t("LANDING_GUIDANCE", 0);
        LANDING_GUIDANCE = enumC0309008t;
        EnumC0309008t enumC0309008t2 = new EnumC0309008t("ANIMATED_APPLY", 1);
        ANIMATED_APPLY = enumC0309008t2;
        EnumC0309008t[] enumC0309008tArr = {enumC0309008t, enumC0309008t2};
        LL = enumC0309008tArr;
        LLILLJJLI = new C2254308sP(enumC0309008tArr);
    }

    public static EnumC0309008t[] values() {
        return (EnumC0309008t[]) LL.clone();
    }

    public static EnumC0309008t valueOf(String str) {
        return (EnumC0309008t) C08FF.LIZ(EnumC0309008t.class, str);
    }

    public EnumC0309008t(String str, int i) {
    }
}
