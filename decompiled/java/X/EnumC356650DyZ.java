package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356650DyZ {
    public static final EnumC356650DyZ EFFECT;
    public static final /* synthetic */ EnumC356650DyZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356650DyZ SONG;

    public static InterfaceC2044707zh<EnumC356650DyZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356650DyZ enumC356650DyZ = new EnumC356650DyZ("SONG", 0);
        SONG = enumC356650DyZ;
        EnumC356650DyZ enumC356650DyZ2 = new EnumC356650DyZ("EFFECT", 1);
        EFFECT = enumC356650DyZ2;
        EnumC356650DyZ[] enumC356650DyZArr = {enumC356650DyZ, enumC356650DyZ2};
        LL = enumC356650DyZArr;
        LLILLJJLI = new C2254308sP(enumC356650DyZArr);
    }

    public static EnumC356650DyZ[] values() {
        return (EnumC356650DyZ[]) LL.clone();
    }

    public static EnumC356650DyZ valueOf(String str) {
        return (EnumC356650DyZ) C08FF.LIZ(EnumC356650DyZ.class, str);
    }

    public EnumC356650DyZ(String str, int i) {
    }
}
