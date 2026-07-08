package X;

import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC928510aGn<T, S> implements InterfaceC921200a50 {
    public S LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(243));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(244));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(255));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(251));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(256));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(246));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(245));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(249));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(250));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(254));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(252));
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(248));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(253));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(247));
    public final List<Integer> LJIILL = new ArrayList();

    @Override // X.InterfaceC921200a50
    public Boolean LJ() {
        return null;
    }

    @Override // X.InterfaceC921200a50
    public String LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC921200a50
    public String LJIIIZ() {
        return null;
    }

    @Override // X.InterfaceC921200a50
    public String LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC921200a50
    public Long LJIJ() {
        return null;
    }

    public abstract void LJJIJIIJI(S s);

    public final void LJJIJIL() {
        synchronized (this) {
            try {
                LJIJJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC921200a50
    public final List<T> LIZJ() {
        return (List) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC921200a50
    public List<T> LJIIJJI() {
        return new ArrayList();
    }

    @Override // X.InterfaceC921200a50
    public final List<ListByTypeResponse.ReservedUser> LJIILJJIL() {
        return (List) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC921200a50
    public final List<T> LJIILL() {
        return (List) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC921200a50
    public List<T> LJIILLIIL() {
        return new ArrayList();
    }

    @Override // X.InterfaceC921200a50
    public List<T> LJIJI() {
        return new ArrayList();
    }

    public final List<T> LJIJJLI() {
        return (List) this.LIZIZ.getValue();
    }

    public final List<T> LJIL() {
        return (List) this.LJI.getValue();
    }

    public final List<ListByTypeResponse.GiftScoreAppliedUser> LJJ() {
        return (List) this.LJII.getValue();
    }

    public final List<T> LJJI() {
        return (List) this.LJIILJJIL.getValue();
    }

    public final List<T> LJJIFFI() {
        return (List) this.LJIIIZ.getValue();
    }

    public final List<ListByTypeResponse.ChatGroupInfo> LJJII() {
        return (List) this.LJIIL.getValue();
    }

    public final List<T> LJJIII() {
        return (List) this.LJ.getValue();
    }

    public final List<T> LJJIIJ() {
        return (List) this.LJIIJJI.getValue();
    }

    public final List<T> LJJIIJZLJL() {
        return (List) this.LJIIJ.getValue();
    }

    public final List<T> LJJIIZ() {
        return (List) this.LJIILIIL.getValue();
    }

    public final Map<Long, Long> LJJIIZI() {
        return (Map) this.LJFF.getValue();
    }

    @Override // X.InterfaceC921200a50
    public final List<T> LIZ() {
        return LJJIII();
    }

    @Override // X.InterfaceC921200a50
    public final List<T> LIZIZ() {
        return LJIJJLI();
    }

    @Override // X.InterfaceC921200a50
    public final List<T> LIZLLL() {
        return LJJIIJZLJL();
    }

    @Override // X.InterfaceC921200a50
    public final List<T> LJI() {
        return LJIL();
    }

    public final void LJIJJ() {
        LJIJJLI().clear();
        ((List) this.LIZJ.getValue()).clear();
        LJJIII().clear();
        LJIL().clear();
        ((List) this.LJIIIIZZ.getValue()).clear();
        LJJIFFI().clear();
        ((List) this.LIZLLL.getValue()).clear();
        LJJIIJZLJL().clear();
        ((List) this.LJII.getValue()).clear();
        ((List) this.LJIIL.getValue()).clear();
        ((List) this.LJIIJJI.getValue()).clear();
        ((List) this.LJIILIIL.getValue()).clear();
        ((List) this.LJIILJJIL.getValue()).clear();
    }

    @Override // X.InterfaceC921200a50
    public final S getSource() {
        return this.LIZ;
    }

    public final void LJJIJ(S s) {
        Object obj;
        this.LIZ = s;
        if (!((ArrayList) this.LJIILL).isEmpty() && !((ArrayList) this.LJIILL).contains(4)) {
            C20441214yg.LIZIZ("invite_out_view_friend", "save NOT_VIEWER_FRIENDS");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(LJJIIJZLJL());
            obj = arrayList;
        } else {
            obj = C13BV.INSTANCE;
        }
        LJIJJ();
        LJJIIJZLJL().addAll(obj);
        LJJIJIIJI(s);
        List<T> listLJIJJLI = LJIJJLI();
        listLJIJJLI.addAll(LJJIII());
        listLJIJJLI.addAll(LJIL());
        listLJIJJLI.addAll((Collection) this.LJIIIIZZ.getValue());
        listLJIJJLI.addAll(LJJIFFI());
        listLJIJJLI.addAll(LJJIIJZLJL());
        listLJIJJLI.addAll((Collection) this.LJIIJJI.getValue());
        List list = (List) this.LIZJ.getValue();
        list.addAll(LJJIII());
        list.addAll(LJIL());
        list.addAll(LJJIFFI());
    }

    public final void LJJIJIIJIL(S s) {
        synchronized (this) {
            try {
                LJJIJ(s);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
