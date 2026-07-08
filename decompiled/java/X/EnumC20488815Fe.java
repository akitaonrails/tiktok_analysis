package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20488815Fe {
    public static final EnumC20488815Fe BONUS_CAPSULE;
    public static final /* synthetic */ EnumC20488815Fe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20488815Fe NONE;
    public static final EnumC20488815Fe TASK_CAPSULE;
    public static final EnumC20488815Fe TASK_FAILED;

    public static InterfaceC2044707zh<EnumC20488815Fe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20488815Fe enumC20488815Fe = new EnumC20488815Fe("NONE", 0);
        NONE = enumC20488815Fe;
        EnumC20488815Fe enumC20488815Fe2 = new EnumC20488815Fe("TASK_CAPSULE", 1);
        TASK_CAPSULE = enumC20488815Fe2;
        EnumC20488815Fe enumC20488815Fe3 = new EnumC20488815Fe("BONUS_CAPSULE", 2);
        BONUS_CAPSULE = enumC20488815Fe3;
        EnumC20488815Fe enumC20488815Fe4 = new EnumC20488815Fe("TASK_FAILED", 3);
        TASK_FAILED = enumC20488815Fe4;
        EnumC20488815Fe[] enumC20488815FeArr = {enumC20488815Fe, enumC20488815Fe2, enumC20488815Fe3, enumC20488815Fe4};
        LL = enumC20488815FeArr;
        LLILLJJLI = new C2254308sP(enumC20488815FeArr);
    }

    public static EnumC20488815Fe[] values() {
        return (EnumC20488815Fe[]) LL.clone();
    }

    public static EnumC20488815Fe valueOf(String str) {
        return (EnumC20488815Fe) C08FF.LIZ(EnumC20488815Fe.class, str);
    }

    public EnumC20488815Fe(String str, int i) {
    }
}
