package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC708980RrU {
    public static final EnumC708980RrU JUMP_APP;
    public static final /* synthetic */ EnumC708980RrU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC708980RrU THIRD_WEB;

    public static InterfaceC2044707zh<EnumC708980RrU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC708980RrU enumC708980RrU = new EnumC708980RrU("THIRD_WEB", 0);
        THIRD_WEB = enumC708980RrU;
        EnumC708980RrU enumC708980RrU2 = new EnumC708980RrU("JUMP_APP", 1);
        JUMP_APP = enumC708980RrU2;
        EnumC708980RrU[] enumC708980RrUArr = {enumC708980RrU, enumC708980RrU2};
        LL = enumC708980RrUArr;
        LLILLJJLI = new C2254308sP(enumC708980RrUArr);
    }

    public static EnumC708980RrU[] values() {
        return (EnumC708980RrU[]) LL.clone();
    }

    public static EnumC708980RrU valueOf(String str) {
        return (EnumC708980RrU) C08FF.LIZ(EnumC708980RrU.class, str);
    }

    public EnumC708980RrU(String str, int i) {
    }
}
