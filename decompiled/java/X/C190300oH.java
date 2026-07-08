package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS166S0400000_6;

/* JADX INFO: renamed from: X.00oH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C190300oH extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ AtomicBoolean LL;
    public final /* synthetic */ ConcurrentHashMap<String, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ Function2<Boolean, Map<String, String>, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C190300oH(AtomicBoolean atomicBoolean, ConcurrentHashMap concurrentHashMap, String str, C118300cf c118300cf, AwS166S0400000_6 awS166S0400000_6) {
        super(2);
        this.LL = atomicBoolean;
        this.LLILLJJLI = concurrentHashMap;
        this.LLILLL = str;
        this.LLILZ = c118300cf;
        this.LLILZIL = awS166S0400000_6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        boolean zBooleanValue = bool.booleanValue();
        this.LL.compareAndSet(true, zBooleanValue);
        if (zBooleanValue) {
            this.LLILLJJLI.put(this.LLILLL, str);
        }
        C118300cf c118300cf = this.LLILZ;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i == 0) {
            this.LLILZIL.invoke(Boolean.valueOf(this.LL.get()), C2097608Jq.LJIIZILJ(this.LLILLJJLI));
        }
        return Unit.LIZ;
    }
}
