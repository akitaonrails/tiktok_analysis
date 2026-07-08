package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0YkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.mob.IMMessageRequestPerfAnalytics$mobMessageRequestPerfOfFirstCellShow$1", f = "IMMessageRequestPerfAnalytics.kt", l = {141}, m = "invokeSuspend")
public final class C882940YkO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC871430YGn LLILLJJLI;
    public final /* synthetic */ InterfaceC1493105sv LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function0<Integer> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C882940YkO(EnumC871430YGn enumC871430YGn, InterfaceC1493105sv interfaceC1493105sv, int i, Function0<Integer> function0, InterfaceC1364105Vn<? super C882940YkO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC871430YGn;
        this.LLILLL = interfaceC1493105sv;
        this.LLILZ = i;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C882940YkO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        Object obj2;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        String str;
        C1C7U.LIZ("IMMessageRequestPerfAnalytics@a06e.mobMessageRequestPerfOfFirstCellShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = "";
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            this.LL = 1;
            obj = c1bgsLJ.LJIJ(curUserId, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMMessageRequestPerfAnalytics@a06e.mobMessageRequestPerfOfFirstCellShow$1");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null && (str = userB2CAccountInfo.userTags) != null) {
            str2 = str;
        }
        Iterator<C0Y9G> it2 = C876470YZx.LIZ().LJIIJ(this.LLILLJJLI).iterator();
        long jLongValue5 = 0;
        long j5 = 0;
        while (it2.hasNext()) {
            j5 += it2.next().LIZLLL;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = this.LLILZ;
        Function0<Integer> function0 = this.LLILZIL;
        linkedHashMap.put("num", String.valueOf(i2));
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) C879050Ye7.LIZIZ;
        Long l = (Long) linkedHashMap2.get("first_cell_show");
        if (l != null) {
            long jLongValue6 = l.longValue();
            Long l2 = (Long) linkedHashMap2.get("click_start_page");
            if (l2 != null) {
                jLongValue4 = l2.longValue();
            } else {
                jLongValue4 = 0;
            }
            j = jLongValue6 - jLongValue4;
        } else {
            j = 0;
        }
        linkedHashMap.put("duration", String.valueOf(j));
        Long l3 = (Long) linkedHashMap2.get("oncreate_view_end");
        if (l3 != null) {
            long jLongValue7 = l3.longValue();
            Long l4 = (Long) linkedHashMap2.get("oncreate_view_start");
            if (l4 != null) {
                jLongValue3 = l4.longValue();
            } else {
                jLongValue3 = 0;
            }
            j2 = jLongValue7 - jLongValue3;
        } else {
            j2 = 0;
        }
        linkedHashMap.put("on_view_create_duration", String.valueOf(j2));
        Long l5 = (Long) linkedHashMap2.get("assemble_end");
        if (l5 != null) {
            long jLongValue8 = l5.longValue();
            Long l6 = (Long) linkedHashMap2.get("assemble_start");
            if (l6 != null) {
                jLongValue2 = l6.longValue();
            } else {
                jLongValue2 = 0;
            }
            j3 = jLongValue8 - jLongValue2;
        } else {
            j3 = 0;
        }
        linkedHashMap.put("on_assemble_create_duration", String.valueOf(j3));
        Long l7 = (Long) linkedHashMap2.get("fetch_data_end");
        if (l7 != null) {
            long jLongValue9 = l7.longValue();
            Long l8 = (Long) linkedHashMap2.get("fetch_data_start");
            if (l8 != null) {
                jLongValue = l8.longValue();
            } else {
                jLongValue = 0;
            }
            j4 = jLongValue9 - jLongValue;
        } else {
            j4 = 0;
        }
        linkedHashMap.put("fetch_data_duration", String.valueOf(j4));
        Long l9 = (Long) linkedHashMap2.get("fetch_data_from_db_end");
        if (l9 != null) {
            long jLongValue10 = l9.longValue();
            Long l10 = (Long) linkedHashMap2.get("fetch_data_start");
            if (l10 != null) {
                jLongValue5 = l10.longValue();
            }
            jLongValue5 = jLongValue10 - jLongValue5;
        }
        linkedHashMap.put("fetch_data_from_db_duration", String.valueOf(jLongValue5));
        String str3 = "1";
        if (C19212010Ec.LIZJ.LJLLLLLL()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_creator_inbox", obj2);
        if (!Intrinsics.LJFF(C879050Ye7.LJ, "MessageRequestListDataSource:batch_update_reuse")) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_preload", str3);
        linkedHashMap.put("request_total_count", String.valueOf(C879050Ye7.LIZLLL));
        if (C866950Xzh.LIZ(str2)) {
            linkedHashMap.put("account_type", str2);
        }
        linkedHashMap.put("cur_page_unread_cnt", String.valueOf(function0.invoke().intValue()));
        linkedHashMap.put("unread_cnt", String.valueOf(j5));
        this.LLILLL.sendEvent("im_message_request_page_perf", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMessageRequestPerfAnalytics@a06e.mobMessageRequestPerfOfFirstCellShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
