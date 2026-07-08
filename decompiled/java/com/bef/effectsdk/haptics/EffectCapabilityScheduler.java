package com.bef.effectsdk.haptics;

import X.C2207281BaA;
import X.C2207291BaB;
import X.C2207301BaC;
import X.C2207311BaD;
import X.C786410Ut5;
import X.EnumC2207531BaZ;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes35.dex */
public class EffectCapabilityScheduler {
    public static boolean isSupportVibrationCapability() {
        EnumC2207531BaZ enumC2207531BaZ = EnumC2207531BaZ.VIBRATE_ENHANCE;
        C2207281BaA.LIZ.getClass();
        return C2207311BaD.LIZLLL(enumC2207531BaZ);
    }

    public static void registerApplication(Context context) {
        C2207291BaB.LIZ(context);
    }

    public static void requestVibrateCapability(int i, float f, float f2, float f3, String str) {
        C2207301BaC c2207301BaC = new C2207301BaC();
        Bundle bundle = new Bundle();
        c2207301BaC.LJFF = bundle;
        bundle.putInt("scene_type", i);
        c2207301BaC.LJFF.putFloat("intensity", f);
        c2207301BaC.LJFF.putFloat("sharpness", f2);
        c2207301BaC.LJFF.putFloat("duration", f3);
        C786410Ut5.LJJJI("jsonFilePath", str, c2207301BaC.LJFF);
        c2207301BaC.LIZ = EnumC2207531BaZ.VIBRATE_ENHANCE.getIndex();
        C2207281BaA.LIZ.LIZ(c2207301BaC);
    }
}
