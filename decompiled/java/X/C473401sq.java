package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C473401sq {
    public static final void LIZ(View view, String str, InterfaceC473301sp interfaceC473301sp, Runnable runnable) {
        Object tag = view.getTag(R.id.u_5);
        if (!(tag instanceof Boolean)) {
            tag = null;
        }
        Boolean bool = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(tag, bool);
        view.setTag(R.id.u_4, str);
        view.setTag(R.id.u_3, interfaceC473301sp);
        view.setTag(R.id.u_2, runnable);
        if (zLJFF) {
            return;
        }
        LIZIZ(view, new C5182020e(view, 517), 0.0f, new C5182020e(view, 518), false, null, AnonymousClass0208.get$arr$(55), 18);
        view.setTag(R.id.u_5, bool);
    }

    public static void LIZIZ(View view, Function0 function0, float f, Function0 function02, boolean z, EnumC2211841BhW enumC2211841BhW, Function2 function2, int i) {
        EnumC2211841BhW enumC2211841BhW2 = enumC2211841BhW;
        boolean z2 = z;
        Function0 function03 = function02;
        float f2 = f;
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            function03 = AnonymousClass0206.get$arr$(455);
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            enumC2211841BhW2 = EnumC2211841BhW.CUSTOMIZE;
        }
        C2211631BhB.LJ(view, new C459050HzL(f2, enumC2211841BhW2, function03, z2, function2, function0));
    }
}
