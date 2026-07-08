package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeInfoResponse;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.utils.SubscribeHelper$getSubscribeInfo$newRequest$1", f = "SubscribeHelper.kt", l = {106, 114}, m = "invokeSuspend")
public final class C635680OwY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SubscribeInfoResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<Integer> LLILLL;
    public final /* synthetic */ C635690OwZ LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C635680OwY(String str, List<Integer> list, C635690OwZ c635690OwZ, int i, InterfaceC1364105Vn<? super C635680OwY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = c635690OwZ;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C635680OwY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJJLIIIJ;
        SubscribeInfoResponse subscribeInfoResponse;
        C1C7U.LIZ("SubscribeHelper@2963.getSubscribeInfo$newRequest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    subscribeInfoResponse = (SubscribeInfoResponse) obj;
                } else {
                    C155000ia.LIZIZ(obj);
                    subscribeInfoResponse = (SubscribeInfoResponse) obj;
                }
            } else {
                C155000ia.LIZIZ(obj);
                List<Integer> list = this.LLILLL;
                if (list != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = null;
                }
                if (this.LLILZ != null) {
                    NotificationApi.Api apiLIZ = NotificationApi.LIZ();
                    String strValueOf = String.valueOf(this.LLILZIL);
                    C635690OwZ c635690OwZ = this.LLILZ;
                    String str = c635690OwZ.LIZ;
                    Integer numLJ = C2286608xc.LJ(c635690OwZ.LIZIZ);
                    Integer numLJ2 = C2286608xc.LJ(this.LLILZ.LIZJ);
                    this.LL = 1;
                    obj = apiLIZ.LJIIZILJ(strValueOf, null, str, numLJ, numLJ2, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("SubscribeHelper@2963.getSubscribeInfo$newRequest$1");
                        return objLJFF;
                    }
                    subscribeInfoResponse = (SubscribeInfoResponse) obj;
                } else {
                    NotificationApi.Api apiLIZ2 = NotificationApi.LIZ();
                    String strValueOf2 = String.valueOf(this.LLILZIL);
                    this.LL = 2;
                    obj = apiLIZ2.LJIIZILJ(strValueOf2, strLJJLIIIJ, null, null, null, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("SubscribeHelper@2963.getSubscribeInfo$newRequest$1");
                        return objLJFF;
                    }
                    subscribeInfoResponse = (SubscribeInfoResponse) obj;
                }
            }
            if (subscribeInfoResponse.status_code == 0) {
                C635700Owa.LIZJ.LIZLLL(this.LLILLJJLI, subscribeInfoResponse);
            }
            C635700Owa.LIZLLL.remove(this.LLILLJJLI);
            C1C7U.LIZIZ("SubscribeHelper@2963.getSubscribeInfo$newRequest$1");
            return subscribeInfoResponse;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C635700Owa.LIZLLL.remove(this.LLILLJJLI);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SubscribeInfoResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
