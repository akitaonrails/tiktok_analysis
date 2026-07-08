package X;

import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0N8P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N8P extends C0N8N<Aweme> implements C0N8S {
    public static final /* synthetic */ int LJIIJ = 0;
    public final C0N8R LJFF;
    public final C0N8J<Aweme> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    @Override // X.InterfaceC2258671Dar
    public final void LJIILLIIL() {
    }

    public final void LJIILL() {
        C0N8R c0n8r = this.LJFF;
        c0n8r.LIZ.setValue(c0n8r, C0N8R.LIZIZ[0], this);
    }

    @Override // X.InterfaceC2258651Dap
    public final String LIZJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC2258651Dap
    public final String LJ() {
        return this.LJIIIZ;
    }

    public C0N8P(C588980N8e c588980N8e, C0N21 c0n21) {
        super(0);
        this.LJFF = c588980N8e;
        this.LJI = c0n21;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c588980N8e.LIZ());
        sbLIZ.append('/');
        sbLIZ.append(C0N8P.class.getSimpleName());
        this.LJII = C2088108Fz.LIZIZ(c588980N8e, C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIIZZ = c588980N8e.LIZLLL;
        this.LJIIIZ = c588980N8e.LIZ();
    }

    @Override // X.C0N8S
    public final void LIZLLL(Aweme aweme, Map<String, ? extends Object> map) {
        C0N23 c0n23LIZ = this.LJI.LIZ(aweme);
        if (c0n23LIZ == null) {
            return;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0N87) it2.next()).LJFF(c0n23LIZ, this.LJIIIIZZ, map);
        }
    }

    @Override // X.C0N8S
    public final void LJIILIIL(Aweme aweme, Map<String, ? extends Object> map) {
        C0N23 c0n23LIZ = this.LJI.LIZ(aweme);
        if (c0n23LIZ == null) {
            return;
        }
        MeasurementDependencyModules.LIZ.getClass();
        C04TF.LIZ().isDebug();
        Iterator<T> it2 = this.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0N87) it2.next()).LJIIZILJ(c0n23LIZ, this.LJIIIIZZ, map);
        }
    }
}
