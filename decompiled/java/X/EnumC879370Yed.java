package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC879370Yed {
    public static final EnumC879370Yed CHANGE;
    public static final EnumC879370Yed CLOSE;
    public static final /* synthetic */ EnumC879370Yed[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC879370Yed REMOVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC879370Yed> getEntries() {
        return LLILLL;
    }

    static {
        EnumC879370Yed enumC879370Yed = new EnumC879370Yed("CLOSE", 0, "close");
        CLOSE = enumC879370Yed;
        EnumC879370Yed enumC879370Yed2 = new EnumC879370Yed("CHANGE", 1, "change");
        CHANGE = enumC879370Yed2;
        EnumC879370Yed enumC879370Yed3 = new EnumC879370Yed("REMOVE", 2, "remove");
        REMOVE = enumC879370Yed3;
        EnumC879370Yed[] enumC879370YedArr = {enumC879370Yed, enumC879370Yed2, enumC879370Yed3};
        LLILLJJLI = enumC879370YedArr;
        LLILLL = new C2254308sP(enumC879370YedArr);
    }

    public static EnumC879370Yed[] values() {
        return (EnumC879370Yed[]) LLILLJJLI.clone();
    }

    public final String getMobStr() {
        return this.LL;
    }

    public static EnumC879370Yed valueOf(String str) {
        return (EnumC879370Yed) C08FF.LIZ(EnumC879370Yed.class, str);
    }

    public EnumC879370Yed(String str, int i, String str2) {
        this.LL = str2;
    }
}
