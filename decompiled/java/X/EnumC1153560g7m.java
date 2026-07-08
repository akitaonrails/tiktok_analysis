package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153560g7m {
    public static final EnumC1153560g7m ERROR;
    public static final /* synthetic */ EnumC1153560g7m[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153560g7m WARNING;

    public static InterfaceC2044707zh<EnumC1153560g7m> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153560g7m enumC1153560g7m = new EnumC1153560g7m("WARNING", 0);
        WARNING = enumC1153560g7m;
        EnumC1153560g7m enumC1153560g7m2 = new EnumC1153560g7m("ERROR", 1);
        ERROR = enumC1153560g7m2;
        EnumC1153560g7m[] enumC1153560g7mArr = {enumC1153560g7m, enumC1153560g7m2};
        LL = enumC1153560g7mArr;
        LLILLJJLI = new C2254308sP(enumC1153560g7mArr);
    }

    public static EnumC1153560g7m[] values() {
        return (EnumC1153560g7m[]) LL.clone();
    }

    public static EnumC1153560g7m valueOf(String str) {
        return (EnumC1153560g7m) C08FF.LIZ(EnumC1153560g7m.class, str);
    }

    public EnumC1153560g7m(String str, int i) {
    }
}
