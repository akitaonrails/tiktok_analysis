package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0U3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766120U3m implements C0U69<LiveEffect> {
    public long LIZ = System.currentTimeMillis();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 814));

    @Override // X.C0U69
    public final List<C0U74<LiveEffect>> LJIIIZ(List<C0U74<LiveEffect>> list) {
        C770170UJb.LIZLLL = "";
        Iterator<Object> it2 = new C1939607ik(list).iterator();
        while (it2.hasNext()) {
            for (T t : ((C0U74) it2.next()).LIZIZ) {
                C766720U5u c766720U5u = C766720U5u.LIZ;
                Effect effect = t.LIZJ;
                c766720U5u.getClass();
                if (!C766720U5u.LJIIZILJ(effect)) {
                    this.LIZ = System.currentTimeMillis();
                    C766720U5u.LJ(t, (C0U45) this.LIZIZ.getValue());
                }
            }
        }
        C0U74 c0u74 = (C0U74) C13LP.LJJJLL(list);
        if (c0u74 != null) {
            C761210TtX.LIZIZ(c0u74.LIZIZ);
        }
        return list;
    }
}
