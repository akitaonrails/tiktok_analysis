package X;

import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.03n7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C947503n7 extends AbstractC947703n9<C945403mm, AbstractC947203n4> {
    public final C947403n6 LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.03n6] */
    public C947503n7(final C945403mm c945403mm) {
        super(c945403mm);
        this.LIZLLL = new AbstractC947903nB<AbstractC947203n4>() { // from class: X.03n6
            @Override // X.AbstractC947903nB
            public final void LIZ(ViewDataBinding viewDataBinding) {
                C944103mZ c944103mZ;
                if (viewDataBinding != null && (c944103mZ = c945403mm.LLIZ) != null) {
                    Iterator it2 = ((ArrayList) c944103mZ.LIZ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC944303mb) it2.next()).LIZ(viewDataBinding.LLILZ);
                    }
                }
            }
        };
    }
}
