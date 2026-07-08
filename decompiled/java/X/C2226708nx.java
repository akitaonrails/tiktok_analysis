package X;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.08nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2226708nx implements InterfaceC316600Cb4 {
    public static final C2226708nx LIZ = new C2226708nx();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();
    public static String LIZJ = "";

    @Override // X.InterfaceC316600Cb4
    public final String LIZLLL() {
        return LIZJ;
    }

    @Override // X.InterfaceC316600Cb4
    public final boolean LIZ(Exception exc) {
        if ((exc instanceof C0XIR) && ((C23112093u) exc).getErrorCode() == 3002416) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC316600Cb4
    public final boolean LJFF(Function1<? super String, Unit> function1) {
        Boolean bool = (Boolean) ((LinkedHashMap) LIZIZ).get(C0XQ7.LJFF().getCurUser().getUid());
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        if (function1 != null) {
            function1.invoke(LIZJ);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC316600Cb4
    public final void LIZIZ(Exception exc, Function1<? super String, Unit> function1) {
        if (exc instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) exc;
            if (c0xir.getErrorCode() == 3002416) {
                LJ(c0xir.getErrorMsg(), true);
                LJFF(function1);
            }
        }
    }

    @Override // X.InterfaceC316600Cb4
    public final boolean LIZJ(View view, LifecycleOwner lifecycleOwner) {
        LifecycleCoroutineScope lifecycleScope;
        boolean zContainsKey = LIZIZ.containsKey(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid());
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C2226508nv(null), 2);
        }
        if (zContainsKey) {
            return LJFF(new AwS582S0100000_3(view, 175));
        }
        return false;
    }

    @Override // X.InterfaceC316600Cb4
    public final void LJ(String str, boolean z) {
        LIZIZ.put(C0XQ7.LJFF().getCurUser().getUid(), Boolean.valueOf(z));
        LIZJ = str;
    }
}
