package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1746980vYu {
    public static final EnumC1746980vYu CLOSE;
    public static final EnumC1746980vYu FAILED;
    public static final /* synthetic */ EnumC1746980vYu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1746980vYu LOADING;
    public static final EnumC1746980vYu SUCCESS;

    public static InterfaceC2044707zh<EnumC1746980vYu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1746980vYu enumC1746980vYu = new EnumC1746980vYu("LOADING", 0);
        LOADING = enumC1746980vYu;
        EnumC1746980vYu enumC1746980vYu2 = new EnumC1746980vYu("SUCCESS", 1);
        SUCCESS = enumC1746980vYu2;
        EnumC1746980vYu enumC1746980vYu3 = new EnumC1746980vYu("FAILED", 2);
        FAILED = enumC1746980vYu3;
        EnumC1746980vYu enumC1746980vYu4 = new EnumC1746980vYu("CLOSE", 3);
        CLOSE = enumC1746980vYu4;
        EnumC1746980vYu[] enumC1746980vYuArr = {enumC1746980vYu, enumC1746980vYu2, enumC1746980vYu3, enumC1746980vYu4};
        LL = enumC1746980vYuArr;
        LLILLJJLI = new C2254308sP(enumC1746980vYuArr);
    }

    public static EnumC1746980vYu[] values() {
        return (EnumC1746980vYu[]) LL.clone();
    }

    public static EnumC1746980vYu valueOf(String str) {
        return (EnumC1746980vYu) C08FF.LIZ(EnumC1746980vYu.class, str);
    }

    public EnumC1746980vYu(String str, int i) {
    }
}
