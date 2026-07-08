package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nJ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1429610nJ1 {
    public static final C1429620nJ2 Companion;
    public static final EnumC1429610nJ1 EDIT_EFFECT;
    public static final EnumC1429610nJ1 EDIT_EFFECT_CLIENT;
    public static final EnumC1429610nJ1 EDIT_EFFECT_COMBINED;
    public static final EnumC1429610nJ1 EDIT_EFFECT_COMBO_ANIM;
    public static final EnumC1429610nJ1 EDIT_EFFECT_IN_ANIM;
    public static final EnumC1429610nJ1 EDIT_EFFECT_OUT_ANIM;
    public static final EnumC1429610nJ1 EDIT_EFFECT_SERVER;
    public static final EnumC1429610nJ1 EDIT_EFFECT_VIDEO_TYPE;
    public static final EnumC1429610nJ1 EDIT_PROP;
    public static final /* synthetic */ EnumC1429610nJ1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1429610nJ1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1429610nJ1 enumC1429610nJ1 = new EnumC1429610nJ1("EDIT_EFFECT", 0, "edit_effect");
        EDIT_EFFECT = enumC1429610nJ1;
        EnumC1429610nJ1 enumC1429610nJ12 = new EnumC1429610nJ1("EDIT_PROP", 1, "edit_prop");
        EDIT_PROP = enumC1429610nJ12;
        EnumC1429610nJ1 enumC1429610nJ13 = new EnumC1429610nJ1("EDIT_EFFECT_SERVER", 2, "effect_server");
        EDIT_EFFECT_SERVER = enumC1429610nJ13;
        EnumC1429610nJ1 enumC1429610nJ14 = new EnumC1429610nJ1("EDIT_EFFECT_CLIENT", 3, "effect_client");
        EDIT_EFFECT_CLIENT = enumC1429610nJ14;
        EnumC1429610nJ1 enumC1429610nJ15 = new EnumC1429610nJ1("EDIT_EFFECT_COMBINED", 4, "effect_combine");
        EDIT_EFFECT_COMBINED = enumC1429610nJ15;
        EnumC1429610nJ1 enumC1429610nJ16 = new EnumC1429610nJ1("EDIT_EFFECT_VIDEO_TYPE", 5, "video_anim_type");
        EDIT_EFFECT_VIDEO_TYPE = enumC1429610nJ16;
        EnumC1429610nJ1 enumC1429610nJ17 = new EnumC1429610nJ1("EDIT_EFFECT_OUT_ANIM", 6, "out_video_anim");
        EDIT_EFFECT_OUT_ANIM = enumC1429610nJ17;
        EnumC1429610nJ1 enumC1429610nJ18 = new EnumC1429610nJ1("EDIT_EFFECT_IN_ANIM", 7, "in_video_anim");
        EDIT_EFFECT_IN_ANIM = enumC1429610nJ18;
        EnumC1429610nJ1 enumC1429610nJ19 = new EnumC1429610nJ1("EDIT_EFFECT_COMBO_ANIM", 8, "combo_video_anim");
        EDIT_EFFECT_COMBO_ANIM = enumC1429610nJ19;
        EnumC1429610nJ1[] enumC1429610nJ1Arr = {enumC1429610nJ1, enumC1429610nJ12, enumC1429610nJ13, enumC1429610nJ14, enumC1429610nJ15, enumC1429610nJ16, enumC1429610nJ17, enumC1429610nJ18, enumC1429610nJ19};
        LLILLJJLI = enumC1429610nJ1Arr;
        LLILLL = new C2254308sP(enumC1429610nJ1Arr);
        Companion = new C1429620nJ2();
    }

    public static EnumC1429610nJ1[] values() {
        return (EnumC1429610nJ1[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1429610nJ1 valueOf(String str) {
        return (EnumC1429610nJ1) C08FF.LIZ(EnumC1429610nJ1.class, str);
    }

    public EnumC1429610nJ1(String str, int i, String str2) {
        this.LL = str2;
    }
}
