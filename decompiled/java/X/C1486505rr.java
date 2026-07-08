package X;

import com.ss.android.ugc.aweme.ad.feed.service.ClickBackTimeServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS61S0100100_35;

/* JADX INFO: renamed from: X.05rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1486505rr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ ClickBackTimeServiceImpl LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1486505rr(Aweme aweme, ClickBackTimeServiceImpl clickBackTimeServiceImpl, long j) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = clickBackTimeServiceImpl;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onPageResume] aid=");
        sbLIZ.append(this.LL.getAid());
        C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        ClickBackTimeServiceImpl clickBackTimeServiceImpl = this.LLILLJJLI;
        Aweme aweme = this.LL;
        long j = this.LLILLL;
        clickBackTimeServiceImpl.getClass();
        String strLIZJ = ClickBackTimeServiceImpl.LIZJ(aweme);
        if (strLIZJ != null) {
            C1486605rs c1486605rsRemove = clickBackTimeServiceImpl.LIZIZ.remove(strLIZJ);
            if (c1486605rsRemove == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[settleRecord] no matching record found, aid=");
                sbLIZ2.append(aweme.getAid());
                C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[settleRecord] settled, key=");
                sbLIZ3.append(ClickBackTimeServiceImpl.LIZJ(c1486605rsRemove.LIZ));
                sbLIZ3.append(", pendingCount=");
                sbLIZ3.append(clickBackTimeServiceImpl.LIZIZ.size());
                C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                AwemeRawAd awemeRawAd = c1486605rsRemove.LIZ.getAwemeRawAd();
                if (awemeRawAd != null) {
                    long j2 = j - c1486605rsRemove.LIZLLL;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[report] refer=");
                    sbLIZ4.append(c1486605rsRemove.LIZIZ);
                    sbLIZ4.append(", duration=");
                    sbLIZ4.append(j2);
                    sbLIZ4.append("ms, creativeId=");
                    sbLIZ4.append(awemeRawAd.getCreativeIdStr());
                    C1022620cia.LIZ("ClickBackTimeServiceImpl", C2188811AlT.LIZIZ(sbLIZ4));
                    new C1049100dPI(new Object[0]).logAd(C1D2J.LIZ, awemeRawAd, new AwS61S0100100_35(j2, c1486605rsRemove, 0));
                }
            }
        }
        return Unit.LIZ;
    }
}
