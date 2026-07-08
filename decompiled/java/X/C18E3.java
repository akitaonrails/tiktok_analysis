package X;

import android.app.Activity;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.android.btm.impl.page.unknown.UnionBufferBtm;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.18E3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18E3 {
    public static boolean LIZ = true;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static C21247918Dd LJII;
    public static final Set<C18HS> LJIIIIZZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BtmPageLifecycleCallbackV2_");
        sbLIZ.append("onPageCreated");
        LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BtmPageLifecycleCallbackV2_");
        sbLIZ2.append("pageBtmBuffer");
        LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("BtmPageLifecycleCallbackV2_");
        sbLIZ3.append("onPageResumed");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("BtmPageLifecycleCallbackV2_");
        sbLIZ4.append("onPagePaused");
        LJ = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("BtmPageLifecycleCallbackV2_");
        sbLIZ5.append("onPageDestroyed");
        LJFF = C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("BtmPageLifecycleCallbackV2_");
        sbLIZ6.append("onSaveInstanceState");
        LJI = C2188811AlT.LIZIZ(sbLIZ6);
        LJIIIIZZ = new LinkedHashSet();
    }

    public static C18HS[] LIZ() {
        Object[] array;
        Set<C18HS> set = LJIIIIZZ;
        synchronized (set) {
            try {
                array = set.size() > 0 ? set.toArray(new C18HS[0]) : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return (C18HS[]) array;
    }

    public static void LJII(C18HS c18hs) {
        Set<C18HS> set = LJIIIIZZ;
        synchronized (set) {
            try {
                set.add(c18hs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x02f7, code lost:
    
        r2 = X.C18CS.LIZ.LIZIZ();
        r2.getClass();
        r1 = X.C1972007ny.LIZIZ(r2, "fix_back_internal_parent", java.lang.Integer.valueOf(r2.fixBackInternalParent));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x030e, code lost:
    
        if ((r1 instanceof java.lang.Integer) != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0310, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0311, code lost:
    
        r1 = (java.lang.Integer) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0313, code lost:
    
        if (r1 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0315, code lost:
    
        r0 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0319, code lost:
    
        r2.fixBackInternalParent = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x031b, code lost:
    
        if (r0 == 1) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x031d, code lost:
    
        r7 = r6;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0323, code lost:
    
        if (r7.getParentNode() == null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0325, code lost:
    
        r0 = r7.getParentNode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0329, code lost:
    
        if (r0 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x032d, code lost:
    
        if (r0.LLILZLL != true) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x032f, code lost:
    
        if (r2 >= 3) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0331, code lost:
    
        r0 = r7.getParentNode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0335, code lost:
    
        if (r0 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0337, code lost:
    
        r1 = r0.LJIIJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x033b, code lost:
    
        if (r1 == null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x033d, code lost:
    
        r0 = X.C18EO.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0345, code lost:
    
        if (X.C18EO.LIZJ(r1, r4.LIZ) != null) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0347, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0348, code lost:
    
        r7 = r7.getParentNode();
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x034e, code lost:
    
        if (r7 == null) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0351, code lost:
    
        r0 = r2.fixBackInternalParent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0354, code lost:
    
        r2 = X.C18CS.LIZ.LIZIZ();
        r2.getClass();
        r1 = X.C1972007ny.LIZIZ(r2, "fix_back_internal_sort", java.lang.Integer.valueOf(r2.fixBackInternalSort));
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x036b, code lost:
    
        if ((r1 instanceof java.lang.Integer) != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x036d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x036e, code lost:
    
        r1 = (java.lang.Integer) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0370, code lost:
    
        if (r1 == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0372, code lost:
    
        r0 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0376, code lost:
    
        r2.fixBackInternalSort = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0378, code lost:
    
        if (r0 != 0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x037a, code lost:
    
        r4.LJIIJ(r23, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x037f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0380, code lost:
    
        r0 = r2.fixBackInternalSort;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0383, code lost:
    
        new java.util.LinkedHashSet();
        r2 = new java.util.LinkedHashSet();
        r0 = r6.getTree();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0391, code lost:
    
        if (r0 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0393, code lost:
    
        r0 = r0.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0397, code lost:
    
        if (r0 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0399, code lost:
    
        r8 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03a1, code lost:
    
        if (r8.hasNext() == false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03a3, code lost:
    
        r0 = (X.InterfaceC21252118Et) r8.next();
        r7 = r0.LJIIJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03b9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r0.getNodeId(), r6.getNodeId()) != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03bb, code lost:
    
        if (r7 == null) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03bd, code lost:
    
        r0 = X.C18EO.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03c7, code lost:
    
        if (X.C18EO.LIZ(r7, X.C21252318Ev.LJ.LIZ) != null) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03c9, code lost:
    
        r2.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03cd, code lost:
    
        r1 = r2.size();
        X.C18CK.LJFF("BackInternalResumer_tryResumePrePage", new X.C1130504bX(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03d9, code lost:
    
        if (r1 != 0) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03db, code lost:
    
        X.C21252318Ev.LJ.LJIIJ(r2, "filter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03e3, code lost:
    
        if (r1 != 1) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03ed, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.C13LP.LJJLIIIJILLIZJL(r2), r23) != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03ef, code lost:
    
        r0 = X.C18EO.LIZ;
        X.C18EO.LIZLLL(X.C13LP.LJJLIIIJILLIZJL(r2), X.C21252318Ev.LJ.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03fc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x03fd, code lost:
    
        r6 = X.C18E7.LJFF(r6.getTree(), r2);
        r1 = r6.size();
        X.C18CK.LJFF("BackInternalResumer_tryResumePrePage", new X.C1130604bY(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0411, code lost:
    
        if (r1 != 0) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0413, code lost:
    
        X.C21252318Ev.LJ.LJIIJ(r6, "removeParent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x041a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x041b, code lost:
    
        if (r1 != 1) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0425, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.C13LP.LJJLIIIJILLIZJL(r6), r23) != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0427, code lost:
    
        r0 = X.C18EO.LIZ;
        X.C18EO.LIZLLL(X.C13LP.LJJLIIIJILLIZJL(r6), X.C21252318Ev.LJ.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0434, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0435, code lost:
    
        r2 = X.C18E7.LIZLLL(r6);
        r1 = r2.size();
        X.C18CK.LJFF("BackInternalResumer_tryResumePrePage", new X.C1130704bZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0445, code lost:
    
        if (r1 == 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0447, code lost:
    
        if (r1 != 1) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0451, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.C13LP.LJJLIIIJILLIZJL(r2), r23) != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0453, code lost:
    
        r0 = X.C18EO.LIZ;
        X.C18EO.LIZLLL(X.C13LP.LJJLIIIJILLIZJL(r2), X.C21252318Ev.LJ.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0460, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0461, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0462, code lost:
    
        r2 = X.C18E7.LIZ(r6);
        r1 = r2.size();
        X.C18CK.LJFF("BackInternalResumer_tryResumePrePage", new X.C1130804ba(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0472, code lost:
    
        if (r1 != 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0474, code lost:
    
        X.C21252318Ev.LJ.LJIIJ(r2, "largeStep");
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x047b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x047c, code lost:
    
        if (r1 != 1) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0486, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.C13LP.LJJLIIIJILLIZJL(r2), r23) != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0488, code lost:
    
        r0 = X.C18EO.LIZ;
        X.C18EO.LIZLLL(X.C13LP.LJJLIIIJILLIZJL(r2), X.C21252318Ev.LJ.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0495, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0496, code lost:
    
        X.C18CK.LJFF("BackInternalResumer_tryResumePrePage", new X.C21259318Hn());
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04a6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(X.C13LP.LJJLIIIJILLIZJL(r2), r23) != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x04a8, code lost:
    
        r0 = X.C18EO.LIZ;
        X.C18EO.LIZLLL(X.C13LP.LJJLIIIJILLIZJL(r2), r4.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04b3, code lost:
    
        r3 = new java.util.ArrayList();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x04c0, code lost:
    
        if (r2.hasNext() == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04c2, code lost:
    
        r1 = r2.next();
        X.C21248618Dk.LIZ.getClass();
        r3.add(X.C21248618Dk.LJIIIIZZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04d3, code lost:
    
        r0 = X.C789730UyR.LIZJ(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04d7, code lost:
    
        if (r0 == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04d9, code lost:
    
        r2 = r0.getClass().getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04e1, code lost:
    
        if (r2 != null) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04e3, code lost:
    
        r2 = "null";
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04e5, code lost:
    
        X.C18CE.LJII(X.C18CE.LIZ, r4.LIZIZ, null, r23, null, false, false, null, false, new X.C1287840jcM(r3), new X.C20322714fZ(r2), 250);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0504, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.EnumC21251218Ek r21, com.bytedance.android.btm.impl.page.model.PageInfoStack r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18E3.LIZIZ(X.18Ek, com.bytedance.android.btm.impl.page.model.PageInfoStack, java.lang.Object):void");
    }

    public static void LIZLLL(EnumC21251218Ek enumC21251218Ek, PageInfoStack pageInfoStack, Object obj) {
        Integer numLIZ;
        Activity activityLIZJ = C789730UyR.LIZJ(obj);
        if (activityLIZJ instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) ((C19FO) activityLIZJ).getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.IS_FINISHING;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), activityLIZJ)) != null) {
                LIZIZ(enumC21251218Ek, pageInfoStack, obj);
                C1565730qqZ.LIZIZ(numLIZ.intValue(), activityLIZJ);
                return;
            }
        }
        LIZIZ(enumC21251218Ek, pageInfoStack, obj);
    }

    public static void LJ(Object obj, PageInfoStack pageInfoStack, EnumC21250718Ef enumC21250718Ef) {
        InterfaceC21252118Et interfaceC21252118EtLIZIZ;
        int iIntValue;
        UnionBufferBtm unionBufferBtm;
        UnionBufferBtm unionBufferBtmCopy;
        String nodeId;
        if (C18CJ.LIZ() != null) {
            C18CE.LJII(C18CE.LIZ, 1032, null, obj, pageInfoStack.current().copy(), false, false, null, false, null, new C18GC(), 498);
        }
        C18CJ.LIZIZ(obj);
        C18CJ.LIZLLL = null;
        pageInfoStack.setPageState(BtmPageLifecycle.State.RESUMED);
        C18E9 c18e9LIZIZ = C18EN.LIZIZ(obj);
        if (c18e9LIZIZ != null) {
            interfaceC21252118EtLIZIZ = c18e9LIZIZ.LIZIZ(obj);
            if (interfaceC21252118EtLIZIZ != null) {
                nodeId = interfaceC21252118EtLIZIZ.getNodeId();
            } else {
                nodeId = null;
            }
            c18e9LIZIZ.LLILZIL = nodeId;
        } else {
            interfaceC21252118EtLIZIZ = null;
        }
        PageInfo pageInfoCurrent = pageInfoStack.current();
        if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            if (C18FN.LIZ()) {
                C18CK.LJII(LIZLLL, new C21254618Fs(enumC21250718Ef, pageInfoCurrent.copy()));
            }
        } else {
            C18CK.LJII(LIZLLL, new C21254718Ft(enumC21250718Ef, pageInfoCurrent.copy()));
        }
        if (pageInfoCurrent.getPageBtm() != null && pageInfoCurrent.getPreBtmIdNode() == null) {
            String pageId = pageInfoCurrent.getPageId();
            C21248618Dk.LIZ.getClass();
            ConcurrentHashMap<String, C21242018Aw> concurrentHashMap = C21248618Dk.LJIJ;
            pageInfoCurrent.setPreBtmIdNode(concurrentHashMap.get(pageId));
            concurrentHashMap.remove(pageId);
        }
        BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
        bugfixModelLIZIZ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_background_resume_filter", Integer.valueOf(bugfixModelLIZIZ.fixBackgroundResumeFilter));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = bugfixModelLIZIZ.fixBackgroundResumeFilter;
        }
        bugfixModelLIZIZ.fixBackgroundResumeFilter = iIntValue;
        int i = 0;
        if (iIntValue != 1) {
            if (enumC21250718Ef == EnumC21250718Ef.Background) {
                pageInfoCurrent.onResume(enumC21250718Ef);
                C18HS[] c18hsArrLIZ = LIZ();
                if (c18hsArrLIZ != null) {
                    int length = c18hsArrLIZ.length;
                    while (i < length) {
                        c18hsArrLIZ[i].onPageResumed(obj);
                        i++;
                    }
                    return;
                }
                return;
            }
            C21247918Dd c21247918Dd = LJII;
            if (c21247918Dd != null) {
                EnumC21248118Df enumC21248118Df = c21247918Dd.LIZJ;
            }
            EnumC21248118Df enumC21248118Df2 = EnumC21248118Df.BACKGROUND;
        }
        LJI(obj, pageInfoStack, pageInfoCurrent, interfaceC21252118EtLIZIZ, c18e9LIZIZ, enumC21250718Ef);
        C18DO.LIZ(pageInfoCurrent);
        if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && (unionBufferBtm = C18DO.LIZ) != null && (unionBufferBtmCopy = unionBufferBtm.copy()) != null && !Intrinsics.LJFF(unionBufferBtmCopy.getPageId(), pageInfoCurrent.getPageId())) {
            pageInfoCurrent.setEarlierUnionBuffer(unionBufferBtmCopy);
        }
        pageInfoCurrent.onResume(enumC21250718Ef);
        C18HS[] c18hsArrLIZ2 = LIZ();
        if (c18hsArrLIZ2 != null) {
            int length2 = c18hsArrLIZ2.length;
            while (i < length2) {
                c18hsArrLIZ2[i].onPageResumed(obj);
                i++;
            }
        }
        C21249518Dt.LIZIZ(obj, pageInfoStack.getPageProp());
    }

    public static void LJFF(InterfaceC21252118Et interfaceC21252118Et, PageInfo pageInfo, Object obj) {
        String nodeId;
        String strLJIIL;
        String name = obj.getClass().getName();
        PageInfo pageInfoCopy = pageInfo.copy();
        C18CK.LJII(LIZJ, new C21253918Fl(interfaceC21252118Et, pageInfoCopy, name));
        String pageBtm = pageInfo.getPageBtm();
        if (pageBtm != null && pageBtm.length() != 0) {
            C18E5 c18e5 = C18E5.LIZ;
            Regex regex = C18C3.LIZ;
            String strLIZ = C18C3.LIZ(pageInfo.getPageBtm());
            if (interfaceC21252118Et != null) {
                nodeId = interfaceC21252118Et.getNodeId();
                strLJIIL = interfaceC21252118Et.LJIIL();
            } else {
                nodeId = null;
                strLJIIL = null;
            }
            c18e5.getClass();
            C18ES c18es = BufferBtm.Companion;
            int step = pageInfo.getStep();
            String pageId = pageInfo.getPageId();
            ArrayList arrayList = new ArrayList();
            c18es.getClass();
            BufferBtm bufferBtmLIZIZ = C18ES.LIZIZ(strLIZ, step, pageId, nodeId, strLJIIL, 1, arrayList);
            if (C18FN.LIZ()) {
                C18CK.LJIIIZ("BufferQueue_addBufferPageBtm", new C21245618Cg(strLIZ, pageInfo.copy(), nodeId, strLJIIL, bufferBtmLIZIZ));
            }
            if ((C18CS.LIZ.LIZJ().LJIILIIL() & 1) != 0) {
                C21242018Aw c21242018Aw = new C21242018Aw(0);
                pageInfo.setLatestPageBtmIdNode(c21242018Aw);
                c21242018Aw.LIZJ = strLIZ;
                c21242018Aw.LIZ = pageInfo.getPageShowId();
            }
            C21248618Dk.LIZ.LJIIZILJ(strLIZ, pageInfo, false, nodeId, strLJIIL);
            C18E5.LIZLLL = bufferBtmLIZIZ;
            C21246118Cl.LIZJ.LIZLLL(bufferBtmLIZIZ.toString(), "key_page_buffer", false);
            ((WeakHashMap) C18E5.LJ.getValue(c18e5, C18E5.LIZIZ[0])).put(bufferBtmLIZIZ, pageInfo.getLatestPageBtmIdNode());
            pageInfo.setLatestPageBtmId(strLIZ);
            String btmPre = pageInfo.getBtmPre();
            if (btmPre != null && btmPre.length() != 0) {
                C21241518Ar chainRecorderExp = BtmServiceImpl.INSTANCE.getChainRecorderExp();
                chainRecorderExp.LIZLLL(strLIZ, btmPre, false);
                C18BH c18bh = (C18BH) chainRecorderExp.LJII.getValue(chainRecorderExp, C21241518Ar.LJIIIIZZ[0]);
                if (c18bh != null) {
                    c18bh.LIZ(strLIZ, pageInfo, null, obj);
                }
                C21242018Aw latestPageBtmIdNode = pageInfo.getLatestPageBtmIdNode();
                if (latestPageBtmIdNode != null) {
                    latestPageBtmIdNode.LIZIZ = pageInfo.getPreBtmIdNode();
                }
            } else {
                C18CK.LJIIIZ("BufferQueue_addBufferPageBtm", new C21245718Ch());
            }
            C18DO.LIZIZ(pageInfo, bufferBtmLIZIZ);
            return;
        }
        C18CE.LJII(C18CE.LIZ, 1105, "pageBtm is empty", obj, pageInfoCopy, true, false, null, false, null, null, 992);
    }

    public static BufferBtm LIZJ(Object obj, PageProp pageProp, boolean z, PageInfoStack pageInfoStack) {
        boolean z2;
        int iIntValue;
        String btmPre;
        BufferBtm bufferBtm;
        String str;
        String str2;
        String name = obj.getClass().getName();
        String str3 = LIZIZ;
        C18CK.LJII(str3, new C18G8(name, pageProp, pageInfoStack));
        String pageBtm = null;
        BufferBtm bufferBtm2 = null;
        if (pageInfoStack != null) {
            pageInfoStack.setRecoveryFrom(EnumC21244218Bs.SAVED_INSTANCE_STATE);
            C21248618Dk.LIZ.getClass();
            C21248618Dk.LIZLLL.put(new C589920NBu<>(obj), pageInfoStack);
            C21249518Dt.LIZ(obj, pageProp, z);
            PageInfo pageInfoCurrent = pageInfoStack.current();
            ConcurrentHashMap<String, C21242018Aw> concurrentHashMap = C21248618Dk.LJIJ;
            pageInfoCurrent.setPreBtmIdNode(concurrentHashMap.get(pageInfoCurrent.getPageId()));
            concurrentHashMap.remove(pageInfoCurrent.getPageId());
        } else {
            C21249518Dt.LIZ(obj, pageProp, z);
            C21248618Dk c21248618Dk = C21248618Dk.LIZ;
            c21248618Dk.getClass();
            PageInfoStack pageInfoStackLJIIL = C21248618Dk.LJIIL(obj, z);
            PageInfo pageInfoCurrent2 = pageInfoStackLJIIL.current();
            pageInfoCurrent2.setProp(pageProp, obj, pageInfoStackLJIIL);
            C259800zU c259800zU = new C259800zU();
            String str4 = "";
            c259800zU.element = "";
            BufferBtm bufferBtmLIZIZ = C18E5.LIZ.LIZIZ(pageProp.getSourceBtmToken(), new C0C41(c259800zU));
            if (bufferBtmLIZIZ != null) {
                C21246918Ct.LIZ(pageInfoCurrent2, pageProp.getSourceBtmToken());
                Map<String, Pair<String, String>> map = C18E5.LJIIIZ;
                Pair<String, String> pair = map.get(pageProp.getSourceBtmToken());
                if (pair != null) {
                    C189C.LIZ(new C18FG(pageProp, pair, name));
                } else {
                    if (!C18CS.LIZ.LIZLLL().LJIIJ().contains(2311)) {
                        map.put(pageProp.getSourceBtmToken(), new Pair<>(name, pageProp.getBtm()));
                    }
                    if (!C18CS.LIZ.LIZLLL().LJIIJ().contains(2312) && (bufferBtm = C18E5.LJIIJ.get(bufferBtmLIZIZ)) != null && (str = C18E5.LJIIL.get(bufferBtm)) != null) {
                        C18B9 c18b9 = C18B9.LIZ;
                        Object objLIZ = C18B9.LIZ(PageFinder.via(str));
                        if (objLIZ != null) {
                            String name2 = objLIZ.getClass().getName();
                            C21246818Cs btmPageInfo = BtmSDK.INSTANCE.getBtmPageInfo(PageFinder.via(objLIZ));
                            if (btmPageInfo != null && (str2 = btmPageInfo.LIZIZ) != null) {
                                str4 = str2;
                            }
                            C189C.LIZ(new C18GJ(pageProp, name2, str4, name));
                        }
                    }
                }
                z2 = true;
            } else {
                if (pageProp.getSourceBtmToken() != null) {
                    pageInfoCurrent2.setUnknownSourceBtmToken(pageProp.getSourceBtmToken());
                }
                bufferBtmLIZIZ = C18E5.LJ(pageProp.getBtm());
                z2 = false;
                if (bufferBtmLIZIZ == null) {
                    BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
                    bugfixModelLIZIZ.getClass();
                    Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_create_set_pre", Integer.valueOf(bugfixModelLIZIZ.fixCreateSetPre));
                    if (!(objLIZIZ instanceof Integer)) {
                        objLIZIZ = null;
                    }
                    Integer num = (Integer) objLIZIZ;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = bugfixModelLIZIZ.fixCreateSetPre;
                    }
                    bugfixModelLIZIZ.fixCreateSetPre = iIntValue;
                    if (iIntValue == 1 && (btmPre = pageInfoCurrent2.getBtmPre()) != null && btmPre.length() != 0) {
                        C18CK.LJII(str3, new C21259918Ht());
                    } else {
                        bufferBtmLIZIZ = C18E5.LIZLLL;
                    }
                }
            }
            if (bufferBtmLIZIZ != null) {
                String btm = bufferBtmLIZIZ.getBtm();
                int step = bufferBtmLIZIZ.getStep() + 1;
                String pageId = bufferBtmLIZIZ.getPageId();
                c21248618Dk.getClass();
                C21248618Dk.LJIILIIL(btm, true, z2, pageId, step, obj);
            } else if (!LIZ) {
                Object objLIZ2 = C18CJ.LIZ();
                c21248618Dk.getClass();
                PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ2);
                if (pageInfoLJIIIIZZ != null) {
                    pageBtm = pageInfoLJIIIIZZ.getPageBtm();
                }
                C18CE.LJII(C18CE.LIZ, 1127, null, obj, pageInfoStackLJIIL.current().copy(), false, false, null, false, null, new C1699750uKj(pageBtm), 498);
            }
            bufferBtm2 = bufferBtmLIZIZ;
        }
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
        if (pageInfoStackLJIIIZ != null) {
            pageInfoStackLJIIIZ.setPageState(BtmPageLifecycle.State.CREATED);
        }
        Activity activityLIZJ = C789730UyR.LIZJ(obj);
        if (activityLIZJ != null) {
            C21248618Dk.LJIJI.put(new C589920NBu<>(activityLIZJ), Boolean.TRUE);
        }
        C18HS[] c18hsArrLIZ = LIZ();
        if (c18hsArrLIZ != null) {
            for (C18HS c18hs : c18hsArrLIZ) {
                c18hs.onPageCreated(obj);
            }
        }
        CopyOnWriteArrayList<C589920NBu<Object>> copyOnWriteArrayList = C18CJ.LIZ;
        C18CJ.LIZLLL = new C589920NBu<>(obj);
        return bufferBtm2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [T, com.bytedance.android.btm.api.model.BufferBtm] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.bytedance.android.btm.api.model.BufferBtm] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LJI(Object obj, PageInfoStack pageInfoStack, PageInfo pageInfo, InterfaceC21252118Et interfaceC21252118Et, C18E9 c18e9, EnumC21250718Ef enumC21250718Ef) {
        EnumC21248118Df enumC21248118Df;
        boolean z;
        boolean z2;
        InterfaceC21252118Et interfaceC21252118EtLIZJ;
        BufferBtm bufferBtm;
        EnumC21248118Df enumC21248118Df2 = null;
        String btm = null;
        if (enumC21250718Ef == EnumC21250718Ef.HybridRegister) {
            C21248618Dk c21248618Dk = C21248618Dk.LIZ;
            c21248618Dk.getClass();
            C21256818Go c21256818GoLJI = C21248618Dk.LJI(obj);
            if (c21256818GoLJI != null && (bufferBtm = c21256818GoLJI.LIZJ) != null) {
                C18CK.LJII(LIZLLL, new C084Q(bufferBtm));
                if (pageInfo.getBtmPreSetFromSourceBtmToken()) {
                    C21246918Ct.LIZIZ(bufferBtm, pageInfo);
                } else {
                    String btm2 = bufferBtm.getBtm();
                    int step = bufferBtm.getStep() + 1;
                    String pageId = bufferBtm.getPageId();
                    c21248618Dk.getClass();
                    C21248618Dk.LJIILIIL(btm2, true, false, pageId, step, obj);
                }
                c21256818GoLJI.LIZJ = null;
                return;
            }
        }
        String name = obj.getClass().getName();
        String btmPre = pageInfo.getBtmPre();
        C21247918Dd c21247918Dd = LJII;
        if (c21247918Dd != null) {
            enumC21248118Df = c21247918Dd.LIZJ;
        } else {
            enumC21248118Df = null;
        }
        EnumC21248118Df enumC21248118Df3 = EnumC21248118Df.BACK;
        if (enumC21248118Df == enumC21248118Df3 && btmPre != null && btmPre.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        C259800zU c259800zU = new C259800zU();
        if (z) {
            C18E5 c18e5 = C18E5.LIZ;
            PageProp pageProp = pageInfoStack.getPageProp();
            if (pageProp != null) {
                btm = pageProp.getBtm();
            }
            c18e5.getClass();
            ?? LJFF2 = C18E5.LJFF(pageInfo, btm);
            c259800zU.element = LJFF2;
            if (LJFF2 == 0) {
                C18CK.LJII(LIZLLL, new C18FA(name));
                c259800zU.element = C18E5.LIZJ(pageInfo);
            } else {
                BufferBtm bufferBtmLIZJ = C18E5.LIZJ(pageInfo);
                if (((BufferBtm) c259800zU.element).getTargetPagesBtm().isEmpty() && bufferBtmLIZJ != null) {
                    Regex regex = C18C3.LIZ;
                    if (!Intrinsics.LJFF(C18C3.LIZIZ(((BufferBtm) c259800zU.element).getBtm()), C18C3.LIZIZ(bufferBtmLIZJ.getBtm()))) {
                        z2 = true;
                        C18CE.LJII(C18CE.LIZ, 2020, ((BufferBtm) c259800zU.element).toString(), null, pageInfo, false, false, null, false, null, new C21250318Eb(bufferBtmLIZJ, c259800zU), 500);
                    }
                }
            }
            z2 = true;
        } else {
            z2 = false;
            C21247918Dd c21247918Dd2 = LJII;
            if (c21247918Dd2 != null) {
                enumC21248118Df2 = c21247918Dd2.LIZJ;
            }
            if (enumC21248118Df2 == enumC21248118Df3) {
                C18E5 c18e52 = C18E5.LIZ;
                String pageBtm = pageInfo.getPageBtm();
                c18e52.getClass();
                BufferBtm bufferBtmLJ = C18E5.LJ(pageBtm);
                if (bufferBtmLJ != null) {
                    C18CE.LJII(C18CE.LIZ, 2020, bufferBtmLJ.toString(), null, pageInfo, false, false, null, false, null, new C21250818Eg(bufferBtmLJ), 500);
                }
            }
        }
        String str = LIZLLL;
        C18CK.LJII(str, new C21250418Ec(c259800zU, z2));
        boolean btmPreSetFromSourceBtmToken = pageInfo.getBtmPreSetFromSourceBtmToken();
        C21246918Ct.LIZIZ((BufferBtm) c259800zU.element, pageInfo);
        boolean z3 = !btmPreSetFromSourceBtmToken;
        if (pageInfo.getReuse() && !pageInfo.getUpdateBySourceBtmTokenInThisDisplay() && C18CS.LIZ.LIZJ().LJIIL().LJ() == 1) {
            z3 = true;
        }
        T t = c259800zU.element;
        if (t != 0 && z3) {
            C21248618Dk c21248618Dk2 = C21248618Dk.LIZ;
            String btm3 = ((BufferBtm) t).getBtm();
            int step2 = ((BufferBtm) c259800zU.element).getStep() + 1;
            String pageId2 = ((BufferBtm) c259800zU.element).getPageId();
            c21248618Dk2.getClass();
            C21248618Dk.LJIILIIL(btm3, true, false, pageId2, step2, obj);
            if (!C18CS.LIZ.LIZLLL().LJIIJ().contains(2312)) {
                C18E5.LIZ.getClass();
                if (C18E5.LJIIJJI.get(c259800zU.element) != null) {
                    C18E5.LJIIL.put((BufferBtm) c259800zU.element, pageInfo.getPageId());
                }
            }
            btmPre = ((BufferBtm) c259800zU.element).getBtm();
            if ((C18CS.LIZ.LIZJ().LJIILIIL() & 1) != 0) {
                C18E5 c18e53 = C18E5.LIZ;
                c18e53.getClass();
                pageInfo.setPreBtmIdNode((C21242018Aw) ((WeakHashMap) C18E5.LJ.getValue(c18e53, C18E5.LIZIZ[0])).get(c259800zU.element));
            }
            if (interfaceC21252118Et != null && ((BufferBtm) c259800zU.element).getTreeId().length() > 0 && Intrinsics.LJFF(interfaceC21252118Et.LJIIL(), ((BufferBtm) c259800zU.element).getTreeId())) {
                if (c18e9 != null) {
                    interfaceC21252118EtLIZJ = c18e9.LIZJ(((BufferBtm) c259800zU.element).getNodeId());
                } else {
                    interfaceC21252118EtLIZJ = null;
                }
                if (!Intrinsics.LJFF(interfaceC21252118EtLIZJ, interfaceC21252118Et)) {
                    interfaceC21252118Et.LJIIJJI(interfaceC21252118EtLIZJ);
                }
            }
            if (enumC21250718Ef == EnumC21250718Ef.BackInternal) {
                C18CE.LJII(C18CE.LIZ, 1125, null, obj, pageInfo, false, false, null, false, null, null, 1010);
            }
        }
        if (btmPre == null || btmPre.length() == 0) {
            if (!LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(obj);
                sbLIZ.append(": pre_btm is null, must check the reason!");
                C18CE.LIZ.LJFF(1010, C2188811AlT.LIZIZ(sbLIZ), null, null, false);
            }
            C18CK.LJII(str, new C18FB(name));
            String strLIZ = C18C3.LIZ("a0.b0.c0.d0");
            C21248618Dk.LIZ.getClass();
            C21248618Dk.LJIILIIL(strLIZ, true, false, "", 1, obj);
        }
    }
}
