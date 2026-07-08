package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0afR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC943790afR {
    public static final EnumC943790afR FRIEND_LIVING;
    public static final EnumC943790afR FRIEND_RESERVE;
    public static final /* synthetic */ EnumC943790afR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC943790afR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC943790afR enumC943790afR = new EnumC943790afR("FRIEND_LIVING", 0);
        FRIEND_LIVING = enumC943790afR;
        EnumC943790afR enumC943790afR2 = new EnumC943790afR("FRIEND_RESERVE", 1);
        FRIEND_RESERVE = enumC943790afR2;
        EnumC943790afR[] enumC943790afRArr = {enumC943790afR, enumC943790afR2};
        LL = enumC943790afRArr;
        LLILLJJLI = new C2254308sP(enumC943790afRArr);
    }

    public static EnumC943790afR[] values() {
        return (EnumC943790afR[]) LL.clone();
    }

    public static EnumC943790afR valueOf(String str) {
        return (EnumC943790afR) C08FF.LIZ(EnumC943790afR.class, str);
    }

    public EnumC943790afR(String str, int i) {
    }
}
