package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069830dwj {
    public static final void LIZ(EnumC1070410dxf enumC1070410dxf, Context context, C1073970e3P c1073970e3P, Function1<? super Boolean, Unit> function1) {
        EnumC1070340dxY enumC1070340dxY;
        LifecycleCoroutineScope lifecycleScope;
        int i = C1069840dwk.LIZ[enumC1070410dxf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                enumC1070340dxY = EnumC1070340dxY.CONTACT;
            } else {
                throw new C1954807lC();
            }
        } else {
            enumC1070340dxY = EnumC1070340dxY.FACEBOOK;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C1070010dx1(context, enumC1070340dxY, c1073970e3P, function1, null), 3);
        }
    }
}
