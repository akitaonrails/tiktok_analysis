package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyCheckData;
import webcast.api.room.TopliveTooltip;

/* JADX INFO: renamed from: X.0Ihs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.skylight.SkylightContainerManager$showTooltipIfNeeded$1", f = "SkylightContainerManager.kt", l = {1735, 1743}, m = "invokeSuspend")
public final class C473700Ihs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC476820Imu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C473700Ihs(AbstractC476820Imu abstractC476820Imu, InterfaceC1364105Vn<? super C473700Ihs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC476820Imu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C473700Ihs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objLJI;
        TopliveTooltip topliveTooltip;
        String str;
        TopliveTooltip topliveTooltip2;
        TopliveTooltip topliveTooltip3;
        C1C7U.LIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C469700IbQ c469700IbQ = C469700IbQ.LIZ;
            this.LL = 1;
            C473720Ihu.LIZ();
            C473720Ihu.LIZLLL.curClientTimeStamps = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            obj = c469700IbQ.LIZIZ(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, C473720Ihu.LIZLLL), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
                return objLJFF;
            }
        }
        StrategyCheckData strategyCheckData = (StrategyCheckData) obj;
        if (strategyCheckData == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
            return unit2;
        }
        if (this.LLILLJJLI.LJIIIZ()) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
            return unit3;
        }
        ShowMode showMode = strategyCheckData.showMode;
        if (showMode != null && (topliveTooltip3 = showMode.topliveTooltip) != null) {
            long j = topliveTooltip3.nextCanShowTimestamp;
            if (j > 0) {
                int i3 = C473720Ihu.LIZ;
                C20337914i1<Map<Long, Long>> c20337914i1 = InterfaceC1106030et7.X9;
                c20337914i1.LIZIZ().put(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), Long.valueOf(j));
                c20337914i1.LIZJ();
                C473720Ihu.LIZ();
                C473720Ihu.LIZJ();
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
            return unit4;
        }
        if (strategyCheckData.decision == 1) {
            if (showMode != null && (topliveTooltip2 = showMode.topliveTooltip) != null) {
                i = topliveTooltip2.tooltipType;
            } else {
                i = 0;
            }
            if (C13LQ.LJJIJIIJI(Integer.valueOf(i), C469700IbQ.LIZIZ) >= 0) {
                AbstractC476820Imu abstractC476820Imu = this.LLILLJJLI;
                this.LL = 2;
                abstractC476820Imu.getClass();
                ShowMode showMode2 = strategyCheckData.showMode;
                if (showMode2 != null && (topliveTooltip = showMode2.topliveTooltip) != null && (str = topliveTooltip.text) != null && str.length() != 0) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C473690Ihr(abstractC476820Imu, strategyCheckData, null));
                    if (objLJI != C099R.LJFF()) {
                        objLJI = Unit.LIZ;
                    }
                } else {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
                    return objLJFF;
                }
                Unit unit5 = Unit.LIZ;
                C1C7U.LIZIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
                return unit5;
            }
        }
        Unit unit42 = Unit.LIZ;
        C1C7U.LIZIZ("SkylightContainerManager@b223.showTooltipIfNeeded$1");
        return unit42;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
