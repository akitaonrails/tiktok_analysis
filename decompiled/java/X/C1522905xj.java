package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.activestatus.api.model.ActivityStatus;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.im.activestatus.push.ActivityStatusInAppPushHandler$interceptInnerPushClick$1", f = "ActivityStatusInAppPushHandler.kt", l = {}, m = "invokeSuspend")
public final class C1522905xj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InnerPushMessage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1522905xj(InnerPushMessage innerPushMessage, InterfaceC1364105Vn<? super C1522905xj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = innerPushMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1522905xj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        C1C7U.LIZ("ActivityStatusInAppPushHandler@980e.interceptInnerPushClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ActivityStatus activityStatus = (ActivityStatus) C051M.LIZIZ(ActivityStatus.class, this.LL.getBizExtraJsonStr());
        if (activityStatus != null && (str = activityStatus.userID) != null) {
            InterfaceC1252250igx imSayHiService = C1336205Ku.LIZ(false).getImSayHiService();
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("enter_from", "inner_push");
            if (this.LL.getType() == 32) {
                str2 = "dm_permissions_receiver_open";
            } else {
                str2 = "inner_push_active_status";
            }
            pairArr[1] = new Pair("enter_method", str2);
            int type = this.LL.getType();
            if (type != 27) {
                if (type != 31) {
                    str3 = "";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
            } else {
                str3 = "1";
            }
            pairArr[2] = new Pair("online_order", str3);
            pairArr[3] = new Pair("message_from", "greeting_button");
            imSayHiService.LJIIIZ(str, C2097608Jq.LJI(pairArr));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ActivityStatusInAppPushHandler@980e.interceptInnerPushClick$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusInAppPushHandler@980e.interceptInnerPushClick$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
