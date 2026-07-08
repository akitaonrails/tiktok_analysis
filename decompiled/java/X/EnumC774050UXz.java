package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC774050UXz {
    public static final EnumC774050UXz AUDIENCE_HORIZONTAL;
    public static final EnumC774050UXz AUDIENCE_VERTICAL;
    public static final /* synthetic */ EnumC774050UXz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC774050UXz NONE;
    public static final EnumC774050UXz SOLO_CREATOR;

    public static InterfaceC2044707zh<EnumC774050UXz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC774050UXz enumC774050UXz = new EnumC774050UXz("NONE", 0);
        NONE = enumC774050UXz;
        EnumC774050UXz enumC774050UXz2 = new EnumC774050UXz("AUDIENCE_HORIZONTAL", 1);
        AUDIENCE_HORIZONTAL = enumC774050UXz2;
        EnumC774050UXz enumC774050UXz3 = new EnumC774050UXz("SOLO_CREATOR", 2);
        SOLO_CREATOR = enumC774050UXz3;
        EnumC774050UXz enumC774050UXz4 = new EnumC774050UXz("AUDIENCE_VERTICAL", 3);
        AUDIENCE_VERTICAL = enumC774050UXz4;
        EnumC774050UXz[] enumC774050UXzArr = {enumC774050UXz, enumC774050UXz2, enumC774050UXz3, enumC774050UXz4};
        LL = enumC774050UXzArr;
        LLILLJJLI = new C2254308sP(enumC774050UXzArr);
    }

    public static EnumC774050UXz[] values() {
        return (EnumC774050UXz[]) LL.clone();
    }

    public final boolean isHorizontal() {
        return this == AUDIENCE_HORIZONTAL;
    }

    public final boolean isInViewerWishesCreator() {
        return this == SOLO_CREATOR;
    }

    public final boolean isVertical() {
        return this == SOLO_CREATOR || this == AUDIENCE_VERTICAL;
    }

    public final boolean isViewerWishAudience() {
        return this == AUDIENCE_HORIZONTAL || this == AUDIENCE_VERTICAL;
    }

    public final boolean isViewerWishes() {
        return this != NONE;
    }

    public static EnumC774050UXz valueOf(String str) {
        return (EnumC774050UXz) C08FF.LIZ(EnumC774050UXz.class, str);
    }

    public EnumC774050UXz(String str, int i) {
    }
}
