package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Lpf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554970Lpf {
    public final WeakReference<Context> LIZ;
    public final LifecycleOwner LIZIZ;
    public final ProgressDialogC1399790mWv LIZJ;
    public final AwemeDraft LIZLLL;
    public final AwemeDraft LJ;
    public final IDraftListener LJFF;

    public C554970Lpf(WeakReference<Context> weakReference, LifecycleOwner lifecycleOwner, ProgressDialogC1399790mWv progressDialogC1399790mWv, AwemeDraft awemeDraft, AwemeDraft awemeDraft2, IDraftListener iDraftListener) {
        this.LIZ = weakReference;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = progressDialogC1399790mWv;
        this.LIZLLL = awemeDraft;
        this.LJ = awemeDraft2;
        this.LJFF = iDraftListener;
    }
}
