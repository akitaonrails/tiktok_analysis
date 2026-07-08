package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1993507rR {
    public static final EnumC1993507rR GROUP_JOIN_SCENE_DEFAULT;
    public static final EnumC1993507rR GROUP_JOIN_SCENE_INVITATION_VALIDATION;
    public static final /* synthetic */ EnumC1993507rR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1993507rR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1993507rR enumC1993507rR = new EnumC1993507rR("GROUP_JOIN_SCENE_DEFAULT", 0, 0);
        GROUP_JOIN_SCENE_DEFAULT = enumC1993507rR;
        EnumC1993507rR enumC1993507rR2 = new EnumC1993507rR("GROUP_JOIN_SCENE_INVITATION_VALIDATION", 1, 1);
        GROUP_JOIN_SCENE_INVITATION_VALIDATION = enumC1993507rR2;
        EnumC1993507rR[] enumC1993507rRArr = {enumC1993507rR, enumC1993507rR2};
        LLILLJJLI = enumC1993507rRArr;
        LLILLL = new C2254308sP(enumC1993507rRArr);
    }

    public static EnumC1993507rR[] values() {
        return (EnumC1993507rR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1993507rR valueOf(String str) {
        return (EnumC1993507rR) C08FF.LIZ(EnumC1993507rR.class, str);
    }

    public EnumC1993507rR(String str, int i, int i2) {
        this.LL = i2;
    }
}
