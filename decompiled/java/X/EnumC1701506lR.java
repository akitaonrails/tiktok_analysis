package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06lR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1701506lR {
    public static final EnumC1701506lR EMOJI_FALLEN_ANIMATION;
    public static final EnumC1701506lR EMOJI_GUIDE_INLINE;
    public static final /* synthetic */ EnumC1701506lR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1701506lR UNKNOWN_SCENE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1701506lR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1701506lR enumC1701506lR = new EnumC1701506lR("UNKNOWN_SCENE", 0, 0);
        UNKNOWN_SCENE = enumC1701506lR;
        EnumC1701506lR enumC1701506lR2 = new EnumC1701506lR("EMOJI_GUIDE_INLINE", 1, 1);
        EMOJI_GUIDE_INLINE = enumC1701506lR2;
        EnumC1701506lR enumC1701506lR3 = new EnumC1701506lR("EMOJI_FALLEN_ANIMATION", 2, 2);
        EMOJI_FALLEN_ANIMATION = enumC1701506lR3;
        EnumC1701506lR[] enumC1701506lRArr = {enumC1701506lR, enumC1701506lR2, enumC1701506lR3};
        LLILLJJLI = enumC1701506lRArr;
        LLILLL = new C2254308sP(enumC1701506lRArr);
    }

    public static EnumC1701506lR[] values() {
        return (EnumC1701506lR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1701506lR valueOf(String str) {
        return (EnumC1701506lR) C08FF.LIZ(EnumC1701506lR.class, str);
    }

    public EnumC1701506lR(String str, int i, int i2) {
        this.LL = i2;
    }
}
