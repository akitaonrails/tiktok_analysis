package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15v9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20674115v9 {
    public static final EnumC20674115v9 INIT;
    public static final /* synthetic */ EnumC20674115v9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20674115v9 LOAD_MORE;
    public static final EnumC20674115v9 POLL;
    public static final EnumC20674115v9 REFRESH;

    public static InterfaceC2044707zh<EnumC20674115v9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20674115v9 enumC20674115v9 = new EnumC20674115v9("INIT", 0);
        INIT = enumC20674115v9;
        EnumC20674115v9 enumC20674115v92 = new EnumC20674115v9("REFRESH", 1);
        REFRESH = enumC20674115v92;
        EnumC20674115v9 enumC20674115v93 = new EnumC20674115v9("LOAD_MORE", 2);
        LOAD_MORE = enumC20674115v93;
        EnumC20674115v9 enumC20674115v94 = new EnumC20674115v9("POLL", 3);
        POLL = enumC20674115v94;
        EnumC20674115v9[] enumC20674115v9Arr = {enumC20674115v9, enumC20674115v92, enumC20674115v93, enumC20674115v94};
        LL = enumC20674115v9Arr;
        LLILLJJLI = new C2254308sP(enumC20674115v9Arr);
    }

    public static EnumC20674115v9[] values() {
        return (EnumC20674115v9[]) LL.clone();
    }

    public static EnumC20674115v9 valueOf(String str) {
        return (EnumC20674115v9) C08FF.LIZ(EnumC20674115v9.class, str);
    }

    public EnumC20674115v9(String str, int i) {
    }
}
