package X;

import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveParmasConfigSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ipg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.container.model.MultiTopLiveDataManagerV2$preLoadFeedItems$1", f = "MultiTopLiveDataManagerV2.kt", l = {339}, m = "invokeSuspend")
public final class C478540Ipg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478540Ipg(long j, InterfaceC1364105Vn<? super C478540Ipg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478540Ipg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        String str;
        List<T> list;
        String str2;
        Object objLIZJ = obj;
        C1C7U.LIZ("MultiTopLiveDataManagerV2@5859.preLoadFeedItems$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str3 = "";
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZJ);
            } else {
                C155000ia.LIZIZ(objLIZJ);
                C478590Ipl c478590Ipl = C478590Ipl.LIZ;
                String strLJI = C478590Ipl.LJI();
                this.LL = 1;
                objLIZJ = c478590Ipl.LIZJ(0L, strLJI, this, null, true);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("MultiTopLiveDataManagerV2@5859.preLoadFeedItems$1");
                    return objLJFF;
                }
            }
            BaseListResponse baseListResponse = (BaseListResponse) objLIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload result: ");
            List<T> list2 = baseListResponse.data;
            if (list2 != 0) {
                numLJ = C2286608xc.LJ(list2.size());
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            C20441214yg.LIZIZ("MultiTopLiveDataManagerV2", C2188811AlT.LIZIZ(sbLIZ));
            if (baseListResponse.statusCode == 0 && (list = baseListResponse.data) != 0) {
                if (!list.isEmpty()) {
                    C477860Ioa.LJ(new C477890Iod(192, System.currentTimeMillis() - this.LLILLJJLI, MultiGuestTopLiveParmasConfigSetting.INSTANCE.getFeedCardEnterMethodV2(), "preload", "MultiTopLiveDataManagerV2#preLoadFeedItems, resp.data.isNotEmpty", "success", baseListResponse.LIZLLL, (String) null));
                } else {
                    String feedCardEnterMethodV2 = MultiGuestTopLiveParmasConfigSetting.INSTANCE.getFeedCardEnterMethodV2();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
                    String str4 = baseListResponse.LIZLLL;
                    if (baseListResponse.data == null) {
                        str2 = "response.data is null";
                    } else {
                        str2 = "response.data is empty";
                    }
                    C477860Ioa.LJ(new C477890Iod(64, jCurrentTimeMillis, feedCardEnterMethodV2, "preload", "MultiTopLiveDataManagerV2#preLoadFeedItems, !resp.data.isNotEmpty", "empty", str4, str2));
                }
            } else {
                String feedCardEnterMethodV22 = MultiGuestTopLiveParmasConfigSetting.INSTANCE.getFeedCardEnterMethodV2();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLILLJJLI;
                String str5 = baseListResponse.LIZLLL;
                if (str5 == null) {
                    str5 = "";
                }
                String strValueOf = String.valueOf(baseListResponse.statusCode);
                RequestError requestError = baseListResponse.LJ;
                if (requestError == null || (str = requestError.message) == null) {
                    str = "";
                }
                C477860Ioa.LJ(new C477890Iod(feedCardEnterMethodV22, "preload", jCurrentTimeMillis2, "MultiTopLiveDataManagerV2#preLoadFeedItems, resp.statusCode != 0", "error", str5, strValueOf, str));
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C477500Io0.LIZ.getClass();
            C477680IoI c477680IoILJIJ = C477500Io0.LJIJ(e2);
            String feedCardEnterMethodV23 = MultiGuestTopLiveParmasConfigSetting.INSTANCE.getFeedCardEnterMethodV2();
            long jCurrentTimeMillis3 = System.currentTimeMillis() - this.LLILLJJLI;
            String str6 = c477680IoILJIJ.LIZJ;
            if (str6 != null) {
                str3 = str6;
            }
            C477860Ioa.LJ(new C477890Iod(feedCardEnterMethodV23, "preload", jCurrentTimeMillis3, "MultiTopLiveDataManagerV2#preLoadFeedItems, catch Exception", "error", str3, String.valueOf(c477680IoILJIJ.LIZ), c477680IoILJIJ.LIZIZ));
            C20441214yg.LJFF("MultiTopLiveDataManagerV2", "preLoadFeedItems catch Exception", e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveDataManagerV2@5859.preLoadFeedItems$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
