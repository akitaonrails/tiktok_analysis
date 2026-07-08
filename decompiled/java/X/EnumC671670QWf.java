package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671670QWf {
    public static final EnumC671670QWf AI;
    public static final /* synthetic */ EnumC671670QWf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC671670QWf NORMAL;

    public static InterfaceC2044707zh<EnumC671670QWf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC671670QWf enumC671670QWf = new EnumC671670QWf("NORMAL", 0);
        NORMAL = enumC671670QWf;
        EnumC671670QWf enumC671670QWf2 = new EnumC671670QWf("AI", 1);
        AI = enumC671670QWf2;
        EnumC671670QWf[] enumC671670QWfArr = {enumC671670QWf, enumC671670QWf2};
        LL = enumC671670QWfArr;
        LLILLJJLI = new C2254308sP(enumC671670QWfArr);
    }

    public static EnumC671670QWf[] values() {
        return (EnumC671670QWf[]) LL.clone();
    }

    public static EnumC671670QWf valueOf(String str) {
        return (EnumC671670QWf) C08FF.LIZ(EnumC671670QWf.class, str);
    }

    public EnumC671670QWf(String str, int i) {
    }
}
