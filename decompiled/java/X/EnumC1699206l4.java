package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06l4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1699206l4 {
    public static final EnumC1699206l4 DISMISS;
    public static final /* synthetic */ EnumC1699206l4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1699206l4 SELECT_PARTICIPANTS;
    public static final EnumC1699206l4 START_GROUP_SHOT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1699206l4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1699206l4 enumC1699206l4 = new EnumC1699206l4("START_GROUP_SHOT", 0, "add_photo");
        START_GROUP_SHOT = enumC1699206l4;
        EnumC1699206l4 enumC1699206l42 = new EnumC1699206l4("DISMISS", 1, "dismiss");
        DISMISS = enumC1699206l42;
        EnumC1699206l4 enumC1699206l43 = new EnumC1699206l4("SELECT_PARTICIPANTS", 2, "select_participants");
        SELECT_PARTICIPANTS = enumC1699206l43;
        EnumC1699206l4[] enumC1699206l4Arr = {enumC1699206l4, enumC1699206l42, enumC1699206l43};
        LLILLJJLI = enumC1699206l4Arr;
        LLILLL = new C2254308sP(enumC1699206l4Arr);
    }

    public static EnumC1699206l4[] values() {
        return (EnumC1699206l4[]) LLILLJJLI.clone();
    }

    public final String getEntranceActionVal() {
        return this.LL;
    }

    public static EnumC1699206l4 valueOf(String str) {
        return (EnumC1699206l4) C08FF.LIZ(EnumC1699206l4.class, str);
    }

    public EnumC1699206l4(String str, int i, String str2) {
        this.LL = str2;
    }
}
