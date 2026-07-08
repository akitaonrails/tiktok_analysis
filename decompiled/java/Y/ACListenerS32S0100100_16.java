package Y;

import X.C036E;
import X.C0OBG;
import X.C1016960cZS;
import X.C1072510e13;
import X.C1076910e89;
import X.C1389890mGx;
import X.C197039127h;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentConfig;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: loaded from: classes17.dex */
public class ACListenerS32S0100100_16 implements View.OnClickListener {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public ACListenerS32S0100100_16(AwS382S0200000_16 awS382S0200000_16, int i) {
        this.$t = i;
        this.j1 = 1000L;
        this.l0 = awS382S0200000_16;
    }

    public static final void onClick$0(ACListenerS32S0100100_16 aCListenerS32S0100100_16, View view) {
        SocialConsentConfig socialConsentConfig;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        ((SocialConsentFragment) aCListenerS32S0100100_16.l0).NR(true);
        long jCurrentTimeMillis = System.currentTimeMillis() - aCListenerS32S0100100_16.j1;
        C1072510e13 c1072510e13 = C1072510e13.LIZ;
        SocialConsentConfig socialConsentConfig2 = ((SocialConsentFragment) aCListenerS32S0100100_16.l0).LLIZLLLIL;
        if (socialConsentConfig2 == null) {
            socialConsentConfig = null;
        } else {
            socialConsentConfig = socialConsentConfig2;
        }
        int i = socialConsentConfig.socialRecType;
        if (socialConsentConfig2 == null) {
            socialConsentConfig2 = null;
        }
        int i2 = socialConsentConfig2.step;
        c1072510e13.getClass();
        C1072510e13.LIZIZ(i, i2, jCurrentTimeMillis, "skip");
    }

    public static final void onClick$1(ACListenerS32S0100100_16 aCListenerS32S0100100_16, View view) {
        SocialConsentConfig socialConsentConfig;
        SocialConsentConfig socialConsentConfig2;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        SocialRecFlowModel socialRecFlowModelUR = ((SocialConsentFragment) aCListenerS32S0100100_16.l0).UR();
        if (socialRecFlowModelUR != null) {
            socialRecFlowModelUR.LLILLL = true;
        }
        view.getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C197039127h c197039127hPR = ((SocialConsentFragment) aCListenerS32S0100100_16.l0).PR();
                if (c197039127hPR != null && c197039127hPR.LLLII) {
                    return;
                }
                C197039127h c197039127hPR2 = ((SocialConsentFragment) aCListenerS32S0100100_16.l0).PR();
                if (c197039127hPR2 != null) {
                    c197039127hPR2.setLoading(true);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - aCListenerS32S0100100_16.j1;
                C1072510e13 c1072510e13 = C1072510e13.LIZ;
                SocialConsentConfig socialConsentConfig3 = ((SocialConsentFragment) aCListenerS32S0100100_16.l0).LLIZLLLIL;
                SocialConsentConfig socialConsentConfig4 = null;
                if (socialConsentConfig3 == null) {
                    socialConsentConfig = null;
                } else {
                    socialConsentConfig = socialConsentConfig3;
                }
                int i = socialConsentConfig.socialRecType;
                if (socialConsentConfig3 == null) {
                    socialConsentConfig3 = null;
                }
                int i2 = socialConsentConfig3.step;
                c1072510e13.getClass();
                C1072510e13.LIZIZ(i, i2, jCurrentTimeMillis, "sync");
                SocialConsentFragment socialConsentFragment = (SocialConsentFragment) aCListenerS32S0100100_16.l0;
                SocialConsentConfig socialConsentConfig5 = socialConsentFragment.LLIZLLLIL;
                if (socialConsentConfig5 == null) {
                    socialConsentConfig2 = null;
                } else {
                    socialConsentConfig2 = socialConsentConfig5;
                }
                int i3 = socialConsentConfig2.socialRecType;
                if (socialConsentConfig5 != null) {
                    socialConsentConfig4 = socialConsentConfig5;
                }
                socialConsentFragment.WR(i3, socialConsentConfig4.step);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
    }

    public static final void onClick$2(ACListenerS32S0100100_16 aCListenerS32S0100100_16, View view) {
        long j = aCListenerS32S0100100_16.j1;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - C1076910e89.LIZ >= j) {
            C1076910e89.LIZ = jUptimeMillis;
            ((Function1) aCListenerS32S0100100_16.l0).invoke(view);
        }
    }

    public static final void onClick$3(ACListenerS32S0100100_16 aCListenerS32S0100100_16, View view) {
        long j = aCListenerS32S0100100_16.j1;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - C1016960cZS.LIZ >= j) {
            C1016960cZS.LIZ = jUptimeMillis;
            ((Function1) aCListenerS32S0100100_16.l0).invoke(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.ACListenerS32S0100100_16) (LINE:50331651) Y.ACListenerS32S0100100_16.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.ACListenerS32S0100100_16) (LINE:50331653) Y.ACListenerS32S0100100_16.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.ACListenerS32S0100100_16, java.lang.Object] */
    public ACListenerS32S0100100_16(long j, long j2, Function1<? super View, Unit> function1) {
        long j3;
        Object obj;
        obj.$t = function1;
        obj.j1 = j3;
        obj.l0 = obj;
        ?? obj2 = new Object();
    }
}
