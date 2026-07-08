package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590130NCp {
    public static final EnumC590130NCp INS;
    public static final /* synthetic */ EnumC590130NCp[] LL;

    static {
        EnumC590130NCp enumC590130NCp = new EnumC590130NCp();
        INS = enumC590130NCp;
        LL = new EnumC590130NCp[]{enumC590130NCp};
    }

    public static EnumC590130NCp[] values() {
        return (EnumC590130NCp[]) LL.clone();
    }

    public static EnumC590130NCp valueOf(String str) {
        return (EnumC590130NCp) C08FF.LIZ(EnumC590130NCp.class, str);
    }

    public void updateDecodeTypeWhenPlay(C1479530obX c1479530obX) {
        boolean z;
        int i = C585500Mxo.LIZ + 1;
        C01GW c01gw = C1474810oTv.J4;
        if (i < ((Number) c01gw.getValue()).intValue()) {
            z = true;
        } else {
            z = false;
        }
        C786410Ut5.j4("play index:%s, forceSoftDecodeNum:%s, needUpdate:%s", new Object[]{Integer.valueOf(C585500Mxo.LIZ + 1), Integer.valueOf(((Number) c01gw.getValue()).intValue()), Boolean.valueOf(z)});
        if (z) {
            c1479530obX.LJIIIZ = true;
        }
    }
}
