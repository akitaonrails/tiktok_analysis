package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ryQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1609040ryQ {
    public static final EnumC1609040ryQ FEED;
    public static final /* synthetic */ EnumC1609040ryQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1609040ryQ NORMAL;
    public static final EnumC1609040ryQ SKYLIGHT;

    public static InterfaceC2044707zh<EnumC1609040ryQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1609040ryQ enumC1609040ryQ = new EnumC1609040ryQ("NORMAL", 0);
        NORMAL = enumC1609040ryQ;
        EnumC1609040ryQ enumC1609040ryQ2 = new EnumC1609040ryQ("SKYLIGHT", 1);
        SKYLIGHT = enumC1609040ryQ2;
        EnumC1609040ryQ enumC1609040ryQ3 = new EnumC1609040ryQ("FEED", 2);
        FEED = enumC1609040ryQ3;
        EnumC1609040ryQ[] enumC1609040ryQArr = {enumC1609040ryQ, enumC1609040ryQ2, enumC1609040ryQ3};
        LL = enumC1609040ryQArr;
        LLILLJJLI = new C2254308sP(enumC1609040ryQArr);
    }

    public static EnumC1609040ryQ[] values() {
        return (EnumC1609040ryQ[]) LL.clone();
    }

    public static EnumC1609040ryQ valueOf(String str) {
        return (EnumC1609040ryQ) C08FF.LIZ(EnumC1609040ryQ.class, str);
    }

    public EnumC1609040ryQ(String str, int i) {
    }
}
