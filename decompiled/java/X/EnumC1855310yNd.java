package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855310yNd {
    public static final EnumC1855310yNd CANCELLING;
    public static final EnumC1855310yNd INITIATE;
    public static final /* synthetic */ EnumC1855310yNd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1855310yNd STOP_MESSAGE;
    public static final EnumC1855310yNd TALKING;

    public static InterfaceC2044707zh<EnumC1855310yNd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1855310yNd enumC1855310yNd = new EnumC1855310yNd("INITIATE", 0);
        INITIATE = enumC1855310yNd;
        EnumC1855310yNd enumC1855310yNd2 = new EnumC1855310yNd("TALKING", 1);
        TALKING = enumC1855310yNd2;
        EnumC1855310yNd enumC1855310yNd3 = new EnumC1855310yNd("STOP_MESSAGE", 2);
        STOP_MESSAGE = enumC1855310yNd3;
        EnumC1855310yNd enumC1855310yNd4 = new EnumC1855310yNd("CANCELLING", 3);
        CANCELLING = enumC1855310yNd4;
        EnumC1855310yNd[] enumC1855310yNdArr = {enumC1855310yNd, enumC1855310yNd2, enumC1855310yNd3, enumC1855310yNd4};
        LL = enumC1855310yNdArr;
        LLILLJJLI = new C2254308sP(enumC1855310yNdArr);
    }

    public static EnumC1855310yNd[] values() {
        return (EnumC1855310yNd[]) LL.clone();
    }

    public static EnumC1855310yNd valueOf(String str) {
        return (EnumC1855310yNd) C08FF.LIZ(EnumC1855310yNd.class, str);
    }

    public EnumC1855310yNd(String str, int i) {
    }
}
