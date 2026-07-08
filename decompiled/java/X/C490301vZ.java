package X;

import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.controller.ChangeStateReq;

/* JADX INFO: renamed from: X.01vZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C490301vZ implements InterfaceC490601vc, InterfaceC938950aXd, InterfaceC497601wk {
    public final InterfaceC490201vY LL;
    public final AtomicLong LLILLJJLI = new AtomicLong(0);
    public final C01GW LLILLL = C292401Bi.LIZ(AnonymousClass0206.get$arr$(271));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C5182020e(this, 196));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(272));
    public final C1DFB LLILZLL = C0PEM.LIZJ;

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILZLL;
    }

    public C490301vZ(InterfaceC490201vY interfaceC490201vY) {
        this.LL = interfaceC490201vY;
    }

    public final void LIZ(C490701vd c490701vd) {
        Object obj;
        long j = this.LLILLJJLI.get();
        long j2 = c490701vd.LL;
        if (j >= j2) {
            return;
        }
        this.LLILLJJLI.set(j2);
        this.LL.LJFF(0, new C020W(c490701vd, this, 25));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[fireEvent] received state ");
        sbLIZ.append(c490701vd);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        InterfaceC490201vY interfaceC490201vY = this.LL;
        Iterator<UserState> it2 = c490701vd.LLILLL.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            UserState next = it2.next();
            String str = next.linkMicId;
            RtcUserInfo rtcUserInfoG0 = this.LL.G0();
            if (rtcUserInfoG0 != null) {
                obj = rtcUserInfoG0.linkMicId;
            }
            if (Intrinsics.LJFF(str, obj)) {
                obj = next;
                break;
            }
        }
        interfaceC490201vY.LIZIZ(0, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    @Override // X.InterfaceC490601vc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(webcast.im.LinkStateMessage r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C490301vZ.LJIILLIIL(webcast.im.LinkStateMessage):void");
    }

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) this.LLILLL.getValue();
        if (linkMessageCenter != null) {
            linkMessageCenter.LJ(this);
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        LinkMessageCenter linkMessageCenter = (LinkMessageCenter) this.LLILLL.getValue();
        if (linkMessageCenter != null) {
            linkMessageCenter.LIZ(this);
        }
    }

    public final C490701vd LIZIZ(C490701vd c490701vd, ChangeStateReq changeStateReq, C490701vd c490701vd2, final Throwable th) {
        String str;
        UserState next;
        String str2;
        if (changeStateReq.stateType == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("【RESET】trying to reset layout state [");
            LayoutState layoutState = changeStateReq.layoutState;
            if (layoutState != null) {
                str2 = layoutState.layoutId;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(']');
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Object> map = C1338270kvh.LIZ;
            C489801vU c489801vU = c490701vd2.LLILLJJLI;
            final int i = changeStateReq.stateType;
            return C490701vd.LIZ(c490701vd, 0L, c489801vU, null, new C491001vg(new Throwable(i, th) { // from class: X.01va
                public static final int $stable = 8;
                public final int LL;

                public final int getStateType() {
                    return this.LL;
                }

                {
                    super(th.getMessage(), th);
                    this.LL = i;
                }
            }), null, null, 53);
        }
        RtcUserInfo rtcUserInfoG0 = this.LL.G0();
        if (rtcUserInfoG0 != null) {
            str = rtcUserInfoG0.linkMicId;
        } else {
            str = null;
        }
        List<UserState> list = c490701vd.LLILLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (UserState userStateLIZ : list) {
            if (Intrinsics.LJFF(userStateLIZ.linkMicId, str)) {
                int i2 = changeStateReq.stateType;
                Iterator<UserState> it2 = c490701vd2.LLILLL.iterator();
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
                UserState userState = next;
                if (userState != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("【RESET】trying to reset user state [");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(']');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    if (i2 == 6) {
                                        userStateLIZ = UserState.LIZ(userStateLIZ, 0, 0, 0, 0, userState.networkState, 0, 0L, 1791);
                                    }
                                } else {
                                    userStateLIZ = UserState.LIZ(userStateLIZ, 0, 0, 0, userState.rtcConnection, 0, 0, 0L, 1919);
                                }
                            } else {
                                userStateLIZ = UserState.LIZ(userStateLIZ, 0, 0, userState.videoMuted, 0, 0, 0, 0L, 1983);
                            }
                        } else {
                            userStateLIZ = UserState.LIZ(userStateLIZ, 0, userState.audioMuted, 0, 0, 0, 0, 0L, 2015);
                        }
                    } else {
                        userStateLIZ = UserState.LIZ(userStateLIZ, userState.onlineUserState, 0, 0, 0, 0, 0, 0L, 2031);
                    }
                }
            }
            arrayList.add(userStateLIZ);
        }
        final int i3 = changeStateReq.stateType;
        return C490701vd.LIZ(c490701vd, 0L, null, arrayList, new C491001vg(new Throwable(i3, th) { // from class: X.01va
            public static final int $stable = 8;
            public final int LL;

            public final int getStateType() {
                return this.LL;
            }

            {
                super(th.getMessage(), th);
                this.LL = i3;
            }
        }), null, null, 51);
    }
}
