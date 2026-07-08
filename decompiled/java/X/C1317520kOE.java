package X;

import com.lynx.react.bridge.Callback;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;

/* JADX INFO: renamed from: X.0kOE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317520kOE extends AbstractC1317530kOF {
    public final /* synthetic */ Callback LJ;
    public final /* synthetic */ UIListContainer LJFF;

    @Override // X.AbstractC1317530kOF
    public final boolean LIZ(int i) {
        if (i > 0) {
            if (((C1317480kOA) this.LJFF.mView).LIZ(1)) {
                return true;
            }
        } else if (i < 0 && ((C1317480kOA) this.LJFF.mView).LIZ(-1)) {
            return true;
        }
        return false;
    }

    public C1317520kOE(UIListContainer uIListContainer, Callback callback) {
        this.LJFF = uIListContainer;
        this.LJ = callback;
    }
}
