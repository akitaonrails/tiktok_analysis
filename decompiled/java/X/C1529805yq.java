package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics$logShareGroupVia$1", f = "IMGroupChatDetailAnalytics.kt", l = {221}, m = "invokeSuspend")
public final class C1529805yq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C830490Whz LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ IMContact LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ InterfaceC1493105sv LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529805yq(String str, String str2, String str3, IMContact iMContact, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv, InterfaceC1364105Vn<? super C1529805yq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = iMContact;
        this.LLIZ = map;
        this.LLIZLLLIL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1529805yq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C830490Whz c830490Whz;
        String str;
        boolean z;
        String strLIZIZ;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str2;
        C1C7U.LIZ("IMGroupChatDetailAnalytics@1157.logShareGroupVia$1");
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
            c830490Whz.put("previous_page", IMGroupChatDetailAnalytics.LJ);
            c830490Whz.put("is_master", IMGroupChatDetailAnalytics.LJIIJJI());
            c830490Whz.put("chat_type", C1229100i5c.LIZLLL(IMGroupChatDetailAnalytics.LJFF));
            c830490Whz.put("group_type", C1229100i5c.LJI(IMGroupChatDetailAnalytics.LJFF));
            c830490Whz.put("group_role", String.valueOf(C1527905yX.LIZ(C2286608xc.LJ(C1461005nk.LIZ.LJFF(Long.valueOf(C461720I8s.LIZJ()), IMGroupChatDetailAnalytics.LJFF)))));
            String str3 = this.LLILLL;
            if (Intrinsics.LJFF(str3, this.LLILZ)) {
                str = "tiktok_friends";
            } else if (Intrinsics.LJFF(str3, this.LLILZIL)) {
                str = "copy";
            } else if (Intrinsics.LJFF(str3, "general_qr_code")) {
                str = "download";
            } else {
                str = this.LLILLL;
            }
            c830490Whz.put("platform", str);
            String str4 = IMGroupChatDetailAnalytics.LIZJ;
            if (str4.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str4 = "";
            }
            c830490Whz.put("enter_method", str4);
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String strLJJIFFI = C0ZFW.LIZ.LJJIFFI(IMGroupChatDetailAnalytics.LJFF);
            this.LL = c830490Whz;
            this.LLILLJJLI = 1;
            obj = c1bgsLJ.LJIJ(strLJJIFFI, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logShareGroupVia$1");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str2 = userB2CAccountInfo.userTags) != null) {
            c830490Whz.put("group_owner_account_type", str2);
        }
        if (IMGroupChatDetailAnalytics.LIZLLL.length() > 0) {
            c830490Whz.put("enter_from", IMGroupChatDetailAnalytics.LIZLLL);
        }
        IMContact iMContact = this.LLILZLL;
        if (iMContact != null && (strLIZIZ = C1529905yr.LIZIZ(iMContact)) != null) {
            c830490Whz.put("internal_share_to", strLIZIZ);
        }
        Map<String, String> map = this.LLIZ;
        if (map != null) {
            c830490Whz.putAll(map);
        }
        this.LLIZLLLIL.sendEvent("share_group_via", c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMGroupChatDetailAnalytics@1157.logShareGroupVia$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
