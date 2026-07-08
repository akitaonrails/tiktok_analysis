package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kAP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1308950kAP {
    public static final EnumC1308950kAP ACTIVE;
    public static final /* synthetic */ EnumC1308950kAP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1308950kAP PASSIVE;

    public static InterfaceC2044707zh<EnumC1308950kAP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1308950kAP enumC1308950kAP = new EnumC1308950kAP("ACTIVE", 0);
        ACTIVE = enumC1308950kAP;
        EnumC1308950kAP enumC1308950kAP2 = new EnumC1308950kAP("PASSIVE", 1);
        PASSIVE = enumC1308950kAP2;
        EnumC1308950kAP[] enumC1308950kAPArr = {enumC1308950kAP, enumC1308950kAP2};
        LL = enumC1308950kAPArr;
        LLILLJJLI = new C2254308sP(enumC1308950kAPArr);
    }

    public static EnumC1308950kAP[] values() {
        return (EnumC1308950kAP[]) LL.clone();
    }

    public static EnumC1308950kAP valueOf(String str) {
        return (EnumC1308950kAP) C08FF.LIZ(EnumC1308950kAP.class, str);
    }

    public EnumC1308950kAP(String str, int i) {
    }
}
