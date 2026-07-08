package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentViewModelImpl;

/* JADX INFO: renamed from: X.0TAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742500TAq {
    public static CommentViewModelImpl LIZ(C19EG c19eg) {
        if (c19eg != null && !c19eg.isDestroyed() && !c19eg.isFinishing()) {
            return (CommentViewModelImpl) ViewModelProviders.of(c19eg).get(CommentViewModelImpl.class);
        }
        return null;
    }
}
