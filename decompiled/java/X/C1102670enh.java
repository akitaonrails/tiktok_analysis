package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0enh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102670enh implements InterfaceC1088880eRS {
    public static final C1102670enh LIZ = new C1102670enh();
    public static final HashMap<DataChannel, ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu>> LIZIZ = new HashMap<>(8);
    public static final HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> LIZJ = new HashMap<>(3);
    public static final Map<DataChannel, C1102630end> LIZLLL = new LinkedHashMap();

    @Override // X.InterfaceC1088880eRS
    public final void LJII(DataChannel dataChannel, EnumC1088870eRR enumC1088870eRR, ViewGroup viewGroup) {
    }

    @Override // X.InterfaceC1088880eRS
    public final void releaseAll() {
        Iterator<T> it2 = LIZJ.values().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((Map) it2.next()).values().iterator();
            while (it3.hasNext()) {
                ((C1102730enn) it3.next()).LJI();
            }
        }
        LIZIZ.clear();
        LIZJ.clear();
        ((LinkedHashMap) LIZLLL).clear();
    }

    @Override // X.InterfaceC1088880eRS
    public final boolean LIZIZ(EnumC1102750enp enumC1102750enp) {
        return false;
    }

    @Override // X.InterfaceC1088880eRS
    public final void Ok(DataChannel dataChannel) {
        Collection<C1102730enn> collectionValues;
        if (dataChannel != null) {
            Map<EnumC1088870eRR, C1102730enn> map = LIZJ.get(dataChannel);
            if (map != null && (collectionValues = map.values()) != null) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    ((C1102730enn) it2.next()).LJI();
                }
            }
            LIZJ.remove(dataChannel);
            LIZIZ.remove(dataChannel);
            LIZLLL.remove(dataChannel);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LIZLLL(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        Map<EnumC1088870eRR, C1102730enn> map;
        Collection<C1102730enn> collectionValues;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> map2 = LIZJ;
            if (map2.get(dataChannel) != null && (map = map2.get(dataChannel)) != null && (collectionValues = map.values()) != null) {
                for (C1102730enn c1102730enn : collectionValues) {
                    ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = c1102730enn.LJ;
                    if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                        interfaceViewOnClickListenerC1102800enu.dK(c1102730enn.LIZ);
                    }
                    ((EnumMap) c1102730enn.LJIIIIZZ).put(enumC1102750enp, Boolean.FALSE);
                }
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final InterfaceViewOnClickListenerC1102800enu LJ(DataChannel dataChannel, String str) {
        InterfaceViewOnClickListenerC1102800enu c098200Yq;
        Object obj = null;
        try {
            ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = LIZIZ.get(dataChannel);
            if (concurrentHashMap != null) {
                c098200Yq = concurrentHashMap.get(EnumC1102750enp.valueOf(str));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (InterfaceViewOnClickListenerC1102800enu) obj;
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJI(DataChannel dataChannel, EnumC951410arj enumC951410arj) {
        C1102630end c1102630end = (C1102630end) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c1102630end != null) {
            c1102630end.LJIIIIZZ = enumC951410arj;
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIIIZ(EnumC1102640ene enumC1102640ene, DataChannel dataChannel) {
        C1102630end c1102630end = (C1102630end) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c1102630end != null) {
            c1102630end.LJIIIIZZ(enumC1102640ene);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIIJ(EnumC1102640ene enumC1102640ene, DataChannel dataChannel) {
        C1102630end c1102630end = (C1102630end) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c1102630end != null) {
            c1102630end.LIZ(enumC1102640ene);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final boolean LJIIL(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        Map<EnumC1088870eRR, C1102730enn> map;
        Collection<C1102730enn> collectionValues;
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> map2 = LIZJ;
            if (map2.get(dataChannel) != null && (map = map2.get(dataChannel)) != null && (collectionValues = map.values()) != null) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) ((EnumMap) ((C1102730enn) it2.next()).LJI).get(enumC1102750enp);
                    if (interfaceC1103130eoR != null && interfaceC1103130eoR.getVisibility() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1088880eRS
    public final View LJIILIIL(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        View viewLJIIZILJ = LJIIZILJ(dataChannel, enumC1102750enp);
        if (viewLJIIZILJ != null) {
            return viewLJIIZILJ.findViewById(R.id.y7r);
        }
        return null;
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIILL(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        Map<EnumC1088870eRR, C1102730enn> map;
        Collection<C1102730enn> collectionValues;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> map2 = LIZJ;
            if (map2.get(dataChannel) != null && (map = map2.get(dataChannel)) != null && (collectionValues = map.values()) != null) {
                for (C1102730enn c1102730enn : collectionValues) {
                    ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = c1102730enn.LJ;
                    if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                        interfaceViewOnClickListenerC1102800enu.mx(c1102730enn.LIZ);
                    }
                    ((EnumMap) c1102730enn.LJIIIIZZ).put(enumC1102750enp, Boolean.TRUE);
                }
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIILLIIL(EnumC1088870eRR enumC1088870eRR, DataChannel dataChannel) {
        C1102730enn c1102730enn;
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> map = LIZJ;
            Map<EnumC1088870eRR, C1102730enn> map2 = map.get(dataChannel);
            if (map2 != null && (c1102730enn = map2.get(enumC1088870eRR)) != null) {
                c1102730enn.LJI();
            }
            Map<EnumC1088870eRR, C1102730enn> map3 = map.get(dataChannel);
            if (map3 != null) {
                map3.remove(enumC1088870eRR);
            }
            LIZLLL.remove(dataChannel);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final View LJIIZILJ(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        Collection<C1102730enn> collectionValues;
        Map<EnumC1088870eRR, C1102730enn> map = LIZJ.get(dataChannel);
        if (map != null && (collectionValues = map.values()) != null) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) ((EnumMap) ((C1102730enn) it2.next()).LJI).get(enumC1102750enp);
                if (interfaceC1103130eoR != null) {
                    return interfaceC1103130eoR.LJ();
                }
            }
        }
        Iterator<T> it3 = LIZJ.values().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((Map) it3.next()).values().iterator();
            while (it4.hasNext()) {
                InterfaceC1103130eoR interfaceC1103130eoR2 = (InterfaceC1103130eoR) ((EnumMap) ((C1102730enn) it4.next()).LJI).get(enumC1102750enp);
                if (interfaceC1103130eoR2 != null) {
                    return interfaceC1103130eoR2.LJ();
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1088880eRS
    public final boolean LJIJ(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        C1102630end c1102630end = (C1102630end) ((LinkedHashMap) LIZLLL).get(dataChannel);
        if (c1102630end != null) {
            if (C13LP.LJJJJ(c1102630end.LJIIJ.get(enumC1102750enp), c1102630end.LIZJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1088880eRS
    public final boolean LJIJI(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        Map<EnumC1088870eRR, C1102730enn> map;
        Collection<C1102730enn> collectionValues;
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> map2 = LIZJ;
            if (map2.get(dataChannel) != null && (map = map2.get(dataChannel)) != null && (collectionValues = map.values()) != null) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (((C1102730enn) it2.next()).LIZLLL(enumC1102750enp)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIJJ(DataChannel dataChannel, EnumC1102750enp enumC1102750enp) {
        EnumC1102640ene enumC1102640ene;
        Collection<C1102730enn> collectionValues;
        ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap;
        if (dataChannel != null) {
            Map<EnumC1088870eRR, C1102730enn> map = LIZJ.get(dataChannel);
            if (map != null && (collectionValues = map.values()) != null) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    ((C1102730enn) it2.next()).LJIIJ(enumC1102750enp);
                    HashMap<DataChannel, ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu>> map2 = LIZIZ;
                    if (map2 != null && (concurrentHashMap = map2.get(dataChannel)) != null) {
                        concurrentHashMap.remove(enumC1102750enp);
                    }
                }
            }
            LIZ.getClass();
            C1102630end c1102630end = (C1102630end) ((LinkedHashMap) LIZLLL).get(dataChannel);
            if (c1102630end != null && (enumC1102640ene = c1102630end.LJIIJ.get(enumC1102750enp)) != null) {
                c1102630end.LJIIIIZZ(enumC1102640ene);
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LIZ(DataChannel dataChannel, EnumC1102750enp enumC1102750enp, EnumC1088870eRR enumC1088870eRR) {
        Map<EnumC1088870eRR, C1102730enn> map;
        C1102730enn c1102730enn;
        if (dataChannel != null && (map = LIZJ.get(dataChannel)) != null && (c1102730enn = map.get(enumC1088870eRR)) != null) {
            ((ArrayList) c1102730enn.LJFF).remove(enumC1102750enp);
            c1102730enn.LJIIJ(enumC1102750enp);
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LIZJ(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, boolean z) {
        Collection<C1102730enn> collectionValues;
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> map = LIZJ;
            if (map.get(dataChannel) != null) {
                Map<EnumC1088870eRR, C1102730enn> map2 = map.get(dataChannel);
                if (map2 != null && (collectionValues = map2.values()) != null) {
                    Iterator<T> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        ((C1102730enn) it2.next()).LJIIIIZZ(enumC1102750enp, z);
                    }
                    return;
                }
                return;
            }
        }
        enumC1102750enp.isRedDotVisible = z;
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJFF(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, boolean z) {
        Map<EnumC1088870eRR, C1102730enn> map;
        Collection<C1102730enn> collectionValues;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        EnumC1102640ene enumC1102640ene;
        enumC1102750enp.isButtonVisible = true;
        if (dataChannel != null && (map = LIZJ.get(dataChannel)) != null && (collectionValues = map.values()) != null) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (((C1102730enn) it2.next()).LJIIIZ(enumC1102750enp)) {
                    if (!z) {
                        LIZ.getClass();
                        C1102630end c1102630end = (C1102630end) ((LinkedHashMap) LIZLLL).get(dataChannel);
                        if (c1102630end != null && (enumC1102640ene = c1102630end.LJIIJ.get(enumC1102750enp)) != null) {
                            c1102630end.LIZ(enumC1102640ene);
                        }
                    }
                    ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = LIZIZ.get(dataChannel);
                    if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                        interfaceViewOnClickListenerC1102800enu.onShow();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIIIIZZ(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, boolean z) {
        Map<EnumC1088870eRR, C1102730enn> map;
        Collection<C1102730enn> collectionValues;
        enumC1102750enp.isEnableClick = z;
        if (dataChannel != null) {
            HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> map2 = LIZJ;
            if (map2.get(dataChannel) != null && (map = map2.get(dataChannel)) != null && (collectionValues = map.values()) != null) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    ((C1102730enn) it2.next()).LJII(enumC1102750enp, z);
                }
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIJJLI(DataChannel dataChannel, EnumC1102750enp enumC1102750enp, EnumC1088870eRR enumC1088870eRR) {
        Map<EnumC1088870eRR, C1102730enn> map;
        C1102730enn c1102730enn;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        if (dataChannel != null && (map = LIZJ.get(dataChannel)) != null && (c1102730enn = map.get(enumC1088870eRR)) != null) {
            Iterator it2 = ((ArrayList) c1102730enn.LJFF).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (c1102730enn.LIZJ.indexOf(it2.next()) > c1102730enn.LIZJ.indexOf(enumC1102750enp)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            ListProtector.add(c1102730enn.LJFF, i, enumC1102750enp);
            ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = c1102730enn.LJ;
            if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                c1102730enn.LJ(enumC1102750enp, interfaceViewOnClickListenerC1102800enu);
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIL(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, boolean z) {
        EnumC1102640ene enumC1102640ene;
        InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu;
        Collection<C1102730enn> collectionValues;
        enumC1102750enp.isButtonVisible = false;
        if (dataChannel != null) {
            Map<EnumC1088870eRR, C1102730enn> map = LIZJ.get(dataChannel);
            if (map != null && (collectionValues = map.values()) != null) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    ((C1102730enn) it2.next()).LIZIZ(enumC1102750enp);
                }
            }
            ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = LIZIZ.get(dataChannel);
            if (concurrentHashMap != null && (interfaceViewOnClickListenerC1102800enu = concurrentHashMap.get(enumC1102750enp)) != null) {
                interfaceViewOnClickListenerC1102800enu.onHide();
            }
            if (!z) {
                LIZ.getClass();
                C1102630end c1102630end = (C1102630end) ((LinkedHashMap) LIZLLL).get(dataChannel);
                if (c1102630end != null && (enumC1102640ene = c1102630end.LJIIJ.get(enumC1102750enp)) != null) {
                    c1102630end.LJIIIIZZ(enumC1102640ene);
                }
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIIJJI(EnumC1102750enp enumC1102750enp, DataChannel dataChannel, InterfaceViewOnClickListenerC1102800enu interfaceViewOnClickListenerC1102800enu, boolean z) {
        EnumC1102640ene enumC1102640ene;
        Collection<C1102730enn> collectionValues;
        if (dataChannel != null) {
            if (C500260Jjc.LJJJI((Boolean) dataChannel.gg0(C0TZM.class)) && Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.FALSE)) {
                Map<DataChannel, C1102630end> map = LIZLLL;
                if (!map.containsKey(dataChannel)) {
                    map.put(dataChannel, new C1102630end(dataChannel));
                }
            }
            enumC1102750enp.isButtonVisible = z;
            Map<EnumC1088870eRR, C1102730enn> map2 = LIZJ.get(dataChannel);
            if (map2 != null && (collectionValues = map2.values()) != null) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    ((C1102730enn) it2.next()).LJ(enumC1102750enp, interfaceViewOnClickListenerC1102800enu);
                }
            }
            HashMap<DataChannel, ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu>> map3 = LIZIZ;
            if (map3.get(dataChannel) == null) {
                map3.put(dataChannel, new ConcurrentHashMap<>(8));
            }
            if (z) {
                LIZ.getClass();
                C1102630end c1102630end = (C1102630end) ((LinkedHashMap) LIZLLL).get(dataChannel);
                if (c1102630end != null && (enumC1102640ene = c1102630end.LJIIJ.get(enumC1102750enp)) != null) {
                    c1102630end.LIZ(enumC1102640ene);
                }
            }
            ConcurrentHashMap<EnumC1102750enp, InterfaceViewOnClickListenerC1102800enu> concurrentHashMap = map3.get(dataChannel);
            if (concurrentHashMap != null) {
                concurrentHashMap.put(enumC1102750enp, interfaceViewOnClickListenerC1102800enu);
            }
        }
    }

    @Override // X.InterfaceC1088880eRS
    public final void LJIILJJIL(DataChannel dataChannel, View view, List<? extends EnumC1102750enp> list, EnumC1088900eRU enumC1088900eRU, EnumC1088870eRR enumC1088870eRR) {
        C1102730enn c1102730enn = new C1102730enn(dataChannel, (ViewGroup) view, list, enumC1088900eRU, LIZIZ.get(dataChannel));
        HashMap<DataChannel, Map<EnumC1088870eRR, C1102730enn>> map = LIZJ;
        if (map.get(dataChannel) == null) {
            map.put(dataChannel, new HashMap(3));
        }
        Map<EnumC1088870eRR, C1102730enn> map2 = map.get(dataChannel);
        if (map2 != null) {
            map2.put(enumC1088870eRR, c1102730enn);
        }
        c1102730enn.LIZJ();
    }
}
