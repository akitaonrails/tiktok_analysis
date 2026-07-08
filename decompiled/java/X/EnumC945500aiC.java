package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC945500aiC {
    public static final EnumC945500aiC COUNTDOWN;
    public static final EnumC945500aiC EXPAND;
    public static final /* synthetic */ EnumC945500aiC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC945500aiC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC945500aiC enumC945500aiC = new EnumC945500aiC("EXPAND", 0);
        EXPAND = enumC945500aiC;
        EnumC945500aiC enumC945500aiC2 = new EnumC945500aiC("COUNTDOWN", 1);
        COUNTDOWN = enumC945500aiC2;
        EnumC945500aiC[] enumC945500aiCArr = {enumC945500aiC, enumC945500aiC2};
        LL = enumC945500aiCArr;
        LLILLJJLI = new C2254308sP(enumC945500aiCArr);
    }

    public static EnumC945500aiC[] values() {
        return (EnumC945500aiC[]) LL.clone();
    }

    public static EnumC945500aiC valueOf(String str) {
        return (EnumC945500aiC) C08FF.LIZ(EnumC945500aiC.class, str);
    }

    public EnumC945500aiC(String str, int i) {
    }
}
