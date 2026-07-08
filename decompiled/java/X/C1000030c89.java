package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0c89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000030c89 {
    public final FrameLayout LIZ;
    public Aweme LIZIZ;
    public AdProductTile LIZJ;
    public boolean LIZLLL;
    public int LJ = -1;
    public AbstractC999780c7k LJFF;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJI;
    public final C1029670ctx LJII;
    public final C1000040c8A LJIIIIZZ;

    public final void LIZIZ() {
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LJFF = null;
        this.LIZLLL = false;
        this.LJ = -1;
        C786410Ut5.LJZ(8, this.LIZ);
        this.LJIIIIZZ.LL = false;
        C786410Ut5.LJJJJIZL(this.LIZ);
    }

    public C1000030c89(FrameLayout frameLayout) {
        String strK0;
        this.LIZ = frameLayout;
        Context context = frameLayout.getContext();
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            strK0 = iAdLandPagePreloadService.K0("lynx_feed");
        } else {
            strK0 = null;
        }
        this.LJII = new C1029670ctx(context, strK0);
        this.LJIIIIZZ = new C1000040c8A();
    }

    public final void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        ViewParent parent;
        ViewGroup viewGroup = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            if (kitView != null) {
                kitView.LIZ("event_card_show", null);
            }
            parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup == this.LIZ) {
            return;
        }
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
        }
        C786410Ut5.LJJJJIZL(this.LIZ);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new FrameLayout.LayoutParams(-1, -1));
        }
        this.LIZ.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCardStatusEvent(C997410c3v c997410c3v) {
        int iHashCode;
        int i = c997410c3v.LIZIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            iHashCode = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.hashCode();
        } else {
            iHashCode = 0;
        }
        if (i != iHashCode) {
            return;
        }
        int i2 = c997410c3v.LIZ;
        this.LJ = i2;
        if (i2 == 1) {
            this.LIZLLL = true;
        }
    }
}
