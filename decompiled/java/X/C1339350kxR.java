package X;

import Y.ARunnableS53S0300000_20;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tikcast.api.anchor_data.FinishEncourageDecoupling;
import tikcast.api.anchor_data.FinishEncourageRanking;
import tikcast.api.anchor_data.FinishEncourageUserInfo;

/* JADX INFO: renamed from: X.0kxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339350kxR implements InterfaceC1143790fs1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1143790fs1
    public final void onFinish(boolean z) {
        switch (this.$t) {
            case 0:
                onFinish$0(this, z);
                break;
            case 1:
                onFinish$1(this, z);
                break;
            case 2:
                onFinish$2(this, z);
                break;
            case 3:
                onFinish$3(this, z);
                break;
        }
    }

    public static final void onFinish$0(C1339350kxR c1339350kxR, boolean z) {
        if (z) {
            ARunnableS53S0300000_20 aRunnableS53S0300000_20 = new ARunnableS53S0300000_20((EndIncentiveSettlementFragmentV2) c1339350kxR.l1, (C1295960jpS) c1339350kxR.l0, (FinishEncourageDecoupling) c1339350kxR.l2, 40);
            HandlerHook.viewPost((C1295960jpS) c1339350kxR.l0, aRunnableS53S0300000_20);
            ((ArrayList) ((EndIncentiveSettlementFragmentV2) c1339350kxR.l1).LLLF).add(new Pair((C1295960jpS) c1339350kxR.l0, aRunnableS53S0300000_20));
        }
    }

    public static final void onFinish$1(C1339350kxR c1339350kxR, boolean z) {
        int i;
        final String str;
        FinishEncourageUserInfo finishEncourageUserInfo;
        if (!z) {
            C20441214yg.LJ("EndIncentiveSettlementFragmentV2", "Lottie file load failed: ttlive_finish_encourage_ranking.zip");
            return;
        }
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) c1339350kxR.l0;
        final C1295960jpS c1295960jpS = (C1295960jpS) c1339350kxR.l1;
        FinishEncourageRanking finishEncourageRanking = (FinishEncourageRanking) c1339350kxR.l2;
        endIncentiveSettlementFragmentV2.getClass();
        int i2 = 0;
        if (finishEncourageRanking != null) {
            i = finishEncourageRanking.rank;
        } else {
            i = 0;
        }
        final String strValueOf = String.valueOf(i);
        C1300730jx9 c1300730jx9 = null;
        if (finishEncourageRanking == null || (finishEncourageUserInfo = finishEncourageRanking.userInfo) == null || (str = finishEncourageUserInfo.userNickName) == null) {
            str = "";
        }
        if (a0.LJJJIL(str)) {
            str = "—";
        }
        if (finishEncourageRanking != null) {
            i2 = finishEncourageRanking.score;
        }
        final String strValueOf2 = String.valueOf(i2);
        ((C1295960jpS) c1339350kxR.l1).setTextDelegate(new C1295710jp3(c1295960jpS) { // from class: X.0jwv
            @Override // X.C1295710jp3
            public final String LIZIZ(String str2, String str3) {
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -201069322) {
                        if (iHashCode != 78683) {
                            if (iHashCode == 273881932 && str2.equals("Final Ranking")) {
                                return strValueOf;
                            }
                            return str3;
                        }
                        if (!str2.equals("Nub")) {
                            return str3;
                        }
                        return strValueOf2;
                    }
                    if (!str2.equals("Username")) {
                        return str3;
                    }
                    return str;
                }
                return str3;
            }
        });
        try {
            C1295960jpS c1295960jpS2 = (C1295960jpS) c1339350kxR.l1;
            if (((EndIncentiveSettlementFragmentV2) c1339350kxR.l0).getContext() != null) {
                c1300730jx9 = new C1300730jx9();
            }
            c1295960jpS2.setFontAssetDelegate(c1300730jx9);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("EndIncentiveSettlementFragmentV2", "setFontAssetDelegate error", e);
        }
        final C1295960jpS c1295960jpS3 = (C1295960jpS) c1339350kxR.l1;
        final EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV22 = (EndIncentiveSettlementFragmentV2) c1339350kxR.l0;
        final FinishEncourageRanking finishEncourageRanking2 = (FinishEncourageRanking) c1339350kxR.l2;
        c1295960jpS3.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0jwt
            @Override // X.InterfaceC1296230jpt
            public final void LIZ(C1294720jnS c1294720jnS) {
                ARunnableS53S0300000_20 aRunnableS53S0300000_20 = new ARunnableS53S0300000_20(endIncentiveSettlementFragmentV22, c1295960jpS3, finishEncourageRanking2, 41);
                HandlerHook.viewPost(c1295960jpS3, aRunnableS53S0300000_20);
                ((ArrayList) endIncentiveSettlementFragmentV22.LLLF).add(new Pair(c1295960jpS3, aRunnableS53S0300000_20));
            }
        });
    }

    public static final void onFinish$2(C1339350kxR c1339350kxR, boolean z) {
        if (z) {
            EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) c1339350kxR.l0;
            final C1295960jpS c1295960jpS = (C1295960jpS) c1339350kxR.l1;
            final FinishEncourageDecoupling finishEncourageDecoupling = (FinishEncourageDecoupling) c1339350kxR.l2;
            endIncentiveSettlementFragmentV2.getClass();
            c1295960jpS.setTextDelegate(new C1295710jp3(c1295960jpS) { // from class: X.0jx0
                @Override // X.C1295710jp3
                public final String LIZIZ(String str, String str2) {
                    long j;
                    if (Intrinsics.LJFF(str, "Diamonds count")) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[1];
                        FinishEncourageDecoupling finishEncourageDecoupling2 = finishEncourageDecoupling;
                        if (finishEncourageDecoupling2 != null) {
                            j = finishEncourageDecoupling2.diamonds;
                        } else {
                            j = 0;
                        }
                        objArr[0] = Long.valueOf(j);
                        return C786410Ut5.k4(locale, "× %d", Arrays.copyOf(objArr, 1));
                    }
                    return str2;
                }
            });
            endIncentiveSettlementFragmentV2.Ws(c1295960jpS);
            ((EndIncentiveSettlementFragmentV2) c1339350kxR.l0).ZR();
        }
    }

    public static final void onFinish$3(C1339350kxR c1339350kxR, boolean z) {
        if (z) {
            ARunnableS53S0300000_20 aRunnableS53S0300000_20 = new ARunnableS53S0300000_20((EndIncentiveSettlementFragmentV2) c1339350kxR.l1, (C1295960jpS) c1339350kxR.l0, (FinishEncourageDecoupling) c1339350kxR.l2, 42);
            HandlerHook.viewPost((C1295960jpS) c1339350kxR.l0, aRunnableS53S0300000_20);
            ((ArrayList) ((EndIncentiveSettlementFragmentV2) c1339350kxR.l1).LLLF).add(new Pair((C1295960jpS) c1339350kxR.l0, aRunnableS53S0300000_20));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1339350kxR(X.C1295960jpS r2, com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2 r3, tikcast.api.anchor_data.FinishEncourageDecoupling r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1339350kxR.<init>(X.0jpS, com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2, tikcast.api.anchor_data.FinishEncourageDecoupling, int):void");
    }

    public C1339350kxR(C1295960jpS c1295960jpS, EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2, FinishEncourageRanking finishEncourageRanking, int i) {
        this.$t = i;
        this.l0 = endIncentiveSettlementFragmentV2;
        this.l1 = c1295960jpS;
        this.l2 = finishEncourageRanking;
    }
}
