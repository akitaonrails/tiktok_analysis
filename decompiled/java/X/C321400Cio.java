package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321400Cio extends C09AY implements Function1<EnumC12936054k, Unit> {
    public final /* synthetic */ C013C LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321400Cio(C013C c013c) {
        super(1);
        this.LL = c013c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC12936054k enumC12936054k) {
        this.LL.element = true;
        ConcurrentHashMap<EnumC12936054k, C0CUC> concurrentHashMap = C0CUB.LIZ;
        concurrentHashMap.get(enumC12936054k);
        concurrentHashMap.remove(enumC12936054k);
        return Unit.LIZ;
    }
}
