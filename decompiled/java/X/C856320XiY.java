package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0XiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856320XiY {
    public final View LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1289));
    public final Set<InterfaceC855430Xh7> LIZJ = new LinkedHashSet();
    public final ViewOnScrollChangeListenerC855440Xh8 LIZLLL = new View.OnScrollChangeListener() { // from class: X.0Xh8
        @Override // android.view.View.OnScrollChangeListener
        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            Iterator<InterfaceC855430Xh7> it2 = this.LIZ.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Xh8] */
    public C856320XiY(View view) {
        this.LIZ = view;
    }
}
