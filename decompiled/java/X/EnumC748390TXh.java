package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC748390TXh {
    public static final EnumC748390TXh CLICK;
    public static final /* synthetic */ EnumC748390TXh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC748390TXh REPORT;
    public static final EnumC748390TXh SHOW;

    public static InterfaceC2044707zh<EnumC748390TXh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC748390TXh enumC748390TXh = new EnumC748390TXh("SHOW", 0);
        SHOW = enumC748390TXh;
        EnumC748390TXh enumC748390TXh2 = new EnumC748390TXh("CLICK", 1);
        CLICK = enumC748390TXh2;
        EnumC748390TXh enumC748390TXh3 = new EnumC748390TXh("REPORT", 2);
        REPORT = enumC748390TXh3;
        EnumC748390TXh[] enumC748390TXhArr = {enumC748390TXh, enumC748390TXh2, enumC748390TXh3};
        LL = enumC748390TXhArr;
        LLILLJJLI = new C2254308sP(enumC748390TXhArr);
    }

    public static EnumC748390TXh[] values() {
        return (EnumC748390TXh[]) LL.clone();
    }

    public static EnumC748390TXh valueOf(String str) {
        return (EnumC748390TXh) C08FF.LIZ(EnumC748390TXh.class, str);
    }

    public EnumC748390TXh(String str, int i) {
    }
}
