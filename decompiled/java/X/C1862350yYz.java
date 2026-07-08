package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862350yYz extends C2217421BqW implements InterfaceC1631630sYr<Message, C1862520yZG, Integer, Extra, Unit> {
    public C1862350yYz(C1862360yZ0 c1862360yZ0) {
        super(4, c1862360yZ0, C1862360yZ0.class, "onReceiveMessageBackground", "onReceiveMessageBackground(Lcom/ss/android/ugc/aweme/tako/ccl/model/api/Message;Lcom/ss/android/ugc/aweme/tako/base/internal/track/TakoMessageMobCommonParams;ILcom/ss/android/ugc/aweme/tako/ccl/model/api/Extra;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Message message, C1862520yZG c1862520yZG, Integer num, Extra extra) throws JSONException {
        String str;
        String str2;
        String string;
        String strLIZIZ;
        String str3;
        String str4;
        Long lValueOf;
        String strLJIIIZ;
        int i;
        int i2;
        String strLIZ;
        Integer numValueOf;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer numValueOf2;
        String str10;
        String strLJ;
        int size;
        String str11;
        Integer num2;
        String str12;
        Integer num3;
        String str13;
        String str14;
        TakoPassExt takoPassExt;
        List<BaseImage> list;
        List<BaseImage> list2;
        TakoPassExt takoPassExt2;
        TakoPassExt takoPassExt3;
        TakoPassExt takoPassExt4;
        TakoPassExt takoPassExt5;
        TakoPassExt takoPassExt6;
        TakoPassExt takoPassExt7;
        Message message2 = message;
        C1862520yZG c1862520yZG2 = c1862520yZG;
        int iIntValue = num.intValue();
        Extra extra2 = extra;
        C1862360yZ0 c1862360yZ0 = (C1862360yZ0) this.receiver;
        c1862360yZ0.getClass();
        TakoMixFeed takoMixFeedLJIIIZ = message2.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || takoMixFeedLJIIIZ.cardType != 1005) {
            C1855910yOb.LIZ(message2, new C1862540yZI(c1862360yZ0));
            if (!C07IB.LIZ() && message2.isMultiAnswer) {
                c1862360yZ0.LIZ(message2, c1862520yZG2, iIntValue, extra2, message2.LJI(), 1);
                c1862360yZ0.LIZ(message2, c1862520yZG2, iIntValue, extra2, message2.LJII(), 2);
            } else {
                if (c1862520yZG2 != null) {
                    str = c1862520yZG2.LIZJ;
                } else {
                    str = null;
                }
                String str15 = "";
                if (str == null) {
                    str = "";
                }
                if (str.length() <= 0 || (str2 = (String) C1862700yZY.LIZ(C2097908Jt.LIZJ(new Pair("process_id", str))).get("tako_chat_id")) == null) {
                    str2 = "";
                }
                TakoMixFeed takoMixFeedLJIIIZ2 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ2 != null && (takoPassExt7 = takoMixFeedLJIIIZ2.ext) != null && takoPassExt7.isBigVideo == 1) {
                    string = "7";
                } else {
                    TakoMixFeed takoMixFeedLJIIIZ3 = message2.LJIIIZ();
                    if (takoMixFeedLJIIIZ3 == null || (string = Integer.valueOf(takoMixFeedLJIIIZ3.cardType).toString()) == null) {
                        string = "";
                    }
                }
                if (message2.ext.activeAiImageSubBar == 6001) {
                    strLIZIZ = "image_to_video";
                } else {
                    strLIZIZ = C1855920yOc.LIZIZ(message2);
                }
                String strLIZJ = C1855910yOb.LIZJ(strLIZIZ, message2);
                String strLIZIZ2 = C1855910yOb.LIZIZ(strLIZIZ, message2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                if (c1862520yZG2 == null || (str3 = c1862520yZG2.LIZ) == null) {
                    str3 = "";
                }
                if (c1862520yZG2 == null || (str4 = c1862520yZG2.LIZIZ) == null) {
                    str4 = "";
                }
                String str16 = message2.subSessionId;
                if (c1862520yZG2 != null) {
                    lValueOf = Long.valueOf(c1862520yZG2.LIZLLL);
                } else {
                    lValueOf = null;
                }
                String strValueOf = String.valueOf(lValueOf);
                long j = message2.actionId;
                String str17 = message2.replyUuid;
                String str18 = message2.uuid;
                TakoMixFeed takoMixFeedLJIIIZ4 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ4 == null || (strLJIIIZ = AnonymousClass1418.LJIIIZ(takoMixFeedLJIIIZ4)) == null) {
                    strLJIIIZ = "";
                }
                String strLIZIZ3 = C1858670yT3.LIZIZ(message2);
                TakoMixFeed takoMixFeedLJIIIZ5 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ5 != null && (takoPassExt6 = takoMixFeedLJIIIZ5.ext) != null) {
                    i = takoPassExt6.isQuoteVideo;
                } else {
                    i = 0;
                }
                TakoMixFeed takoMixFeedLJIIIZ6 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ6 != null && (takoPassExt5 = takoMixFeedLJIIIZ6.ext) != null) {
                    i2 = takoPassExt5.isQuoteProduct;
                } else {
                    i2 = 0;
                }
                TakoMixFeed takoMixFeedLJIIIZ7 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ7 == null || (takoPassExt4 = takoMixFeedLJIIIZ7.ext) == null || (strLIZ = takoPassExt4.idList) == null) {
                    strLIZ = C12824050c.LIZ();
                }
                if (c1862520yZG2 != null) {
                    numValueOf = Integer.valueOf(c1862520yZG2.LJFF);
                } else {
                    numValueOf = null;
                }
                String strValueOf2 = String.valueOf(numValueOf);
                long j2 = message2.serverSeq;
                TakoMixFeed takoMixFeedLJIIIZ8 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ8 == null || (takoPassExt3 = takoMixFeedLJIIIZ8.ext) == null || (str5 = takoPassExt3.autoSendMessageType) == null) {
                    str5 = "";
                }
                if (c1862520yZG2 == null || (str6 = c1862520yZG2.LJI) == null) {
                    str6 = "";
                }
                if (c1862520yZG2 == null || (str7 = c1862520yZG2.LJ) == null) {
                    str7 = "";
                }
                TakoMixFeed takoMixFeedLJIIIZ9 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ9 != null && (takoPassExt2 = takoMixFeedLJIIIZ9.ext) != null) {
                    str8 = takoPassExt2.pluginType;
                } else {
                    str8 = null;
                }
                String str19 = message2.msgId;
                if (c1862520yZG2 == null || (str9 = c1862520yZG2.LJII) == null) {
                    str9 = "";
                }
                TakoMixFeed takoMixFeedLJIIIZ10 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ10 != null) {
                    numValueOf2 = Integer.valueOf(takoMixFeedLJIIIZ10.cardType);
                } else {
                    numValueOf2 = null;
                }
                String strLIZIZ4 = C0R2X.LIZIZ(numValueOf2);
                boolean z = message2.LJIIZILJ.LIZIZ;
                if (extra2 != null) {
                    Integer num4 = extra2.novelChapterIdx;
                    if (num4 != null) {
                        linkedHashMap.put("novel_chapter_idx", String.valueOf(num4.intValue()));
                    }
                    String str20 = extra2.novelNodeId;
                    if (str20 != null && str20.length() > 0) {
                        linkedHashMap.put("novel_node_id", str20);
                    }
                }
                linkedHashMap.put("ratio", String.valueOf(message2.ext.aigcStandardRatio));
                String str21 = message2.ext.inputSkillMode;
                if (str21 == null || str21.length() <= 0) {
                    str21 = "default";
                }
                linkedHashMap.put("skill_mode", str21);
                MessageExt messageExt = message2.ext;
                String str22 = messageExt.imageTemplateId;
                String str23 = messageExt.imageTabId;
                String str24 = messageExt.imageTemplateTab;
                String str25 = messageExt.imageStyleName;
                TakoMixFeed takoMixFeedLJIIIZ11 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ11 == null || (str10 = takoMixFeedLJIIIZ11.thinkContent) == null) {
                    str10 = "";
                }
                TakoMixFeed takoMixFeedLJIIIZ12 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ12 == null || (list2 = takoMixFeedLJIIIZ12.images) == null || (strLJ = AnonymousClass1418.LJ(list2)) == null) {
                    strLJ = "";
                }
                TakoMixFeed takoMixFeedLJIIIZ13 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ13 != null && (list = takoMixFeedLJIIIZ13.images) != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                String str26 = message2.subConversationId;
                if (str26 != null) {
                    str15 = str26;
                }
                TakoMixFeed takoMixFeedLJIIIZ14 = message2.LJIIIZ();
                if (takoMixFeedLJIIIZ14 != null && (takoPassExt = takoMixFeedLJIIIZ14.ext) != null) {
                    str11 = takoPassExt.inlineContent;
                } else {
                    str11 = null;
                }
                int iLIZ = C1859070yTh.LIZ(message2.LJIIIZ());
                int iLIZIZ = C1859070yTh.LIZIZ(message2.LJIIIZ());
                if (c1862520yZG2 != null) {
                    num2 = c1862520yZG2.LJIIIIZZ;
                    str12 = c1862520yZG2.LJIIIZ;
                    num3 = c1862520yZG2.LJIIJ;
                    str13 = c1862520yZG2.LJIIJJI;
                    str14 = c1862520yZG2.LJIIL;
                } else {
                    num2 = null;
                    str12 = null;
                    num3 = null;
                    str13 = null;
                    str14 = null;
                }
                String strLIZLLL = C1855920yOc.LIZLLL(message2);
                if (strLIZLLL.length() <= 0) {
                    strLIZLLL = null;
                }
                C1862330yYx.LJIJJ(c1862330yYx, str3, str4, str, strValueOf, str18, strLJIIIZ, strLIZ, i, i2, strLIZIZ3, string, strValueOf2, str6, str19, str17, str7, iIntValue, str8, str5, Long.valueOf(j2), str16, str9, j, strLIZIZ4, Integer.valueOf(z ? 1 : 0), linkedHashMap, strLIZIZ, strLIZJ, str22, str23, str24, str25, str10, strLJ, Integer.valueOf(size), strLIZIZ2, "default", null, null, str11, str15, str2, Integer.valueOf(iLIZ), Integer.valueOf(iLIZIZ), num2, str12, num3, str13, str14, strLIZLLL, 1053060);
            }
        }
        return Unit.LIZ;
    }
}
