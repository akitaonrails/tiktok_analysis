package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0apm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC950200apm {
    public static final EnumC950200apm APPLIED;
    public static final EnumC950200apm APPLIED_ME;
    public static final EnumC950200apm APPLYING;
    public static final EnumC950200apm APPLYING_ME;
    public static final EnumC950200apm CANCELING;
    public static final C950210apn Companion;
    public static final EnumC950200apm IDLE;
    public static final EnumC950200apm INVITED;
    public static final EnumC950200apm INVITED_ME;
    public static final EnumC950200apm INVITING;
    public static final EnumC950200apm INVITING_ME;
    public static final EnumC950200apm LINKED;
    public static final /* synthetic */ EnumC950200apm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC950200apm> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0apn] */
    static {
        EnumC950200apm enumC950200apm = new EnumC950200apm("IDLE", 0);
        IDLE = enumC950200apm;
        EnumC950200apm enumC950200apm2 = new EnumC950200apm("INVITING", 1);
        INVITING = enumC950200apm2;
        EnumC950200apm enumC950200apm3 = new EnumC950200apm("INVITED", 2);
        INVITED = enumC950200apm3;
        EnumC950200apm enumC950200apm4 = new EnumC950200apm("APPLYING", 3);
        APPLYING = enumC950200apm4;
        EnumC950200apm enumC950200apm5 = new EnumC950200apm("APPLIED", 4);
        APPLIED = enumC950200apm5;
        EnumC950200apm enumC950200apm6 = new EnumC950200apm("INVITING_ME", 5);
        INVITING_ME = enumC950200apm6;
        EnumC950200apm enumC950200apm7 = new EnumC950200apm("INVITED_ME", 6);
        INVITED_ME = enumC950200apm7;
        EnumC950200apm enumC950200apm8 = new EnumC950200apm("APPLYING_ME", 7);
        APPLYING_ME = enumC950200apm8;
        EnumC950200apm enumC950200apm9 = new EnumC950200apm("APPLIED_ME", 8);
        APPLIED_ME = enumC950200apm9;
        EnumC950200apm enumC950200apm10 = new EnumC950200apm("CANCELING", 9);
        CANCELING = enumC950200apm10;
        EnumC950200apm enumC950200apm11 = new EnumC950200apm("LINKED", 10);
        LINKED = enumC950200apm11;
        EnumC950200apm[] enumC950200apmArr = {enumC950200apm, enumC950200apm2, enumC950200apm3, enumC950200apm4, enumC950200apm5, enumC950200apm6, enumC950200apm7, enumC950200apm8, enumC950200apm9, enumC950200apm10, enumC950200apm11};
        LL = enumC950200apmArr;
        LLILLJJLI = new C2254308sP(enumC950200apmArr);
        Companion = new Object() { // from class: X.0apn
        };
    }

    public static EnumC950200apm[] values() {
        return (EnumC950200apm[]) LL.clone();
    }

    public final boolean isApplying() {
        return this == APPLYING || this == APPLIED;
    }

    public final boolean isApplyingMe() {
        return this == APPLYING_ME || this == APPLIED_ME;
    }

    public final boolean isInviting() {
        return this == INVITING || this == INVITED;
    }

    public final boolean isInvitingMe() {
        return this == INVITING_ME || this == INVITED_ME;
    }

    public final boolean isLinked() {
        return this == LINKED;
    }

    public static EnumC950200apm valueOf(String str) {
        return (EnumC950200apm) C08FF.LIZ(EnumC950200apm.class, str);
    }

    public EnumC950200apm(String str, int i) {
    }
}
