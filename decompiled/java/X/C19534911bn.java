package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.11bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19534911bn extends AbstractC19535411bs<C19534711bl> {
    public C19534711bl LIZIZ;

    @Override // X.InterfaceC19535811bw
    public final void LIZ() {
        LIZJ(new AbstractC19535311br<C19534711bl>() { // from class: X.11bk
            @Override // X.AbstractC19535311br
            public final int LIZ() {
                return 10;
            }

            @Override // X.AbstractC19535311br
            public final Object LIZJ(C19535011bo c19535011bo, C19535611bu c19535611bu) {
                C19534711bl c19534711bl = (C19534711bl) c19535011bo;
                List<C19536311c1> list = c19534711bl.LIZJ;
                c19534711bl.LIZLLL = list;
                if (list != null) {
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C19536311c1 c19536311c1 : list) {
                        if (map.get(c19536311c1.LIZJ.getEffectId()) == null) {
                            String effectId = c19536311c1.LIZJ.getEffectId();
                            C119V c119v = new C119V();
                            c119v.LIZIZ = c19536311c1.LIZJ;
                            C2299808zk c2299808zkLIZ = C2296208zA.LIZ();
                            Effect effect = c119v.LIZIZ;
                            c2299808zkLIZ.getClass();
                            boolean zLIZ = C2299808zk.LIZ(effect);
                            c119v.LIZ = zLIZ;
                            if (!zLIZ) {
                                arrayList2.add(c19536311c1.LIZJ);
                            }
                            map.put(effectId, c119v);
                            arrayList.add(c19536311c1.LIZJ);
                        }
                    }
                    c19534711bl.LJ = arrayList2;
                    return true;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        LIZJ(new AbstractC19535311br<C19534711bl>() { // from class: X.11bm
            @Override // X.AbstractC19535311br
            public final int LIZ() {
                return 20;
            }

            @Override // X.AbstractC19535311br
            public final Object LIZJ(C19535011bo c19535011bo, C19535611bu c19535611bu) {
                return C2296808zG.LJ(new C1222840hvW((C19534711bl) c19535011bo, null), c19535611bu);
            }
        });
    }

    public final C19535011bo LIZLLL() {
        C19534711bl c19534711bl = this.LIZIZ;
        if (c19534711bl == null) {
            return null;
        }
        return c19534711bl;
    }
}
