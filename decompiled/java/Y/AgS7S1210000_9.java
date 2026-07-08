package Y;

import X.C099R;
import X.C0O47;
import X.C0O48;
import X.C0O49;
import X.C0O4A;
import X.C0O78;
import X.C0O79;
import X.C0O7A;
import X.C0O7F;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C613330O3v;
import X.C613350O3x;
import X.EnumC614130O6x;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class AgS7S1210000_9 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object emit$0(AgS7S1210000_9 agS7S1210000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            if (C0O7F.LIZJ(c0o7a.LIZJ) == EnumC614130O6x.Optimistic) {
                C1DFH c1dfh = C0PEM.LIZ;
                Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O49((BookDetailVM) agS7S1210000_9.l2, agS7S1210000_9.z3, null));
                if (objLJI != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objLJI;
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            Object objLJI2 = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C613350O3x((BookDetailVM) agS7S1210000_9.l2, agS7S1210000_9.z3, agS7S1210000_9.s0, c0o7a, (InterfaceC497601wk) agS7S1210000_9.l1, null));
            if (objLJI2 == C099R.LJFF()) {
                return objLJI2;
            }
            return Unit.LIZ;
        }
        if (c0o7a instanceof C0O78) {
            C1DFH c1dfh3 = C0PEM.LIZ;
            Object objLJI3 = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O48(c0o7a, (BookDetailVM) agS7S1210000_9.l2, (InterfaceC497601wk) agS7S1210000_9.l1, null));
            if (objLJI3 == C099R.LJFF()) {
                return objLJI3;
            }
            return Unit.LIZ;
        }
        C2296808zG.LIZJ((InterfaceC497601wk) agS7S1210000_9.l1, null);
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS7S1210000_9 agS7S1210000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            if (C0O7F.LIZJ(c0o7a.LIZJ) == EnumC614130O6x.Optimistic) {
                C1DFH c1dfh = C0PEM.LIZ;
                Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O4A((MovieDetailVM) agS7S1210000_9.l2, agS7S1210000_9.z3, null));
                if (objLJI != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objLJI;
            }
            C1DFH c1dfh2 = C0PEM.LIZ;
            Object objLJI2 = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C613330O3v((MovieDetailVM) agS7S1210000_9.l2, agS7S1210000_9.z3, agS7S1210000_9.s0, c0o7a, (InterfaceC497601wk) agS7S1210000_9.l1, null));
            if (objLJI2 == C099R.LJFF()) {
                return objLJI2;
            }
            return Unit.LIZ;
        }
        if (c0o7a instanceof C0O78) {
            C1DFH c1dfh3 = C0PEM.LIZ;
            Object objLJI3 = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0O47((MovieDetailVM) agS7S1210000_9.l2, (InterfaceC497601wk) agS7S1210000_9.l1, agS7S1210000_9.z3, null));
            if (objLJI3 == C099R.LJFF()) {
                return objLJI3;
            }
            return Unit.LIZ;
        }
        C2296808zG.LIZJ((InterfaceC497601wk) agS7S1210000_9.l1, null);
        return Unit.LIZ;
    }

    public AgS7S1210000_9(Object obj, Object obj2, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.z3 = z;
        this.s0 = str;
    }
}
