package Y;

import X.C09JN;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C501470JlZ;
import X.C512240K7a;
import com.bytedance.android.livesdk.gift.model.MinuteGameRespondInviteResponse;

/* JADX INFO: loaded from: classes18.dex */
public class AfS36S1000000_17 implements C09JN {
    public final int $t;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public AfS36S1000000_17(int i) {
        this.$t = i;
        this.s0 = "pm_mt_match_gift_option_gift_panel_banner";
    }

    public AfS36S1000000_17(String str, int i) {
        this.$t = i;
        if (2 - i != 0) {
            this.s0 = str;
        } else {
            this.s0 = str;
        }
    }

    public static final void accept$0(AfS36S1000000_17 afS36S1000000_17, Object obj) {
        String str = afS36S1000000_17.s0;
        C1C7U.LIZ("I18nCenterV2@f9b7.asyncGetTranslation$2L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error when fetch translation for key ");
        sbLIZ.append(str);
        sbLIZ.append(", err = ");
        sbLIZ.append(obj);
        C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("I18nCenterV2@f9b7.asyncGetTranslation$2L");
    }

    public static final void accept$1(AfS36S1000000_17 afS36S1000000_17, Object obj) {
        String str = afS36S1000000_17.s0;
        C1C7U.LIZ("I18nCenterV2@f9b7.asyncGetTranslation$4L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error when fetch translation for key ");
        sbLIZ.append(str);
        sbLIZ.append(", err = ");
        sbLIZ.append(obj);
        C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("I18nCenterV2@f9b7.asyncGetTranslation$4L");
    }

    public static final void accept$2(AfS36S1000000_17 afS36S1000000_17, Object obj) {
        String str = afS36S1000000_17.s0;
        C1C7U.LIZ("I18nCenterV2@f9b7.asyncGetTranslation$7L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error when fetch translation for key ");
        sbLIZ.append(str);
        sbLIZ.append(", err = ");
        sbLIZ.append(obj);
        C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("I18nCenterV2@f9b7.asyncGetTranslation$7L");
    }

    public static final void accept$3(AfS36S1000000_17 afS36S1000000_17, Object obj) {
        long j;
        MinuteGameRespondInviteResponse.Data data;
        C1C7U.LIZ("GameGiftQueueRender@457.rejectGame$1$1");
        MinuteGameRespondInviteResponse minuteGameRespondInviteResponse = (MinuteGameRespondInviteResponse) obj;
        if (minuteGameRespondInviteResponse != null && (data = minuteGameRespondInviteResponse.data) != null) {
            j = data.gameplayId;
        } else {
            j = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("respond_invite success: reject, gameplayId=");
        sbLIZ.append(j);
        sbLIZ.append(", source=");
        sbLIZ.append(afS36S1000000_17.s0);
        C20441214yg.LJIIIZ("gift_game__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("GameGiftQueueRender@457.rejectGame$1$1");
    }

    public static final void accept$4(AfS36S1000000_17 afS36S1000000_17, Object obj) {
        C501470JlZ c501470JlZ;
        C1C7U.LIZ("GameGiftQueueRender@457.rejectGame$1$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("respond_invite failed: , source=");
        sbLIZ.append(afS36S1000000_17.s0);
        sbLIZ.append(", error_code=");
        sbLIZ.append(C512240K7a.LIZ(th));
        sbLIZ.append(", message=");
        sbLIZ.append(C512240K7a.LIZIZ(th));
        sbLIZ.append(", log_id=");
        String logId = null;
        if ((th instanceof C501470JlZ) && (c501470JlZ = (C501470JlZ) th) != null) {
            logId = c501470JlZ.getLogId();
        }
        sbLIZ.append(logId);
        C20441214yg.LJ("gift_game__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("GameGiftQueueRender@457.rejectGame$1$2");
    }

    public static final void accept$5(AfS36S1000000_17 afS36S1000000_17, Object obj) {
        C1C7U.LIZ("CollaborateGiftingStateMachine@8efd.startCountdownTimer$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startCountdownTimer error: session=");
        sbLIZ.append(afS36S1000000_17.s0);
        C20441214yg.LJFF("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        C1C7U.LIZIZ("CollaborateGiftingStateMachine@8efd.startCountdownTimer$3");
    }
}
