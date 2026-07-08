package X;

import Y.ARunnableS131S0100000_31;
import Y.AfS200S0100000_31;
import Y.AfS55S1100000_31;
import android.os.Looper;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLeftScoreChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchCoreScenariosMetricsSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleTaskMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleRewardSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskSettle;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskStart;
import com.bytedance.android.livesdk.model.message.battle.BattleTaskUpdate;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePromptElem;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTaskGiftAmountGuide;
import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import com.bytedance.android.livesdkapi.depend.model.live.match.RewardPeriodConfig;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15FV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15FV implements OnMessageListener {
    public final DataChannel LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public C15FU LLILZ;
    public IMessageManager LLILZIL;
    public C11JF LLILZLL;
    public Room LLIZ;
    public boolean LLIZLLLIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJJIJI;
    public long LLJJIJIL;
    public ImageModel LLJJJ;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public BattlePrompt LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public BattlePrompt LLJL;
    public long LLJLL;
    public BattlePrompt LLJLLL;
    public BattlePrompt LLJZ;
    public BattlePrompt LLJZIJLIL;
    public BattlePrompt LLL;
    public long LLLF;
    public long LLLFF;
    public String LLLIIII;
    public BattleTaskGiftAmountGuide LLLIIIIL;
    public long LLLIIIL;
    public int LLLIIL;
    public long LLLIILIL;
    public boolean LLLIL;
    public volatile boolean LLLILZJ;
    public long LLJ = -1;
    public C159M LLJI = C159M.DISABLED;
    public List<PreviewPeriod> LLJIJIL = new ArrayList();
    public long LLJILLL = -1;
    public long LLJJ = 30;
    public int LLJJI = 1;
    public long LLJJIII = 10;
    public EnumC993180bx6 LLJJIJIIJIL = EnumC993180bx6.DEFAULT;
    public String LLJJJIL = "";
    public long LLJLIL = -1;
    public long LLJLILLLLZIIL = 10;
    public final long LLJLLIL = 5;
    public final List<String> LLLFFI = new ArrayList();
    public final BPEAHandler LLLFZ = new BPEAHandler(Looper.getMainLooper());
    public String LLLI = "idle";
    public String LLLII = "config_init";
    public final C16HP LLLILZ = new C16HP(this, 1);

    public final void LJIIIIZZ() {
        this.LLILLJJLI = false;
        this.LLIZLLLIL = false;
        this.LLJ = -1L;
        this.LLJI = C159M.DISABLED;
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = 0L;
        this.LLJILJILJ = 0L;
        this.LLJILLL = -1L;
        this.LLJJ = 30L;
        this.LLJJI = 1;
        this.LLJJIII = 10L;
        this.LLJJIJI = 0L;
        this.LLJJIJIIJIL = EnumC993180bx6.DEFAULT;
        this.LLJJIJIL = 0L;
        this.LLJLIL = 0L;
        this.LLJLILLLLZIIL = 10L;
        this.LLLF = 0L;
        this.LLJLL = 0L;
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLFF = 0L;
        this.LLJJJJ = 0;
        this.LLJJJIL = "";
        this.LLJJJ = null;
        ((ArrayList) this.LLLFFI).clear();
        this.LLLFZ.removeCallbacksAndMessages(null);
        this.LLLIIIIL = null;
        this.LLLIIIL = 0L;
        this.LLLIIL = 0;
        this.LLLIILIL = 0L;
        this.LLLIL = false;
        this.LLLI = "idle";
        this.LLLII = "config_init";
        this.LLLIIII = null;
    }

    public final boolean LJFF() {
        int i = this.LLJJJJ;
        return i == 2 || i == 4;
    }

    public final boolean LJI() {
        return this.LLJJJJ == 22;
    }

    public final String LIZLLL() {
        return LJI() ? "match_start" : "match_mid";
    }

    public C15FV(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void LIZIZ(String str) {
        C11JF c11jf;
        if (this.LLLILZJ) {
            return;
        }
        C11JF c11jf2 = this.LLILZLL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLILZLL) != null) {
            c11jf.dispose();
        }
        this.LLLILZJ = true;
        C20441214yg.LIZIZ("BattleTask", "Critical point startToDealPoint ");
        this.LLILZLL = (C11JF) C19490011Na.LIZ(0L, 100L, TimeUnit.MILLISECONDS).LJLIIL(10L).LJJLL(new AfS55S1100000_31(this, str, 0), new AfS200S0100000_31(this, 18));
    }

    public final void LIZJ(long j) {
        long j2 = this.LLJILLL;
        long j3 = j2 + 1;
        if (j <= this.LLJILJIL && j3 <= j && j > this.LLJLL) {
            LIZ(j, C159M.TASK_NOTICE);
            return;
        }
        EnumC993180bx6 enumC993180bx6 = this.LLJJIJIIJIL;
        EnumC993180bx6 enumC993180bx62 = EnumC993180bx6.DEFAULT;
        if (enumC993180bx6 == enumC993180bx62 && j == this.LLJLIL + 1 && j > this.LLJLL) {
            LIZIZ("egg_task_complete");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("battle left time 1= ");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ));
            LIZ(j, C159M.TASK_IN_PROCESS);
            return;
        }
        if (enumC993180bx6 == enumC993180bx62 && j > this.LLJLIL && j <= j2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("battle left time 2= ");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ2));
            LIZ(j, C159M.TASK_IN_PROCESS);
            return;
        }
        EnumC993180bx6 enumC993180bx63 = EnumC993180bx6.FAILED;
        if (enumC993180bx6 == enumC993180bx63) {
            long j4 = this.LLJJIJIL;
            if (j4 > 0) {
                long j5 = this.LLJLIL;
                if (j5 > 0 && j < j2 && j >= j4 - 3 && j >= j5) {
                    LIZ(j, C159M.TASK_FAILED);
                    return;
                }
            }
        }
        if (enumC993180bx6 == enumC993180bx63) {
            long j6 = this.LLJJIJIL;
            if (j6 > 0) {
                long j7 = this.LLJLIL;
                if (j7 > 0 && (j < j6 - 3 || j < j7)) {
                    LIZ(j, C159M.DISABLED);
                    return;
                }
            }
        }
        EnumC993180bx6 enumC993180bx64 = EnumC993180bx6.SUCCEED;
        if ((enumC993180bx6 == enumC993180bx64 || enumC993180bx6 == EnumC993180bx6.BOTH_SUCCEED) && j < j2 && j > this.LLJLIL) {
            LIZ(j, C159M.TASK_SUCCEED);
            return;
        }
        if ((enumC993180bx6 == enumC993180bx64 || enumC993180bx6 == EnumC993180bx6.BOTH_SUCCEED) && j > this.LLJLL) {
            long j8 = this.LLJLIL;
            if (j <= j8 && j == (j8 - this.LLJLILLLLZIIL) + 1 && this.LLJI != C159M.BONUS_FINISHED) {
                LIZIZ("egg_reward_complete");
                LIZ(j, C159M.BONUS_IN_PROCESS);
                return;
            }
        }
        if ((enumC993180bx6 == enumC993180bx64 || enumC993180bx6 == EnumC993180bx6.BOTH_SUCCEED) && j > this.LLJLL) {
            long j9 = this.LLJLIL;
            if (j <= j9 && j >= j9 - this.LLJLILLLLZIIL) {
                LIZ(j, C159M.BONUS_IN_PROCESS);
                return;
            }
        }
        if ((enumC993180bx6 == enumC993180bx64 || enumC993180bx6 == EnumC993180bx6.BOTH_SUCCEED) && j <= this.LLJLIL - this.LLJLILLLLZIIL && LJI() && !this.LLILLL && this.LLJI == C159M.BONUS_IN_PROCESS) {
            this.LLLF = 1L;
            LIZ(j, C159M.BONUS_FINISHED);
            return;
        }
        EnumC993180bx6 enumC993180bx65 = this.LLJJIJIIJIL;
        if (enumC993180bx65 == enumC993180bx64 || enumC993180bx65 == EnumC993180bx6.BOTH_SUCCEED) {
            long j10 = this.LLJLL;
            if (j10 > 0 && this.LLJLIL > 0 && this.LLJLILLLLZIIL > 0 && j <= j10 - this.LLJLLIL) {
                LIZ(j, C159M.DISABLED);
                return;
            }
        }
        long j11 = this.LLJLL;
        if (j11 > 0 && j < j11 - this.LLJLLIL) {
            LIZ(j, C159M.DISABLED);
        } else {
            LIZ(j, this.LLJI);
        }
    }

    public final void LJII(BattlePrompt battlePrompt) {
        boolean z;
        long j;
        C978270bZ3 c978270bZ3;
        List<BattlePromptElem> list;
        if (battlePrompt == null) {
            return;
        }
        List<BattlePromptElem> list2 = battlePrompt.promptElements;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String str = null;
        if (!z && (list = battlePrompt.promptElements) != null) {
            for (BattlePromptElem battlePromptElem : list) {
                if (Intrinsics.LJFF("sum", battlePromptElem.promptFieldKey)) {
                    str = battlePromptElem.promptFieldValue;
                }
            }
        }
        DataChannel dataChannel = this.LL;
        long j2 = 0;
        if (dataChannel != null && (c978270bZ3 = (C978270bZ3) dataChannel.gg0(BattleLeftScoreChannel.class)) != null) {
            j = c978270bZ3.LIZ;
        } else {
            j = 0;
        }
        long j3 = j - this.LLLFF;
        if (j3 >= 0) {
            j2 = j3;
        }
        JSONObject jSONObject = C975320bUI.LIZ;
        boolean z2 = this.LLILLL;
        long j4 = this.LLJ;
        String strValueOf = String.valueOf(j2);
        String str2 = this.LLJJJIL;
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LJFF("client_reward", strValueOf, jSONObject2);
        C0K04.LJFF("server_reward", str, jSONObject2);
        C975320bUI.LJIIJJI(str2, j4, jSONObject2);
        if (z2) {
            C975320bUI.LJIILL("reward_settle", jSONObject2);
        }
    }

    public final void LJIIIZ(BattleBonusStatus battleBonusStatus) {
        C978270bZ3 c978270bZ3;
        EnumC993180bx6 enumC993180bx6;
        int i;
        if (!EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        this.LLIZLLLIL = battleBonusStatus.userAssisted;
        this.LLLII = "bonus_status";
        long j = 0;
        switch (battleBonusStatus.bonusPeriod) {
            case 0:
                LIZ(this.LLJ, C159M.DISABLED);
                return;
            case 1:
                this.LLJJIJIIJIL = EnumC993180bx6.DEFAULT;
                if (this.LLJI.compareTo(C159M.TASK_NOTICE) > 0) {
                    return;
                }
                LIZJ(this.LLJ);
                return;
            case 2:
                this.LLJJIJIIJIL = EnumC993180bx6.DEFAULT;
                if (this.LLJJI == 1) {
                    long j2 = battleBonusStatus.taskProgress;
                    if (j2 >= this.LLJJIJI) {
                        this.LLJJIJI = j2;
                        if (j2 < 0) {
                            JSONObject jSONObject = C975320bUI.LIZ;
                            boolean z = this.LLILLL;
                            long j3 = this.LLJ;
                            String str = this.LLJJJIL;
                            JSONObject jSONObject2 = new JSONObject();
                            C975320bUI.LJIIJJI(str, j3, jSONObject2);
                            if (z) {
                                C975320bUI.LJIILL("progress_para_error", jSONObject2);
                            } else {
                                C975320bUI.LJIILLIIL("progress_para_error", jSONObject2);
                            }
                        }
                    }
                }
                LIZ(this.LLJ, C159M.TASK_IN_PROCESS);
                C15FU c15fu = this.LLILZ;
                if (c15fu == null) {
                    return;
                }
                c15fu.LIZIZ();
                return;
            case 3:
                enumC993180bx6 = EnumC993180bx6.SUCCEED;
                break;
            case 4:
                enumC993180bx6 = EnumC993180bx6.BOTH_SUCCEED;
                break;
            case 5:
                EnumC993180bx6 enumC993180bx62 = this.LLJJIJIIJIL;
                EnumC993180bx6 enumC993180bx63 = EnumC993180bx6.FAILED;
                if (enumC993180bx62 == enumC993180bx63) {
                    return;
                }
                this.LLJJIJIIJIL = enumC993180bx63;
                if (this.LLJJIJIL <= 0) {
                    this.LLJJIJIL = this.LLJ;
                }
                LIZJ(this.LLJ);
                if (this.LLILLL && LJFF() && !this.LLLIL && this.LLLIIIL != 0) {
                    C973660bRc.LIZ.LJJJJLL(this.LLJJIII, this.LLJJIJI, this.LLLIILIL, false);
                    this.LLLIL = true;
                }
                JSONObject jSONObject3 = C975320bUI.LIZ;
                C975320bUI.LJIILIIL(this.LLJ, this.LLJJJIL, this.LLJJIJI, this.LLILLL, false);
                return;
            case 6:
                this.LLJJIJIIJIL = EnumC993180bx6.SUCCEED;
                long j4 = this.LLJJIII;
                if (j4 > 0) {
                    this.LLJJIJI = j4;
                }
                LIZ(this.LLJ, C159M.BONUS_IN_PROCESS);
                DataChannel dataChannel = this.LL;
                if (dataChannel != null && (c978270bZ3 = (C978270bZ3) dataChannel.gg0(BattleLeftScoreChannel.class)) != null) {
                    j = c978270bZ3.LIZ;
                }
                this.LLLFF = j;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("currentScore = ");
                sbLIZ.append(this.LLLFF);
                C20441214yg.LIZIZ("BattleTask", C2188811AlT.LIZIZ(sbLIZ));
                return;
            case 7:
                this.LLJJIJIIJIL = EnumC993180bx6.SUCCEED;
                this.LLL = battleBonusStatus.rewardSettlePrompt;
                long j5 = this.LLJ;
                if (j5 <= this.LLJLIL - this.LLJLILLLLZIIL && this.LLJLL == 0) {
                    this.LLJLL = j5;
                }
                if (this.LLJI != C159M.DISABLED) {
                    LIZ(j5, C159M.BONUS_FINISHED);
                }
                this.LLLFF = 0L;
                LJII(this.LLL);
                return;
            default:
                return;
        }
        this.LLJJIJIIJIL = enumC993180bx6;
        C159M c159m = this.LLJI;
        C159M c159m2 = C159M.TASK_SUCCEED;
        if (c159m.compareTo(c159m2) > 0) {
            return;
        }
        JSONObject jSONObject4 = C975320bUI.LIZ;
        boolean z2 = this.LLILLL;
        long j6 = this.LLJ;
        if (battleBonusStatus.bonusPeriod == 4) {
            i = 1;
        } else {
            i = 0;
        }
        C975320bUI.LJIILJJIL(i, j6, this.LLJJIJI, this.LLJJIII, this.LLJJJIL, z2, false);
        if (this.LLILLL && LJFF() && !this.LLLIL && this.LLLIIIL != 0) {
            C973660bRc.LIZ.LJJJJLL(this.LLJJIII, this.LLJJIJI, this.LLLIILIL, true);
            this.LLLIL = true;
        }
        this.LLJJIJI = this.LLJJIII;
        LIZ(this.LLJ, c159m2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) throws JSONException {
        String str;
        RewardPeriodConfig rewardPeriodConfig;
        BattleBonusConfig battleBonusConfig;
        BattleTaskUpdate battleTaskUpdate;
        long j;
        int i;
        List listLLIIII;
        List<C15FR> listLLIIII2;
        C159M c159m;
        long j2;
        long j3;
        if (iMessage == 0) {
            C20441214yg.LIZIZ("BattleTaskContainer", "message = null ");
            return;
        }
        if (this.LLILZ == null) {
            C20441214yg.LIZIZ("BattleTaskContainer", "iView = null ");
            return;
        }
        if (this.LLIZ == null) {
            C20441214yg.LIZIZ("BattleTaskContainer", "room = null ");
            return;
        }
        if (!EnableBattleEggSetting.INSTANCE.getValue()) {
            return;
        }
        if (iMessage instanceof BaseMessage) {
            CommonMessageData commonMessageData = ((BaseMessage) iMessage).baseMessage;
            if (commonMessageData != null) {
                j2 = commonMessageData.createTime;
            } else {
                j2 = 0;
            }
            long j4 = j2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            Room room = this.LLIZ;
            if (room != null) {
                j3 = room.nowTime;
            } else {
                j3 = 0;
            }
            if (j4 < j3) {
                C20441214yg.LIZIZ("BattleTaskContainer", "return message is old");
                return;
            }
        }
        if (iMessage instanceof LinkMicBattleTaskMessage) {
            LinkMicBattleTaskMessage linkMicBattleTaskMessage = (LinkMicBattleTaskMessage) iMessage;
            boolean z = this.LLILLL;
            JSONObject jSONObject = new JSONObject();
            C0K04.LJ("message_create_time", linkMicBattleTaskMessage.baseMessage.createTime, jSONObject);
            C0K04.LJ("message_fetch_time", linkMicBattleTaskMessage.timestamp, jSONObject);
            Gson gson = C19748512Ol.LIZIZ;
            C0K04.LJFF("message", GsonProtectorUtils.toJson(gson, linkMicBattleTaskMessage), jSONObject);
            C974480bSw c974480bSw = C974480bSw.LIZ;
            C974480bSw.LJIJ(jSONObject, false);
            if (z) {
                C974480bSw.LJJIII(c974480bSw, "battle_task_message", jSONObject, false, 60);
            } else {
                c974480bSw.LJJIIJ(0, "battle_task_message", jSONObject);
            }
            String json = GsonProtectorUtils.toJson(gson, linkMicBattleTaskMessage);
            C20441214yg.LIZIZ("BattleTaskContainer", "dealBattleTaskMessage");
            int i2 = linkMicBattleTaskMessage.battleTaskMessageType;
            BattlePrompt battlePrompt = null;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            this.LLLII = "reward_settle_message";
                            EnumC993180bx6 enumC993180bx6 = this.LLJJIJIIJIL;
                            EnumC993180bx6 enumC993180bx62 = EnumC993180bx6.SUCCEED;
                            if (enumC993180bx6 != enumC993180bx62 && enumC993180bx6 != EnumC993180bx6.BOTH_SUCCEED) {
                                this.LLJJIJIIJIL = enumC993180bx62;
                            }
                            BattleRewardSettle battleRewardSettle = linkMicBattleTaskMessage.rewardSettle;
                            if (battleRewardSettle != null) {
                                this.LLLFZ.removeCallbacksAndMessages(null);
                                this.LLL = battleRewardSettle.rewardSettlePrompt;
                                this.LLLF = battleRewardSettle.status;
                                long j5 = this.LLJ;
                                long j6 = this.LLJLIL - this.LLJLILLLLZIIL;
                                if (j5 <= j6) {
                                    if (this.LLJLL == 0 || LJI()) {
                                        this.LLJLL = this.LLJ;
                                    }
                                    C159M c159m2 = this.LLJI;
                                    if (c159m2 != C159M.DISABLED && c159m2 != (c159m = C159M.BONUS_FINISHED)) {
                                        LIZ(this.LLJ, c159m);
                                    }
                                } else {
                                    C786410Ut5.LJLIIL(j5 - j6, this.LLLFZ, new ARunnableS131S0100000_31(this, 117));
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("im_message_eggtask_reward_settle, left_time = ");
                                sbLIZ.append(this.LLJ);
                                sbLIZ.append(" , message = ");
                                sbLIZ.append(json);
                                C20441214yg.LJIIIZ("BattleTaskPresenterTag", C2188811AlT.LIZIZ(sbLIZ));
                            }
                            LJII(this.LLL);
                            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                            if (interfaceC973730bRjYf2 != null) {
                                interfaceC973730bRjYf2.LJJLIIIJLJLI(0);
                            }
                            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                            if (interfaceC973730bRjYf22 != null) {
                                interfaceC973730bRjYf22.LJJJJLL(0L);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.LLLII = "task_message_settle";
                    BattleTaskSettle battleTaskSettle = linkMicBattleTaskMessage.taskSettle;
                    if (battleTaskSettle == null) {
                        return;
                    }
                    int i3 = battleTaskSettle.taskResult;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                if (this.LLJJIJIIJIL == EnumC993180bx6.FAILED) {
                                    return;
                                }
                                this.LLJJIJIIJIL = EnumC993180bx6.BOTH_SUCCEED;
                                JSONObject jSONObject2 = C975320bUI.LIZ;
                                C975320bUI.LJIILJJIL(1, this.LLJ, this.LLJJIJI, this.LLJJIII, this.LLJJJIL, this.LLILLL, true);
                                this.LLJJIJI = this.LLJJIII;
                                long j7 = battleTaskSettle.rewardStartTime;
                                if (j7 > 0) {
                                    this.LLJLIL = j7 + 1;
                                }
                                LIZ(this.LLJ, C159M.TASK_SUCCEED);
                            }
                        } else {
                            EnumC993180bx6 enumC993180bx63 = this.LLJJIJIIJIL;
                            if (enumC993180bx63 == EnumC993180bx6.SUCCEED || enumC993180bx63 == EnumC993180bx6.BOTH_SUCCEED) {
                                return;
                            }
                            long j8 = this.LLJ;
                            this.LLJJIJIL = j8;
                            this.LLJJIJIIJIL = EnumC993180bx6.FAILED;
                            LIZ(j8, C159M.TASK_FAILED);
                            if (this.LLILLL && LJFF() && !this.LLLIL && this.LLLIIIL != 0) {
                                C973660bRc.LIZ.LJJJJLL(this.LLJJIII, this.LLJJIJI, this.LLLIILIL, false);
                                this.LLLIL = true;
                            }
                            JSONObject jSONObject3 = C975320bUI.LIZ;
                            C975320bUI.LJIILIIL(this.LLJ, this.LLJJJIL, this.LLJJIJI, this.LLILLL, true);
                        }
                    } else {
                        if (this.LLJJIJIIJIL == EnumC993180bx6.FAILED) {
                            return;
                        }
                        this.LLJJIJIIJIL = EnumC993180bx6.SUCCEED;
                        JSONObject jSONObject4 = C975320bUI.LIZ;
                        C975320bUI.LJIILJJIL(0, this.LLJ, this.LLJJIJI, this.LLJJIII, this.LLJJJIL, this.LLILLL, true);
                        if (this.LLILLL && LJFF() && !this.LLLIL && this.LLLIIIL != 0) {
                            C973660bRc.LIZ.LJJJJLL(this.LLJJIII, this.LLJJIJI, this.LLLIILIL, true);
                            this.LLLIL = true;
                        }
                        this.LLJJIJI = this.LLJJIII;
                        long j9 = battleTaskSettle.rewardStartTime;
                        if (j9 > 0) {
                            this.LLJLIL = j9 + 1;
                        }
                        LIZ(this.LLJ, C159M.TASK_SUCCEED);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("im_message_eggtask_task_settle, left_time = ");
                    sbLIZ2.append(this.LLJ);
                    sbLIZ2.append(" , message = ");
                    sbLIZ2.append(json);
                    C20441214yg.LJIIIZ("BattleTaskPresenterTag", C2188811AlT.LIZIZ(sbLIZ2));
                    if (!(!((ArrayList) this.LLLFFI).isEmpty()) || this.LLILLL) {
                        return;
                    }
                    JSONObject jSONObject5 = C975320bUI.LIZ;
                    long j10 = this.LLJ;
                    String strReplace = new Regex("\\s").replace(C13LP.LJJLIIIJ(this.LLLFFI, ",", null, null, 0, null, null, 62), "");
                    String str2 = this.LLJJJIL;
                    JSONObject jSONObject6 = new JSONObject();
                    C0K04.LJFF("log_id", strReplace, jSONObject6);
                    C975320bUI.LJIIJJI(str2, j10, jSONObject6);
                    C975320bUI.LJIILLIIL("progress_error", jSONObject6);
                    ((ArrayList) this.LLLFFI).clear();
                    return;
                }
                this.LLLII = "task_message_update";
                if (this.LLJJIJIIJIL != EnumC993180bx6.DEFAULT || (battleTaskUpdate = linkMicBattleTaskMessage.taskUpdate) == null) {
                    return;
                }
                long j11 = this.LLJJIJI;
                long j12 = battleTaskUpdate.taskProgress;
                if (j11 < j12) {
                    this.LLJJIJI = j12;
                }
                long j13 = this.LLJJIII;
                if (j13 > 0 && j12 == j13) {
                    LIZIZ("egg_task_countdown");
                }
                long j14 = this.LLJ;
                C159M c159m3 = C159M.TASK_IN_PROCESS;
                LIZ(j14, c159m3);
                C15FU c15fu = this.LLILZ;
                if (c15fu != null) {
                    c15fu.LIZIZ();
                }
                String str3 = battleTaskUpdate.logId;
                if (str3 != null && str3.length() != 0) {
                    String str4 = battleTaskUpdate.logId;
                    CommonMessageData commonMessageData2 = linkMicBattleTaskMessage.baseMessage;
                    if (commonMessageData2 != null) {
                        j = commonMessageData2.createTime;
                    } else {
                        j = 0;
                    }
                    if (!this.LLILLL && this.LLJI == c159m3 && (((i = this.LLJJJJ) == 1 || i == 2 || i == 3 || i == 4) && str4 != null && LiveMatchCoreScenariosMetricsSetting.INSTANCE.enableBonusTrack())) {
                        C974540bT2 c974540bT2 = C974540bT2.LIZ;
                        Map<String, List<C15FR>> map = C974540bT2.LJJIIJZLJL;
                        Iterable iterable = (Iterable) ((LinkedHashMap) map).get(str4);
                        if (iterable == null || (listLLIIII = C13LP.LLIIII(iterable)) == null) {
                            listLLIIII = C13BV.INSTANCE;
                        }
                        if (!listLLIIII.isEmpty()) {
                            this.LLLIIII = str4;
                            long jLIZ = C158B.LIZ();
                            List<C15FR> list = (List) ((LinkedHashMap) map).get(str4);
                            if (list != null) {
                                for (C15FR c15fr : list) {
                                    if (c15fr.LIZIZ == 0 && j > 0) {
                                        c15fr.LIZIZ = j;
                                    }
                                    if (c15fr.LIZJ == 0) {
                                        c15fr.LIZJ = jLIZ;
                                    }
                                }
                            }
                            C974540bT2 c974540bT22 = C974540bT2.LIZ;
                            Iterable iterable2 = (Iterable) ((LinkedHashMap) C974540bT2.LJJIIJZLJL).get(str4);
                            if (iterable2 == null || (listLLIIII2 = C13LP.LLIIII(iterable2)) == null) {
                                listLLIIII2 = C13BV.INSTANCE;
                            }
                            for (C15FR c15fr2 : listLLIIII2) {
                                JSONObject jSONObject7 = new JSONObject();
                                c15fr2.getClass();
                                C975320bUI.LJIIJ(jSONObject7, null, 0, 464);
                                jSONObject7.putOpt("distinct_key", C15FR.LIZ());
                                jSONObject7.putOpt("gift_id", 0L);
                                jSONObject7.putOpt("progress_before", 0L);
                                jSONObject7.putOpt("send_success_pk_remain_time", 0L);
                                jSONObject7.putOpt("send_success_task_progress_remain_time", 0L);
                                jSONObject7.putOpt("send_success_timestamp", 0L);
                                long j15 = c15fr2.LIZIZ;
                                if (j15 > 0) {
                                    jSONObject7.putOpt("receive_im_timestamp", Long.valueOf(j15));
                                }
                                long j16 = c15fr2.LIZJ - 0;
                                if (j16 < 0) {
                                    j16 = 0;
                                }
                                jSONObject7.putOpt("send_to_now_cost", Long.valueOf(j16));
                                C975320bUI.LJIIZILJ("bonus_progress_msg_receive", jSONObject7);
                            }
                        }
                    }
                    if (C13LP.LJJJJ(battleTaskUpdate.logId, this.LLLFFI)) {
                        C19719512Dh.LIZ(this.LLLFFI).remove(battleTaskUpdate.logId);
                    }
                }
                if (battleTaskUpdate.taskProgress < 0) {
                    JSONObject jSONObject8 = C975320bUI.LIZ;
                    boolean z2 = this.LLILLL;
                    long j17 = this.LLJ;
                    String str5 = this.LLJJJIL;
                    JSONObject jSONObject9 = new JSONObject();
                    C975320bUI.LJIIJJI(str5, j17, jSONObject9);
                    if (z2) {
                        C975320bUI.LJIILL("progress_para_error", jSONObject9);
                    } else {
                        C975320bUI.LJIILLIIL("progress_para_error", jSONObject9);
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("im_message_eggtask_update, left_time = ");
                sbLIZ3.append(this.LLJ);
                sbLIZ3.append(" , message = ");
                sbLIZ3.append(json);
                C20441214yg.LJIIIZ("BattleTaskPresenterTag", C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            this.LLLII = "task_message_start";
            this.LLJJIJIIJIL = EnumC993180bx6.DEFAULT;
            BattleTaskStart battleTaskStart = linkMicBattleTaskMessage.taskStart;
            if (battleTaskStart != null && (battleBonusConfig = battleTaskStart.battleBonusConfig) != null) {
                LJ(battleBonusConfig, "message");
            }
            if (LJI()) {
                this.LLJJIJIIJIL = EnumC993180bx6.SUCCEED;
                BattleBonusConfig battleBonusConfig2 = linkMicBattleTaskMessage.taskStart.battleBonusConfig;
                if (battleBonusConfig2 != null) {
                    str = battleBonusConfig2.previewClickActionSchemaUrl;
                } else {
                    str = null;
                }
                this.LLJJLIIIJLLLLLLLZ = str;
                if (battleBonusConfig2 != null && (rewardPeriodConfig = battleBonusConfig2.rewardPeriodConfig) != null) {
                    battlePrompt = rewardPeriodConfig.clickPrompt;
                }
                this.LLJL = battlePrompt;
            }
            this.LLJJIJI = 0L;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("im_message_eggtask_init, left_time = ");
            sbLIZ4.append(this.LLJ);
            sbLIZ4.append(" , message = ");
            sbLIZ4.append(json);
            C20441214yg.LJIIIZ("BattleTaskPresenterTag", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final void LIZ(long j, C159M c159m) {
        String str;
        boolean z;
        InterfaceC973730bRj interfaceC973730bRjYf2;
        if (!this.LLILLJJLI || j == -1) {
            return;
        }
        switch (C159O.LIZ[c159m.ordinal()]) {
            case 1:
                str = "task_preview";
                break;
            case 2:
                str = "task_in_process";
                break;
            case 3:
                str = "task_succeed";
                break;
            case 4:
                str = "task_failed";
                break;
            case 5:
                str = "bonus_in_process";
                break;
            case 6:
                str = "bonus_finished";
                break;
            default:
                str = "idle";
                break;
        }
        String str2 = this.LLLII;
        boolean z2 = true;
        if (str2.length() == 0) {
            str2 = "compare_state";
        }
        if (!Intrinsics.LJFF(this.LLLI, str)) {
            this.LLLI = str;
        }
        this.LLLII = str2;
        C159M c159m2 = this.LLJI;
        if (c159m2 != c159m) {
            if (c159m2.compareTo(c159m) < 0 || c159m == C159M.DISABLED) {
                this.LLJI = c159m;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("compareState==>> timeStamp = ");
                sbLIZ.append(j);
                sbLIZ.append(" currentSTate = ");
                sbLIZ.append(this.LLJI);
                C20441214yg.LIZIZ("BattleTask", C2188811AlT.LIZIZ(sbLIZ));
                C15FU c15fu = this.LLILZ;
                if (c15fu != null) {
                    c15fu.LIZJ(j, this.LLJI);
                }
                DataChannel dataChannel = this.LL;
                if (dataChannel != null) {
                    dataChannel.zW(BattleBonusTaskStateChannel.class, this.LLJI);
                }
            }
        } else if ((c159m2 == C159M.BONUS_IN_PROCESS || c159m2 == C159M.TASK_IN_PROCESS) && c159m2 != C159M.DISABLED) {
            C15FU c15fu2 = this.LLILZ;
            if (c15fu2 != null) {
                c15fu2.LIZJ(j, c159m2);
            }
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                dataChannel2.zW(BattleBonusTaskStateChannel.class, this.LLJI);
            }
        }
        C159M c159m3 = this.LLJI;
        C159M c159m4 = C159M.TASK_IN_PROCESS;
        if (c159m3.compareTo(c159m4) > 0 && (interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false)) != null) {
            interfaceC973730bRjYf2.LJJLIIIJJIZ(0L);
        }
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            if (this.LLJI == c159m4) {
                z = true;
            } else {
                z = false;
            }
            interfaceC973730bRjYf22.LJIL(z);
        }
        InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf23 != null) {
            if (this.LLJI != C159M.BONUS_IN_PROCESS) {
                z2 = false;
            }
            interfaceC973730bRjYf23.LJJJJL(z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15FV.LJ(com.bytedance.android.livesdkapi.depend.model.live.match.BattleBonusConfig, java.lang.String):void");
    }
}
