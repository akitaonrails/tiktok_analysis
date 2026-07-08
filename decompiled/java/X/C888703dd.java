package X;

import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoEcomRiskAppealV3ConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C888703dd extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ CCDCAddCardHalfFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C888703dd(CCDCAddCardHalfFragment cCDCAddCardHalfFragment) {
        super(1);
        this.LL = cCDCAddCardHalfFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        Object c889503dl;
        Object obj;
        List<String> listSingletonList;
        ElementDTO elementDTO;
        KeyboardUtils.LIZIZ(this.LL.getView());
        CCDCAddCardViewModel cCDCAddCardViewModelKS = this.LL.kS();
        if (EcPipoEcomRiskAppealV3ConfigSettings.LIZIZ()) {
            List<InterfaceC1891350zJl> list = ((C890803dy) cCDCAddCardViewModelKS.getState()).LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC1891350zJl> it2 = list.iterator();
            while (true) {
                String str = null;
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1891350zJl next = it2.next();
                if (next instanceof InterfaceC892703eH) {
                    listSingletonList = ((InterfaceC892703eH) next).getIds();
                } else if (next instanceof InterfaceC894103eV) {
                    C862703Yr c862703YrLLIL = ((InterfaceC894103eV) next).LLIL();
                    if (c862703YrLLIL != null && (elementDTO = c862703YrLLIL.LIZ) != null) {
                        str = elementDTO.id;
                    }
                    listSingletonList = Collections.singletonList(str);
                } else {
                    listSingletonList = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(listSingletonList, arrayList);
            }
            Set setLLIIJI = C13LP.LLIIJI(C13LP.LJJJJLI(arrayList));
            for (Map.Entry entry : ((LinkedHashMap) cCDCAddCardViewModelKS.LL).entrySet()) {
                Object key = entry.getKey();
                List list2 = (List) entry.getValue();
                if (setLLIIJI.contains(key)) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((PaymentElement) it3.next()).setParamValue("");
                    }
                }
            }
            cCDCAddCardViewModelKS.setState(new AwS580S0100000_1(cCDCAddCardViewModelKS, 613));
            C890603dw c890603dw = cCDCAddCardViewModelKS.LLJLILLLLZIIL;
            c890603dw.LIZ = 0;
            ((LinkedHashMap) c890603dw.LIZIZ).clear();
            c890603dw.LIZJ = false;
            List<InterfaceC1891350zJl> list3 = ((C890803dy) cCDCAddCardViewModelKS.getState()).LLILLJJLI;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (Object objLIZIZ : list3) {
                if (objLIZIZ instanceof C889403dk) {
                    C889403dk c889403dk = (C889403dk) objLIZIZ;
                    C866903a7 c866903a7 = c889403dk.LLILLJJLI;
                    c866903a7.LIZJ = null;
                    c866903a7.LIZLLL = null;
                    objLIZIZ = C889403dk.LIZIZ(c889403dk, new Object());
                } else {
                    if (objLIZIZ instanceof C889003dg) {
                        C889003dg c889003dg = (C889003dg) objLIZIZ;
                        c889003dg.LLILLJJLI.LIZJ = null;
                        C889003dg c889003dgLIZLLL = C889003dg.LIZLLL(c889003dg, new Object());
                        c889003dgLIZLLL.LLILZIL = c889003dg.LLILZIL;
                        obj = c889003dgLIZLLL;
                    } else if (objLIZIZ instanceof C889203di) {
                        C889203di c889203di = (C889203di) objLIZIZ;
                        c889203di.LLILLJJLI.LIZJ = null;
                        C889203di c889203diLIZLLL = C889203di.LIZLLL(c889203di, new Object());
                        c889203diLIZLLL.LLILZLL = c889203di.LLILZLL;
                        obj = c889203diLIZLLL;
                    } else {
                        if (objLIZIZ instanceof C889103dh) {
                            C889103dh c889103dh = (C889103dh) objLIZIZ;
                            C869603aY c869603aY = c889103dh.LLILLJJLI;
                            c869603aY.LIZJ = null;
                            C889103dh c889103dh2 = new C889103dh(c889103dh.LL, c869603aY, new Object());
                            c889103dh2.LLILZ = c889103dh.LLILZ;
                            c889503dl = c889103dh2;
                        } else if (objLIZIZ instanceof C888903df) {
                            C888903df c888903df = (C888903df) objLIZIZ;
                            C888903df c888903dfLIZ = C888903df.LIZ(c888903df, new Object(), 3);
                            c888903dfLIZ.LLILZIL = c888903df.LLILZIL;
                            obj = c888903dfLIZ;
                        } else if (objLIZIZ instanceof C889503dl) {
                            C889503dl c889503dl2 = (C889503dl) objLIZIZ;
                            c889503dl = new C889503dl(c889503dl2.LL, c889503dl2.LLILLJJLI, c889503dl2.LLILLL, new Object());
                        }
                        objLIZIZ = c889503dl;
                    }
                    objLIZIZ = obj;
                }
                arrayList2.add(objLIZIZ);
            }
            cCDCAddCardViewModelKS.YQ2(arrayList2);
            cCDCAddCardViewModelKS.XQ2(cCDCAddCardViewModelKS.GQ2());
            cCDCAddCardViewModelKS.setState(AFwS228S0000000_1.get$arr$(608));
        }
        return Unit.LIZ;
    }
}
