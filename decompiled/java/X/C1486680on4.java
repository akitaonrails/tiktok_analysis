package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.guidecard.ui.FriendsFYPGuideCardViewHolder;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0on4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486680on4 implements InterfaceC1486690on5 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC1483820oiS LIZ;
    public final InterfaceC1479620obg LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 39));

    public final InterfaceC1484830ok5 LIZIZ() {
        return (InterfaceC1484830ok5) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1486690on5
    public final void LIZ(EnumC1486730on9 enumC1486730on9) {
        try {
            switch (C1486720on8.LIZ[enumC1486730on9.ordinal()]) {
                case 1:
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LJI("FriendsFypGuideBgmPlayerManager", "INIT");
                    LIZIZ().LIZJ(this.LIZ);
                    return;
                case 2:
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LJI("FriendsFypGuideBgmPlayerManager", "START");
                    LIZIZ().LJ(this.LIZIZ);
                    return;
                case 3:
                    int i3 = C2187451AjH.LIZ;
                    C1720106oR.LJI("FriendsFypGuideBgmPlayerManager", "PAUSE");
                    LIZIZ().pause();
                    return;
                case 4:
                    int i4 = C2187451AjH.LIZ;
                    C1720106oR.LJI("FriendsFypGuideBgmPlayerManager", "RESUME");
                    LIZIZ().resume();
                    return;
                case 5:
                    int i5 = C2187451AjH.LIZ;
                    C1720106oR.LJI("FriendsFypGuideBgmPlayerManager", "STOP");
                    LIZIZ().stop();
                    return;
                case 6:
                    int i6 = C2187451AjH.LIZ;
                    C1720106oR.LJI("FriendsFypGuideBgmPlayerManager", "RELEASE");
                    LIZIZ().release();
                    return;
                default:
                    throw new C1954807lC();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJFF("FriendsFypGuideBgmPlayerManager", e.getStackTrace().toString());
        }
    }

    public C1486680on4(FriendsFYPGuideCardViewHolder friendsFYPGuideCardViewHolder, C1486700on6 c1486700on6) {
        this.LIZ = friendsFYPGuideCardViewHolder;
        this.LIZIZ = c1486700on6;
    }
}
