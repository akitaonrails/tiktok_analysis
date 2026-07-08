package X;

import Y.AfS1S0101100_15;
import Y.AfS82S0101000_15;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.chatroom.interact.model.UpdateLayoutParams;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ZvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915120ZvC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, boolean z, int i, List list, InterfaceC914930Zut interfaceC914930Zut) {
        if (!C955010axX.LJIIJ) {
            if (interfaceC914930Zut != null) {
                interfaceC914930Zut.LIZ(-1, "server layout disabled", null);
                return;
            }
            return;
        }
        if (!z) {
            if (interfaceC914930Zut != null) {
                interfaceC914930Zut.LIZ(-1, "current user is not anchor", null);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAndApply: roomId=");
        sbLIZ.append(j);
        sbLIZ.append(" action=");
        sbLIZ.append(i);
        sbLIZ.append(" userIds=");
        sbLIZ.append(list);
        C20441214yg.LIZIZ("UpdateLayoutApiHandler", C2188811AlT.LIZIZ(sbLIZ));
        UpdateLayoutParams updateLayoutParams = new UpdateLayoutParams();
        updateLayoutParams.action = i;
        updateLayoutParams.roomId = j;
        updateLayoutParams.userIds = new ArrayList(list);
        C480460Ism.LIZ().getClass();
        ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).updateLayout(updateLayoutParams).LJFF(new C0UO0()).LJJIIZ(new AfS1S0101100_15(i, j, interfaceC914930Zut, 6), new AfS82S0101000_15(i, interfaceC914930Zut, 6));
    }

    public static void LIZIZ(long j, boolean z, int i, List list, C959760b5C c959760b5C, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            list = C13BV.INSTANCE;
        }
        if ((i2 & 16) != 0) {
            c959760b5C = null;
        }
        LIZ(j, z, i, list, c959760b5C);
    }
}
