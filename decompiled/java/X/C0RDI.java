package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RDI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RDI extends C09AY implements Function0<C0RDH> {
    public C0RDI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0RDH] */
    @Override // kotlin.jvm.functions.Function0
    public final C0RDH invoke() {
        return new C0RDF() { // from class: X.0RDH
            public final Set<AssemViewModel<?>> LIZ = new LinkedHashSet();

            @Override // X.C0RDF
            public final Set<AssemViewModel<?>> LIZ() {
                return this.LIZ;
            }
        };
    }
}
