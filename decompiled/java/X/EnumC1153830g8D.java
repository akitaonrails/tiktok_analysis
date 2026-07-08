package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153830g8D {
    public static final C1153840g8E Companion;
    public static final /* synthetic */ EnumC1153830g8D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153830g8D SOCIAL_AVATAR_STATIC_BG;
    public static final EnumC1153830g8D SOCIAL_AVATAR_STATIC_WITHOUT_BG;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1153830g8D> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0g8E] */
    static {
        EnumC1153830g8D enumC1153830g8D = new EnumC1153830g8D("SOCIAL_AVATAR_STATIC_BG", 0, 7);
        SOCIAL_AVATAR_STATIC_BG = enumC1153830g8D;
        EnumC1153830g8D enumC1153830g8D2 = new EnumC1153830g8D("SOCIAL_AVATAR_STATIC_WITHOUT_BG", 1, 9);
        SOCIAL_AVATAR_STATIC_WITHOUT_BG = enumC1153830g8D2;
        EnumC1153830g8D[] enumC1153830g8DArr = {enumC1153830g8D, enumC1153830g8D2};
        LLILLJJLI = enumC1153830g8DArr;
        LLILLL = new C2254308sP(enumC1153830g8DArr);
        Companion = new Object() { // from class: X.0g8E
        };
    }

    public static EnumC1153830g8D[] values() {
        return (EnumC1153830g8D[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1153830g8D valueOf(String str) {
        return (EnumC1153830g8D) C08FF.LIZ(EnumC1153830g8D.class, str);
    }

    public EnumC1153830g8D(String str, int i, int i2) {
        this.LL = i2;
    }
}
