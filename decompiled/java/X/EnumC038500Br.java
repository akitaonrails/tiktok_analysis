package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC038500Br {
    public static final EnumC038500Br BNPL;
    public static final /* synthetic */ EnumC038500Br[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC038500Br WALLET;

    public static InterfaceC2044707zh<EnumC038500Br> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC038500Br enumC038500Br = new EnumC038500Br("BNPL", 0);
        BNPL = enumC038500Br;
        EnumC038500Br enumC038500Br2 = new EnumC038500Br("WALLET", 1);
        WALLET = enumC038500Br2;
        EnumC038500Br[] enumC038500BrArr = {enumC038500Br, enumC038500Br2};
        LL = enumC038500BrArr;
        LLILLJJLI = new C2254308sP(enumC038500BrArr);
    }

    public static EnumC038500Br[] values() {
        return (EnumC038500Br[]) LL.clone();
    }

    public static EnumC038500Br valueOf(String str) {
        return (EnumC038500Br) C08FF.LIZ(EnumC038500Br.class, str);
    }

    public EnumC038500Br(String str, int i) {
    }
}
