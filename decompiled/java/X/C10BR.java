package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.model.MissionInfo;
import com.ss.android.ugc.aweme.commerce.model.MissionItemStatus;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Set;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS7S3400000_6;

/* JADX INFO: renamed from: X.10BR, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10BR implements InterfaceC1010530cP5 {
    public final InterfaceC1002530cCB LL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C10BR(C10BT c10bt) {
        this.LL = c10bt;
    }

    public final boolean LIZ(Aweme aweme, boolean z, AwS7S3400000_6 awS7S3400000_6) {
        int i;
        MissionItemStatus missionItemStatusEnum;
        MissionInfo missionInfo;
        CommercialVideoInfo commercialVideoInfoLJ = C1009740cNo.LJ(aweme);
        if (commercialVideoInfoLJ != null && (missionInfo = commercialVideoInfoLJ.getMissionInfo()) != null && missionInfo.m173isMissionAd()) {
            C1397580mTM c1397580mTM = new C1397580mTM(C1001130c9v.LIZIZ(this));
            c1397580mTM.LJFF(2131837319);
            c1397580mTM.LIZ(2131837317);
            C985403tE.LIZ(c1397580mTM, AFwS271S0000000_28.get$arr$(255));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return true;
        }
        Long lValueOf = null;
        if (!C10BS.LIZ(aweme)) {
            Set setLJLIIL = C13LQ.LJLIIL(new MissionItemStatus[]{MissionItemStatus.AWAITING_REWARD, MissionItemStatus.HIDDEN});
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                missionItemStatusEnum = commerceVideoAuthInfo.getMissionItemStatusEnum();
            } else {
                missionItemStatusEnum = null;
            }
            if (!C13LP.LJJJJ(missionItemStatusEnum, setLJLIIL)) {
                return false;
            }
        }
        C11BY c11by = new C11BY();
        AwemeCommerceStruct commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo2 != null) {
            lValueOf = Long.valueOf(commerceVideoAuthInfo2.getMissionId());
        }
        c11by.LJIJ(10, lValueOf);
        C1397580mTM c1397580mTM2 = new C1397580mTM(C1001130c9v.LIZIZ(this));
        c1397580mTM2.LJFF(2131837320);
        Context contextLIZIZ = C1001130c9v.LIZIZ(this);
        if (C10BS.LIZ(aweme)) {
            if (z) {
                i = 2131844936;
            } else {
                i = 2131837315;
            }
        } else if (z) {
            i = 2131844937;
        } else {
            i = 2131837316;
        }
        c1397580mTM2.LIZIZ(contextLIZIZ.getString(i));
        C985403tE.LIZ(c1397580mTM2, new AwS607S0100000_28(awS7S3400000_6, 189));
        c1397580mTM2.LJII = false;
        new C1397510mTF(c1397580mTM2).LIZLLL();
        return true;
    }
}
