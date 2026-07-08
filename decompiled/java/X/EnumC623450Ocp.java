package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ocp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC623450Ocp {
    public static final /* synthetic */ EnumC623450Ocp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC623450Ocp LOADMORE_BLOCK;
    public static final EnumC623450Ocp LOAD_EMPTY;
    public static final EnumC623450Ocp PLAY_BLOCK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC623450Ocp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC623450Ocp enumC623450Ocp = new EnumC623450Ocp("LOAD_EMPTY", 0, "load_empty");
        LOAD_EMPTY = enumC623450Ocp;
        EnumC623450Ocp enumC623450Ocp2 = new EnumC623450Ocp("PLAY_BLOCK", 1, "play_block");
        PLAY_BLOCK = enumC623450Ocp2;
        EnumC623450Ocp enumC623450Ocp3 = new EnumC623450Ocp("LOADMORE_BLOCK", 2, "loadmore_block");
        LOADMORE_BLOCK = enumC623450Ocp3;
        EnumC623450Ocp[] enumC623450OcpArr = {enumC623450Ocp, enumC623450Ocp2, enumC623450Ocp3};
        LLILLJJLI = enumC623450OcpArr;
        LLILLL = new C2254308sP(enumC623450OcpArr);
    }

    public static EnumC623450Ocp[] values() {
        return (EnumC623450Ocp[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC623450Ocp valueOf(String str) {
        return (EnumC623450Ocp) C08FF.LIZ(EnumC623450Ocp.class, str);
    }

    public EnumC623450Ocp(String str, int i, String str2) {
        this.LL = str2;
    }
}
