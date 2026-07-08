package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import java.util.Map;

/* JADX INFO: renamed from: X.0K99, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K99 implements InterfaceC1102120emo {
    public final long LIZ;
    public final String LIZIZ;
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LIZJ;

    @Override // X.InterfaceC1102120emo
    public final String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final void LJI() {
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIIIIZZ() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final Boolean LJIIL() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final boolean LJIILIIL() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final /* bridge */ /* synthetic */ String LJJJ() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final String getBusinessName() {
        return "sub_only_preview_card";
    }

    @Override // X.InterfaceC1102120emo
    public final Map<String, String> getExtras() {
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final C1099880ejC LJIIIZ() {
        View view = this.LIZJ.getView();
        return new C1099880ejC(view != null ? view.hasWindowFocus() : false);
    }

    @Override // X.InterfaceC1102120emo
    public final View LJIILJJIL() {
        View view = this.LIZJ.getView();
        if (view != null) {
            return view.getRootView();
        }
        return null;
    }

    @Override // X.InterfaceC1102120emo
    public final EnumC245600xC LIZLLL() {
        return C245700xD.LIZ(this);
    }

    @Override // X.InterfaceC1102120emo
    public final int getComponentType() {
        return ((SubscriptionTrialLiveCardWidget) LJII()).getComponentType();
    }

    @Override // X.InterfaceC1102120emo
    public final InterfaceC1102150emr LJII() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1102120emo
    public final long LJIIJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1102120emo
    public final String getId() {
        return this.LIZIZ;
    }

    public C0K99(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget, long j, String str) {
        this.LIZJ = subscriptionTrialLiveCardWidget;
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
