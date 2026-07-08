package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.TopliveNoticeListRequest;
import webcast.api.feed.TopliveNoticeListResponse;

/* JADX INFO: renamed from: X.0Iyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.notifications.repo.LiveNotificationDataManager$requestPage$2", f = "LiveNotificationDataManager.kt", l = {56, 60, 71}, m = "invokeSuspend")
public final class C484280Iyw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TopliveNoticeListResponse>, Object> {
    public C099F LL;
    public int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ EnumC484320Iz0 LLILZ;
    public final /* synthetic */ TopliveNoticeListRequest LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C484280Iyw(long j, EnumC484320Iz0 enumC484320Iz0, TopliveNoticeListRequest topliveNoticeListRequest, InterfaceC1364105Vn<? super C484280Iyw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = enumC484320Iz0;
        this.LLILZIL = topliveNoticeListRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C484280Iyw(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C099F c099fLIZIZ;
        C1C7U.LIZ("LiveNotificationDataManager@748d.requestPage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c099fLIZIZ = this.LL;
                        try {
                            C155000ia.LIZIZ(obj);
                            TopliveNoticeListResponse topliveNoticeListResponse = (TopliveNoticeListResponse) obj;
                            c099fLIZIZ.LJIIZILJ(topliveNoticeListResponse);
                            C1C7U.LIZIZ("LiveNotificationDataManager@748d.requestPage$2");
                            return topliveNoticeListResponse;
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            c099fLIZIZ.LJJJJJ(e);
                            C484270Iyv.LIZIZ.remove(C2286608xc.LJFF(this.LLILLL));
                            throw e;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                C1C7U.LIZIZ("LiveNotificationDataManager@748d.requestPage$2");
                return obj;
            }
            C155000ia.LIZIZ(obj);
            C1C7U.LIZIZ("LiveNotificationDataManager@748d.requestPage$2");
            return obj;
        }
        C155000ia.LIZIZ(obj);
        ConcurrentHashMap<Long, C484290Iyx> concurrentHashMap = C484270Iyv.LIZIZ;
        C484290Iyx c484290Iyx = concurrentHashMap.get(C2286608xc.LJFF(this.LLILLL));
        if (c484290Iyx != null) {
            long j = this.LLILLL;
            c484290Iyx.LIZ.isCompleted();
            if (c484290Iyx.LIZ.isActive()) {
                C05XL<TopliveNoticeListResponse> c05xl = c484290Iyx.LIZ;
                this.LLILLJJLI = 2;
                obj = c05xl.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveNotificationDataManager@748d.requestPage$2");
                    return objLJFF;
                }
                C1C7U.LIZIZ("LiveNotificationDataManager@748d.requestPage$2");
                return obj;
            }
            concurrentHashMap.remove(C2286608xc.LJFF(j));
        }
        c099fLIZIZ = C090F.LIZIZ();
        concurrentHashMap.put(C2286608xc.LJFF(this.LLILLL), new C484290Iyx(c099fLIZIZ, System.currentTimeMillis(), this.LLILZ));
        try {
            C484270Iyv c484270Iyv = C484270Iyv.LIZ;
            TopliveNoticeListRequest topliveNoticeListRequest = this.LLILZIL;
            this.LL = c099fLIZIZ;
            this.LLILLJJLI = 3;
            obj = c484270Iyv.LIZ(topliveNoticeListRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveNotificationDataManager@748d.requestPage$2");
                return objLJFF;
            }
            TopliveNoticeListResponse topliveNoticeListResponse2 = (TopliveNoticeListResponse) obj;
            c099fLIZIZ.LJIIZILJ(topliveNoticeListResponse2);
            C1C7U.LIZIZ("LiveNotificationDataManager@748d.requestPage$2");
            return topliveNoticeListResponse2;
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            c099fLIZIZ.LJJJJJ(e);
            C484270Iyv.LIZIZ.remove(C2286608xc.LJFF(this.LLILLL));
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TopliveNoticeListResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
