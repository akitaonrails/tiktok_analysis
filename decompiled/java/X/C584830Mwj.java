package X;

import Y.ARunnableS78S0200000_9;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584830Mwj {
    public volatile ARunnableS78S0200000_9 LIZ;
    public volatile String LIZIZ;

    public final void LIZJ() {
        try {
            if (!C300370Bpz.LIZ()) {
                return;
            }
            ARunnableS78S0200000_9 aRunnableS78S0200000_9 = this.LIZ;
            if (aRunnableS78S0200000_9 != null) {
                C0CAU.LIZ.removeCallbacks(aRunnableS78S0200000_9);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoReplayMobComponent Exception: ");
            sbLIZ.append(e.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ = null;
        this.LIZIZ = null;
    }

    public final void LIZ(Aweme aweme, String str, String str2, Fragment fragment, Function1<? super C2344009Gk, Unit> function1) {
        String aid;
        String strLJIIJ;
        Integer numValueOf;
        String requestId;
        String strLIZIZ;
        String requestId2;
        String aid2;
        try {
            if (C300370Bpz.LIZ()) {
                if (aweme != null && (C582980Mtk.LIZIZ(aweme) || C729510SjV.LJJJIL(aweme))) {
                    return;
                }
                long jIntValue = ((Number) C300370Bpz.LIZ.getValue()).intValue();
                ARunnableS78S0200000_9 aRunnableS78S0200000_9 = this.LIZ;
                String aid3 = null;
                if (aRunnableS78S0200000_9 != null) {
                    C0CAU.LIZ.removeCallbacks(aRunnableS78S0200000_9);
                    String str3 = this.LIZIZ;
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    } else {
                        aid2 = null;
                    }
                    if (Intrinsics.LJFF(str3, aid2)) {
                        aRunnableS78S0200000_9.run();
                    }
                    this.LIZ = null;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("enter_from", str);
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                c2344009Gk.LJFF("group_id", aid);
                if (aweme != null) {
                    strLJIIJ = AbstractC1386130mAt.LJIIJ(aweme);
                } else {
                    strLJIIJ = null;
                }
                c2344009Gk.LJFF("author_id", strLJIIJ);
                if (aweme != null) {
                    numValueOf = Integer.valueOf(aweme.getAwemeType());
                } else {
                    numValueOf = null;
                }
                c2344009Gk.LJ(numValueOf, "aweme_type");
                if (C735370Ssx.LJJIJL(str)) {
                    C611410NyV c611410NyV = C584850Mwl.LIZ;
                    if (aweme != null) {
                        requestId2 = aweme.getRequestId();
                    } else {
                        requestId2 = null;
                    }
                    c2344009Gk.LJFF("log_pb", c611410NyV.LIZIZ(C584840Mwk.LIZ(requestId2, str2)));
                }
                if (aweme != null) {
                    requestId = aweme.getRequestId();
                } else {
                    requestId = null;
                }
                c2344009Gk.LJFF("request_id", requestId);
                if (fragment != null && (strLIZIZ = C1389300mG0.LIZIZ(fragment)) != null) {
                    C1599640rjG.LIZIZ.Ou(c2344009Gk, new C1360330lVH(strLIZIZ, null, null, null, 14));
                } else if (function1 != null) {
                    function1.invoke(c2344009Gk);
                }
                this.LIZ = new ARunnableS78S0200000_9(c2344009Gk.LIZ, this, 48);
                if (aweme != null) {
                    aid3 = aweme.getAid();
                }
                this.LIZIZ = aid3;
                if (jIntValue == 0) {
                    ARunnableS78S0200000_9 aRunnableS78S0200000_92 = this.LIZ;
                    if (aRunnableS78S0200000_92 != null) {
                        aRunnableS78S0200000_92.run();
                        return;
                    }
                    return;
                }
                ARunnableS78S0200000_9 aRunnableS78S0200000_93 = this.LIZ;
                if (aRunnableS78S0200000_93 != null) {
                    C786410Ut5.LJLIIL(jIntValue, C0CAU.LIZ, aRunnableS78S0200000_93);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoReplayMobComponent Exception: ");
            sbLIZ.append(e.getMessage());
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
