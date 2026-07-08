package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC932480aNC {
    public static final EnumC932480aNC DISABLE;
    public static final /* synthetic */ EnumC932480aNC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC932480aNC OFF;
    public static final EnumC932480aNC ON;

    public static InterfaceC2044707zh<EnumC932480aNC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC932480aNC enumC932480aNC = new EnumC932480aNC("ON", 0);
        ON = enumC932480aNC;
        EnumC932480aNC enumC932480aNC2 = new EnumC932480aNC("OFF", 1);
        OFF = enumC932480aNC2;
        EnumC932480aNC enumC932480aNC3 = new EnumC932480aNC("DISABLE", 2);
        DISABLE = enumC932480aNC3;
        EnumC932480aNC[] enumC932480aNCArr = {enumC932480aNC, enumC932480aNC2, enumC932480aNC3};
        LL = enumC932480aNCArr;
        LLILLJJLI = new C2254308sP(enumC932480aNCArr);
    }

    public static EnumC932480aNC[] values() {
        return (EnumC932480aNC[]) LL.clone();
    }

    public static EnumC932480aNC valueOf(String str) {
        return (EnumC932480aNC) C08FF.LIZ(EnumC932480aNC.class, str);
    }

    public EnumC932480aNC(String str, int i) {
    }
}
