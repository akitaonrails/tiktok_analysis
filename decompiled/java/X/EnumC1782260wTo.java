package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782260wTo {
    public static final EnumC1782260wTo IN_APP;
    public static final /* synthetic */ EnumC1782260wTo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782260wTo SUBSCRIPTION;

    public static InterfaceC2044707zh<EnumC1782260wTo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782260wTo enumC1782260wTo = new EnumC1782260wTo("IN_APP", 0);
        IN_APP = enumC1782260wTo;
        EnumC1782260wTo enumC1782260wTo2 = new EnumC1782260wTo("SUBSCRIPTION", 1);
        SUBSCRIPTION = enumC1782260wTo2;
        EnumC1782260wTo[] enumC1782260wToArr = {enumC1782260wTo, enumC1782260wTo2};
        LL = enumC1782260wToArr;
        LLILLJJLI = new C2254308sP(enumC1782260wToArr);
    }

    public static EnumC1782260wTo[] values() {
        return (EnumC1782260wTo[]) LL.clone();
    }

    public static EnumC1782260wTo valueOf(String str) {
        return (EnumC1782260wTo) C08FF.LIZ(EnumC1782260wTo.class, str);
    }

    public EnumC1782260wTo(String str, int i) {
    }
}
