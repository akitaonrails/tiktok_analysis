package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.growth.LiveCenterGrowthDisplayTimeSetting;
import com.bytedance.android.livesdk.model.message.DailyChallengesLiveCardMessage;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12OO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12OO extends C12OM {
    public DailyChallengesLiveCardMessage LJIIL;

    @Override // X.C12O8
    public final boolean LJIJ(C12O8 c12o8) {
        return true;
    }

    public C12OO(View view) {
        super(view, C12OE.SMB, 4);
        this.LJFF = view.findViewById(R.id.mvg);
        this.LJII = (C19728712Gv) view.findViewById(R.id.mvh);
        this.LJIIIZ = view.findViewById(R.id.e8u);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // X.C12O8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJIIJ(java.lang.String r4) {
        /*
            r3 = this;
            com.bytedance.android.livesdk.model.message.DailyChallengesLiveCardMessage r0 = r3.LJIIL
            if (r0 == 0) goto L35
            int r0 = r0.status
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L35
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L21
            java.lang.String r2 = "during_challenge"
        L15:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "challenge_status"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            return r0
        L21:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L2b
            java.lang.String r2 = "rewards_available"
            goto L15
        L2b:
            int r1 = r2.intValue()
            r0 = 3
            if (r1 != r0) goto L35
            java.lang.String r2 = "all_completed"
            goto L15
        L35:
            java.lang.String r2 = "first_time_launch"
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12OO.LJIIJ(java.lang.String):java.util.Map");
    }

    public final void LJIJJ(DailyChallengesLiveCardMessage dailyChallengesLiveCardMessage) {
        if (a0.LJJJIL(dailyChallengesLiveCardMessage.message)) {
            return;
        }
        this.LJIIL = dailyChallengesLiveCardMessage;
        C19728712Gv c19728712Gv = this.LJII;
        if (c19728712Gv != null) {
            String str = dailyChallengesLiveCardMessage.message;
            boolean zLJJ = C497740JfY.LJJ();
            c19728712Gv.LLJJ = 1;
            c19728712Gv.LIZ(str, zLJJ);
        }
        C19728712Gv c19728712Gv2 = this.LJII;
        if (c19728712Gv2 != null) {
            c19728712Gv2.requestFocus();
        }
        C19728712Gv c19728712Gv3 = this.LJII;
        if (c19728712Gv3 != null) {
            c19728712Gv3.LIZIZ();
        }
        C473410IhP.LJ(this.LJIIJJI);
        C473410IhP.LIZJ(this.LJIIJJI, LiveCenterGrowthDisplayTimeSetting.INSTANCE.getValue());
    }
}
