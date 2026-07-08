package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20367814mq {
    public static C20384614pY LIZ(BasePlaybookSheetFragment basePlaybookSheetFragment, DataChannel dataChannel, BasePlaybookViewModel basePlaybookViewModel, boolean z, EnumC20429114wj enumC20429114wj, C20382814pG c20382814pG, long j, InterfaceC20387814q4 interfaceC20387814q4, Function1 function1, String str) {
        int i;
        int i2 = C20367914mr.LIZ[enumC20429114wj.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i = 273;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    i = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                }
            } else {
                i = 0;
            }
        } else {
            i = 17;
        }
        return new C20384614pY(basePlaybookSheetFragment, dataChannel, i, z, basePlaybookViewModel, c20382814pG, j, interfaceC20387814q4, function1, str);
    }
}
