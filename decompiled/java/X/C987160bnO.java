package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987160bnO implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<C953770avX> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
            case 2:
                subscribe$2(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C987160bnO c987160bnO, InterfaceC2329309At interfaceC2329309At) {
        ((Function2) c987160bnO.l0).invoke((C953770avX) c987160bnO.l1, new AwS594S0100000_15((C11KT) interfaceC2329309At, 1098));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$1(X.C987160bnO r10, X.InterfaceC2329309At r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C987160bnO.subscribe$1(X.0bnO, X.09At):void");
    }

    public static final void subscribe$2(C987160bnO c987160bnO, InterfaceC2329309At interfaceC2329309At) {
        ((C971040bNO) c987160bnO.l0).LJIILLIIL((C953770avX) c987160bnO.l1, new AwS594S0100000_15((C11KT) interfaceC2329309At, 1210));
    }

    public C987160bnO(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
