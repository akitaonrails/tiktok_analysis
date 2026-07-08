package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Psp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC658850Psp {
    public static final EnumC658850Psp BUFFERING;
    public static final /* synthetic */ EnumC658850Psp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC658850Psp PLAYING;
    public static final EnumC658850Psp STOPPED;

    public static InterfaceC2044707zh<EnumC658850Psp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC658850Psp enumC658850Psp = new EnumC658850Psp("STOPPED", 0);
        STOPPED = enumC658850Psp;
        EnumC658850Psp enumC658850Psp2 = new EnumC658850Psp("BUFFERING", 1);
        BUFFERING = enumC658850Psp2;
        EnumC658850Psp enumC658850Psp3 = new EnumC658850Psp("PLAYING", 2);
        PLAYING = enumC658850Psp3;
        EnumC658850Psp[] enumC658850PspArr = {enumC658850Psp, enumC658850Psp2, enumC658850Psp3};
        LL = enumC658850PspArr;
        LLILLJJLI = new C2254308sP(enumC658850PspArr);
    }

    public static EnumC658850Psp[] values() {
        return (EnumC658850Psp[]) LL.clone();
    }

    public static EnumC658850Psp valueOf(String str) {
        return (EnumC658850Psp) C08FF.LIZ(EnumC658850Psp.class, str);
    }

    public EnumC658850Psp(String str, int i) {
    }
}
