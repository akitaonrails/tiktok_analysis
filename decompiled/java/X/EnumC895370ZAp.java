package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895370ZAp {
    public static final EnumC895370ZAp ACTIVITY;
    public static final EnumC895370ZAp FOLLOWER;
    public static final /* synthetic */ EnumC895370ZAp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC895370ZAp SHOP;

    public static InterfaceC2044707zh<EnumC895370ZAp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC895370ZAp enumC895370ZAp = new EnumC895370ZAp("FOLLOWER", 0);
        FOLLOWER = enumC895370ZAp;
        EnumC895370ZAp enumC895370ZAp2 = new EnumC895370ZAp("ACTIVITY", 1);
        ACTIVITY = enumC895370ZAp2;
        EnumC895370ZAp enumC895370ZAp3 = new EnumC895370ZAp("SHOP", 2);
        SHOP = enumC895370ZAp3;
        EnumC895370ZAp[] enumC895370ZApArr = {enumC895370ZAp, enumC895370ZAp2, enumC895370ZAp3};
        LL = enumC895370ZApArr;
        LLILLJJLI = new C2254308sP(enumC895370ZApArr);
    }

    public static EnumC895370ZAp[] values() {
        return (EnumC895370ZAp[]) LL.clone();
    }

    public static EnumC895370ZAp valueOf(String str) {
        return (EnumC895370ZAp) C08FF.LIZ(EnumC895370ZAp.class, str);
    }

    public EnumC895370ZAp(String str, int i) {
    }
}
