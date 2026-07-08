package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC863903Zd {
    public static final EnumC863903Zd Close;
    public static final /* synthetic */ EnumC863903Zd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC863903Zd Open;

    public static InterfaceC2044707zh<EnumC863903Zd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC863903Zd enumC863903Zd = new EnumC863903Zd("Open", 0);
        Open = enumC863903Zd;
        EnumC863903Zd enumC863903Zd2 = new EnumC863903Zd("Close", 1);
        Close = enumC863903Zd2;
        EnumC863903Zd[] enumC863903ZdArr = {enumC863903Zd, enumC863903Zd2};
        LL = enumC863903ZdArr;
        LLILLJJLI = new C2254308sP(enumC863903ZdArr);
    }

    public static EnumC863903Zd[] values() {
        return (EnumC863903Zd[]) LL.clone();
    }

    public static EnumC863903Zd valueOf(String str) {
        return (EnumC863903Zd) C08FF.LIZ(EnumC863903Zd.class, str);
    }

    public EnumC863903Zd(String str, int i) {
    }
}
