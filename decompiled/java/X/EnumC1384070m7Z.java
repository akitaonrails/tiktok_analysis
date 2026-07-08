package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1384070m7Z {
    public static final EnumC1384070m7Z COPY;
    public static final EnumC1384070m7Z DELETE;
    public static final EnumC1384070m7Z EDIT_ASSET;
    public static final EnumC1384070m7Z EDIT_COLOR;
    public static final EnumC1384070m7Z EDIT_DISTORTION;
    public static final EnumC1384070m7Z HIDE;
    public static final /* synthetic */ EnumC1384070m7Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1384070m7Z LOCK;
    public static final EnumC1384070m7Z RENAME;
    public static final EnumC1384070m7Z REPLACE;
    public static final EnumC1384070m7Z RESET;
    public static final EnumC1384070m7Z SELECTED;
    public static final EnumC1384070m7Z SHOW;
    public static final EnumC1384070m7Z UNLOCK;

    public static InterfaceC2044707zh<EnumC1384070m7Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1384070m7Z enumC1384070m7Z = new EnumC1384070m7Z("RENAME", 0);
        RENAME = enumC1384070m7Z;
        EnumC1384070m7Z enumC1384070m7Z2 = new EnumC1384070m7Z("RESET", 1);
        RESET = enumC1384070m7Z2;
        EnumC1384070m7Z enumC1384070m7Z3 = new EnumC1384070m7Z("EDIT_ASSET", 2);
        EDIT_ASSET = enumC1384070m7Z3;
        EnumC1384070m7Z enumC1384070m7Z4 = new EnumC1384070m7Z("EDIT_COLOR", 3);
        EDIT_COLOR = enumC1384070m7Z4;
        EnumC1384070m7Z enumC1384070m7Z5 = new EnumC1384070m7Z("EDIT_DISTORTION", 4);
        EDIT_DISTORTION = enumC1384070m7Z5;
        EnumC1384070m7Z enumC1384070m7Z6 = new EnumC1384070m7Z("REPLACE", 5);
        REPLACE = enumC1384070m7Z6;
        EnumC1384070m7Z enumC1384070m7Z7 = new EnumC1384070m7Z("COPY", 6);
        COPY = enumC1384070m7Z7;
        EnumC1384070m7Z enumC1384070m7Z8 = new EnumC1384070m7Z("HIDE", 7);
        HIDE = enumC1384070m7Z8;
        EnumC1384070m7Z enumC1384070m7Z9 = new EnumC1384070m7Z("SHOW", 8);
        SHOW = enumC1384070m7Z9;
        EnumC1384070m7Z enumC1384070m7Z10 = new EnumC1384070m7Z("LOCK", 9);
        LOCK = enumC1384070m7Z10;
        EnumC1384070m7Z enumC1384070m7Z11 = new EnumC1384070m7Z("UNLOCK", 10);
        UNLOCK = enumC1384070m7Z11;
        EnumC1384070m7Z enumC1384070m7Z12 = new EnumC1384070m7Z("SELECTED", 11);
        SELECTED = enumC1384070m7Z12;
        EnumC1384070m7Z enumC1384070m7Z13 = new EnumC1384070m7Z("DELETE", 12);
        DELETE = enumC1384070m7Z13;
        EnumC1384070m7Z[] enumC1384070m7ZArr = {enumC1384070m7Z, enumC1384070m7Z2, enumC1384070m7Z3, enumC1384070m7Z4, enumC1384070m7Z5, enumC1384070m7Z6, enumC1384070m7Z7, enumC1384070m7Z8, enumC1384070m7Z9, enumC1384070m7Z10, enumC1384070m7Z11, enumC1384070m7Z12, enumC1384070m7Z13};
        LL = enumC1384070m7ZArr;
        LLILLJJLI = new C2254308sP(enumC1384070m7ZArr);
    }

    public static EnumC1384070m7Z[] values() {
        return (EnumC1384070m7Z[]) LL.clone();
    }

    public static EnumC1384070m7Z valueOf(String str) {
        return (EnumC1384070m7Z) C08FF.LIZ(EnumC1384070m7Z.class, str);
    }

    public EnumC1384070m7Z(String str, int i) {
    }
}
