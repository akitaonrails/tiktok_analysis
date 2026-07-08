package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ISessionAbility;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aXZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938910aXZ implements InterfaceC938930aXb, InterfaceC968220bIq {
    public final LinkStatusViewModel LL;
    public final ISessionAbility LLILLJJLI;

    @Override // X.InterfaceC938950aXd
    public final void eB1(InterfaceC665370Q7z interfaceC665370Q7z) {
        InterfaceC938940aXc interfaceC938940aXcE8;
        ISessionAbility iSessionAbility = this.LLILLJJLI;
        if (iSessionAbility != null && (interfaceC938940aXcE8 = iSessionAbility.e8()) != null) {
            interfaceC938940aXcE8.LJLLLL(this);
        }
    }

    @Override // X.InterfaceC938950aXd
    public final void iT0(InterfaceC665370Q7z interfaceC665370Q7z) {
        InterfaceC938940aXc interfaceC938940aXcE8;
        ISessionAbility iSessionAbility = this.LLILLJJLI;
        if (iSessionAbility != null && (interfaceC938940aXcE8 = iSessionAbility.e8()) != null) {
            interfaceC938940aXcE8.LJLI(this);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C938910aXZ(LinkStatusViewModel linkStatusViewModel, ISessionAbility iSessionAbility) {
        this.LL = linkStatusViewModel;
        this.LLILLJJLI = iSessionAbility;
    }

    @Override // X.InterfaceC968220bIq
    public final void LIZ(int i, Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        this.LL.setState(new AwS594S0100000_15(i, objArr, 595));
    }

    @Override // X.InterfaceC938930aXb
    public final void Il(int i, String str, boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC938930aXb
    public final void dV(int i, Function1<? super Boolean, Unit> function1, Object obj, C490701vd c490701vd) {
        String str;
        InterfaceC938940aXc interfaceC938940aXcE8;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call on changeState for rust linker: stateType[");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 6) {
                            if (i != 9) {
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
        sbLIZ.append("] -> ");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        ISessionAbility iSessionAbility = this.LLILLJJLI;
        if (iSessionAbility != null && (interfaceC938940aXcE8 = iSessionAbility.e8()) != null) {
            interfaceC938940aXcE8.LLIL(i, obj);
        }
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }
}
