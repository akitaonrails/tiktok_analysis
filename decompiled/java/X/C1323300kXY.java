package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0kXY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323300kXY {
    public int LIZIZ;
    public int LIZJ;
    public EnumC1323320kXa LJ;
    public boolean LJFF;
    public EnumC1323290kXX LIZ = EnumC1323290kXX.INIT;
    public EnumC1323330kXb LIZLLL = EnumC1323330kXb.INIT;

    public final boolean LIZ() {
        EnumC1323320kXa enumC1323320kXa;
        int i = this.LIZIZ;
        if (i >= 1 || (enumC1323320kXa = this.LJ) == EnumC1323320kXa.NOT_AVAILABLE || enumC1323320kXa == EnumC1323320kXa.FAKE || this.LIZ != EnumC1323290kXX.FAIL) {
            return false;
        }
        this.LIZIZ = i + 1;
        this.LIZLLL = EnumC1323330kXb.SRC;
        return true;
    }

    public final int LIZIZ() {
        int i = C1323340kXc.LIZ[this.LIZLLL.ordinal()];
        if (i == 1) {
            return LSPassThroughRecordSizeConfig.DEFAULT;
        }
        if (i == 2) {
            return this.LIZJ + 2000;
        }
        if (i != 3) {
            return 0;
        }
        return this.LIZIZ + LivePreCreateNextRoomPlayer.ENABLE;
    }
}
