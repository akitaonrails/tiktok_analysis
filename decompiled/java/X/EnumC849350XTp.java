package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC849350XTp {
    public static final EnumC849350XTp DESTRUCTIVE;
    public static final /* synthetic */ EnumC849350XTp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC849350XTp PRIMARY;
    public static final EnumC849350XTp SECONDARY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC849350XTp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC849350XTp enumC849350XTp = new EnumC849350XTp("PRIMARY", 0, 0);
        PRIMARY = enumC849350XTp;
        EnumC849350XTp enumC849350XTp2 = new EnumC849350XTp("SECONDARY", 1, 1);
        SECONDARY = enumC849350XTp2;
        EnumC849350XTp enumC849350XTp3 = new EnumC849350XTp("DESTRUCTIVE", 2, 2);
        DESTRUCTIVE = enumC849350XTp3;
        EnumC849350XTp[] enumC849350XTpArr = {enumC849350XTp, enumC849350XTp2, enumC849350XTp3};
        LLILLJJLI = enumC849350XTpArr;
        LLILLL = new C2254308sP(enumC849350XTpArr);
    }

    public static EnumC849350XTp[] values() {
        return (EnumC849350XTp[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC849350XTp valueOf(String str) {
        return (EnumC849350XTp) C08FF.LIZ(EnumC849350XTp.class, str);
    }

    public EnumC849350XTp(String str, int i, int i2) {
        this.LL = i2;
    }
}
