package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notification.api.BulletinEventReportRequest;
import com.ss.android.ugc.aweme.notification.api.EventInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OND, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.feed.button.event.BulletinBoardExposureEvent$invoke$2", f = "BulletinBoardExposureEvent.kt", l = {48}, m = "invokeSuspend")
public final class C0OND extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OND(String str, InterfaceC1364105Vn interfaceC1364105Vn, C013C c013c) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OND(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardExposureEvent@adb4.invoke$2");
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
            if (this.LLILLJJLI.element) {
                C0ONF c0onf = C0ONF.LIZ;
                String str = this.LLILLL;
                this.LL = 1;
                ArrayList arrayList = new ArrayList();
                BulletinEventReportRequest bulletinEventReportRequest = new BulletinEventReportRequest(arrayList);
                Integer numLJ = C2286608xc.LJ(C0OM6.BB_FYP_BUTTON.getValue());
                Integer numLJ2 = C2286608xc.LJ(C0ONE.SHOW.getValue());
                Integer.valueOf(0);
                arrayList.add(new EventInfo(numLJ, numLJ2, str, null, null));
                Object objLIZ = c0onf.LIZ(bulletinEventReportRequest, this);
                if (objLIZ != C099R.LJFF()) {
                    objLIZ = Unit.LIZ;
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("BulletinBoardExposureEvent@adb4.invoke$2");
                    return objLJFF;
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "homepage_hot_button");
        linkedHashMap.put("action_type", "show");
        linkedHashMap.put("is_subscribed", CardStruct.IStatusCode.DEFAULT);
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = this.LLILLL;
        c0opq.getClass();
        C0OPQ.LJ(false, str2, linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardExposureEvent@adb4.invoke$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
