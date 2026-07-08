package X;

import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19464811Di {
    public final C19465511Dp LIZ;
    public final List<JediViewHolderProxy> LIZIZ = new ArrayList();

    public final void LIZ() {
        if (((ArrayList) this.LIZIZ).size() == 0) {
            return;
        }
        for (JediViewHolderProxy jediViewHolderProxy : (ArrayList) this.LIZIZ) {
            if (jediViewHolderProxy != null) {
                this.LIZ.LIZ(jediViewHolderProxy);
            }
        }
        ((ArrayList) this.LIZIZ).clear();
    }

    public C19464811Di(C19465511Dp c19465511Dp) {
        this.LIZ = c19465511Dp;
    }

    public final void LIZIZ(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i >= 0 && i <= ((ArrayList) this.LIZIZ).size()) {
            if (jediViewHolderProxy != null) {
                if (i < ((ArrayList) this.LIZIZ).size()) {
                    ListProtector.set(this.LIZIZ, i, jediViewHolderProxy);
                    return;
                } else {
                    ListProtector.add(this.LIZIZ, i, jediViewHolderProxy);
                    return;
                }
            }
            ListProtector.add(this.LIZIZ, i, null);
        }
    }
}
