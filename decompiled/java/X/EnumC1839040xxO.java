package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1839040xxO {
    public static final /* synthetic */ EnumC1839040xxO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1839040xxO LOADING;
    public static final EnumC1839040xxO PAUSED;
    public static final EnumC1839040xxO PLAYING;

    public static InterfaceC2044707zh<EnumC1839040xxO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1839040xxO enumC1839040xxO = new EnumC1839040xxO("PAUSED", 0);
        PAUSED = enumC1839040xxO;
        EnumC1839040xxO enumC1839040xxO2 = new EnumC1839040xxO("PLAYING", 1);
        PLAYING = enumC1839040xxO2;
        EnumC1839040xxO enumC1839040xxO3 = new EnumC1839040xxO("LOADING", 2);
        LOADING = enumC1839040xxO3;
        EnumC1839040xxO[] enumC1839040xxOArr = {enumC1839040xxO, enumC1839040xxO2, enumC1839040xxO3};
        LL = enumC1839040xxOArr;
        LLILLJJLI = new C2254308sP(enumC1839040xxOArr);
    }

    public static EnumC1839040xxO[] values() {
        return (EnumC1839040xxO[]) LL.clone();
    }

    public static EnumC1839040xxO valueOf(String str) {
        return (EnumC1839040xxO) C08FF.LIZ(EnumC1839040xxO.class, str);
    }

    public EnumC1839040xxO(String str, int i) {
    }
}
