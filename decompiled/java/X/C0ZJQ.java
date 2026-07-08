package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS101S0110000_14;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0ZJQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@InterfaceC20647615qs("inbox_activity_status_init_pop")
public final class C0ZJQ extends AbstractC20660115st<DialogFragment> {
    public final C19EG LL;
    public final Function1<Boolean, Unit> LLILLJJLI;
    public final int LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        boolean zLJIIL;
        int i;
        AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(this, 695);
        C19EG c19eg = this.LL;
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            zLJIIL = iMHostApiLIZ.LJIIL();
        } else {
            zLJIIL = false;
        }
        C0ZJR c0zjr = new C0ZJR(c19eg, supportFragmentManager, zLJIIL);
        C0ZHA c0zha = C0ZHA.INTRO_PANEL;
        c0zjr.LJIJJLI = c0zha;
        c0zjr.LJIJ = awS588S0100000_9;
        TuxSheet tuxSheet = null;
        if (zLJIIL) {
            c0zjr.LIZ();
            InterfaceC897380ZIi.LIZIZ.getClass();
            boolean zLIZ = C897370ZIh.LIZ().LJ().LIZ();
            if (c0zjr.LJIL) {
                if (zLIZ) {
                    i = 2131824680;
                } else {
                    i = 2131824676;
                }
                TextView textView = c0zjr.LJIIJJI;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(i);
            }
            c0zjr.LJIJI = true;
            View view = c0zjr.LJIIL;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(8, view);
            TuxTextView tuxTextView = c0zjr.LJIILIIL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C21411818qq c21411818qq = c0zjr.LJII;
            if (c21411818qq == null) {
                c21411818qq = null;
            }
            C786410Ut5.LLLLZI(c21411818qq, 8);
            LinearLayout linearLayout = c0zjr.LJIIIIZZ;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C1584506Ih.LIZIZ(linearLayout);
            C21411818qq c21411818qq2 = c0zjr.LJII;
            if (c21411818qq2 == null) {
                c21411818qq2 = null;
            }
            c21411818qq2.setChecked(true);
            c0zjr.LJIJJ = false;
            C197039127h c197039127h = c0zjr.LJIIJ;
            if (c197039127h == null) {
                c197039127h = null;
            }
            C1584506Ih.LIZ(c197039127h);
        } else {
            LinearLayout linearLayout2 = c0zjr.LJIIIIZZ;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C1584506Ih.LIZ(linearLayout2);
            C21411818qq c21411818qq3 = c0zjr.LJII;
            if (c21411818qq3 == null) {
                c21411818qq3 = null;
            }
            c21411818qq3.setChecked(true);
            c0zjr.LJIJJ = true;
        }
        TuxSheet tuxSheetLJ = c0zjr.LJ();
        c0zjr.LIZLLL = tuxSheetLJ;
        if (tuxSheetLJ != null) {
            tuxSheet = tuxSheetLJ;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJ().LJIIL(false);
        tuxSheet.show(this.LL.getSupportFragmentManager(), "ActivityStatusInitPop");
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJI(c0zha);
        return tuxSheet;
    }

    public C0ZJQ(C19EG c19eg, InboxFragmentV2 inboxFragmentV2, AwS101S0110000_14 awS101S0110000_14) {
        super(inboxFragmentV2);
        this.LL = c19eg;
        this.LLILLJJLI = awS101S0110000_14;
        this.LLILLL = 500;
    }
}
