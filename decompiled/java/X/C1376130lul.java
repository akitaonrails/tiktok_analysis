package X;

import Y.AfS138S0200000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: renamed from: X.0lul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376130lul extends AbstractC1376390lvB {
    @Override // X.AbstractC1376390lvB
    public final String LJJIJL() {
        return "com.vkontakte.android";
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "vk";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return "VK";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1376120luk
    public final boolean LJ(Context context, Intent intent) {
        C19500811Re c19500811ReLJIIIZ;
        Activity currentActivity;
        InterfaceC1370110ll3 interfaceC1370110ll3;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            InterfaceC1370110ll3 interfaceC1370110ll32 = C1370370llT.LIZ;
            if (interfaceC1370110ll32 != null && interfaceC1370110ll32.LIZ(activityLIZ)) {
                InterfaceC1370110ll3 interfaceC1370110ll33 = C1370370llT.LIZ;
                T tLJJLJLI = 0;
                tLJJLJLI = 0;
                if (interfaceC1370110ll33 == null || (currentActivity = interfaceC1370110ll33.getCurrentActivity()) == null || ((interfaceC1370110ll3 = C1370370llT.LIZ) != null && interfaceC1370110ll3.LIZ(currentActivity))) {
                    AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(this, intent, 7);
                    C259800zU c259800zU = new C259800zU();
                    AfS138S0200000_2 afS138S0200000_2 = new AfS138S0200000_2(awS422S0200000_21, c259800zU, 8);
                    InterfaceC1370110ll3 interfaceC1370110ll34 = C1370370llT.LIZ;
                    if (interfaceC1370110ll34 != null && (c19500811ReLJIIIZ = interfaceC1370110ll34.LJIIIZ()) != null) {
                        tLJJLJLI = c19500811ReLJIIIZ.LJJLJLI(afS138S0200000_2);
                    }
                    c259800zU.element = tLJJLJLI;
                    return true;
                }
                return super.LJ(currentActivity, intent);
            }
            return super.LJ(activityLIZ, intent);
        }
        return super.LJ(context, intent);
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        C1361400lX0 c1361400lX0LIZIZ;
        int i;
        int iIntValue;
        if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (z) {
                i = R.attr.sc;
            } else {
                i = R.attr.sb;
            }
            Integer numLIZ = C1369540lk8.LIZ(i, c1361400lX0LIZIZ);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = 0;
            }
            c419910GdJ.LIZ = iIntValue;
            return c419910GdJ.LIZ(c1361400lX0LIZIZ);
        }
        return null;
    }
}
