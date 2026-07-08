package X;

import X.AnonymousClass1636;
import X.C0S5Q;
import X.C164G;

/* JADX INFO: renamed from: X.1637, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AnonymousClass1637<ITEM, USECASE extends AnonymousClass1636<ITEM, ? extends C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>, DATA extends C164G, STATE extends C0S5Q> {
    public final USECASE LIZ;
    public final C161Q<?> LIZIZ;
    public final C2252321DDq LIZJ;
    public ITEM LIZLLL;
    public String LJ;
    public STATE LJFF;
    public final C2252321DDq LJI;

    public abstract DATA LIZIZ(STATE state, STATE state2, ITEM item, EnumC715680S5m enumC715680S5m);

    public abstract DATA LIZJ();

    public boolean LIZLLL() {
        return false;
    }

    public AnonymousClass1637(USECASE usecase, C161Q<?> c161q) {
        this.LIZ = usecase;
        this.LIZIZ = c161q;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(LIZJ());
        this.LIZJ = c2252321DDqLIZ;
        this.LJI = c2252321DDqLIZ;
    }

    public final void LJ(STATE state, EnumC715680S5m enumC715680S5m) {
        if (state == null) {
            return;
        }
        C164G c164gLIZIZ = LIZIZ(state, this.LJFF, this.LIZLLL, enumC715680S5m);
        if (c164gLIZIZ != null) {
            this.LIZJ.setValue(c164gLIZIZ);
        }
        this.LJFF = state;
    }
}
