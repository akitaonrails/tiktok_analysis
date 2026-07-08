package X;

import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.01IU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01IU extends C01IS {
    public final C2252321DDq LJIJ;
    public final AnonymousClass0951 LJIJI;

    @Override // X.C01IS
    public final String LJIIIIZZ() {
        return "CountDownForAllV2AnchorModel";
    }

    public C01IU(DataChannel dataChannel) {
        super(dataChannel);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LJIJ = c2252321DDqLIZ;
        this.LJIJI = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public final void LJIILL(CountdownForAllConfig countdownForAllConfig) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Long lValueOf4;
        String str;
        CountdownForAllConfig countdownForAllConfig2 = (CountdownForAllConfig) this.LJIJI.getValue();
        if (countdownForAllConfig2 == null) {
            if (countdownForAllConfig == null) {
                return;
            }
        } else if (countdownForAllConfig != null) {
            String str2 = null;
            if (countdownForAllConfig2 != null) {
                lValueOf = Long.valueOf(countdownForAllConfig2.duration);
            } else {
                lValueOf = null;
            }
            if (countdownForAllConfig != null) {
                lValueOf2 = Long.valueOf(countdownForAllConfig.duration);
            } else {
                lValueOf2 = null;
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                if (countdownForAllConfig2 != null) {
                    lValueOf3 = Long.valueOf(countdownForAllConfig2.targetScore);
                } else {
                    lValueOf3 = null;
                }
                if (countdownForAllConfig != null) {
                    lValueOf4 = Long.valueOf(countdownForAllConfig.targetScore);
                } else {
                    lValueOf4 = null;
                }
                if (Intrinsics.LJFF(lValueOf3, lValueOf4)) {
                    if (countdownForAllConfig2 != null) {
                        str = countdownForAllConfig2.resourceId;
                    } else {
                        str = null;
                    }
                    if (countdownForAllConfig != null) {
                        str2 = countdownForAllConfig.resourceId;
                    }
                    if (Intrinsics.LJFF(str, str2)) {
                        return;
                    }
                }
            }
        }
        this.LJIJ.setValue(countdownForAllConfig);
    }

    @Override // X.C01IS
    public final void LJIILIIL(CountdownForAllContent countdownForAllContent, String str) {
        String string;
        String string2;
        String str2;
        super.LJIILIIL(countdownForAllContent, str);
        C356801a2<SeiAppData> c356801a2 = this.LJIILLIIL;
        int iLJI = LJI();
        boolean z = false;
        Map<String, String> mapLJIIJ = null;
        if (iLJI != 0 && iLJI != 3 && countdownForAllContent != null) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_UID, String.valueOf(countdownForAllContent.playId));
            pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(countdownForAllContent.playStatus));
            pairArr[2] = new Pair("stime", String.valueOf(countdownForAllContent.startTime));
            CountdownForAllConfig countdownForAllConfig = countdownForAllContent.playConfig;
            if (countdownForAllConfig == null || (string = Long.valueOf(countdownForAllConfig.duration).toString()) == null) {
                string = "300";
            }
            pairArr[3] = new Pair("duration", string);
            CountdownForAllConfig countdownForAllConfig2 = countdownForAllContent.playConfig;
            if (countdownForAllConfig2 == null || (string2 = Long.valueOf(countdownForAllConfig2.targetScore).toString()) == null) {
                string2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[4] = new Pair("tscore", string2);
            mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            CountdownForAllConfig countdownForAllConfig3 = countdownForAllContent.playConfig;
            if (countdownForAllConfig3 != null && (str2 = countdownForAllConfig3.resourceId) != null && !a0.LJJJIL(str2)) {
                str2.toString();
                mapLJIIJ.put("res", str2);
            }
        }
        if (c356801a2.LIZ()) {
            if (mapLJIIJ == null || mapLJIIJ.isEmpty()) {
                z = true;
            }
            if (z) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.LJIILL("cfa");
                    return;
                }
                return;
            }
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 == null) {
                return;
            }
            interfaceC954180awCLLJLL2.LJJIIZI("cfa", mapLJIIJ, true);
        }
    }
}
