package X;

import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS75S0100100_29;

/* JADX INFO: renamed from: X.12Ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19764712Ur {
    public static final /* synthetic */ int LJ = 0;
    public final INLEPlayer LIZ;
    public boolean LIZJ;
    public final ArrayList<InterfaceC19765012Uu> LIZIZ = new ArrayList<>();
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 225));

    public C19764712Ur(INLEPlayer iNLEPlayer) {
        this.LIZ = iNLEPlayer;
    }

    public final int LIZ(String str) {
        C19758912Sl c19758912Sl = new C19758912Sl(str, "pause");
        LIZLLL(c19758912Sl);
        Iterator<InterfaceC19765012Uu> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ(c19758912Sl)) {
                return 9999;
            }
        }
        C1524705y1.LIZJ(new AwS573S0100000_29(str, this, 226));
        return this.LIZ.pause();
    }

    public final int LIZIZ(String str) {
        C19758912Sl c19758912Sl = new C19758912Sl(str, "replay");
        LIZLLL(c19758912Sl);
        Iterator<InterfaceC19765012Uu> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ(c19758912Sl)) {
                return 9999;
            }
        }
        LIZJ(0L, str, NLESeekFlag.EDITOR_SEEK_FLAG_OnGoing);
        C19765312Ux c19765312Ux = new C19765312Ux();
        LIZLLL(c19765312Ux);
        C1524705y1.LIZJ(new AwS573S0100000_29(this, c19765312Ux, 227));
        return this.LIZ.play();
    }

    public final void LIZLLL(C19759012Sm c19759012Sm) {
        long currentPosition = this.LIZ.getCurrentPosition();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        c19759012Sm.LIZ = currentPosition / j;
        c19759012Sm.LIZIZ = this.LIZ.getDuration() / j;
    }

    public final int LIZJ(long j, String str, NLESeekFlag nLESeekFlag) {
        C19758912Sl c19758912Sl = new C19758912Sl(str, "seek");
        LIZLLL(c19758912Sl);
        Iterator<InterfaceC19765012Uu> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ(c19758912Sl)) {
                return 9999;
            }
        }
        C1524705y1.LIZJ(new AwS75S0100100_29(this, j, 0));
        return this.LIZ.seekTime(j, nLESeekFlag);
    }
}
