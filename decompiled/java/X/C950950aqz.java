package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0aqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C950950aqz extends C2217421BqW implements Function2<List<? extends C950750aqf>, Boolean, Unit> {
    public C950950aqz(Object obj) {
        super(2, obj, C950920aqw.class, "handleResult", "handleResult(Ljava/util/List;Z)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends C950750aqf> list, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C950920aqw) this.receiver).L5(list, zBooleanValue);
        return Unit.LIZ;
    }
}
