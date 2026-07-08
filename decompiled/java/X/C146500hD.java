package X;

import com.bytedance.android.livesdk.sticker.game.ViewerGameGiftStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00hD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C146500hD {
    public static final boolean LIZ(DataChannel dataChannel) {
        EnumC146000h8 enumC146000h8;
        C146400hC c146400hC = (C146400hC) dataChannel.gg0(ViewerGameGiftStateChannel.class);
        if (c146400hC != null) {
            enumC146000h8 = c146400hC.LIZ;
        } else {
            enumC146000h8 = null;
        }
        if (enumC146000h8 == EnumC146000h8.STARTED) {
            return true;
        }
        return false;
    }
}
