package X;

import com.ss.android.ugc.aweme.im.message.template.card.GameChallengeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageTipComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1CoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241661CoW {
    public static final GameChallengeCardTemplate LIZ(C2241641CoU c2241641CoU, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM) {
        GameInfoComponent gameInfoComponent;
        boolean zBooleanValue;
        int i;
        EnumC2241721Coc enumC2241721Coc;
        boolean zBooleanValue2;
        GameParticipantScoreComponent gameParticipantScoreComponentLIZ;
        int iIntValue;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        BaseFooterComponent baseFooterComponentLIZ;
        String str = c2241641CoU.task_id;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = c2241641CoU.creator_uid;
        if (str3 == null) {
            str3 = "";
        }
        C2241671CoX c2241671CoX = c2241641CoU.game_info;
        if (c2241671CoX == null) {
            gameInfoComponent = new GameInfoComponent(null, null, null, null, null, null, 63);
        } else {
            C2244091CsR c2244091CsR = c2241671CoX.game_thumbnail;
            if (c2244091CsR == null) {
                String str4 = c2241671CoX.game_id;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = c2241671CoX.game_name;
                if (str5 == null) {
                    str5 = "";
                }
                EnumC19360610om enumC19360610omLIZIZ = C19360710on.LIZIZ(c2241671CoX.order);
                EnumC19360410ok enumC19360410okLIZ = C19360710on.LIZ(c2241671CoX.rank_type);
                String str6 = c2241671CoX.resource_id;
                if (str6 != null) {
                    str2 = str6;
                }
                gameInfoComponent = new GameInfoComponent(str4, str2, str5, null, enumC19360610omLIZIZ, enumC19360410okLIZ, 8);
            } else {
                String str7 = c2241671CoX.game_id;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = c2241671CoX.game_name;
                if (str8 == null) {
                    str8 = "";
                }
                ImageComponent imageComponentLIZJ = C2244081CsQ.LIZJ(c2244091CsR);
                EnumC19360610om enumC19360610omLIZIZ2 = C19360710on.LIZIZ(c2241671CoX.order);
                EnumC19360410ok enumC19360410okLIZ2 = C19360710on.LIZ(c2241671CoX.rank_type);
                String str9 = c2241671CoX.resource_id;
                if (str9 != null) {
                    str2 = str9;
                }
                gameInfoComponent = new GameInfoComponent(str7, str2, str8, imageComponentLIZJ, enumC19360610omLIZIZ2, enumC19360410okLIZ2);
            }
        }
        List<C1CNI> list = c2241641CoU.scores;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1CNI> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C21368418jq.LIZ(it2.next()));
        }
        Boolean bool = c2241641CoU.has_more_participants;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        EnumC2241711Cob enumC2241711Cob = c2241641CoU.status;
        if (enumC2241711Cob != null && (i = C2241701Coa.LIZIZ[enumC2241711Cob.ordinal()]) != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            enumC2241721Coc = EnumC2241721Coc.TASK_STATUS_UNSUPPORTED;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        enumC2241721Coc = EnumC2241721Coc.TASK_STATUS_EXPIRED;
                    }
                } else {
                    enumC2241721Coc = EnumC2241721Coc.TASK_STATUS_RECALL;
                }
            } else {
                enumC2241721Coc = EnumC2241721Coc.TASK_STATUS_IN_PROGRESS;
            }
        } else {
            enumC2241721Coc = EnumC2241721Coc.TASK_STATUS_UNKNOWN;
        }
        Boolean bool2 = c2241641CoU.hide_card;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = true;
        }
        InlineMessageTipComponent inlineMessageTipComponentLIZ = C2230181CQm.LIZ(c2241641CoU.tip);
        C1CNI c1cni = c2241641CoU.current_user_score;
        if (c1cni != null) {
            gameParticipantScoreComponentLIZ = C21368418jq.LIZ(c1cni);
        } else {
            gameParticipantScoreComponentLIZ = null;
        }
        Integer num = c2241641CoU.participant_count;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C2243941CsC c2243941CsC = c2241641CoU.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2241641CoU.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2241641CoU.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        if (c2242321Cpa != null) {
            baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
        } else {
            baseHeaderComponentLIZIZ = null;
        }
        if (c2242801CqM != null) {
            baseFooterComponentLIZ = C2242841CqQ.LIZ(c2242801CqM);
        } else {
            baseFooterComponentLIZ = null;
        }
        return new GameChallengeCardTemplate(str, str3, zBooleanValue2, iIntValue, gameInfoComponent, arrayList, zBooleanValue, gameParticipantScoreComponentLIZ, enumC2241721Coc, inlineMessageTipComponentLIZ, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, baseHeaderComponentLIZIZ, baseFooterComponentLIZ, 16385);
    }
}
