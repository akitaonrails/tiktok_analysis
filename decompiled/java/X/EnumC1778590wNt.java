package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778590wNt {
    public static final /* synthetic */ EnumC1778590wNt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778590wNt MULTI_IMAGE_ITEM;
    public static final EnumC1778590wNt VIDEO;

    public static InterfaceC2044707zh<EnumC1778590wNt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778590wNt enumC1778590wNt = new EnumC1778590wNt("VIDEO", 0);
        VIDEO = enumC1778590wNt;
        EnumC1778590wNt enumC1778590wNt2 = new EnumC1778590wNt("MULTI_IMAGE_ITEM", 1);
        MULTI_IMAGE_ITEM = enumC1778590wNt2;
        EnumC1778590wNt[] enumC1778590wNtArr = {enumC1778590wNt, enumC1778590wNt2};
        LL = enumC1778590wNtArr;
        LLILLJJLI = new C2254308sP(enumC1778590wNtArr);
    }

    public static EnumC1778590wNt[] values() {
        return (EnumC1778590wNt[]) LL.clone();
    }

    public static EnumC1778590wNt valueOf(String str) {
        return (EnumC1778590wNt) C08FF.LIZ(EnumC1778590wNt.class, str);
    }

    public EnumC1778590wNt(String str, int i) {
    }
}
