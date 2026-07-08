package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.component.video.NimbleVideoListAssem;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860940yWi extends C0DXR {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ NimbleVideoListAssem LLILZ;

    public C1860940yWi(int i, int i2, int i3, NimbleVideoListAssem nimbleVideoListAssem) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = nimbleVideoListAssem;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        Pair pair;
        boolean zLIZLLL;
        Object first;
        Object second;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            pair = new Pair(Integer.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI / 2));
        } else if (childAdapterPosition == c21673919s1.LIZIZ() - 1) {
            pair = new Pair(Integer.valueOf(this.LLILLJJLI / 2), Integer.valueOf(this.LLILLL));
        } else {
            pair = new Pair(Integer.valueOf(this.LLILLJJLI / 2), Integer.valueOf(this.LLILLJJLI / 2));
        }
        INimbleVideoListDependAbility iNimbleVideoListDependAbilitySp = this.LLILZ.sp();
        if (iNimbleVideoListDependAbilitySp != null) {
            zLIZLLL = iNimbleVideoListDependAbilitySp.Ad2();
        } else {
            zLIZLLL = C426750GoL.LIZLLL(recyclerView.getContext());
        }
        if (zLIZLLL) {
            first = pair.getSecond();
        } else {
            first = pair.getFirst();
        }
        rect.left = ((Number) first).intValue();
        if (zLIZLLL) {
            second = pair.getFirst();
        } else {
            second = pair.getSecond();
        }
        rect.right = ((Number) second).intValue();
    }
}
