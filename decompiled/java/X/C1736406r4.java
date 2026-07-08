package X;

import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06r4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1736406r4 extends C2217421BqW implements Function1<InterfaceC904740ZeS, Unit> {
    public C1736406r4(BusinessChatLandingMsgVM businessChatLandingMsgVM) {
        super(1, businessChatLandingMsgVM, BusinessChatLandingMsgVM.class, "onMessageEvent", "onMessageEvent$im_business_chat_release(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/MessageEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC904740ZeS interfaceC904740ZeS) throws JSONException {
        String conversationId;
        C909290Zln c909290ZlnVQ2;
        String singleChatFromUserId;
        String extrasInfoMobParams;
        InterfaceC904740ZeS interfaceC904740ZeS2 = interfaceC904740ZeS;
        BusinessChatLandingMsgVM businessChatLandingMsgVM = (BusinessChatLandingMsgVM) this.receiver;
        businessChatLandingMsgVM.getClass();
        String extrasInfoMobParams2 = null;
        if (interfaceC904740ZeS2 instanceof C1509705vb) {
            C1745506sX c1745506sX = (C1745506sX) businessChatLandingMsgVM.LLILZLL.getValue();
            C1509705vb c1509705vb = (C1509705vb) interfaceC904740ZeS2;
            List<C869590Y9l> list = c1509705vb.LIZ;
            String strXQ2 = businessChatLandingMsgVM.xQ2();
            C909290Zln c909290ZlnVQ22 = businessChatLandingMsgVM.vQ2();
            if (c909290ZlnVQ22 != null) {
                extrasInfoMobParams2 = c909290ZlnVQ22.getExtrasInfoMobParams();
            }
            c1745506sX.LIZLLL(strXQ2, extrasInfoMobParams2, list);
            businessChatLandingMsgVM.CQ2((C869590Y9l) C13LP.LJJJLL(c1509705vb.LIZ), false);
        } else if (interfaceC904740ZeS2 instanceof C06S8) {
            for (C869590Y9l c869590Y9l : ((C06S8) interfaceC904740ZeS2).LIZIZ) {
                BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
                if (orParseJsonContent != null && orParseJsonContent.type == 709) {
                    C1745506sX c1745506sX2 = (C1745506sX) businessChatLandingMsgVM.LLILZLL.getValue();
                    List listSingletonList = Collections.singletonList(c869590Y9l);
                    String strXQ22 = businessChatLandingMsgVM.xQ2();
                    C909290Zln c909290ZlnVQ23 = businessChatLandingMsgVM.vQ2();
                    if (c909290ZlnVQ23 != null) {
                        extrasInfoMobParams = c909290ZlnVQ23.getExtrasInfoMobParams();
                    } else {
                        extrasInfoMobParams = null;
                    }
                    c1745506sX2.LIZLLL(strXQ22, extrasInfoMobParams, listSingletonList);
                }
            }
        } else if (interfaceC904740ZeS2 instanceof C06SA) {
            C06SA c06sa = (C06SA) interfaceC904740ZeS2;
            String conversationId2 = c06sa.LIZJ.getConversationId();
            C909290Zln c909290ZlnVQ24 = businessChatLandingMsgVM.vQ2();
            if (c909290ZlnVQ24 != null) {
                conversationId = c909290ZlnVQ24.getConversationId();
            } else {
                conversationId = null;
            }
            if (Intrinsics.LJFF(conversationId2, conversationId)) {
                int msgStatus = c06sa.LIZJ.getMsgStatus();
                if (msgStatus != 1) {
                    if (msgStatus == 2 && !businessChatLandingMsgVM.LLIZLLLIL && (c909290ZlnVQ2 = businessChatLandingMsgVM.vQ2()) != null && c909290ZlnVQ2.getEntranceType() == 8) {
                        JSONObject jSONObject = new JSONObject();
                        C909290Zln c909290ZlnVQ25 = businessChatLandingMsgVM.vQ2();
                        if (c909290ZlnVQ25 == null || (singleChatFromUserId = c909290ZlnVQ25.getSingleChatFromUserId()) == null) {
                            singleChatFromUserId = "";
                        }
                        jSONObject.put("to_uid", singleChatFromUserId);
                        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "pcs_did_send_dm_message"));
                        businessChatLandingMsgVM.LLIZLLLIL = true;
                    }
                } else {
                    businessChatLandingMsgVM.withState(new AwS211S0300000_2((InterfaceC1364105Vn) null, (InterfaceC1364105Vn<? super Unit>) businessChatLandingMsgVM, (BusinessChatLandingMsgVM) c06sa.LIZJ.getLocalExt(), (Map<String, String>) 26));
                }
                businessChatLandingMsgVM.CQ2(c06sa.LIZJ, true);
            }
        }
        return Unit.LIZ;
    }
}
