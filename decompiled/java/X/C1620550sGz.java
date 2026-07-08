package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.stemfeed.settings.WelcomePopup;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedPopupObserver;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: renamed from: X.0sGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC20647615qs("stem_feed_desc_pop")
public final class C1620550sGz extends AbstractC20660115st<DialogFragment> {
    public final InterfaceC20660615sy LL;
    public final FragmentManager LLILLJJLI;
    public final StemFeedPopupObserver LLILLL;
    public final C01GW LLILZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 10;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C770750ULh c770750ULh = new C770750ULh();
        WelcomePopup welcomePopup = C1588910rRx.LIZ().welcomePopup;
        String strLJI = welcomePopup.title;
        if (strLJI.length() == 0) {
            strLJI = C20642515q3.LJI(2131848803);
        }
        String strLJI2 = welcomePopup.desc;
        if (strLJI2.length() == 0) {
            strLJI2 = C20642515q3.LJI(2131848801);
        }
        String strLJI3 = welcomePopup.button;
        if (strLJI3.length() == 0) {
            strLJI3 = C20642515q3.LJI(2131848802);
        }
        c770750ULh.LJ = strLJI;
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.x3;
        c770750ULh.LIZ = c0hti.LIZ(c688120Qyw.LIZ);
        c770750ULh.LIZLLL = 2;
        c770750ULh.LIZJ(strLJI2);
        c770750ULh.LJI(strLJI3, AFwS264S0000000_24.get$arr$(609));
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY = new DialogInterfaceOnDismissListenerC1402040maY(this, 3);
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC1402040maY;
        FragmentManager fragmentManager = this.LLILLJJLI;
        if (fragmentManager != null) {
            tuxSheet.show(fragmentManager, "stem_feed_popup_intro_guide");
        }
        ((Keva) this.LLILZ.getValue()).storeBoolean("intro_guide_show", true);
        C20684815ws.onEventV3("show_first_stem_feed_prompt");
        return tuxSheet;
    }

    public C1620550sGz(InterfaceC20660615sy interfaceC20660615sy, FragmentManager fragmentManager, StemFeedPopupObserver stemFeedPopupObserver) {
        super(interfaceC20660615sy);
        this.LL = interfaceC20660615sy;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = stemFeedPopupObserver;
        this.LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(488));
    }
}
