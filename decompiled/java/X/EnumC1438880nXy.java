package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1438880nXy {
    public static final /* synthetic */ EnumC1438880nXy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1438880nXy NORMAL;
    public static final EnumC1438880nXy SEPARATED;

    public static InterfaceC2044707zh<EnumC1438880nXy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1438880nXy enumC1438880nXy = new EnumC1438880nXy("NORMAL", 0);
        NORMAL = enumC1438880nXy;
        EnumC1438880nXy enumC1438880nXy2 = new EnumC1438880nXy("SEPARATED", 1);
        SEPARATED = enumC1438880nXy2;
        EnumC1438880nXy[] enumC1438880nXyArr = {enumC1438880nXy, enumC1438880nXy2};
        LL = enumC1438880nXyArr;
        LLILLJJLI = new C2254308sP(enumC1438880nXyArr);
    }

    public static EnumC1438880nXy[] values() {
        return (EnumC1438880nXy[]) LL.clone();
    }

    public static EnumC1438880nXy valueOf(String str) {
        return (EnumC1438880nXy) C08FF.LIZ(EnumC1438880nXy.class, str);
    }

    public EnumC1438880nXy(String str, int i) {
    }
}
