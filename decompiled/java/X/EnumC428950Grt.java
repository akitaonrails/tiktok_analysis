package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Grt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC428950Grt {
    public static final EnumC428950Grt FollowFace;
    public static final /* synthetic */ EnumC428950Grt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC428950Grt Mirror;
    public static final EnumC428950Grt Reset;

    public static InterfaceC2044707zh<EnumC428950Grt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC428950Grt enumC428950Grt = new EnumC428950Grt("Mirror", 0);
        Mirror = enumC428950Grt;
        EnumC428950Grt enumC428950Grt2 = new EnumC428950Grt("Reset", 1);
        Reset = enumC428950Grt2;
        EnumC428950Grt enumC428950Grt3 = new EnumC428950Grt("FollowFace", 2);
        FollowFace = enumC428950Grt3;
        EnumC428950Grt[] enumC428950GrtArr = {enumC428950Grt, enumC428950Grt2, enumC428950Grt3};
        LL = enumC428950GrtArr;
        LLILLJJLI = new C2254308sP(enumC428950GrtArr);
    }

    public static EnumC428950Grt[] values() {
        return (EnumC428950Grt[]) LL.clone();
    }

    public static EnumC428950Grt valueOf(String str) {
        return (EnumC428950Grt) C08FF.LIZ(EnumC428950Grt.class, str);
    }

    public EnumC428950Grt(String str, int i) {
    }
}
