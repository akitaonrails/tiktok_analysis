package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.setting.services.ISpeedModeSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492950oxB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SpeedModeServiceImpl LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1492950oxB(SpeedModeServiceImpl speedModeServiceImpl, int i, int i2, int i3) {
        super(0);
        this.LL = speedModeServiceImpl;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iIntValue = ((Number) C04RQ.LIZ.getValue()).intValue();
        if (iIntValue == 1) {
            SpeedModeServiceImpl speedModeServiceImpl = this.LL;
            int i = this.LLILLJJLI;
            int i2 = this.LLILLL;
            int i3 = this.LLILZ;
            speedModeServiceImpl.getClass();
            if (i == 0) {
                if (i3 == 1) {
                    speedModeServiceImpl.LIZIZ(0, true, false);
                } else if (i3 == 3) {
                    speedModeServiceImpl.LIZIZ(0, false, true);
                }
                speedModeServiceImpl.LJ().getClass();
                C1471350oOL.LIZJ(i, i2, i3, null);
                speedModeServiceImpl.LIZJ = i3 == 2 && i2 == 1;
            } else if (i == 1) {
                EnumC1471360oOM enumC1471360oOM = EnumC1471360oOM.READY_SWITCH_TO_CELL;
                if (i3 == enumC1471360oOM.getValue()) {
                    speedModeServiceImpl.LIZIZ(1, true, false);
                } else if (i3 == EnumC1471360oOM.READY_SWITCH_TO_WIFI.getValue()) {
                    speedModeServiceImpl.LIZIZ(1, false, true);
                }
                speedModeServiceImpl.LIZLLL = i3 == EnumC1471360oOM.CELL.getValue() && i2 == enumC1471360oOM.getValue();
            }
        } else if (iIntValue == 2) {
            int i4 = this.LLILLJJLI;
            if (i4 == 0) {
                this.LL.LJFF(i4, this.LLILLL, this.LLILZ);
            }
        } else if (iIntValue == 3) {
            int i5 = this.LLILLJJLI;
            if (i5 == 1) {
                this.LL.LJFF(i5, this.LLILLL, this.LLILZ);
            }
        } else if (iIntValue == 4) {
            SpeedModeServiceImpl speedModeServiceImpl2 = this.LL;
            int i6 = this.LLILLJJLI;
            int i7 = this.LLILLL;
            int i8 = this.LLILZ;
            if (i6 == 0) {
                speedModeServiceImpl2.LJ().getClass();
                C1471350oOL.LIZJ(i6, i7, i8, null);
            } else if (i6 != 1) {
                speedModeServiceImpl2.getClass();
            } else {
                speedModeServiceImpl2.LJFF(i6, i7, i8);
            }
        }
        if (this.LL.LIZJ || this.LL.LIZLLL) {
            ((ISpeedModeSetting) ServiceManager.get().getService(ISpeedModeSetting.class)).LIZ();
        } else {
            ((ISpeedModeSetting) ServiceManager.get().getService(ISpeedModeSetting.class)).LJ();
        }
        return Unit.LIZ;
    }
}
