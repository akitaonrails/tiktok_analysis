package X;

import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.model.MissionInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS134S0101000_28;

/* JADX INFO: renamed from: X.10AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10AZ implements InterfaceC19201410Aa {
    public final C10AY LL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ C10AY Mh() {
        return this.LL;
    }

    public C10AZ(C10AR c10ar) {
        this.LL = c10ar;
    }

    @Override // X.InterfaceC19201410Aa
    public final boolean Oz(int i, int i2) {
        CommercialVideoInfo commercialVideoInfoLJ;
        MissionInfo missionInfo;
        if (i != 0 || !C13LQ.LJLIIL(new Integer[]{1, 2}).contains(Integer.valueOf(i2))) {
            return false;
        }
        Aweme aweme = this.LL.getAweme();
        if (aweme != null && (commercialVideoInfoLJ = C1009740cNo.LJ(aweme)) != null && (missionInfo = commercialVideoInfoLJ.getMissionInfo()) != null && missionInfo.m173isMissionAd()) {
            C1397580mTM c1397580mTM = new C1397580mTM(C1001130c9v.LIZIZ(this));
            c1397580mTM.LJFF(2131837325);
            c1397580mTM.LIZ(2131837323);
            C985403tE.LIZ(c1397580mTM, AFwS271S0000000_28.get$arr$(262));
            new C1397510mTF(c1397580mTM).LIZLLL();
        } else {
            if (!C10BS.LIZ(this.LL.getAweme())) {
                return false;
            }
            C1397580mTM c1397580mTM2 = new C1397580mTM(C1001130c9v.LIZIZ(this));
            c1397580mTM2.LJFF(2131837322);
            c1397580mTM2.LIZ(2131837321);
            C985403tE.LIZ(c1397580mTM2, new AwS134S0101000_28(this, i2, 20));
            new C1397510mTF(c1397580mTM2).LIZLLL();
        }
        return true;
    }
}
