package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19354610no {
    public static final C19354710np Companion;
    public static final /* synthetic */ EnumC19354610no[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19354610no REMIND_ANYONE_SEE;
    public static final EnumC19354610no REMIND_DUET_NOT_ALLOWED;
    public static final EnumC19354610no REMIND_FRIEND_SEE;
    public static final EnumC19354610no REMIND_SELF_SEE;
    public static final EnumC19354610no REMIND_SOUND_NOT_READY;
    public static final EnumC19354610no UNKNOWN_REMIND_TYPE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19354610no> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19354610no enumC19354610no = new EnumC19354610no("UNKNOWN_REMIND_TYPE", 0, -1);
        UNKNOWN_REMIND_TYPE = enumC19354610no;
        EnumC19354610no enumC19354610no2 = new EnumC19354610no("REMIND_SELF_SEE", 1, 2131832482);
        REMIND_SELF_SEE = enumC19354610no2;
        EnumC19354610no enumC19354610no3 = new EnumC19354610no("REMIND_FRIEND_SEE", 2, 2131832481);
        REMIND_FRIEND_SEE = enumC19354610no3;
        EnumC19354610no enumC19354610no4 = new EnumC19354610no("REMIND_ANYONE_SEE", 3, 2131832480);
        REMIND_ANYONE_SEE = enumC19354610no4;
        EnumC19354610no enumC19354610no5 = new EnumC19354610no("REMIND_DUET_NOT_ALLOWED", 4, 2131832490);
        REMIND_DUET_NOT_ALLOWED = enumC19354610no5;
        EnumC19354610no enumC19354610no6 = new EnumC19354610no("REMIND_SOUND_NOT_READY", 5, 2131828362);
        REMIND_SOUND_NOT_READY = enumC19354610no6;
        EnumC19354610no[] enumC19354610noArr = {enumC19354610no, enumC19354610no2, enumC19354610no3, enumC19354610no4, enumC19354610no5, enumC19354610no6};
        LLILLJJLI = enumC19354610noArr;
        LLILLL = new C2254308sP(enumC19354610noArr);
        Companion = new C19354710np();
    }

    public static EnumC19354610no[] values() {
        return (EnumC19354610no[]) LLILLJJLI.clone();
    }

    public final int getTextId() {
        return this.LL;
    }

    public static EnumC19354610no valueOf(String str) {
        return (EnumC19354610no) C08FF.LIZ(EnumC19354610no.class, str);
    }

    public EnumC19354610no(String str, int i, int i2) {
        this.LL = i2;
    }
}
