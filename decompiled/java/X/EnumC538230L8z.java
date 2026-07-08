package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538230L8z {
    public static final EnumC538230L8z AI_CONTENT;
    public static final EnumC538230L8z ALL;
    public static final EnumC538230L8z LIVE_PHOTOS;
    public static final EnumC538230L8z LIVE_RECORDINGS;
    public static final /* synthetic */ EnumC538230L8z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC538230L8z MIXED;
    public static final EnumC538230L8z PHOTOS;
    public static final EnumC538230L8z VIDEOS;

    public static InterfaceC2044707zh<EnumC538230L8z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC538230L8z enumC538230L8z = new EnumC538230L8z("MIXED", 0);
        MIXED = enumC538230L8z;
        EnumC538230L8z enumC538230L8z2 = new EnumC538230L8z("ALL", 1);
        ALL = enumC538230L8z2;
        EnumC538230L8z enumC538230L8z3 = new EnumC538230L8z("VIDEOS", 2);
        VIDEOS = enumC538230L8z3;
        EnumC538230L8z enumC538230L8z4 = new EnumC538230L8z("PHOTOS", 3);
        PHOTOS = enumC538230L8z4;
        EnumC538230L8z enumC538230L8z5 = new EnumC538230L8z("LIVE_PHOTOS", 4);
        LIVE_PHOTOS = enumC538230L8z5;
        EnumC538230L8z enumC538230L8z6 = new EnumC538230L8z("AI_CONTENT", 5);
        AI_CONTENT = enumC538230L8z6;
        EnumC538230L8z enumC538230L8z7 = new EnumC538230L8z("LIVE_RECORDINGS", 6);
        LIVE_RECORDINGS = enumC538230L8z7;
        EnumC538230L8z[] enumC538230L8zArr = {enumC538230L8z, enumC538230L8z2, enumC538230L8z3, enumC538230L8z4, enumC538230L8z5, enumC538230L8z6, enumC538230L8z7};
        LL = enumC538230L8zArr;
        LLILLJJLI = new C2254308sP(enumC538230L8zArr);
    }

    public static EnumC538230L8z[] values() {
        return (EnumC538230L8z[]) LL.clone();
    }

    public static EnumC538230L8z valueOf(String str) {
        return (EnumC538230L8z) C08FF.LIZ(EnumC538230L8z.class, str);
    }

    public EnumC538230L8z(String str, int i) {
    }
}
