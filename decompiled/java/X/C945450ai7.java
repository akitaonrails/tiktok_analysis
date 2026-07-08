package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookSelectionDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ai7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945450ai7 {
    public static PlaybookSelectionDialog LIZ(EnumC945500aiC enumC945500aiC, DataChannel dataChannel, String str, Function1 function1, Function2 function2, Function1 function12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newInstance maxSelectCount:");
        sbLIZ.append(1);
        sbLIZ.append(" title:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("PlaybookSelectionDialog", C2188811AlT.LIZIZ(sbLIZ));
        return new PlaybookSelectionDialog(enumC945500aiC, dataChannel, str, function1, function2, function12);
    }
}
