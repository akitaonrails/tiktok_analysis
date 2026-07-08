package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1240610iOB {
    public static final /* synthetic */ EnumC1240610iOB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1240610iOB MESSAGE;
    public static final EnumC1240610iOB USER_CELL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1240610iOB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1240610iOB enumC1240610iOB = new EnumC1240610iOB("USER_CELL", 0, "user_cell");
        USER_CELL = enumC1240610iOB;
        EnumC1240610iOB enumC1240610iOB2 = new EnumC1240610iOB("MESSAGE", 1, "message");
        MESSAGE = enumC1240610iOB2;
        EnumC1240610iOB[] enumC1240610iOBArr = {enumC1240610iOB, enumC1240610iOB2};
        LLILLJJLI = enumC1240610iOBArr;
        LLILLL = new C2254308sP(enumC1240610iOBArr);
    }

    public static EnumC1240610iOB[] values() {
        return (EnumC1240610iOB[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1240610iOB valueOf(String str) {
        return (EnumC1240610iOB) C08FF.LIZ(EnumC1240610iOB.class, str);
    }

    public EnumC1240610iOB(String str, int i, String str2) {
        this.LL = str2;
    }
}
