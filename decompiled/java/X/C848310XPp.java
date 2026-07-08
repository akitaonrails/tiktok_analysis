package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848310XPp extends C09AY implements Function1<C848300XPo, Boolean> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848310XPp(List<String> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C848300XPo c848300XPo) {
        return Boolean.valueOf(!this.LL.contains(c848300XPo.LIZ));
    }
}
