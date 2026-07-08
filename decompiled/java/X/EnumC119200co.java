package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC119200co {
    public static final EnumC119200co CAMERA_BUTTON;
    public static final EnumC119200co FAVORITE;
    public static final /* synthetic */ EnumC119200co[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC119200co RECENTLY;
    public static final EnumC119200co TRENDING;

    public static InterfaceC2044707zh<EnumC119200co> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC119200co enumC119200co = new EnumC119200co("FAVORITE", 0);
        FAVORITE = enumC119200co;
        EnumC119200co enumC119200co2 = new EnumC119200co("RECENTLY", 1);
        RECENTLY = enumC119200co2;
        EnumC119200co enumC119200co3 = new EnumC119200co("CAMERA_BUTTON", 2);
        CAMERA_BUTTON = enumC119200co3;
        EnumC119200co enumC119200co4 = new EnumC119200co("TRENDING", 3);
        TRENDING = enumC119200co4;
        EnumC119200co[] enumC119200coArr = {enumC119200co, enumC119200co2, enumC119200co3, enumC119200co4};
        LL = enumC119200coArr;
        LLILLJJLI = new C2254308sP(enumC119200coArr);
    }

    public static EnumC119200co[] values() {
        return (EnumC119200co[]) LL.clone();
    }

    public static EnumC119200co valueOf(String str) {
        return (EnumC119200co) C08FF.LIZ(EnumC119200co.class, str);
    }

    public EnumC119200co(String str, int i) {
    }
}
