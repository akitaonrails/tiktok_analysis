package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0R5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690330R5z {
    public static EventCenter LIZ(ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner, LinkedHashMap linkedHashMap) {
        EventCenter eventCenter = (EventCenter) viewModelProvider.get(EventCenter.class);
        eventCenter.LLILLL = lifecycleOwner;
        return eventCenter;
    }
}
