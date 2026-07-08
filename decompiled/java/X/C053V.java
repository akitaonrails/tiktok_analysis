package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.frequencycontrol.impl.exp.FrequencyDisableSettingsData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.053V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053V implements InterfaceC1411705fn {
    public static final C053V LJ = new C053V(C053W.LJIIIIZZ);
    public final C053W LIZ;
    public final EnumC1502105uN LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;

    public final C053S<?> LIZ() {
        return (C053S) this.LIZJ.getValue();
    }

    public C053V(C053W c053w) {
        this.LIZ = c053w;
        if (((Number) C12902053c.LIZ.getValue()).intValue() == 1 && c053w.LIZIZ.LIZLLL == EnumC12929054d.LOGIN) {
            C0I0B.LJFF.LIZ().LIZLLL(new InterfaceC908170Zjz() { // from class: X.053X
                @Override // X.InterfaceC908170Zjz
                public final void onAccountResult(int i, boolean z, int i2, User user) {
                    try {
                        C053V c053v = this.LL;
                        c053v.getClass();
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(((C053U) c053v.LIZLLL.getValue()).LIZ());
                        arrayList.addAll(c053v.LIZ().LIZ());
                        List listLJJJJI = C13LP.LJJJJI(arrayList);
                        C053V c053v2 = this.LL;
                        Iterator it2 = listLJJJJI.iterator();
                        while (it2.hasNext()) {
                            c053v2.LIZJ((String) it2.next());
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
        }
        this.LIZIZ = c053w.LIZIZ.LIZJ;
        this.LIZJ = C452501pT.LIZIZ(new C053O(this));
        this.LIZLLL = C452501pT.LIZIZ(new C053P(this));
    }

    public static boolean LJ(EnumC1502105uN enumC1502105uN) {
        return ((FrequencyDisableSettingsData) AnonymousClass0549.LIZIZ.getValue()).businessScopeList.contains(enumC1502105uN);
    }

    @Override // X.InterfaceC1411705fn
    public final void LIZJ(String str) {
        if (LJ(this.LIZIZ)) {
            return;
        }
        ((C053U) this.LIZLLL.getValue()).LIZJ(str);
        LIZ().LIZLLL(str);
    }

    @Override // X.InterfaceC1411705fn
    public final boolean LIZIZ(long j, String str) {
        if (LJ(this.LIZIZ)) {
            return true;
        }
        boolean zLIZIZ = ((C053U) this.LIZLLL.getValue()).LIZIZ(j, str);
        if (zLIZIZ) {
            LIZ().LJFF(str);
            LIZ().LIZLLL(str);
        }
        return zLIZIZ;
    }

    @Override // X.InterfaceC1411705fn
    public final void LIZLLL(long j, long j2, String str) {
        if (LJ(this.LIZIZ) || ((C053U) this.LIZLLL.getValue()).LIZIZ(j2, str)) {
            return;
        }
        LIZ().LIZIZ(j, j2, str);
        if (LIZ().LJI(j2, str)) {
            ((C053U) this.LIZLLL.getValue()).LJ(j, j2, str);
        }
    }
}
