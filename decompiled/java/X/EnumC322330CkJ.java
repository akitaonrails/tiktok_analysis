package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC322330CkJ {
    public static final /* synthetic */ EnumC322330CkJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC322330CkJ NOT_SET;
    public static final EnumC322330CkJ SELECTED;
    public static final EnumC322330CkJ UNSELECT;

    public static InterfaceC2044707zh<EnumC322330CkJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC322330CkJ enumC322330CkJ = new EnumC322330CkJ("NOT_SET", 0);
        NOT_SET = enumC322330CkJ;
        EnumC322330CkJ enumC322330CkJ2 = new EnumC322330CkJ("UNSELECT", 1);
        UNSELECT = enumC322330CkJ2;
        EnumC322330CkJ enumC322330CkJ3 = new EnumC322330CkJ("SELECTED", 2);
        SELECTED = enumC322330CkJ3;
        EnumC322330CkJ[] enumC322330CkJArr = {enumC322330CkJ, enumC322330CkJ2, enumC322330CkJ3};
        LL = enumC322330CkJArr;
        LLILLJJLI = new C2254308sP(enumC322330CkJArr);
    }

    public static EnumC322330CkJ[] values() {
        return (EnumC322330CkJ[]) LL.clone();
    }

    public static EnumC322330CkJ valueOf(String str) {
        return (EnumC322330CkJ) C08FF.LIZ(EnumC322330CkJ.class, str);
    }

    public EnumC322330CkJ(String str, int i) {
    }
}
