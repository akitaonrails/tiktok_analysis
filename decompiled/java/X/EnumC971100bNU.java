package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC971100bNU {
    public static final EnumC971100bNU DEFAULT_TEXT;
    public static final /* synthetic */ EnumC971100bNU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC971100bNU POS;
    public static final EnumC971100bNU ROTATE;
    public static final EnumC971100bNU SCALE;
    public static final EnumC971100bNU TEXT;
    public static final EnumC971100bNU TEXT_COLOR;
    public static final EnumC971100bNU TEXT_STYLE;
    public static final EnumC971100bNU TRANSFORM;

    public static InterfaceC2044707zh<EnumC971100bNU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC971100bNU enumC971100bNU = new EnumC971100bNU("TRANSFORM", 0);
        TRANSFORM = enumC971100bNU;
        EnumC971100bNU enumC971100bNU2 = new EnumC971100bNU("SCALE", 1);
        SCALE = enumC971100bNU2;
        EnumC971100bNU enumC971100bNU3 = new EnumC971100bNU("ROTATE", 2);
        ROTATE = enumC971100bNU3;
        EnumC971100bNU enumC971100bNU4 = new EnumC971100bNU("TEXT", 3);
        TEXT = enumC971100bNU4;
        EnumC971100bNU enumC971100bNU5 = new EnumC971100bNU("TEXT_COLOR", 4);
        TEXT_COLOR = enumC971100bNU5;
        EnumC971100bNU enumC971100bNU6 = new EnumC971100bNU("TEXT_STYLE", 5);
        TEXT_STYLE = enumC971100bNU6;
        EnumC971100bNU enumC971100bNU7 = new EnumC971100bNU("POS", 6);
        POS = enumC971100bNU7;
        EnumC971100bNU enumC971100bNU8 = new EnumC971100bNU("DEFAULT_TEXT", 7);
        DEFAULT_TEXT = enumC971100bNU8;
        EnumC971100bNU[] enumC971100bNUArr = {enumC971100bNU, enumC971100bNU2, enumC971100bNU3, enumC971100bNU4, enumC971100bNU5, enumC971100bNU6, enumC971100bNU7, enumC971100bNU8};
        LL = enumC971100bNUArr;
        LLILLJJLI = new C2254308sP(enumC971100bNUArr);
    }

    public static EnumC971100bNU[] values() {
        return (EnumC971100bNU[]) LL.clone();
    }

    public static EnumC971100bNU valueOf(String str) {
        return (EnumC971100bNU) C08FF.LIZ(EnumC971100bNU.class, str);
    }

    public EnumC971100bNU(String str, int i) {
    }
}
