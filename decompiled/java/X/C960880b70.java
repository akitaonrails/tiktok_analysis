package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.MultiCoHostScreenshareEducationDialog;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0b70, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960880b70 {
    public static void LIZ(C955590ayT c955590ayT, Context context, DataChannel dataChannel) {
        boolean z;
        EnumC955820ayq enumC955820ayqLLLLJ;
        String strLIZ = C0KVU.LIZ(c955590ayT.LJ.getOwner());
        RivalExtraInfo rivalExtraInfo = c955590ayT.LJIIJ;
        if (rivalExtraInfo != null && rivalExtraInfo.cohostLayoutMode == 1) {
            z = true;
        } else {
            z = false;
        }
        EnumC955820ayq enumC955820ayqLLLLJ2 = null;
        if (z) {
            IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
            if (iMultiHostServiceLJII != null) {
                enumC955820ayqLLLLJ = iMultiHostServiceLJII.LLLLJ();
            } else {
                enumC955820ayqLLLLJ = null;
            }
            if (enumC955820ayqLLLLJ == EnumC955820ayq.COHOST_MODE_NORMAL) {
                C20337914i1<Boolean> c20337914i1 = InterfaceC960800b6s.LLLLLILLIL;
                if (!c20337914i1.LIZIZ().booleanValue()) {
                    new MultiCoHostScreenshareEducationDialog(context, true, strLIZ, Long.valueOf(c955590ayT.LJ.getId()), dataChannel).LJLIIIL();
                    c20337914i1.LJFF(Boolean.TRUE);
                    return;
                }
            }
        }
        RivalExtraInfo rivalExtraInfo2 = c955590ayT.LJIIJ;
        if (rivalExtraInfo2 != null && rivalExtraInfo2.cohostLayoutMode == 1) {
            return;
        }
        IMultiHostService iMultiHostServiceLJII2 = C915980Zwa.LJII();
        if (iMultiHostServiceLJII2 != null) {
            enumC955820ayqLLLLJ2 = iMultiHostServiceLJII2.LLLLJ();
        }
        if (enumC955820ayqLLLLJ2 != EnumC955820ayq.COHOST_MODE_SCREEN_SHARE) {
            return;
        }
        C20337914i1<Boolean> c20337914i12 = InterfaceC960800b6s.LLLLLJIL;
        if (c20337914i12.LIZIZ().booleanValue()) {
            return;
        }
        new MultiCoHostScreenshareEducationDialog(context, false, strLIZ, Long.valueOf(c955590ayT.LJ.getId()), dataChannel).LJLIIIL();
        c20337914i12.LJFF(Boolean.TRUE);
    }
}
