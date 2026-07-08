package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006907tb {
    public static final EnumC2006907tb DEFAULT_VIDEO_AVATAR;
    public static final /* synthetic */ EnumC2006907tb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2006907tb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2006907tb enumC2006907tb = new EnumC2006907tb();
        DEFAULT_VIDEO_AVATAR = enumC2006907tb;
        EnumC2006907tb[] enumC2006907tbArr = {enumC2006907tb};
        LL = enumC2006907tbArr;
        LLILLJJLI = new C2254308sP(enumC2006907tbArr);
    }

    public static EnumC2006907tb[] values() {
        return (EnumC2006907tb[]) LL.clone();
    }

    public static EnumC2006907tb valueOf(String str) {
        return (EnumC2006907tb) C08FF.LIZ(EnumC2006907tb.class, str);
    }
}
