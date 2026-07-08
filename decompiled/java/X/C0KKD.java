package X;

import com.bytedance.android.livesdk.subscribe.model.PreCheckResult;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KKD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KKD extends AbstractC515830KKv<TemplateListData> {
    public C0KJX LIZIZ;
    public C0KH1 LIZJ = new C0KH1(null, false, 0, null, null, null, 127);
    public final C0KKQ LIZLLL = new C0KKQ();
    public final Set<String> LJ = new LinkedHashSet();
    public final C513500KBw LJFF = C513500KBw.LIZ;

    @Override // X.AbstractC515830KKv
    public final void LJ() {
    }

    @Override // X.AbstractC515830KKv
    public final void LIZJ() {
        C0KJX c0kjx = this.LIZIZ;
        if (c0kjx == null) {
            return;
        }
        new C0KKE(c0kjx).LIZ(this.LIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.AbstractC515830KKv
    public final boolean LJFF() {
        Pair<C470590Icr<TemplateListData>, TemplateListData> pair;
        Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map;
        Boolean boolValueOf;
        C0KKO c0kko;
        TemplateInfo next;
        String str;
        TemplateListData second;
        C0KJX c0kjx;
        Pair<C470590Icr<TemplateListData>, TemplateListData> pair2;
        TemplateListData second2;
        C0KJX c0kjx2 = this.LIZIZ;
        if (c0kjx2 == null || !c0kjx2.LIZIZ) {
            return false;
        }
        C513500KBw c513500KBw = this.LJFF;
        String str2 = c0kjx2.LIZ;
        int i = c0kjx2.LIZJ;
        EnumC513490KBv enumC513490KBv = c0kjx2.LJII;
        c513500KBw.getClass();
        C510150JzZ c510150JzZLIZJ = C513500KBw.LIZJ(str2, i, enumC513490KBv);
        if (c510150JzZLIZJ == null || (pair = c510150JzZLIZJ.LIZ) == null || (map = c510150JzZLIZJ.LIZIZ) == null) {
            return false;
        }
        EnumC513490KBv enumC513490KBv2 = c0kjx2.LJII;
        PreCheckResult preCheckResult = null;
        if (enumC513490KBv2 != null) {
            boolValueOf = Boolean.valueOf(c510150JzZLIZJ.LIZJ.contains(enumC513490KBv2) && !((c0kjx = this.LIZIZ) != null && c0kjx.LJI && ((pair2 = c510150JzZLIZJ.LIZ) == null || (second2 = pair2.getSecond()) == null || second2.preCheckResult == null)));
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || (c0kko = c0kjx2.LJIIJ) == null) {
            return false;
        }
        List<TemplateInfo> list = pair.getSecond().templateList;
        Iterator<TemplateInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.isDefaultPackage) {
                break;
            }
        }
        TemplateInfo templateInfo = next;
        if (templateInfo == null || (str = templateInfo.packageId) == null) {
            TemplateInfo templateInfo2 = (TemplateInfo) C13LP.LJJJLL(list);
            str = templateInfo2 != null ? templateInfo2.packageId : "";
        }
        c0kko.LIZJ(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        TemplateListData second3 = pair.getSecond();
        System.currentTimeMillis();
        pair.getFirst();
        c0kko.LJFF(jCurrentTimeMillis, second3);
        System.currentTimeMillis();
        c0kko.LIZIZ();
        TemplateListData second4 = pair.getSecond();
        int i2 = pair.getSecond().subScenario;
        TemplateInfo templateInfo3 = pair.getSecond().activeContract;
        Pair<C470590Icr<TemplateListData>, TemplateListData> pair3 = c510150JzZLIZJ.LIZ;
        if (pair3 != null && (second = pair3.getSecond()) != null) {
            preCheckResult = second.preCheckResult;
        }
        C0KH1 c0kh1 = new C0KH1(second4, true, i2, templateInfo3, preCheckResult, pair.getSecond().transactionTips, 32);
        this.LIZJ = c0kh1;
        c0kko.LJ(map, c0kh1);
        C513940KDo.LJIILL(map);
        c510150JzZLIZJ.LIZJ.remove(EnumC513490KBv.NORMAL_SUBSCRIPTION);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get sku cache ");
        sbLIZ.append(map);
        C20441214yg.LIZIZ("SubscribePaymentV2", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    @Override // X.AbstractC515830KKv
    public final void LIZ(TemplateListData templateListData) {
        TemplateListData templateListData2 = templateListData;
        C0KJX c0kjx = this.LIZIZ;
        if (c0kjx != null) {
            new C515710KKj(this.LIZJ, this.LIZLLL).LIZ(templateListData2, c0kjx);
        }
    }

    @Override // X.AbstractC515830KKv
    public final void LIZIZ(InterfaceC509200Jy2 interfaceC509200Jy2) {
        C0KJX c0kjx;
        if ((interfaceC509200Jy2 instanceof C0KJX) && (c0kjx = (C0KJX) interfaceC509200Jy2) != null) {
            this.LIZIZ = c0kjx;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0KKF(c0kjx, this, interfaceC509200Jy2, null), 3);
        }
    }

    @Override // X.AbstractC515830KKv
    public final void LIZLLL(C0KJX c0kjx) {
        this.LIZIZ = c0kjx;
        if (this.LJ.contains(c0kjx.LIZ)) {
            return;
        }
        this.LJ.add(c0kjx.LIZ);
        super.LIZIZ(c0kjx);
    }
}
