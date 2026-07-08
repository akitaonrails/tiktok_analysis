package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778800wOE {
    public static final /* synthetic */ EnumC1778800wOE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778800wOE NET_ERR;
    public static final EnumC1778800wOE REQ_ERR;
    public static final EnumC1778800wOE SUCCESS;

    public static InterfaceC2044707zh<EnumC1778800wOE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778800wOE enumC1778800wOE = new EnumC1778800wOE("SUCCESS", 0);
        SUCCESS = enumC1778800wOE;
        EnumC1778800wOE enumC1778800wOE2 = new EnumC1778800wOE("NET_ERR", 1);
        NET_ERR = enumC1778800wOE2;
        EnumC1778800wOE enumC1778800wOE3 = new EnumC1778800wOE("REQ_ERR", 2);
        REQ_ERR = enumC1778800wOE3;
        EnumC1778800wOE[] enumC1778800wOEArr = {enumC1778800wOE, enumC1778800wOE2, enumC1778800wOE3};
        LL = enumC1778800wOEArr;
        LLILLJJLI = new C2254308sP(enumC1778800wOEArr);
    }

    public static EnumC1778800wOE[] values() {
        return (EnumC1778800wOE[]) LL.clone();
    }

    public static EnumC1778800wOE valueOf(String str) {
        return (EnumC1778800wOE) C08FF.LIZ(EnumC1778800wOE.class, str);
    }

    public EnumC1778800wOE(String str, int i) {
    }
}
