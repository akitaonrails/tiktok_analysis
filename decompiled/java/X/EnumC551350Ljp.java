package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ljp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC551350Ljp {
    public static final /* synthetic */ EnumC551350Ljp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC551350Ljp MENTION_LIST;
    public static final EnumC551350Ljp PANEL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC551350Ljp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC551350Ljp enumC551350Ljp = new EnumC551350Ljp("MENTION_LIST", 0, 0);
        MENTION_LIST = enumC551350Ljp;
        EnumC551350Ljp enumC551350Ljp2 = new EnumC551350Ljp("PANEL", 1, 1);
        PANEL = enumC551350Ljp2;
        EnumC551350Ljp[] enumC551350LjpArr = {enumC551350Ljp, enumC551350Ljp2};
        LLILLJJLI = enumC551350LjpArr;
        LLILLL = new C2254308sP(enumC551350LjpArr);
    }

    public static EnumC551350Ljp[] values() {
        return (EnumC551350Ljp[]) LLILLJJLI.clone();
    }

    public final int getFrom() {
        return this.LL;
    }

    public static EnumC551350Ljp valueOf(String str) {
        return (EnumC551350Ljp) C08FF.LIZ(EnumC551350Ljp.class, str);
    }

    public EnumC551350Ljp(String str, int i, int i2) {
        this.LL = i2;
    }
}
