package X;

import Y.ARunnableS15S1200000_10;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650640Pfa implements InterfaceC588610N6t {
    public static final boolean LJIIIZ = C650560PfS.LIZ;
    public InterfaceC648350Pbt LIZ;
    public C587060N0u LIZIZ;
    public int LIZJ = 1;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(679));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(677));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(678));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(680));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1240));
    public Set<InterfaceC648350Pbt> LJIIIIZZ = new LinkedHashSet();

    @Override // X.InterfaceC588610N6t
    public final void LJI(Set<C650660Pfc> set) {
    }

    public final ArrayList<InterfaceC648350Pbt> LJIIIZ() {
        return (ArrayList) this.LJFF.getValue();
    }

    public final ArrayList<InterfaceC648350Pbt> LJIIJ() {
        return (ArrayList) this.LJI.getValue();
    }

    public final void LJIIJJI() {
        InterfaceC648350Pbt interfaceC648350Pbt = this.LIZ;
        if (interfaceC648350Pbt != null) {
            interfaceC648350Pbt.LJJJLIIL();
        }
        for (InterfaceC648350Pbt interfaceC648350Pbt2 : ((C650650Pfb) this.LJ.getValue()).LIZ()) {
            if (!Intrinsics.LJFF(interfaceC648350Pbt2, this.LIZ)) {
                if (LJIIIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pause this ");
                    sbLIZ.append(interfaceC648350Pbt2);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                interfaceC648350Pbt2.LJJJLIIL();
            }
        }
    }

    @Override // X.InterfaceC588610N6t
    public final void resume() {
        if (this.LIZ == null) {
            if (!LJIIJ().isEmpty()) {
                LJII(LJIIJ(), null);
                LJIIJ().clear();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resume, current: ");
        InterfaceC648350Pbt interfaceC648350Pbt = this.LIZ;
        sbLIZ.append(interfaceC648350Pbt != null ? interfaceC648350Pbt.getDebugId() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC648350Pbt interfaceC648350Pbt2 = this.LIZ;
        if (interfaceC648350Pbt2 != null) {
            interfaceC648350Pbt2.W0(150L, null);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC588610N6t
    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releasePlayerResources, size: ");
        sbLIZ.append(this.LJIIIIZZ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<T> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            ((InterfaceC648350Pbt) it2.next()).LJJLIIIJLLLLLLLZ();
        }
    }

    @Override // X.InterfaceC588610N6t
    public final void LJ() {
        LJIIIIZZ();
        LJIIJ().clear();
        this.LIZ = null;
        this.LIZJ = 1;
        this.LIZIZ = null;
    }

    public final void LJIIIIZZ() {
        Iterator<InterfaceC648350Pbt> it2 = LJIIIZ().iterator();
        while (it2.hasNext()) {
            it2.next().Mu((C650630PfZ) this.LJII.getValue());
        }
        LJIIIZ().clear();
    }

    @Override // X.InterfaceC588610N6t
    public final void release() {
        LJIIIIZZ();
        ((C650650Pfb) this.LJ.getValue()).LIZ().clear();
        ((Handler) this.LIZLLL.getValue()).removeCallbacksAndMessages(null);
        this.LJIIIIZZ.clear();
    }

    @Override // X.InterfaceC588610N6t
    public final InterfaceC648350Pbt LJFF() {
        return this.LIZ;
    }

    @Override // X.InterfaceC588610N6t
    public final void pause() {
        LJIIJJI();
    }

    @Override // X.InterfaceC588610N6t
    public final void LIZ(List<? extends InterfaceC648350Pbt> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update pending data when status is ready, size:");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIJ().clear();
        LJIIJ().addAll(list);
        LJIIIIZZ();
        this.LIZ = null;
        this.LIZJ = 1;
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC588610N6t
    public final void LIZIZ(InterfaceC648310Pbp interfaceC648310Pbp) {
        this.LIZ = interfaceC648310Pbp;
        this.LJIIIIZZ.add(interfaceC648310Pbp);
    }

    @Override // X.InterfaceC588610N6t
    public final void LIZJ(Set<InterfaceC648350Pbt> set) {
        this.LJIIIIZZ = set;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set full playable data, size: ");
        sbLIZ.append(set.size());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC588610N6t
    public final void LJII(List<? extends InterfaceC648350Pbt> list, C587060N0u c587060N0u) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData, data size:");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIIIZZ();
        Iterator<? extends InterfaceC648350Pbt> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().wp((C650630PfZ) this.LJII.getValue());
        }
        this.LIZIZ = c587060N0u;
        this.LIZJ = 1;
        if (list.isEmpty()) {
            LJIIJJI();
            return;
        }
        LJIIIZ().addAll(list);
        this.LJIIIIZZ.addAll(list);
        InterfaceC648350Pbt interfaceC648350Pbt = (InterfaceC648350Pbt) ListProtector.get(list, 0);
        LJIIL(interfaceC648350Pbt, c587060N0u);
        LJIILIIL("updateData", interfaceC648350Pbt);
    }

    public final void LJIIL(InterfaceC648350Pbt interfaceC648350Pbt, C587060N0u c587060N0u) {
        String debugId;
        InterfaceC648350Pbt interfaceC648350Pbt2 = this.LIZ;
        String debugId2 = null;
        if (interfaceC648350Pbt2 != null && !Intrinsics.LJFF(interfaceC648350Pbt, interfaceC648350Pbt2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pause current first, current:");
            InterfaceC648350Pbt interfaceC648350Pbt3 = this.LIZ;
            if (interfaceC648350Pbt3 != null) {
                debugId = interfaceC648350Pbt3.getDebugId();
            } else {
                debugId = null;
            }
            sbLIZ.append(debugId);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC648350Pbt interfaceC648350Pbt4 = this.LIZ;
            if (interfaceC648350Pbt4 != null) {
                interfaceC648350Pbt4.LJJJLIIL();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if ((interfaceC648350Pbt instanceof InterfaceC648270Pbl) || (interfaceC648350Pbt instanceof InterfaceC648070PbR)) {
            C646200PWg.LJ(interfaceC648350Pbt);
        }
        this.LIZ = interfaceC648350Pbt;
        interfaceC648350Pbt.W0(150L, c587060N0u);
        C650650Pfb c650650Pfb = (C650650Pfb) this.LJ.getValue();
        if (c650650Pfb.LIZ().size() >= c650650Pfb.LIZ) {
            ListProtector.remove(c650650Pfb.LIZ(), 0);
        }
        if (!c650650Pfb.LIZ().contains(interfaceC648350Pbt)) {
            c650650Pfb.LIZ().add(interfaceC648350Pbt);
        }
        System.currentTimeMillis();
        if (LJIIIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("play playable, current: ");
            InterfaceC648350Pbt interfaceC648350Pbt5 = this.LIZ;
            if (interfaceC648350Pbt5 != null) {
                debugId2 = interfaceC648350Pbt5.getDebugId();
            }
            sbLIZ2.append(debugId2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public final void LJIILIIL(String str, InterfaceC648350Pbt interfaceC648350Pbt) {
        if (interfaceC648350Pbt == null) {
            return;
        }
        ((Handler) this.LIZLLL.getValue()).removeCallbacksAndMessages(null);
        if (C650690Pff.LIZ < 0) {
            C650690Pff.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_player_release_opt", true);
        }
        if (C650690Pff.LIZ == 1 && C650700Pfg.LIZ.size() >= 3) {
            C786410Ut5.LJJZZIII((Handler) this.LIZLLL.getValue(), new ARunnableS15S1200000_10(this, str, interfaceC648350Pbt, 4));
        }
    }
}
