package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14g3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20325714g3 extends C09AY implements Function1<Map<String, String>, Unit> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20325714g3(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, String> map) {
        map.put("duration", String.valueOf(this.LL));
        return Unit.LIZ;
    }
}
