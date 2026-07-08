package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2038207ye {
    public static final /* synthetic */ EnumC2038207ye[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2038207ye PHOTO_STICKER;
    public static final EnumC2038207ye VIDEO_STICKER;

    public static InterfaceC2044707zh<EnumC2038207ye> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2038207ye enumC2038207ye = new EnumC2038207ye("VIDEO_STICKER", 0);
        VIDEO_STICKER = enumC2038207ye;
        EnumC2038207ye enumC2038207ye2 = new EnumC2038207ye("PHOTO_STICKER", 1);
        PHOTO_STICKER = enumC2038207ye2;
        EnumC2038207ye[] enumC2038207yeArr = {enumC2038207ye, enumC2038207ye2};
        LL = enumC2038207yeArr;
        LLILLJJLI = new C2254308sP(enumC2038207yeArr);
    }

    public static EnumC2038207ye[] values() {
        return (EnumC2038207ye[]) LL.clone();
    }

    public static EnumC2038207ye valueOf(String str) {
        return (EnumC2038207ye) C08FF.LIZ(EnumC2038207ye.class, str);
    }

    public EnumC2038207ye(String str, int i) {
    }
}
