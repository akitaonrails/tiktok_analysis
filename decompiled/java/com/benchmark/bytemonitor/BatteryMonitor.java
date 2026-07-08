package com.benchmark.bytemonitor;

import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class BatteryMonitor {
    public Context mContext;
    public int temperature = -1;
    public double batteryLevel = -1.0d;

    public double getElectricCurrent() {
        return -1L;
    }

    private void getBattery() {
        try {
            Intent intentLJIJJ = C786410Ut5.LJIJJ(this.mContext, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentLJIJJ != null) {
                int intExtra = intentLJIJJ.getIntExtra("level", -1);
                int intExtra2 = intentLJIJJ.getIntExtra("scale", -1);
                if (intExtra != -1 && intExtra2 != -1) {
                    if (intExtra2 == 0) {
                        this.batteryLevel = 0.0d;
                    } else {
                        this.batteryLevel = (((double) intExtra) / ((double) intExtra2)) * 100.0d;
                    }
                }
                this.temperature = intentLJIJJ.getIntExtra("temperature", -1);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public double getBatteryLevel() {
        getBattery();
        return this.batteryLevel;
    }

    public double getTemperature() {
        getBattery();
        return ((double) this.temperature) / 10.0d;
    }

    public BatteryMonitor(Context context) {
        this.mContext = context;
    }
}
