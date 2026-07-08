package X;

import Y.ARunnableS34S0110000_15;
import com.bytedance.android.live.linkmic.LivePublicScreenClipChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0adY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942620adY {
    public static void LIZ(boolean z, boolean z2) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendClipEvent, isAnchor=");
        sbLIZ.append(z);
        sbLIZ.append(", recover=");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("take_stage_hole", C2188811AlT.LIZIZ(sbLIZ));
        if (!LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptPublicScreenOverlap()) {
            return;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
        } else {
            interfaceC937900aVwLLIIJLIL = null;
        }
        if (!z2 && C958040b2Q.LIZLLL()) {
            C473410IhP.LIZJ(new ARunnableS34S0110000_15(interfaceC937900aVwLLIIJLIL, z, 1), 100L);
            return;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (dataChannelGlobal != null) {
            dataChannelGlobal.HQ2(LivePublicScreenClipChannel.class, new C946210ajL(new ArrayList(), 0.0f));
        }
    }
}
