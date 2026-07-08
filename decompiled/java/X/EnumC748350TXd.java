package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC748350TXd {
    public static final EnumC748350TXd DISK;
    public static final /* synthetic */ EnumC748350TXd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC748350TXd MEMORY;

    public static InterfaceC2044707zh<EnumC748350TXd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC748350TXd enumC748350TXd = new EnumC748350TXd("MEMORY", 0);
        MEMORY = enumC748350TXd;
        EnumC748350TXd enumC748350TXd2 = new EnumC748350TXd("DISK", 1);
        DISK = enumC748350TXd2;
        EnumC748350TXd[] enumC748350TXdArr = {enumC748350TXd, enumC748350TXd2};
        LL = enumC748350TXdArr;
        LLILLJJLI = new C2254308sP(enumC748350TXdArr);
    }

    public static EnumC748350TXd[] values() {
        return (EnumC748350TXd[]) LL.clone();
    }

    public static EnumC748350TXd valueOf(String str) {
        return (EnumC748350TXd) C08FF.LIZ(EnumC748350TXd.class, str);
    }

    public EnumC748350TXd(String str, int i) {
    }
}
