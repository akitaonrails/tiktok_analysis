package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779560wPS {
    public static final EnumC1779560wPS LL;
    public static final EnumC1779560wPS LLILLJJLI;
    public static final EnumC1779560wPS LLILLL;
    public static final /* synthetic */ EnumC1779560wPS[] LLILZ;

    static {
        EnumC1779560wPS enumC1779560wPS = new EnumC1779560wPS("INIT", 0);
        LL = enumC1779560wPS;
        EnumC1779560wPS enumC1779560wPS2 = new EnumC1779560wPS("DRAG_DOWN", 1);
        LLILLJJLI = enumC1779560wPS2;
        EnumC1779560wPS enumC1779560wPS3 = new EnumC1779560wPS("DRAG_UP", 2);
        LLILLL = enumC1779560wPS3;
        EnumC1779560wPS[] enumC1779560wPSArr = {enumC1779560wPS, enumC1779560wPS2, enumC1779560wPS3};
        LLILZ = enumC1779560wPSArr;
        new C2254308sP(enumC1779560wPSArr);
    }

    public static EnumC1779560wPS[] values() {
        return (EnumC1779560wPS[]) LLILZ.clone();
    }

    public static EnumC1779560wPS valueOf(String str) {
        return (EnumC1779560wPS) C08FF.LIZ(EnumC1779560wPS.class, str);
    }

    public EnumC1779560wPS(String str, int i) {
    }
}
