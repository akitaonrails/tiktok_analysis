package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;

/* JADX INFO: renamed from: X.0LvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558480LvK implements InterfaceC537370L5r {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ IDraftListener LIZJ;

    @Override // X.InterfaceC537370L5r
    public final boolean LIZIZ() {
        int i = this.LIZIZ;
        return (i == 1000 || i == 9 || i == 7 || i == 13) ? false : true;
    }

    @Override // X.InterfaceC537370L5r
    public final LifecycleOwner getLifecycleOwner() {
        return C629480OmY.LIZLLL(this.LIZ);
    }

    @Override // X.InterfaceC537370L5r
    public final IDraftListener LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC537370L5r
    public final Context getContext() {
        return this.LIZ;
    }

    public C558480LvK(Activity activity, int i, DraftListenerAdapter draftListenerAdapter) {
        this.LIZ = activity;
        this.LIZIZ = i;
        this.LIZJ = draftListenerAdapter;
    }
}
