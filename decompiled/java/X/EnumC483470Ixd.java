package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ixd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC483470Ixd {
    public static final EnumC483470Ixd CLOSED;
    public static final /* synthetic */ EnumC483470Ixd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC483470Ixd OPENED;

    public static InterfaceC2044707zh<EnumC483470Ixd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC483470Ixd enumC483470Ixd = new EnumC483470Ixd("OPENED", 0);
        OPENED = enumC483470Ixd;
        EnumC483470Ixd enumC483470Ixd2 = new EnumC483470Ixd("CLOSED", 1);
        CLOSED = enumC483470Ixd2;
        EnumC483470Ixd[] enumC483470IxdArr = {enumC483470Ixd, enumC483470Ixd2};
        LL = enumC483470IxdArr;
        LLILLJJLI = new C2254308sP(enumC483470IxdArr);
    }

    public static EnumC483470Ixd[] values() {
        return (EnumC483470Ixd[]) LL.clone();
    }

    public static EnumC483470Ixd valueOf(String str) {
        return (EnumC483470Ixd) C08FF.LIZ(EnumC483470Ixd.class, str);
    }

    public EnumC483470Ixd(String str, int i) {
    }
}
