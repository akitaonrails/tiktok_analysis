package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.13Fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19979613Fi<E> extends AbstractC19980113Fn<E, List<? extends E>, ArrayList<E>> {
    public final C19979513Fh LIZIZ;

    @Override // X.AbstractC19985413Ho
    public final Object LIZ() {
        return new ArrayList();
    }

    @Override // X.AbstractC19985213Hm, X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13Fh] */
    public C19979613Fi(C13HG<E> c13hg) {
        super(c13hg);
        final InterfaceC19983313Gt descriptor = c13hg.getDescriptor();
        this.LIZIZ = new AbstractC19979313Ff(descriptor) { // from class: X.13Fh
            @Override // X.InterfaceC19983313Gt
            public final String LJI() {
                return "kotlin.collections.ArrayList";
            }
        };
    }

    @Override // X.AbstractC19985413Ho
    public final int LIZIZ(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // X.AbstractC19985413Ho
    public final Object LJI(Object obj) {
        return new ArrayList((Collection) null);
    }

    @Override // X.AbstractC19985413Ho
    public final Object LJII(Object obj) {
        return obj;
    }

    @Override // X.AbstractC19985213Hm
    public final void LJIIIIZZ(int i, Object obj, Object obj2) {
        ListProtector.add((ArrayList) obj, i, obj2);
    }
}
