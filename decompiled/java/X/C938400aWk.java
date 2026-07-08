package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AudioStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.tool.NetworkStateTipsHelperManager;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938400aWk implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final LifecycleOwner LL;
    public final DataChannel LLILLJJLI;
    public final Function0<List<InterfaceC938040aWA>> LLILLL;
    public final C304201Fw LLILZ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
    public final String LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C938400aWk.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final void LIZ() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        Function0<List<InterfaceC938040aWA>> function0;
        List<InterfaceC938040aWA> listInvoke;
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        Map<String, Integer> map;
        if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip()) {
            if (C931790aM5.LIZIZ()) {
                MultiGuestDataHolder multiGuestDataHolderLIZJ2 = LIZJ();
                Set<String> setKeySet = (multiGuestDataHolderLIZJ2 == null || (map = multiGuestDataHolderLIZJ2.LJJIJIL) == null) ? null : ((ConcurrentHashMap) map).keySet();
                MultiGuestDataHolder multiGuestDataHolderLIZJ3 = LIZJ();
                if (multiGuestDataHolderLIZJ3 != null) {
                    C20441214yg.LIZIZ("NetworkStateTips", "clearNetworkUserStateMap");
                    ((ConcurrentHashMap) multiGuestDataHolderLIZJ3.LJJIJIL).clear();
                }
                if (setKeySet != null) {
                    for (String str : setKeySet) {
                        DataChannel dataChannel = this.LLILLJJLI;
                        if (dataChannel != null) {
                            dataChannel.LC0(NetworkStateTipsHelperManager.NetworkStateInfoEvent.class, new C938340aWe(str, null));
                        }
                    }
                }
            } else {
                MultiGuestDataHolder multiGuestDataHolderLIZJ4 = LIZJ();
                if (multiGuestDataHolderLIZJ4 != null) {
                    C20441214yg.LIZIZ("NetworkStateTips", "clearNetworkUserStateMap");
                    ((ConcurrentHashMap) multiGuestDataHolderLIZJ4.LJJIJIL).clear();
                }
            }
            NetworkStateTipsHelperManager networkStateTipsHelperManager = (NetworkStateTipsHelperManager) this.LLILZLL.getValue();
            Iterator<Map.Entry<String, C918150a05>> it2 = networkStateTipsHelperManager.LIZ.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().LIZ("clearAll");
            }
            networkStateTipsHelperManager.LIZ.clear();
            if (!C931790aM5.LIZIZ() && (function0 = this.LLILLL) != null && (listInvoke = function0.invoke()) != null) {
                for (InterfaceC938040aWA interfaceC938040aWA : listInvoke) {
                    if ((interfaceC938040aWA instanceof C939710aYr) && (multiGuestDataHolderLIZJ = LIZJ()) != null) {
                        C939710aYr c939710aYr = (C939710aYr) interfaceC938040aWA;
                        c939710aYr.LJIIIZ(Integer.valueOf(multiGuestDataHolderLIZJ.LJIIIZ(c939710aYr.getInteractId())).intValue());
                    }
                }
            }
        }
        if (C931790aM5.LIZIZ() && MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null) {
            interfaceC954180awCLLJLL.LLIFFJFJJ((C921800a5y) this.LLIZ.getValue());
        }
    }

    public final MultiGuestDataHolder LIZJ() {
        C304201Fw c304201Fw = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (MultiGuestDataHolder) c304201Fw.LIZ();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.getLifecycle();
    }

    public final void LIZIZ() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        MultiGuestDataHolder multiGuestDataHolderLIZJ = LIZJ();
        if (multiGuestDataHolderLIZJ != null) {
            ((ConcurrentHashMap) multiGuestDataHolderLIZJ.LJJIJIIJIL).clear();
            ((ConcurrentHashMap) multiGuestDataHolderLIZJ.LJJIJL).clear();
            ((ConcurrentHashMap) multiGuestDataHolderLIZJ.LJJIZ).clear();
            ((ConcurrentHashMap) multiGuestDataHolderLIZJ.LJJIJ).clear();
        }
        if (!C931790aM5.LIZIZ() && MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null) {
            interfaceC954180awCLLJLL.LLIFFJFJJ((C921800a5y) this.LLIZ.getValue());
        }
        LIZ();
    }

    public final void LIZLLL(LinkStatusViewModel linkStatusViewModel) {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add Observer on userState[");
        sbLIZ.append(linkStatusViewModel);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        linkStatusViewModel.cx0(new C2217381BqS() { // from class: X.0aWo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C490701vd) obj).LLILLL;
            }
        }, null, new C938420aWm(this));
        if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null) {
            interfaceC954180awCLLJLL.LJJZZIII((C921800a5y) this.LLIZ.getValue());
        }
    }

    public final void LJ(List<UserState> list) {
        List<InterfaceC938040aWA> listInvoke;
        if (!C931790aM5.LIZIZ()) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (UserState userState : list) {
                Pair pair = new Pair(userState.linkMicId, Integer.valueOf(userState.audioMuted));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            Function0<List<InterfaceC938040aWA>> function0 = this.LLILLL;
            if (function0 != null && (listInvoke = function0.invoke()) != null) {
                for (InterfaceC938040aWA interfaceC938040aWA : listInvoke) {
                    String strLJIIIIZZ = interfaceC938040aWA.LJIIIIZZ();
                    Integer num = (Integer) linkedHashMap.get(strLJIIIIZZ);
                    if (strLJIIIIZZ != null && num != null) {
                        LJIIJJI(strLJIIIIZZ, num.intValue(), new AwS416S0200000_15(interfaceC938040aWA, num, 54));
                    }
                }
            }
        }
    }

    public final void LJI(List<UserState> list) {
        Function0<List<InterfaceC938040aWA>> function0;
        List<InterfaceC938040aWA> listInvoke;
        long jLongValue;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (UserState userState : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append("_update avatar linkMicId = ");
            sbLIZ.append(userState.linkMicId);
            sbLIZ.append(" avatarId = ");
            sbLIZ.append(userState.avatarId);
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Object> map = C1338270kvh.LIZ;
            Pair pair = new Pair(userState.linkMicId, Long.valueOf(userState.avatarId));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (true ^ Intrinsics.LJFF(entry.getKey(), strLJIIJ)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap2.entrySet().iterator();
        while (true) {
            long jLongValue2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it2.next();
            Long l = (Long) linkedHashMap.get(entry2.getKey());
            if (l != null) {
                jLongValue2 = l.longValue();
            }
            MultiGuestDataHolder multiGuestDataHolderLIZJ = LIZJ();
            if (multiGuestDataHolderLIZJ != null) {
                multiGuestDataHolderLIZJ.LJIJJ(jLongValue2, (String) entry2.getKey());
            }
            if (C931790aM5.LIZIZ() && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null) {
                interfaceC954180awCLLJLL.LJJLIIIJJIZ(jLongValue2, (String) entry2.getKey());
            }
        }
        if (!C931790aM5.LIZIZ() && (function0 = this.LLILLL) != null && (listInvoke = function0.invoke()) != null) {
            ArrayList<InterfaceC938040aWA> arrayList = new ArrayList();
            for (InterfaceC938040aWA interfaceC938040aWA : listInvoke) {
                InterfaceC938040aWA interfaceC938040aWA2 = interfaceC938040aWA;
                if (!Intrinsics.LJFF(interfaceC938040aWA2.LJIIIIZZ(), strLJIIJ) && (interfaceC938040aWA2 instanceof InterfaceC491601vm)) {
                    arrayList.add(interfaceC938040aWA);
                }
            }
            for (InterfaceC938040aWA interfaceC938040aWA3 : arrayList) {
                Long l2 = (Long) linkedHashMap.get(interfaceC938040aWA3.LJIIIIZZ());
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null) {
                    String strLJIIIIZZ = interfaceC938040aWA3.LJIIIIZZ();
                    if (strLJIIIIZZ == null) {
                        strLJIIIIZZ = "";
                    }
                    interfaceC954180awCLLJLL2.LJJLIIIJJIZ(jLongValue, strLJIIIIZZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onAvatarStateChanged: linkmic=");
                sbLIZ2.append(interfaceC938040aWA3.LJIIIIZZ());
                sbLIZ2.append(" avatar=");
                sbLIZ2.append(jLongValue);
                C2188811AlT.LIZIZ(sbLIZ2);
                Map<String, Object> map2 = C1338270kvh.LIZ;
            }
        }
    }

    public final void LJII(List<UserState> list) {
        List<InterfaceC938040aWA> listInvoke;
        List<LinkUser> listLIZLLL;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (UserState userState : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append("_update map linkMicId = ");
            sbLIZ.append(userState.linkMicId);
            sbLIZ.append(" state = ");
            sbLIZ.append(userState.networkState);
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Object> map = C1338270kvh.LIZ;
            Pair pair = new Pair(userState.linkMicId, userState);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        if (C931790aM5.LIZIZ()) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                Iterator<LinkUser> it2 = listLIZLLL.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().linkMicId;
                    UserState userState2 = (UserState) linkedHashMap.get(str);
                    if (userState2 != null && str != null) {
                        int i = userState2.networkState;
                        ((NetworkStateTipsHelperManager) this.LLILZLL.getValue()).LIZ(i, userState2.linkMicId);
                        MultiGuestDataHolder multiGuestDataHolderLIZJ = LIZJ();
                        if (multiGuestDataHolderLIZJ != null) {
                            ((ConcurrentHashMap) multiGuestDataHolderLIZJ.LJJIJIL).put(str, Integer.valueOf(i));
                        }
                        DataChannel dataChannel = this.LLILLJJLI;
                        if (dataChannel != null) {
                            dataChannel.LC0(NetworkStateTipsHelperManager.NetworkStateInfoEvent.class, new C938340aWe(str, Integer.valueOf(i)));
                        }
                    }
                }
                return;
            }
            return;
        }
        Function0<List<InterfaceC938040aWA>> function0 = this.LLILLL;
        if (function0 != null && (listInvoke = function0.invoke()) != null) {
            ArrayList<InterfaceC938040aWA> arrayList = new ArrayList();
            for (InterfaceC938040aWA interfaceC938040aWA : listInvoke) {
                if (interfaceC938040aWA instanceof InterfaceC491601vm) {
                    arrayList.add(interfaceC938040aWA);
                }
            }
            for (InterfaceC938040aWA interfaceC938040aWA2 : arrayList) {
                String strLJIIIIZZ = interfaceC938040aWA2.LJIIIIZZ();
                UserState userState3 = (UserState) linkedHashMap.get(strLJIIIIZZ);
                if (userState3 != null) {
                    int i2 = userState3.networkState;
                    ((NetworkStateTipsHelperManager) this.LLILZLL.getValue()).LIZ(i2, userState3.linkMicId);
                    ((InterfaceC491601vm) interfaceC938040aWA2).LJIIIZ(i2);
                    MultiGuestDataHolder multiGuestDataHolderLIZJ2 = LIZJ();
                    if (multiGuestDataHolderLIZJ2 != null && strLJIIIIZZ != null) {
                        ((ConcurrentHashMap) multiGuestDataHolderLIZJ2.LJJIJIL).put(strLJIIIIZZ, Integer.valueOf(i2));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LLILZIL);
                    sbLIZ2.append("_update linkMicId = ");
                    sbLIZ2.append(strLJIIIIZZ);
                    sbLIZ2.append(" state = ");
                    sbLIZ2.append(i2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("on linkUserNetworkStateChanged: ");
                sbLIZ3.append(interfaceC938040aWA2.LJIIIIZZ());
                C2188811AlT.LIZIZ(sbLIZ3);
                Map<String, Object> map3 = C1338270kvh.LIZ;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r15) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C938400aWk.LJIIIIZZ(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r13) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C938400aWk.LJIIIZ(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.util.List<com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState> r8) {
        /*
            r7 = this;
            boolean r0 = X.C931790aM5.LIZIZ()
            if (r0 != 0) goto La2
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r8, r0)
            int r1 = X.C2097908Jt.LIZIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L16
            r1 = 16
        L16:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Iterator r3 = r8.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r3.next()
            com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState r0 = (com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState) r0
            java.lang.String r2 = r0.linkMicId
            int r0 = r0.videoMuted
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            java.lang.Object r1 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r5.put(r1, r0)
            goto L1f
        L44:
            kotlin.jvm.functions.Function0<java.util.List<X.0aWA>> r0 = r7.LLILLL
            if (r0 == 0) goto La2
            java.lang.Object r0 = r0.invoke()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto La2
            java.util.Iterator r6 = r0.iterator()
        L54:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r4 = r6.next()
            X.0aWA r4 = (X.InterfaceC938040aWA) r4
            java.lang.String r2 = r4.LJIIIIZZ()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[VideoState] call mask「"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "」 video state Changed"
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
            if (r2 == 0) goto L54
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L54
            boolean r3 = r4 instanceof X.InterfaceC938470aWr
            java.lang.Object r0 = r5.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = 1
            if (r0 == 0) goto L9d
            int r1 = r0.intValue()
            r0 = r3 ^ 1
            if (r1 == 0) goto L9b
            if (r1 == r2) goto La0
        L97:
            r4.bc(r2)
            goto L54
        L9b:
            r2 = r0
            goto L97
        L9d:
            if (r3 != 0) goto La0
            goto L97
        La0:
            r2 = 0
            goto L97
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C938400aWk.LJIIJ(java.util.List):void");
    }

    public C938400aWk(LifecycleOwner lifecycleOwner, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = awS559S0100000_15;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestV3StateProxy_");
        sbLIZ.append(hashCode());
        this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(178));
        this.LLIZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 560));
    }

    public final void LJIIJJI(String str, int i, Function0 function0) {
        if (!C936430aTZ.LIZ() && i == 0) {
            return;
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ = LIZJ();
        if (multiGuestDataHolderLIZJ != null && i == multiGuestDataHolderLIZJ.LIZJ(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("linkmicid:");
        sbLIZ.append(str);
        sbLIZ.append(", audioState:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("AudioState", C2188811AlT.LIZIZ(sbLIZ));
        MultiGuestDataHolder multiGuestDataHolderLIZJ2 = LIZJ();
        if (multiGuestDataHolderLIZJ2 != null) {
            multiGuestDataHolderLIZJ2.LJIJI(i, str);
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.LC0(AudioStateChangeEvent.class, new C927380aEy(i, str));
        }
        function0.invoke();
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
