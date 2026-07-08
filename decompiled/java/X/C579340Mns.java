package X;

import X.InterfaceC579390Mnx;
import X.InterfaceC579410Mnz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Mns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579340Mns<STATE extends InterfaceC579410Mnz, ACTION extends InterfaceC579390Mnx> {
    public static final /* synthetic */ int LJ = 0;
    public STATE LIZ = EnumC579360Mnu.LL;
    public final C11PQ<C579370Mnv<STATE, ACTION>> LIZIZ;
    public final C19475711Hn LIZJ;
    public final HashMap<STATE, HashMap<ACTION, STATE>> LIZLLL;

    public C579340Mns() {
        C11PQ<C579370Mnv<STATE, ACTION>> c11pq = new C11PQ<>();
        this.LIZIZ = c11pq;
        this.LIZJ = new C19475711Hn(c11pq);
        this.LIZLLL = new HashMap<>();
    }

    public final void LIZIZ(EnumC579350Mnt enumC579350Mnt, Object obj) {
        STATE state;
        HashMap<ACTION, STATE> map = this.LIZLLL.get(this.LIZ);
        if (map != null && (state = map.get(enumC579350Mnt)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Transitioning from [");
            sbLIZ.append(this.LIZ);
            sbLIZ.append("] to [");
            sbLIZ.append(state);
            sbLIZ.append("] by action ");
            sbLIZ.append(enumC579350Mnt);
            sbLIZ.append(" params: ");
            sbLIZ.append(obj);
            C576730Mjf.LJIIIZ("StateMachine", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZIZ.onNext(new C579370Mnv<>(this.LIZ, state, enumC579350Mnt, obj));
            this.LIZ = state;
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("No transition from [");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append("] by action ");
        sbLIZ2.append(enumC579350Mnt);
        C576730Mjf.LJIIIZ("StateMachine", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZ(EnumC579360Mnu enumC579360Mnu, EnumC579360Mnu enumC579360Mnu2, List list) {
        HashMap<STATE, HashMap<ACTION, STATE>> map = this.LIZLLL;
        HashMap map2 = map.get(enumC579360Mnu);
        if (map2 == null) {
            map2 = new HashMap();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            map2.put(it2.next(), enumC579360Mnu2);
        }
        map.put(enumC579360Mnu, (HashMap<ACTION, STATE>) map2);
    }
}
