package com.bytedance.android.live.liveinteract.platform.statemanager;

import X.C0QSJ;
import X.C1338270kvh;
import X.C1555540qa8;
import X.C1770850wBP;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C489901vV;
import X.C490701vd;
import X.C500260Jjc;
import X.C673150Qan;
import X.C687700QyG;
import X.C920900a4W;
import X.C931790aM5;
import X.C938890aXX;
import X.C938900aXY;
import X.C938910aXZ;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC938930aXb;
import X.InterfaceC938950aXd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.DebugStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS29S0001000_15;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.AwS99S1200000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkStatusViewModel extends AssemViewModel<C490701vd> implements ILinkStateAbility, DebugStateAbility, InterfaceC938950aXd, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public ISessionAbility LL;
    public InterfaceC938930aXb LLILLJJLI;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{LinkMicScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LinkMicScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 293667815) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C490701vd(0L, C489901vV.LIZ(), (List) null, (String) null, (String) null, 61);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final C490701vd Cn2() {
        return getState();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final UserState L8(String str) {
        UserState next;
        Iterator<UserState> it2 = getState().LLILLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.linkMicId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void NV0(int i) {
        RtcUserInfo rtcUserInfoG0;
        String str;
        if (!MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getSyncNetworkState()) {
            Map<String, Object> map = C1338270kvh.LIZ;
            return;
        }
        ISessionAbility iSessionAbility = this.LL;
        if (iSessionAbility != null && (rtcUserInfoG0 = iSessionAbility.G0()) != null && (str = rtcUserInfoG0.linkMicId) != null) {
            C490701vd state = getState();
            UserState userStateL8 = L8(str);
            if (userStateL8 != null && C920900a4W.LIZ(userStateL8.networkState) != C920900a4W.LIZ(i)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("changeNetworkState newNetworkState ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                Map<String, Object> map2 = C1338270kvh.LIZ;
                vQ2(new AwS29S0001000_15(i, 6));
                InterfaceC938930aXb interfaceC938930aXb = this.LLILLJJLI;
                if (interfaceC938930aXb != null) {
                    interfaceC938930aXb.dV(6, null, Integer.valueOf(i), state);
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("changeNetworkState userState = ");
            sbLIZ2.append(userStateL8);
            sbLIZ2.append(' ');
            sbLIZ2.append(i);
            C2188811AlT.LIZIZ(sbLIZ2);
            Map<String, Object> map3 = C1338270kvh.LIZ;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void WQ1(int i) {
        C490701vd state = getState();
        vQ2(new AwS29S0001000_15(i, 8));
        InterfaceC938930aXb interfaceC938930aXb = this.LLILLJJLI;
        if (interfaceC938930aXb != null) {
            interfaceC938930aXb.dV(4, null, Integer.valueOf(i), state);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void Ww(int i) {
        boolean zLJI = MethodIDManager.LJI(71865);
        C490701vd state = getState();
        vQ2(new AwS29S0001000_15(i, 5));
        InterfaceC938930aXb interfaceC938930aXb = this.LLILLJJLI;
        if (interfaceC938930aXb != null) {
            interfaceC938930aXb.dV(3, null, Integer.valueOf(i), state);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        C1555540qa8.LJI(interfaceC665370Q7z, ILinkStateAbility.class);
        InterfaceC938930aXb interfaceC938930aXb = this.LLILLJJLI;
        if (interfaceC938930aXb != null) {
            interfaceC938930aXb.eB1(interfaceC665370Q7z);
        }
        onCleared();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on StateAbility[");
        sbLIZ.append(this);
        sbLIZ.append("] destroy..");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        Boolean boolValueOf;
        InterfaceC938930aXb c938900aXY;
        ISharedBgAbility iSharedBgAbility;
        ISessionAbility iSessionAbility = (ISessionAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISessionAbility.class, null);
        this.LL = iSessionAbility;
        if (iSessionAbility != null) {
            boolValueOf = Boolean.valueOf(iSessionAbility.FD());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            c938900aXY = new C938910aXZ(this, this.LL);
        } else {
            c938900aXY = new C938900aXY(this, this.LL);
        }
        this.LLILLJJLI = c938900aXY;
        C1555540qa8.LIZ(interfaceC665370Q7z, this, ILinkStateAbility.class, null);
        Map<String, Object> map = C1338270kvh.LIZ;
        InterfaceC938930aXb interfaceC938930aXb = this.LLILLJJLI;
        if (interfaceC938930aXb != null) {
            interfaceC938930aXb.iT0(interfaceC665370Q7z);
        }
        if (!C931790aM5.LIZIZ() && (iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null)) != null) {
            MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModelGo2 = iSharedBgAbility.Go2();
            if (multiGuestSharedBgGuestViewModelGo2 != null) {
                multiGuestSharedBgGuestViewModelGo2.vQ2(this);
            }
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0();
            if (multiGuestSharedBgAnchorViewModelGL0 != null) {
                multiGuestSharedBgAnchorViewModelGL0.vQ2(this);
            }
        }
        setStateImmediate(AFwS250S0000000_15.get$arr$(96));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on StateAbility[");
        sbLIZ.append(this);
        sbLIZ.append("] created..");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void vQ2(Function1<? super UserState, UserState> function1) {
        RtcUserInfo rtcUserInfoG0;
        String str;
        ISessionAbility iSessionAbility = this.LL;
        if (iSessionAbility != null && (rtcUserInfoG0 = iSessionAbility.G0()) != null && (str = rtcUserInfoG0.linkMicId) != null) {
            setStateImmediate(new AwS99S1200000_15(str, (String) function1, (Function1<? super UserState, UserState>) this, (LinkStatusViewModel) 3));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void vc0(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeAvatarState avatarID ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        vQ2(new AwS30S0000100_15(j, 6));
        InterfaceC938930aXb interfaceC938930aXb = this.LLILLJJLI;
        if (interfaceC938930aXb != null) {
            interfaceC938930aXb.dV(9, null, Long.valueOf(j), getState());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void Ny(int i, Function1<? super Boolean, Unit> function1) {
        C490701vd state = getState();
        vQ2(new AwS29S0001000_15(i, 7));
        InterfaceC938930aXb interfaceC938930aXb = this.LLILLJJLI;
        if (interfaceC938930aXb != null) {
            interfaceC938930aXb.dV(2, function1, Integer.valueOf(i), state);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void Px1(String str, Function1<? super UserState, Unit> function1) {
        List<UserState> list;
        C490701vd c490701vd = (C490701vd) this.vmDispatcher.getState();
        if (c490701vd != null && (list = c490701vd.LLILLL) != null) {
            for (UserState userState : list) {
                if (Intrinsics.LJFF(userState.linkMicId, str)) {
                    if (userState != null) {
                        function1.invoke(userState);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void Il(int i, String str, boolean z) {
        InterfaceC938930aXb interfaceC938930aXb = this.LLILLJJLI;
        if (interfaceC938930aXb != null) {
            interfaceC938930aXb.Il(i, str, z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void cx0(C2217381BqS c2217381BqS, C1770850wBP c1770850wBP, Function1 function1) {
        C1770850wBP c1770850wBP2 = c1770850wBP;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select state Subscribe [");
        sbLIZ.append(c2217381BqS);
        sbLIZ.append("] ");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        if (c1770850wBP2 == null) {
            c1770850wBP2 = new C1770850wBP();
            c1770850wBP2.LIZ(true);
        }
        AssemViewModel.selectSubscribe$default(this, c2217381BqS, c1770850wBP2, null, null, function1, 12, null);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility
    public final void mK2(int i, boolean z, boolean z2) {
        vQ2(new C938890aXX(i, z, z2));
    }
}
