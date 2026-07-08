package X;

import com.ss.android.ugc.IFcpTraceRecorderService;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS21S1400000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ReI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700800ReI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(21));

    public static final String LIZJ(C700170RdH c700170RdH, String str) {
        InterfaceC700010Rd1 interfaceC700010Rd1LIZJ = c700170RdH.LIZ.LIZJ(str);
        if (interfaceC700010Rd1LIZJ != null && interfaceC700010Rd1LIZJ.LJ()) {
            return "STANDARD";
        }
        return "NORMAL";
    }

    public static final List LIZ(C700970ReZ c700970ReZ, List list, C700760ReE c700760ReE) {
        InterfaceC701260Rf2 interfaceC701260Rf2Vk;
        C0T6L.LIZLLL();
        FcpNodeProtocol fcpNodeProtocol = c700970ReZ.LIZLLL;
        if (fcpNodeProtocol != null && (interfaceC701260Rf2Vk = fcpNodeProtocol.vk()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C700970ReZ) it2.next()).LIZJ);
            }
            List<String> listLIZJ = interfaceC701260Rf2Vk.LIZJ(arrayList, c700760ReE);
            if (listLIZJ != null) {
                return listLIZJ;
            }
        }
        return C13BV.INSTANCE;
    }

    public static final void LIZIZ(C700970ReZ c700970ReZ, C700170RdH c700170RdH, C700950ReX c700950ReX, String str) {
        String str2;
        if (c700950ReX != null) {
            InterfaceC699620RcO interfaceC699620RcO = c700170RdH.LJIIIZ;
            Collection<C700970ReZ> collectionValues = c700170RdH.LIZ.LIZIZ().values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                C701240Rf0 c701240Rf0 = ((C700970ReZ) obj).LJIIIIZZ;
                if (c701240Rf0 != null) {
                    str2 = c701240Rf0.LIZ;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, c700970ReZ.LIZJ)) {
                    arrayList.add(obj);
                }
            }
            List listLJLI = C13LP.LJLI(arrayList, C13LP.LLIIJI(c700950ReX.LIZ));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJLI, 10));
            Iterator it2 = listLJLI.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C700970ReZ) it2.next()).LIZJ);
            }
            List<C700970ReZ> list = c700950ReX.LIZJ;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C700970ReZ> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().LIZJ);
            }
            List<C700970ReZ> list2 = c700950ReX.LIZIZ;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C700970ReZ> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList4.add(it4.next().LIZJ);
            }
            IFcpTraceRecorderService iFcpTraceRecorderService = (IFcpTraceRecorderService) LIZ.getValue();
            if (iFcpTraceRecorderService != null) {
                iFcpTraceRecorderService.LIZLLL(interfaceC699620RcO, new AwS21S1400000_11((List) arrayList2, (List<String>) str, (String) arrayList4, (List<String>) arrayList3, (List<String>) c700170RdH, (C700170RdH) 0));
            }
        }
    }
}
