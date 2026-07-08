package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.stablemode.DowngradeDecision;
import com.bytedance.android.livesdk.livesetting.performance.BroadcastNewStableModeSetting;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Uc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775900Uc8 {
    public static InterfaceC1631620sYq<? super Boolean, ? super EnumC775860Uc4, ? super EnumC775860Uc4, Unit> LIZIZ;
    public static LifecycleOwner LIZJ;
    public static DowngradeDecision LIZLLL;
    public static boolean LJ;
    public static final C2252331DDr LIZ = C09IR.LIZIZ(1, 10, null, 4);
    public static final Map<String, C09AE> LJFF = new LinkedHashMap();

    public static void LIZ(EnumC774100UYe enumC774100UYe, Function2 function2) {
        LIZIZ(EnumC775910Uc9.BASE_CAPABILITY.getModuleName(), enumC774100UYe.getFeatureName(), false, true, true, function2);
    }

    public static void LJFF(EnumC781860Ulk enumC781860Ulk, Function2 function2) {
        LIZIZ(EnumC775910Uc9.REVENUE.getModuleName(), enumC781860Ulk.getFeatureName(), false, true, true, function2);
    }

    public static void LJI(EnumC776070UcP enumC776070UcP, Function2 function2) {
        LIZIZ(EnumC775910Uc9.ROOM_FUNCTION.getModuleName(), enumC776070UcP.getFeatureName(), false, true, true, function2);
    }

    public static void LIZLLL(EnumC775910Uc9 enumC775910Uc9, boolean z, Function1 function1) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if (BroadcastNewStableModeSetting.INSTANCE.enable() && (lifecycleOwner = LIZJ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C01KE.LIZIZ(lifecycleScope, new C775940UcC(enumC775910Uc9, z, function1, null));
        }
    }

    public static void LIZJ(EnumC2005307tL enumC2005307tL, boolean z, Function2 function2, int i) {
        boolean z2;
        boolean z3;
        boolean z4 = z;
        if ((i & 2) != 0) {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZIZ(EnumC775910Uc9.LINK_MIC.getModuleName(), enumC2005307tL.getFeatureName(), z4, z2, z3, function2);
    }

    public static void LJ(EnumC776080UcQ enumC776080UcQ, boolean z, Function2 function2, int i) {
        boolean z2;
        boolean z3;
        boolean z4 = z;
        if ((i & 2) != 0) {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZIZ(EnumC775910Uc9.PUBLIC_SCREEN.getModuleName(), enumC776080UcQ.getFeatureName(), z4, z2, z3, function2);
    }

    public static void LIZIZ(String str, String str2, boolean z, boolean z2, boolean z3, Function2 function2) {
        LifecycleCoroutineScope lifecycleScope;
        CoroutineContext coroutineContext;
        if (!BroadcastNewStableModeSetting.INSTANCE.enable()) {
            return;
        }
        LifecycleOwner lifecycleOwner = LIZJ;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            if (z2) {
                C1DFH c1dfh = C0PEM.LIZ;
                coroutineContext = C2107308Nj.LIZ;
            } else {
                coroutineContext = C0PEM.LIZJ;
            }
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, coroutineContext, null, new C776010UcJ(str, str2, null, function2, z), 2);
        }
        if (!z3 && anonymousClass0956LIZLLL != null) {
            LJFF.put(str2, anonymousClass0956LIZLLL);
        }
    }
}
