package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aXI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938740aXI<T> {
    public static final Map<Long, Long> LJFF = new LinkedHashMap();
    public final WeakReference<InterfaceC938700aXE<T>> LIZJ;
    public C11JF LIZLLL;
    public final C01GW LIZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 536));
    public final C01GW LIZIZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 537));
    public long LJ = -1;

    public final void LIZ() {
        Long lLIZ;
        InterfaceC938700aXE<T> interfaceC938700aXE = this.LIZJ.get();
        if (interfaceC938700aXE != null && (lLIZ = interfaceC938700aXE.LIZ()) != null) {
            LJFF.remove(Long.valueOf(lLIZ.longValue()));
        }
        C11JF c11jf = this.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LIZLLL = null;
    }

    public C938740aXI(InterfaceC938700aXE<T> interfaceC938700aXE) {
        this.LIZJ = new WeakReference<>(interfaceC938700aXE);
    }

    public final void onEvent(C257100z3 c257100z3) {
        FollowPair followPair;
        if (c257100z3 != null && (followPair = c257100z3.LIZ) != null) {
            InterfaceC938700aXE<T> interfaceC938700aXE = this.LIZJ.get();
            if (interfaceC938700aXE == null) {
                LIZ();
                return;
            }
            long j = followPair.LIZ;
            Long lLIZ = interfaceC938700aXE.LIZ();
            if (lLIZ != null && j == lLIZ.longValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onEvent, userId=");
                sbLIZ.append(interfaceC938700aXE.LIZ());
                sbLIZ.append(", last_followStatus=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", followStatus = ");
                sbLIZ.append(followPair.followStatus);
                C20441214yg.LIZIZ("VoiceChatGuestMaskController", C2188811AlT.LIZIZ(sbLIZ));
                int i = followPair.followStatus;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                this.LJ = 3L;
                            }
                        } else {
                            this.LJ = 2L;
                        }
                    } else {
                        this.LJ = 1L;
                    }
                } else {
                    this.LJ = 0L;
                }
                LIZIZ(null, "onEvent");
            }
        }
    }

    public final void LIZIZ(Long l, String str) {
        C940110aZV c940110aZV = (C940110aZV) this.LIZ.getValue();
        if (c940110aZV != null) {
            c940110aZV.LJ(l, str);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFollowStatus，followStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("VoiceChatGuestMaskController", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC938700aXE<T> interfaceC938700aXE = this.LIZJ.get();
        if (interfaceC938700aXE == null) {
            LIZ();
            return;
        }
        if (l == null && (l = interfaceC938700aXE.LIZ()) == null) {
            return;
        }
        long jLongValue = l.longValue();
        if (jLongValue == UserService.getInstance().user().getCurrentUserId()) {
            return;
        }
        if (this.LIZLLL != null && this.LJ != -1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onEvent, userId:");
            sbLIZ2.append(jLongValue);
            sbLIZ2.append(", update followStatus = ");
            sbLIZ2.append(this.LJ);
            C20441214yg.LIZIZ("VoiceChatGuestMaskController", C2188811AlT.LIZIZ(sbLIZ2));
            LJFF.put(Long.valueOf(jLongValue), Long.valueOf(this.LJ));
        }
        if (this.LJ != -1) {
            return;
        }
        UserService.getInstance().user().LJ(jLongValue, "VoiceChatGuestMaskController_updateFollowStatus", "VoiceChatGuestMaskController_updateFollowStatus").LJJIIZ(new AfS184S0100000_15(this, 200), new C09JN() { // from class: X.00Kr
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("VoiceChatGuestMaskController@faaf.updateFollowStatus$1$2");
                C1C7U.LIZIZ("VoiceChatGuestMaskController@faaf.updateFollowStatus$1$2");
            }
        });
    }
}
