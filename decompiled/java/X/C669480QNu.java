package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorTypeAdapterFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669480QNu implements InterfaceC676470Qg9 {
    public static final C01GW<C669480QNu> LJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS196S0000000_10.get$arr$(177));
    public final Gson LIZJ;
    public final LinkedList<LastSearch> LIZ = new LinkedList<>();
    public final IAccountService LIZLLL = (IAccountService) ServiceManager.get().getService(IAccountService.class);
    public final int LIZIZ = 10;

    @Override // X.InterfaceC676470Qg9
    public final String LIZ() {
        LinkedList<LastSearch> linkedList = this.LIZ;
        String strLJIILL = "";
        if (linkedList == null || linkedList.isEmpty()) {
            return "";
        }
        try {
            strLJIILL = this.LIZJ.LJIILL(this.LIZ);
            return strLJIILL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLJIILL;
        }
    }

    @Override // X.InterfaceC676470Qg9
    public final LastSearch LIZIZ() {
        LinkedList<LastSearch> linkedList = this.LIZ;
        boolean z = false;
        if (linkedList != null && linkedList.size() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return this.LIZ.getFirst();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String LIZJ() {
        C0QOM c0qom = C0QOM.LIZ;
        LinkedList<LastSearch> linkedList = this.LIZ;
        Gson gson = this.LIZJ;
        c0qom.getClass();
        return C0QOM.LIZ(linkedList, gson);
    }

    public final String LIZLLL() {
        C0QOM c0qom = C0QOM.LIZ;
        LinkedList<LastSearch> linkedList = this.LIZ;
        Gson gson = this.LIZJ;
        c0qom.getClass();
        String strLIZ = C0QOM.LIZ(linkedList, gson);
        if (((Number) C1102504Sx.LIZ.getValue()).intValue() == 1) {
            return strLIZ;
        }
        try {
            new p();
            n nVarLJIILIIL = p.LIZJ(strLIZ).LJIILIIL();
            String strLIZIZ = ((C652150Pi1) C0Q3E.LJFF().Y52().LIZJ()).LIZIZ(this.LIZJ, this.LIZLLL);
            if (!(strLIZIZ == null || strLIZIZ.length() == 0)) {
                new p();
                nVarLJIILIIL.LJJIFFI("help_post_user_context", p.LIZJ(strLIZIZ).LJIIL());
            }
            strLIZ = this.LIZJ.LJIILJJIL(nVarLJIILIIL);
            return strLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strLIZ;
        }
    }

    public C669480QNu() {
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new SearchBehaviorTypeAdapterFactory());
        this.LIZJ = eVar.LIZ();
    }

    @Override // X.InterfaceC676470Qg9
    public final void LJIJJLI(LastSearch lastSearch) {
        LinkedList<LastSearch> linkedList = this.LIZ;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            Iterator<LastSearch> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().search_id, lastSearch.search_id)) {
                    return;
                }
            }
        }
        C0QOM.LIZ.getClass();
        C0Q3E.LJI().yY1().LIZ(new C0QOF(lastSearch));
        if (C07DR.LIZ()) {
            C0Q3E.LJI().fe(new C0QO0(lastSearch));
        }
        String str = lastSearch.search_id;
        if (str != null && str.length() > 0 && C287880BQc.LIZ() && ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LL == C644560PPy.LJIJJLI()) {
            C1ER1.LIZIZ.LLJJI(str).fe(new C669490QNv(lastSearch));
        }
        if (this.LIZ.size() < this.LIZIZ) {
            this.LIZ.addFirst(lastSearch);
        } else {
            C19719612Di.LJJIJIIJI(this.LIZ);
            this.LIZ.addFirst(lastSearch);
        }
    }
}
