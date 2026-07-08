package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00e2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C126800e2 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ List<Long> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126800e2(List<Long> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!this.LL.isEmpty());
    }
}
