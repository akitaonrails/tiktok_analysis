package X;

import com.bytedance.incentive.taskevent.watchvideo.AdWatchVideoTaskTrigger;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.incentive.taskevent.watchvideo.AdWatchVideoTaskTrigger$handlePrefetch$1", f = "AdWatchVideoTaskTrigger.kt", l = {}, m = "invokeSuspend")
public final class C1702580uPI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AdWatchVideoTaskTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702580uPI(AdWatchVideoTaskTrigger adWatchVideoTaskTrigger, InterfaceC1364105Vn<? super C1702580uPI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = adWatchVideoTaskTrigger;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702580uPI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        IIncentiveAdService iIncentiveAdService;
        Integer num;
        int iIntValue;
        C1C7U.LIZ("AdWatchVideoTaskTrigger@6ef1.handlePrefetch$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Pair<String, AdWatchVideoTaskTrigger.AdExtraParam>> list = this.LL.LLJJIJI;
        int iIntValue2 = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        String str = "";
        if (!z) {
            List<Pair<String, AdWatchVideoTaskTrigger.AdExtraParam>> list2 = this.LL.LLJJIJI;
            if (list2 != null) {
                for (Pair<String, AdWatchVideoTaskTrigger.AdExtraParam> pair : list2) {
                    IIncentiveAdService iIncentiveAdService2 = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null);
                    if (iIncentiveAdService2 != null) {
                        String str2 = pair.getSecond().taskId;
                        if (str2 == null) {
                            str2 = "";
                        }
                        Integer num2 = pair.getSecond().completedTimes;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        iIncentiveAdService2.LIZ(iIntValue, str2, pair.getSecond().engagementType, pair.getFirst());
                    }
                }
            }
        } else if (this.LL.LLJJIII != null && (iIncentiveAdService = (IIncentiveAdService) PluggableExtentionKt.pluggableSpi$default(IIncentiveAdService.class, false, false, false, 14, null)) != null) {
            AdWatchVideoTaskTrigger.AdExtraParam adExtraParam = this.LL.LLJJIII;
            if (adExtraParam != null) {
                String str3 = adExtraParam.taskId;
                if (str3 != null) {
                    str = str3;
                }
                Integer num3 = adExtraParam.completedTimes;
                if (num3 != null) {
                    iIntValue2 = num3.intValue();
                }
            }
            AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = this.LL;
            String str4 = adWatchVideoTaskTrigger.LLJJI;
            AdWatchVideoTaskTrigger.AdExtraParam adExtraParam2 = adWatchVideoTaskTrigger.LLJJIII;
            if (adExtraParam2 != null) {
                num = adExtraParam2.engagementType;
            } else {
                num = null;
            }
            iIncentiveAdService.LIZ(iIntValue2, str, num, str4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWatchVideoTaskTrigger@6ef1.handlePrefetch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
