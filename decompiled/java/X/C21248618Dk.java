package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21248618Dk {
    public static final C21248618Dk LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C01GW LIZJ;
    public static final ConcurrentHashMap<C589920NBu<? extends Object>, PageInfoStack> LIZLLL;
    public static final C603820NmG<C589920NBu<? extends Object>, PageInfoStack> LJ;
    public static final ConcurrentHashMap<C589920NBu<? extends Object>, C21256818Go> LJFF;
    public static final Map<View, C589920NBu<? extends Object>> LJI;
    public static boolean LJII;
    public static final C01GW LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final C01GW LJIIJ;
    public static final LazyNonNull LJIIJJI;
    public static final LazyNonNull LJIIL;
    public static final ConcurrentHashMap<C589920NBu<View>, C589920NBu<Fragment>> LJIILIIL;
    public static final Map<View, C589920NBu<Fragment>> LJIILJJIL;
    public static final ConcurrentHashMap<C589920NBu<View>, C589920NBu<DialogFragment>> LJIILL;
    public static final ConcurrentHashMap<C589920NBu<View>, C589920NBu<Dialog>> LJIILLIIL;
    public static final List<C589920NBu<View>> LJIIZILJ;
    public static final ConcurrentHashMap<String, C21242018Aw> LJIJ;
    public static final Map<C589920NBu<Activity>, Boolean> LJIJI;
    public static PageInfoStack LJIJJ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C21248618Dk.class, "synBtmIdPageRelatedInfoMap", "getSynBtmIdPageRelatedInfoMap()Ljava/util/Map;", 0);
        C13LE.LIZ.getClass();
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = {c2217371BqR, new C2217371BqR(C21248618Dk.class, "synEventBtmIdPageRelatedInfoMap", "getSynEventBtmIdPageRelatedInfoMap()Ljava/util/Map;", 0)};
        LIZIZ = interfaceC2217461BqaArr;
        C21248618Dk c21248618Dk = new C21248618Dk();
        LIZ = c21248618Dk;
        LIZJ = C452501pT.LIZIZ(new C21249018Do());
        LIZLLL = new ConcurrentHashMap<>();
        LJ = new C603820NmG<>(10);
        LJFF = new ConcurrentHashMap<>();
        LJI = Collections.synchronizedMap(new WeakHashMap());
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C18E0());
        LJIIIIZZ = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new C18E1());
        LJIIJ = c01gwLIZIZ2;
        LazyKt lazyKt = LazyKt.INSTANCE;
        LazyNonNull lazyNonNull = lazyKt.lazyNonNull(new C21248818Dm());
        LJIIJJI = lazyNonNull;
        LazyNonNull lazyNonNull2 = lazyKt.lazyNonNull(new C21248918Dn());
        LJIIL = lazyNonNull2;
        if (!BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            lazyNonNull.setValue(c21248618Dk, interfaceC2217461BqaArr[0], Collections.synchronizedMap((C21252618Ey) c01gwLIZIZ.getValue()));
            lazyNonNull2.setValue(c21248618Dk, interfaceC2217461BqaArr[1], Collections.synchronizedMap((C18F0) c01gwLIZIZ2.getValue()));
        }
        LJIILIIL = new ConcurrentHashMap<>();
        LJIILJJIL = Collections.synchronizedMap(new WeakHashMap());
        LJIILL = new ConcurrentHashMap<>();
        LJIILLIIL = new ConcurrentHashMap<>();
        LJIIZILJ = new ArrayList();
        LJIJ = new ConcurrentHashMap<>();
        LJIJI = new LinkedHashMap();
    }

    public final Map<String, C21246818Cs> LJIIJ() {
        return (Map) LJIIJJI.getValue(this, LIZIZ[0]);
    }

    public static boolean LIZ(Object obj) {
        if (!LIZLLL.containsKey(new C589920NBu(obj)) && LJ.LIZJ(new C589920NBu<>(obj)) == null) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Object obj) {
        PageInfoStack pageInfoStackRemove = LIZLLL.remove(new C589920NBu(obj));
        if (pageInfoStackRemove != null && C18CS.LIZ.LIZIZ().LIZIZ() == 1) {
            LJ.LIZLLL(new C589920NBu<>(obj), pageInfoStackRemove);
        }
    }

    public static Object LIZJ(C18EK c18ek) {
        Object objLJJI;
        PagerAdapter adapter;
        C18B9 c18b9 = C18B9.LIZ;
        Object objLIZ = C18B9.LIZ(c18ek.LJ);
        if (objLIZ != null) {
            C18CK.LJIIIZ("BtmPageRecorder_findPageByItem", new C21245918Cj(objLIZ.getClass().getName()));
            return objLIZ;
        }
        ViewPager viewPager = c18ek.LJFF;
        String name = null;
        if (viewPager == null) {
            return null;
        }
        int i = c18ek.LJI;
        if (i >= 0 && (adapter = viewPager.getAdapter()) != null) {
            objLJJI = adapter.LJJI(i, viewPager);
            if (objLJJI != null) {
                name = objLJJI.getClass().getName();
            }
        } else {
            objLJJI = null;
        }
        C18CK.LJIIIZ("BtmPageRecorder_findPageByItem", new C21246018Ck(name));
        return objLJJI;
    }

    public static Object LIZLLL(String str) {
        if (str == null) {
            return null;
        }
        for (Map.Entry<C589920NBu<? extends Object>, PageInfoStack> entry : LIZLLL.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue().current().getPageId(), str)) {
                return entry.getKey().get();
            }
        }
        for (Map.Entry entry2 : ((LinkedHashMap) LJ.LJIIIIZZ()).entrySet()) {
            if (Intrinsics.LJFF(((PageInfoStack) entry2.getValue()).current().getPageId(), str)) {
                return ((Reference) entry2.getKey()).get();
            }
        }
        return null;
    }

    public static Fragment LJ(View view) {
        if (C18CS.LIZ.LIZLLL().LJJI() == 1) {
            C589920NBu<Fragment> c589920NBu = LJIILJJIL.get(view);
            if (c589920NBu == null) {
                return null;
            }
            return c589920NBu.get();
        }
        C589920NBu<Fragment> c589920NBu2 = LJIILIIL.get(new C589920NBu(view));
        if (c589920NBu2 == null) {
            return null;
        }
        return c589920NBu2.get();
    }

    public static C21256818Go LJI(Object obj) {
        if (obj == null) {
            return null;
        }
        return LJFF.get(new C589920NBu(obj));
    }

    public static Object LJII(PageInfo pageInfo) {
        for (Map.Entry<C589920NBu<? extends Object>, PageInfoStack> entry : LIZLLL.entrySet()) {
            Iterator<PageInfo> it2 = entry.getValue().all().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getPageId(), pageInfo.getPageId())) {
                    return entry.getKey().get();
                }
            }
        }
        return null;
    }

    public static PageInfo LJIIIIZZ(Object obj) {
        PageInfo pageInfoCurrent = null;
        if (obj == null) {
            return null;
        }
        String name = obj.getClass().getName();
        PageInfoStack pageInfoStackLJIIIZ = LJIIIZ(obj);
        if (pageInfoStackLJIIIZ == null || (pageInfoCurrent = pageInfoStackLJIIIZ.current()) == null) {
            C18CK.LJIIIZ("BtmPageRecorder_getPageInfo", new C1508180pLk(name));
        }
        return pageInfoCurrent;
    }

    public static PageInfoStack LJIIIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        PageInfoStack pageInfoStack = LIZLLL.get(new C589920NBu(obj));
        if (pageInfoStack == null) {
            return LJ.LIZJ(new C589920NBu<>(obj));
        }
        return pageInfoStack;
    }

    public static void LJIIJJI(Object obj) {
        ConcurrentHashMap<C589920NBu<? extends Object>, C21256818Go> concurrentHashMap = LJFF;
        if (concurrentHashMap.get(new C589920NBu(obj)) == null) {
            concurrentHashMap.put(new C589920NBu<>(obj), new C21256818Go());
        }
    }

    public final C21246818Cs LJFF(String str) {
        if (str != null && str.length() != 0) {
            C21246818Cs c21246818Cs = LJIIJ().get(str);
            if (c21246818Cs == null) {
                return (C21246818Cs) ((Map) LJIIL.getValue(this, LIZIZ[1])).get(str);
            }
            return c21246818Cs;
        }
        return null;
    }

    public static PageInfoStack LJIIL(Object obj, boolean z) {
        ConcurrentHashMap<C589920NBu<? extends Object>, PageInfoStack> concurrentHashMap = LIZLLL;
        PageInfoStack pageInfoStack = concurrentHashMap.get(new C589920NBu(obj));
        if (pageInfoStack == null) {
            PageInfoStack.Companion.getClass();
            PageInfoStack pageInfoStackLIZIZ = C21248718Dl.LIZIZ(z);
            concurrentHashMap.put(new C589920NBu<>(obj), pageInfoStackLIZIZ);
            return pageInfoStackLIZIZ;
        }
        return pageInfoStack;
    }

    public final void LJIILLIIL(String str, C21246818Cs c21246818Cs, boolean z) {
        if (z) {
            ((Map) LJIIL.getValue(this, LIZIZ[1])).put(str, c21246818Cs);
        } else {
            LJIIJ().put(str, c21246818Cs);
            ((C18EH) LIZJ.getValue()).LIZLLL(c21246818Cs, str, false);
        }
    }

    public final void LJIILL(String str, PageInfo pageInfo, C18EK c18ek, InterfaceC21252118Et interfaceC21252118Et) {
        String strLJIIL;
        boolean z = !c18ek.LIZ();
        String nodeId = null;
        if (interfaceC21252118Et != null) {
            nodeId = interfaceC21252118Et.getNodeId();
            strLJIIL = interfaceC21252118Et.LJIIL();
        } else {
            strLJIIL = null;
        }
        LJIIZILJ(str, pageInfo, z, nodeId, strLJIIL);
        if (c18ek.LIZ() && (C18CS.LIZ.LIZJ().LJIILIIL() & 1) != 0) {
            C21242018Aw c21242018Aw = new C21242018Aw(0);
            c21242018Aw.LIZ = pageInfo.getPageShowId();
            c21242018Aw.LIZJ = str;
            pageInfo.setLatestBtmIdNode(c21242018Aw);
        }
    }

    public final void LJIIZILJ(String str, PageInfo pageInfo, boolean z, String str2, String str3) {
        String pageBtm;
        String str4;
        String value;
        BcmParams bcmParams;
        BcmPageInfo bcmPageInfo;
        Map<String, BcmParams> pageParams;
        String strLIZ = null;
        if (!Intrinsics.LJFF(C18C3.LIZJ(str), pageInfo.getPageBtm())) {
            pageBtm = pageInfo.getPageBtm();
        } else {
            pageBtm = null;
        }
        if (C18C3.LIZLLL(pageInfo.getUnionPre()) == null) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str4 = "1";
        }
        String pageShowId = pageInfo.getPageShowId();
        String pageBtm2 = pageInfo.getPageBtm();
        if (pageBtm2 == null) {
            pageBtm2 = "";
        }
        String pageId = pageInfo.getPageId();
        String instanceId = pageInfo.getInstanceId();
        String lastPageShowId = pageInfo.getLastPageShowId();
        int step = pageInfo.getStep();
        EnumC21244218Bs recoveryFrom = pageInfo.getRecoveryFrom();
        if (recoveryFrom != null) {
            value = recoveryFrom.getValue();
        } else {
            value = null;
        }
        if ((pageInfo instanceof BcmPageInfo) && (bcmPageInfo = (BcmPageInfo) pageInfo) != null && (pageParams = bcmPageInfo.getPageParams()) != null) {
            bcmParams = pageParams.get("ecom_entrance");
        } else {
            bcmParams = null;
        }
        if (pageInfo.isFirstPage()) {
            strLIZ = C18DC.LIZ();
        }
        LJIILLIIL(str, new C21246818Cs(pageShowId, pageBtm2, pageId, instanceId, lastPageShowId, false, step, str2, str3, str4, pageBtm, value, null, bcmParams, strLIZ), z);
    }

    public static void LJIILIIL(String str, boolean z, boolean z2, String str2, int i, Object obj) {
        PageInfo pageInfoCurrent;
        C18CK.LJIIIZ("BtmPageRecorder_putSourceBtm", new C1878940yzk(obj.getClass().getName(), str, i, str2));
        PageInfoStack pageInfoStackLJIIIZ = LJIIIZ(obj);
        if (pageInfoStackLJIIIZ != null && (pageInfoCurrent = pageInfoStackLJIIIZ.current()) != null) {
            pageInfoCurrent.putSourceBtm(str, i, str2, z, z2);
        }
    }
}
