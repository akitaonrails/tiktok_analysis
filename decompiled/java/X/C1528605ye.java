package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics$logEventWithCommonParams$2", f = "IMGroupChatDetailAnalytics.kt", l = {396}, m = "invokeSuspend")
public final class C1528605ye extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ InterfaceC1493105sv LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528605ye(Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv, String str, InterfaceC1364105Vn<? super C1528605ye> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
        this.LLILLL = interfaceC1493105sv;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1528605ye(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        C1C7U.LIZ("IMGroupChatDetailAnalytics@1157.logEventWithCommonParams$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.put("conversation_id", IMGroupChatDetailAnalytics.LJFF);
            this.LLILLJJLI.put("chat_type", C1229100i5c.LIZLLL(IMGroupChatDetailAnalytics.LJFF));
            this.LLILLJJLI.put("group_type", C1229100i5c.LJI(IMGroupChatDetailAnalytics.LJFF));
            this.LLILLJJLI.put("is_master", IMGroupChatDetailAnalytics.LJIIJJI());
            this.LLILLJJLI.put("group_role", String.valueOf(C1527905yX.LIZ(C2286608xc.LJ(C1461005nk.LIZ.LJFF(Long.valueOf(C461720I8s.LIZJ()), IMGroupChatDetailAnalytics.LJFF)))));
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String strLJJIFFI = C0ZFW.LIZ.LJJIFFI(IMGroupChatDetailAnalytics.LJFF);
            this.LL = 1;
            obj = c1bgsLJ.LJIJ(strLJJIFFI, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logEventWithCommonParams$2");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.userTags) != null) {
            this.LLILLJJLI.put("group_owner_account_type", str);
        }
        this.LLILLL.sendEvent(this.LLILZ, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logEventWithCommonParams$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
