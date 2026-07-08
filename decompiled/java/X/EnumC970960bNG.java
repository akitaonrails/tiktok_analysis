package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bNG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC970960bNG {
    public static final EnumC970960bNG AUTO_TRIGGER;
    public static final EnumC970960bNG COUNTDOWN;
    public static final /* synthetic */ EnumC970960bNG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC970960bNG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC970960bNG enumC970960bNG = new EnumC970960bNG("AUTO_TRIGGER", 0);
        AUTO_TRIGGER = enumC970960bNG;
        EnumC970960bNG enumC970960bNG2 = new EnumC970960bNG("COUNTDOWN", 1);
        COUNTDOWN = enumC970960bNG2;
        EnumC970960bNG[] enumC970960bNGArr = {enumC970960bNG, enumC970960bNG2};
        LL = enumC970960bNGArr;
        LLILLJJLI = new C2254308sP(enumC970960bNGArr);
    }

    public static EnumC970960bNG[] values() {
        return (EnumC970960bNG[]) LL.clone();
    }

    public static EnumC970960bNG valueOf(String str) {
        return (EnumC970960bNG) C08FF.LIZ(EnumC970960bNG.class, str);
    }

    public EnumC970960bNG(String str, int i) {
    }
}
