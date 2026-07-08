package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Arg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2192661Arg {
    public static final EnumC2192661Arg AI_MATTING;
    public static final EnumC2192661Arg BLEND;
    public static final EnumC2192661Arg CIRCLE;
    public static final C2192671Arh Companion;
    public static final EnumC2192661Arg ERASER;
    public static final EnumC2192661Arg INTERACTIVE_MATTING;
    public static final /* synthetic */ EnumC2192661Arg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2192661Arg NONE;
    public static final EnumC2192661Arg PAINTER;
    public static final EnumC2192661Arg VOS;
    public static final EnumC2192661Arg VOS_MATTING_BLEND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2192661Arg> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.1Arh] */
    static {
        EnumC2192661Arg enumC2192661Arg = new EnumC2192661Arg("NONE", 0, "none");
        NONE = enumC2192661Arg;
        EnumC2192661Arg enumC2192661Arg2 = new EnumC2192661Arg("ERASER", 1, "eraser");
        ERASER = enumC2192661Arg2;
        EnumC2192661Arg enumC2192661Arg3 = new EnumC2192661Arg("PAINTER", 2, "painter_v2");
        PAINTER = enumC2192661Arg3;
        EnumC2192661Arg enumC2192661Arg4 = new EnumC2192661Arg("AI_MATTING", 3, "ai_matting");
        AI_MATTING = enumC2192661Arg4;
        EnumC2192661Arg enumC2192661Arg5 = new EnumC2192661Arg("BLEND", 4, "ai_matting_blend");
        BLEND = enumC2192661Arg5;
        EnumC2192661Arg enumC2192661Arg6 = new EnumC2192661Arg("VOS_MATTING_BLEND", 5, "vos_matting_blend");
        VOS_MATTING_BLEND = enumC2192661Arg6;
        EnumC2192661Arg enumC2192661Arg7 = new EnumC2192661Arg("VOS", 6, "vos_matting_v2");
        VOS = enumC2192661Arg7;
        EnumC2192661Arg enumC2192661Arg8 = new EnumC2192661Arg("INTERACTIVE_MATTING", 7, "interactive_matting");
        INTERACTIVE_MATTING = enumC2192661Arg8;
        EnumC2192661Arg enumC2192661Arg9 = new EnumC2192661Arg("CIRCLE", 8, "circle");
        CIRCLE = enumC2192661Arg9;
        EnumC2192661Arg[] enumC2192661ArgArr = {enumC2192661Arg, enumC2192661Arg2, enumC2192661Arg3, enumC2192661Arg4, enumC2192661Arg5, enumC2192661Arg6, enumC2192661Arg7, enumC2192661Arg8, enumC2192661Arg9};
        LLILLJJLI = enumC2192661ArgArr;
        LLILLL = new C2254308sP(enumC2192661ArgArr);
        Companion = new Object() { // from class: X.1Arh
        };
    }

    public static EnumC2192661Arg[] values() {
        return (EnumC2192661Arg[]) LLILLJJLI.clone();
    }

    public final String getTypeVal() {
        return this.LL;
    }

    public static EnumC2192661Arg valueOf(String str) {
        return (EnumC2192661Arg) C08FF.LIZ(EnumC2192661Arg.class, str);
    }

    public EnumC2192661Arg(String str, int i, String str2) {
        this.LL = str2;
    }
}
