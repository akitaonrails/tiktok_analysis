package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;

/* JADX INFO: renamed from: X.0EVF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EVF implements Runnable {
    public final RecyclerView LL;
    public final EditCaptionScene.HighLightLayoutManager LLILLJJLI;
    public final Context LLILLL;
    public final C384570F5z LLILZ;
    public final SafeHandler LLILZIL;

    public final void LIZ() {
        int iFindFirstCompletelyVisibleItemPosition;
        if (this.LL.isShown() && this.LL.getAdapter() != null && this.LLILLL != null && (iFindFirstCompletelyVisibleItemPosition = this.LLILLJJLI.findFirstCompletelyVisibleItemPosition()) != -1) {
            if (iFindFirstCompletelyVisibleItemPosition == 0 || iFindFirstCompletelyVisibleItemPosition == 1) {
                View viewFindViewByPosition = this.LLILLJJLI.findViewByPosition(iFindFirstCompletelyVisibleItemPosition);
                if ((viewFindViewByPosition != null ? viewFindViewByPosition.getBottom() : 0) < ((int) C12ES.LIZJ(52.0f, this.LLILLL))) {
                    iFindFirstCompletelyVisibleItemPosition = Math.min(iFindFirstCompletelyVisibleItemPosition + 2, this.LLILLJJLI.getItemCount() - 1);
                }
            } else {
                iFindFirstCompletelyVisibleItemPosition = Math.min(iFindFirstCompletelyVisibleItemPosition + 2, this.LLILLJJLI.getItemCount() - 1);
            }
            if (!TextUtils.isEmpty(((CaptionUtterance) ListProtector.get(this.LLILZ.LL, iFindFirstCompletelyVisibleItemPosition)).LJ())) {
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InlineCaptionFragment -> ScrollSyncRunnable, position: ");
                sbLIZ.append(iFindFirstCompletelyVisibleItemPosition);
                C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
                this.LLILZ.LLLI(iFindFirstCompletelyVisibleItemPosition);
            }
        }
        this.LLILZIL.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ScrollSyncRunnable@3a7b.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScrollSyncRunnable@3a7b.run");
    }

    public C0EVF(C425240Glu c425240Glu, EditCaptionScene.HighLightLayoutManager highLightLayoutManager, Context context, C384570F5z c384570F5z, SafeHandler safeHandler) {
        this.LL = c425240Glu;
        this.LLILLJJLI = highLightLayoutManager;
        this.LLILLL = context;
        this.LLILZ = c384570F5z;
        this.LLILZIL = safeHandler;
    }
}
