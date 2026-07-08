package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20564215dQ {
    public static final EnumC20564215dQ HEIGHT;
    public static final /* synthetic */ EnumC20564215dQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20564215dQ MATCH_PARENT;
    public static final EnumC20564215dQ WIDTH;

    public static InterfaceC2044707zh<EnumC20564215dQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20564215dQ enumC20564215dQ = new EnumC20564215dQ("HEIGHT", 0);
        HEIGHT = enumC20564215dQ;
        EnumC20564215dQ enumC20564215dQ2 = new EnumC20564215dQ("WIDTH", 1);
        WIDTH = enumC20564215dQ2;
        EnumC20564215dQ enumC20564215dQ3 = new EnumC20564215dQ("MATCH_PARENT", 2);
        MATCH_PARENT = enumC20564215dQ3;
        EnumC20564215dQ[] enumC20564215dQArr = {enumC20564215dQ, enumC20564215dQ2, enumC20564215dQ3};
        LL = enumC20564215dQArr;
        LLILLJJLI = new C2254308sP(enumC20564215dQArr);
    }

    public static EnumC20564215dQ[] values() {
        return (EnumC20564215dQ[]) LL.clone();
    }

    public static EnumC20564215dQ valueOf(String str) {
        return (EnumC20564215dQ) C08FF.LIZ(EnumC20564215dQ.class, str);
    }

    public EnumC20564215dQ(String str, int i) {
    }
}
