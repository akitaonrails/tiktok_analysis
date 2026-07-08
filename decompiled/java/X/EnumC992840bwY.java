package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992840bwY {
    public static final /* synthetic */ EnumC992840bwY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992840bwY ON_DISMISSED;
    public static final EnumC992840bwY ON_SHOWN;

    public static InterfaceC2044707zh<EnumC992840bwY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992840bwY enumC992840bwY = new EnumC992840bwY("ON_SHOWN", 0);
        ON_SHOWN = enumC992840bwY;
        EnumC992840bwY enumC992840bwY2 = new EnumC992840bwY("ON_DISMISSED", 1);
        ON_DISMISSED = enumC992840bwY2;
        EnumC992840bwY[] enumC992840bwYArr = {enumC992840bwY, enumC992840bwY2};
        LL = enumC992840bwYArr;
        LLILLJJLI = new C2254308sP(enumC992840bwYArr);
    }

    public static EnumC992840bwY[] values() {
        return (EnumC992840bwY[]) LL.clone();
    }

    public static EnumC992840bwY valueOf(String str) {
        return (EnumC992840bwY) C08FF.LIZ(EnumC992840bwY.class, str);
    }

    public EnumC992840bwY(String str, int i) {
    }
}
