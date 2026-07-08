package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ahM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC944980ahM {
    public static final EnumC944980ahM APPLYING;
    public static final EnumC944980ahM CONNECTION_FINISH;
    public static final EnumC944980ahM CONNECTION_FINISH_SUCCEED;
    public static final EnumC944980ahM CONNECTION_START;
    public static final EnumC944980ahM CONNECTION_SUCCEED;
    public static final EnumC944980ahM DISABLED;
    public static final EnumC944980ahM INVITING;
    public static final /* synthetic */ EnumC944980ahM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC944980ahM MATCH;
    public static final EnumC944980ahM STATE_ONLINE;
    public static final EnumC944980ahM STATE_WAITING;
    public static final EnumC944980ahM UNLOADED;
    public int LL;

    public static InterfaceC2044707zh<EnumC944980ahM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC944980ahM enumC944980ahM = new EnumC944980ahM("DISABLED", 0, 1);
        DISABLED = enumC944980ahM;
        EnumC944980ahM enumC944980ahM2 = new EnumC944980ahM("MATCH", 1, 10);
        MATCH = enumC944980ahM2;
        EnumC944980ahM enumC944980ahM3 = new EnumC944980ahM("INVITING", 2, 11);
        INVITING = enumC944980ahM3;
        EnumC944980ahM enumC944980ahM4 = new EnumC944980ahM("APPLYING", 3, 12);
        APPLYING = enumC944980ahM4;
        EnumC944980ahM enumC944980ahM5 = new EnumC944980ahM("STATE_WAITING", 4, 15);
        STATE_WAITING = enumC944980ahM5;
        EnumC944980ahM enumC944980ahM6 = new EnumC944980ahM("CONNECTION_START", 5, 20);
        CONNECTION_START = enumC944980ahM6;
        EnumC944980ahM enumC944980ahM7 = new EnumC944980ahM("CONNECTION_SUCCEED", 6, 21);
        CONNECTION_SUCCEED = enumC944980ahM7;
        EnumC944980ahM enumC944980ahM8 = new EnumC944980ahM("STATE_ONLINE", 7, 21);
        STATE_ONLINE = enumC944980ahM8;
        EnumC944980ahM enumC944980ahM9 = new EnumC944980ahM("CONNECTION_FINISH", 8, 30);
        CONNECTION_FINISH = enumC944980ahM9;
        EnumC944980ahM enumC944980ahM10 = new EnumC944980ahM("CONNECTION_FINISH_SUCCEED", 9, 31);
        CONNECTION_FINISH_SUCCEED = enumC944980ahM10;
        EnumC944980ahM enumC944980ahM11 = new EnumC944980ahM("UNLOADED", 10, 40);
        UNLOADED = enumC944980ahM11;
        EnumC944980ahM[] enumC944980ahMArr = {enumC944980ahM, enumC944980ahM2, enumC944980ahM3, enumC944980ahM4, enumC944980ahM5, enumC944980ahM6, enumC944980ahM7, enumC944980ahM8, enumC944980ahM9, enumC944980ahM10, enumC944980ahM11};
        LLILLJJLI = enumC944980ahMArr;
        LLILLL = new C2254308sP(enumC944980ahMArr);
    }

    public static EnumC944980ahM[] values() {
        return (EnumC944980ahM[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC944980ahM valueOf(String str) {
        return (EnumC944980ahM) C08FF.LIZ(EnumC944980ahM.class, str);
    }

    public final void setState(int i) {
        this.LL = i;
    }

    public EnumC944980ahM(String str, int i, int i2) {
        this.LL = i2;
    }
}
