package X;

import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaHostInterceptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0JkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500830JkX implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 116;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        DataChannel dataChannel;
        RoomCreateInfo roomCreateInfo;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c759360TqY));
        if (!LiveEnigmaHostInterceptSetting.INSTANCE.getValue() || (dataChannel = c500840JkY.LIZIZ) == null || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || !roomCreateInfo.isEnigma) {
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
        } else {
            C782110Um9 c782110Um9 = new C782110Um9(c500840JkY.LIZ);
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131852201);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131852196));
            C494720Jag c494720Jag = new C494720Jag();
            C755620TkW c755620TkW = new C755620TkW();
            c755620TkW.LIZ = C497740JfY.LJIJI(2131852205);
            c755620TkW.LIZJ = new C515201za(c23260099m, 10);
            c494720Jag.LIZ(new C0TZ2(c755620TkW));
            C755630TkX c755630TkX = new C755630TkX();
            c755630TkX.LIZ = C497740JfY.LJIJI(2131852221);
            c755630TkX.LIZJ = new C515201za(c23260099m, 11);
            c494720Jag.LIZ(new C0TZ3(c755630TkX));
            c494720Jag.LIZIZ = 2;
            c782110Um9.LIZJ(new C494730Jah(c494720Jag));
            C786410Ut5.E4(c782110Um9.LIZ());
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c759360TqY);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
