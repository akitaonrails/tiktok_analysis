package Y;

import X.C19EG;
import android.content.Intent;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.inbox.InboxChangeTabInterceptor;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.ProfileChangeTabInterceptor;
import kotlin.Pair;

/* JADX INFO: loaded from: classes25.dex */
public class AObserverS81S0400000_24 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS81S0400000_24 aObserverS81S0400000_24, Object obj) {
        Pair pair = (Pair) obj;
        if (((Boolean) pair.getFirst()).booleanValue() && ((Boolean) pair.getSecond()).booleanValue()) {
            ((InboxChangeTabInterceptor) aObserverS81S0400000_24.l0).LIZ((C19EG) aObserverS81S0400000_24.l1, (Intent) aObserverS81S0400000_24.l2);
            ((ScrollSwitchStateManager) aObserverS81S0400000_24.l3).LLJJIJI.removeObserver(aObserverS81S0400000_24);
        }
    }

    public static final void onChanged$1(AObserverS81S0400000_24 aObserverS81S0400000_24, Object obj) {
        Pair pair = (Pair) obj;
        if (((Boolean) pair.getFirst()).booleanValue() && ((Boolean) pair.getSecond()).booleanValue()) {
            ((ProfileChangeTabInterceptor) aObserverS81S0400000_24.l0).LIZ((C19EG) aObserverS81S0400000_24.l1, (Intent) aObserverS81S0400000_24.l2);
            ((ScrollSwitchStateManager) aObserverS81S0400000_24.l3).LLJJIJI.removeObserver(aObserverS81S0400000_24);
        }
    }

    public AObserverS81S0400000_24(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
