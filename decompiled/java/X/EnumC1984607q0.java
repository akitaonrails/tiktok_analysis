package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07q0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1984607q0 {
    public static final EnumC1984607q0 ATOM_ANIMATION_PATH;
    public static final /* synthetic */ EnumC1984607q0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1984607q0 STICKER_ANIMATION_IN_PATH;
    public static final EnumC1984607q0 STICKER_ANIMATION_OUT_PATH;

    public static InterfaceC2044707zh<EnumC1984607q0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1984607q0 enumC1984607q0 = new EnumC1984607q0("ATOM_ANIMATION_PATH", 0);
        ATOM_ANIMATION_PATH = enumC1984607q0;
        EnumC1984607q0 enumC1984607q02 = new EnumC1984607q0("STICKER_ANIMATION_IN_PATH", 1);
        STICKER_ANIMATION_IN_PATH = enumC1984607q02;
        EnumC1984607q0 enumC1984607q03 = new EnumC1984607q0("STICKER_ANIMATION_OUT_PATH", 2);
        STICKER_ANIMATION_OUT_PATH = enumC1984607q03;
        EnumC1984607q0[] enumC1984607q0Arr = {enumC1984607q0, enumC1984607q02, enumC1984607q03};
        LL = enumC1984607q0Arr;
        LLILLJJLI = new C2254308sP(enumC1984607q0Arr);
    }

    public static EnumC1984607q0[] values() {
        return (EnumC1984607q0[]) LL.clone();
    }

    public static EnumC1984607q0 valueOf(String str) {
        return (EnumC1984607q0) C08FF.LIZ(EnumC1984607q0.class, str);
    }

    public EnumC1984607q0(String str, int i) {
    }
}
