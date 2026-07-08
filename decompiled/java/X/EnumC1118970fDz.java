package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1118970fDz {
    public static final C1119010fE3 Companion;
    public static final /* synthetic */ EnumC1118970fDz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1118970fDz RANK_SWITCH_STATUS_HIDE;
    public static final EnumC1118970fDz RANK_SWITCH_STATUS_OFF;
    public static final EnumC1118970fDz RANK_SWITCH_STATUS_ON;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1118970fDz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1118970fDz enumC1118970fDz = new EnumC1118970fDz("RANK_SWITCH_STATUS_HIDE", 0, 0L);
        RANK_SWITCH_STATUS_HIDE = enumC1118970fDz;
        EnumC1118970fDz enumC1118970fDz2 = new EnumC1118970fDz("RANK_SWITCH_STATUS_ON", 1, 1L);
        RANK_SWITCH_STATUS_ON = enumC1118970fDz2;
        EnumC1118970fDz enumC1118970fDz3 = new EnumC1118970fDz("RANK_SWITCH_STATUS_OFF", 2, 2L);
        RANK_SWITCH_STATUS_OFF = enumC1118970fDz3;
        EnumC1118970fDz[] enumC1118970fDzArr = {enumC1118970fDz, enumC1118970fDz2, enumC1118970fDz3};
        LLILLJJLI = enumC1118970fDzArr;
        LLILLL = new C2254308sP(enumC1118970fDzArr);
        Companion = new C1119010fE3();
    }

    public static EnumC1118970fDz[] values() {
        return (EnumC1118970fDz[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC1118970fDz valueOf(String str) {
        return (EnumC1118970fDz) C08FF.LIZ(EnumC1118970fDz.class, str);
    }

    public EnumC1118970fDz(String str, int i, long j) {
        this.LL = j;
    }
}
