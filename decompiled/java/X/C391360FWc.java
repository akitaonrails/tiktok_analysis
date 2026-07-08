package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391360FWc {
    public static final void LIZ(String str, Function0<Unit> function0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        function0.invoke();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (!TextUtils.isEmpty(str) && jCurrentTimeMillis2 > 2) {
            ConcurrentHashMap<String, List<Long>> concurrentHashMap = C1411560mpu.LIZJ;
            if (concurrentHashMap.get(str) == null) {
                concurrentHashMap.put(str, new ArrayList());
            }
            concurrentHashMap.get(str).add(Long.valueOf(jCurrentTimeMillis2));
        }
    }

    public static final void LIZJ(AbstractC1452680nuE abstractC1452680nuE, Function0 function0) {
        if (abstractC1452680nuE.LIZ.LIZ.invoke().booleanValue()) {
            LIZ("", new AwS549S0100000_5(function0, (Function0<Unit>) 1067));
        }
    }

    public static final void LJ(String str, Function0<Unit> function0) {
        if (!C1411560mpu.LIZIZ) {
            LIZ(str, new AwS549S0100000_5(function0, (Function0<Unit>) 1066));
        }
    }

    public static final void LIZLLL(String str, InterfaceC1452170ntP interfaceC1452170ntP, Function1<? super C348100Dkm, Unit> function1) {
        if (!C1411560mpu.LIZIZ) {
            LIZ(str, new AwS406S0200000_5(interfaceC1452170ntP, (InterfaceC1452170ntP) function1, (Function1<? super C348100Dkm, Unit>) 102));
        }
    }

    public static final void LIZIZ(AbstractC1452680nuE abstractC1452680nuE, String str, InterfaceC1452170ntP interfaceC1452170ntP, Function1<? super C348100Dkm, Unit> function1) {
        if (abstractC1452680nuE.LIZ.LIZ.invoke().booleanValue()) {
            LIZ(str, new AwS406S0200000_5(interfaceC1452170ntP, (InterfaceC1452170ntP) function1, (Function1<? super C348100Dkm, Unit>) 103));
        }
    }
}
