package Y;

import X.C0C64;
import X.C0CAW;
import X.C0CQT;
import X.C260040AHa;
import X.C274300Ap2;
import X.C274470ApJ;
import X.C309220CAe;
import X.C309370CAt;
import X.C584360Mvy;
import X.EnumC309240CAg;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.IShareSettingApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AObjectS57S0000000_4 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public AObjectS57S0000000_4(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS57S0000000_4 aObjectS57S0000000_4) {
        return ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C0CQT.LIZJ).create(IShareSettingApi.class);
    }

    public static final Object invoke$1(AObjectS57S0000000_4 aObjectS57S0000000_4) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "secondary_guard_maps_merge", true, false)) {
            Npth.fixScudoVmaLeak();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS57S0000000_4 aObjectS57S0000000_4) {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_alog", true, true));
    }

    public static final Object invoke$3(AObjectS57S0000000_4 aObjectS57S0000000_4) {
        boolean z;
        if (C584360Mvy.LIZJ == ((Number) C260040AHa.LIZ.getValue()).intValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AObjectS57S0000000_4 aObjectS57S0000000_4) {
        C0CAW.LJII.getClass();
        if (C274300Ap2.LIZ()) {
            EnumC309240CAg enumC309240CAg = EnumC309240CAg.AB;
            C309220CAe.LJFF(enumC309240CAg, "frist_brush");
            C309220CAe.LIZIZ(enumC309240CAg, "frist_brush");
            return null;
        }
        return null;
    }

    public static final Object invoke$5(AObjectS57S0000000_4 aObjectS57S0000000_4) {
        C309370CAt.LJII.getClass();
        if (((Boolean) C274470ApJ.LIZ.getValue()).booleanValue()) {
            EnumC309240CAg enumC309240CAg = EnumC309240CAg.KV;
            C309220CAe.LJFF(enumC309240CAg, "frist_brush_keva");
            C309220CAe.LIZIZ(enumC309240CAg, "frist_brush_keva");
            return null;
        }
        return null;
    }
}
