package X;

import com.bytedance.android.livesdk.game.broadcast.setting.MobileGameFeedbackAnalyseInfo;
import com.bytedance.android.livesdk.game.common.setting.ShowTipLowEndDeviceMax;
import com.bytedance.android.livesdk.livesetting.broadcast.EnablePerformanceTipsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LowLevelDeviceShowTimesSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ug0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778300Ug0 {
    public static final int LJFF = LowLevelDeviceShowTimesSetting.INSTANCE.getValue();
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public final AtomicBoolean LJ;

    public final void LIZLLL() {
        boolean zIsEnableLowDevices = EnablePerformanceTipsSetting.INSTANCE.isEnableLowDevices();
        boolean z = InterfaceC772390URp.b0.LIZIZ().intValue() >= LJFF;
        if (!zIsEnableLowDevices || z || this.LJ.get()) {
            Map<String, Object> map = C1338270kvh.LIZ;
            this.LIZ = false;
        } else {
            if (this.LIZ) {
                return;
            }
            Pair pair = (Pair) DataChannelGlobal.LLILZ.gg0(C949550aoj.class);
            this.LIZ = pair != null && ((Number) pair.getFirst()).floatValue() < ((float) ShowTipLowEndDeviceMax.INSTANCE.getValue());
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }

    public C778300Ug0() {
        Pair pair = (Pair) DataChannelGlobal.LLILZ.gg0(C949550aoj.class);
        this.LIZ = pair != null && ((Number) pair.getFirst()).floatValue() < ((float) ShowTipLowEndDeviceMax.INSTANCE.getValue());
        C1300340jwW c1300340jwW = C476230Ilx.LIZ;
        double dLJ = (c1300340jwW.LJ() <= 0 || c1300340jwW.LJI() <= 0) ? -999.0d : ((double) c1300340jwW.LJ()) / ((double) c1300340jwW.LJI());
        this.LIZJ = dLJ >= 0.0d && dLJ * ((double) 100) < ((double) MobileGameFeedbackAnalyseInfo.INSTANCE.getValue().getPower_low());
        this.LIZLLL = C778190Ufp.LJFF();
        this.LJ = new AtomicBoolean(false);
    }

    public final synchronized void LIZ(EnumC778330Ug3 enumC778330Ug3) {
        int i = C778350Ug5.LIZ[enumC778330Ug3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.LIZLLL = false;
                    }
                } else {
                    this.LIZIZ = false;
                }
            } else {
                this.LIZJ = false;
            }
        } else {
            C20337914i1<Integer> c20337914i1 = InterfaceC772390URp.b0;
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            this.LJ.set(true);
        }
    }

    public final void LIZIZ(List<Pair<Float, Boolean>> list) {
        boolean z = false;
        if (!EnablePerformanceTipsSetting.INSTANCE.isEnableHighTemperatureTips()) {
            Map<String, Object> map = C1338270kvh.LIZ;
            this.LIZIZ = false;
            return;
        }
        if (this.LIZIZ) {
            return;
        }
        MobileGameFeedbackAnalyseInfo mobileGameFeedbackAnalyseInfo = MobileGameFeedbackAnalyseInfo.INSTANCE;
        int battery_temp_lasting = mobileGameFeedbackAnalyseInfo.getValue().getBattery_temp_lasting() / 5;
        int i = battery_temp_lasting + 1;
        List<Pair> listLLD = C13LP.LLD(i, list);
        if (listLLD.size() < battery_temp_lasting) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not show high temperature tips. reason: temperature_count(");
            sbLIZ.append(listLLD.size());
            sbLIZ.append(") < ");
            sbLIZ.append(battery_temp_lasting);
            C20441214yg.LJIIL("HighTemperaturePerformanceTips", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            float battery_temp_android = mobileGameFeedbackAnalyseInfo.getValue().getBattery_temp_android();
            if (listLLD.size() == battery_temp_lasting) {
                for (Pair pair : listLLD) {
                    if (((Number) pair.getFirst()).floatValue() < battery_temp_android) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("not show high temperature tips. reason: not_first_temperature(");
                        sbLIZ2.append(((Number) pair.getFirst()).floatValue());
                        sbLIZ2.append(") < ");
                        sbLIZ2.append(battery_temp_android);
                        sbLIZ2.append(". temperature list=");
                        sbLIZ2.append(listLLD);
                        C20441214yg.LJIIL("HighTemperaturePerformanceTips", C2188811AlT.LIZIZ(sbLIZ2));
                        break;
                    }
                }
                z = true;
            } else if (listLLD.size() == i) {
                int i2 = 0;
                for (Pair pair2 : listLLD) {
                    int i3 = i2 + 1;
                    if (i2 == 0) {
                        if (((Number) pair2.getFirst()).floatValue() >= battery_temp_android) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("not show high temperature tips. reason: first_temperature(");
                            sbLIZ3.append(((Number) pair2.getFirst()).floatValue());
                            sbLIZ3.append(") >= ");
                            sbLIZ3.append(battery_temp_android);
                            sbLIZ3.append(". temperature list=");
                            sbLIZ3.append(listLLD);
                            C20441214yg.LJIIL("HighTemperaturePerformanceTips", C2188811AlT.LIZIZ(sbLIZ3));
                            break;
                        }
                        i2 = i3;
                    } else {
                        if (((Number) pair2.getFirst()).floatValue() < battery_temp_android) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("not show high temperature tips. reason: not_first_temperature(");
                            sbLIZ4.append(((Number) pair2.getFirst()).floatValue());
                            sbLIZ4.append(") < ");
                            sbLIZ4.append(battery_temp_android);
                            sbLIZ4.append(". temperature list=");
                            sbLIZ4.append(listLLD);
                            C20441214yg.LJIIL("HighTemperaturePerformanceTips", C2188811AlT.LIZIZ(sbLIZ4));
                            break;
                        }
                        i2 = i3;
                    }
                }
                z = true;
            } else {
                z = true;
            }
        }
        this.LIZIZ = z;
        Map<String, Object> map2 = C1338270kvh.LIZ;
    }

    public final void LIZJ(List<Boolean> list) {
        boolean z = false;
        if (!EnablePerformanceTipsSetting.INSTANCE.isEnableLowBattery()) {
            Map<String, Object> map = C1338270kvh.LIZ;
            this.LIZJ = false;
            return;
        }
        if (this.LIZJ) {
            return;
        }
        int size = list.size();
        if (size > 0 && ((size == 1 && ((Boolean) ListProtector.get(list, 0)).booleanValue()) || (((Boolean) ListProtector.get(list, size - 1)).booleanValue() && !((Boolean) ListProtector.get(list, size - 2)).booleanValue()))) {
            z = true;
        }
        this.LIZJ = z;
        Map<String, Object> map2 = C1338270kvh.LIZ;
    }

    public final void LJ(List<Boolean> list) {
        boolean z = false;
        if (!EnablePerformanceTipsSetting.INSTANCE.isEnableSaveMode()) {
            Map<String, Object> map = C1338270kvh.LIZ;
            this.LIZLLL = false;
            return;
        }
        if (this.LIZLLL) {
            return;
        }
        int size = list.size();
        if (size != 0 && ((size == 1 && ((Boolean) ListProtector.get(list, 0)).booleanValue()) || (((Boolean) ListProtector.get(list, size - 1)).booleanValue() && !((Boolean) ListProtector.get(list, size - 2)).booleanValue()))) {
            z = true;
        }
        this.LIZLLL = z;
        Map<String, Object> map2 = C1338270kvh.LIZ;
    }
}
