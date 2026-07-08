package X;

import com.ss.android.ugc.IFcpTraceRecorderService;
import com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.CustomBizInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705630Rm5 extends C09AY implements Function0<List<InterfaceC1393560mMs>> {
    public final /* synthetic */ C712520RxC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C705630Rm5(C712520RxC c712520RxC) {
        super(0);
        this.LL = c712520RxC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<InterfaceC1393560mMs> invoke() {
        ArrayList arrayList;
        C703790Rj7 c703790Rj7;
        Object next;
        ArrayList arrayList2;
        String str;
        CustomBizInfo customBizInfo;
        AwS590S0100000_11 awS590S0100000_11LIZJ;
        AbstractC1066910ds1 abstractC1066910ds1;
        AwS555S0100000_11 awS555S0100000_11LIZIZ;
        AwS555S0100000_11 awS555S0100000_11LIZ;
        C1067020dsC c1067020dsC = C1067020dsC.LIZ;
        C712520RxC c712520RxC = this.LL;
        C712510RxB c712510RxB = c712520RxC.LIZIZ;
        Aweme aweme = c712510RxB.LIZ;
        boolean z = c712510RxB.LJ;
        InterfaceC704550RkL interfaceC704550RkL = c712520RxC.LJ;
        c1067020dsC.getClass();
        InterfaceC699620RcO interfaceC699620RcO = (interfaceC704550RkL == null || (awS555S0100000_11LIZ = interfaceC704550RkL.LIZ()) == null) ? null : (InterfaceC699620RcO) awS555S0100000_11LIZ.invoke();
        ArrayList arrayList3 = new ArrayList();
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors == null) {
            anchors = Collections.emptyList();
        }
        ArrayList arrayListLIZ = C1067020dsC.LIZ(new ArrayList(anchors));
        if (C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(c712520RxC.LIZIZ.LJFF)) {
            arrayList = new ArrayList();
            for (Object obj : arrayListLIZ) {
                C01GW c01gw = C708610Rqt.LIZ;
                if (C708610Rqt.LIZ(((AnchorCommonStruct) obj).getType())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = arrayListLIZ;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj2;
            if (anchorCommonStruct.getType() == EnumC1430380nKG.NEWS.getTYPE()) {
                C705670Rm9 c705670Rm9 = EnumC705650Rm7.Companion;
                EnumC705650Rm7 enumC705650Rm7LIZ = C0SQE.LIZ(anchorCommonStruct);
                c705670Rm9.getClass();
                if (!C13LP.LJJJJ(enumC705650Rm7LIZ, C1697810uHb.LJIIJJI(EnumC705650Rm7.FAILED, EnumC705650Rm7.PENDING, EnumC705650Rm7.TNS_VIOLATION))) {
                }
            }
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList(C13LP.LL(arrayList4, 50));
        if (interfaceC704550RkL == null || (awS555S0100000_11LIZIZ = interfaceC704550RkL.LIZIZ()) == null) {
            c703790Rj7 = null;
        } else {
            c703790Rj7 = ((VideoFeedMultiTagAssem) awS555S0100000_11LIZIZ.l0).LLLIL;
            if (c703790Rj7 != null) {
                c703790Rj7.init();
            }
        }
        ArrayList arrayList6 = new ArrayList();
        if (!arrayList5.isEmpty()) {
            List<InterfaceC1393560mMs> listLIZIZ = C1067020dsC.LIZJ;
            if (listLIZIZ == null) {
                listLIZIZ = C1067020dsC.LIZIZ();
                C1067020dsC.LIZJ = listLIZIZ;
            }
            for (InterfaceC1393560mMs interfaceC1393560mMs : listLIZIZ) {
                if (!arrayList5.isEmpty()) {
                    InterfaceC1393560mMs interfaceC1393560mMsClone = interfaceC1393560mMs.clone();
                    if ((interfaceC1393560mMsClone instanceof AbstractC1066910ds1) && (abstractC1066910ds1 = (AbstractC1066910ds1) interfaceC1393560mMsClone) != null) {
                        abstractC1066910ds1.LLILZ = z;
                        abstractC1066910ds1.LLILZIL = C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(c712520RxC.LIZIZ.LJFF);
                        abstractC1066910ds1.LLILZLL = C1599640rjG.LIZIZ.Pu(c712520RxC.LIZIZ.LJFF);
                    }
                    interfaceC1393560mMsClone.LJJJJ(c712520RxC);
                    EnumC1050190dR3 enumC1050190dR3LJJJJLL = interfaceC1393560mMsClone.LJJJJLL(arrayList5);
                    while (enumC1050190dR3LJJJJLL == EnumC1050190dR3.PROCEED) {
                        arrayList3.add(interfaceC1393560mMsClone);
                        if (c703790Rj7 != null) {
                            AnchorCommonStruct anchorCommonStructData = interfaceC1393560mMsClone.data();
                            if (!c703790Rj7.LIZ(aweme, anchorCommonStructData != null ? anchorCommonStructData.getComponentKey() : null)) {
                                arrayList6.add(interfaceC1393560mMsClone);
                            }
                        }
                        C1067020dsC c1067020dsC2 = C1067020dsC.LIZ;
                        InterfaceC1393560mMs interfaceC1393560mMsClone2 = interfaceC1393560mMsClone.clone();
                        c1067020dsC2.getClass();
                        if ((interfaceC1393560mMsClone2 instanceof AbstractC1066910ds1) && interfaceC1393560mMsClone.getClass() == interfaceC1393560mMsClone2.getClass()) {
                            AbstractC1066910ds1 abstractC1066910ds12 = (AbstractC1066910ds1) interfaceC1393560mMsClone2;
                            abstractC1066910ds12.LLILZIL = interfaceC1393560mMsClone.LJJLIIIJILLIZJL();
                            abstractC1066910ds12.LLILZLL = interfaceC1393560mMsClone.LJJLIIIIJ();
                        }
                        interfaceC1393560mMsClone2.LJJJJ(c712520RxC);
                        enumC1050190dR3LJJJJLL = interfaceC1393560mMsClone2.LJJJJLL(arrayList5);
                        interfaceC1393560mMsClone = interfaceC1393560mMsClone2;
                    }
                    if (enumC1050190dR3LJJJJLL == EnumC1050190dR3.DONE) {
                        if (c703790Rj7 != null) {
                            AnchorCommonStruct anchorCommonStructData2 = interfaceC1393560mMsClone.data();
                            if (!c703790Rj7.LIZ(aweme, anchorCommonStructData2 != null ? anchorCommonStructData2.getComponentKey() : null)) {
                                arrayList6.add(interfaceC1393560mMsClone);
                            }
                        }
                        arrayList3.add(interfaceC1393560mMsClone);
                    }
                }
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (!arrayList6.contains(obj3)) {
                arrayList7.add(obj3);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            AnchorCommonStruct anchorCommonStructData3 = ((InterfaceC1393560mMs) it2.next()).data();
            if (anchorCommonStructData3 != null) {
                arrayList8.add(anchorCommonStructData3);
            }
        }
        String str2 = (interfaceC704550RkL == null || (awS590S0100000_11LIZJ = interfaceC704550RkL.LIZJ()) == null) ? null : (String) awS590S0100000_11LIZJ.invoke(arrayListLIZ);
        Iterator it3 = arrayList8.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (Intrinsics.LJFF(((AnchorCommonStruct) next).getComponentKey(), str2)) {
                break;
            }
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) next;
        Set setLLIIJI = C13LP.LLIIJI(arrayList6);
        ArrayList arrayList9 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            AnchorCommonStruct anchorCommonStructData4 = ((InterfaceC1393560mMs) it4.next()).data();
            if (anchorCommonStructData4 != null) {
                arrayList9.add(anchorCommonStructData4);
            }
        }
        List listLLIIII = C13LP.LLIIII(C13LP.LJLLLLLL(arrayListLIZ, C13LP.LLIIJI(arrayList9)));
        String componentKey = anchorCommonStruct2 != null ? anchorCommonStruct2.getComponentKey() : null;
        IFcpTraceRecorderService iFcpTraceRecorderService = (IFcpTraceRecorderService) C1067020dsC.LIZIZ.getValue();
        if (iFcpTraceRecorderService != null) {
            arrayList2 = arrayList3;
            iFcpTraceRecorderService.LIZLLL(interfaceC699620RcO, new C702630RhF(arrayList3, setLLIIJI, c703790Rj7, listLLIIII, componentKey, arrayList8, str2, anchorCommonStruct2));
        } else {
            arrayList2 = arrayList3;
        }
        C204660156k c204660156k = C204662156m.LIZ;
        String aid = aweme.getAid();
        String str3 = c712520RxC.LIZIZ.LIZJ;
        ContentModel contentModel = aweme.getContentModel();
        if (contentModel == null || (customBizInfo = contentModel.customBizInfo) == null || (str = customBizInfo.awemeTrace) == null) {
            str = "";
        }
        C204662156m.LIZ(str3, aid, C704160Rji.LIZIZ(EnumC204669156t.ANCHOR_FILTER, str, arrayList8, arrayList5));
        InterfaceC699890Rcp interfaceC699890RcpLJIILJJIL = c712520RxC.LJIILJJIL();
        if (interfaceC699890RcpLJIILJJIL != null) {
            ((C699170Rbf) interfaceC699890RcpLJIILJJIL).LIZIZ(aweme, EnumC699150Rbd.BUSINESS_FILTER, C704160Rji.LIZ(listLLIIII));
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (!arrayList6.contains(obj4)) {
                arrayList10.add(obj4);
            }
        }
        return new ArrayList(C13LP.LJLLLL(new Comparator() { // from class: X.0Rm6
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1393560mMs) t).priority()), Integer.valueOf(((InterfaceC1393560mMs) t2).priority()));
            }
        }, arrayList10));
    }
}
