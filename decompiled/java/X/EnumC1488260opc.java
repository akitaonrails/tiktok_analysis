package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0opc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1488260opc {
    public static final EnumC1488260opc IDLE;
    public static final /* synthetic */ EnumC1488260opc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1488260opc PAUSE;
    public static final EnumC1488260opc RESUME;

    public static InterfaceC2044707zh<EnumC1488260opc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1488260opc enumC1488260opc = new EnumC1488260opc("IDLE", 0);
        IDLE = enumC1488260opc;
        EnumC1488260opc enumC1488260opc2 = new EnumC1488260opc("PAUSE", 1);
        PAUSE = enumC1488260opc2;
        EnumC1488260opc enumC1488260opc3 = new EnumC1488260opc("RESUME", 2);
        RESUME = enumC1488260opc3;
        EnumC1488260opc[] enumC1488260opcArr = {enumC1488260opc, enumC1488260opc2, enumC1488260opc3};
        LL = enumC1488260opcArr;
        LLILLJJLI = new C2254308sP(enumC1488260opcArr);
    }

    public static EnumC1488260opc[] values() {
        return (EnumC1488260opc[]) LL.clone();
    }

    public static EnumC1488260opc valueOf(String str) {
        return (EnumC1488260opc) C08FF.LIZ(EnumC1488260opc.class, str);
    }

    public EnumC1488260opc(String str, int i) {
    }
}
