package X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883120z6U extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1883100z6S LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883120z6U(C1883100z6S c1883100z6S) {
        super(0);
        this.LL = c1883100z6S;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1883100z6S c1883100z6S = this.LL;
        ViewGroup viewGroup = c1883100z6S.LLJ;
        if (viewGroup != null) {
            Iterator it2 = ((ArrayList) c1883100z6S.LLJILJIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1883040z6M) it2.next()).LJIILJJIL(viewGroup);
            }
        }
        this.LL.LJIILIIL();
        return Unit.LIZ;
    }
}
