package X;

import android.os.SystemClock;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNullable;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18CM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18CM {
    public static final C18CM LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final LazyNullable LJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C18CM.class, "enterPageCallback", "getEnterPageCallback()Lcom/bytedance/android/btm/impl/EnterPageCallback;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new C18CM();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BtmIdCreator_");
        sbLIZ.append("createBtmIdBeforeEnterPage");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BtmIdCreator_");
        sbLIZ2.append("createBtmIdBeforeSendEvent");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ2);
        LJ = LazyKt.INSTANCE.lazyNullable(new C21243318Bj());
    }

    public static C18CR LJ(C18EK c18ek) {
        String canonicalName;
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        Object objLIZJ = C21248618Dk.LIZJ(c18ek);
        c21248618Dk.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZJ);
        boolean z = false;
        if (pageInfoLJIIIIZZ == null) {
            Iterator<String> it2 = C18CS.LIZ.LIZLLL().LJIILJJIL().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (a0.LJJIIZI(c18ek.LIZ, it2.next(), false)) {
                    C21248618Dk c21248618Dk2 = C21248618Dk.LIZ;
                    Object objLIZ = C18CJ.LIZ();
                    c21248618Dk2.getClass();
                    pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
                    z = true;
                    break;
                }
            }
        }
        LIZ(c18ek, pageInfoLJIIIIZZ, objLIZJ);
        String canonicalName2 = null;
        if (pageInfoLJIIIIZZ != null) {
            LIZ.getClass();
            String strLJFF = LJFF(c18ek, pageInfoLJIIIIZZ, objLIZJ);
            if (objLIZJ != null) {
                canonicalName2 = objLIZJ.getClass().getCanonicalName();
            }
            return new C18CR(strLJFF, z, pageInfoLJIIIIZZ, canonicalName2);
        }
        if (objLIZJ != null) {
            canonicalName = objLIZJ.getClass().getCanonicalName();
        } else {
            canonicalName = null;
        }
        return new C18CR("", z, null, canonicalName);
    }

    public static void LIZ(C18EK c18ek, PageInfo pageInfo, Object obj) {
        int i;
        try {
            if (obj != null) {
                if (pageInfo == null) {
                    C18CE.LIZ.LIZIZ(1007, "", null, null, false, new C18C8(c18ek, obj.getClass().getName()));
                    return;
                } else {
                    LIZIZ(c18ek, pageInfo, obj);
                    return;
                }
            }
            if (c18ek.LIZ()) {
                i = 2022;
            } else {
                i = 2023;
            }
            C18CE.LIZ.LIZIZ(i, "", null, null, false, new C18C9(c18ek));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createBtm check error : ");
            sbLIZ.append(e.getMessage());
            C18CE.LIZ.LJFF(1022, C2188811AlT.LIZIZ(sbLIZ), null, null, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[PHI: r16
      0x003f: PHI (r16v5 java.lang.String) = (r16v1 java.lang.String), (r16v6 java.lang.String) binds: [B:16:0x003d, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[PHI: r16
      0x0045: PHI (r16v4 java.lang.String) = (r16v1 java.lang.String), (r16v5 java.lang.String) binds: [B:16:0x003d, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C18EK r18, com.bytedance.android.btm.impl.page.model.PageInfo r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18CM.LIZIZ(X.18EK, com.bytedance.android.btm.impl.page.model.PageInfo, java.lang.Object):void");
    }

    public static String LJFF(C18EK c18ek, PageInfo pageInfo, Object obj) {
        Regex regex = C18C3.LIZ;
        String strLIZ = C18C3.LIZ(c18ek.LIZ);
        C21248618Dk.LIZ.LJIILL(strLIZ, pageInfo, c18ek, C18EN.LIZ(obj));
        String btmPre = pageInfo.getBtmPre();
        if (btmPre != null && btmPre.length() != 0) {
            BtmServiceImpl.INSTANCE.getChainRecorderExp().LIZLLL(strLIZ, btmPre, true);
        } else {
            C18CK.LJIIL(LIZLLL, new C18CQ());
        }
        String pageBtm = pageInfo.getPageBtm();
        if (pageBtm == null || pageBtm.length() == 0) {
            pageInfo.parsePageBtm(c18ek.LIZ);
        }
        return strLIZ;
    }

    public static String LIZJ(C18EK c18ek, boolean z, BcmParams bcmParams, boolean z2) {
        C18CK.LJIIL(LIZJ, new C18CP(c18ek));
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        Object objLIZJ = C21248618Dk.LIZJ(c18ek);
        c21248618Dk.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZJ);
        LIZ(c18ek, pageInfoLJIIIIZZ, objLIZJ);
        if (objLIZJ != null && pageInfoLJIIIIZZ != null) {
            return LIZLLL(c18ek, objLIZJ, pageInfoLJIIIIZZ, bcmParams);
        }
        return "";
    }

    public static String LIZLLL(C18EK c18ek, Object obj, PageInfo pageInfo, BcmParams bcmParams) {
        String strLJIIL;
        String str;
        LinkedBlockingQueue<BufferBtm> linkedBlockingQueue;
        if (!C20321214fK.LIZ()) {
            C18CE.LJI(2027, pageInfo, c18ek.LIZ, null, new C19376310rJ(), null, 184);
        }
        pageInfo.setEnterPage(true);
        Regex regex = C18C3.LIZ;
        String strLIZ = C18C3.LIZ(c18ek.LIZ);
        InterfaceC21252118Et interfaceC21252118EtLIZ = C18EN.LIZ(obj);
        C21248618Dk.LIZ.LJIILL(strLIZ, pageInfo, c18ek, interfaceC21252118EtLIZ);
        C18E5 c18e5 = C18E5.LIZ;
        String nodeId = null;
        if (interfaceC21252118EtLIZ != null) {
            nodeId = interfaceC21252118EtLIZ.getNodeId();
            strLJIIL = interfaceC21252118EtLIZ.LJIIL();
        } else {
            strLJIIL = null;
        }
        c18e5.getClass();
        C18ES c18es = BufferBtm.Companion;
        int step = pageInfo.getStep();
        String pageId = pageInfo.getPageId();
        int i = c18ek.LIZJ;
        List<String> list = c18ek.LIZLLL;
        c18es.getClass();
        final BufferBtm bufferBtmLIZIZ = C18ES.LIZIZ(strLIZ, step, pageId, nodeId, strLJIIL, i, list);
        if (C18CK.LIZJ) {
            str = strLIZ;
            C18CK.LJIIIZ("BufferQueue_addBufferBtm", new C21245518Cf(strLIZ, c18ek, pageInfo.copy(), nodeId, strLJIIL, bufferBtmLIZIZ));
        } else {
            str = strLIZ;
        }
        if (C18CS.LIZ.LIZLLL().LJFF() != 1) {
            if (C18CS.LIZ.LIZLLL().LJJ() == 1 && (linkedBlockingQueue = C18E5.LIZJ) != null) {
                linkedBlockingQueue.clear();
            }
            if (C18E5.LIZJ == null) {
                C18E5.LIZJ = new LinkedBlockingQueue<>();
            }
            LinkedBlockingQueue<BufferBtm> linkedBlockingQueue2 = C18E5.LIZJ;
            if (linkedBlockingQueue2 != null) {
                linkedBlockingQueue2.add(bufferBtmLIZIZ);
            }
            C18GU c18gu = C18GU.LIZ;
            Runnable runnable = new Runnable() { // from class: X.18CN
                @Override // java.lang.Runnable
                public final void run() {
                    BufferBtm bufferBtm = bufferBtmLIZIZ;
                    C1C7U.LIZ("BufferQueue@22b6.addBtmQueue$1L");
                    LinkedBlockingQueue<BufferBtm> linkedBlockingQueue3 = C18E5.LIZJ;
                    if (linkedBlockingQueue3 != null && linkedBlockingQueue3.contains(bufferBtm)) {
                        LinkedBlockingQueue<BufferBtm> linkedBlockingQueue4 = C18E5.LIZJ;
                        if (linkedBlockingQueue4 != null) {
                            linkedBlockingQueue4.remove(bufferBtm);
                        }
                        C18CE.LIZ.LIZIZ(1107, bufferBtm.toString(), null, null, false, new C18CO(bufferBtm));
                    }
                    C1C7U.LIZIZ("BufferQueue@22b6.addBtmQueue$1L");
                }
            };
            long jLJ = C18CS.LIZ.LIZJ().LJ();
            c18gu.getClass();
            C18GU.LIZLLL(jLJ, runnable);
        }
        BufferBtm bufferBtmLIZ = C18ES.LIZ(bufferBtmLIZIZ);
        c18e5.LIZLLL().put(str, bufferBtmLIZ);
        C18E5.LJII = new Pair<>(pageInfo.getPageId(), Long.valueOf(SystemClock.elapsedRealtime()));
        C21246118Cl.LIZJ.LIZLLL(bufferBtmLIZ.toString(), "key_source_btm_token", true);
        if (!C18CS.LIZ.LIZLLL().LJIIJ().contains(2312)) {
            C18E5.LJIIJ.put(bufferBtmLIZ, bufferBtmLIZIZ);
            C18E5.LJIIJJI.put(bufferBtmLIZIZ, bufferBtmLIZ);
        }
        ((WeakHashMap) C18E5.LJ.getValue(c18e5, C18E5.LIZIZ[0])).put(bufferBtmLIZIZ, pageInfo.getLatestBtmIdNode());
        String btmPre = pageInfo.getBtmPre();
        pageInfo.setLatestBtmId(str);
        C21241518Ar chainRecorderExp = BtmServiceImpl.INSTANCE.getChainRecorderExp();
        chainRecorderExp.LIZLLL(str, btmPre, false);
        C18BH c18bh = (C18BH) chainRecorderExp.LJII.getValue(chainRecorderExp, C21241518Ar.LJIIIIZZ[0]);
        if (c18bh != null) {
            c18bh.LIZ(str, pageInfo, bcmParams, obj);
        }
        C21242018Aw latestBtmIdNode = pageInfo.getLatestBtmIdNode();
        if (latestBtmIdNode != null) {
            latestBtmIdNode.LIZIZ = pageInfo.getPreBtmIdNode();
        }
        String pageBtm = pageInfo.getPageBtm();
        if (pageBtm == null || pageBtm.length() == 0) {
            pageInfo.parsePageBtm(c18ek.LIZ);
        }
        return str;
    }
}
