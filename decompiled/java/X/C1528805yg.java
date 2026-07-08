package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics$logSendGroupInv$1", f = "IMGroupChatDetailAnalytics.kt", l = {285}, m = "invokeSuspend")
public final class C1528805yg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C830490Whz LL;
    public int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC1493105sv LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528805yg(int i, int i2, int i3, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C1528805yg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1528805yg(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C830490Whz c830490Whz;
        boolean z;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        C1C7U.LIZ("IMGroupChatDetailAnalytics@1157.logSendGroupInv$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c830490Whz = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c830490Whz = new C830490Whz();
            c830490Whz.put("conversation_id", IMGroupChatDetailAnalytics.LJFF);
            c830490Whz.put("is_master", IMGroupChatDetailAnalytics.LJIIJJI());
            c830490Whz.put("member_number", String.valueOf(this.LLILLL));
            c830490Whz.put("chat_type", C1229100i5c.LIZLLL(IMGroupChatDetailAnalytics.LJFF));
            c830490Whz.put("group_type", C1229100i5c.LJI(IMGroupChatDetailAnalytics.LJFF));
            c830490Whz.put("group_role", String.valueOf(C1527905yX.LIZ(C2286608xc.LJ(C1461005nk.LIZ.LJFF(Long.valueOf(C461720I8s.LIZJ()), IMGroupChatDetailAnalytics.LJFF)))));
            String str2 = IMGroupChatDetailAnalytics.LIZJ;
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str2 = "";
            }
            c830490Whz.put("enter_method", str2);
            if (IMGroupChatDetailAnalytics.LIZLLL.length() > 0) {
                c830490Whz.put("enter_from", IMGroupChatDetailAnalytics.LIZLLL);
            }
            c830490Whz.put("selected_group_cnt", String.valueOf(this.LLILZ));
            c830490Whz.put("selected_user_cnt", String.valueOf(this.LLILZIL));
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String strLJJIFFI = C0ZFW.LIZ.LJJIFFI(IMGroupChatDetailAnalytics.LJFF);
            this.LL = c830490Whz;
            this.LLILLJJLI = 1;
            obj = c1bgsLJ.LJIJ(strLJJIFFI, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logSendGroupInv$1");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.userTags) != null) {
            c830490Whz.put("group_owner_account_type", str);
        }
        this.LLILZLL.sendEvent("send_group_inv", c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logSendGroupInv$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
