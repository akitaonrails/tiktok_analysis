package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.service.analytics.IIMCategoryAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YoE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMChatListAnalytics$trackStrangerChatNew$1", f = "IMChatListAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C885320YoE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC885530YoZ LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ InterfaceC1493105sv LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885320YoE(int i, AbstractC885530YoZ abstractC885530YoZ, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC885530YoZ;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = interfaceC1493105sv;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885320YoE(this.LLILZ, this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y8T c0y8t;
        Object obj2;
        IMUser iMUser;
        C886420Yq0 c886420Yq0;
        C878960Ydy c878960Ydy;
        EnumC880520YgU enumC880520YgU;
        String mobValue;
        String str;
        C1C7U.LIZ("IMChatListAnalytics@cbf8.trackStrangerChatNew$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        AbstractC885530YoZ abstractC885530YoZ = this.LL;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLJJLI;
        InterfaceC1493105sv interfaceC1493105sv = this.LLILLL;
        c885310YoD.getClass();
        IChatListEngine.LIZ.getClass();
        C879540Yeu<?> c879540YeuLJII = C884160YmM.LIZ().LJII(abstractC885530YoZ.getKey(), interfaceC879010Ye3);
        if (c879540YeuLJII != null) {
            T t = c879540YeuLJII.LIZJ;
            List<C880460YgO> chatLabels = null;
            if (t instanceof C0Y8T) {
                c0y8t = (C0Y8T) t;
            } else {
                c0y8t = null;
            }
            C1490405sU<?> c1490405sU = c879540YeuLJII.LIZLLL.get(C1718806oE.LIZ);
            if (c1490405sU != null) {
                obj2 = c1490405sU.LIZIZ;
            } else {
                obj2 = null;
            }
            if (obj2 instanceof IMUser) {
                iMUser = (IMUser) obj2;
            } else {
                iMUser = null;
            }
            Map<String, String> mapLJIIL = C885310YoD.LJIIL(abstractC885530YoZ, interfaceC879010Ye3, c879540YeuLJII, c0y8t, iMUser);
            String str2 = "1";
            if (c0y8t != null) {
                C869590Y9l lastShowMessage = c0y8t.getLastShowMessage();
                if (lastShowMessage != null && lastShowMessage.getMsgType() == 15) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                mapLJIIL.put("is_new_chat", str);
                if (C878890Ydr.LIZIZ(c0y8t)) {
                    mapLJIIL.put("sub_chat_type", "message_request_spam");
                }
            }
            mapLJIIL.put("is_recommended_chat", CardStruct.IStatusCode.DEFAULT);
            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
            if (c19212010Ec.LJLLLLLL() && (interfaceC879010Ye3 instanceof C878960Ydy) && (c878960Ydy = (C878960Ydy) interfaceC879010Ye3) != null && (enumC880520YgU = c878960Ydy.LLILLL) != null && (mobValue = enumC880520YgU.getMobValue()) != null) {
                mapLJIIL.put("tab_name", mobValue);
            }
            Boolean bool = Boolean.FALSE;
            if ((abstractC885530YoZ instanceof C886420Yq0) && (c886420Yq0 = (C886420Yq0) abstractC885530YoZ) != null) {
                chatLabels = c886420Yq0.getChatLabels();
            }
            String strLJIILLIIL = C885310YoD.LJIILLIIL(bool, chatLabels, abstractC885530YoZ.getRelationLabel());
            if (strLJIILLIIL.length() > 0) {
                mapLJIIL.put("chat_label", strLJIILLIIL);
            }
            if (c19212010Ec.LJII()) {
                if (!c19212010Ec.LJIIJ()) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                mapLJIIL.put("is_default_landing_inbox", str2);
            }
            mapLJIIL.put("is_message_request", ((IIMCategoryAnalytics) C885310YoD.LJFF.getValue()).LIZ(c0y8t));
            mapLJIIL.put("inbox_mode", c19212010Ec.LIZJ().getMobValue());
            String strLJIJ = C885310YoD.LJIJ(interfaceC879010Ye3);
            if (strLJIJ != null) {
                mapLJIIL.put("chat_section", strLJIJ);
            }
            String str3 = C0NBD.LIZ;
            if (str3 == null) {
                str3 = "";
            }
            mapLJIIL.put("inbox_session_id", str3);
            interfaceC1493105sv.sendEvent("chat_show", mapLJIIL);
        }
        C885310YoD.LJJIIZI(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMChatListAnalytics@cbf8.trackStrangerChatNew$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
