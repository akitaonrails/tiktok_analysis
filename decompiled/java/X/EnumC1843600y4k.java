package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1843600y4k {
    public static final /* synthetic */ EnumC1843600y4k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1843600y4k ON_LOAD_MORE;
    public static final EnumC1843600y4k ON_MANUAL;
    public static final EnumC1843600y4k ON_RERANK;
    public static final EnumC1843600y4k ON_SELECTED;

    public static InterfaceC2044707zh<EnumC1843600y4k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1843600y4k enumC1843600y4k = new EnumC1843600y4k("ON_SELECTED", 0);
        ON_SELECTED = enumC1843600y4k;
        EnumC1843600y4k enumC1843600y4k2 = new EnumC1843600y4k("ON_LOAD_MORE", 1);
        ON_LOAD_MORE = enumC1843600y4k2;
        EnumC1843600y4k enumC1843600y4k3 = new EnumC1843600y4k("ON_RERANK", 2);
        ON_RERANK = enumC1843600y4k3;
        EnumC1843600y4k enumC1843600y4k4 = new EnumC1843600y4k("ON_MANUAL", 3);
        ON_MANUAL = enumC1843600y4k4;
        EnumC1843600y4k[] enumC1843600y4kArr = {enumC1843600y4k, enumC1843600y4k2, enumC1843600y4k3, enumC1843600y4k4};
        LL = enumC1843600y4kArr;
        LLILLJJLI = new C2254308sP(enumC1843600y4kArr);
    }

    public static EnumC1843600y4k[] values() {
        return (EnumC1843600y4k[]) LL.clone();
    }

    public static EnumC1843600y4k valueOf(String str) {
        return (EnumC1843600y4k) C08FF.LIZ(EnumC1843600y4k.class, str);
    }

    public EnumC1843600y4k(String str, int i) {
    }
}
