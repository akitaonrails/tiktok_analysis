package X;

import Y.AgS171S0300000_22;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Unit;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0oH5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466850oH5 implements InterfaceC346201Wa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 1:
                return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 2:
                return collect$2(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 3:
                return collect$3(this, interfaceC346701Wf, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object collect$0(C1466850oH5 c1466850oH5, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1466850oH5.l0).collect(new AgS171S0300000_22(interfaceC346701Wf, (C1415940mwy) c1466850oH5.l1, (Asset) c1466850oH5.l2, 3), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C1466850oH5 c1466850oH5, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1466850oH5.l0).collect(new AgS171S0300000_22(interfaceC346701Wf, (C1415940mwy) c1466850oH5.l1, (Asset) c1466850oH5.l2, 4), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$2(C1466850oH5 c1466850oH5, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1466850oH5.l0).collect(new AgS171S0300000_22(interfaceC346701Wf, (C1415940mwy) c1466850oH5.l1, (Asset) c1466850oH5.l2, 5), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$3(C1466850oH5 c1466850oH5, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c1466850oH5.l0).collect(new AgS171S0300000_22(interfaceC346701Wf, (C1415940mwy) c1466850oH5.l1, (Asset) c1466850oH5.l2, 6), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public C1466850oH5(b bVar, C1415940mwy c1415940mwy, Asset asset, int i) {
        this.$t = i;
        this.l0 = bVar;
        this.l1 = c1415940mwy;
        this.l2 = asset;
    }
}
