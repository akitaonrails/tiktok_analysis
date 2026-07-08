package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0J7X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0J7X {
    void LIZ(String str, Observer<Pair<Long, SlimRoom>> observer);

    void LIZIZ(C19EG c19eg, Lifecycle.State state);

    void LIZJ(String str, LifecycleOwner lifecycleOwner, Observer<Pair<Long, SlimRoom>> observer);
}
