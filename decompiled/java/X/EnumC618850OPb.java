package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC618850OPb {
    public static final EnumC618850OPb EARLIER_RELEASE;
    public static final /* synthetic */ EnumC618850OPb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC618850OPb NEW_RELEASE;
    public static final EnumC618850OPb PRE_RELEASE;

    public static InterfaceC2044707zh<EnumC618850OPb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC618850OPb enumC618850OPb = new EnumC618850OPb("PRE_RELEASE", 0);
        PRE_RELEASE = enumC618850OPb;
        EnumC618850OPb enumC618850OPb2 = new EnumC618850OPb("NEW_RELEASE", 1);
        NEW_RELEASE = enumC618850OPb2;
        EnumC618850OPb enumC618850OPb3 = new EnumC618850OPb("EARLIER_RELEASE", 2);
        EARLIER_RELEASE = enumC618850OPb3;
        EnumC618850OPb[] enumC618850OPbArr = {enumC618850OPb, enumC618850OPb2, enumC618850OPb3};
        LL = enumC618850OPbArr;
        LLILLJJLI = new C2254308sP(enumC618850OPbArr);
    }

    public static EnumC618850OPb[] values() {
        return (EnumC618850OPb[]) LL.clone();
    }

    public static EnumC618850OPb valueOf(String str) {
        return (EnumC618850OPb) C08FF.LIZ(EnumC618850OPb.class, str);
    }

    public EnumC618850OPb(String str, int i) {
    }
}
