package X;

import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0IO9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IO9 {
    public final ViewGroup LIZ;
    public final C21601619gM LIZIZ;
    public final C0IOL LIZJ;
    public boolean LJ;
    public C16FZ LJFF;
    public C0IOE LJII;
    public C0IOA LJIIIIZZ;
    public C0IOB LIZLLL = C0IOB.IDLE;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(53));

    public final void LIZ(String str) {
        String str2;
        InterfaceC466370IQp currentFragment;
        C16FZ c16fz = this.LJFF;
        int i = 1;
        if (c16fz != null && c16fz.getVisibility() == 8) {
            return;
        }
        C20441214yg.LIZIZ("ScrollLoadingHelper", "hide");
        LIZJ(((Number) this.LJI.getValue()).intValue());
        C16FZ c16fz2 = this.LJFF;
        if (c16fz2 != null) {
            C786410Ut5.LLLIZZ(c16fz2, 8);
        }
        C0IOE c0ioe = this.LJII;
        if (c0ioe == null || ((C0IOC) c0ioe).LIZ.getCurrentPosition() != 0) {
            i = 0;
        }
        C0IOE c0ioe2 = this.LJII;
        DataChannel dataChannel = null;
        if (c0ioe2 != null && (currentFragment = ((C0IOC) c0ioe2).LIZ.getCurrentFragment()) != null) {
            dataChannel = currentFragment.getDataChannel();
        }
        boolean z = this.LJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_slide_loadmore_status");
        if (z) {
            str2 = "follow_recommend";
        } else {
            str2 = "normal_draw";
        }
        c474500IjALIZ.LJJII(str2, "is_follow_recommend");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_first_position");
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public final void LIZIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setParams: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("ScrollLoadingHelper", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ = z;
    }

    public final void LIZJ(int i) {
        C21601619gM c21601619gM = this.LIZIZ;
        ViewGroup.LayoutParams layoutParams = c21601619gM.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin += i;
            marginLayoutParams.bottomMargin -= i;
            C786410Ut5.W5(c21601619gM, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C0IO9(ViewGroup viewGroup, C21601619gM c21601619gM, C0IOL c0iol) {
        this.LIZ = viewGroup;
        this.LIZIZ = c21601619gM;
        this.LIZJ = c0iol;
    }
}
