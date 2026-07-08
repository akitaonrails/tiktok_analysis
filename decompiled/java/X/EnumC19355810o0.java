package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19355810o0 {
    public static final EnumC19355810o0 AUTO_SAVE;
    public static final EnumC19355810o0 BACKGROUND_SAVE;
    public static final /* synthetic */ EnumC19355810o0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19355810o0 RESTORE;
    public static final EnumC19355810o0 SAVE;

    public static InterfaceC2044707zh<EnumC19355810o0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19355810o0 enumC19355810o0 = new EnumC19355810o0("SAVE", 0);
        SAVE = enumC19355810o0;
        EnumC19355810o0 enumC19355810o02 = new EnumC19355810o0("RESTORE", 1);
        RESTORE = enumC19355810o02;
        EnumC19355810o0 enumC19355810o03 = new EnumC19355810o0("AUTO_SAVE", 2);
        AUTO_SAVE = enumC19355810o03;
        EnumC19355810o0 enumC19355810o04 = new EnumC19355810o0("BACKGROUND_SAVE", 3);
        BACKGROUND_SAVE = enumC19355810o04;
        EnumC19355810o0[] enumC19355810o0Arr = {enumC19355810o0, enumC19355810o02, enumC19355810o03, enumC19355810o04};
        LL = enumC19355810o0Arr;
        LLILLJJLI = new C2254308sP(enumC19355810o0Arr);
    }

    public static EnumC19355810o0[] values() {
        return (EnumC19355810o0[]) LL.clone();
    }

    public static EnumC19355810o0 valueOf(String str) {
        return (EnumC19355810o0) C08FF.LIZ(EnumC19355810o0.class, str);
    }

    public EnumC19355810o0(String str, int i) {
    }
}
