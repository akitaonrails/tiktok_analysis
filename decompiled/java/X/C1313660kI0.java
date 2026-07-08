package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0kI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313660kI0 extends AbstractC1313500kHk<C1313670kI1> {
    public final C1313670kI1 LLLLZI;

    public final void LJZ() {
        for (SDUIBaseUI sDUIBaseUI = this.LLLLLLLLL; sDUIBaseUI != null; sDUIBaseUI = sDUIBaseUI.LLILLJJLI) {
            sDUIBaseUI.LLIZ = null;
        }
        this.LLLLLLLLL = null;
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((SDUIBaseUI) it2.next()).LJJZZI(null);
        }
        ((ArrayList) this.LLIZLLLIL).clear();
        T t = this.LLLLLILLIL;
        if (t != 0) {
            C786410Ut5.LJJJJI((ViewGroup) t);
        }
        this.LLLLZI.clearMeaningfulFlag();
    }

    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI, X.InterfaceC1317060kNU
    public final boolean LIZJ() {
        boolean zLIZJ = super.LIZJ();
        if (zLIZJ) {
            return zLIZJ;
        }
        this.LLILZ.getClass();
        return false;
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJJIZ() {
        super.LJJLIIIJJIZ();
        this.LLLLZI.notifyMeaningfulLayout();
    }

    @Override // X.AbstractC1313500kHk, X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJJJLI() {
        super.LJJJJLI();
    }

    @Override // X.AbstractC1313520kHm
    public final View LJLJJL(Context context) {
        return this.LLLLZI;
    }

    public C1313660kI0(AbstractC1317090kNX abstractC1317090kNX, C1317080kNW c1317080kNW) {
        super(abstractC1317090kNX);
        this.LLLLZI = c1317080kNW;
        super.LJJJJLI();
    }
}
