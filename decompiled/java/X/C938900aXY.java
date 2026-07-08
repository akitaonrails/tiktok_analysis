package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS249S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.controller.ChangeStateReq;

/* JADX INFO: renamed from: X.0aXY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938900aXY implements InterfaceC938930aXb, InterfaceC490201vY {
    public final LinkStatusViewModel LL;
    public final ISessionAbility LLILLJJLI;
    public final C09YA LLILLL;
    public final C490301vZ LLILZ = new C490301vZ(this);
    public final C922830a7d LLILZIL = new C922830a7d(this);
    public final AtomicLong LLILZLL = new AtomicLong(0);

    @Override // X.InterfaceC490201vY
    public final RtcUserInfo G0() {
        ISessionAbility iSessionAbility = this.LLILLJJLI;
        if (iSessionAbility != null) {
            return iSessionAbility.G0();
        }
        return null;
    }

    @Override // X.InterfaceC490201vY
    public final void LIZLLL() {
        this.LL.setStateImmediate(AFwS250S0000000_15.get$arr$(109));
    }

    @Override // X.InterfaceC490201vY
    public final InterfaceC149500hh LJ() {
        return (InterfaceC149500hh) this.LLILLL.getValue().getOperator();
    }

    @Override // X.InterfaceC490201vY
    public final C490701vd getState() {
        return this.LL.getState();
    }

    @Override // X.InterfaceC490201vY
    public final ISessionAbility LIZJ() {
        return this.LLILLJJLI;
    }

    public final UserState LJII(C490701vd c490701vd) {
        Object obj;
        Iterator<UserState> it2 = c490701vd.LLILLL.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            UserState next = it2.next();
            String str = next.linkMicId;
            RtcUserInfo rtcUserInfoG0 = G0();
            if (rtcUserInfoG0 != null) {
                obj = rtcUserInfoG0.linkMicId;
            }
            if (Intrinsics.LJFF(str, obj)) {
                obj = next;
                break;
            }
        }
        return (UserState) obj;
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILZ.eB1(interfaceC665370Q7z);
        this.LLILZIL.eB1(interfaceC665370Q7z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on StateAbility[");
        sbLIZ.append(this);
        sbLIZ.append("] destroy..");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILZ.iT0(interfaceC665370Q7z);
        this.LLILZIL.iT0(interfaceC665370Q7z);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C938900aXY(LinkStatusViewModel linkStatusViewModel, ISessionAbility iSessionAbility) {
        this.LL = linkStatusViewModel;
        this.LLILLJJLI = iSessionAbility;
        this.LLILLL = new C09YA(linkStatusViewModel, new AwS559S0100000_15(this, 569));
    }

    @Override // X.InterfaceC490201vY
    public final void LIZ(int i, boolean z) {
        this.LL.setStateImmediate(new AwS249S0000000_15(i, z, 0));
    }

    @Override // X.InterfaceC490201vY
    public final void LIZIZ(int i, Object obj) {
        String str;
        if (i != 0) {
            if (i == 2 && (obj instanceof ChangeStateReq) && !LinkMicStateSetting.INSTANCE.syncWithRTC()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[onStateChange] by UserOption <");
                ChangeStateReq changeStateReq = (ChangeStateReq) obj;
                int i2 = changeStateReq.stateType;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 6) {
                                    if (i2 != 9) {
                                        str = "unknown";
                                    } else {
                                        str = "avatar_id";
                                    }
                                } else {
                                    str = "network";
                                }
                            } else {
                                str = "video";
                            }
                        } else {
                            str = "audio";
                        }
                    } else {
                        str = "online";
                    }
                } else {
                    str = "layout";
                }
                sbLIZ.append(str);
                sbLIZ.append(">, send RTC message to RoomUsers");
                C2188811AlT.LIZIZ(sbLIZ);
                Map<String, Object> map = C1338270kvh.LIZ;
                this.LLILZIL.LJ(changeStateReq);
                return;
            }
            return;
        }
        if (!(obj instanceof UserState) || !LinkMicStateSetting.INSTANCE.stateDoubleCheck()) {
            return;
        }
        this.LL.withState(new AwS381S0200000_15(this, obj, 70));
    }

    @Override // X.InterfaceC490201vY
    public final void LJFF(int i, Function1<? super C490701vd, C490701vd> function1) {
        if (i == 0 || i == 1 || i == 3) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        this.LL.setState(function1);
    }

    public final void LJI(UserState userState, UserState userState2) {
        if (userState2 == null || Intrinsics.LJFF(userState, userState2)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onState different with server: ");
        sbLIZ.append(userState);
        sbLIZ.append(" \n ");
        sbLIZ.append(userState2);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        long jLIZ = C158B.LIZ();
        if (jLIZ - this.LLILZLL.get() > Math.max(LinkMicStateSetting.INSTANCE.checkDuration() * LSPassThroughRecordSizeConfig.DEFAULT, C538540LAe.LLJJJIL)) {
            int i = userState.audioMuted;
            if (i != userState2.audioMuted && i != 0) {
                this.LLILZLL.set(jLIZ);
                this.LL.Ww(userState.audioMuted);
            } else {
                int i2 = userState.videoMuted;
                if (i2 != userState2.videoMuted && i2 != 0) {
                    this.LLILZLL.set(jLIZ);
                    this.LL.WQ1(userState.videoMuted);
                }
            }
        }
        if (userState.avatarId != userState2.avatarId) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onState newAvatarId=");
            sbLIZ2.append(userState2.avatarId);
            C2188811AlT.LIZIZ(sbLIZ2);
            this.LL.vc0(userState2.avatarId);
        }
    }

    @Override // X.InterfaceC938930aXb
    public final void Il(int i, String str, boolean z) {
        String str2;
        if (LinkMicStateSetting.INSTANCE.rtcDoubleCheck()) {
            RtcUserInfo rtcUserInfoG0 = G0();
            if (rtcUserInfoG0 != null) {
                str2 = rtcUserInfoG0.linkMicId;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str, str2)) {
                this.LL.withState(new C938920aXa(this, i, z));
            }
        }
    }

    @Override // X.InterfaceC938930aXb
    public final void dV(int i, Function1<? super Boolean, Unit> function1, Object obj, C490701vd c490701vd) {
        String str;
        String str2;
        ChangeStateReq changeStateReq = new ChangeStateReq();
        changeStateReq.stateType = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i == 9) {
                                    changeStateReq.avatarId = ((Long) obj).longValue();
                                }
                            } else {
                                changeStateReq.backgroundStickerId = obj.toString();
                            }
                        } else {
                            changeStateReq.networkState = ((Integer) obj).intValue();
                        }
                    } else {
                        changeStateReq.videoMuted = ((Integer) obj).intValue();
                    }
                } else {
                    changeStateReq.audioMuted = ((Integer) obj).intValue();
                }
            } else {
                changeStateReq.onlineUserState = ((Integer) obj).intValue();
            }
        } else {
            changeStateReq.layoutState = (LayoutState) obj;
        }
        int i2 = changeStateReq.stateType;
        if (i2 == 1 ? (C936430aTZ.LIZIZ() & 2) == 2 : !((i2 == 3 || i2 == 4) && !C936430aTZ.LIZ())) {
            C490301vZ c490301vZ = this.LLILZ;
            c490301vZ.getClass();
            C23250099c.LIZLLL(c490301vZ, null, null, new C490001vW(c490301vZ, changeStateReq, function1, c490701vd, null), 3);
            if (LinkMicStateSetting.INSTANCE.syncWithRTC()) {
                this.LLILZIL.LJ(changeStateReq);
            }
            str = "StateManager";
        } else {
            this.LLILZIL.LJ(changeStateReq);
            str = "RTCManager";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append(".StateAbility] try to change state of [");
        int i3 = changeStateReq.stateType;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 6) {
                            if (i3 != 9) {
                                str2 = "unknown";
                            } else {
                                str2 = "avatar_id";
                            }
                        } else {
                            str2 = "network";
                        }
                    } else {
                        str2 = "video";
                    }
                } else {
                    str2 = "audio";
                }
            } else {
                str2 = "online";
            }
        } else {
            str2 = "layout";
        }
        sbLIZ.append(str2);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
    }
}
