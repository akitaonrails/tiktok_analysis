package X;

import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor_data.FinishEncourageLiveAchievement;
import tikcast.api.anchor_data.FinishEncourageLiveJourney;
import tikcast.api.anchor_data.FinishEncourageTask;

/* JADX INFO: renamed from: X.16Hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749716Hn implements InterfaceC1143790fs1 {
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

    public static final void onFinish$0(C20749716Hn c20749716Hn, boolean z) {
        C1300730jx9 c1300730jx9;
        if (z) {
            ((EndIncentiveSettlementFragmentV2) c20749716Hn.l0).aS(true);
            final C1295960jpS c1295960jpS = (C1295960jpS) c20749716Hn.l1;
            final FinishEncourageLiveAchievement finishEncourageLiveAchievement = (FinishEncourageLiveAchievement) c20749716Hn.l2;
            ((C1295960jpS) c20749716Hn.l1).setTextDelegate(new C1295710jp3(c1295960jpS) { // from class: X.15Bk
                @Override // X.C1295710jp3
                public final String LIZIZ(String str, String str2) {
                    List<FinishEncourageTask> list;
                    FinishEncourageTask finishEncourageTask;
                    String string;
                    if (Intrinsics.LJFF(str2, "1000")) {
                        FinishEncourageLiveAchievement finishEncourageLiveAchievement2 = finishEncourageLiveAchievement;
                        if (finishEncourageLiveAchievement2 == null || (list = finishEncourageLiveAchievement2.taskList) == null || (finishEncourageTask = (FinishEncourageTask) C13LP.LJJJLZIJ(0, list)) == null || (string = Integer.valueOf((int) finishEncourageTask.progress).toString()) == null) {
                            return CardStruct.IStatusCode.DEFAULT;
                        }
                        return string;
                    }
                    return str2;
                }
            });
            try {
                C1295960jpS c1295960jpS2 = (C1295960jpS) c20749716Hn.l1;
                if (((EndIncentiveSettlementFragmentV2) c20749716Hn.l0).getContext() != null) {
                    c1300730jx9 = new C1300730jx9();
                } else {
                    c1300730jx9 = null;
                }
                c1295960jpS2.setFontAssetDelegate(c1300730jx9);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ((EndIncentiveSettlementFragmentV2) c20749716Hn.l0).ZR();
        }
    }

    public static final void onFinish$1(C20749716Hn c20749716Hn, boolean z) {
        if (z) {
            C500260Jjc.LLFFF((C1295960jpS) c20749716Hn.l0);
            ((C1295960jpS) c20749716Hn.l0).setProgress(0.0f);
            C20481815Cm c20481815Cm = (C20481815Cm) c20749716Hn.l1;
            C1295960jpS c1295960jpS = (C1295960jpS) c20749716Hn.l0;
            FinishEncourageLiveJourney finishEncourageLiveJourney = (FinishEncourageLiveJourney) c20749716Hn.l2;
            c20481815Cm.getClass();
            ((C1295960jpS) c20749716Hn.l0).setTextDelegate(C20481815Cm.LIZ(c1295960jpS, finishEncourageLiveJourney));
            ((C20481815Cm) c20749716Hn.l1).LJI.Ws((C1295960jpS) c20749716Hn.l0);
        }
    }

    public static final void onFinish$2(C20749716Hn c20749716Hn, boolean z) {
        if (z) {
            C20481815Cm c20481815Cm = (C20481815Cm) c20749716Hn.l0;
            C1295960jpS c1295960jpS = (C1295960jpS) c20749716Hn.l1;
            FinishEncourageLiveJourney finishEncourageLiveJourney = (FinishEncourageLiveJourney) c20749716Hn.l2;
            c20481815Cm.getClass();
            ((C1295960jpS) c20749716Hn.l1).setTextDelegate(C20481815Cm.LIZ(c1295960jpS, finishEncourageLiveJourney));
            ((C20481815Cm) c20749716Hn.l0).LJI.Ws((C1295960jpS) c20749716Hn.l1);
        }
    }

    public static final void onFinish$3(C20749716Hn c20749716Hn, boolean z) {
        if (z) {
            C20481815Cm c20481815Cm = (C20481815Cm) c20749716Hn.l0;
            C1295960jpS c1295960jpS = (C1295960jpS) c20749716Hn.l1;
            FinishEncourageLiveJourney finishEncourageLiveJourney = (FinishEncourageLiveJourney) c20749716Hn.l2;
            c20481815Cm.getClass();
            ((C1295960jpS) c20749716Hn.l1).setTextDelegate(C20481815Cm.LIZ(c1295960jpS, finishEncourageLiveJourney));
            ((C20481815Cm) c20749716Hn.l0).LJI.Ws((C1295960jpS) c20749716Hn.l1);
            C20481815Cm c20481815Cm2 = (C20481815Cm) c20749716Hn.l0;
            FinishEncourageLiveJourney finishEncourageLiveJourney2 = (FinishEncourageLiveJourney) c20749716Hn.l2;
            c20481815Cm2.getClass();
            if (C20481815Cm.LIZJ(finishEncourageLiveJourney2)) {
                C500260Jjc.LJIILIIL((C1295960jpS) c20749716Hn.l1);
                C1295960jpS c1295960jpS2 = ((C20481815Cm) c20749716Hn.l0).LIZJ;
                if (c1295960jpS2 != null) {
                    C500260Jjc.LLFFF(c1295960jpS2);
                }
            } else {
                C500260Jjc.LLFFF((C1295960jpS) c20749716Hn.l1);
                ((C1295960jpS) c20749716Hn.l1).playAnimation();
            }
            C20481615Ck c20481615Ck = (C20481615Ck) C13LP.LJJJLL(((C20481815Cm) c20749716Hn.l0).LJFF);
            if (c20481615Ck != null) {
                c20481615Ck.play();
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C20749716Hn(X.C1295960jpS r2, X.C20481815Cm r3, tikcast.api.anchor_data.FinishEncourageLiveJourney r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 1 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20749716Hn.<init>(X.0jpS, X.15Cm, tikcast.api.anchor_data.FinishEncourageLiveJourney, int):void");
    }

    public C20749716Hn(EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2, C1295960jpS c1295960jpS, FinishEncourageLiveAchievement finishEncourageLiveAchievement, int i) {
        this.$t = i;
        this.l0 = endIncentiveSettlementFragmentV2;
        this.l1 = c1295960jpS;
        this.l2 = finishEncourageLiveAchievement;
    }
}
