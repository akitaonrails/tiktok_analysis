package X;

import Y.ARunnableS17S1100000_12;
import Y.ARunnableS17S1200000_12;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.android.live.effect.model.composer.LiveComposerTagNode;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectAudioGraphSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS97S1200000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UG4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UG4 extends C0UG6 {
    public static final C01GW<C0U78> LJIJJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS199S0000000_12.get$arr$(243));
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public final List<C0U86> LJIIL = new CopyOnWriteArrayList();
    public final List<C0UG2> LJIILIIL = new ArrayList();
    public final List<LiveComposerNode> LJIILJJIL = new ArrayList();
    public final List<LiveComposerNode> LJIILL = new ArrayList();
    public final ArrayList<LiveComposerNode> LJIILLIIL = new ArrayList<>();
    public boolean LJIIZILJ = true;
    public final C01GW LJIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(244));
    public final BPEAHandler LJIJI = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC769000UEo
    public final void Er() {
    }

    @Override // X.InterfaceC769000UEo
    public final void Hr() {
    }

    @Override // X.C0U78
    public final void LJJIJ() {
        LJJJJLL(null, "", true);
    }

    @Override // X.InterfaceC769000UEo
    public final void sr() {
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
        LJJJJJL("guest_linkmic", false);
    }

    @Override // X.C0U78
    public final void LJJIII() {
        C0UG8 c0ug8 = this.LIZJ;
        LJIJJLI(false);
    }

    public final void LJJJJJ() {
        String str;
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJFF;
        if (c20337914i1.LIZIZ().booleanValue()) {
            return;
        }
        List<LiveEffect> list = C760630Tsb.LIZ().LIZ;
        String str2 = C0UD4.LIZ;
        Integer numLIZIZ = InterfaceC766480U4w.LIZ.LIZIZ();
        if (numLIZIZ.intValue() >= 0) {
            ArrayList arrayList = (ArrayList) list;
            if (numLIZIZ.intValue() < arrayList.size()) {
                c20337914i1.LJFF(Boolean.TRUE);
                LiveEffect liveEffect = (LiveEffect) ListProtector.get(arrayList, numLIZIZ.intValue());
                if (!C760630Tsb.LIZ().LJI(liveEffect)) {
                    C760630Tsb.LIZ().LJ(liveEffect);
                }
                InterfaceC766480U4w.LIZLLL.LJFF(liveEffect.getResourceId());
                if (liveEffect.LJJIJIIJI()) {
                    return;
                }
                float fLJFF = C760630Tsb.LIZ().LJFF(liveEffect);
                LJJJJ("livefiltercomposerexperiment", liveEffect, false, true, InterfaceC766480U4w.LJIJJLI.LIZIZ());
                LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ == null || (str = composerConfigLJIIJ.tag) == null) {
                    str = "";
                }
                LJJJJZI("livefiltercomposerexperiment", liveEffect, str, fLJFF, null);
            }
        }
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
        List<LiveComposerNode> list = this.LJIILJJIL;
        ArrayList<LiveComposerNode> arrayList = new ArrayList();
        for (LiveComposerNode liveComposerNode : list) {
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
            if (!map2.containsKey(liveComposerNode3.resourceId)) {
                List list2 = (List) ((ConcurrentHashMap) this.LIZLLL).get(liveComposerNode3.panel);
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
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
                        map2.put(liveEffect.getResourceId(), liveEffect);
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
        LJJJJJL(str, true);
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

    @Override // X.InterfaceC769000UEo
    public final void Br(C0UG3 c0ug3) {
        ((ArrayList) this.LJIILIIL).remove(c0ug3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r0 = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) r8.LIZLLL).get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r3.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        r2 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(((com.bytedance.android.livesdkapi.depend.model.LiveEffect) r2).getResourceId(), r5.resourceId) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        r4 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        r3 = r4.LJJJZ().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r3.hasNext() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        r2 = r3.next();
        r0 = (com.bytedance.android.live.effect.model.composer.LiveComposerTagNode) X.C13LP.LJJJLL(r5.tagList);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r1 = r0.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        r2.LIZ = X.C0UG7.LIZJ(X.C0U7C.LJIIJ(r4), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        r6.add(r4);
     */
    @Override // X.InterfaceC769000UEo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> Cr(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG4.Cr(java.lang.String):java.util.List");
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
        List<LiveComposerNode> list2 = this.LJIILJJIL;
        ArrayList<LiveComposerNode> arrayList = new ArrayList();
        for (LiveComposerNode liveComposerNode : list2) {
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
                    map.put(liveEffect.getResourceId(), liveEffect);
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
        return LJJJJ("liveguestbeauty", liveEffect, true, true, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.C0U78
    public final void LJIJJLI(boolean z) {
        List arrayList;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && c0ug8.LJIIIIZZ) {
            ArrayList arrayList2 = new ArrayList();
            for (LiveComposerNode liveComposerNode : (ArrayList) this.LJIILJJIL) {
                if (!arrayList2.contains(liveComposerNode.panel)) {
                    arrayList2.add(liveComposerNode.panel);
                }
            }
            for (LiveComposerNode liveComposerNode2 : (ArrayList) this.LJFF) {
                if (!arrayList2.contains(liveComposerNode2.panel)) {
                    ((ArrayList) this.LJIILJJIL).add(liveComposerNode2);
                }
            }
            ((ArrayList) this.LJFF).clear();
            List<LiveComposerNode> list = this.LJFF;
            List<LiveComposerNode> list2 = this.LJIILJJIL;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : (ArrayList) list2) {
                LiveComposerNode liveComposerNode3 = (LiveComposerNode) obj;
                C0UG8 c0ug82 = this.LIZJ;
                if (c0ug82 == null || (arrayList = c0ug82.LIZIZ) == null) {
                    arrayList = new ArrayList();
                }
                if (arrayList.contains(liveComposerNode3.panel)) {
                    arrayList3.add(obj);
                }
            }
            ((ArrayList) list).addAll(arrayList3);
            try {
                ((C770850ULr) this.LJIJ.getValue()).LIZLLL(this.LJFF);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LiveComposerManagerB", e.getMessage(), e);
            }
            if (!z) {
                ((ArrayList) this.LJFF).clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    @Override // X.C0U78
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r6) {
        /*
            r5 = this;
            java.util.List<com.bytedance.android.live.effect.model.composer.LiveComposerNode> r0 = r5.LJIILJJIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L8:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L71
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.live.effect.model.composer.LiveComposerNode r0 = (com.bytedance.android.live.effect.model.composer.LiveComposerNode) r0
            java.lang.String r1 = r0.resourceId
            java.lang.String r0 = r6.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8
        L22:
            com.bytedance.android.live.effect.model.composer.LiveComposerNode r2 = (com.bytedance.android.live.effect.model.composer.LiveComposerNode) r2
            if (r2 == 0) goto L6f
            java.util.List<com.bytedance.android.live.effect.model.composer.LiveComposerTagNode> r0 = r2.tagList
            if (r0 == 0) goto L6f
            java.util.Iterator r3 = r0.iterator()
        L2e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.live.effect.model.composer.LiveComposerTagNode r0 = (com.bytedance.android.live.effect.model.composer.LiveComposerTagNode) r0
            java.lang.String r1 = r0.LIZ
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r0 = X.C0U7C.LJIIJ(r6)
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.tag
        L45:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2e
            r4 = r2
        L4c:
            com.bytedance.android.live.effect.model.composer.LiveComposerTagNode r4 = (com.bytedance.android.live.effect.model.composer.LiveComposerTagNode) r4
            if (r4 == 0) goto L6f
            float r3 = r4.value
        L52:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r0 = X.C0U7C.LJIIJ(r6)
            r2 = 0
            if (r0 == 0) goto L6b
            int r1 = r0.LIZIZ
        L5b:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$ComposerConfig r0 = X.C0U7C.LJIIJ(r6)
            float r0 = X.C0UG7.LIZLLL(r0, r1)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L68
            r2 = 1
        L68:
            r0 = r2 ^ 1
            return r0
        L6b:
            r1 = 0
            goto L5b
        L6d:
            r0 = r4
            goto L45
        L6f:
            r3 = 0
            goto L52
        L71:
            r2 = r4
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG4.LJJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect):boolean");
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

    @Override // X.InterfaceC769000UEo
    public final void lr(String str) {
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS17S1100000_12(this, str, 10));
            return;
        }
        List<LiveComposerNode> list = this.LJIILJJIL;
        ArrayList<LiveComposerNode> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (Intrinsics.LJFF(((LiveComposerNode) obj).panel, str)) {
                arrayList.add(obj);
            }
        }
        ArrayList<LiveEffect> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (LiveComposerNode liveComposerNode : arrayList) {
            List list2 = (List) ((ConcurrentHashMap) this.LIZLLL).get(liveComposerNode.panel);
            Object obj2 = null;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), liveComposerNode.resourceId)) {
                            obj2 = next;
                            break;
                        }
                    }
                }
            }
            arrayList2.add(obj2);
        }
        for (LiveEffect liveEffect : arrayList2) {
            if (liveEffect != null) {
                LJJJJL(liveEffect, str, true, true);
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
            ((C770850ULr) this.LJIJ.getValue()).LIZIZ(str, new AwS97S1200000_12(str, (String) this, (C0UG4) C15442062u.LJIIIZ(setLIZ, iterable), (Set<String>) 0));
        }
    }

    @Override // X.InterfaceC769000UEo
    public final List<LiveEffect> qr(String str) {
        List list;
        Object next;
        float f;
        HashMap map = new HashMap();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
            return C13LP.LLIIII(map.values());
        }
        List<LiveComposerNode> list2 = this.LJIILJJIL;
        ArrayList<LiveComposerNode> arrayList = new ArrayList();
        for (LiveComposerNode liveComposerNode : list2) {
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
                    map.put(liveEffect.getResourceId(), liveEffect);
                    for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
                        LiveComposerTagNode liveComposerTagNode = (LiveComposerTagNode) C13LP.LJJJLL(liveComposerNode3.tagList);
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
        ((ArrayList) this.LJIILL).clear();
        LJJJJLL(null, "", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r8.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
    
        r5.add(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList LJJJJIZL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r9, java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG4.LJJJJIZL(com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.util.List):java.util.ArrayList");
    }

    @Override // X.C0U78
    public final void LJIIIIZZ(LiveEffect liveEffect, String str) {
        C0UG9 c0ug9;
        if (this.LIZJ == null) {
            return;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.REPLACE_EFFECT);
        ArrayList arrayList = new ArrayList();
        List<LiveEffect> listQr = qr(str);
        ArrayList arrayList2 = new ArrayList();
        for (LiveEffect liveEffect2 : listQr) {
            if (true ^ TextUtils.isEmpty(liveEffect2.getFilePath())) {
                arrayList2.add(liveEffect2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((LiveEffect) it2.next()).getFilePath());
        }
        arrayList.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(liveEffect.getFilePath());
        ArrayList arrayList5 = new ArrayList();
        String extra = liveEffect.getExtra();
        if (extra == null) {
            extra = "";
        }
        arrayList5.add(extra);
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.LJIJJ((String[]) arrayList.toArray(new String[0]), (String[]) arrayList4.toArray(new String[0]), (String[]) arrayList5.toArray(new String[0]));
        }
        Iterator<LiveEffect> it3 = qr(str).iterator();
        while (it3.hasNext()) {
            LJJJJL(it3.next(), str, false, true);
        }
        LJJJJ(str, liveEffect, false, true, null);
        LJJJJLL(liveEffect, str, false);
        C0UC4 c0uc42 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.REPLACE_EFFECT);
    }

    @Override // X.C0U78
    public final void LJIIJ(LiveEffect liveEffect, String str) {
        LJJJJL(liveEffect, str, true, true);
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
        Object next;
        boolean z;
        Object next2;
        List<LiveComposerTagNode> list;
        LiveComposerTagNode next3;
        if (this.LIZJ == null) {
            return;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, "liveguestbeauty", C0UCA.SYNC_TAG);
        Iterator it2 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LiveComposerNode) next).resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next == null) {
            z = false;
            LJJJJ("liveguestbeauty", liveEffect, false, false, null);
        } else {
            z = true;
        }
        Iterator it3 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(((LiveComposerNode) next2).resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = (LiveComposerNode) next2;
        if (liveComposerNode != null) {
            for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
                composerConfig.LIZ = i;
                Iterator<LiveComposerTagNode> it4 = liveComposerNode.tagList.iterator();
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
                    liveComposerTagNode.value = C0UG7.LIZLLL(composerConfig, i);
                }
            }
            liveComposerNode.updateTime = System.currentTimeMillis();
        }
        if (z) {
            LJJJJLL(liveEffect, "liveguestbeauty", true);
        }
        for (C0UG2 c0ug2 : (ArrayList) this.LJIILIIL) {
            if (liveComposerNode != null && (list = liveComposerNode.tagList) != null) {
                for (LiveComposerTagNode liveComposerTagNode2 : list) {
                    c0ug2.LIZIZ();
                }
            }
        }
        C0UC4 c0uc42 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.SYNC_TAG);
    }

    @Override // X.C0U78
    public final Float LJIJ(String str, String str2) {
        Object next;
        LiveComposerTagNode next2;
        Iterator it2 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LiveComposerNode) next).resourceId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = (LiveComposerNode) next;
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
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null) {
            List arrayList = c0ug8.LIZIZ;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (arrayList.contains(str) && !((ArrayList) this.LJFF).isEmpty()) {
                ArrayList<LiveEffect> arrayList2 = new ArrayList();
                for (LiveComposerNode liveComposerNode : (ArrayList) this.LJFF) {
                    Iterator<? extends LiveEffect> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            LiveEffect next = it2.next();
                            if (Intrinsics.LJFF(liveComposerNode.resourceId, next.getResourceId())) {
                                if (next != null) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                    }
                }
                for (LiveEffect liveEffect : arrayList2) {
                    C768430UCj c768430UCj = C768430UCj.LIZ;
                    C768430UCj.LJ(liveEffect, 0L, false, str);
                    C0UC4 c0uc4 = C0UC4.LIZ;
                    C0UC4.LJJII(liveEffect, str, false);
                    LJJJJLI(liveEffect, str);
                }
                List<LiveComposerNode> list2 = this.LJFF;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : (ArrayList) list2) {
                    if (Intrinsics.LJFF(((LiveComposerNode) obj).panel, str)) {
                        arrayList3.add(obj);
                    }
                }
                ((ArrayList) this.LJFF).removeAll(arrayList3);
            }
        }
    }

    public final void LJJJJJL(String str, boolean z) {
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
                C20441214yg.LJI("LiveComposerManagerB", th);
            }
        }
        if (this.LJIIZILJ) {
            C0UG8 c0ug84 = this.LIZJ;
            LJIJJLI(z);
        }
        ((ArrayList) this.LJIILJJIL).clear();
        ((ConcurrentHashMap) this.LIZLLL).clear();
        ((CopyOnWriteArrayList) this.LJIIL).clear();
        ((ArrayList) this.LJIILIIL).clear();
        ((ArrayList) this.LJIILL).clear();
        this.LJIILLIIL.clear();
        this.LIZJ = null;
    }

    public final void LJJJJLI(LiveEffect liveEffect, String str) {
        Object next;
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.RESTORE_EFFECT);
        if (C0U7C.LJIILJJIL(liveEffect)) {
            List<LiveEffect> listLL = liveEffect.LL();
            if (listLL != null) {
                Iterator<LiveEffect> it2 = listLL.iterator();
                while (it2.hasNext()) {
                    LJJJJLI(it2.next(), str);
                }
            }
        } else {
            Iterator it3 = ((ArrayList) this.LJFF).iterator();
            do {
                next = null;
                if (!it3.hasNext()) {
                    break;
                } else {
                    next = it3.next();
                }
            } while (!Intrinsics.LJFF(((LiveComposerNode) next).resourceId, liveEffect.getResourceId()));
            LiveComposerNode liveComposerNode = (LiveComposerNode) next;
            if (liveComposerNode != null) {
                Iterator<LiveComposerTagNode> it4 = liveComposerNode.tagList.iterator();
                while (it4.hasNext()) {
                    liveEffect.LLIZLLLIL(it4.next().LIZ);
                }
                Iterator<LiveComposerTagNode> it5 = liveComposerNode.tagList.iterator();
                if (it5.hasNext() && it5.next() != null) {
                    LJJJJ(str, liveEffect, false, liveComposerNode.use, Long.valueOf(liveComposerNode.updateTime));
                    List<LiveComposerTagNode> list = liveComposerNode.tagList;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (LiveComposerTagNode liveComposerTagNode : list) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(liveComposerTagNode.LIZ);
                        sbLIZ.append(':');
                        sbLIZ.append(liveComposerTagNode.value);
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(liveEffect.LJJJJZI());
                    sbLIZ2.append(": ");
                    sbLIZ2.append(strLJJLIIIJ);
                    C20441214yg.LIZIZ("EffectMonitor#restoreTags", C2188811AlT.LIZIZ(sbLIZ2));
                    List<LiveComposerTagNode> list2 = liveComposerNode.tagList;
                    ArrayList<LiveComposerTagNode> arrayList2 = new ArrayList();
                    Iterator<LiveComposerTagNode> it6 = list2.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(it6.next());
                    }
                    for (LiveComposerTagNode liveComposerTagNode2 : arrayList2) {
                        LJJJJZI(str, liveEffect, liveComposerTagNode2.LIZ, liveComposerTagNode2.value, Long.valueOf(liveComposerNode.updateTime));
                    }
                } else {
                    boolean z = liveComposerNode.use;
                    LJJJJ(str, liveEffect, z, z, Long.valueOf(liveComposerNode.updateTime));
                }
            }
        }
        C0UC4 c0uc42 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.RESTORE_EFFECT);
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
        if (!Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C1701940uOG.LIZIZ().LIZIZ(new ARunnableS17S1200000_12(this, liveEffect, str, 8));
        } else {
            LJJJJ(str, liveEffect, true, true, Long.valueOf(System.currentTimeMillis()));
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

    @Override // X.InterfaceC769000UEo
    public final void Gr(String str, LiveEffect liveEffect, LiveEffect liveEffect2) {
        LiveComposerNode liveComposerNodeLJJJJL;
        boolean zBooleanValue;
        boolean zContains;
        C0UG9 c0ug9;
        C0UG9 c0ug92;
        C0UG9 c0ug93;
        C0UG9 c0ug94;
        LiveEffect.AudioGraphBean audioGraphBean;
        ArrayList<String> sources;
        LiveEffect.AudioGraphBean audioGraphBean2;
        ArrayList<String> sources2;
        LiveEffect.AudioGraphBean audioGraphBean3;
        Boolean useOutput;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ");
        sbLIZ.append(this);
        C20441214yg.LIZIZ("EffectMonitor#ComposerReplace0", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZJ == null) {
            return;
        }
        C20441214yg.LIZIZ("EffectMonitor#ComposerReplace2", "");
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UCA c0uca = C0UCA.REPLACE_EFFECT;
        C0UC4.LJIJ(liveEffect2, str, c0uca);
        boolean zContains2 = false;
        if (liveEffect == null) {
            liveComposerNodeLJJJJL = null;
        } else {
            liveComposerNodeLJJJJL = LJJJJL(liveEffect, str, false, !Intrinsics.LJFF(liveEffect.LIZJ, liveEffect2.LIZJ));
        }
        LiveComposerNode liveComposerNodeLJJJJ = LJJJJ(str, liveEffect2, false, true, null);
        LJJJJLL(liveEffect2, str, false);
        if (liveComposerNodeLJJJJ == null) {
            C0UC4.LJIIZILJ(liveEffect2.getEffectId(), c0uca);
            return;
        }
        String[] strArrLJII = C0UG7.LJII(liveComposerNodeLJJJJ, false);
        String[] strArrLJ = C0UG7.LJ(this.LIZLLL, strArrLJII, false);
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect2.LJLJLLL();
        if (stickerSDKExtraLJLJLLL != null && (audioGraphBean3 = stickerSDKExtraLJLJLLL.audioGraph) != null && (useOutput = audioGraphBean3.getUseOutput()) != null) {
            zBooleanValue = useOutput.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL2 = liveEffect2.LJLJLLL();
        if (stickerSDKExtraLJLJLLL2 != null && (audioGraphBean2 = stickerSDKExtraLJLJLLL2.audioGraph) != null && (sources2 = audioGraphBean2.getSources()) != null) {
            zContains = sources2.contains("mic");
        } else {
            zContains = false;
        }
        LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL3 = liveEffect2.LJLJLLL();
        if (stickerSDKExtraLJLJLLL3 != null && (audioGraphBean = stickerSDKExtraLJLJLLL3.audioGraph) != null && (sources = audioGraphBean.getSources()) != null) {
            zContains2 = sources.contains("music");
        }
        LJJIJL(Collections.singletonList(liveComposerNodeLJJJJ));
        if (liveComposerNodeLJJJJL != null) {
            String[] strArrLJII2 = C0UG7.LJII(liveComposerNodeLJJJJL, true);
            if (LiveEffectAudioGraphSetting.INSTANCE.enable()) {
                C0UG8 c0ug8 = this.LIZJ;
                if (c0ug8 != null && (c0ug94 = c0ug8.LIZJ) != null) {
                    C0UGD c0ugd = this.LJ;
                    c0ug94.LJIILLIIL(strArrLJII2, strArrLJII, strArrLJ, c0ugd.LIZ, c0ugd.LIZIZ, c0ugd.LIZJ);
                }
            } else {
                C0UG8 c0ug82 = this.LIZJ;
                if (c0ug82 != null && (c0ug93 = c0ug82.LIZJ) != null) {
                    c0ug93.LJIILLIIL(strArrLJII2, strArrLJII, strArrLJ, zContains, zContains2, zBooleanValue);
                }
            }
        } else if (LiveEffectAudioGraphSetting.INSTANCE.enable()) {
            C0UG8 c0ug83 = this.LIZJ;
            if (c0ug83 != null && (c0ug92 = c0ug83.LIZJ) != null) {
                C0UGD c0ugd2 = this.LJ;
                c0ug92.LJIIIIZZ(strArrLJII, strArrLJ, c0ugd2.LIZ, c0ugd2.LIZIZ, c0ugd2.LIZJ);
            }
        } else {
            C0UG8 c0ug84 = this.LIZJ;
            if (c0ug84 != null && (c0ug9 = c0ug84.LIZJ) != null) {
                c0ug9.LJIIIIZZ(strArrLJII, strArrLJ, zContains, zContains2, zBooleanValue);
            }
        }
        C0UC4.LJIIZILJ(liveEffect2.getEffectId(), c0uca);
    }

    @Override // X.C0U78
    public final void LJII(List<? extends LiveEffect> list, List<String> list2, List<Float> list3) {
        Object next;
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
                        Iterator it3 = ((ArrayList) this.LJIILJJIL).iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (Intrinsics.LJFF(((LiveComposerNode) next).resourceId, liveEffect.getResourceId())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        LiveComposerNode liveComposerNode = (LiveComposerNode) next;
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
        Object next;
        Object next2;
        List<LiveComposerTagNode> list;
        LiveComposerTagNode next3;
        if (this.LIZJ == null) {
            return;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.UPDATE_TAG);
        Iterator it2 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LiveComposerNode) next).resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = (LiveComposerNode) next;
        if (liveComposerNode == null) {
            LJJJJ(str, liveEffect, false, true, null);
        } else {
            liveComposerNode.use = true;
        }
        Iterator it3 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(((LiveComposerNode) next2).resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode2 = (LiveComposerNode) next2;
        if (liveComposerNode2 != null) {
            for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
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
                    float fLIZLLL = C0UG7.LIZLLL(composerConfig, i);
                    if (liveComposerTagNode.value != fLIZLLL) {
                        liveComposerTagNode.value = fLIZLLL;
                    }
                }
            }
            liveComposerNode2.updateTime = System.currentTimeMillis();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0U5S(liveEffect, i, null), 3);
        }
        LJJJJLL(liveEffect, str, true);
        for (C0UG2 c0ug2 : (ArrayList) this.LJIILIIL) {
            if (liveComposerNode2 != null && (list = liveComposerNode2.tagList) != null) {
                for (LiveComposerTagNode liveComposerTagNode2 : list) {
                    c0ug2.LIZIZ();
                }
            }
        }
        C0UC4 c0uc42 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.UPDATE_TAG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d5, code lost:
    
        r3.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020e, code lost:
    
        r2.add(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJJJJLL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r15, java.lang.String r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG4.LJJJJLL(com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, boolean):void");
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
        LiveComposerNode liveComposerNodeLJJJJ = LJJJJ(str, liveEffect, false, true, null);
        if (liveComposerNodeLJJJJ == null) {
            return;
        }
        Iterator<LiveComposerTagNode> it2 = liveComposerNodeLJJJJ.tagList.iterator();
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
        }
        LJJJJLL(liveEffect, str, false);
        String[] strArrLJII = C0UG7.LJII(liveComposerNodeLJJJJ, false);
        String[] strArrLJ = C0UG7.LJ(this.LIZLLL, strArrLJII, false);
        LJJIJL(Collections.singletonList(liveComposerNodeLJJJJ));
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.LJIILIIL(strArrLJII, strArrLJ);
        }
    }

    public final LiveComposerNode LJJJJL(LiveEffect liveEffect, String str, boolean z, boolean z2) {
        Object next;
        boolean z3;
        List arrayList;
        String strOk;
        C0UG9 c0ug9;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Removing effect: ");
        sbLIZ.append(liveEffect);
        C20441214yg.LIZIZ("LiveCOmposerManagerB", C2188811AlT.LIZIZ(sbLIZ));
        String str2 = null;
        if (this.LIZJ == null) {
            return null;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.REMOVE_EFFECT);
        Iterator it2 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LiveComposerNode) next).resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = (LiveComposerNode) next;
        if (liveComposerNode == null) {
            C0UC4 c0uc42 = C0UC4.LIZ;
            C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.REMOVE_EFFECT);
            return null;
        }
        ((ArrayList) this.LJIILJJIL).remove(liveComposerNode);
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
            ((ArrayList) this.LJIILJJIL).add(liveComposerNode);
        }
        if (z) {
            LJJJJLL(liveEffect, str, true);
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

    @Override // X.InterfaceC769000UEo
    public final void sendEffectMsg(int i, int i2, int i3, String str) {
        C0UG9 c0ug9;
        C0UG8 c0ug8 = this.LIZJ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            c0ug9.sendEffectMsg(i, i2, i3, str);
        }
    }

    public final LiveComposerNode LJJJJ(String str, LiveEffect liveEffect, boolean z, boolean z2, Long l) {
        boolean zBooleanValue;
        long jCurrentTimeMillis;
        boolean zBooleanValue2;
        boolean zContains;
        LiveEffect.AudioGraphBean audioGraphBean;
        ArrayList<String> sources;
        LiveEffect.AudioGraphBean audioGraphBean2;
        ArrayList<String> sources2;
        LiveEffect.AudioGraphBean audioGraphBean3;
        Boolean useOutput;
        long jCurrentTimeMillis2;
        boolean zContains2;
        List<String> list;
        C0UG8 c0ug8;
        List<C0UG1> list2;
        Object obj = null;
        if (this.LIZJ == null) {
            return null;
        }
        if (z2) {
            LJJIJLIJ(liveEffect, str);
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.ADD_EFFECT);
        C766720U5u.LIZ.getClass();
        C766720U5u.LJIJ(liveEffect);
        boolean zContains3 = false;
        if (this.LIZJ != null) {
            if (liveEffect.LJJJJJ().isEmpty() && (c0ug8 = this.LIZJ) != null && (list2 = c0ug8.LIZ) != null) {
                ArrayList arrayList = new ArrayList();
                for (C0UG1 c0ug1 : list2) {
                    if (Intrinsics.LJFF(c0ug1.LIZIZ, str)) {
                        arrayList.add(c0ug1);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    liveEffect.LJJJJJ().addAll(((C0UG1) it2.next()).LIZ);
                }
            }
            if (liveEffect.LJIIZILJ() == null) {
                C0UG8 c0ug82 = this.LIZJ;
                if (c0ug82 != null && (list = c0ug82.LIZLLL) != null) {
                    zContains2 = list.contains(str);
                } else {
                    zContains2 = false;
                }
                liveEffect.LLII(zContains2);
            }
            if (!((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
                ((ConcurrentHashMap) this.LIZLLL).put(str, new ArrayList());
            }
            List list3 = (List) ((ConcurrentHashMap) this.LIZLLL).get(str);
            if (list3 != null) {
                list3.remove(liveEffect);
                list3.add(liveEffect);
            }
        }
        Iterator it3 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (Intrinsics.LJFF(((LiveComposerNode) next).resourceId, liveEffect.getResourceId())) {
                obj = next;
                break;
            }
        }
        LiveComposerNode liveComposerNode = (LiveComposerNode) obj;
        if (liveComposerNode != null) {
            if (liveComposerNode.use == z2 && l == null) {
                C0UC4 c0uc42 = C0UC4.LIZ;
                C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.ADD_EFFECT);
                return liveComposerNode;
            }
            ((ArrayList) this.LJIILJJIL).remove(liveComposerNode);
            ArrayList arrayListLJJJJIZL = LJJJJIZL(liveEffect, liveComposerNode.tagList);
            liveComposerNode.tagList.clear();
            liveComposerNode.tagList.addAll(arrayListLJJJJIZL);
            if (l != null) {
                jCurrentTimeMillis2 = l.longValue();
            } else {
                jCurrentTimeMillis2 = System.currentTimeMillis();
            }
            liveComposerNode.updateTime = jCurrentTimeMillis2;
            liveComposerNode.use = z2;
            liveComposerNode.LIZIZ(liveEffect);
            ((ArrayList) this.LJIILJJIL).add(liveComposerNode);
            C770170UJb.LIZJ("LiveComposerManagerB");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update node: ");
            sbLIZ.append(liveComposerNode);
            C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
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
            liveComposerNode = new LiveComposerNode(str, resourceId, filePath, zBooleanValue, jCurrentTimeMillis);
            liveComposerNode.effectPanelKey = liveEffect.LJLL();
            liveComposerNode.use = z2;
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = liveEffect.LJLJLLL();
            if (stickerSDKExtraLJLJLLL != null && (audioGraphBean3 = stickerSDKExtraLJLJLLL.audioGraph) != null && (useOutput = audioGraphBean3.getUseOutput()) != null) {
                zBooleanValue2 = useOutput.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            liveComposerNode.useOutput = zBooleanValue2;
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL2 = liveEffect.LJLJLLL();
            if (stickerSDKExtraLJLJLLL2 != null && (audioGraphBean2 = stickerSDKExtraLJLJLLL2.audioGraph) != null && (sources2 = audioGraphBean2.getSources()) != null) {
                zContains = sources2.contains("mic");
            } else {
                zContains = false;
            }
            liveComposerNode.inMic = zContains;
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL3 = liveEffect.LJLJLLL();
            if (stickerSDKExtraLJLJLLL3 != null && (audioGraphBean = stickerSDKExtraLJLJLLL3.audioGraph) != null && (sources = audioGraphBean.getSources()) != null) {
                zContains3 = sources.contains("music");
            }
            liveComposerNode.inMusic = zContains3;
            liveComposerNode.LIZIZ(liveEffect);
            liveComposerNode.LIZ(liveEffect.LJJJJJ());
            ArrayList arrayListLJJJJIZL2 = LJJJJIZL(liveEffect, liveComposerNode.tagList);
            liveComposerNode.tagList.clear();
            liveComposerNode.tagList.addAll(arrayListLJJJJIZL2);
            ((ArrayList) this.LJIILJJIL).add(liveComposerNode);
            C770170UJb.LIZJ("LiveComposerManagerB");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("create node: ");
            sbLIZ2.append(liveComposerNode);
            C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (z) {
            LJJJJLL(liveEffect, str, true);
        }
        Iterator it4 = ((CopyOnWriteArrayList) this.LJIIL).iterator();
        while (it4.hasNext()) {
            ((C0U86) it4.next()).LIZ(liveEffect, str, true);
        }
        C0UC4 c0uc43 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.ADD_EFFECT);
        return liveComposerNode;
    }

    public final void LJJJJZI(String str, LiveEffect liveEffect, String str2, float f, Long l) {
        Object next;
        Object next2;
        long jCurrentTimeMillis;
        if (this.LIZJ == null) {
            return;
        }
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJIJ(liveEffect, str, C0UCA.UPDATE_TAG);
        Iterator it2 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LiveComposerNode) next).resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode = (LiveComposerNode) next;
        if (liveComposerNode == null) {
            LJJJJ(str, liveEffect, false, true, null);
        } else {
            liveComposerNode.use = true;
        }
        Iterator it3 = ((ArrayList) this.LJIILJJIL).iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (Intrinsics.LJFF(((LiveComposerNode) next2).resourceId, liveEffect.getResourceId())) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        LiveComposerNode liveComposerNode2 = (LiveComposerNode) next2;
        if (liveComposerNode2 != null) {
            for (LiveComposerTagNode liveComposerTagNode : liveComposerNode2.tagList) {
                if (liveComposerTagNode.value != f || l != null) {
                    liveComposerTagNode.value = f;
                }
            }
            for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
                int iLIZJ = C0UG7.LIZJ(composerConfig, f);
                if (composerConfig.LIZ != iLIZJ || l != null) {
                    composerConfig.LIZ = iLIZJ;
                }
            }
            if (l != null) {
                jCurrentTimeMillis = l.longValue();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            liveComposerNode2.updateTime = jCurrentTimeMillis;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0U5S(liveEffect, C0UG7.LIZJ(C0U7C.LJIIJ(liveEffect), f), null), 3);
        LJJJJLL(liveEffect, str, true);
        Iterator it4 = ((ArrayList) this.LJIILIIL).iterator();
        while (it4.hasNext()) {
            ((C0UG2) it4.next()).LIZIZ();
        }
        C0UC4 c0uc42 = C0UC4.LIZ;
        C0UC4.LJIIZILJ(liveEffect.getEffectId(), C0UCA.UPDATE_TAG);
    }
}
