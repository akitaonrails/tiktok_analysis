package X;

import android.view.Choreographer;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0P4U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4U implements Choreographer.FrameCallback {
    public final int $t;
    public Object l0;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.$t) {
            case 0:
                doFrame$0(this, j);
                break;
            case 1:
                doFrame$1(this, j);
                break;
            case 2:
                doFrame$2(this, j);
                break;
            case 3:
                doFrame$3(this, j);
                break;
        }
    }

    public C0P4U(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void doFrame$0(C0P4U c0p4u, long j) {
        C786410Ut5.v2().removeFrameCallback(c0p4u);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0p4u.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
    }

    public static final void doFrame$1(C0P4U c0p4u, long j) {
        BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem = (BulletinBoardPageHybridAssem) c0p4u.l0;
        bulletinBoardPageHybridAssem.LLLFF = false;
        C620080OTu c620080OTuPollFirst = bulletinBoardPageHybridAssem.LLLF.pollFirst();
        if (c620080OTuPollFirst != null) {
            c620080OTuPollFirst.LIZIZ.LIZ(c620080OTuPollFirst.LIZ);
            if (!bulletinBoardPageHybridAssem.LLLFF && (!bulletinBoardPageHybridAssem.LLLF.isEmpty())) {
                bulletinBoardPageHybridAssem.LLLFF = true;
                C786410Ut5.v2().postFrameCallback(bulletinBoardPageHybridAssem.LLLFZ);
            }
        }
    }

    public static final void doFrame$2(C0P4U c0p4u, long j) {
        C786410Ut5.v2().removeFrameCallback(c0p4u);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0p4u.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
    }

    public static final void doFrame$3(C0P4U c0p4u, long j) {
        C786410Ut5.v2().removeFrameCallback(c0p4u);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c0p4u.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
    }
}
