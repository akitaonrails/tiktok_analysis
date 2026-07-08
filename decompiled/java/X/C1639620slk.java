package X;

import Y.AfS185S0100000_16;
import Y.AfS194S0100000_25;
import Y.AkS486S0100000_25;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.internal.main.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0slk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639620slk implements InterfaceC1639370slL {
    public boolean LIZIZ;
    public C11NJ LIZ = new C11NJ();
    public final MutableLiveData<List<FilterBean>> LIZJ = new MutableLiveData<>();
    public final MutableLiveData<List<EffectCategoryResponse>> LIZLLL = new MutableLiveData<>();
    public final MutableLiveData<List<Pair<EffectCategoryResponse, List<FilterBean>>>> LJ = new MutableLiveData<>();
    public final MutableLiveData<Map<String, Effect>> LJFF = new MutableLiveData<>();
    public final MutableLiveData<List<FilterBean>> LJI = new MutableLiveData<>();
    public final Map<String, C1639650sln> LJII = new LinkedHashMap();
    public final List<C1634100scq<C1639670slp, C1639650sln, FilterBean>> LJIIIIZZ = new ArrayList();

    @Override // X.InterfaceC1640320sms
    public final MutableLiveData LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1640320sms
    public final MutableLiveData LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1640320sms
    public final boolean LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1640320sms
    public final Map<String, C1639650sln> LJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1640320sms
    public final MutableLiveData LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1640320sms
    public final MutableLiveData LJI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1639370slL
    public final void LIZJ(a aVar) {
        C11NJ c11nj = new C11NJ();
        synchronized (this) {
            try {
                this.LIZ.dispose();
                this.LIZ.LJ();
                this.LIZ = c11nj;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C11O8 c11o8LJJJLZIJ = aVar.LJJJI().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJJ(new AkS486S0100000_25(this, 20), false).LJJJLZIJ(C1701940uOG.LIZIZ());
        AfS194S0100000_25 afS194S0100000_25 = new AfS194S0100000_25(this, 130);
        C09HM c09hm = C09HN.LIZ;
        c11nj.LIZ(c11o8LJJJLZIJ.LJJLL(afS194S0100000_25, c09hm));
        c11nj.LIZ(aVar.LJJJIL().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJJ(new AkS486S0100000_25(this, 21), false).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(this, 28), c09hm));
    }
}
