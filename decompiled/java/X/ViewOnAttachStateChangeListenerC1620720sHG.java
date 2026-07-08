package X;

import Y.ARunnableS124S0100000_24;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.publish.FriendsV3PublishCell;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3InputPanelAbility;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController;
import com.ss.android.ugc.aweme.nimblecard.tako.component.video.NimbleVideoListAssem;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0sHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ViewOnAttachStateChangeListenerC1620720sHG implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC1620720sHG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        FriendsV3InputPanelAbility friendsV3InputPanelAbility = (FriendsV3InputPanelAbility) ((FriendsV3PublishCell) viewOnAttachStateChangeListenerC1620720sHG.l0).LLJJIII.getValue();
        if (friendsV3InputPanelAbility != null) {
            friendsV3InputPanelAbility.vw0(true);
        }
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        ((SlideGuideController) viewOnAttachStateChangeListenerC1620720sHG.l0).LJI(EnumC1600580rkm.LLILZIL);
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        NimbleVideoListAssem nimbleVideoListAssem = (NimbleVideoListAssem) viewOnAttachStateChangeListenerC1620720sHG.l0;
        nimbleVideoListAssem.getClass();
        if (!EventBus.LIZLLL().LJIIJ(nimbleVideoListAssem)) {
            EventBus.LIZLLL().LJIJJ(nimbleVideoListAssem);
        }
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        C1593010rYZ c1593010rYZ = (C1593010rYZ) viewOnAttachStateChangeListenerC1620720sHG.l0;
        HandlerHook.viewPostDelay(c1593010rYZ.LL, new ARunnableS124S0100000_24(c1593010rYZ, 91), 2000L);
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        InterfaceC899440ZQg interfaceC899440ZQg = ((C1598650rhf) viewOnAttachStateChangeListenerC1620720sHG.l0).LLJL;
        if (interfaceC899440ZQg != null) {
            interfaceC899440ZQg.onVisible();
        }
    }

    public static final void onViewAttachedToWindow$6(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        C1610740s1A c1610740s1A = (C1610740s1A) viewOnAttachStateChangeListenerC1620720sHG.l0;
        if (c1610740s1A.LIZIZ) {
            c1610740s1A.LJIIIZ();
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1620720sHG);
        ((C09AE) viewOnAttachStateChangeListenerC1620720sHG.l0).LIZIZ(null);
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        FriendsV3InputPanelAbility friendsV3InputPanelAbility = (FriendsV3InputPanelAbility) ((FriendsV3PublishCell) viewOnAttachStateChangeListenerC1620720sHG.l0).LLJJIII.getValue();
        if (friendsV3InputPanelAbility != null) {
            friendsV3InputPanelAbility.vw0(false);
        }
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        NimbleVideoListAssem nimbleVideoListAssem = (NimbleVideoListAssem) viewOnAttachStateChangeListenerC1620720sHG.l0;
        nimbleVideoListAssem.getClass();
        if (EventBus.LIZLLL().LJIIJ(nimbleVideoListAssem)) {
            EventBus.LIZLLL().LJJI(nimbleVideoListAssem);
        }
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        InterfaceC899440ZQg interfaceC899440ZQg = ((C1598650rhf) viewOnAttachStateChangeListenerC1620720sHG.l0).LLJL;
        if (interfaceC899440ZQg != null) {
            interfaceC899440ZQg.onInvisible();
        }
    }

    public static final void onViewDetachedFromWindow$6(ViewOnAttachStateChangeListenerC1620720sHG viewOnAttachStateChangeListenerC1620720sHG, View view) {
        ((C1610740s1A) viewOnAttachStateChangeListenerC1620720sHG.l0).LJIIIIZZ();
    }
}
