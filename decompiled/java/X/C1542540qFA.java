package X;

import android.content.Context;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0qFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1542540qFA implements InterfaceC1541730qDr, InterfaceC1541860qE4, C0V1Y {
    public C1541610qDf LL;
    public final C1542660qFM LLILLJJLI = new C1542660qFM();

    @Override // X.InterfaceC1541730qDr
    public final C1541620qDg getExtendableContext() {
        C1542660qFM c1542660qFM = this.LLILLJJLI;
        if (c1542660qFM == null) {
            return null;
        }
        return c1542660qFM.LIZ;
    }

    @Override // X.InterfaceC1541730qDr
    public final void LIZIZ(C1541610qDf c1541610qDf) {
        this.LL = c1541610qDf;
        this.LLILLJJLI.LIZ = new C1541620qDg(this.LL, this);
    }

    public final void LIZJ(C1ET2 c1et2) {
        if (c1et2.getExtendableContext() != null) {
            return;
        }
        c1et2.LIZIZ(this.LL);
        C2205951BVh c2205951BVh = new C2205951BVh();
        C1BVW c1bvw = new C1BVW();
        c2205951BVh.LIZIZ(this.LL);
        c1et2.setExtendableWebViewClient(c2205951BVh);
        c1bvw.LIZIZ(this.LL);
        c1et2.setExtendableWebViewClient(c1bvw);
        LinkedHashSet<Class<? extends AbstractC1541650qDj>> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(C2206041BVq.class);
        linkedHashSet.addAll(this.LL.LIZJ);
        c1et2.getExtendableContext().LIZIZ(linkedHashSet);
        c1et2.getExtendableContext().getClass();
    }

    public InterfaceC1541840qE2 LIZLLL(Context context) {
        C1ET2 c1et2 = new C1ET2(context);
        LIZJ(c1et2);
        return c1et2;
    }

    public C1ET2 LIZ(Context context, C1541530qDX c1541530qDX) {
        Set<Class<? extends AbstractC1541650qDj>> set;
        HashMap<Class<? extends AbstractC1541650qDj>, InterfaceC1541740qDs> map;
        C1ET2 c1et2 = null;
        if (c1541530qDX != null) {
            InterfaceC1541840qE2 interfaceC1541840qE2 = c1541530qDX.LIZJ;
            if (interfaceC1541840qE2 instanceof C1ET2) {
                c1et2 = (C1ET2) interfaceC1541840qE2;
            }
            map = c1541530qDX.LIZIZ;
            set = c1541530qDX.LIZ;
            if (c1et2 != null) {
                LIZJ(c1et2);
            }
            c1et2.getExtendableContext().LJ = map;
            c1et2.getExtendableContext().LIZ(set);
            return c1et2;
        }
        set = null;
        map = null;
        c1et2 = (C1ET2) LIZLLL(context);
        c1et2.getExtendableContext().LJ = map;
        c1et2.getExtendableContext().LIZ(set);
        return c1et2;
    }
}
