package X;

import Y.ARunnableS32S0101000_21;
import com.bytedance.common.meteor.control.BaseHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0m9B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1385070m9B {
    public final List<InterfaceC1385080m9C> LIZ = new ArrayList();
    public BaseHandler LIZIZ;

    public final void LIZ(int i) {
        for (InterfaceC1385080m9C interfaceC1385080m9C : (ArrayList) this.LIZ) {
            BaseHandler baseHandler = this.LIZIZ;
            if (baseHandler != null) {
                C786410Ut5.LJJZZIII(baseHandler, new ARunnableS32S0101000_21(i, interfaceC1385080m9C, 0));
            }
        }
    }
}
