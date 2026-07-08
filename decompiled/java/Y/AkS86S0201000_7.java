package Y;

import X.C11NZ;
import X.InterfaceC1487280oo2;
import X.InterfaceC500500Jk0;
import com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService;
import com.bytedance.android.livesdk.livesetting.privilege.LiveEnigmaRefreshOptimizationTimerSetting;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AkS86S0201000_7 implements InterfaceC1487280oo2 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS86S0201000_7 akS86S0201000_7, Object obj) {
        Pair pair = (Pair) obj;
        Throwable th = (Throwable) pair.getFirst();
        Integer num = (Integer) pair.getSecond();
        ((EnigmaService) akS86S0201000_7.l0).getClass();
        if (num.intValue() < akS86S0201000_7.i2) {
            Function0 function0 = (Function0) akS86S0201000_7.l1;
            if (function0 != null) {
                function0.invoke();
            }
            ((EnigmaService) akS86S0201000_7.l0).getClass();
            return C11NZ.LJLJJLL(LiveEnigmaRefreshOptimizationTimerSetting.INSTANCE.getRetryInterval(), TimeUnit.MILLISECONDS);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$1(AkS86S0201000_7 akS86S0201000_7, Object obj) {
        return ((C11NZ) obj).LJLLL(C11NZ.LJJLIIIJILLIZJL(1, akS86S0201000_7.i2), new InterfaceC500500Jk0() { // from class: X.0Jk2
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj2, Object obj3) {
                return new Pair(obj2, obj3);
            }
        }).LJJJ(new AkS86S0201000_7(akS86S0201000_7.i2, (EnigmaService) akS86S0201000_7.l0, (Function0) akS86S0201000_7.l1, 0), false).LJJL(new InterfaceC1487280oo2() { // from class: X.01Am
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                return C11NZ.LJJIJLIJ(new C290301An());
            }
        });
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AkS86S0201000_7(int r2, com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService r3, kotlin.jvm.functions.Function0 r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.i2 = r2
            r0.l0 = r3
            r0.l1 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.i2 = r2
            r0.l1 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AkS86S0201000_7.<init>(int, com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService, kotlin.jvm.functions.Function0, int):void");
    }
}
