package X;

import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1738320vKw {
    public static final EnumC1738320vKw Album;
    public static final EnumC1738320vKw Camera;
    public static final C1738330vKx Companion;
    public static final EnumC1738320vKw DRAW;
    public static final /* synthetic */ EnumC1738320vKw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1738320vKw RESOURCE_PACKAGE_FLIP_Y;
    public static final EnumC1738320vKw ResourcePackage;
    public static final EnumC1738320vKw THIRD_PARTY;
    public static final EnumC1738320vKw Text;
    public static final EnumC1738320vKw UnKnow;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1738320vKw> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0vKx] */
    static {
        EnumC1738320vKw enumC1738320vKw = new EnumC1738320vKw("UnKnow", 0, -1);
        UnKnow = enumC1738320vKw;
        EnumC1738320vKw enumC1738320vKw2 = new EnumC1738320vKw("Album", 1, 0);
        Album = enumC1738320vKw2;
        EnumC1738320vKw enumC1738320vKw3 = new EnumC1738320vKw("ResourcePackage", 2, 1);
        ResourcePackage = enumC1738320vKw3;
        EnumC1738320vKw enumC1738320vKw4 = new EnumC1738320vKw("Text", 3, 2);
        Text = enumC1738320vKw4;
        EnumC1738320vKw enumC1738320vKw5 = new EnumC1738320vKw("DRAW", 4, 3);
        DRAW = enumC1738320vKw5;
        EnumC1738320vKw enumC1738320vKw6 = new EnumC1738320vKw("Camera", 5, 4);
        Camera = enumC1738320vKw6;
        EnumC1738320vKw enumC1738320vKw7 = new EnumC1738320vKw("THIRD_PARTY", 6, 5);
        THIRD_PARTY = enumC1738320vKw7;
        EnumC1738320vKw enumC1738320vKw8 = new EnumC1738320vKw("RESOURCE_PACKAGE_FLIP_Y", 7, 6);
        RESOURCE_PACKAGE_FLIP_Y = enumC1738320vKw8;
        EnumC1738320vKw[] enumC1738320vKwArr = {enumC1738320vKw, enumC1738320vKw2, enumC1738320vKw3, enumC1738320vKw4, enumC1738320vKw5, enumC1738320vKw6, enumC1738320vKw7, enumC1738320vKw8};
        LLILLJJLI = enumC1738320vKwArr;
        LLILLL = new C2254308sP(enumC1738320vKwArr);
        Companion = new Object() { // from class: X.0vKx
            public static EnumC1738320vKw LIZ(int i) {
                for (EnumC1738320vKw enumC1738320vKw9 : EnumC1738320vKw.values()) {
                    if (enumC1738320vKw9.getValue() == i) {
                        return enumC1738320vKw9;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        };
    }

    public static EnumC1738320vKw[] values() {
        return (EnumC1738320vKw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1738320vKw valueOf(String str) {
        return (EnumC1738320vKw) C08FF.LIZ(EnumC1738320vKw.class, str);
    }

    public EnumC1738320vKw(String str, int i, int i2) {
        this.LL = i2;
    }
}
