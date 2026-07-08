package X;

import com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06sZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1745706sZ extends C2217421BqW implements Function1<InterfaceC904740ZeS, Unit> {
    public C1745706sZ(BusinessChatActionBarVM businessChatActionBarVM) {
        super(1, businessChatActionBarVM, BusinessChatActionBarVM.class, "onMessageEvent", "onMessageEvent$im_business_chat_release(Lcom/ss/android/ugc/aweme/im/messagelist/api/data/MessageEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC904740ZeS interfaceC904740ZeS) {
        List<C869590Y9l> list;
        String trafficTypeForMob;
        InterfaceC904740ZeS interfaceC904740ZeS2 = interfaceC904740ZeS;
        BusinessChatActionBarVM businessChatActionBarVM = (BusinessChatActionBarVM) this.receiver;
        businessChatActionBarVM.getClass();
        if (interfaceC904740ZeS2 instanceof C1746006sc) {
            list = ((C1746006sc) interfaceC904740ZeS2).LIZ;
        } else if (interfaceC904740ZeS2 instanceof C1509705vb) {
            list = ((C1509705vb) interfaceC904740ZeS2).LIZ;
        } else {
            list = C13BV.INSTANCE;
        }
        if (!list.isEmpty()) {
            C1745506sX c1745506sX = (C1745506sX) businessChatActionBarVM.LLILLL.getValue();
            SessionInfo sessionInfoXQ2 = businessChatActionBarVM.xQ2();
            String extrasInfoMobParams = null;
            if (sessionInfoXQ2 != null) {
                trafficTypeForMob = sessionInfoXQ2.getTrafficTypeForMob();
            } else {
                trafficTypeForMob = null;
            }
            SessionInfo sessionInfoXQ22 = businessChatActionBarVM.xQ2();
            if (sessionInfoXQ22 != null) {
                extrasInfoMobParams = sessionInfoXQ22.getExtrasInfoMobParams();
            }
            c1745506sX.getClass();
            for (C869590Y9l c869590Y9l : list) {
                if (Intrinsics.LJFF(c869590Y9l.getScene(), "ad_collect_form_card")) {
                    C1745306sV.LIZ(c1745506sX.LIZ, c1745506sX.LIZIZ, EnumC1745406sW.SUGGESTED_QN_ANS, C453750Hqn.LIZ(c869590Y9l), "advertiser", trafficTypeForMob, true, extrasInfoMobParams);
                }
            }
        }
        return Unit.LIZ;
    }
}
