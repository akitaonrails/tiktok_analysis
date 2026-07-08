package X;

/* JADX INFO: renamed from: X.0kFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311900kFA {
    public static EnumC1311910kFB LIZ(String str) {
        EnumC1311910kFB enumC1311910kFB = EnumC1311910kFB.CONTAIN;
        if ("cover".equals(str)) {
            return EnumC1311910kFB.COVER;
        }
        if ("center".equals(str)) {
            return EnumC1311910kFB.CENTER;
        }
        if ("fill".equals(str)) {
            return EnumC1311910kFB.FILL;
        }
        if (!"scale-down".equals(str)) {
            return enumC1311910kFB;
        }
        return EnumC1311910kFB.SCALE_DOWN;
    }
}
