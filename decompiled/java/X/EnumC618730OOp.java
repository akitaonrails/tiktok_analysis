package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC618730OOp {
    public static final /* synthetic */ EnumC618730OOp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC618730OOp UN_VOTE;
    public static final EnumC618730OOp UPDATE;
    public static final EnumC618730OOp VOTE;

    public static InterfaceC2044707zh<EnumC618730OOp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC618730OOp enumC618730OOp = new EnumC618730OOp("UPDATE", 0);
        UPDATE = enumC618730OOp;
        EnumC618730OOp enumC618730OOp2 = new EnumC618730OOp("VOTE", 1);
        VOTE = enumC618730OOp2;
        EnumC618730OOp enumC618730OOp3 = new EnumC618730OOp("UN_VOTE", 2);
        UN_VOTE = enumC618730OOp3;
        EnumC618730OOp[] enumC618730OOpArr = {enumC618730OOp, enumC618730OOp2, enumC618730OOp3};
        LL = enumC618730OOpArr;
        LLILLJJLI = new C2254308sP(enumC618730OOpArr);
    }

    public static EnumC618730OOp[] values() {
        return (EnumC618730OOp[]) LL.clone();
    }

    public static EnumC618730OOp valueOf(String str) {
        return (EnumC618730OOp) C08FF.LIZ(EnumC618730OOp.class, str);
    }

    public EnumC618730OOp(String str, int i) {
    }
}
