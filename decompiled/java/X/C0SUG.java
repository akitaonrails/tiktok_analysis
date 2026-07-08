package X;

import Y.ARunnableS37S0300000_4;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.intro.TuxPanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SUG, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC20647615qs("story_highlight_consumption_fresh_guide_pop")
public final class C0SUG extends AbstractC20660015ss<DialogFragment> {
    public static final /* synthetic */ int LLILZIL = 0;
    public final String LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final int LLILZ = 415;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        return null;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ == null) {
            return null;
        }
        C1391960mKI c1391960mKI = new C1391960mKI();
        c1391960mKI.LJ = new AwS370S0200000_4(this, c19egLIZIZ, 56);
        c1391960mKI.LJI = -1;
        c1391960mKI.LJII = c19egLIZIZ.getString(2131835504);
        c1391960mKI.LJIIIIZZ = c19egLIZIZ.getString(2131835502);
        c1391960mKI.LIZ = true;
        c1391960mKI.LIZIZ(c19egLIZIZ.getString(2131835503), new AwS445S0200000_9(this, c19egLIZIZ, 24));
        C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
        DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT = new DialogInterfaceOnDismissListenerC738790SyT(this, 1);
        TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
        tuxPanel.LLILZIL = dialogInterfaceOnDismissListenerC738790SyT;
        tuxPanel.show(c19egLIZIZ.getSupportFragmentManager(), "FirstTimePanel");
        this.LLILLJJLI.invoke();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "notification_page");
        c0lab.LJ("popup_type", "highlight_topcell_user_guide");
        C20684815ws.LJIILLIIL("ttsocial_user_guide_popup_show", c0lab.LIZ);
        return tuxPanel;
    }

    public final void LJIIL(C19EG c19eg, ImageView imageView) {
        int iLIZIZ;
        if (C0FV2.LIZIZ(c19eg) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) {
            iLIZIZ = ((int) ((r2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) * 0.64f)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(189));
        }
        C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(-1, iLIZIZ));
        HandlerHook.viewPost(imageView, new ARunnableS37S0300000_4(imageView, this, c19eg, 16));
    }

    public C0SUG(String str, AwS555S0100000_11 awS555S0100000_11, AwS555S0100000_11 awS555S0100000_112) {
        this.LL = str;
        this.LLILLJJLI = awS555S0100000_11;
        this.LLILLL = awS555S0100000_112;
    }
}
