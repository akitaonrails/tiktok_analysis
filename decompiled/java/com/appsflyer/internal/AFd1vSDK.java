package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public interface AFd1vSDK {

    public static final class AFa1uSDK {
        public final float valueOf;
        public final String values;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Intrinsics.LJFF(Float.valueOf(this.valueOf), Float.valueOf(aFa1uSDK.valueOf)) && Intrinsics.LJFF(this.values, aFa1uSDK.values);
        }

        public final String toString() {
            return "BatteryData(level=" + this.valueOf + ", charging=" + this.values + ')';
        }

        public final int hashCode() {
            int iFloatToIntBits = Float.floatToIntBits(this.valueOf) * 31;
            String str = this.values;
            return iFloatToIntBits + (str == null ? 0 : str.hashCode());
        }

        public AFa1uSDK(float f, String str) {
            this.valueOf = f;
            this.values = str;
        }
    }

    AFa1uSDK AFInAppEventParameterName(Context context);
}
