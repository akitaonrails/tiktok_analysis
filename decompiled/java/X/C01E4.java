package X;

import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownUser;

/* JADX INFO: renamed from: X.01E4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01E4 extends C01E7 {
    public final C01E0 LJII;

    @Override // X.InterfaceC299101Dx
    public final void LJI(C01ED c01ed) {
    }

    @Override // X.C01E7
    public final String LJJ() {
        return "CountdownAnchorModel";
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void destroy() {
        LIZ();
        super.destroy();
    }

    public final void LJJIJIIJI() throws JSONException {
        HashMap map;
        String str;
        if (LJIJJLI() == C01EB.IDLE) {
            map = null;
        } else {
            List<C01E5> listLJIILL = LJIILL();
            map = new HashMap();
            for (C01E5 c01e5 : listLJIILL) {
                CountdownUser countdownUser = c01e5.LIZ.countdownUser;
                if (countdownUser != null && (str = countdownUser.linkmicId) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, c01e5.LIZ.countdownId);
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c01e5.LIZ.status);
                    jSONObject.put("stime", c01e5.LIZ.startTime);
                    CountdownConfig countdownConfig = c01e5.LIZ.countdownConfig;
                    jSONObject.put("duration", countdownConfig != null ? countdownConfig.duration : 0L);
                    CountdownConfig countdownConfig2 = c01e5.LIZ.countdownConfig;
                    jSONObject.put("tscore", countdownConfig2 != null ? countdownConfig2.targetScore : 0L);
                    map.put(str, jSONObject);
                }
            }
        }
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalidateSei, regionExtraData = ");
        sbLIZ.append(map);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("CountdownAnchorModel", strLIZIZ, null, null);
        if (map == null) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LJJIZ("countdown");
                return;
            }
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            interfaceC954180awCLLJLL2.LJIJI("countdown", map);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01E0] */
    public C01E4(final DataChannel dataChannel) {
        super(dataChannel);
        this.LJII = new AbstractC299001Dw(dataChannel, this) { // from class: X.01E0
        };
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LIZIZ(List<CountdownContent> list) throws JSONException {
        Iterator<CountdownContent> it2 = list.iterator();
        while (it2.hasNext()) {
            super.LJJIIZI(new C01E5(it2.next(), false, null, 14));
            LJJIJIIJI();
        }
        Iterator it3 = C01E8.LIZJ(list).iterator();
        while (it3.hasNext()) {
            LJJIIZ((C01E9) it3.next());
        }
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LIZLLL(String str) {
        super.LIZLLL(str);
        Long lLJIJ = LJIJ(str);
        if (lLJIJ != null) {
            long jLongValue = lLJIJ.longValue();
            CountdownEndParams countdownEndParams = new CountdownEndParams();
            countdownEndParams.countdownId = jLongValue;
            countdownEndParams.roomId = C01E8.LJFF();
            countdownEndParams.channelId = C01E8.LIZLLL();
            countdownEndParams.endReason = 2;
            endOneCountdownPlay(countdownEndParams);
        }
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LJFF(String str) throws JSONException {
        super.LJFF(str);
        LJJIJIIJI();
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LJIIIZ(C01E5 c01e5) throws JSONException {
        super.LJJIIZI(c01e5);
        LJJIJIIJI();
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LJIIJJI(C01E5 c01e5) throws JSONException {
        String str;
        Long lLJIJJ;
        CountdownUser countdownUser = c01e5.LIZ.countdownUser;
        if (countdownUser != null && (str = countdownUser.linkmicId) != null && this.LIZJ.get(str) != null && (lLJIJJ = LJIJJ(str)) != null) {
            long jLongValue = lLJIJJ.longValue();
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEndCountdownMessageReceived,remainTime = ");
            sbLIZ.append(jLongValue);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ("CountdownAnchorModel", strLIZIZ, null, null);
            if (c01e5.LIZJ == null && jLongValue <= 0) {
                super.LJJIIZI(c01e5);
                LJJIJIIJI();
                return;
            }
            super.LJJIIZI(C01E6.LIZ(c01e5, 0));
            LJJIJIIJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onEndCountdownMessageReceived,operatorUserInfo = ");
            sbLIZ2.append(c01e5.LIZJ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1azw.getClass();
            C1AZW.LIZ("CountdownAnchorModel", strLIZIZ2, null, null);
        }
    }

    @Override // X.C01E7, X.InterfaceC299101Dx
    public final void LJIIL(C01E5 c01e5) throws JSONException {
        super.LJJIIZI(c01e5);
        LJJIJIIJI();
    }

    @Override // X.C01E7
    public final void LJJIIZI(C01E5 c01e5) throws JSONException {
        super.LJJIIZI(c01e5);
        LJJIJIIJI();
    }
}
