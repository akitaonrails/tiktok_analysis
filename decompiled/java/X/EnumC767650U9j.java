package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC767650U9j {
    public static final EnumC767650U9j BACKGROUND_INSERT;
    public static final EnumC767650U9j BGM_GUIDE;
    public static final EnumC767650U9j CO_HOST_INSERT;
    public static final EnumC767650U9j CO_HOST_SAME;
    public static final /* synthetic */ EnumC767650U9j[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC767650U9j MULTI_GUEST_INSERT;
    public static final EnumC767650U9j MULTI_GUEST_SAME;
    public static final EnumC767650U9j VIDEO_INSERT;
    public final int LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC767650U9j> getEntries() {
        return LLILZ;
    }

    static {
        EnumC767650U9j enumC767650U9j = new EnumC767650U9j("CO_HOST_SAME", 0, 2, true);
        CO_HOST_SAME = enumC767650U9j;
        EnumC767650U9j enumC767650U9j2 = new EnumC767650U9j("MULTI_GUEST_SAME", 1, 2, true);
        MULTI_GUEST_SAME = enumC767650U9j2;
        EnumC767650U9j enumC767650U9j3 = new EnumC767650U9j("VIDEO_INSERT", 2, 1, true);
        VIDEO_INSERT = enumC767650U9j3;
        EnumC767650U9j enumC767650U9j4 = new EnumC767650U9j("MULTI_GUEST_INSERT", 3, 1, true);
        MULTI_GUEST_INSERT = enumC767650U9j4;
        EnumC767650U9j enumC767650U9j5 = new EnumC767650U9j("CO_HOST_INSERT", 4, 1, true);
        CO_HOST_INSERT = enumC767650U9j5;
        EnumC767650U9j enumC767650U9j6 = new EnumC767650U9j("BGM_GUIDE", 5, 3, false);
        BGM_GUIDE = enumC767650U9j6;
        EnumC767650U9j enumC767650U9j7 = new EnumC767650U9j("BACKGROUND_INSERT", 6, 0, true);
        BACKGROUND_INSERT = enumC767650U9j7;
        EnumC767650U9j[] enumC767650U9jArr = {enumC767650U9j, enumC767650U9j2, enumC767650U9j3, enumC767650U9j4, enumC767650U9j5, enumC767650U9j6, enumC767650U9j7};
        LLILLL = enumC767650U9jArr;
        LLILZ = new C2254308sP(enumC767650U9jArr);
    }

    public static EnumC767650U9j[] values() {
        return (EnumC767650U9j[]) LLILLL.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public final boolean isSticker() {
        return this.LLILLJJLI;
    }

    public static EnumC767650U9j valueOf(String str) {
        return (EnumC767650U9j) C08FF.LIZ(EnumC767650U9j.class, str);
    }

    public EnumC767650U9j(String str, int i, int i2, boolean z) {
        this.LL = i2;
        this.LLILLJJLI = z;
    }
}
