package androidx.core.telecom.internal;

import X.AbstractC1302730k0N;
import X.C05XL;
import X.C1302260jzc;
import X.C1302710k0L;
import X.C1302740k0O;
import X.C1302870k0b;
import X.C1302880k0c;
import X.C1302910k0f;
import X.C1302930k0h;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.content.Context;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes21.dex */
public final class JetpackConnectionService extends ConnectionService {
    public static final ArrayList<C1302870k0b> LL = new ArrayList<>();

    public static C1302870k0b LIZIZ(ConnectionRequest connectionRequest) {
        for (C1302870k0b c1302870k0b : LL) {
            if (connectionRequest.getAccountHandle().equals(c1302870k0b.LIZJ.LJI)) {
                return c1302870k0b;
            }
        }
        return null;
    }

    public static C1302870k0b LIZJ(ConnectionRequest connectionRequest) {
        String string;
        if (connectionRequest.getExtras() == null) {
            return null;
        }
        Bundle extras = connectionRequest.getExtras();
        if (extras.containsKey("android.telecom.extra.INCOMING_CALL_EXTRAS")) {
            Bundle bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS");
            if (bundle == null) {
                string = "requestIdMatcher KEY NOT FOUND";
            } else {
                string = bundle.getString("JetpackConnectionService_requestIdMatcher_key", "requestIdMatcher KEY NOT FOUND");
            }
        } else {
            string = extras.getString("JetpackConnectionService_requestIdMatcher_key", "requestIdMatcher KEY NOT FOUND");
        }
        if (string.equals("requestIdMatcher KEY NOT FOUND")) {
            return LIZIZ(connectionRequest);
        }
        for (C1302870k0b c1302870k0b : LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("targId=");
            sbLIZ.append(string);
            sbLIZ.append(", currId=");
            sbLIZ.append(c1302870k0b.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c1302870k0b.LIZ.equals(string)) {
                return c1302870k0b;
            }
        }
        return LIZIZ(connectionRequest);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("serviceAttachBaseContext: ");
            sbLIZ2.append(this);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    public static C1302260jzc LIZ(ConnectionRequest connectionRequest, int i) {
        C1302870k0b c1302870k0bLIZJ = LIZJ(connectionRequest);
        if (c1302870k0bLIZJ == null) {
            return null;
        }
        C1302260jzc c1302260jzc = new C1302260jzc(ParcelUuid.fromString(UUID.randomUUID().toString()), c1302870k0bLIZJ.LIZIZ, c1302870k0bLIZJ.LIZJ, c1302870k0bLIZJ.LIZLLL, c1302870k0bLIZJ.LJ, c1302870k0bLIZJ.LJI, c1302870k0bLIZJ.LJII, c1302870k0bLIZJ.LJIIIIZZ, c1302870k0bLIZJ.LJIIIZ, c1302870k0bLIZJ.LJIIJ, c1302870k0bLIZJ.LJIIJJI, c1302870k0bLIZJ.LJIIL, c1302870k0bLIZJ.LJIILIIL);
        c1302260jzc.setCallerDisplayName(c1302870k0bLIZJ.LIZJ.LIZ.toString(), 1);
        c1302260jzc.setAddress(c1302870k0bLIZJ.LIZJ.LIZIZ, 1);
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.telecom.extra.VOIP_BACKWARDS_COMPATIBILITY_SUPPORTED", true);
        c1302260jzc.putExtras(bundle);
        if (i == 2) {
            c1302260jzc.setDialing();
        } else {
            c1302260jzc.setRinging();
        }
        if (c1302870k0bLIZJ.LIZJ.LIZLLL == 2) {
            c1302260jzc.setVideoState(3);
        } else {
            c1302260jzc.setVideoState(0);
        }
        c1302260jzc.setConnectionCapabilities(1052416);
        C1302880k0c c1302880k0c = c1302870k0bLIZJ.LIZJ;
        c1302880k0c.getClass();
        C1302910k0f c1302910k0f = C1302930k0h.LIZ;
        int i2 = c1302880k0c.LJ;
        c1302910k0f.getClass();
        if (C1302910k0f.LIZ(2, i2)) {
            c1302260jzc.setConnectionCapabilities(2 | c1302260jzc.getConnectionCapabilities() | 1);
        }
        c1302260jzc.setAudioModeIsVoip(true);
        C05XL<AbstractC1302730k0N> c05xl = c1302870k0bLIZJ.LJFF;
        if (c05xl != null) {
            c05xl.LJIIZILJ(new C1302740k0O(c1302260jzc));
        }
        LL.remove(c1302870k0bLIZJ);
        return c1302260jzc;
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateIncomingConnection: connectionManagerPhoneAccount=[");
        sbLIZ.append(phoneAccountHandle);
        sbLIZ.append("], request=[");
        sbLIZ.append(connectionRequest);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (connectionRequest == null) {
            return Connection.createFailedConnection(new DisconnectCause(1, "ConnectionRequest is null, cannot complete the addCall request"));
        }
        return LIZ(connectionRequest, 1);
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        C05XL<AbstractC1302730k0N> c05xl;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateIncomingConnectionFailed: connectionMgrAcct=[");
        sbLIZ.append(phoneAccountHandle);
        sbLIZ.append("], request=[");
        sbLIZ.append(connectionRequest);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (connectionRequest == null) {
            return;
        }
        C1302870k0b c1302870k0bLIZJ = LIZJ(connectionRequest);
        LL.remove(c1302870k0bLIZJ);
        if (c1302870k0bLIZJ != null && (c05xl = c1302870k0bLIZJ.LJFF) != null) {
            c05xl.LJIIZILJ(new C1302710k0L(1));
        }
    }

    @Override // android.telecom.ConnectionService
    public final Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateOutgoingConnection: connectionMgrAcct=[");
        sbLIZ.append(phoneAccountHandle);
        sbLIZ.append("], request=[");
        sbLIZ.append(connectionRequest);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (connectionRequest == null) {
            return Connection.createFailedConnection(new DisconnectCause(1, "ConnectionRequest is null, cannot complete the addCall request"));
        }
        return LIZ(connectionRequest, 2);
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        C05XL<AbstractC1302730k0N> c05xl;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateOutgoingConnectionFailed: connectionMgrAcct=[");
        sbLIZ.append(phoneAccountHandle);
        sbLIZ.append("], request=[");
        sbLIZ.append(connectionRequest);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (connectionRequest == null) {
            return;
        }
        C1302870k0b c1302870k0bLIZJ = LIZJ(connectionRequest);
        LL.remove(c1302870k0bLIZJ);
        if (c1302870k0bLIZJ != null && (c05xl = c1302870k0bLIZJ.LJFF) != null) {
            c05xl.LJIIZILJ(new C1302710k0L(1));
        }
    }
}
