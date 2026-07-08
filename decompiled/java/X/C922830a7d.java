package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS66S1000000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.controller.ChangeStateReq;

/* JADX INFO: renamed from: X.0a7d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922830a7d implements InterfaceC938950aXd, InterfaceC921820a60 {
    public final InterfaceC490201vY LL;
    public ISessionAbility LLILLJJLI;

    public C922830a7d(InterfaceC490201vY interfaceC490201vY) {
        this.LL = interfaceC490201vY;
    }

    @Override // X.InterfaceC921820a60
    public final void LIZ(LinkLayerRTCMessage linkLayerRTCMessage) {
        boolean z;
        ArrayList<LinkLayerRTCMessageUser> arrayList;
        boolean z2;
        String str;
        ArrayList<LinkLayerRTCMessageUser> arrayList2;
        boolean z3;
        LinkLayerRTCMessageParam linkLayerRTCMessageParam;
        ArrayList<LinkLayerRTCMessageUser> arrayList3;
        LinkLayerRTCMessageParam linkLayerRTCMessageParam2 = linkLayerRTCMessage.param;
        if (linkLayerRTCMessageParam2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (linkLayerRTCMessageParam2 == null || !linkLayerRTCMessageParam2.is_state_supported() || ((linkLayerRTCMessageParam = linkLayerRTCMessage.param) != null && (arrayList3 = linkLayerRTCMessageParam.users) != null && arrayList3.size() > 1))) {
            if (!Intrinsics.LJFF(linkLayerRTCMessage.method, "linkMicSDKLayoutChange") && !Intrinsics.LJFF(linkLayerRTCMessage.method, "linkMicSDKVideoMute") && !Intrinsics.LJFF(linkLayerRTCMessage.method, "linkMicSDKAudioMute")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RTC message method[");
                sbLIZ.append(linkLayerRTCMessage.method);
                sbLIZ.append("] need not handle");
                C2188811AlT.LIZIZ(sbLIZ);
                Map<String, Object> map = C1338270kvh.LIZ;
                return;
            }
            String str2 = linkLayerRTCMessage.method;
            int iHashCode = str2.hashCode();
            int i = 16;
            long jLongValue = 0;
            if (iHashCode != -1609774425) {
                if (iHashCode != 965604647) {
                    if (iHashCode == 1540435074 && str2.equals("linkMicSDKAudioMute")) {
                        Long l = linkLayerRTCMessage.timeStamp;
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        LIZLLL(3, jLongValue, linkLayerRTCMessage.os);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("received LINK_LAYER_MUTE_AUDIO Message param = ");
                        sbLIZ2.append(linkLayerRTCMessage.param);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        Map<String, Object> map2 = C1338270kvh.LIZ;
                        LinkLayerRTCMessageParam linkLayerRTCMessageParam3 = linkLayerRTCMessage.param;
                        if (linkLayerRTCMessageParam3 != null && (arrayList2 = linkLayerRTCMessageParam3.users) != null) {
                            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
                            if (iLIZIZ >= 16) {
                                i = iLIZIZ;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                            for (LinkLayerRTCMessageUser linkLayerRTCMessageUser : arrayList2) {
                                String str3 = linkLayerRTCMessageUser.linkMicId;
                                if (linkLayerRTCMessageUser.audioMute == 1) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                Pair pair = new Pair(str3, Boolean.valueOf(z3));
                                linkedHashMap.put(pair.getFirst(), pair.getSecond());
                            }
                            this.LL.LJFF(1, new AwS381S0200000_15(this, (C922830a7d) linkedHashMap, (Map<String, Boolean>) 75));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (str2.equals("linkMicSDKLayoutChange")) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onRoomMsgReceived LINK_LAYER_LAYOUT_CHANGE param = ");
                    sbLIZ3.append(linkLayerRTCMessage.param);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    Map<String, Object> map3 = C1338270kvh.LIZ;
                    LinkLayerRTCMessageParam linkLayerRTCMessageParam4 = linkLayerRTCMessage.param;
                    if (linkLayerRTCMessageParam4 != null && (str = linkLayerRTCMessageParam4.layoutId) != null) {
                        this.LL.LJFF(1, new AwS66S1000000_15(str, 2));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("[fireEvent] received new Layout ");
                        sbLIZ4.append(str);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        return;
                    }
                    return;
                }
                return;
            }
            if (str2.equals("linkMicSDKVideoMute")) {
                Long l2 = linkLayerRTCMessage.timeStamp;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                LIZLLL(4, jLongValue, linkLayerRTCMessage.os);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("received LINK_LAYER_MUTE_VIDEO Message param = ");
                sbLIZ5.append(linkLayerRTCMessage.param);
                C2188811AlT.LIZIZ(sbLIZ5);
                Map<String, Object> map4 = C1338270kvh.LIZ;
                LinkLayerRTCMessageParam linkLayerRTCMessageParam5 = linkLayerRTCMessage.param;
                if (linkLayerRTCMessageParam5 != null && (arrayList = linkLayerRTCMessageParam5.users) != null) {
                    int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                    if (iLIZIZ2 >= 16) {
                        i = iLIZIZ2;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                    for (LinkLayerRTCMessageUser linkLayerRTCMessageUser2 : arrayList) {
                        String str4 = linkLayerRTCMessageUser2.linkMicId;
                        if (linkLayerRTCMessageUser2.videoMute == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        Pair pair2 = new Pair(str4, Boolean.valueOf(z2));
                        linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                    }
                    this.LL.LJFF(1, new AwS381S0200000_15(this, (C922830a7d) linkedHashMap2, (Map<String, Boolean>) 74));
                    return;
                }
                return;
            }
            return;
        }
        Map<String, Object> map5 = C1338270kvh.LIZ;
    }

    public final void LJ(ChangeStateReq changeStateReq) {
        String str;
        LinkLayerRTCMessage linkLayerRTCMessage;
        RtcUserInfo rtcUserInfoG0;
        String str2;
        RtcUserInfo rtcUserInfoG02;
        String str3;
        int i = changeStateReq.stateType;
        int iScene = 4;
        String str4 = "";
        int iZ11 = 1;
        if (i != 1) {
            int i2 = 0;
            if (i != 3) {
                if (i == 4) {
                    ISessionAbility iSessionAbility = this.LLILLJJLI;
                    if (iSessionAbility != null && (rtcUserInfoG02 = iSessionAbility.G0()) != null && (str3 = rtcUserInfoG02.linkMicId) != null) {
                        str4 = str3;
                    }
                    int i3 = changeStateReq.videoMuted;
                    if (i3 == 0 || i3 != 1) {
                        i2 = 1;
                    }
                    linkLayerRTCMessage = LIZIZ(new LinkLayerRTCMessageUser(str4, -1, 0, i2), "linkMicSDKVideoMute");
                } else {
                    return;
                }
            } else {
                ISessionAbility iSessionAbility2 = this.LLILLJJLI;
                if (iSessionAbility2 != null && (rtcUserInfoG0 = iSessionAbility2.G0()) != null && (str2 = rtcUserInfoG0.linkMicId) != null) {
                    str4 = str2;
                }
                int i4 = changeStateReq.audioMuted;
                if (i4 != 0 && i4 == 1) {
                    iZ11 = 0;
                }
                linkLayerRTCMessage = LIZIZ(new LinkLayerRTCMessageUser(str4, -1, iZ11, 0), "linkMicSDKAudioMute");
            }
            if (linkLayerRTCMessage == null) {
                return;
            }
        } else {
            LayoutState layoutState = changeStateReq.layoutState;
            if (layoutState == null || (str = layoutState.layoutId) == null) {
                str = "";
            }
            ISessionAbility iSessionAbility3 = this.LLILLJJLI;
            if (iSessionAbility3 != null) {
                iScene = iSessionAbility3.scene();
            }
            ISessionAbility iSessionAbility4 = this.LLILLJJLI;
            if (iSessionAbility4 != null) {
                iZ11 = iSessionAbility4.Z11();
            }
            linkLayerRTCMessage = new LinkLayerRTCMessage("linkMicSDKLayoutChange", new LinkLayerRTCMessageParam(str, iScene, iZ11, new ArrayList(), null, "", true), Long.valueOf(C158B.LIZ()), "", -1L, "", "");
        }
        linkLayerRTCMessage.generateId();
        ISessionAbility iSessionAbility5 = this.LLILLJJLI;
        if (iSessionAbility5 != null) {
            iSessionAbility5.pG(linkLayerRTCMessage);
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        ISessionAbility iSessionAbility = this.LLILLJJLI;
        if (iSessionAbility != null) {
            iSessionAbility.kt0();
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        ISessionAbility iSessionAbilityLIZJ = this.LL.LIZJ();
        if (iSessionAbilityLIZJ == null) {
            iSessionAbilityLIZJ = (ISessionAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISessionAbility.class, null);
        }
        this.LLILLJJLI = iSessionAbilityLIZJ;
        if (iSessionAbilityLIZJ != null) {
            iSessionAbilityLIZJ.X12(this);
        }
    }

    public static LinkLayerRTCMessage LIZIZ(LinkLayerRTCMessageUser linkLayerRTCMessageUser, String str) {
        return new LinkLayerRTCMessage(str, new LinkLayerRTCMessageParam("", 4, 1, C1697810uHb.LJ(linkLayerRTCMessageUser), null, "", true), Long.valueOf(C158B.LIZ()), "", -1L, "", "");
    }

    public final List LIZJ(int i, List list, Map map) {
        String str;
        int i2;
        UserState userState;
        int i3;
        RtcUserInfo rtcUserInfoG0 = this.LL.G0();
        if (rtcUserInfoG0 != null) {
            str = rtcUserInfoG0.linkMicId;
        } else {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<UserState> arrayList2 = new ArrayList();
        for (Object obj : list) {
            String str2 = ((UserState) obj).linkMicId;
            if (str2 != null && str2.length() != 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (UserState userStateLIZ : arrayList2) {
            arrayList.add(userStateLIZ.linkMicId);
            if (!Intrinsics.LJFF(userStateLIZ.linkMicId, str) && map.containsKey(userStateLIZ.linkMicId)) {
                if (C500260Jjc.LJJJI((Boolean) map.get(userStateLIZ.linkMicId))) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                userStateLIZ = i == 3 ? UserState.LIZ(userStateLIZ, 0, i3, 0, 0, 0, 0, 0L, 2015) : UserState.LIZ(userStateLIZ, 0, 0, i3, 0, 0, 0, 0L, 1983);
            }
            arrayList3.add(userStateLIZ);
        }
        Set setKeySet = map.keySet();
        ArrayList<String> arrayList4 = new ArrayList();
        for (Object obj2 : setKeySet) {
            if (!Intrinsics.LJFF(obj2, str) && !arrayList.contains(obj2)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        for (String str3 : arrayList4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("append userState[");
            sbLIZ.append(str3);
            sbLIZ.append(']');
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Object> map2 = C1338270kvh.LIZ;
            if (C500260Jjc.LJJJI((Boolean) map.get(str3))) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            if (i == 3) {
                userState = new UserState(null, str3, null, 0L, 0, i2, 0, 0, 0, 0, 0L);
            } else {
                userState = new UserState(null, str3, null, 0L, 0, 0, i2, 0, 0, 0, 0L);
            }
            arrayList5.add(userState);
        }
        List listLJLIL = C13LP.LJLIL(arrayList5, arrayList3);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[fireEvent] from stateIds ");
        sbLIZ2.append(arrayList);
        sbLIZ2.append(" , \n resultState ");
        sbLIZ2.append(listLJLIL);
        C2188811AlT.LIZIZ(sbLIZ2);
        Map<String, Object> map3 = C1338270kvh.LIZ;
        return listLJLIL;
    }

    public final void LIZLLL(int i, long j, String str) {
        String strU3;
        String str2;
        ISessionAbility iSessionAbilityLIZJ = this.LL.LIZJ();
        if (iSessionAbilityLIZJ == null || (strU3 = iSessionAbilityLIZJ.U3()) == null) {
            strU3 = "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (Intrinsics.LJFF(upperCase, "ANDROID")) {
            str2 = "AtoA";
        } else if (Intrinsics.LJFF(upperCase, "IOS")) {
            str2 = "iOStoA";
        } else {
            str2 = null;
        }
        C505301xz.LIZIZ(j, i, strU3, str2, true);
    }
}
