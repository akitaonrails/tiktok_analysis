package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ucP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1710710ucP {
    public static final EnumC1710710ucP DISMISS;
    public static final /* synthetic */ EnumC1710710ucP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1710710ucP POPUP;

    public static InterfaceC2044707zh<EnumC1710710ucP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1710710ucP enumC1710710ucP = new EnumC1710710ucP("POPUP", 0);
        POPUP = enumC1710710ucP;
        EnumC1710710ucP enumC1710710ucP2 = new EnumC1710710ucP("DISMISS", 1);
        DISMISS = enumC1710710ucP2;
        EnumC1710710ucP[] enumC1710710ucPArr = {enumC1710710ucP, enumC1710710ucP2};
        LL = enumC1710710ucPArr;
        LLILLJJLI = new C2254308sP(enumC1710710ucPArr);
    }

    public static EnumC1710710ucP[] values() {
        return (EnumC1710710ucP[]) LL.clone();
    }

    public static EnumC1710710ucP valueOf(String str) {
        return (EnumC1710710ucP) C08FF.LIZ(EnumC1710710ucP.class, str);
    }

    public EnumC1710710ucP(String str, int i) {
    }
}
