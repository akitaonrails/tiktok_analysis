package X;

import Y.ARunnableS91S0200000_22;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433740nPg {
    public final List<C1433530nPL> LIZ = Collections.synchronizedList(new ArrayList());
    public final boolean LIZIZ;

    public final synchronized List<PublishModel> LIZJ() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<C1433530nPL> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAllPublishModel size=");
        sbLIZ.append(arrayList.size());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return arrayList;
    }

    public final synchronized int LJ() {
        return this.LIZ.size();
    }

    public final synchronized C1433530nPL LJI() {
        if (this.LIZ.size() <= 0) {
            return null;
        }
        return (C1433530nPL) ListProtector.get(this.LIZ, 0);
    }

    public final synchronized boolean LJIIJJI() {
        Iterator<C1433530nPL> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZLLL instanceof C1433490nPH) {
                return true;
            }
        }
        return false;
    }

    public final void LJII() {
        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(341);
        synchronized (this) {
            Iterator<C1433530nPL> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                aFwS261S0000000_22.invoke(it2.next());
            }
        }
    }

    public C1433740nPg() {
        C1433730nPf.LIZ.getClass();
        this.LIZIZ = C1433730nPf.LIZIZ;
    }

    public final synchronized void LIZ(C1433530nPL c1433530nPL) {
        AbstractC1433190nOn abstractC1433190nOn = c1433530nPL.LIZLLL;
        if (!Intrinsics.LJFF(abstractC1433190nOn, C1433220nOq.LIZ) && !(abstractC1433190nOn instanceof C1433490nPH)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("record state is incorrect, state = ");
            sbLIZ.append(abstractC1433190nOn);
            C1433760nPi.LIZ(new C1433790nPl(C2188811AlT.LIZIZ(sbLIZ)));
        }
        c1433530nPL.LIZ.LIZJ = System.currentTimeMillis();
        ListProtector.add(this.LIZ, 0, c1433530nPL);
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = c1433530nPL.LJI;
        if (interfaceRunnableC1433480nPG != null) {
            interfaceRunnableC1433480nPG.LJL();
        }
        PublishProgressDialogAddHelper publishProgressDialogAddHelper = PublishProgressDialogAddHelper.LIZ;
        String str = c1433530nPL.LIZIZ;
        publishProgressDialogAddHelper.getClass();
        PublishProgressDialogAddHelper.LIZJ(str);
        if (this.LIZIZ) {
            InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG2 = c1433530nPL.LJI;
            if (interfaceRunnableC1433480nPG2 != null) {
                C1433730nPf.LIZ.getClass();
                C1433730nPf.LJI.execute(interfaceRunnableC1433480nPG2);
            }
            LJIIIIZZ(c1433530nPL);
        }
    }

    public final synchronized PublishModel LIZLLL(String str) {
        for (C1433530nPL c1433530nPL : this.LIZ) {
            if (Intrinsics.LJFF(c1433530nPL.LIZIZ, str)) {
                return c1433530nPL.LIZ;
            }
        }
        if (this.LIZ.size() > 0) {
            return ((C1433530nPL) ListProtector.get(this.LIZ, r1.size() - 1)).LIZ;
        }
        return null;
    }

    public final synchronized C1433500nPI LJFF(String str) {
        C1433500nPI c1433500nPI;
        C1433530nPL next;
        Iterator<C1433530nPL> it2 = this.LIZ.iterator();
        do {
            c1433500nPI = null;
            if (!it2.hasNext()) {
                return null;
            }
            next = it2.next();
        } while (!Intrinsics.LJFF(next.LIZIZ, str));
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = next.LJI;
        if (interfaceRunnableC1433480nPG instanceof C1433500nPI) {
            c1433500nPI = (C1433500nPI) interfaceRunnableC1433480nPG;
        }
        return c1433500nPI;
    }

    public final void LJIIIIZZ(final C1433530nPL c1433530nPL) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerRecordInterceptor, record = ");
        sbLIZ.append(c1433530nPL.LIZIZ);
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C157K c157k = C157K.LJIIIIZZ;
        C157N c157n = new C157N() { // from class: X.0nPh
            @Override // X.C157N
            public final void LIZIZ() {
            }

            @Override // X.C157N
            public final boolean LIZ(InterfaceC20334914hX interfaceC20334914hX, String str) {
                if (!Intrinsics.LJFF(c1433530nPL.LIZIZ, str)) {
                    return false;
                }
                C1433740nPg c1433740nPg = this;
                String str2 = c1433530nPL.LIZIZ;
                c1433740nPg.getClass();
                Iterator it2 = new ArrayList(c1433740nPg.LIZ).iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((C1433530nPL) it2.next()).LIZIZ, str2)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (!Intrinsics.LJFF(interfaceC20334914hX, C1433780nPk.LIZLLL) || i <= 0) {
                    return false;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("intercept, index=");
                sbLIZ2.append(i);
                sbLIZ2.append(" netId=");
                sbLIZ2.append(str);
                sbLIZ2.append(" workType = ");
                sbLIZ2.append(interfaceC20334914hX.LIZIZ());
                C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                return true;
            }

            @Override // X.C157N
            public final void LIZJ(String str, C157J c157j) {
                if (!Intrinsics.LJFF(c1433530nPL.LIZIZ, str)) {
                    return;
                }
                if (c157j == C157J.WAVE_NET_TIMEOUT) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cancel running net, netId = ");
                    sbLIZ2.append(str);
                    C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = c1433530nPL.LJI;
                    if (interfaceRunnableC1433480nPG != null) {
                        C1433700nPc c1433700nPc = new C1433700nPc();
                        c1433700nPc.LIZ = "cancel_by_wave_net_timeout";
                        interfaceRunnableC1433480nPG.LJIILL(c1433700nPc.LIZ());
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("unRegisterRecordInterceptor, record = ");
                sbLIZ3.append(c1433530nPL.LIZIZ);
                C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                C157K.LJIIIIZZ.getClass();
                C157K.LJFF("removeInterceptor");
                C157K.LIZIZ.remove(this);
            }
        };
        c157k.getClass();
        C157K.LJFF("registerInterceptor");
        C157K.LIZIZ.add(c157n);
    }

    public final synchronized void LJIIIZ(C1433530nPL c1433530nPL) {
        AbstractC1433840nPq abstractC1433840nPq;
        C1433530nPL next;
        AbstractC1433190nOn abstractC1433190nOn = c1433530nPL.LIZLLL;
        if (!(abstractC1433190nOn instanceof C1433210nOp) && !(abstractC1433190nOn instanceof C1433490nPH) && !(abstractC1433190nOn instanceof C1433200nOo)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("record state is incorrect, state = ");
            sbLIZ.append(abstractC1433190nOn);
            C1433760nPi.LIZ(new C1433790nPl(C2188811AlT.LIZIZ(sbLIZ)));
        }
        if (this.LIZ.remove(c1433530nPL) && this.LIZIZ && (!this.LIZ.isEmpty())) {
            C1433530nPL c1433530nPL2 = (C1433530nPL) C13LP.LJJJJZI(this.LIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("manualTriggerInterceptedTask netId=");
            sbLIZ2.append(c1433530nPL2.LIZIZ);
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C157K c157k = C157K.LJIIIIZZ;
            if (c1433530nPL2.LJIIIZ) {
                abstractC1433840nPq = C1433780nPk.LIZLLL;
            } else {
                abstractC1433840nPq = C1433780nPk.LIZJ;
            }
            C157K.LJI(c157k, abstractC1433840nPq, c1433530nPL2.LIZIZ);
            Iterator<C1433530nPL> it2 = this.LIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZLLL, C1433220nOq.LIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1433530nPL c1433530nPL3 = next;
            if (c1433530nPL3 != null) {
                LJIIL(c1433530nPL3, true);
            }
        }
    }

    public final synchronized void LIZIZ(C1433530nPL c1433530nPL, boolean z) {
        AbstractC1433190nOn abstractC1433190nOn = c1433530nPL.LIZLLL;
        if (!Intrinsics.LJFF(abstractC1433190nOn, C1433220nOq.LIZ) && !(abstractC1433190nOn instanceof C1433490nPH)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("record state is incorrect, state = ");
            sbLIZ.append(abstractC1433190nOn);
            C1433760nPi.LIZ(new C1433790nPl(C2188811AlT.LIZIZ(sbLIZ)));
        }
        c1433530nPL.LIZ.LIZJ = System.currentTimeMillis();
        this.LIZ.add(c1433530nPL);
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = c1433530nPL.LJI;
        if (interfaceRunnableC1433480nPG != null) {
            interfaceRunnableC1433480nPG.LJL();
        }
        PublishProgressDialogAddHelper publishProgressDialogAddHelper = PublishProgressDialogAddHelper.LIZ;
        String str = c1433530nPL.LIZIZ;
        publishProgressDialogAddHelper.getClass();
        PublishProgressDialogAddHelper.LIZJ(str);
        if (this.LIZIZ && z) {
            LJIIL(c1433530nPL, false);
        }
    }

    public final synchronized void LJIIJ(ExecutorService executorService, C1433230nOr c1433230nOr) {
        executorService.execute(new ARunnableS91S0200000_22(this, c1433230nOr, 40));
    }

    public final void LJIIL(C1433530nPL c1433530nPL, boolean z) {
        String str;
        C1433730nPf.LIZ.getClass();
        if (!C1433730nPf.LJIJJ()) {
            InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = c1433530nPL.LJI;
            if (interfaceRunnableC1433480nPG != null) {
                C1433730nPf.LJI.execute(interfaceRunnableC1433480nPG);
            }
            LJIIIIZZ(c1433530nPL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("executePublishRecord is ");
            if (z) {
                str = "resumed";
            } else {
                str = "allowed";
            }
            sbLIZ.append(str);
            sbLIZ.append(", recordId=");
            sbLIZ.append(c1433530nPL.LIZIZ);
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("executePublishRecord is blocked, recordId=");
        sbLIZ2.append(c1433530nPL.LIZIZ);
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
