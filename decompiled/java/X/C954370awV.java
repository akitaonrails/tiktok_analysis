package X;

import com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import webcast.data.cohost_biz.BizPermitJoinGroupParams;

/* JADX INFO: renamed from: X.0awV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954370awV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(IMultiHostCrossAdapter iMultiHostCrossAdapter, ConcurrentHashMap concurrentHashMap, String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refuseAllUser");
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ));
        Collection collectionValues = concurrentHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            C954460awe c954460awe = (C954460awe) obj;
            if (c954460awe.LJJIIZ == EnumC950200apm.INVITED && c954460awe.LJIIJJI() && c954460awe.LJJIJIIJIL && c954460awe.LJJIJIL) {
                arrayList.add(obj);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("auto_refuseInvited_new_arc");
        sbLIZ2.append(", source = ");
        sbLIZ2.append(str);
        sbLIZ2.append(", invited userList.size = ");
        sbLIZ2.append(arrayList.size());
        C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ2));
        Iterator it2 = arrayList.iterator();
        while (true) {
            i = 18;
            if (!it2.hasNext()) {
                break;
            }
            C954460awe c954460awe2 = (C954460awe) it2.next();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("auto_refuseInvited_new_arc");
            sbLIZ3.append(", source = ");
            sbLIZ3.append(str);
            sbLIZ3.append(", invited user.uid=");
            sbLIZ3.append(c954460awe2.LJ);
            sbLIZ3.append(", user.rivalUserId=");
            sbLIZ3.append(c954460awe2.LJII);
            C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ3));
            long j = c954460awe2.LJFF;
            long j2 = c954460awe2.LJ;
            long j3 = c954460awe2.LJI;
            BizPermitJoinGroupParams bizPermitJoinGroupParams = new BizPermitJoinGroupParams();
            bizPermitJoinGroupParams.replyStatus = 18;
            iMultiHostCrossAdapter.LLJJJJLIIL(new C954620awu(j, j2, j3, 2, bizPermitJoinGroupParams, str), null, null, C915260ZvQ.LIZ);
        }
        Collection collectionValues2 = concurrentHashMap.values();
        ArrayList<C954460awe> arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues2) {
            C954460awe c954460awe3 = (C954460awe) obj2;
            if (c954460awe3.LJJIIZ == EnumC950200apm.APPLIED && c954460awe3.LJIIJJI() && c954460awe3.LJJIJIIJIL && c954460awe3.LJJIJIL) {
                arrayList2.add(obj2);
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("auto_refuseApplied_new_arc");
        sbLIZ4.append(", source = ");
        sbLIZ4.append(str);
        sbLIZ4.append(", applied userList.size = ");
        sbLIZ4.append(arrayList2.size());
        C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ4));
        for (C954460awe c954460awe4 : arrayList2) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("auto_refuseApplied_new_arc");
            sbLIZ5.append(", source = ");
            sbLIZ5.append(str);
            sbLIZ5.append(", applied user.uid=");
            sbLIZ5.append(c954460awe4.LJ);
            sbLIZ5.append(", user.rivalUserId=");
            sbLIZ5.append(c954460awe4.LJII);
            C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ5));
            long j4 = c954460awe4.LJFF;
            long j5 = c954460awe4.LJ;
            long j6 = c954460awe4.LJI;
            BizPermitJoinGroupParams bizPermitJoinGroupParams2 = new BizPermitJoinGroupParams();
            bizPermitJoinGroupParams2.replyStatus = i;
            iMultiHostCrossAdapter.LLLLIIIILLL(new C954610awt(j4, j5, j6, 2, bizPermitJoinGroupParams2, str), null, null);
            i = 18;
        }
    }

    public static void LIZ(IMultiHostCrossAdapter iMultiHostCrossAdapter, ConcurrentHashMap concurrentHashMap, String str, boolean z) {
        Collection collectionValues = concurrentHashMap.values();
        ArrayList<C954460awe> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            C954460awe c954460awe = (C954460awe) obj;
            if (c954460awe.LJJIIZ == EnumC950200apm.APPLIED && c954460awe.LJIIJJI() && c954460awe.LJJIJIIJIL && !c954460awe.LJJIJIL) {
                arrayList.add(obj);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auto_cancelApplied_new_arc");
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        sbLIZ.append(", handler userList.size = ");
        sbLIZ.append(arrayList.size());
        C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ));
        for (C954460awe c954460awe2 : arrayList) {
            if (c954460awe2.LJIIL && c954460awe2.LJIILIIL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("auto_cancelApplied_new_arc");
                sbLIZ2.append(", source = ");
                sbLIZ2.append(str);
                sbLIZ2.append(", handler user.uid=");
                sbLIZ2.append(c954460awe2.LJ);
                sbLIZ2.append(", user.rivalUserId=");
                sbLIZ2.append(c954460awe2.LJII);
                sbLIZ2.append(", is 2v2=true");
                C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ2));
                iMultiHostCrossAdapter.LJIIIIZZ(new C954800axC(str, c954460awe2.LJIILLIIL, c954460awe2.LJIILL, c954460awe2.LJIIZILJ), null);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("auto_cancelApplied_new_arc");
            sbLIZ3.append(", source = ");
            sbLIZ3.append(str);
            sbLIZ3.append(", handler user.uid=");
            sbLIZ3.append(c954460awe2.LJ);
            sbLIZ3.append(", user.rivalUserId=");
            sbLIZ3.append(c954460awe2.LJII);
            sbLIZ3.append(", is 2v2=false");
            C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ3));
            iMultiHostCrossAdapter.LJIIIIZZ(new C954800axC(str, c954460awe2.LJFF, c954460awe2.LJ, c954460awe2.LJI), null);
        }
        if (z && (!arrayList.isEmpty())) {
            C766270U4b.LIZLLL(2131841241);
        }
    }

    public static void LIZIZ(IMultiHostCrossAdapter iMultiHostCrossAdapter, ConcurrentHashMap concurrentHashMap, String str, boolean z) {
        Collection collectionValues = concurrentHashMap.values();
        ArrayList<C954460awe> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            C954460awe c954460awe = (C954460awe) obj;
            if (c954460awe.LJJIIZ == EnumC950200apm.INVITED && c954460awe.LJIIJJI() && c954460awe.LJJIJIIJIL && !c954460awe.LJJIJIL) {
                arrayList.add(obj);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auto_cancelInvited_new_arc");
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        sbLIZ.append(", invited userList.size = ");
        sbLIZ.append(arrayList.size());
        C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ));
        for (C954460awe c954460awe2 : arrayList) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("auto_cancelInvited_new_arc");
            sbLIZ2.append(", source = ");
            sbLIZ2.append(str);
            sbLIZ2.append(", invited user.uid=");
            sbLIZ2.append(c954460awe2.LJ);
            sbLIZ2.append(", user.rivalUserId=");
            sbLIZ2.append(c954460awe2.LJII);
            C20441214yg.LJIIIZ("MultiHostPreLeaveCheckHelper", C2188811AlT.LIZIZ(sbLIZ2));
            iMultiHostCrossAdapter.LLIIJLIL(C915260ZvQ.LIZ, null, new C954670awz(c954460awe2.LJFF, c954460awe2.LJ, c954460awe2.LJI, 0L, str, C2097608Jq.LJ()));
        }
        if (z && (!arrayList.isEmpty())) {
            C766270U4b.LIZLLL(2131841236);
        }
    }
}
