package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1899407cG extends C09AY implements Function1<Map.Entry<? extends String, ? extends Long>, Boolean> {
    public C1899407cG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<? extends String, ? extends Long> entry) {
        return Boolean.valueOf(!C1734800vFG.LIZIZ(entry.getValue().longValue()));
    }
}
