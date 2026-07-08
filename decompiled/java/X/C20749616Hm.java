package X;

import Y.AUListenerS278S0100000_31;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749616Hm implements InterfaceC1143790fs1 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 4:
                onFinish$4(this, z);
                break;
            case 5:
                onFinish$5(this, z);
                break;
            case 6:
                onFinish$6(this, z);
                break;
        }
    }

    public static final void onFinish$0(C20749616Hm c20749616Hm, boolean z) {
        C1836670xtZ c1836670xtZ;
        if (z) {
            final C1295960jpS c1295960jpS = (C1295960jpS) c20749616Hm.l0;
            final EndIncentiveSettlementFragment endIncentiveSettlementFragment = (EndIncentiveSettlementFragment) c20749616Hm.l1;
            ((C1295960jpS) c20749616Hm.l0).setTextDelegate(new C1295710jp3(c1295960jpS) { // from class: X.15CN
                @Override // X.C1295710jp3
                public final String LIZIZ(String str, String str2) {
                    AnchorFinishEncourageData anchorFinishEncourageData;
                    AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo;
                    AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo;
                    AnchorFinishEncourageData anchorFinishEncourageData2;
                    AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo2;
                    AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo2;
                    AnchorFinishEncourageData anchorFinishEncourageData3;
                    AnchorFinishEncourageData.LiveJourneyInfo liveJourneyInfo3;
                    AnchorFinishEncourageData.UpgradeLevelInfo upgradeLevelInfo3;
                    if (str2 != null) {
                        int iHashCode = str2.hashCode();
                        if (iHashCode != 53) {
                            if (iHashCode != 54) {
                                if (iHashCode == 79219422 && str2.equals("STAGE") && ((anchorFinishEncourageData3 = endIncentiveSettlementFragment.LLJJJIL) == null || (liveJourneyInfo3 = anchorFinishEncourageData3.liveJourneyInfo) == null || (upgradeLevelInfo3 = liveJourneyInfo3.upgradeLevelInfo) == null || (str2 = upgradeLevelInfo3.levelImageText) == null)) {
                                    return "STAGE";
                                }
                            } else if (str2.equals("6") && ((anchorFinishEncourageData2 = endIncentiveSettlementFragment.LLJJJIL) == null || (liveJourneyInfo2 = anchorFinishEncourageData2.liveJourneyInfo) == null || (upgradeLevelInfo2 = liveJourneyInfo2.upgradeLevelInfo) == null || (str2 = Long.valueOf(upgradeLevelInfo2.currentLevel).toString()) == null)) {
                                return CardStruct.IStatusCode.DEFAULT;
                            }
                        } else if (str2.equals("5") && ((anchorFinishEncourageData = endIncentiveSettlementFragment.LLJJJIL) == null || (liveJourneyInfo = anchorFinishEncourageData.liveJourneyInfo) == null || (upgradeLevelInfo = liveJourneyInfo.upgradeLevelInfo) == null || (str2 = Long.valueOf(upgradeLevelInfo.lastLevel).toString()) == null)) {
                            return CardStruct.IStatusCode.DEFAULT;
                        }
                    }
                    return str2;
                }
            });
            try {
                C1295960jpS c1295960jpS2 = (C1295960jpS) c20749616Hm.l0;
                if (((EndIncentiveSettlementFragment) c20749616Hm.l1).getContext() != null) {
                    c1836670xtZ = new C1836670xtZ();
                } else {
                    c1836670xtZ = null;
                }
                c1295960jpS2.setFontAssetDelegate(c1836670xtZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void onFinish$1(C20749616Hm c20749616Hm, boolean z) {
        if (z) {
            ((EndIncentiveSettlementFragmentV2) c20749616Hm.l0).ZR();
            ((C1295960jpS) c20749616Hm.l1).addAnimatorUpdateListener(new AUListenerS278S0100000_31((EndIncentiveSettlementFragmentV2) c20749616Hm.l0, 8));
        }
    }

    public static final void onFinish$2(C20749616Hm c20749616Hm, boolean z) {
        if (z) {
            EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) c20749616Hm.l0;
            C1295960jpS c1295960jpS = (C1295960jpS) c20749616Hm.l1;
            endIncentiveSettlementFragmentV2.getClass();
            c1295960jpS.setTextDelegate(new C15D0(c1295960jpS));
            endIncentiveSettlementFragmentV2.Ws(c1295960jpS);
            ((EndIncentiveSettlementFragmentV2) c20749616Hm.l0).ZR();
            ((EndIncentiveSettlementFragmentV2) c20749616Hm.l0).aS(true);
        }
    }

    public static final void onFinish$3(C20749616Hm c20749616Hm, boolean z) {
        if (z) {
            EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) c20749616Hm.l0;
            C1295960jpS c1295960jpS = (C1295960jpS) c20749616Hm.l1;
            endIncentiveSettlementFragmentV2.getClass();
            c1295960jpS.setTextDelegate(new C15D0(c1295960jpS));
            endIncentiveSettlementFragmentV2.Ws(c1295960jpS);
        }
    }

    public static final void onFinish$4(C20749616Hm c20749616Hm, boolean z) {
        if (z) {
            EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) c20749616Hm.l0;
            C1295960jpS c1295960jpS = (C1295960jpS) c20749616Hm.l1;
            endIncentiveSettlementFragmentV2.getClass();
            c1295960jpS.setTextDelegate(new C15D0(c1295960jpS));
            endIncentiveSettlementFragmentV2.Ws(c1295960jpS);
            ((EndIncentiveSettlementFragmentV2) c20749616Hm.l0).ZR();
        }
    }

    public static final void onFinish$5(C20749616Hm c20749616Hm, boolean z) {
        C1836670xtZ c1836670xtZ;
        if (z) {
            final C1295960jpS c1295960jpS = (C1295960jpS) c20749616Hm.l0;
            final EndIncentiveSettlementFragment endIncentiveSettlementFragment = (EndIncentiveSettlementFragment) c20749616Hm.l1;
            ((C1295960jpS) c20749616Hm.l0).setTextDelegate(new C1295710jp3(c1295960jpS) { // from class: X.15Bj
                @Override // X.C1295710jp3
                public final String LIZIZ(String str, String str2) {
                    Long lValueOf;
                    AnchorFinishEncourageData.AchievementInfo achievementInfo;
                    if (Intrinsics.LJFF(str2, "3500")) {
                        AnchorFinishEncourageData anchorFinishEncourageData = endIncentiveSettlementFragment.LLJJJIL;
                        if (anchorFinishEncourageData != null && (achievementInfo = anchorFinishEncourageData.achievementInfo) != null) {
                            lValueOf = Long.valueOf(achievementInfo.value);
                        } else {
                            lValueOf = null;
                        }
                        return String.valueOf(lValueOf);
                    }
                    return str2;
                }
            });
            try {
                C1295960jpS c1295960jpS2 = (C1295960jpS) c20749616Hm.l0;
                if (((EndIncentiveSettlementFragment) c20749616Hm.l1).getContext() != null) {
                    c1836670xtZ = new C1836670xtZ();
                } else {
                    c1836670xtZ = null;
                }
                c1295960jpS2.setFontAssetDelegate(c1836670xtZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            EndIncentiveSettlementFragment endIncentiveSettlementFragment2 = (EndIncentiveSettlementFragment) c20749616Hm.l1;
            endIncentiveSettlementFragment2.bS(endIncentiveSettlementFragment2.UR(), true);
        }
    }

    public static final void onFinish$6(C20749616Hm c20749616Hm, boolean z) {
        if (z) {
            EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2 = (EndIncentiveSettlementFragmentV2) c20749616Hm.l0;
            C1295960jpS c1295960jpS = (C1295960jpS) c20749616Hm.l1;
            endIncentiveSettlementFragmentV2.getClass();
            c1295960jpS.setTextDelegate(new C15D0(c1295960jpS));
            endIncentiveSettlementFragmentV2.Ws(c1295960jpS);
        }
    }

    public C20749616Hm(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
