package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1sSDK {
    public final AFa1qSDK valueOf;

    public final void afInfoLog() throws Throwable {
        try {
            Map<Integer, Object> map = AFc1fSDK.afDebugLog;
            Object declaredConstructor = map.get(-564701561);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFc1fSDK.valueOf((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 89, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 27799))).getDeclaredConstructor(null);
                map.put(-564701561, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            try {
                Object[] objArr = {this.valueOf};
                Object method = map.get(-628703230);
                if (method == null) {
                    method = ((Class) AFc1fSDK.valueOf(Color.alpha(0) + 36, 90 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27799))).getMethod("AFInAppEventType", AFa1qSDK.class);
                    map.put(-628703230, method);
                }
                C2204961BRm.a0((Method) method, objNewInstance, objArr, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdse+leyw==", new String[]{"01c45"}));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public AFb1sSDK(AFa1qSDK aFa1qSDK) {
        this.valueOf = aFa1qSDK;
    }
}
