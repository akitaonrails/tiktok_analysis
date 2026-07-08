package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1995507rl {
    public static final EnumC1995507rl BELOW_GRABBER;
    public static final EnumC1995507rl IMMERSIVE_BACKGROUND;
    public static final /* synthetic */ EnumC1995507rl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1995507rl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1995507rl enumC1995507rl = new EnumC1995507rl("BELOW_GRABBER", 0);
        BELOW_GRABBER = enumC1995507rl;
        EnumC1995507rl enumC1995507rl2 = new EnumC1995507rl("IMMERSIVE_BACKGROUND", 1);
        IMMERSIVE_BACKGROUND = enumC1995507rl2;
        EnumC1995507rl[] enumC1995507rlArr = {enumC1995507rl, enumC1995507rl2};
        LL = enumC1995507rlArr;
        LLILLJJLI = new C2254308sP(enumC1995507rlArr);
    }

    public static EnumC1995507rl[] values() {
        return (EnumC1995507rl[]) LL.clone();
    }

    public static EnumC1995507rl valueOf(String str) {
        return (EnumC1995507rl) C08FF.LIZ(EnumC1995507rl.class, str);
    }

    public EnumC1995507rl(String str, int i) {
    }
}
