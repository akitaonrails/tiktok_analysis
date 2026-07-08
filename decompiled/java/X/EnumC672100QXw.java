package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672100QXw {
    public static final /* synthetic */ EnumC672100QXw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC672100QXw TTF;
    public static final EnumC672100QXw TTS;

    public static InterfaceC2044707zh<EnumC672100QXw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC672100QXw enumC672100QXw = new EnumC672100QXw("TTS", 0);
        TTS = enumC672100QXw;
        EnumC672100QXw enumC672100QXw2 = new EnumC672100QXw("TTF", 1);
        TTF = enumC672100QXw2;
        EnumC672100QXw[] enumC672100QXwArr = {enumC672100QXw, enumC672100QXw2};
        LL = enumC672100QXwArr;
        LLILLJJLI = new C2254308sP(enumC672100QXwArr);
    }

    public static EnumC672100QXw[] values() {
        return (EnumC672100QXw[]) LL.clone();
    }

    public static EnumC672100QXw valueOf(String str) {
        return (EnumC672100QXw) C08FF.LIZ(EnumC672100QXw.class, str);
    }

    public EnumC672100QXw(String str, int i) {
    }
}
