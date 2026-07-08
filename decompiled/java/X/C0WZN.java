package X;

import com.bytedance.pumbaa.aspect.apicalling.base.ProcessorConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS257S0300000_13;
import kotlin.jvm.internal.AwS414S0200000_13;

/* JADX INFO: renamed from: X.0WZN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WZN extends C09AY implements Function0<C0WSU> {
    public final /* synthetic */ C0WZO LL;
    public final /* synthetic */ ProcessorConfig LLILLJJLI;
    public final /* synthetic */ C0WZJ LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WZN(C0WZO c0wzo, ProcessorConfig processorConfig, C0WZJ c0wzj, boolean z, C259800zU<Boolean> c259800zU) {
        super(0);
        this.LL = c0wzo;
        this.LLILLJJLI = processorConfig;
        this.LLILLL = c0wzj;
        this.LLILZ = z;
        this.LLILZIL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0WSU invoke() {
        C0WZO c0wzo = this.LL;
        ProcessorConfig processorConfig = this.LLILLJJLI;
        C0WZJ c0wzj = this.LLILLL;
        boolean z = this.LLILZ;
        Boolean bool = this.LLILZIL.element;
        c0wzo.getClass();
        int i = c0wzj.LIZ;
        if (z) {
            c0wzj.LJIIIZ = C0WZM.INTERCEPT;
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("PB_API_CALLING", new AwS414S0200000_13(c0wzo, c0wzj, 12), 3, null);
            Iterator<C0WZU> it2 = c0wzo.LIZ.iterator();
            while (it2.hasNext()) {
                C0WSU c0wsuLIZ = it2.next().LIZ(c0wzj);
                if (c0wsuLIZ != null) {
                    CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                    C0WSW.LIZ("PB_API_CALLING", new AwS414S0200000_13(c0wzo, c0wzj, 13), 6, null);
                    return c0wsuLIZ;
                }
            }
            if (processorConfig.skipInterceptListWhenGuard) {
                return null;
            }
        }
        if (bool != null ? bool.booleanValue() : processorConfig.LIZ(i)) {
            c0wzj.LJIIIZ = C0WZM.GUARD;
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList3 = C0WSW.LIZ;
            C0WSW.LIZ("PB_API_CALLING", new AwS414S0200000_13(c0wzo, c0wzj, 14), 3, null);
            Iterator<C0WZU> it3 = c0wzo.LIZIZ.iterator();
            while (it3.hasNext()) {
                C0WSU c0wsuLIZ2 = it3.next().LIZ(c0wzj);
                if (c0wsuLIZ2 != null) {
                    CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList4 = C0WSW.LIZ;
                    C0WSW.LIZ("PB_API_CALLING", new AwS257S0300000_13(c0wzo, c0wsuLIZ2, c0wzj, 6), 5, null);
                    return null;
                }
            }
        } else {
            C0WSC c0wsc = c0wzj.LJIIIIZZ;
            if (c0wsc != null) {
                c0wsc.setStatus("not_sampled");
                return null;
            }
        }
        return null;
    }
}
