package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ayn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955790ayn {
    public static final EnumC955790ayn APPLY_INVITE;
    public static final EnumC955790ayn APPLY_PAIR;
    public static final EnumC955790ayn INVITE_APPLY;
    public static final EnumC955790ayn INVITE_PAIR;
    public static final EnumC955790ayn INVITE_PAIR_NEW;
    public static final /* synthetic */ EnumC955790ayn[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC955790ayn PAIR_INVITE;
    public static final EnumC955790ayn PAIR_INVITE_NEW;
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    public static InterfaceC2044707zh<EnumC955790ayn> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC955790ayn enumC955790ayn = new EnumC955790ayn(0, 2131841190, 2131851835, 2131841189, "INVITE_APPLY", "switch_invite_to_apply");
        INVITE_APPLY = enumC955790ayn;
        EnumC955790ayn enumC955790ayn2 = new EnumC955790ayn(1, 2131851838, 2131851835, 2131841188, "INVITE_PAIR", "switch_invite_to_random");
        INVITE_PAIR = enumC955790ayn2;
        EnumC955790ayn enumC955790ayn3 = new EnumC955790ayn(2, 2131841181, 2131851836, 2131841180, "APPLY_INVITE", "switch_apply_to_invite");
        APPLY_INVITE = enumC955790ayn3;
        EnumC955790ayn enumC955790ayn4 = new EnumC955790ayn(3, 2131851838, 2131851836, 2131841182, "APPLY_PAIR", "switch_apply_to_random");
        APPLY_PAIR = enumC955790ayn4;
        EnumC955790ayn enumC955790ayn5 = new EnumC955790ayn(4, 2131851833, 2131851832, 2131851834, "PAIR_INVITE", "switch_quick_pair_to_invite");
        PAIR_INVITE = enumC955790ayn5;
        EnumC955790ayn enumC955790ayn6 = new EnumC955790ayn(5, 2131851833, 2131851725, 2131851834, "PAIR_INVITE_NEW", "switch_quick_pair_to_invite_new");
        PAIR_INVITE_NEW = enumC955790ayn6;
        EnumC955790ayn enumC955790ayn7 = new EnumC955790ayn(6, 2131851838, 2131851725, 2131841188, "INVITE_PAIR_NEW", "switch_invite_to_random_new");
        INVITE_PAIR_NEW = enumC955790ayn7;
        EnumC955790ayn[] enumC955790aynArr = {enumC955790ayn, enumC955790ayn2, enumC955790ayn3, enumC955790ayn4, enumC955790ayn5, enumC955790ayn6, enumC955790ayn7};
        LLILZIL = enumC955790aynArr;
        LLILZLL = new C2254308sP(enumC955790aynArr);
    }

    public static EnumC955790ayn[] values() {
        return (EnumC955790ayn[]) LLILZIL.clone();
    }

    public final int getButtonResId() {
        return this.LLILZ;
    }

    public final int getContentResId() {
        return this.LLILLL;
    }

    public final String getLabel() {
        return this.LL;
    }

    public final int getTitleResId() {
        return this.LLILLJJLI;
    }

    public static EnumC955790ayn valueOf(String str) {
        return (EnumC955790ayn) C08FF.LIZ(EnumC955790ayn.class, str);
    }

    public EnumC955790ayn(int i, int i2, int i3, int i4, String str, String str2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
    }
}
