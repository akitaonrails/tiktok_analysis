package X;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0xvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837660xvA extends AbstractC1837730xvH {
    public final EnumC1837790xvN LLILZ;
    public final C01GW LLILZIL;

    @Override // X.AbstractC1837630xv7
    public final void LJII() {
        WeakReference<Activity> weakReference;
        Activity activity;
        Context baseContext;
        FETCH_DATA fetch_data = this.LLILLL;
        if (fetch_data != 0 && (weakReference = fetch_data.LIZ) != null && (activity = weakReference.get()) != null && (baseContext = activity.getBaseContext()) != null) {
            ((InterfaceC1791930wjP) this.LLILZIL.getValue()).LJIIIIZZ(baseContext, new InterfaceC1791820wjE() { // from class: X.0xvB
                @Override // X.InterfaceC1791820wjE
                public final void LIZ(C1791770wj9 c1791770wj9) {
                    if (c1791770wj9.LIZ) {
                        C1837850xvT c1837850xvT = this.LIZ.LLILLJJLI;
                        if (c1837850xvT != null) {
                            c1837850xvT.LIZ.LIZJ(c1791770wj9, false);
                            return;
                        }
                        return;
                    }
                    C1837850xvT c1837850xvT2 = this.LIZ.LLILLJJLI;
                    if (c1837850xvT2 != null) {
                        C1837850xvT.LIZ(c1837850xvT2, new C1837280xuY(c1791770wj9));
                    }
                    int i = C1837800xvO.LIZ[this.LIZ.LLILZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            C1792880wkw c1792880wkw = new C1792880wkw(c1791770wj9, null);
                            C1837850xvT c1837850xvT3 = this.LIZ.LLILLJJLI;
                            if (c1837850xvT3 == null) {
                                return;
                            }
                            c1837850xvT3.LIZIZ(c1792880wkw);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    C1837850xvT c1837850xvT4 = this.LIZ.LLILLJJLI;
                    if (c1837850xvT4 == null) {
                        return;
                    }
                    c1837850xvT4.LIZ.LIZJ(c1791770wj9, false);
                }
            }, "802BCRYK2801");
            return;
        }
        int i = C1837780xvM.LIZ[this.LLILZ.ordinal()];
        if (i == 1) {
            C1837850xvT c1837850xvT = this.LLILLJJLI;
            if (c1837850xvT != null) {
                c1837850xvT.LIZ.LIZJ(null, false);
                return;
            }
            return;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        C1837850xvT c1837850xvT2 = this.LLILLJJLI;
        if (c1837850xvT2 != null) {
            c1837850xvT2.LIZIZ(new C1792880wkw(null, null));
        }
    }

    public C1837660xvA(EnumC1837790xvN enumC1837790xvN, final EnumC1837330xud enumC1837330xud) {
        new AbstractC1837630xv7<AbstractC1837610xv5>(enumC1837330xud) { // from class: X.0xvH
            @Override // X.AbstractC1837630xv7, X.AbstractC1837840xvS
            public final void LJI(C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof AbstractC1837610xv5) {
                        if (next != null) {
                            this.LLILLL = (FETCH_DATA) next;
                            super.LJI(c1404610meh);
                            return;
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.comp.api.pcs.infra.payment.model.PaymentGlobalDataContainer");
            }
        };
        this.LLILZ = enumC1837790xvN;
        this.LLILZIL = C452501pT.LIZIZ(new C0TTM());
    }
}
