package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.services.draft.AVDraftMigrateService;
import com.ss.android.ugc.aweme.services.external.ui.M2DraftMigrationViewHolder;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0M6M, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0M6M extends RecyclerView.ViewHolder implements M2DraftMigrationViewHolder {
    public final C19EG LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    @Override // com.ss.android.ugc.aweme.services.external.ui.BaseLifecycleViewHolder
    public final void onBind() {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.BaseLifecycleViewHolder
    public final void onViewAttachedFromWindow() {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.BaseLifecycleViewHolder
    public final void onViewDetachedFromWindow() {
    }

    public final AVDraftMigrateService I5() {
        return (AVDraftMigrateService) this.LLILLL.getValue();
    }

    public C0M6M(View view, C19EG c19eg) {
        super(view);
        this.LL = c19eg;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(459));
        this.LLILLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(458));
    }
}
