package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706790Rnx extends C09AY implements Function0<Map<Integer, C0SR9<?, ?>>> {
    public final /* synthetic */ C0SR4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C706790Rnx(C0SR4 c0sr4) {
        super(0);
        this.LL = c0sr4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Integer, C0SR9<?, ?>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C1618440sDa.LIZIZ.LJJIIJ().LJ(this.LL));
        return linkedHashMap;
    }
}
