package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671270QUr {
    public static final /* synthetic */ EnumC671270QUr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC671270QUr MANUAL;
    public static final EnumC671270QUr ON_TO_FRAGMENT_FIRST_DRAW;
    public static final EnumC671270QUr ON_TO_FRAGMENT_RESUMED;
    public static final EnumC671270QUr ON_TO_FRAGMENT_STARTED;

    public static InterfaceC2044707zh<EnumC671270QUr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC671270QUr enumC671270QUr = new EnumC671270QUr("ON_TO_FRAGMENT_STARTED", 0);
        ON_TO_FRAGMENT_STARTED = enumC671270QUr;
        EnumC671270QUr enumC671270QUr2 = new EnumC671270QUr("ON_TO_FRAGMENT_RESUMED", 1);
        ON_TO_FRAGMENT_RESUMED = enumC671270QUr2;
        EnumC671270QUr enumC671270QUr3 = new EnumC671270QUr("ON_TO_FRAGMENT_FIRST_DRAW", 2);
        ON_TO_FRAGMENT_FIRST_DRAW = enumC671270QUr3;
        EnumC671270QUr enumC671270QUr4 = new EnumC671270QUr("MANUAL", 3);
        MANUAL = enumC671270QUr4;
        EnumC671270QUr[] enumC671270QUrArr = {enumC671270QUr, enumC671270QUr2, enumC671270QUr3, enumC671270QUr4};
        LL = enumC671270QUrArr;
        LLILLJJLI = new C2254308sP(enumC671270QUrArr);
    }

    public static EnumC671270QUr[] values() {
        return (EnumC671270QUr[]) LL.clone();
    }

    public static EnumC671270QUr valueOf(String str) {
        return (EnumC671270QUr) C08FF.LIZ(EnumC671270QUr.class, str);
    }

    public EnumC671270QUr(String str, int i) {
    }
}
