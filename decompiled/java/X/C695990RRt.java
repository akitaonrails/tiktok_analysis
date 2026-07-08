package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RRt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695990RRt extends C09AY implements Function2<AbstractC634910OvJ<?>, Boolean, Unit> {
    public final /* synthetic */ List<AbstractC634910OvJ<?>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C695990RRt(List<AbstractC634910OvJ<?>> list) {
        super(2);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC634910OvJ<?> abstractC634910OvJ, Boolean bool) {
        bool.booleanValue();
        this.LL.add(abstractC634910OvJ);
        return Unit.LIZ;
    }
}
