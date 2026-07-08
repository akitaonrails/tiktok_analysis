package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18iG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21358618iG implements InterfaceC21358718iH {
    public final List<InterfaceC21358718iH> LIZ = new ArrayList();

    @Override // X.InterfaceC21358718iH
    public final void LIZJ(Effect effect) {
        Iterator<InterfaceC21358718iH> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(effect);
        }
    }

    @Override // X.InterfaceC21358718iH
    public final void LIZLLL(Effect effect) {
        Iterator<InterfaceC21358718iH> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(effect);
        }
    }

    @Override // X.InterfaceC21358718iH
    public final void LJ(Effect effect) {
        Iterator<InterfaceC21358718iH> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(effect);
        }
    }

    @Override // X.InterfaceC21358718iH
    public final void LJFF(Effect effect) {
        Iterator<InterfaceC21358718iH> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(effect);
        }
    }

    @Override // X.InterfaceC21358718iH
    public final void LIZ(Effect effect, int i, C21356918hz c21356918hz) {
        Iterator<InterfaceC21358718iH> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(effect, i, c21356918hz);
        }
    }

    @Override // X.InterfaceC21358718iH
    public final void LIZIZ(Effect effect, int i, C21356918hz c21356918hz) {
        Iterator<InterfaceC21358718iH> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(effect, i, c21356918hz);
        }
    }

    @Override // X.InterfaceC21358718iH
    public final void LJI(Effect effect, String str, boolean z) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21358718iH) it2.next()).LJI(effect, str, z);
        }
    }

    @Override // X.InterfaceC21358718iH
    public final void LJII(Effect effect, String str, String str2) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21358718iH) it2.next()).LJII(effect, str, str2);
        }
    }
}
