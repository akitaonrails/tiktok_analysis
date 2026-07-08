package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1014800cVy {
    public static final EnumC1014800cVy INITIAL;
    public static final /* synthetic */ EnumC1014800cVy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1014800cVy LOAD_FAILED;
    public static final EnumC1014800cVy LOAD_SUCCESS;
    public static final EnumC1014800cVy NOW_RENDERING;
    public static final EnumC1014800cVy PRERENDERING;

    public static InterfaceC2044707zh<EnumC1014800cVy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1014800cVy enumC1014800cVy = new EnumC1014800cVy("INITIAL", 0);
        INITIAL = enumC1014800cVy;
        EnumC1014800cVy enumC1014800cVy2 = new EnumC1014800cVy("PRERENDERING", 1);
        PRERENDERING = enumC1014800cVy2;
        EnumC1014800cVy enumC1014800cVy3 = new EnumC1014800cVy("NOW_RENDERING", 2);
        NOW_RENDERING = enumC1014800cVy3;
        EnumC1014800cVy enumC1014800cVy4 = new EnumC1014800cVy("LOAD_SUCCESS", 3);
        LOAD_SUCCESS = enumC1014800cVy4;
        EnumC1014800cVy enumC1014800cVy5 = new EnumC1014800cVy("LOAD_FAILED", 4);
        LOAD_FAILED = enumC1014800cVy5;
        EnumC1014800cVy[] enumC1014800cVyArr = {enumC1014800cVy, enumC1014800cVy2, enumC1014800cVy3, enumC1014800cVy4, enumC1014800cVy5};
        LL = enumC1014800cVyArr;
        LLILLJJLI = new C2254308sP(enumC1014800cVyArr);
    }

    public static EnumC1014800cVy[] values() {
        return (EnumC1014800cVy[]) LL.clone();
    }

    public static EnumC1014800cVy valueOf(String str) {
        return (EnumC1014800cVy) C08FF.LIZ(EnumC1014800cVy.class, str);
    }

    public EnumC1014800cVy(String str, int i) {
    }
}
