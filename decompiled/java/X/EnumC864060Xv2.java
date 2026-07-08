package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC864060Xv2 {
    public static final /* synthetic */ EnumC864060Xv2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC864060Xv2 RUNNING;
    public static final EnumC864060Xv2 STOPPED;

    public static InterfaceC2044707zh<EnumC864060Xv2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC864060Xv2 enumC864060Xv2 = new EnumC864060Xv2("STOPPED", 0);
        STOPPED = enumC864060Xv2;
        EnumC864060Xv2 enumC864060Xv22 = new EnumC864060Xv2("RUNNING", 1);
        RUNNING = enumC864060Xv22;
        EnumC864060Xv2[] enumC864060Xv2Arr = {enumC864060Xv2, enumC864060Xv22};
        LL = enumC864060Xv2Arr;
        LLILLJJLI = new C2254308sP(enumC864060Xv2Arr);
    }

    public static EnumC864060Xv2[] values() {
        return (EnumC864060Xv2[]) LL.clone();
    }

    public static EnumC864060Xv2 valueOf(String str) {
        return (EnumC864060Xv2) C08FF.LIZ(EnumC864060Xv2.class, str);
    }

    public EnumC864060Xv2(String str, int i) {
    }
}
