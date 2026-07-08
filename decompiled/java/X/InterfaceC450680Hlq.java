package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;

/* JADX INFO: renamed from: X.0Hlq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC450680Hlq extends LifecycleObserver {
    void CC(String str);

    void Id();

    void fU0(C451030HmP c451030HmP);

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy();

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume();

    void zm(CommentPersonalizedEmoji commentPersonalizedEmoji);
}
