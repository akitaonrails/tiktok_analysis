package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429000Gry {
    public static final /* synthetic */ EnumC429000Gry[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429000Gry STOP;
    public static final EnumC429000Gry TEXT;

    public static InterfaceC2044707zh<EnumC429000Gry> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429000Gry enumC429000Gry = new EnumC429000Gry("TEXT", 0);
        TEXT = enumC429000Gry;
        EnumC429000Gry enumC429000Gry2 = new EnumC429000Gry("STOP", 1);
        STOP = enumC429000Gry2;
        EnumC429000Gry[] enumC429000GryArr = {enumC429000Gry, enumC429000Gry2};
        LL = enumC429000GryArr;
        LLILLJJLI = new C2254308sP(enumC429000GryArr);
    }

    public static EnumC429000Gry[] values() {
        return (EnumC429000Gry[]) LL.clone();
    }

    public static EnumC429000Gry valueOf(String str) {
        return (EnumC429000Gry) C08FF.LIZ(EnumC429000Gry.class, str);
    }

    public EnumC429000Gry(String str, int i) {
    }
}
