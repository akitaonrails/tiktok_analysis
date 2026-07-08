package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS75S0200000_6;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardBubbleInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardTaskData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.RewardCoinGeckoData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.rich.reward.api.GmtRewardClaimResult;
import com.ss.android.ugc.aweme.rich.reward.saas.gecko.RewardLottieAccessKeyProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Gqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428270Gqn implements InterfaceC1032410cyN {
    public C1216704pR LIZIZ;
    public C428230Gqj LIZJ;
    public String LIZLLL;
    public final Function0<Unit> LIZ = null;
    public final C428300Gqq LJ = new Object() { // from class: X.0Gqq
    };

    @Override // X.InterfaceC1032410cyN
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1032500cyW
    public final void onStop() {
        this.LIZJ = null;
    }

    public final AdRewardTaskData LJFF() {
        GMTBaseModel gMTBaseModel;
        AdRewardData adRewardData;
        C1216704pR c1216704pR = this.LIZIZ;
        if (c1216704pR == null || (gMTBaseModel = c1216704pR.LIZ) == null || (adRewardData = gMTBaseModel.adRewardData) == null) {
            return null;
        }
        return adRewardData.getTask();
    }

    public final String LJI() {
        GMTBaseModel gMTBaseModel;
        AdRewardData adRewardData;
        RewardCoinGeckoData coinGeckoData;
        C1216704pR c1216704pR;
        GMTBaseModel gMTBaseModel2;
        AdRewardData adRewardData2;
        RewardCoinGeckoData coinGeckoData2;
        String channel;
        String strLIZ;
        String strLIZLLL;
        String taskFinishLottieName;
        C1216704pR c1216704pR2 = this.LIZIZ;
        if (c1216704pR2 != null && (gMTBaseModel = c1216704pR2.LIZ) != null && (adRewardData = gMTBaseModel.adRewardData) != null && (coinGeckoData = adRewardData.getCoinGeckoData()) != null && (c1216704pR = this.LIZIZ) != null && (gMTBaseModel2 = c1216704pR.LIZ) != null && (adRewardData2 = gMTBaseModel2.adRewardData) != null && (coinGeckoData2 = adRewardData2.getCoinGeckoData()) != null && (channel = coinGeckoData2.getChannel()) != null && channel.length() > 0) {
            RewardLottieAccessKeyProvider rewardLottieAccessKeyProvider = (RewardLottieAccessKeyProvider) PluggableExtentionKt.pluggableSpi$default(RewardLottieAccessKeyProvider.class, false, false, false, 14, null);
            if (rewardLottieAccessKeyProvider == null || (strLIZ = rewardLottieAccessKeyProvider.LIZ()) == null) {
                strLIZ = "";
            }
            if (strLIZ.length() == 0 || channel.length() == 0 || (strLIZLLL = C1550600qSA.LIZLLL(strLIZ, null, true, channel)) == null || (taskFinishLottieName = coinGeckoData.getTaskFinishLottieName()) == null || taskFinishLottieName.length() <= 0) {
                return null;
            }
            getClass();
            C0VSJ c0vsj = new C0VSJ(strLIZLLL);
            if (!c0vsj.exists()) {
                return null;
            }
            C0VSJ c0vsj2 = new C0VSJ(new C0VSJ(c0vsj, "assets"), taskFinishLottieName);
            if (c0vsj2.exists()) {
                return c0vsj2.getAbsolutePath();
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1032500cyW
    public final void onComplete() {
        C428230Gqj c428230Gqj;
        C428230Gqj c428230Gqj2 = this.LIZJ;
        if (c428230Gqj2 != null) {
            HandlerHook.viewPostDelay(c428230Gqj2, new ARunnableS106S0100000_6(this, 192), 1000L);
        }
        if (LJI() == null || (c428230Gqj = this.LIZJ) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c428230Gqj, new ARunnableS106S0100000_6(this, 193), 1000L);
    }

    @Override // X.InterfaceC1032500cyW
    public final void onPause() {
        C428230Gqj c428230Gqj = this.LIZJ;
        if (c428230Gqj != null) {
            c428230Gqj.LLJJJ.pause();
            if (c428230Gqj.LLJJIJI) {
                c428230Gqj.LLJJ.pauseAnimation();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Gqq] */
    public C428270Gqn(int i) {
    }

    @Override // X.InterfaceC1032410cyN
    public final void LIZ(GmtRewardClaimResult gmtRewardClaimResult) {
        int showTime;
        boolean z;
        int iIntValue;
        AdRewardBubbleInfo bubbleInfo;
        AdRewardTaskData adRewardTaskDataLJFF = LJFF();
        if (adRewardTaskDataLJFF != null && (bubbleInfo = adRewardTaskDataLJFF.getBubbleInfo()) != null) {
            showTime = bubbleInfo.getShowTime();
        } else {
            showTime = 0;
        }
        Integer numValueOf = Integer.valueOf(showTime);
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 8;
        }
        long j = ((long) iIntValue) * 1000;
        C428230Gqj c428230Gqj = this.LIZJ;
        if (c428230Gqj != null) {
            String str = gmtRewardClaimResult.bubbleText;
            Function0<Unit> function0 = this.LIZ;
            if (str.length() > 0) {
                C2252321DDq c2252321DDq = c428230Gqj.LL;
                c2252321DDq.setValue(C428240Gqk.LIZ((C428240Gqk) c2252321DDq.getValue(), str, null, 2));
                if (c428230Gqj.LLILLL.getVisibility() == 0) {
                    HandlerHook.viewPost(c428230Gqj, new ARunnableS106S0100000_6((Object) c428230Gqj, 196));
                }
            }
            ARunnableS75S0200000_6 aRunnableS75S0200000_6 = c428230Gqj.LLJJIJIIJIL;
            if (aRunnableS75S0200000_6 != null) {
                HandlerHook.viewRemoveCallbacks(c428230Gqj, aRunnableS75S0200000_6);
            }
            c428230Gqj.LLJJIJIIJIL = new ARunnableS75S0200000_6((Object) c428230Gqj, (Object) function0, 92);
            HandlerHook.viewPostDelay(c428230Gqj, c428230Gqj.LLJJIJIIJIL, j);
            int iN3 = C786410Ut5.n3(c428230Gqj.getContext().getResources(), "icon_bitmap_coin_small", "raw", c428230Gqj.getContext().getPackageName());
            if (iN3 > 0) {
                C1389880mGw c1389880mGw = new C1389880mGw(c428230Gqj);
                c1389880mGw.LJIIIZ(str);
                c1389880mGw.LJ(iN3);
                c1389880mGw.LIZLLL(3000L);
                c1389880mGw.LJIIJ();
            }
        }
    }

    @Override // X.InterfaceC1032410cyN
    public final void LIZLLL(String str) {
        this.LIZLLL = str;
        C428230Gqj c428230Gqj = this.LIZJ;
        if (c428230Gqj != null) {
            c428230Gqj.setSecondRowText$tt_reward_ad_saas_impl_release(str);
        }
    }

    @Override // X.InterfaceC1032500cyW
    public final void LJ(long j, long j2) {
        C428230Gqj c428230Gqj;
        if (j2 > 0 && (c428230Gqj = this.LIZJ) != null) {
            C786410Ut5.LJZ(0, c428230Gqj.LLJILJIL);
            C0GTI c0gti = c428230Gqj.LLJILJILJ;
            int visibility = c0gti.getVisibility();
            c0gti.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0gti);
            c428230Gqj.LLJJJ.cancel();
            c428230Gqj.LLJJJ.setFloatValues(c428230Gqj.LLJILJILJ.getCurrentProgress(), j / j2);
            c428230Gqj.LLJJJ.start();
        }
    }

    @Override // X.InterfaceC1032410cyN
    public final AbstractC428280Gqo LIZJ(ViewGroup viewGroup, GMTBaseModel gMTBaseModel, Object obj) {
        AdRewardData adRewardData;
        AdRewardTaskData task;
        String countdownMsg;
        AdRewardBubbleInfo bubbleInfo;
        int coinRewardAmount;
        int duration;
        if (gMTBaseModel != null && (adRewardData = gMTBaseModel.adRewardData) != null && (task = adRewardData.getTask()) != null) {
            int duration2 = task.getDuration();
            if (duration2 <= 0) {
                return new C428290Gqp(EnumC429180GsG.TASK_DURATION_INVALID);
            }
            this.LIZIZ = new C1216704pR(gMTBaseModel, obj);
            C428230Gqj c428230Gqj = new C428230Gqj(viewGroup.getContext());
            this.LIZJ = c428230Gqj;
            AdRewardTaskData adRewardTaskDataLJFF = LJFF();
            String taskTimerImageUrl = null;
            if (adRewardTaskDataLJFF != null && (bubbleInfo = adRewardTaskDataLJFF.getBubbleInfo()) != null) {
                countdownMsg = bubbleInfo.getCountdownMsg();
                if (countdownMsg != null) {
                    AdRewardTaskData adRewardTaskDataLJFF2 = LJFF();
                    if (adRewardTaskDataLJFF2 != null) {
                        coinRewardAmount = adRewardTaskDataLJFF2.getCoinRewardAmount();
                    } else {
                        coinRewardAmount = 0;
                    }
                    AdRewardTaskData adRewardTaskDataLJFF3 = LJFF();
                    if (adRewardTaskDataLJFF3 != null) {
                        duration = adRewardTaskDataLJFF3.getDuration();
                    } else {
                        duration = 0;
                    }
                    countdownMsg = u.LJJIFFI(u.LJJIFFI(countdownMsg, "{number}", String.valueOf(coinRewardAmount), false), "{countDown}", String.valueOf(duration), false);
                }
            } else {
                countdownMsg = null;
            }
            C428230Gqj c428230Gqj2 = this.LIZJ;
            if (c428230Gqj2 != null) {
                c428230Gqj2.setBubbleTextTemplate$tt_reward_ad_saas_impl_release(countdownMsg);
            }
            C428230Gqj c428230Gqj3 = this.LIZJ;
            if (c428230Gqj3 != null) {
                c428230Gqj3.setSecondRowText$tt_reward_ad_saas_impl_release(this.LIZLLL);
            }
            C428230Gqj c428230Gqj4 = this.LIZJ;
            if (c428230Gqj4 != null) {
                AdRewardTaskData adRewardTaskDataLJFF4 = LJFF();
                if (adRewardTaskDataLJFF4 != null) {
                    taskTimerImageUrl = adRewardTaskDataLJFF4.getTaskTimerImageUrl();
                }
                c428230Gqj4.setTimerFallbackImage$tt_reward_ad_saas_impl_release(taskTimerImageUrl);
            }
            C428230Gqj c428230Gqj5 = this.LIZJ;
            if (c428230Gqj5 != null) {
                c428230Gqj5.setCenterLottie$tt_reward_ad_saas_impl_release(LJI());
            }
            HandlerHook.viewPost(c428230Gqj, new ARunnableS106S0100000_6((Object) c428230Gqj, 195));
            return new C428320Gqs(((long) duration2) * 1000, c428230Gqj);
        }
        return new C428290Gqp(EnumC429180GsG.TASK_EMPTY);
    }
}
