package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0rS7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589010rS7 {
    public static final C01GW LIZ;

    static {
        C1589010rS7 c1589010rS7 = new C1589010rS7();
        LIZ = C452501pT.LIZIZ(new C1589050rSB());
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL == null || eventBusLIZLLL.LJIIJ(c1589010rS7)) {
            return;
        }
        eventBusLIZLLL.LJIJJ(c1589010rS7);
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        String aid;
        LiveData liveData = (LiveData) LIZ.getValue();
        Aweme aweme = c1584420rKi.LIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        liveData.setValue(aid);
    }
}
