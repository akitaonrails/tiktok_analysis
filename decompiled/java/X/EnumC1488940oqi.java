package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1488940oqi {
    public static final /* synthetic */ EnumC1488940oqi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1488940oqi OK;
    public static final EnumC1488940oqi UNSUPPORTED;

    public static InterfaceC2044707zh<EnumC1488940oqi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1488940oqi enumC1488940oqi = new EnumC1488940oqi("OK", 0);
        OK = enumC1488940oqi;
        EnumC1488940oqi enumC1488940oqi2 = new EnumC1488940oqi("UNSUPPORTED", 1);
        UNSUPPORTED = enumC1488940oqi2;
        EnumC1488940oqi[] enumC1488940oqiArr = {enumC1488940oqi, enumC1488940oqi2};
        LL = enumC1488940oqiArr;
        LLILLJJLI = new C2254308sP(enumC1488940oqiArr);
    }

    public static EnumC1488940oqi[] values() {
        return (EnumC1488940oqi[]) LL.clone();
    }

    public static EnumC1488940oqi valueOf(String str) {
        return (EnumC1488940oqi) C08FF.LIZ(EnumC1488940oqi.class, str);
    }

    public EnumC1488940oqi(String str, int i) {
    }
}
