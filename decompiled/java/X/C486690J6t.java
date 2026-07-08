package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0J6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486690J6t implements InterfaceC482440Ivy {
    public static final C01GW<C486690J6t> LIZJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C486720J6w());
    public final List<Long> LIZ = new CopyOnWriteArrayList();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C486710J6v());

    public final Map<String, C486730J6x> LIZ() {
        return (Map) this.LIZIZ.getValue();
    }

    public C486690J6t() {
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).observeAccountChange(new C0J7I() { // from class: X.0J6u
            @Override // X.C0J7I
            public final void LIZ() {
                C486690J6t c486690J6t = this.LIZ;
                ((CopyOnWriteArrayList) c486690J6t.LIZ).clear();
                c486690J6t.LIZ().clear();
            }
        });
    }

    public final Room LIZIZ(C0IVO c0ivo) {
        Room room;
        C486730J6x c486730J6x = LIZ().get(c0ivo.getKey());
        if (c486730J6x == null) {
            return null;
        }
        if (System.currentTimeMillis() < c486730J6x.LIZIZ) {
            room = c486730J6x.LIZ;
        } else {
            room = null;
        }
        c486730J6x.LIZ = null;
        return room;
    }

    public final boolean LIZJ(C0IVO c0ivo) {
        C486730J6x c486730J6x = LIZ().get(c0ivo.getKey());
        if (c486730J6x == null || System.currentTimeMillis() >= c486730J6x.LIZIZ || c486730J6x.LIZ == null) {
            return false;
        }
        return true;
    }
}
