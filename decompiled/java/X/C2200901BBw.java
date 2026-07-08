package X;

import Y.AComparatorS53S0000000_34;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import com.ss.android.ugc.aweme.network.INetwork;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1BBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200901BBw {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(198));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(193));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(195));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(197));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(194));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(199));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(196));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(200));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(191));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(192));

    public final void LIZJ() {
        try {
            Map<String, SocialAffinityItem> mapLIZIZ = C1610960s1W.LIZIZ.LIZIZ("im_user");
            if (mapLIZIZ != null) {
                ((ConcurrentHashMap) this.LJIIIIZZ.getValue()).clear();
                ((ConcurrentHashMap) this.LJIIIIZZ.getValue()).putAll(mapLIZIZ);
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS53S0000000_34(2), mapLIZIZ.values());
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                Iterator it2 = listLJLLLL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((SocialAffinityItem) it2.next()).toUserId);
                }
                ((AtomicReference) this.LJIIIZ.getValue()).set(arrayList);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C169O.LIZIZ()) {
                throw e;
            }
        }
    }

    public static C19EG LIZIZ() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Activity activityLIZ = (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? null : C1388190mED.LIZ(activityLIZIZ);
        if (activityLIZ instanceof C19EG) {
            return (C19EG) activityLIZ;
        }
        return null;
    }

    public static C829870Wgz LJFF() {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        if (!((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL()) {
            return null;
        }
        try {
            IMUserPortraitApi.LIZ.getClass();
            InterfaceC909580ZmG interfaceC909580ZmGLJ = C1730606q8.LIZ().LJ();
            c098200Yq = Integer.valueOf(interfaceC909580ZmGLJ.LJIIJ() ? 1 : interfaceC909580ZmGLJ.LJIL() ? 2 : 0);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        try {
            IMUserPortraitApi.LIZ.getClass();
            c098200Yq2 = Boolean.valueOf(C1730606q8.LIZ().LJ().LJFF(((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ(), 604800000L, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()));
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Boolean bool = (Boolean) c098200Yq2;
        try {
            IMUserPortraitApi.LIZ.getClass();
            c098200Yq3 = Boolean.valueOf(C1730606q8.LIZ().LJ().LJIJJLI(((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ(), 604800000L, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()));
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        Boolean bool2 = (Boolean) c098200Yq3;
        try {
            IMUserPortraitApi.LIZ.getClass();
            c098200Yq4 = Boolean.valueOf(C1730606q8.LIZ().LJ().LJIIIIZZ(((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ(), 604800000L, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()));
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = null;
        }
        Boolean bool3 = (Boolean) c098200Yq4;
        try {
            IMUserPortraitApi.LIZ.getClass();
            c098200Yq5 = Boolean.valueOf(C1730606q8.LIZ().LJ().LJIJ(((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ(), 604800000L, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()));
            C189200o6.m2constructorimpl(c098200Yq5);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq5 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq5);
        }
        return new C829870Wgz(bool, bool2, bool3, (Boolean) (C189200o6.m7isFailureimpl(c098200Yq5) ? null : c098200Yq5), num);
    }

    public final C1514960pWg LJ() {
        Object c098200Yq;
        Object obj;
        Object obj2;
        Object c098200Yq2;
        IIMChatRoomService iIMChatRoomService;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        Object c098200Yq7;
        C0XE1 c0xe1;
        if (!((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL()) {
            return null;
        }
        try {
            C0CF8.LIZ.getClass();
            c098200Yq = Double.valueOf(C0CF8.LIZ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Double d = (Double) c098200Yq;
        C2200981BCe c2200981BCe = (C2200981BCe) ((AtomicReference) this.LIZ.getValue()).get();
        if (c2200981BCe == null) {
            try {
                C2200981BCe c2200981BCeLJIIIZ = C1BCA.LJIIIZ();
                C2200981BCe c2200981BCe2 = new C2200981BCe();
                c2200981BCe2.LIZ = c2200981BCeLJIIIZ.LIZ;
                c2200981BCe2.LIZIZ = c2200981BCeLJIIIZ.LIZIZ;
                ((AtomicReference) this.LIZ.getValue()).set(c2200981BCe2);
                C189200o6.m2constructorimpl(c2200981BCe2);
                obj = c2200981BCe2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C098200Yq c098200Yq8 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq8);
                obj = c098200Yq8;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj3 = obj;
            if (zM7isFailureimpl) {
                obj3 = null;
            }
            c2200981BCe = (C2200981BCe) obj3;
        }
        C1BC7 c1bc7 = (C1BC7) ((AtomicReference) this.LIZIZ.getValue()).get();
        if (c1bc7 == null) {
            try {
                C1BC7 c1bc7LIZIZ = C1BCA.LIZIZ();
                C1BC7 c1bc72 = new C1BC7();
                c1bc72.LIZ = c1bc7LIZIZ.LIZ;
                ((AtomicReference) this.LIZIZ.getValue()).set(c1bc72);
                C189200o6.m2constructorimpl(c1bc72);
                obj2 = c1bc72;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C098200Yq c098200Yq9 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq9);
                obj2 = c098200Yq9;
            }
            boolean zM7isFailureimpl2 = C189200o6.m7isFailureimpl(obj2);
            Object obj4 = obj2;
            if (zM7isFailureimpl2) {
                obj4 = null;
            }
            c1bc7 = (C1BC7) obj4;
        }
        C1512840pTG c1512840pTG = (C1512840pTG) ((AtomicReference) this.LIZJ.getValue()).get();
        if (c1512840pTG == null) {
            try {
                c098200Yq2 = C1BCA.LIZLLL();
                ((AtomicReference) this.LIZJ.getValue()).set(c098200Yq2);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq2 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            c1512840pTG = (C1512840pTG) c098200Yq2;
        }
        C1584320rKY.LIZ.getClass();
        String str = C1584320rKY.LJI;
        IIMChatRoomService iIMChatRoomService2 = (IIMChatRoomService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomService.class, false, false, false, 14, null);
        boolean z = true;
        if ((iIMChatRoomService2 == null || !iIMChatRoomService2.LJ(LIZIZ())) && (((iIMChatRoomService = (IIMChatRoomService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomService.class, false, false, false, 14, null)) == null || !iIMChatRoomService.LIZ()) && ((c19egLIZIZ = LIZIZ()) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || supportFragmentManager.LJJJJZI("quick_chat_sheet") == null))) {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1512820pTE c1512820pTE = (C1512820pTE) ((AtomicReference) this.LIZLLL.getValue()).get();
        if (c1512820pTE == null) {
            try {
                c098200Yq3 = C1BCA.LJIIIIZZ();
                ((AtomicReference) this.LIZLLL.getValue()).set(c098200Yq3);
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                c098200Yq3 = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = null;
            }
            c1512820pTE = (C1512820pTE) c098200Yq3;
        }
        C1512930pTP c1512930pTP = (C1512930pTP) ((AtomicReference) this.LJ.getValue()).get();
        if (c1512930pTP == null) {
            try {
                c098200Yq4 = C1BCA.LIZJ();
                ((AtomicReference) this.LJ.getValue()).set(c098200Yq4);
                C189200o6.m2constructorimpl(c098200Yq4);
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                c098200Yq4 = new C098200Yq(th6);
                C189200o6.m2constructorimpl(c098200Yq4);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq4)) {
                c098200Yq4 = null;
            }
            c1512930pTP = (C1512930pTP) c098200Yq4;
        }
        C1512850pTH c1512850pTH = (C1512850pTH) ((AtomicReference) this.LJFF.getValue()).get();
        if (c1512850pTH == null) {
            try {
                c098200Yq5 = C1BCA.LJIILIIL();
                ((AtomicReference) this.LJFF.getValue()).set(c098200Yq5);
                C189200o6.m2constructorimpl(c098200Yq5);
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
                c098200Yq5 = new C098200Yq(th7);
                C189200o6.m2constructorimpl(c098200Yq5);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq5)) {
                c098200Yq5 = null;
            }
            c1512850pTH = (C1512850pTH) c098200Yq5;
        }
        C1514970pWh c1514970pWh = (C1514970pWh) ((AtomicReference) this.LJI.getValue()).get();
        if (c1514970pWh == null) {
            try {
                C2200821BBo.LIZ.getClass();
                if (C2200821BBo.LIZ() || (c098200Yq6 = (C1514970pWh) C2201101BCq.LJI(C1BC9.PowerMode, null)) == null) {
                    c098200Yq6 = new C1514970pWh(false);
                }
                ((AtomicReference) this.LJI.getValue()).set(c098200Yq6);
                C189200o6.m2constructorimpl(c098200Yq6);
            } catch (Throwable th8) {
                TryCatchGuardChecker.doCheck(th8);
                c098200Yq6 = new C098200Yq(th8);
                C189200o6.m2constructorimpl(c098200Yq6);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq6)) {
                c098200Yq6 = null;
            }
            c1514970pWh = (C1514970pWh) c098200Yq6;
        }
        C0XE1 c0xe12 = (C0XE1) ((AtomicReference) this.LJII.getValue()).get();
        if (c0xe12 == null) {
            try {
                c098200Yq7 = C2203431BLp.LIZIZ.getState();
                ((AtomicReference) this.LJII.getValue()).set(c098200Yq7);
                C189200o6.m2constructorimpl(c098200Yq7);
            } catch (Throwable th9) {
                TryCatchGuardChecker.doCheck(th9);
                c098200Yq7 = new C098200Yq(th9);
                C189200o6.m2constructorimpl(c098200Yq7);
            }
            c0xe1 = (C0XE1) (C189200o6.m7isFailureimpl(c098200Yq7) ? null : c098200Yq7);
        } else {
            c0xe1 = c0xe12;
        }
        return new C1514960pWg(d, c2200981BCe, c1bc7, c1512840pTG, str, boolValueOf, c1512820pTE, c1512930pTP, c1512850pTH, c1514970pWh, c0xe1);
    }

    public static C1512820pTE LIZ(C1512820pTE c1512820pTE) {
        C1512820pTE c1512820pTE2 = new C1512820pTE();
        c1512820pTE2.LIZIZ = c1512820pTE.LIZIZ;
        c1512820pTE2.LIZJ = c1512820pTE.LIZJ;
        c1512820pTE2.LIZLLL = c1512820pTE.LIZLLL;
        c1512820pTE2.LJ = c1512820pTE.LJ;
        c1512820pTE2.LJFF = c1512820pTE.LJFF;
        c1512820pTE2.LJI = c1512820pTE.LJI;
        c1512820pTE2.LIZ = c1512820pTE.LIZ;
        return c1512820pTE2;
    }

    public final C829850Wgx LIZLLL(ITTMParamData iTTMParamData) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object obj = null;
        if (!((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL() || iTTMParamData == null) {
            return null;
        }
        String stringValue = iTTMParamData.getStringValue("conversation_id", 0);
        String stringValue2 = iTTMParamData.getStringValue("convId", 0);
        if (stringValue == null || stringValue.length() <= 0) {
            stringValue = stringValue2;
        }
        long jLJII = C0YNP.LJII(stringValue);
        try {
            SocialAffinityItem socialAffinityItem = (SocialAffinityItem) ((ConcurrentHashMap) this.LJIIIIZZ.getValue()).get(String.valueOf(jLJII));
            if (socialAffinityItem != null) {
                c098200Yq = Double.valueOf(socialAffinityItem.score);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Double d = (Double) c098200Yq;
        try {
            int iIndexOf = ((List) ((AtomicReference) this.LJIIIZ.getValue()).get()).indexOf(String.valueOf(jLJII));
            if (iIndexOf == -1) {
                iIndexOf = C1A1M.LIZIZ.LJII(String.valueOf(jLJII));
            }
            c098200Yq2 = Integer.valueOf(iIndexOf);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Integer num = (Integer) c098200Yq2;
        try {
            C895190Z9x.LIZ.getClass();
            c098200Yq3 = C895190Z9x.LIZ(stringValue);
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
            obj = c098200Yq3;
        }
        return new C829850Wgx(d, num, (C829840Wgw) obj);
    }
}
