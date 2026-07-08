package X;

import Y.ARunnableS17S1100000_12;
import Y.ARunnableS17S1200000_12;
import android.os.Looper;
import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.android.live.effect.model.composer.LiveComposerTagNode;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyDownloadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerGiftPrioritySwitch;
import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyFilterRestoreOpt;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdk.performance.PerformanceManagerImpl;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS97S1200000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UG5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UG5 extends C0UG6 {
    public static final C01GW<C0U78> LJIJI = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS199S0000000_12.get$arr$(245));
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public final List<C0U86> LJIIL = new CopyOnWriteArrayList();
    public final List<C0UG2> LJIILIIL = new ArrayList();
    public final CopyOnWriteArrayList<LiveComposerNode> LJIILJJIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<LiveComposerNode> LJIILL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<LiveComposerNode> LJIILLIIL = new CopyOnWriteArrayList<>();
    public boolean LJIIZILJ = true;
    public final C01GW LJIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(246));

    @Override // X.C0U78
    public final void LJJIJ() {
        LJJJLZIJ(null, "", true, false);
    }

    @Override // X.InterfaceC769000UEo
    public final void sr() {
        this.LJII = null;
        this.LJIIIIZZ = null;
    }

    @Override // X.InterfaceC769000UEo
    public final void Er() {
        C0UG8 c0ug8;
        C0UG9 c0ug9;
        String str = C769020UEq.LIZ;
        String str2 = C769020UEq.LIZIZ;
        if (str == null || str2 == null || (c0ug8 = this.LIZJ) == null || (c0ug9 = c0ug8.LIZJ) == null) {
            return;
        }
        c0ug9.LJJZ(str, str2);
    }

    @Override // X.InterfaceC769000UEo
    public final void Hr() {
        String str;
        C0UG8 c0ug8;
        C0UG9 c0ug9;
        String str2 = this.LJII;
        if (str2 == null || (str = this.LJIIIIZZ) == null || (c0ug8 = this.LIZJ) == null || (c0ug9 = c0ug8.LIZJ) == null) {
            return;
        }
        c0ug9.LJJZ(str2, str);
    }

    @Override // X.C0U78
    public final void LJFF() {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 == null || (c0ug9 = c0ug8.LIZJ) == null) {
            return;
        }
        c0ug9.LJFF();
    }

    @Override // X.C0U78
    public final void LJIIL() {
        LJJJJLL("guest_linkmic", false);
    }

    @Override // X.C0U78
    public final void LJJIII() {
        C0UG8 c0ug8 = this.LIZJ;
        LJIJJLI(false);
    }

    @Override // X.C0U78
    public final C0UD1 createEffectTrack() {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 == null || (c0ug9 = c0ug8.LIZJ) == null) {
            return null;
        }
        return c0ug9.createEffectTrack();
    }

    @Override // X.C0U78
    public final boolean isInitialized() {
        return this.LIZJ != null;
    }

    @Override // X.InterfaceC769000UEo
    public final Map<String, Map<String, LiveEffect>> jr() {
        Object next;
        HashMap map = new HashMap();
        CopyOnWriteArrayList<LiveComposerNode> copyOnWriteArrayList = this.LJIILJJIL;
        ArrayList<LiveComposerNode> arrayList = new ArrayList();
        for (LiveComposerNode liveComposerNode : copyOnWriteArrayList) {
            LiveComposerNode liveComposerNode2 = liveComposerNode;
            if (((ConcurrentHashMap) this.LIZLLL).containsKey(liveComposerNode2.panel) && liveComposerNode2.use) {
                arrayList.add(liveComposerNode);
            }
        }
        for (LiveComposerNode liveComposerNode3 : arrayList) {
            if (!map.containsKey(liveComposerNode3.panel)) {
                map.put(liveComposerNode3.panel, new HashMap());
            }
            Map map2 = (Map) map.get(liveComposerNode3.panel);
            if (map2 != null && !map2.containsKey(liveComposerNode3.resourceId)) {
                List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(liveComposerNode3.panel);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), liveComposerNode3.resourceId)) {
                            break;
                        }
                    }
                    LiveEffect liveEffect = (LiveEffect) next;
                    if (liveEffect != null) {
                        map2.put(liveEffect.getResourceId(), LJJJJL(liveComposerNode3.panel, liveEffect, liveComposerNode3));
                    }
                }
            }
        }
        return map;
    }

    @Override // X.InterfaceC769000UEo
    public final void release() {
        String str;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 == null || (str = c0ug8.LJI) == null) {
            str = "broadcast";
        }
        LJJJJLL(str, true);
    }

    @Override // X.InterfaceC769000UEo
    public final String Ar() {
        return this.LJIIJ;
    }

    @Override // X.C0U78
    public final List<LiveComposerNode> LJJIFFI() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC769000UEo
    public final String mr() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC769000UEo
    public final String pr() {
        return this.LJII;
    }

    @Override // X.InterfaceC769000UEo
    public final String ur() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC769000UEo
    public final String xr() {
        return this.LJIIJJI;
    }

    public static void LJJL(LiveEffect liveEffect) {
        String panel;
        Long lValueOf;
        String resourceId;
        if (liveEffect != null) {
            panel = liveEffect.getPanel();
        } else {
            panel = null;
        }
        if (!Intrinsics.LJFF(panel, C0UD4.LJFF) && !Intrinsics.LJFF(panel, "livefiltercomposerexperiment")) {
            if (liveEffect != null) {
                lValueOf = Long.valueOf(liveEffect.getEffectId());
                resourceId = liveEffect.getResourceId();
            } else {
                lValueOf = null;
                resourceId = null;
            }
            if (lValueOf == null) {
                ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).Rt0("live_last_effect_id", null);
                ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).L80("live_last_effect_id", null);
            } else {
                ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).Rt0("live_last_effect_id", lValueOf.toString());
                ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).L80("live_last_effect_id", lValueOf.toString());
            }
            if (resourceId == null) {
                ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).Rt0("live_last_resource_id", null);
                ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).L80("live_last_resource_id", null);
            } else {
                ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).Rt0("live_last_resource_id", resourceId);
                ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).L80("live_last_resource_id", resourceId);
            }
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void Br(C0UG3 c0ug3) {
        ((ArrayList) this.LJIILIIL).remove(c0ug3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r0 = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) r11.LIZLLL).get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        r2 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r2.hasNext() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        r5 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(((com.bytedance.android.livesdkapi.depend.model.LiveEffect) r5).getResourceId(), r7.resourceId) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        r5 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        if (r5 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        r8 = r5.LJJJZ().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        if (r8.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        r4 = r8.next();
        r3 = r7.tagList.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (r3.hasNext() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        r2 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r4.tag, r2.LIZ) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (r2 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r1 = r2.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        r4.LIZ = X.C0UG7.LIZJ(X.C0U7C.LJIIJ(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ef, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        r6.add(LJJJJL(r12, r5, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
    
        r5 = null;
     */
    @Override // X.InterfaceC769000UEo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> Cr(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG5.Cr(java.lang.String):java.util.List");
    }

    @Override // X.InterfaceC769000UEo
    public final void Dr(C0U86 c0u86) {
        if (!((CopyOnWriteArrayList) this.LJIIL).contains(c0u86)) {
            ((CopyOnWriteArrayList) this.LJIIL).add(c0u86);
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void Fr(String str) {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.setRenderCacheString("LiveViewArea", str);
        }
    }

    @Override // X.C0U78
    public final void LIZ(C0UD1 c0ud1) {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.LIZ(c0ud1);
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void LIZIZ(String str) {
        this.LJIIIIZZ = str;
    }

    @Override // X.C0U78
    public final List<LiveEffect> LJ(String str) {
        List list;
        Object next;
        HashMap map = new HashMap();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
            return C13LP.LLIIII(map.values());
        }
        CopyOnWriteArrayList<LiveComposerNode> copyOnWriteArrayList = this.LJIILJJIL;
        ArrayList<LiveComposerNode> arrayList = new ArrayList();
        for (LiveComposerNode liveComposerNode : copyOnWriteArrayList) {
            LiveComposerNode liveComposerNode2 = liveComposerNode;
            if (Intrinsics.LJFF(liveComposerNode2.panel, str)) {
                if (((ConcurrentHashMap) this.LIZLLL).containsKey(liveComposerNode2.panel)) {
                    arrayList.add(liveComposerNode);
                }
            }
        }
        for (LiveComposerNode liveComposerNode3 : arrayList) {
            if (!map.containsKey(liveComposerNode3.resourceId) && (list = (List) ((ConcurrentHashMap) this.LIZLLL).get(str)) != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), liveComposerNode3.resourceId)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LiveEffect liveEffect = (LiveEffect) next;
                if (liveEffect != null) {
                    map.put(liveEffect.getResourceId(), LJJJJL(str, liveEffect, liveComposerNode3));
                }
            }
        }
        return C13LP.LLIIII(map.values());
    }

    @Override // X.C0U78
    public final void LJIIJJI(boolean z) {
        this.LJIIZILJ = z;
    }

    @Override // X.C0U78
    public final LiveComposerNode LJIILIIL(LiveEffect liveEffect) {
        return LJJJJI("liveguestbeauty", liveEffect, true, true, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.C0UG6, X.C0U78
    public final void LJIILLIIL(LiveEffect liveEffect) {
        LiveComposerNode next;
        Iterator<LiveComposerNode> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = next;
        if (liveComposerNode != null) {
            liveComposerNode.path = liveEffect.getFilePath();
            liveComposerNode.effectId = liveEffect.getEffectId();
        }
    }

    @Override // X.C0U78
    public final void LJIJJLI(boolean z) {
        Boolean boolValueOf;
        List<String> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0UG8 c0ug8 = this.LIZJ;
        String string = null;
        if (c0ug8 != null) {
            boolValueOf = Boolean.valueOf(c0ug8.LJIIIIZZ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", ");
        C0UG8 c0ug82 = this.LIZJ;
        if (c0ug82 != null && (list = c0ug82.LIZIZ) != null) {
            string = list.toString();
        }
        sbLIZ.append(string);
        C20441214yg.LIZIZ("EffectMonitor#saveNode", C2188811AlT.LIZIZ(sbLIZ));
        C0UG8 c0ug83 = this.LIZJ;
        if (c0ug83 != null && c0ug83.LJIIIIZZ && !c0ug83.LIZIZ.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator<String> it2 = c0ug83.LIZIZ.iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next());
            }
            ArrayList arrayList = new ArrayList();
            List<LiveComposerNode> list2 = this.LJFF;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) list2) {
                LiveComposerNode liveComposerNode = (LiveComposerNode) obj;
                C20441214yg.LIZIZ("EffectMonitor#saveNode2", liveComposerNode.panel);
                if (hashSet.contains(liveComposerNode.panel)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            CopyOnWriteArrayList<LiveComposerNode> copyOnWriteArrayList = this.LJIILJJIL;
            ArrayList arrayList3 = new ArrayList();
            for (LiveComposerNode liveComposerNode2 : copyOnWriteArrayList) {
                LiveComposerNode liveComposerNode3 = liveComposerNode2;
                C20441214yg.LIZIZ("EffectMonitor#saveNode3", liveComposerNode3.panel);
                if (hashSet.contains(liveComposerNode3.panel)) {
                    arrayList3.add(liveComposerNode2);
                }
            }
            arrayList.addAll(arrayList3);
            try {
                C20441214yg.LIZIZ("EffectMonitor#saveNode4", arrayList.toString());
                ((C770850ULr) this.LJIJ.getValue()).LIZLLL(arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LiveComposerManagerB", e.getMessage(), e);
            }
            ((ArrayList) this.LJFF).clear();
            if (z) {
                ((ArrayList) this.LJFF).addAll(arrayList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    @Override // X.C0U78
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r6) {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.bytedance.android.live.effect.model.composer.LiveComposerNode> r0 = r5.LJIILJJIL
            java.util.Iterator r3 = r0.iterator()
        L6:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L6f
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.live.effect.model.composer.LiveComposerNode r0 = (com.bytedance.android.live.effect.model.composer.LiveComposerNode) r0
            java.lang.String r1 = r0.resourceId
            java.lang.String r0 = r6.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6
        L20:
            com.bytedance.android.live.effect.model.composer.LiveComposerNode r2 = (com.bytedance.android.live.effect.model.composer.LiveComposerNode) r2
            if (r2 == 0) goto L6d
            java.util.List<com.bytedance.android.live.effect.model.composer.LiveComposerTagNode> r0 = r2.tagList
            if (r0 == 0) goto L6d
            java.util.Iterator r3 = r0.iterator()
        L2c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.live.effect.model.composer.LiveComposerTagNode r0 = (com.bytedance.android.live.effect.model.composer.LiveComposerTagNode) r0
            java.lang.String r1 = r0.LIZ
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r0 = X.C0U7C.LJIIJ(r6)
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.tag
        L43:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2c
            r4 = r2
        L4a:
            com.bytedance.android.live.effect.model.composer.LiveComposerTagNode r4 = (com.bytedance.android.live.effect.model.composer.LiveComposerTagNode) r4
            if (r4 == 0) goto L6d
            float r3 = r4.value
        L50:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r0 = X.C0U7C.LJIIJ(r6)
            r2 = 0
            if (r0 == 0) goto L69
            int r1 = r0.LIZIZ
        L59:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r0 = X.C0U7C.LJIIJ(r6)
            float r0 = X.C0UG7.LIZLLL(r0, r1)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L66
            r2 = 1
        L66:
            r0 = r2 ^ 1
            return r0
        L69:
            r1 = 0
            goto L59
        L6b:
            r0 = r4
            goto L43
        L6d:
            r3 = 0
            goto L50
        L6f:
            r2 = r4
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG5.LJJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect):boolean");
    }

    @Override // X.C0U78
    public final List<LiveComposerNode> LJJIIJ(List<? extends LiveEffect> list) {
        String strLJLL;
        if (this.LIZJ == null || ((ArrayList) this.LJFF).isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LiveComposerNode liveComposerNode : (ArrayList) this.LJFF) {
            if (liveComposerNode.use) {
                Iterator<? extends LiveEffect> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        LiveEffect next = it2.next();
                        LiveEffect liveEffect = next;
                        if (Intrinsics.LJFF(liveComposerNode.resourceId, liveEffect.getResourceId()) && (strLJLL = liveEffect.LJLL()) != null && u.LJJIIJZLJL(strLJLL, "beauty", false)) {
                            if (next != null) {
                                liveComposerNode.effectPanelKey = "beauty";
                                arrayList.add(liveComposerNode);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.C0UG6, X.C0U78
    public final boolean LJJIIZ(List<? extends LiveEffect> list) {
        C0UG9 c0ug9;
        String[] strArrLJIIJ;
        boolean z = false;
        if (list.isEmpty()) {
            C0UG8 c0ug8 = this.LIZJ;
            if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null && (strArrLJIIJ = c0ug9.LJIIJ()) != null) {
                LJJJ(strArrLJIIJ);
            }
            return false;
        }
        String str = C0UD4.LJFF;
        List<Pair<LiveEffect, LiveComposerNode>> listLJJJJLI = LJJJJLI(str, list);
        if (listLJJJJLI != null) {
            for (Pair pair : (ArrayList) listLJJJJLI) {
                LJJJLL(str, (LiveComposerNode) pair.getSecond(), (LiveEffect) pair.getFirst(), false, LiveBeautyFilterRestoreOpt.INSTANCE.enable());
            }
        }
        List<LiveComposerNode> list2 = this.LJFF;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list2) {
            if (Intrinsics.LJFF(((LiveComposerNode) obj).panel, str)) {
                arrayList.add(obj);
            }
        }
        ((ArrayList) this.LJFF).removeAll(arrayList);
        if (!LiveBeautySwitchSetting.INSTANCE.inExperiment() || !C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJIII.LIZIZ())) {
            List<LiveEffect> listLJIIIIZZ = C0U7C.LJIIIIZZ(list);
            List<LiveEffect> listLJ = LJ(str);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (ArrayList) listLJIIIIZZ) {
                if (!listLJ.contains(obj2)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                LJJJJI(str, (LiveEffect) it2.next(), false, true, Long.valueOf(System.currentTimeMillis()));
            }
            if (C500260Jjc.LJJIJIIJI(listLJ) || C500260Jjc.LJJIJIIJI(listLJIIIIZZ)) {
                z = true;
            }
        }
        LJJJLZIJ(null, "", true, true);
        return z;
    }

    public final void LJJJJJ(LiveComposerNode liveComposerNode) {
        if (LiveComposerGiftPrioritySwitch.INSTANCE.isEnable() && C500260Jjc.LJJIIZ(liveComposerNode.panel) && C0UD4.LJIIJ.contains(liveComposerNode.panel) && (!this.LJIILJJIL.isEmpty())) {
            this.LJIILJJIL.add(0, liveComposerNode);
        } else {
            this.LJIILJJIL.add(liveComposerNode);
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void lr(String str) {
        Object next;
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS17S1100000_12(this, str, 11));
            return;
        }
        if (Intrinsics.LJFF(str, C0UD4.LIZIZ)) {
            ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs().getClass();
            C405701hv.LJIIIZ = "";
            C405701hv.LJIIIIZZ = "";
        }
        CopyOnWriteArrayList<LiveComposerNode> copyOnWriteArrayList = this.LJIILJJIL;
        ArrayList<LiveComposerNode> arrayList = new ArrayList();
        for (LiveComposerNode liveComposerNode : copyOnWriteArrayList) {
            if (Intrinsics.LJFF(liveComposerNode.panel, str)) {
                arrayList.add(liveComposerNode);
            }
        }
        ArrayList<LiveEffect> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (LiveComposerNode liveComposerNode2 : arrayList) {
            List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(liveComposerNode2.panel);
            LiveEffect liveEffectLJJJJL = null;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), liveComposerNode2.resourceId)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LiveEffect liveEffect = (LiveEffect) next;
                if (liveEffect != null) {
                    liveEffectLJJJJL = LJJJJL(liveComposerNode2.panel, liveEffect, liveComposerNode2);
                }
            }
            arrayList2.add(liveEffectLJJJJL);
        }
        for (LiveEffect liveEffect2 : arrayList2) {
            if (liveEffect2 != null) {
                LJJJJZ(liveEffect2, str, true, true);
            }
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void nr(String str) {
        this.LJIIJ = str;
    }

    @Override // X.InterfaceC769000UEo
    public final void or(C0UG8 c0ug8) {
        Iterable iterable;
        this.LIZJ = c0ug8;
        if (c0ug8.LJII) {
            String str = c0ug8.LJI;
            if (str == null) {
                str = "broadcast";
            }
            Set setLIZ = C206500qt.LIZ(str);
            C0UG8 c0ug82 = this.LIZJ;
            if (c0ug82 == null || (iterable = c0ug82.LIZIZ) == null) {
                iterable = C08CX.INSTANCE;
            }
            ((C770850ULr) this.LJIJ.getValue()).LIZIZ(str, new AwS97S1200000_12(str, (String) this, (C0UG5) C15442062u.LJIIIZ(setLIZ, iterable), (Set<String>) 2));
        }
    }

    @Override // X.InterfaceC769000UEo
    public final List<LiveEffect> qr(String str) {
        List list;
        Object next;
        LiveComposerTagNode next2;
        float f;
        HashMap map = new HashMap();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
            return C13LP.LLIIII(map.values());
        }
        CopyOnWriteArrayList<LiveComposerNode> copyOnWriteArrayList = this.LJIILJJIL;
        ArrayList<LiveComposerNode> arrayList = new ArrayList();
        for (LiveComposerNode liveComposerNode : copyOnWriteArrayList) {
            LiveComposerNode liveComposerNode2 = liveComposerNode;
            if (Intrinsics.LJFF(liveComposerNode2.panel, str)) {
                if (((ConcurrentHashMap) this.LIZLLL).containsKey(liveComposerNode2.panel) && liveComposerNode2.use) {
                    arrayList.add(liveComposerNode);
                }
            }
        }
        for (LiveComposerNode liveComposerNode3 : arrayList) {
            if (!map.containsKey(liveComposerNode3.resourceId) && (list = (List) ((ConcurrentHashMap) this.LIZLLL).get(str)) != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), liveComposerNode3.resourceId)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LiveEffect liveEffect = (LiveEffect) next;
                if (liveEffect != null) {
                    map.put(liveEffect.getResourceId(), LJJJJL(str, liveEffect, liveComposerNode3));
                    for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
                        Iterator<LiveComposerTagNode> it3 = liveComposerNode3.tagList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                if (Intrinsics.LJFF(composerConfig.tag, next2.LIZ)) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        LiveComposerTagNode liveComposerTagNode = next2;
                        if (liveComposerTagNode != null) {
                            f = liveComposerTagNode.value;
                        } else {
                            f = 0.0f;
                        }
                        composerConfig.LIZ = C0UG7.LIZJ(C0U7C.LJIIJ(liveEffect), f);
                    }
                }
            }
        }
        return C13LP.LLIIII(map.values());
    }

    @Override // X.InterfaceC769000UEo
    public final void rr(String str) {
        this.LJII = str;
    }

    @Override // X.InterfaceC769000UEo
    public final void tr(C0U86 c0u86) {
        ((CopyOnWriteArrayList) this.LJIIL).remove(c0u86);
    }

    @Override // X.InterfaceC769000UEo
    public final void vr(String str) {
        this.LJIIIZ = str;
    }

    @Override // X.InterfaceC769000UEo
    public final void wr(C0UG3 c0ug3) {
        if (!((ArrayList) this.LJIILIIL).contains(c0ug3)) {
            ((ArrayList) this.LJIILIIL).add(c0ug3);
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void yr(String str) {
        this.LJIIJJI = str;
    }

    @Override // X.InterfaceC769000UEo
    public final void zr(boolean z) {
        C770170UJb.LIZIZ("refresh Sticker");
        this.LJIILLIIL.clear();
        this.LJIILL.clear();
        LJJJLZIJ(null, "", true, z);
    }

    @Override // X.C0U78
    public final void LJIIIIZZ(LiveEffect liveEffect, String str) {
        if (this.LIZJ == null) {
            return;
        }
        Gr(str, (LiveEffect) C13LP.LJJJLL(qr(str)), liveEffect);
    }

    @Override // X.C0U78
    public final void LJIIJ(LiveEffect liveEffect, String str) {
        LJJJJZ(liveEffect, str, true, true);
    }

    @Override // X.C0U78
    public final int LJIILL(String str, String str2) {
        C0UG9 c0ug9;
        int[] iArr = new int[1];
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.composerCheckNodeExclusion(str, str2, iArr);
        }
        return iArr[0];
    }

    @Override // X.C0U78
    public final void LJIIZILJ(int i, LiveEffect liveEffect) {
        boolean z;
        LiveComposerNode next;
        List<LiveComposerTagNode> list;
        LiveComposerTagNode next2;
        if (this.LIZJ == null) {
            return;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, "liveguestbeauty", C0UCA.SYNC_TAG);
        Iterator<LiveComposerNode> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LiveComposerNode next3 = it2.next();
            if (Intrinsics.LJFF(next3.resourceId, liveEffect.getResourceId())) {
                if (next3 != null) {
                    z = true;
                }
            }
        }
        z = false;
        LJJJJI("liveguestbeauty", liveEffect, false, false, null);
        Iterator<LiveComposerNode> it3 = this.LJIILJJIL.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(next.resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = next;
        if (liveComposerNode != null) {
            for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
                composerConfig.LIZ = i;
                Iterator<LiveComposerTagNode> it4 = liveComposerNode.tagList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (Intrinsics.LJFF(composerConfig.tag, next2.LIZ)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                LiveComposerTagNode liveComposerTagNode = next2;
                if (liveComposerTagNode != null) {
                    liveComposerTagNode.value = C0UG7.LIZLLL(composerConfig, i);
                    liveComposerTagNode.uiValue = Integer.valueOf(i);
                }
            }
            liveComposerNode.updateTime = System.currentTimeMillis();
        }
        if (z) {
            LJJJLZIJ(liveEffect, "liveguestbeauty", true, false);
        }
        if (!LiveBeautyDownloadOptSetting.INSTANCE.inExperiment()) {
            for (C0UG2 c0ug2 : (ArrayList) this.LJIILIIL) {
                if (liveComposerNode != null && (list = liveComposerNode.tagList) != null) {
                    for (LiveComposerTagNode liveComposerTagNode2 : list) {
                        c0ug2.LIZIZ();
                    }
                }
            }
        }
        C0UC4 c0uc42 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.SYNC_TAG);
    }

    @Override // X.C0U78
    public final Float LJIJ(String str, String str2) {
        LiveComposerNode next;
        LiveComposerTagNode next2;
        Iterator<LiveComposerNode> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.resourceId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = next;
        if (liveComposerNode == null) {
            return null;
        }
        Iterator<LiveComposerTagNode> it3 = liveComposerNode.tagList.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(next2.LIZ, str2)) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        LiveComposerTagNode liveComposerTagNode = next2;
        if (liveComposerTagNode == null) {
            return null;
        }
        return Float.valueOf(liveComposerTagNode.value);
    }

    @Override // X.C0U78
    public final void LJJII(String str, List<? extends LiveEffect> list) {
        C013C c013c = new C013C();
        if (LiveBeautyFilterRestoreOpt.INSTANCE.enable()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<? extends LiveEffect> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getFilePath());
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("res: ");
            sbLIZ.append(C1516000pYM.LIZJ(setLLIIJI));
            C20441214yg.LIZIZ("EffectMonitor#restore", C2188811AlT.LIZIZ(sbLIZ));
            C19719612Di.LJJIIJ(this.LJIILJJIL, new AwS97S1200000_12(str, (String) setLLIIJI, (Set<String>) c013c, (C013C) 1), true);
        }
        List<Pair<LiveEffect, LiveComposerNode>> listLJJJJLI = LJJJJLI(str, list);
        if (listLJJJJLI != null && !((ArrayList) listLJJJJLI).isEmpty()) {
            for (Pair pair : (ArrayList) listLJJJJLI) {
                LJJJLL(str, (LiveComposerNode) pair.getSecond(), (LiveEffect) pair.getFirst(), true, LiveBeautyFilterRestoreOpt.INSTANCE.enable());
            }
            List<LiveComposerNode> list2 = this.LJFF;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (ArrayList) list2) {
                if (Intrinsics.LJFF(((LiveComposerNode) obj).panel, str)) {
                    arrayList2.add(obj);
                }
            }
            ((ArrayList) this.LJFF).removeAll(arrayList2);
            return;
        }
        if (c013c.element) {
            zr(false);
        }
    }

    public final List<LiveComposerTagNode> LJJJJJL(LiveEffect liveEffect, List<LiveComposerTagNode> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin: ");
        sbLIZ.append(list.size());
        sbLIZ.append(", new: ");
        sbLIZ.append(liveEffect.LJJJZ().size());
        C20441214yg.LIZIZ("EffectMonitor#taglist", C2188811AlT.LIZIZ(sbLIZ));
        HashMap map = new HashMap();
        for (LiveComposerTagNode liveComposerTagNode : list) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(liveComposerTagNode.LIZ);
            sbLIZ2.append(':');
            sbLIZ2.append(liveComposerTagNode.value);
            C20441214yg.LIZIZ("EffectMonitor#taglist", C2188811AlT.LIZIZ(sbLIZ2));
            map.put(liveComposerTagNode.LIZ, liveComposerTagNode);
        }
        for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
            LiveComposerTagNode liveComposerTagNode2 = (LiveComposerTagNode) map.get(composerConfig.tag);
            if (liveComposerTagNode2 != null) {
                liveComposerTagNode2.LIZJ = composerConfig;
                if (!this.LJI.contains(liveEffect.getResourceId())) {
                    String str = composerConfig.tag;
                    liveComposerTagNode2.value = C0UG7.LIZLLL(composerConfig, composerConfig.LIZIZ);
                    liveComposerTagNode2.uiValue = Integer.valueOf(composerConfig.LIZIZ);
                    map.put(str, liveComposerTagNode2);
                }
            } else {
                String str2 = composerConfig.tag;
                LiveComposerTagNode liveComposerTagNode3 = new LiveComposerTagNode(str2);
                liveComposerTagNode3.value = C0UG7.LIZLLL(composerConfig, composerConfig.LIZIZ);
                liveComposerTagNode3.uiValue = Integer.valueOf(composerConfig.LIZIZ);
                liveComposerTagNode3.resourceId = liveEffect.getResourceId();
                map.put(str2, liveComposerTagNode3);
            }
        }
        for (String str3 : liveEffect.LJJIJIIJIL()) {
            if (!map.containsKey(str3)) {
                map.put(str3, new LiveComposerTagNode(str3));
            }
        }
        return C13LP.LLIIII(map.values());
    }

    public final List<Pair<LiveEffect, LiveComposerNode>> LJJJJLI(String str, List<? extends LiveEffect> list) {
        List<String> list2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null) {
            list2 = c0ug8.LIZIZ;
        } else {
            list2 = null;
        }
        sbLIZ.append(list2);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJFF);
        C20441214yg.LIZIZ("EffectMonitor#restore0", C2188811AlT.LIZIZ(sbLIZ));
        C0UG8 c0ug82 = this.LIZJ;
        if (c0ug82 == null) {
            return null;
        }
        List arrayList = c0ug82.LIZIZ;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(str) || ((ArrayList) this.LJFF).isEmpty()) {
            return null;
        }
        C20441214yg.LIZIZ("EffectMonitor#restore1", "");
        HashMap map = new HashMap();
        for (LiveComposerNode liveComposerNode : this.LJFF) {
            map.put(liveComposerNode.resourceId, liveComposerNode);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(list.size());
        sbLIZ2.append(", ");
        sbLIZ2.append(map.size());
        C20441214yg.LIZIZ("EffectMonitor#restore2", C2188811AlT.LIZIZ(sbLIZ2));
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        while (!linkedList.isEmpty()) {
            LiveEffect liveEffect = (LiveEffect) linkedList.pop();
            C20441214yg.LIZIZ("EffectMonitor#restore3", liveEffect.getResourceId());
            if (C0U7C.LJIILJJIL(liveEffect)) {
                List<LiveEffect> listLL = liveEffect.LL();
                if (listLL != null) {
                    for (LiveEffect liveEffect2 : listLL) {
                        if (map.containsKey(liveEffect2.getResourceId())) {
                            linkedList.add(liveEffect2);
                        }
                    }
                }
            } else {
                LiveComposerNode liveComposerNode2 = (LiveComposerNode) map.get(liveEffect.getResourceId());
                if (liveComposerNode2 != null) {
                    if (liveEffect.LJLLL()) {
                        for (LiveComposerTagNode liveComposerTagNode : liveComposerNode2.tagList) {
                            Integer num = liveComposerTagNode.uiValue;
                            if (num != null) {
                                liveComposerTagNode.value = C0UG7.LIZLLL(C0U7C.LJIIJ(liveEffect), num.intValue());
                            }
                        }
                    }
                    arrayList2.add(new Pair(liveEffect, liveComposerNode2));
                }
            }
        }
        return arrayList2;
    }

    public final void LJJJJLL(String str, boolean z) {
        C0UG9 c0ug9;
        C0UG9 c0ug92;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 == null) {
            return;
        }
        if (c0ug8.LIZJ != null) {
            try {
                LJJIZ(z);
                C0UG8 c0ug82 = this.LIZJ;
                if (c0ug82 != null && (c0ug92 = c0ug82.LIZJ) != null) {
                    c0ug92.LJIJI(new String[0]);
                }
                C0UG8 c0ug83 = this.LIZJ;
                if (c0ug83 != null && (c0ug9 = c0ug83.LIZJ) != null) {
                    c0ug9.hide();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJI("LiveComposerManagerOPT", th);
            }
        }
        if (this.LJIIZILJ) {
            C0UG8 c0ug84 = this.LIZJ;
            LJIJJLI(z);
        }
        this.LJIILJJIL.clear();
        ((ConcurrentHashMap) this.LIZLLL).clear();
        ((CopyOnWriteArrayList) this.LJIIL).clear();
        ((ArrayList) this.LJIILIIL).clear();
        this.LJIILL.clear();
        this.LJIILLIIL.clear();
        this.LJI.clear();
        this.LIZJ = null;
    }

    public final void LJJLI(LiveEffect liveEffect, String str) {
        boolean zContains;
        List<String> list;
        List<C0UG1> list2;
        if (this.LIZJ == null) {
            return;
        }
        C20441214yg.LIZIZ("EffectMonitor#addCurrentSticker", String.valueOf(liveEffect.LJJJJJ().size()));
        if (liveEffect.LJJJJJ().isEmpty()) {
            C20441214yg.LIZIZ("EffectMonitor#addCurrentSticker", "isEmpty");
            C0UG8 c0ug8 = this.LIZJ;
            if (c0ug8 != null && (list2 = c0ug8.LIZ) != null) {
                ArrayList<C0UG1> arrayList = new ArrayList();
                for (C0UG1 c0ug1 : list2) {
                    if (Intrinsics.LJFF(c0ug1.LIZIZ, str)) {
                        arrayList.add(c0ug1);
                    }
                }
                for (C0UG1 c0ug12 : arrayList) {
                    C20441214yg.LIZIZ("EffectMonitor#addCurrentSticker", C13LP.LJJLIIIJ(c0ug12.LIZ, ",", null, null, 0, null, null, 62));
                    liveEffect.LJJJJJ().addAll(c0ug12.LIZ);
                }
            }
        }
        C20441214yg.LIZIZ("EffectMonitor#addCurrentSticker", String.valueOf(liveEffect.LJJJJJ().size()));
        if (liveEffect.LJIIZILJ() == null) {
            C0UG8 c0ug82 = this.LIZJ;
            if (c0ug82 != null && (list = c0ug82.LIZLLL) != null) {
                zContains = list.contains(str);
            } else {
                zContains = false;
            }
            liveEffect.LLII(zContains);
        }
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
            ((ConcurrentHashMap) this.LIZLLL).put(str, new ArrayList());
        }
        List list3 = (List) ((ConcurrentHashMap) this.LIZLLL).get(str);
        if (list3 != null) {
            list3.remove(liveEffect);
            list3.add(liveEffect);
        }
        String str2 = C0UAS.LIZIZ;
        if (str2 != null && str2.length() > 0 && Intrinsics.LJFF(str, C0UD4.LIZIZ) && !Intrinsics.LJFF(str2, liveEffect.getResourceId())) {
            C500260Jjc.LJJLIIIJJI(500L, AFwS199S0000000_12.get$arr$(247));
        }
    }

    @Override // X.InterfaceC769000UEo
    public final int LJJZ(String str, String str2) {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            return c0ug9.LJJZ(str, str2);
        }
        return 0;
    }

    @Override // X.InterfaceC769000UEo
    public final void kr(LiveEffect liveEffect, String str) {
        LJJL(liveEffect);
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS17S1200000_12(this, liveEffect, str, 9));
        } else {
            LJJJJI(str, liveEffect, true, true, Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void setRenderCacheString(String str, String str2) {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.setRenderCacheString(str, str2);
        }
    }

    public static LiveEffect LJJJJL(String str, LiveEffect liveEffect, LiveComposerNode liveComposerNode) {
        List<LiveEffect> list;
        LiveEffect next;
        if (str == null || !liveEffect.LJJLIIIJJI()) {
            return liveEffect;
        }
        C0U8F c0u8f = C0U8F.LIZ;
        if (Intrinsics.LJFF(str, C0UD4.LIZIZ) && (list = C0U8F.LIZIZ.get(liveEffect.getResourceId())) != null) {
            Iterator<LiveEffect> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.Wp(), liveComposerNode.LIZIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LiveEffect liveEffect2 = next;
            if (liveEffect2 != null) {
                return liveEffect2;
            }
        }
        return liveEffect;
    }

    @Override // X.InterfaceC769000UEo
    public final void Gr(String str, LiveEffect liveEffect, LiveEffect liveEffect2) {
        LiveComposerNode liveComposerNodeLJJJJZ;
        boolean z;
        C0UG9 c0ug9;
        C0UG9 c0ug92;
        LiveEffect.AudioGraphBean audioGraphBean;
        ArrayList<String> sources;
        LiveEffect.AudioGraphBean audioGraphBean2;
        ArrayList<String> sources2;
        LiveEffect.AudioGraphBean audioGraphBean3;
        Boolean useOutput;
        C20441214yg.LIZIZ("EffectMonitor#ComposerReplace0", "");
        if (this.LIZJ == null) {
            return;
        }
        C20441214yg.LIZIZ("EffectMonitor#ComposerReplace", "");
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UCA c0uca = C0UCA.REPLACE_EFFECT;
        C0UC4.LJIJ(liveEffect2, str, c0uca);
        if (Intrinsics.LJFF(str, C0UD4.LIZIZ)) {
            PerformanceManagerImpl performanceManagerImplRs = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs();
            String resourceId = liveEffect2.getResourceId();
            String strWp = liveEffect2.Wp();
            performanceManagerImplRs.getClass();
            C405701hv.LJIIIZ = resourceId;
            C405701hv.LJIIIIZZ = strWp;
        }
        if (liveEffect == null) {
            liveComposerNodeLJJJJZ = null;
        } else {
            liveComposerNodeLJJJJZ = LJJJJZ(liveEffect, str, false, !Intrinsics.LJFF(liveEffect.LIZJ, liveEffect2.LIZJ));
        }
        LiveComposerNode liveComposerNodeLJJJJI = LJJJJI(str, liveEffect2, false, true, null);
        LJJJLZIJ(liveEffect2, str, false, false);
        if (liveComposerNodeLJJJJI == null) {
            C0UC4.LJIIZILJ(liveEffect2.getEffectId(), c0uca);
            return;
        }
        if (liveComposerNodeLJJJJZ != null && Intrinsics.LJFF(liveComposerNodeLJJJJZ.resourceId, liveComposerNodeLJJJJI.resourceId) && !Intrinsics.LJFF(liveComposerNodeLJJJJZ.LIZIZ, liveComposerNodeLJJJJI.LIZIZ)) {
            z = true;
        } else {
            z = false;
        }
        String[] strArrLJII = C0UG7.LJII(liveComposerNodeLJJJJI, false);
        String[] strArrLJ = C0UG7.LJ(this.LIZLLL, strArrLJII, z);
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect2.LJLJLLL();
        if (stickerSDKExtraLJLJLLL != null && (audioGraphBean3 = stickerSDKExtraLJLJLLL.audioGraph) != null && (useOutput = audioGraphBean3.getUseOutput()) != null) {
            useOutput.booleanValue();
        }
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL2 = liveEffect2.LJLJLLL();
        if (stickerSDKExtraLJLJLLL2 != null && (audioGraphBean2 = stickerSDKExtraLJLJLLL2.audioGraph) != null && (sources2 = audioGraphBean2.getSources()) != null) {
            sources2.contains("mic");
        }
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL3 = liveEffect2.LJLJLLL();
        if (stickerSDKExtraLJLJLLL3 != null && (audioGraphBean = stickerSDKExtraLJLJLLL3.audioGraph) != null && (sources = audioGraphBean.getSources()) != null) {
            sources.contains("music");
        }
        LJJIJL(Collections.singletonList(liveComposerNodeLJJJJI));
        if (liveComposerNodeLJJJJZ != null) {
            String[] strArrLJII2 = C0UG7.LJII(liveComposerNodeLJJJJZ, true);
            LJJL(liveEffect2);
            C0UG8 c0ug8 = this.LIZJ;
            if (c0ug8 != null && (c0ug92 = c0ug8.LIZJ) != null) {
                C0UGD c0ugd = this.LJ;
                c0ug92.LJIILLIIL(strArrLJII2, strArrLJII, strArrLJ, c0ugd.LIZ, c0ugd.LIZIZ, c0ugd.LIZJ);
            }
        } else {
            LJJL(liveEffect2);
            C0UG8 c0ug82 = this.LIZJ;
            if (c0ug82 != null && (c0ug9 = c0ug82.LIZJ) != null) {
                C0UGD c0ugd2 = this.LJ;
                c0ug9.LJIIIIZZ(strArrLJII, strArrLJ, c0ugd2.LIZ, c0ugd2.LIZIZ, c0ugd2.LIZJ);
            }
        }
        C0UC4.LJIIZILJ(liveEffect2.getEffectId(), c0uca);
    }

    @Override // X.C0U78
    public final void LJII(List<? extends LiveEffect> list, List<String> list2, List<Float> list3) {
        LiveComposerNode next;
        List<LiveComposerTagNode> list4;
        LiveComposerTagNode next2;
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && c0ug8.LIZJ != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            ArrayList arrayList2 = (ArrayList) list;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((LiveEffect) it2.next()).getFilePath());
            }
            int i = 0;
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            C0UG8 c0ug82 = this.LIZJ;
            if (c0ug82 != null && (c0ug9 = c0ug82.LIZJ) != null) {
                c0ug9.LJI(strArr, (String[]) ((ArrayList) list2).toArray(new String[0]), C13LP.LLI(list3));
            }
            if (arrayList2.size() == ((ArrayList) list2).size() && arrayList2.size() == list3.size()) {
                for (Object obj : arrayList2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        LiveEffect liveEffect = (LiveEffect) obj;
                        Iterator<LiveComposerNode> it3 = this.LJIILJJIL.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (Intrinsics.LJFF(next.resourceId, liveEffect.getResourceId())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        LiveComposerNode liveComposerNode = next;
                        if (liveComposerNode != null && (list4 = liveComposerNode.tagList) != null) {
                            Iterator<LiveComposerTagNode> it4 = list4.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    if (Intrinsics.LJFF(next2.LIZ, ListProtector.get(list2, i))) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            LiveComposerTagNode liveComposerTagNode = next2;
                            if (liveComposerTagNode != null) {
                                liveComposerTagNode.value = ((Number) ListProtector.get(list3, i)).floatValue();
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }

    @Override // X.C0U78
    public final void LJIL(int i, LiveEffect liveEffect, String str) {
        LiveComposerNode next;
        LiveComposerNode next2;
        List<LiveComposerTagNode> list;
        int i2;
        boolean z;
        LiveComposerTagNode next3;
        if (this.LIZJ == null) {
            return;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.UPDATE_TAG);
        Iterator<LiveComposerNode> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = next;
        if (liveComposerNode == null) {
            LJJJJI(str, liveEffect, false, true, null);
        } else {
            liveComposerNode.use = true;
        }
        Iterator<LiveComposerNode> it3 = this.LJIILJJIL.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(next2.resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode2 = next2;
        if (liveComposerNode2 != null) {
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ != null) {
                i2 = composerConfigLJIIJ.LIZIZ;
            } else {
                i2 = 0;
            }
            if (i2 != i) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(z));
            liveComposerNode2.modified = zLJJJI ? 1 : 0;
            if (zLJJJI) {
                this.LJI.add(liveComposerNode2.resourceId);
            } else {
                this.LJI.remove(liveComposerNode2.resourceId);
            }
            for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
                if (composerConfig.LIZ != i) {
                    composerConfig.LIZ = i;
                    Iterator<LiveComposerTagNode> it4 = liveComposerNode2.tagList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next3 = it4.next();
                            if (Intrinsics.LJFF(composerConfig.tag, next3.LIZ)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    LiveComposerTagNode liveComposerTagNode = next3;
                    if (liveComposerTagNode != null) {
                        if (liveComposerNode2.modified == 1) {
                            if (liveComposerTagNode.LIZIZ != -999.0f) {
                                C0U7R c0u7r = C0U7R.LIZ;
                                C0U7R.LJIILLIIL.put(liveEffect.getResourceId(), 4);
                            }
                            float fLIZLLL = C0UG7.LIZLLL(composerConfig, i);
                            if (liveComposerTagNode.value != fLIZLLL) {
                                liveComposerTagNode.value = fLIZLLL;
                                liveComposerTagNode.uiValue = Integer.valueOf(i);
                            }
                        } else {
                            if (liveComposerTagNode.LIZIZ != -999.0f) {
                                C0U7R c0u7r2 = C0U7R.LIZ;
                                C0U7R.LJIILLIIL.put(liveEffect.getResourceId(), 3);
                            }
                            float fLIZLLL2 = C0UG7.LIZLLL(composerConfig, composerConfig.LIZIZ);
                            if (liveComposerTagNode.value != fLIZLLL2) {
                                liveComposerTagNode.value = fLIZLLL2;
                                liveComposerTagNode.uiValue = Integer.valueOf(composerConfig.LIZIZ);
                            }
                        }
                    }
                }
            }
            liveComposerNode2.updateTime = System.currentTimeMillis();
            C20441214yg.LIZIZ("EffectMonitor#resReq", "updateOtherTag");
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0U5T(liveEffect, i, null), 3);
        }
        LJJJLZIJ(liveEffect, str, true, false);
        if (!LiveBeautyDownloadOptSetting.INSTANCE.inExperiment()) {
            for (C0UG2 c0ug2 : (ArrayList) this.LJIILIIL) {
                if (liveComposerNode2 != null && (list = liveComposerNode2.tagList) != null) {
                    for (LiveComposerTagNode liveComposerTagNode2 : list) {
                        c0ug2.LIZIZ();
                    }
                }
            }
        }
        C0UC4 c0uc42 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.UPDATE_TAG);
    }

    public final void LJJJJZI(List<LiveComposerNode> list, List<LiveComposerNode> list2, String[] strArr) {
        C0UG9 c0ug9;
        Pair pairLJIIIZ = C0UG7.LJIIIZ(list);
        String[] strArr2 = (String[]) pairLJIIIZ.getFirst();
        String[] strArr3 = (String[]) pairLJIIIZ.getSecond();
        String[] strArrLJIIIIZZ = C0UG7.LJIIIIZZ(list2);
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            if (strArr != null) {
                strArrLJIIIIZZ = (String[]) C13DL.LJIIIZ(strArr, strArrLJIIIIZZ);
            }
            C0UGD c0ugd = this.LJ;
            c0ug9.LJIILLIIL(strArrLJIIIIZZ, strArr2, strArr3, c0ugd.LIZ, c0ugd.LIZIZ, c0ugd.LIZJ);
        }
    }

    public final void LJJJLIIL(List<LiveComposerNode> list, List<LiveComposerNode> list2, String[] strArr) {
        C0UG9 c0ug9;
        C0UG9 c0ug92;
        if (C13LP.LJJJLL(list) != null) {
            int i = 0;
            for (Object obj : (ArrayList) list) {
                int i2 = i + 1;
                if (i >= 0) {
                    String[] strArrLJII = C0UG7.LJII((LiveComposerNode) obj, false);
                    String[] strArrLJ = C0UG7.LJ(this.LIZLLL, strArrLJII, false);
                    if (i == 0) {
                        C0UG8 c0ug8 = this.LIZJ;
                        if (c0ug8 != null && (c0ug92 = c0ug8.LIZJ) != null) {
                            C0UGD c0ugd = this.LJ;
                            c0ug92.LJIILLIIL(strArr, strArrLJII, strArrLJ, c0ugd.LIZ, c0ugd.LIZIZ, c0ugd.LIZJ);
                        }
                    } else {
                        C0UG8 c0ug82 = this.LIZJ;
                        if (c0ug82 != null && (c0ug9 = c0ug82.LIZJ) != null) {
                            C0UGD c0ugd2 = this.LJ;
                            c0ug9.LJIIIIZZ(strArrLJII, strArrLJ, c0ugd2.LIZ, c0ugd2.LIZIZ, c0ugd2.LIZJ);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (!list2.isEmpty()) {
            String[] strArrLJIIIIZZ = C0UG7.LJIIIIZZ(list2);
            if (strArr != null) {
                strArrLJIIIIZZ = (String[]) C13DL.LJIIIZ(strArr, strArrLJIIIIZZ);
            }
            LJJJ(strArrLJIIIIZZ);
        }
    }

    @Override // X.C0U78
    public final void LIZJ(int i, int i2, String str, String str2) {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.LIZJ(i, i2, str, str2);
        }
    }

    @Override // X.C0U78
    public final void LJI(String str, LiveEffect liveEffect, float f, int i) {
        Object obj;
        C0UG9 c0ug9;
        LiveComposerNode liveComposerNodeLJJJJI = LJJJJI(str, liveEffect, false, true, null);
        if (liveComposerNodeLJJJJI == null) {
            return;
        }
        Iterator<LiveComposerTagNode> it2 = liveComposerNodeLJJJJI.tagList.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            LiveComposerTagNode next = it2.next();
            String str2 = next.LIZ;
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ != null) {
                obj = composerConfigLJIIJ.tag;
            }
            if (Intrinsics.LJFF(str2, obj)) {
                obj = next;
                break;
            }
        }
        LiveComposerTagNode liveComposerTagNode = (LiveComposerTagNode) obj;
        if (liveComposerTagNode != null) {
            liveComposerTagNode.value = f;
            liveComposerTagNode.uiValue = Integer.valueOf(i);
        }
        LJJJLZIJ(liveEffect, str, false, false);
        LJJIJLIJ(liveEffect, str);
        String[] strArrLJII = C0UG7.LJII(liveComposerNodeLJJJJI, false);
        String[] strArrLJ = C0UG7.LJ(this.LIZLLL, strArrLJII, false);
        LJJIJL(Collections.singletonList(liveComposerNodeLJJJJI));
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.LJIILIIL(strArrLJII, strArrLJ);
        }
    }

    public final LiveComposerNode LJJJJZ(final LiveEffect liveEffect, final String str, final boolean z, final boolean z2) {
        LiveComposerNode next;
        boolean z3;
        List arrayList;
        String strOk;
        C0UG9 c0ug9;
        LJJL(liveEffect);
        String str2 = null;
        if (LiveEffectStructureOptSetting.INSTANCE.enable() && !Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C1701940uOG.LIZIZ().LIZIZ(new Runnable() { // from class: X.0UGB
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveComposerManagerOPT@a709.removeCurrentSticker$1");
                    try {
                        this.LL.LJJJJZ(liveEffect, str, z, z2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveComposerManagerOPT@a709.removeCurrentSticker$1");
                }
            });
            return null;
        }
        if (this.LIZJ == null) {
            return null;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.REMOVE_EFFECT);
        Iterator<LiveComposerNode> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = next;
        if (liveComposerNode == null) {
            C0UC4 c0uc42 = C0UC4.LIZ;
            C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.REMOVE_EFFECT);
            return null;
        }
        this.LJIILJJIL.remove(liveComposerNode);
        if (liveComposerNode.use && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 == null || (arrayList = c0ug8.LJ) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.contains(liveComposerNode.panel)) {
            liveComposerNode.use = false;
            this.LJIILJJIL.add(liveComposerNode);
        }
        if (z) {
            LJJJLZIJ(liveEffect, str, true, false);
        }
        if (C0UG6.LJJJI(str) && z3) {
            C0UC4 c0uc43 = C0UC4.LIZ;
            C0UG8 c0ug82 = this.LIZJ;
            if (c0ug82 == null || (c0ug9 = c0ug82.LIZJ) == null || (strOk = c0ug9.ok()) == null) {
                strOk = "";
            }
            HashMap<String, ArrayList<String>> map = this.LIZIZ;
            C0UG8 c0ug83 = this.LIZJ;
            if (c0ug83 != null) {
                str2 = c0ug83.LJI;
            }
            C0UC4.LJJIFFI(strOk, map, Intrinsics.LJFF(str2, "guest_linkmic"));
        }
        LJJIL(liveEffect, str);
        Iterator it3 = ((CopyOnWriteArrayList) this.LJIIL).iterator();
        while (it3.hasNext()) {
            ((C0U86) it3.next()).LIZ(liveEffect, str, false);
        }
        C0UC4 c0uc44 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.REMOVE_EFFECT);
        return liveComposerNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[Catch: all -> 0x0201, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x000e, B:6:0x0014, B:7:0x0024, B:12:0x0041, B:13:0x0048, B:14:0x0058, B:16:0x005e, B:17:0x006a, B:19:0x0078, B:20:0x0080, B:21:0x008a, B:23:0x0091, B:25:0x009f, B:27:0x00a9, B:29:0x00ad, B:31:0x00b5, B:33:0x00b9, B:35:0x00c7, B:37:0x00cf, B:39:0x00d4, B:41:0x00dc, B:44:0x00e1, B:46:0x00ee, B:48:0x00f6, B:52:0x0100, B:49:0x00fa, B:53:0x011e, B:56:0x0123, B:58:0x014b, B:59:0x0154, B:61:0x015a, B:63:0x016d, B:66:0x017a, B:68:0x017e, B:70:0x0182, B:72:0x0187, B:74:0x0190, B:76:0x0194, B:78:0x0198, B:79:0x019c, B:94:0x01d2, B:95:0x01db, B:97:0x01e1, B:99:0x01f4, B:80:0x01a0, B:82:0x01a4, B:84:0x01a8, B:85:0x01ac, B:86:0x01b0, B:88:0x01b8, B:89:0x01bb, B:91:0x01c3, B:93:0x01cb), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa A[Catch: all -> 0x0201, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x000e, B:6:0x0014, B:7:0x0024, B:12:0x0041, B:13:0x0048, B:14:0x0058, B:16:0x005e, B:17:0x006a, B:19:0x0078, B:20:0x0080, B:21:0x008a, B:23:0x0091, B:25:0x009f, B:27:0x00a9, B:29:0x00ad, B:31:0x00b5, B:33:0x00b9, B:35:0x00c7, B:37:0x00cf, B:39:0x00d4, B:41:0x00dc, B:44:0x00e1, B:46:0x00ee, B:48:0x00f6, B:52:0x0100, B:49:0x00fa, B:53:0x011e, B:56:0x0123, B:58:0x014b, B:59:0x0154, B:61:0x015a, B:63:0x016d, B:66:0x017a, B:68:0x017e, B:70:0x0182, B:72:0x0187, B:74:0x0190, B:76:0x0194, B:78:0x0198, B:79:0x019c, B:94:0x01d2, B:95:0x01db, B:97:0x01e1, B:99:0x01f4, B:80:0x01a0, B:82:0x01a4, B:84:0x01a8, B:85:0x01ac, B:86:0x01b0, B:88:0x01b8, B:89:0x01bb, B:91:0x01c3, B:93:0x01cb), top: B:105:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJJJLZIJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG5.LJJJLZIJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, boolean, boolean):void");
    }

    @Override // X.InterfaceC769000UEo
    public final void sendEffectMsg(int i, int i2, int i3, String str) {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.sendEffectMsg(i, i2, i3, str);
        }
    }

    public final LiveComposerNode LJJJJ(String str, LiveComposerNode liveComposerNode, LiveEffect liveEffect, boolean z, boolean z2) {
        boolean zBooleanValue;
        LiveComposerNode liveComposerNode2 = null;
        if (this.LIZJ == null) {
            return null;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.ADD_EFFECT);
        C766720U5u.LIZ.getClass();
        C766720U5u.LJIJ(liveEffect);
        if (liveComposerNode.use) {
            LJJIJLIJ(liveEffect, str);
        }
        LJJLI(liveEffect, str);
        Iterator<LiveComposerNode> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LiveComposerNode next = it2.next();
            if (Intrinsics.LJFF(next.resourceId, liveEffect.getResourceId())) {
                liveComposerNode2 = next;
                break;
            }
        }
        LiveComposerNode liveComposerNode3 = liveComposerNode2;
        if (liveComposerNode3 != null) {
            if (!z2) {
                this.LJIILJJIL.remove(liveComposerNode3);
            }
            C20441214yg.LIZIZ("EffectMonitor#createTagList", String.valueOf(liveComposerNode));
            List<LiveComposerTagNode> listLJJJJJL = LJJJJJL(liveEffect, liveComposerNode3.tagList);
            C20441214yg.LIZIZ("EffectMonitor#createTagListEnd", String.valueOf(liveComposerNode));
            if (LiveBeautyFilterRestoreOpt.INSTANCE.enable() && !Intrinsics.LJFF(liveComposerNode3.path, liveEffect.getFilePath())) {
                liveComposerNode3.path = liveEffect.getFilePath();
            }
            liveComposerNode3.tagList.clear();
            liveComposerNode3.tagList.addAll(listLJJJJJL);
            liveComposerNode3.updateTime = liveComposerNode.updateTime;
            liveComposerNode3.use = liveComposerNode.use;
            liveComposerNode3.LIZIZ(liveEffect);
            if (!z2) {
                this.LJIILJJIL.add(liveComposerNode3);
            }
            C770170UJb.LIZJ("LiveComposerManagerOPT");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update node: ");
            sbLIZ.append(liveComposerNode3);
            C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            liveComposerNode = liveComposerNode3;
        } else {
            liveComposerNode.path = liveEffect.getFilePath();
            Boolean boolLJIIZILJ = liveEffect.LJIIZILJ();
            if (boolLJIIZILJ != null) {
                zBooleanValue = boolLJIIZILJ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            liveComposerNode.isWithoutFace = zBooleanValue;
            liveComposerNode.effectPanelKey = liveEffect.LJLL();
            liveComposerNode.LIZ(liveEffect.LJJJJJ());
            C20441214yg.LIZIZ("EffectMonitor#createTagList", String.valueOf(liveComposerNode));
            List<LiveComposerTagNode> listLJJJJJL2 = LJJJJJL(liveEffect, liveComposerNode.tagList);
            C20441214yg.LIZIZ("EffectMonitor#createTagListEnd", String.valueOf(liveComposerNode));
            liveComposerNode.LIZIZ(liveEffect);
            liveComposerNode.tagList.clear();
            liveComposerNode.tagList.addAll(listLJJJJJL2);
            this.LJIILJJIL.add(liveComposerNode);
            C770170UJb.LIZJ("LiveComposerManagerOPT");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("create node: ");
            sbLIZ2.append(liveComposerNode);
            C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (z) {
            LJJJLZIJ(liveEffect, str, true, false);
        }
        Iterator it3 = ((CopyOnWriteArrayList) this.LJIIL).iterator();
        while (it3.hasNext()) {
            ((C0U86) it3.next()).LIZ(liveEffect, str, true);
        }
        C0UC4 c0uc42 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.ADD_EFFECT);
        return liveComposerNode;
    }

    public final LiveComposerNode LJJJJI(String str, LiveEffect liveEffect, boolean z, boolean z2, Long l) {
        boolean zBooleanValue;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        LiveComposerNode liveComposerNode = null;
        if (this.LIZJ == null) {
            return null;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.ADD_EFFECT);
        C766720U5u.LIZ.getClass();
        C766720U5u.LJIJ(liveEffect);
        if (z2) {
            LJJIJLIJ(liveEffect, str);
        }
        LJJLI(liveEffect, str);
        Iterator<LiveComposerNode> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LiveComposerNode next = it2.next();
            if (Intrinsics.LJFF(next.resourceId, liveEffect.getResourceId())) {
                liveComposerNode = next;
                break;
            }
        }
        LiveComposerNode liveComposerNode2 = liveComposerNode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current: ");
        sbLIZ.append(liveComposerNode2);
        C20441214yg.LIZIZ("EffectMonitor#addCurrentSticker", C2188811AlT.LIZIZ(sbLIZ));
        if (liveComposerNode2 != null) {
            if (liveComposerNode2.use == z2 && l == null) {
                C0UC4 c0uc42 = C0UC4.LIZ;
                C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.ADD_EFFECT);
                return liveComposerNode2;
            }
            this.LJIILJJIL.remove(liveComposerNode2);
            List<LiveComposerTagNode> listLJJJJJL = LJJJJJL(liveEffect, liveComposerNode2.tagList);
            if (LiveBeautyFilterRestoreOpt.INSTANCE.enable() && !Intrinsics.LJFF(liveComposerNode2.path, liveEffect.getFilePath())) {
                liveComposerNode2.path = liveEffect.getFilePath();
            }
            liveComposerNode2.tagList.clear();
            liveComposerNode2.tagList.addAll(listLJJJJJL);
            if (l != null) {
                jCurrentTimeMillis2 = l.longValue();
            } else {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            liveComposerNode2.updateTime = jCurrentTimeMillis2;
            liveComposerNode2.LIZIZ(liveEffect);
            liveComposerNode2.use = z2;
            LJJJJJ(liveComposerNode2);
            C770170UJb.LIZJ("LiveComposerManagerOPT");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("update node: ");
            sbLIZ2.append(liveComposerNode2);
            C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            String resourceId = liveEffect.getResourceId();
            String filePath = liveEffect.getFilePath();
            Boolean boolLJIIZILJ = liveEffect.LJIIZILJ();
            if (boolLJIIZILJ != null) {
                zBooleanValue = boolLJIIZILJ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            liveComposerNode2 = new LiveComposerNode(str, resourceId, filePath, zBooleanValue, jCurrentTimeMillis);
            liveComposerNode2.effectPanelKey = liveEffect.LJLL();
            liveComposerNode2.use = z2;
            liveComposerNode2.LIZ(liveEffect.LJJJJJ());
            List<LiveComposerTagNode> listLJJJJJL2 = LJJJJJL(liveEffect, liveComposerNode2.tagList);
            liveComposerNode2.LIZIZ(liveEffect);
            liveComposerNode2.tagList.clear();
            liveComposerNode2.tagList.addAll(listLJJJJJL2);
            liveComposerNode2.LIZIZ = liveEffect.Wp();
            LJJJJJ(liveComposerNode2);
            C770170UJb.LIZJ("LiveComposerManagerOPT");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("create node: ");
            sbLIZ3.append(liveComposerNode2);
            C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        if (z) {
            LJJJLZIJ(liveEffect, str, true, false);
        }
        Iterator it3 = ((CopyOnWriteArrayList) this.LJIIL).iterator();
        while (it3.hasNext()) {
            ((C0U86) it3.next()).LIZ(liveEffect, str, true);
        }
        C0UC4 c0uc43 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.ADD_EFFECT);
        return liveComposerNode2;
    }

    public final void LJJJLL(String str, LiveComposerNode liveComposerNode, LiveEffect liveEffect, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        List<LiveComposerTagNode> list;
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.RESTORE_EFFECT);
        for (LiveComposerTagNode liveComposerTagNode : liveComposerNode.tagList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Origin: ");
            sbLIZ.append(liveComposerTagNode.LIZ);
            sbLIZ.append(':');
            sbLIZ.append(liveComposerTagNode.value);
            C20441214yg.LIZIZ("EffectMonitor#taglist", C2188811AlT.LIZIZ(sbLIZ));
            liveEffect.LLIZLLLIL(liveComposerTagNode.LIZ);
        }
        if (C13LP.LJJJLL(liveComposerNode.tagList) != null) {
            if (z && liveComposerNode.use) {
                z4 = true;
            } else {
                z4 = false;
            }
            LiveComposerNode liveComposerNodeLJJJJ = LJJJJ(str, liveComposerNode, liveEffect, z4, z2);
            if (liveComposerNodeLJJJJ != null && (list = liveComposerNodeLJJJJ.tagList) != null) {
                for (LiveComposerTagNode liveComposerTagNode2 : list) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Origin: ");
                    sbLIZ2.append(liveComposerTagNode2.LIZ);
                    sbLIZ2.append(':');
                    sbLIZ2.append(liveComposerTagNode2.value);
                    C20441214yg.LIZIZ("EffectMonitor#taglist2", C2188811AlT.LIZIZ(sbLIZ2));
                    float f = liveComposerTagNode2.value;
                    Long lValueOf = Long.valueOf(liveComposerNode.updateTime);
                    if (this.LIZJ != null) {
                        C0UC4 c0uc42 = C0UC4.LIZ;
                        C0UC4.LJIJ(liveEffect, str, C0UCA.UPDATE_TAG);
                        for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
                            int iLIZJ = C0UG7.LIZJ(composerConfig, f);
                            if (composerConfig.LIZ != iLIZJ || lValueOf != null) {
                                composerConfig.LIZ = iLIZJ;
                            }
                        }
                        if (!LiveBeautyDownloadOptSetting.INSTANCE.inExperiment()) {
                            Iterator it2 = ((ArrayList) this.LJIILIIL).iterator();
                            while (it2.hasNext()) {
                                ((C0UG2) it2.next()).LIZIZ();
                            }
                        }
                        C0UC4 c0uc43 = C0UC4.LIZ;
                        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.UPDATE_TAG);
                    }
                }
            }
            if (z) {
                LJJJLZIJ(null, "", true, false);
            }
        } else {
            if (z && liveComposerNode.use) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJJJJ(str, liveComposerNode, liveEffect, z3, z2);
        }
        C0UC4 c0uc44 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.RESTORE_EFFECT);
    }
}
