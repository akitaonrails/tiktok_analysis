package Y;

import X.InterfaceC1487280oo2;

/* JADX INFO: loaded from: classes13.dex */
public class AkS15S0000100_12 implements InterfaceC1487280oo2 {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public AkS15S0000100_12(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final Object apply$0(AkS15S0000100_12 akS15S0000100_12, Object obj) {
        return Long.valueOf(akS15S0000100_12.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$1(AkS15S0000100_12 akS15S0000100_12, Object obj) {
        return Long.valueOf(akS15S0000100_12.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$2(AkS15S0000100_12 akS15S0000100_12, Object obj) {
        return Long.valueOf(akS15S0000100_12.j0 - ((Long) obj).longValue());
    }

    public static final Object apply$3(AkS15S0000100_12 akS15S0000100_12, Object obj) {
        return Long.valueOf(akS15S0000100_12.j0 - ((Long) obj).longValue());
    }
}
