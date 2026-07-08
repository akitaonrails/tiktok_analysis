package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC675750Qez {
    public static final /* synthetic */ EnumC675750Qez[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC675750Qez LOADING_STYLE_DUAL_BALL;
    public static final EnumC675750Qez LOADING_STYLE_SKELETON;
    public final int LL;

    public static InterfaceC2044707zh<EnumC675750Qez> getEntries() {
        return LLILLL;
    }

    static {
        EnumC675750Qez enumC675750Qez = new EnumC675750Qez("LOADING_STYLE_DUAL_BALL", 0, 0);
        LOADING_STYLE_DUAL_BALL = enumC675750Qez;
        EnumC675750Qez enumC675750Qez2 = new EnumC675750Qez("LOADING_STYLE_SKELETON", 1, 1);
        LOADING_STYLE_SKELETON = enumC675750Qez2;
        EnumC675750Qez[] enumC675750QezArr = {enumC675750Qez, enumC675750Qez2};
        LLILLJJLI = enumC675750QezArr;
        LLILLL = new C2254308sP(enumC675750QezArr);
    }

    public static EnumC675750Qez[] values() {
        return (EnumC675750Qez[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC675750Qez valueOf(String str) {
        return (EnumC675750Qez) C08FF.LIZ(EnumC675750Qez.class, str);
    }

    public EnumC675750Qez(String str, int i, int i2) {
        this.LL = i2;
    }
}
