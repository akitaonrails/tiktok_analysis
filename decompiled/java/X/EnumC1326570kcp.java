package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1326570kcp {
    public static final EnumC1326570kcp FIRST_ENTER_REFRESHING;
    public static final EnumC1326570kcp IDLE;
    public static final /* synthetic */ EnumC1326570kcp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1326570kcp PULL_TO_REFRESHING;

    public static InterfaceC2044707zh<EnumC1326570kcp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1326570kcp enumC1326570kcp = new EnumC1326570kcp("IDLE", 0);
        IDLE = enumC1326570kcp;
        EnumC1326570kcp enumC1326570kcp2 = new EnumC1326570kcp("FIRST_ENTER_REFRESHING", 1);
        FIRST_ENTER_REFRESHING = enumC1326570kcp2;
        EnumC1326570kcp enumC1326570kcp3 = new EnumC1326570kcp("PULL_TO_REFRESHING", 2);
        PULL_TO_REFRESHING = enumC1326570kcp3;
        EnumC1326570kcp[] enumC1326570kcpArr = {enumC1326570kcp, enumC1326570kcp2, enumC1326570kcp3};
        LL = enumC1326570kcpArr;
        LLILLJJLI = new C2254308sP(enumC1326570kcpArr);
    }

    public static EnumC1326570kcp[] values() {
        return (EnumC1326570kcp[]) LL.clone();
    }

    public static EnumC1326570kcp valueOf(String str) {
        return (EnumC1326570kcp) C08FF.LIZ(EnumC1326570kcp.class, str);
    }

    public EnumC1326570kcp(String str, int i) {
    }
}
