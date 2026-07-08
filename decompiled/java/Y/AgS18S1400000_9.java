package Y;

import X.C099R;
import X.C09AE;
import X.C0O5R;
import X.C0O5V;
import X.C0O7A;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C612120Nze;
import X.C612150Nzh;
import X.EnumC614130O6x;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public class AgS18S1400000_9 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS18S1400000_9 agS18S1400000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C612150Nzh c612150Nzh = (C612150Nzh) obj;
        if (c612150Nzh == null) {
            ((C09AE) agS18S1400000_9.l2).LIZIZ(null);
            return Unit.LIZ;
        }
        EnumC614130O6x enumC614130O6x = c612150Nzh.LIZ;
        EnumC614130O6x enumC614130O6x2 = EnumC614130O6x.Optimistic;
        if (enumC614130O6x != enumC614130O6x2) {
            ((C09AE) agS18S1400000_9.l2).LIZIZ(null);
        }
        if (c612150Nzh.LIZIZ == null && c612150Nzh.LIZ == enumC614130O6x2) {
            C1DFH c1dfh = C0PEM.LIZ;
            Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C612120Nze((VideoFavoriteVM) agS18S1400000_9.l3, (VideoItemParams) agS18S1400000_9.l4, agS18S1400000_9.s0, null));
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS18S1400000_9 agS18S1400000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O5R((C0O7A) obj, (Function2) agS18S1400000_9.l1, agS18S1400000_9.s0, (C0O5V) agS18S1400000_9.l2, (Function2) agS18S1400000_9.l3, (Function2) agS18S1400000_9.l4, null));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS18S1400000_9(Object obj, Function2<? super String, ? super Throwable, Unit> function2, String str, C0O5V<S> c0o5v, Function2<? super String, ? super Throwable, Unit> function22, Function2<? super String, ? super Boolean, Unit> function23) {
        this.$t = function23;
        this.l1 = obj;
        this.s0 = function2;
        this.l2 = str;
        this.l3 = c0o5v;
        this.l4 = function22;
    }
}
