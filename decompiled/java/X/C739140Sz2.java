package X;

import com.ss.android.ugc.aweme.feed.controller.BaseController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Sz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739140Sz2 {
    public final List<BaseController> LIZ = new ArrayList();

    public final void LIZ(BaseController baseController) {
        if (!((ArrayList) this.LIZ).contains(baseController)) {
            ((ArrayList) this.LIZ).add(baseController);
        }
    }

    public final void LIZIZ(String str) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((BaseController) it2.next()).mEnterMethodValue = str;
        }
    }

    public final void LIZJ(String str) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((BaseController) it2.next()).mEventType = str;
        }
    }

    public final void LIZLLL(int i) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((BaseController) it2.next()).mPageType = i;
        }
    }

    public final void LJ(String str) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((BaseController) it2.next()).mPreviousPage = str;
        }
    }
}
