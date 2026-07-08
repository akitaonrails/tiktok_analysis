package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.experiment.PGCRestructurePreCheckSettings;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0KL3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KL3 extends C0KLE<PGCTemplateListData> {
    public C0KLA LIZIZ;
    public C0KCK LIZJ = new C0KCK(null, false, 0, null, 127);
    public final C0KLH LIZLLL = new C0KLH();
    public final C513470KBt LJ;

    @Override // X.C0KLE
    public final void LIZJ() {
        C0KLA c0kla = this.LIZIZ;
        if (c0kla == null) {
            return;
        }
        new C0KL2(c0kla).LIZ(this.LIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.C0KLE
    public final boolean LIZLLL() {
        Pair<C00CC<PGCTemplateListData>, PGCTemplateListData> pair;
        Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> map;
        Boolean boolValueOf;
        C0KLD c0kld;
        String str;
        C0KLA c0kla;
        Pair<C00CC<PGCTemplateListData>, PGCTemplateListData> pair2;
        PGCTemplateListData second;
        C0KLA c0kla2 = this.LIZIZ;
        if (c0kla2 == null || !c0kla2.LIZIZ) {
            return false;
        }
        C513470KBt c513470KBt = this.LJ;
        String str2 = c0kla2.LIZ;
        int i = c0kla2.LIZJ;
        EnumC513480KBu enumC513480KBu = c0kla2.LJII;
        c513470KBt.getClass();
        C0K7R c0k7rLIZJ = C513470KBt.LIZJ(str2, i, enumC513480KBu);
        if (c0k7rLIZJ == null || (pair = c0k7rLIZJ.LIZ) == null || (map = c0k7rLIZJ.LIZIZ) == null) {
            return false;
        }
        EnumC513480KBu enumC513480KBu2 = c0kla2.LJII;
        PGCTemplateInfo pGCTemplateInfo = null;
        if (enumC513480KBu2 != null) {
            boolValueOf = Boolean.valueOf(c0k7rLIZJ.LIZJ.contains(enumC513480KBu2) && !((c0kla = this.LIZIZ) != null && c0kla.LJI && ((pair2 = c0k7rLIZJ.LIZ) == null || (second = pair2.getSecond()) == null || second.preCheckResult == null)));
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || (c0kld = c0kla2.LJIIJ) == null) {
            return false;
        }
        List<PGCTemplateInfo> list = pair.getSecond().templateList;
        Iterator<PGCTemplateInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PGCTemplateInfo next = it2.next();
            if (next.isDefaultPackage) {
                pGCTemplateInfo = next;
                break;
            }
        }
        PGCTemplateInfo pGCTemplateInfo2 = pGCTemplateInfo;
        if (pGCTemplateInfo2 == null || (str = pGCTemplateInfo2.packageId) == null) {
            PGCTemplateInfo pGCTemplateInfo3 = (PGCTemplateInfo) C13LP.LJJJLL(list);
            str = pGCTemplateInfo3 != null ? pGCTemplateInfo3.packageId : "";
        }
        c0kld.LIZJ(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        PGCTemplateListData second2 = pair.getSecond();
        System.currentTimeMillis();
        pair.getFirst();
        c0kld.LIZLLL(jCurrentTimeMillis, second2);
        System.currentTimeMillis();
        c0kld.LIZIZ();
        C0KCK c0kck = new C0KCK(pair.getSecond(), true, pair.getSecond().subScenario, pair.getSecond().activeContract, 96);
        this.LIZJ = c0kck;
        c0kld.LJFF(map, c0kck);
        C513840KDe.LJIILL(map);
        c0k7rLIZJ.LIZJ.remove(EnumC513480KBu.NORMAL_SUBSCRIPTION);
        return true;
    }

    public C0KL3() {
        new LinkedHashSet();
        this.LJ = C513470KBt.LIZ;
    }

    @Override // X.C0KLE
    public final void LIZ(PGCTemplateListData pGCTemplateListData) {
        PGCTemplateListData pGCTemplateListData2 = pGCTemplateListData;
        C0KLA c0kla = this.LIZIZ;
        if (c0kla != null) {
            if (PGCRestructurePreCheckSettings.INSTANCE.isEnabled()) {
                new C515900KLc(this.LIZJ, this.LIZLLL).LIZIZ(pGCTemplateListData2, c0kla);
            } else {
                new C515900KLc(this.LIZJ, this.LIZLLL).LIZ(pGCTemplateListData2, c0kla);
            }
        }
    }

    @Override // X.C0KLE
    public final void LIZIZ(InterfaceC511950K5x interfaceC511950K5x) {
        C0KLA c0kla;
        if ((interfaceC511950K5x instanceof C0KLA) && (c0kla = (C0KLA) interfaceC511950K5x) != null) {
            this.LIZIZ = c0kla;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0KL5(c0kla, this, interfaceC511950K5x, null), 3);
        }
    }
}
