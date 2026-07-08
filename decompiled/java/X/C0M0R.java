package X;

import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;

/* JADX INFO: renamed from: X.0M0R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M0R extends DraftListenerAdapter {
    public final /* synthetic */ DraftFragment LIZ;

    public C0M0R(DraftFragment draftFragment) {
        this.LIZ = draftFragment;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.IDraftListener
    public final void onUpdated(IDraftListener.UpdateParams updateParams) {
        this.LIZ.dS();
    }
}
