package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1126060fPQ {
    public static final EnumC1126060fPQ GALLERY;
    public static final EnumC1126060fPQ LEVEL_UP;
    public static final EnumC1126060fPQ LIVE_GOAL;
    public static final /* synthetic */ EnumC1126060fPQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1126060fPQ NONE;
    public static final EnumC1126060fPQ VAULT_EOY;

    public static InterfaceC2044707zh<EnumC1126060fPQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1126060fPQ enumC1126060fPQ = new EnumC1126060fPQ("NONE", 0);
        NONE = enumC1126060fPQ;
        EnumC1126060fPQ enumC1126060fPQ2 = new EnumC1126060fPQ("GALLERY", 1);
        GALLERY = enumC1126060fPQ2;
        EnumC1126060fPQ enumC1126060fPQ3 = new EnumC1126060fPQ("LIVE_GOAL", 2);
        LIVE_GOAL = enumC1126060fPQ3;
        EnumC1126060fPQ enumC1126060fPQ4 = new EnumC1126060fPQ("VAULT_EOY", 3);
        VAULT_EOY = enumC1126060fPQ4;
        EnumC1126060fPQ enumC1126060fPQ5 = new EnumC1126060fPQ("LEVEL_UP", 4);
        LEVEL_UP = enumC1126060fPQ5;
        EnumC1126060fPQ[] enumC1126060fPQArr = {enumC1126060fPQ, enumC1126060fPQ2, enumC1126060fPQ3, enumC1126060fPQ4, enumC1126060fPQ5};
        LL = enumC1126060fPQArr;
        LLILLJJLI = new C2254308sP(enumC1126060fPQArr);
    }

    public static EnumC1126060fPQ[] values() {
        return (EnumC1126060fPQ[]) LL.clone();
    }

    public static EnumC1126060fPQ valueOf(String str) {
        return (EnumC1126060fPQ) C08FF.LIZ(EnumC1126060fPQ.class, str);
    }

    public EnumC1126060fPQ(String str, int i) {
    }
}
