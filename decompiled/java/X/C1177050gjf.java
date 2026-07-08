package X;

import java.lang.ref.SoftReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gjf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177050gjf extends C09AY implements Function2<C1157370gDv, SoftReference<C1177000gja>, Unit> {
    public C1177050gjf() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1157370gDv c1157370gDv, SoftReference<C1177000gja> softReference) {
        C1177000gja c1177000gja = softReference.get();
        if (c1177000gja != null) {
            c1177000gja.LJIIJ = null;
        }
        return Unit.LIZ;
    }
}
