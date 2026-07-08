package X;

import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Wu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837940Wu0 extends C09AY implements Function1<C838040WuA, String> {
    public final /* synthetic */ Locale LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C837940Wu0(Locale locale) {
        super(1);
        this.LL = locale;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C838040WuA c838040WuA) {
        return this.LL.getCountry();
    }
}
