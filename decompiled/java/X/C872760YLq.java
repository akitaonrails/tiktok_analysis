package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872760YLq implements InterfaceC878180Yci, C0YG2, InterfaceC872780YLs {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C0YHX LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C872770YLr());
    public long LLILLL = -1;
    public final C054G LLILZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final Set<String> LLILZIL = new CopyOnWriteArraySet();

    @Override // X.C0YG2
    public final void I02(List<String> list) {
    }

    @Override // X.InterfaceC872780YLs
    public final void LIZ() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LJ();
        C883520YlK c883520YlK = C883520YlK.LIZ;
        boolean zLIZJ = C883520YlK.LIZJ();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNetworkStateChanged: ");
        sbLIZ.append(zLIZJ);
        C882690Yjz.LJIIIZ("MessageRequestModelImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZJ) {
            LIZJ(1);
        }
    }

    @Override // X.InterfaceC878180Yci
    public final List<String> LJII() {
        return this.LL.LJI().LJII();
    }

    @Override // X.InterfaceC878180Yci
    public final void LJIILJJIL() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("MessageRequestModelImpl", "refreshStrangerBox");
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C610270Nwf(this, null), 3);
    }

    public C872760YLq(C0YHX c0yhx) {
        this.LL = c0yhx;
        c0yhx.LJI().LIZJ(this);
        C882400YjW.LIZ.getClass();
        C882400YjW.LJ();
        C883520YlK c883520YlK = C883520YlK.LIZ;
        C883520YlK.LIZ(this);
    }

    public final void LIZJ(int i) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.LLILLL;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshStrangerBoxInternal: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(jUptimeMillis);
        sbLIZ.append(", ");
        sbLIZ.append(this.LL.LJIIL().isLogin());
        C882690Yjz.LJIIIZ("MessageRequestModelImpl", C2188811AlT.LIZIZ(sbLIZ));
        C882400YjW.LJ();
        C883520YlK c883520YlK = C883520YlK.LIZ;
        boolean zLIZJ = C883520YlK.LIZJ();
        if (jUptimeMillis >= 10000 && this.LL.LJIIL().isLogin()) {
            this.LLILLL = SystemClock.uptimeMillis();
            if (zLIZJ) {
                this.LL.LJI().LIZLLL();
            } else {
                this.LL.LJI().LJ(C1719206oI.LIZ, true);
            }
        }
    }

    @Override // X.InterfaceC878180Yci
    public final boolean LJI(C869590Y9l c869590Y9l) {
        return this.LL.LJI().LJI(c869590Y9l);
    }

    @Override // X.InterfaceC878180Yci
    public final void LJIIIZ(C0YG2 c0yg2) {
        ((CopyOnWriteArraySet) this.LLILLJJLI.getValue()).add(c0yg2);
    }

    @Override // X.InterfaceC878180Yci
    public final List<C0Y9G> LJIIJ(EnumC871430YGn enumC871430YGn) {
        return this.LL.LJI().LJIJI(enumC871430YGn);
    }

    @Override // X.InterfaceC878180Yci
    public final void LJIIL(C0YG2 c0yg2) {
        ((CopyOnWriteArraySet) this.LLILLJJLI.getValue()).remove(c0yg2);
    }

    @Override // X.InterfaceC878180Yci
    public final void LJIILIIL(InterfaceC1719106oH interfaceC1719106oH) {
        if (this.LL.LJIIL().isLogin()) {
            this.LL.LJI().LJ(interfaceC1719106oH, true);
        }
    }

    @Override // X.C0YG2
    public final void xf0(C876610YaB c876610YaB) {
        C05RV c05rvLIZJ;
        NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
        if (noticeFeatureLIZ != null) {
            c05rvLIZJ = noticeFeatureLIZ.LIZJ();
        } else {
            c05rvLIZJ = null;
        }
        if (c05rvLIZJ == C05RV.BUSINESS_INBOX) {
            synchronized (this) {
                List<String> listLJII = this.LL.LJI().LJII();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("autoAcceptForBusinessInbox, remainedMessageRequestIdList size: ");
                sbLIZ.append(listLJII.size());
                sbLIZ.append('}');
                C2188811AlT.LIZIZ(sbLIZ);
                if (!listLJII.isEmpty()) {
                    Set<String> setLJLLLLLL = C13LP.LJLLLLLL(listLJII, this.LLILZIL);
                    if (!setLJLLLLLL.isEmpty()) {
                        ((CopyOnWriteArraySet) this.LLILZIL).addAll(setLJLLLLLL);
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setLJLLLLLL, 10));
                        for (String str : setLJLLLLLL) {
                            arrayList.add(new Pair(Long.valueOf(C0YNP.LJII(str)), str));
                        }
                        C23250099c.LIZLLL(this.LLILZ, null, null, new C610240Nwc(arrayList, this, null), 3);
                    }
                }
            }
        }
        Iterator it2 = ((CopyOnWriteArraySet) this.LLILLJJLI.getValue()).iterator();
        while (it2.hasNext()) {
            ((C0YG2) it2.next()).xf0(c876610YaB);
        }
    }

    @Override // X.InterfaceC878180Yci
    public final void LJIIIIZZ(Pair pair, EnumC868530Y5j enumC868530Y5j, C1769006wK c1769006wK) {
        C23250099c.LIZLLL(this.LLILZ, null, null, new C610250Nwd(this, pair, enumC868530Y5j, c1769006wK, null), 3);
    }

    @Override // X.InterfaceC878180Yci
    public final void LJIIJJI(List list, EnumC868530Y5j enumC868530Y5j, C885750Yov c885750Yov) {
        C23250099c.LIZLLL(this.LLILZ, null, null, new C610260Nwe(this, list, enumC868530Y5j, c885750Yov, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<kotlin.Pair<java.lang.Long, java.lang.String>> r12, X.EnumC868530Y5j r13, X.InterfaceC863600XuI<java.util.List<java.lang.String>> r14, X.EnumC1477205qM r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872760YLq.LIZIZ(java.util.List, X.0Y5j, X.0XuI, X.05qM, X.05Vn):java.lang.Object");
    }
}
