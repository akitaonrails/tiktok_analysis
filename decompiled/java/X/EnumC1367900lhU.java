package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1367900lhU {
    public static final EnumC1367900lhU ERROR;
    public static final EnumC1367900lhU INIT;
    public static final /* synthetic */ EnumC1367900lhU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1367900lhU LOADED;
    public static final EnumC1367900lhU LOADING;

    public static InterfaceC2044707zh<EnumC1367900lhU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1367900lhU enumC1367900lhU = new EnumC1367900lhU("INIT", 0);
        INIT = enumC1367900lhU;
        EnumC1367900lhU enumC1367900lhU2 = new EnumC1367900lhU("LOADING", 1);
        LOADING = enumC1367900lhU2;
        EnumC1367900lhU enumC1367900lhU3 = new EnumC1367900lhU("ERROR", 2);
        ERROR = enumC1367900lhU3;
        EnumC1367900lhU enumC1367900lhU4 = new EnumC1367900lhU("LOADED", 3);
        LOADED = enumC1367900lhU4;
        EnumC1367900lhU[] enumC1367900lhUArr = {enumC1367900lhU, enumC1367900lhU2, enumC1367900lhU3, enumC1367900lhU4};
        LL = enumC1367900lhUArr;
        LLILLJJLI = new C2254308sP(enumC1367900lhUArr);
    }

    public static EnumC1367900lhU[] values() {
        return (EnumC1367900lhU[]) LL.clone();
    }

    public static EnumC1367900lhU valueOf(String str) {
        return (EnumC1367900lhU) C08FF.LIZ(EnumC1367900lhU.class, str);
    }

    public EnumC1367900lhU(String str, int i) {
    }
}
