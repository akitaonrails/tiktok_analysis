package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a16, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918780a16 {
    public static final EnumC918780a16 APPLY;
    public static final EnumC918780a16 APPLYING;
    public static final EnumC918780a16 APPLY_DISABLED;
    public static final EnumC918780a16 DIRECT_NORMAL_BATTLE_INVITE;
    public static final EnumC918780a16 DIRECT_NORMAL_BATTLE_INVITE_DISABLED;
    public static final EnumC918780a16 DIRECT_NORMAL_BATTLE_INVITING;
    public static final EnumC918780a16 INVITE;
    public static final EnumC918780a16 INVITE_DISABLED;
    public static final EnumC918780a16 INVITING;
    public static final /* synthetic */ EnumC918780a16[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public final Number LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC918780a16> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC918780a16 enumC918780a16 = new EnumC918780a16("INVITE", 0, 6, "INVITE", "invite");
        INVITE = enumC918780a16;
        EnumC918780a16 enumC918780a162 = new EnumC918780a16("APPLY", 1, 9, "APPLY", "apply");
        APPLY = enumC918780a162;
        EnumC918780a16 enumC918780a163 = new EnumC918780a16("INVITE_DISABLED", 2, 7, "INVITE_DISABLED", "");
        INVITE_DISABLED = enumC918780a163;
        EnumC918780a16 enumC918780a164 = new EnumC918780a16("APPLY_DISABLED", 3, 10, "APPLY_DISABLED", "");
        APPLY_DISABLED = enumC918780a164;
        EnumC918780a16 enumC918780a165 = new EnumC918780a16("INVITING", 4, 8, "INVITING", "cancel_invite");
        INVITING = enumC918780a165;
        EnumC918780a16 enumC918780a166 = new EnumC918780a16("APPLYING", 5, 11, "APPLYING", "cancel_apply");
        APPLYING = enumC918780a166;
        EnumC918780a16 enumC918780a167 = new EnumC918780a16("DIRECT_NORMAL_BATTLE_INVITE", 6, 12, "DIRECT_NORMAL_BATTLE_INVITE", "direct_normal_battle");
        DIRECT_NORMAL_BATTLE_INVITE = enumC918780a167;
        EnumC918780a16 enumC918780a168 = new EnumC918780a16("DIRECT_NORMAL_BATTLE_INVITING", 7, 13, "DIRECT_NORMAL_BATTLE_INVITING", "cancel_direct_normal_battle");
        DIRECT_NORMAL_BATTLE_INVITING = enumC918780a168;
        EnumC918780a16 enumC918780a169 = new EnumC918780a16("DIRECT_NORMAL_BATTLE_INVITE_DISABLED", 8, 14, "DIRECT_NORMAL_BATTLE_INVITE_DISABLED", "");
        DIRECT_NORMAL_BATTLE_INVITE_DISABLED = enumC918780a169;
        EnumC918780a16[] enumC918780a16Arr = {enumC918780a16, enumC918780a162, enumC918780a163, enumC918780a164, enumC918780a165, enumC918780a166, enumC918780a167, enumC918780a168, enumC918780a169};
        LLILZ = enumC918780a16Arr;
        LLILZIL = new C2254308sP(enumC918780a16Arr);
    }

    public static EnumC918780a16[] values() {
        return (EnumC918780a16[]) LLILZ.clone();
    }

    public final String getCallToAction() {
        return this.LLILLL;
    }

    public final Number getNumValue() {
        return this.LL;
    }

    public final String getStrValue() {
        return this.LLILLJJLI;
    }

    public static EnumC918780a16 valueOf(String str) {
        return (EnumC918780a16) C08FF.LIZ(EnumC918780a16.class, str);
    }

    public EnumC918780a16(String str, int i, Number number, String str2, String str3) {
        this.LL = number;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
