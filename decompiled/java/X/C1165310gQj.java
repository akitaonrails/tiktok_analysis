package X;

import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS483S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165310gQj {
    public int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public MixListResponse LJ;
    public boolean LJFF;
    public String LIZLLL = "";
    public int LJI = -1;
    public final List<String> LJII = new ArrayList();
    public final Set<String> LJIIIIZZ = new LinkedHashSet();
    public final C1165050gQJ LJIIIZ = new C1165050gQJ();

    public final List<C1167940gUy> LIZ(List<MixStruct> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<MixStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1167940gUy(it2.next(), this.LIZIZ, this.LIZJ, this.LIZLLL));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public final Object LIZIZ(long j, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        if (this.LIZIZ != null && this.LIZJ != null) {
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
            C1165050gQJ c1165050gQJ = this.LJIIIZ;
            String str = this.LIZIZ;
            if (str == null) {
                str = "";
            }
            String str2 = this.LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            c1165050gQJ.LIZLLL(str, str2, ((long) this.LIZ) + j, null, false, new AwS483S0200000_18(this, c23260099m, 4), new AwS597S0100000_18(c23260099m, 1107));
            Object objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            return objLIZ;
        }
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }
}
