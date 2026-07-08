package X;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.06hN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1676306hN {
    public final ArrayList<C1677306hX> LIZ = new ArrayList<>();
    public InterfaceC1677406hY LIZIZ;

    public final void LIZ(C1677306hX c1677306hX) {
        if (C06RG.LIZ(c1677306hX.LIZ)) {
            InterfaceC1677406hY interfaceC1677406hY = this.LIZIZ;
            if (interfaceC1677406hY != null) {
                String promptId = interfaceC1677406hY.getPromptId();
                if (promptId == null) {
                    promptId = "";
                }
                c1677306hX.LIZ(new C1677706hb(promptId));
                return;
            }
            C1717206ny.LIZ(c1677306hX, this.LIZ);
            return;
        }
        c1677306hX.LIZ(null);
        if (this.LIZIZ != null) {
            return;
        }
        this.LIZIZ = c1677306hX.LIZ;
        Iterator<C1677306hX> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(new C1677706hb(c1677306hX.LIZ.getPromptId()));
        }
        this.LIZ.clear();
    }
}
