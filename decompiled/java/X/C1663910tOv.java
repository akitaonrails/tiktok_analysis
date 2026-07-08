package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.v;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663910tOv extends AbstractC1585810rMx {
    public boolean LL;
    public boolean LLILLJJLI;
    public final /* synthetic */ v LLILLL;

    public C1663910tOv(v vVar) {
        this.LLILLL = vVar;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        Object tag;
        if (i == 0 && this.LL) {
            this.LL = false;
            v vVar = this.LLILLL;
            vVar.getClass();
            this.LLILLJJLI = false;
            AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(vVar, 423);
            View viewLJFF = LJFF(recyclerView.getLayoutManager());
            if (viewLJFF != null && (tag = viewLJFF.getTag()) != null && (tag instanceof AbstractC1663570tON) && (tag instanceof AbstractC1663570tON)) {
                awS604S0100000_25.invoke(tag);
            }
            this.LLILLL.LLLLLLL();
            return;
        }
        if (2 == i) {
            this.LL = true;
            this.LLILLJJLI = true;
            this.LLILLL.LLLLLLLLL("STATE_PREVIEW_NONE");
        } else {
            if (i != 1) {
                return;
            }
            this.LLILLJJLI = true;
            this.LLILLL.LLLLLLLLL("STATE_PREVIEW_NONE");
        }
    }
}
