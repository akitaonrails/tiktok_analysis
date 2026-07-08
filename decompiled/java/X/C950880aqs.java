package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration.MultiGuestDecorationDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950880aqs {
    public static void LIZ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        long j = MultiGuestDecorationDialog.LLLFFI;
        if (j > 0) {
            C19322110iZ.LIZ(j);
        }
        C953470av3 c953470av3 = C953470av3.LIZ;
        MultiGuestDecorationDialog multiGuestDecorationDialog = new MultiGuestDecorationDialog();
        multiGuestDecorationDialog.LLJLLL = dataChannel;
        c953470av3.getClass();
        MultiGuestDecorationDialog.LLLFFI = C953470av3.LIZJ(dataChannel, multiGuestDecorationDialog, "MultiGuestDecorationDialog");
    }
}
