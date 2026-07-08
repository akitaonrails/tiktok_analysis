package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05yk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics$logCreateChat$1", f = "IMGroupChatDetailAnalytics.kt", l = {159}, m = "invokeSuspend")
public final class C1529205yk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2344009Gk LL;
    public C2344009Gk LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0Y8T LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ Map<String, String> LLJILJILJ;
    public final /* synthetic */ List<String> LLJILLL;
    public final /* synthetic */ InterfaceC1493105sv LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529205yk(C0Y8T c0y8t, String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z, Map<String, String> map, List<String> list, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C1529205yk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0y8t;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = i;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = z;
        this.LLJILJILJ = map;
        this.LLJILLL = list;
        this.LLJJ = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1529205yk(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int memberCount;
        C2344009Gk c2344009Gk;
        String conversationId;
        C2344009Gk c2344009Gk2;
        Set<String> setKeySet;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        C1C7U.LIZ("IMGroupChatDetailAnalytics@1157.logCreateChat$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c2344009Gk2 = this.LLILLJJLI;
                c2344009Gk = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0Y8T c0y8t = this.LLILZ;
            if (c0y8t != null) {
                memberCount = c0y8t.getMemberCount();
            } else {
                memberCount = 0;
            }
            c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILZIL);
            c2344009Gk.LIZJ(memberCount, "chat_num");
            c2344009Gk.LJIIIIZZ("type", this.LLILZLL);
            C0Y8T c0y8t2 = this.LLILZ;
            if (c0y8t2 != null) {
                conversationId = c0y8t2.getConversationId();
            } else {
                conversationId = null;
            }
            c2344009Gk.LJIIIIZZ("conversation_id", conversationId);
            c2344009Gk.LIZJ(this.LLIZ, "error_code");
            c2344009Gk.LJIIIIZZ("chat_type", this.LLIZLLLIL);
            c2344009Gk.LJIIIIZZ("group_type", this.LLJ);
            c2344009Gk.LJIIIIZZ("version", this.LLJI);
            c2344009Gk.LJIIIIZZ("enter_method", this.LLJIJIL);
            if (Intrinsics.LJFF(this.LLILZLL, "group")) {
                C1759206uk c1759206uk = C1759206uk.LIZ;
                c2344009Gk.LJ(Boolean.valueOf(C1759206uk.LIZ()), "group_chat_enable");
            }
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String strLIZIZ = C461720I8s.LIZIZ();
            this.LL = c2344009Gk;
            this.LLILLJJLI = c2344009Gk;
            this.LLILLL = 1;
            obj = c1bgsLJ.LJIJ(strLIZIZ, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logCreateChat$1");
                return objLJFF;
            }
            c2344009Gk2 = c2344009Gk;
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.userTags) != null) {
            c2344009Gk2.LJFF("account_type", str);
        }
        String strLIZ = C1529305yl.LIZ(Boolean.valueOf(this.LLJILJIL));
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("is_auto_retry", strLIZ);
        Map<String, String> map = this.LLJILJILJ;
        if (map == null || (setKeySet = map.keySet()) == null || !setKeySet.contains("to_user_id_set")) {
            List<String> list = this.LLJILLL;
            if (C866950Xzh.LIZIZ(list) && list != null) {
                c2344009Gk.LJFF("to_user_id_set", IMGroupChatDetailAnalytics.LJIIJ(this.LLJILLL));
            }
        }
        Map<String, String> map2 = this.LLJILJILJ;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
        }
        this.LLJJ.sendEvent("create_chat", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logCreateChat$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
