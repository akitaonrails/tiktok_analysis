package X;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: X.15oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20632215oO implements TypeEvaluator<Integer> {
    public static final C20632215oO LIZ = new C20632215oO();

    public static Integer LIZ(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        float f3 = ((iIntValue >> 16) & 255) / 255.0f;
        float f4 = ((iIntValue >> 8) & 255) / 255.0f;
        float f5 = (iIntValue & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float fPow = (float) Math.pow(f3, 2.2d);
        float fPow2 = (float) Math.pow(f4, 2.2d);
        float fPow3 = (float) Math.pow(f5, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f);
        float fPow6 = fPow3 + (f * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return LIZ(f, num, num2);
    }
}
