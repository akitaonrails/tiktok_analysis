package X;

import android.view.View;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.notification.view.NotificationTabProtocol;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620940sHc implements InterfaceC849390XTt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void LIZIZ$0(C1620940sHc c1620940sHc) {
    }

    public static final /* synthetic */ void LIZIZ$1(C1620940sHc c1620940sHc) {
    }

    public static final /* synthetic */ void LIZIZ$2(C1620940sHc c1620940sHc) {
    }

    public static final void LIZIZ$3(C1620940sHc c1620940sHc) {
    }

    public static final /* synthetic */ void LIZIZ$4(C1620940sHc c1620940sHc) {
    }

    public static final /* synthetic */ void LIZIZ$5(C1620940sHc c1620940sHc) {
    }

    public static final /* synthetic */ void LIZIZ$6(C1620940sHc c1620940sHc) {
    }

    @Override // X.InterfaceC849390XTt
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                break;
            case 1:
                LIZ$1(this);
                break;
            case 2:
                LIZ$2(this);
                break;
            case 3:
                LIZ$3(this);
                break;
            case 4:
                LIZ$4(this);
                break;
            case 5:
                LIZ$5(this);
                break;
            case 6:
                LIZ$6(this);
                break;
        }
    }

    @Override // X.InterfaceC849390XTt
    public final /* synthetic */ void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            case 4:
                LIZIZ$4(this);
                break;
            case 5:
                LIZIZ$5(this);
                break;
            case 6:
                LIZIZ$6(this);
                break;
        }
    }

    public static final void LIZ$0(C1620940sHc c1620940sHc) {
        if (((C101N) c1620940sHc.l0).LJI()) {
            C1440005kM.LIZ(new C1588880rRu("login", false));
        } else {
            C1440005kM.LIZ(new IEvent() { // from class: X.0rpN
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
    }

    public static final void LIZ$1(C1620940sHc c1620940sHc) {
        ((View.OnClickListener) ((NotificationTabProtocol) c1620940sHc.l0).LLILZ.getValue()).onClick(null);
    }

    public static final void LIZ$2(C1620940sHc c1620940sHc) {
        TabChangeManager.xQ2(C343710Ddh.LIZ(C1388190mED.LIZIZ(((ViewOnClickListenerC1584810rLL) c1620940sHc.l0).LL)), "HOME", false, null, 30);
    }

    public static final void LIZ$3(C1620940sHc c1620940sHc) {
        ((Function0) c1620940sHc.l0).invoke();
    }

    public static final void LIZ$4(C1620940sHc c1620940sHc) {
        TabChangeManager tabChangeManager = (TabChangeManager) c1620940sHc.l0;
        if (tabChangeManager != null) {
            TabChangeManager.xQ2(tabChangeManager, "FRIENDS_TAB", false, null, 30);
        }
    }

    public static final void LIZ$5(C1620940sHc c1620940sHc) {
        TabChangeManager.xQ2(C343710Ddh.LIZ(C1388190mED.LIZIZ(((ViewOnClickListenerC1600510rkf) c1620940sHc.l0).LL)), "HOME", false, null, 30);
    }

    public static final void LIZ$6(C1620940sHc c1620940sHc) {
        TabChangeManager.xQ2(C343710Ddh.LIZ(C1388190mED.LIZIZ(((ViewOnClickListenerC1600510rkf) c1620940sHc.l0).LL)), "HOME", false, null, 30);
    }

    public C1620940sHc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
