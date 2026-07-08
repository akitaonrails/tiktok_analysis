package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0yZ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862390yZ3 extends C2217421BqW implements Function2<Message, C1862520yZG, Unit> {
    public C1862390yZ3(C1862360yZ0 c1862360yZ0) {
        super(2, c1862360yZ0, C1862360yZ0.class, "onAskQuestionCompleteBackground", "onAskQuestionCompleteBackground(Lcom/ss/android/ugc/aweme/tako/ccl/model/api/Message;Lcom/ss/android/ugc/aweme/tako/base/internal/track/TakoMessageMobCommonParams;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Message message, C1862520yZG c1862520yZG) {
        String str;
        String str2;
        String str3;
        String str4;
        Long lValueOf;
        String str5;
        Integer numValueOf;
        String str6;
        String strLJ;
        String str7;
        String str8;
        String str9;
        String str10;
        Long lValueOf2;
        String str11;
        Integer numValueOf2;
        String str12;
        String strLJ2;
        List<BaseImage> list;
        List<BaseImage> list2;
        Message message2 = message;
        C1862520yZG c1862520yZG2 = c1862520yZG;
        this.receiver.getClass();
        String str13 = null;
        if (c1862520yZG2 != null) {
            str = c1862520yZG2.LIZJ;
        } else {
            str = null;
        }
        String str14 = "";
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0 || (str2 = (String) C1862700yZY.LIZ(C2097908Jt.LIZJ(new Pair("process_id", str))).get("tako_chat_id")) == null) {
            str2 = "";
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        if (c1862520yZG2 == null || (str3 = c1862520yZG2.LIZ) == null) {
            str3 = "";
        }
        if (c1862520yZG2 == null || (str4 = c1862520yZG2.LIZIZ) == null) {
            str4 = "";
        }
        if (c1862520yZG2 != null) {
            lValueOf = Long.valueOf(c1862520yZG2.LIZLLL);
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        String str15 = message2.subSessionId;
        String strValueOf2 = String.valueOf(message2.actionId);
        String str16 = message2.uuid;
        String str17 = message2.msgId;
        if (c1862520yZG2 == null || (str5 = c1862520yZG2.LJI) == null) {
            str5 = "";
        }
        if (c1862520yZG2 != null) {
            numValueOf = Integer.valueOf(c1862520yZG2.LJFF);
        } else {
            numValueOf = null;
        }
        String strValueOf3 = String.valueOf(numValueOf);
        if (c1862520yZG2 == null || (str6 = c1862520yZG2.LJ) == null) {
            str6 = "";
        }
        String strValueOf4 = String.valueOf(message2.msgType);
        TakoMixFeed takoMixFeedLJIIIZ = message2.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || (list2 = takoMixFeedLJIIIZ.images) == null || (strLJ = AnonymousClass1418.LJ(list2)) == null) {
            strLJ = "";
        }
        if (c1862520yZG2 != null) {
            str7 = c1862520yZG2.LJII;
        } else {
            str7 = null;
        }
        String strLIZIZ = C1855920yOc.LIZIZ(message2);
        String str18 = message2.subConversationId;
        if (str18 == null) {
            str18 = "";
        }
        C1862330yYx.LJIL(c1862330yYx, str3, str4, str, str15, strValueOf2, strValueOf, str16, str17, str5, strValueOf3, str6, strValueOf4, strLJ, str7, strLIZIZ, str18, str2);
        TakoMixFeed takoMixFeedLJIIIZ2 = message2.LJIIIZ();
        if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 1009) {
            TakoMixFeed takoMixFeedLJIIIZ3 = message2.LJIIIZ();
            if (takoMixFeedLJIIIZ3 != null) {
                str8 = takoMixFeedLJIIIZ3.text;
            } else {
                str8 = null;
            }
            if (C123100dR.LIZ(str8)) {
                if (c1862520yZG2 == null || (str9 = c1862520yZG2.LIZ) == null) {
                    str9 = "";
                }
                if (c1862520yZG2 == null || (str10 = c1862520yZG2.LIZIZ) == null) {
                    str10 = "";
                }
                if (c1862520yZG2 != null) {
                    lValueOf2 = Long.valueOf(c1862520yZG2.LIZLLL);
                } else {
                    lValueOf2 = null;
                }
                String strValueOf5 = String.valueOf(lValueOf2);
                String str19 = message2.subSessionId;
                String strValueOf6 = String.valueOf(message2.actionId);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(message2.uuid);
                sbLIZ.append("_text");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                String str20 = message2.msgId;
                if (c1862520yZG2 == null || (str11 = c1862520yZG2.LJI) == null) {
                    str11 = "";
                }
                if (c1862520yZG2 != null) {
                    numValueOf2 = Integer.valueOf(c1862520yZG2.LJFF);
                } else {
                    numValueOf2 = null;
                }
                String strValueOf7 = String.valueOf(numValueOf2);
                if (c1862520yZG2 == null || (str12 = c1862520yZG2.LJ) == null) {
                    str12 = "";
                }
                String strValueOf8 = String.valueOf(message2.msgType);
                TakoMixFeed takoMixFeedLJIIIZ4 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ4 == null || (list = takoMixFeedLJIIIZ4.images) == null || (strLJ2 = AnonymousClass1418.LJ(list)) == null) {
                    strLJ2 = "";
                }
                if (c1862520yZG2 != null) {
                    str13 = c1862520yZG2.LJII;
                }
                String strLIZIZ3 = C1855920yOc.LIZIZ(message2);
                String str21 = message2.subConversationId;
                if (str21 != null) {
                    str14 = str21;
                }
                C1862330yYx.LJIL(c1862330yYx, str9, str10, str, str19, strValueOf6, strValueOf5, strLIZIZ2, str20, str11, strValueOf7, str12, strValueOf8, strLJ2, str13, strLIZIZ3, str14, str2);
            }
        }
        return Unit.LIZ;
    }
}
