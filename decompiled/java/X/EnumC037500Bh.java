package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC037500Bh {
    public static final EnumC037500Bh END;
    public static final /* synthetic */ EnumC037500Bh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC037500Bh LOADING;

    public static InterfaceC2044707zh<EnumC037500Bh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC037500Bh enumC037500Bh = new EnumC037500Bh("LOADING", 0);
        LOADING = enumC037500Bh;
        EnumC037500Bh enumC037500Bh2 = new EnumC037500Bh("END", 1);
        END = enumC037500Bh2;
        EnumC037500Bh[] enumC037500BhArr = {enumC037500Bh, enumC037500Bh2};
        LL = enumC037500BhArr;
        LLILLJJLI = new C2254308sP(enumC037500BhArr);
    }

    public static EnumC037500Bh[] values() {
        return (EnumC037500Bh[]) LL.clone();
    }

    public static EnumC037500Bh valueOf(String str) {
        return (EnumC037500Bh) C08FF.LIZ(EnumC037500Bh.class, str);
    }

    public EnumC037500Bh(String str, int i) {
    }
}
