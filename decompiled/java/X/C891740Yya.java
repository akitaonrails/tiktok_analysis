package X;

import Y.ACListenerS149S0100000_14;
import Y.ACListenerS80S0300000_14;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Yya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891740Yya implements InterfaceC891770Yyd {
    public static final /* synthetic */ int LJIIJ = 0;
    public final Function0<Boolean> LIZ;
    public final boolean LIZIZ = C890210Yw7.LIZ();
    public final int LIZJ = 2131845303;
    public final int LIZLLL = R.raw.icon_person_arrow_left_right;
    public final String LJ = "click_option_switch_mode";
    public C05RV LJFF = C05RE.LIZ();
    public C127K LJI;
    public C127K LJII;
    public C197039127h LJIIIIZZ;
    public TuxSheet LJIIIZ;

    @Override // X.InterfaceC891770Yyd
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC891770Yyd
    public final String LJI() {
        return "switch_inbox_mode_option";
    }

    @Override // X.InterfaceC891770Yyd
    public final void onShow() {
    }

    @Override // X.InterfaceC891770Yyd
    public final Integer LIZ() {
        return Integer.valueOf(this.LIZLLL);
    }

    public final void LJIIIIZZ() {
        C11GO c11go;
        C127K c127k = this.LJI;
        C127M accessory = c127k != null ? c127k.getAccessory() : null;
        C11GO c11go2 = accessory instanceof AnonymousClass1278 ? (C11GO) accessory : null;
        if (c11go2 != null) {
            c11go2.LJIILJJIL(this.LJFF != C05RV.BUSINESS_INBOX);
        }
        C127K c127k2 = this.LJII;
        C127M accessory2 = c127k2 != null ? c127k2.getAccessory() : null;
        if (!(accessory2 instanceof AnonymousClass1278) || (c11go = (C11GO) accessory2) == null) {
            return;
        }
        c11go.LJIILJJIL(this.LJFF == C05RV.BUSINESS_INBOX);
    }

    @Override // X.InterfaceC891770Yyd
    public final int LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC891770Yyd
    public final String LJ() {
        return this.LJ;
    }

    @Override // X.InterfaceC891770Yyd
    public final boolean isEnabled() {
        return this.LIZIZ;
    }

    public C891740Yya(AwS558S0100000_14 awS558S0100000_14) {
        this.LIZ = awS558S0100000_14;
    }

    @Override // X.InterfaceC891770Yyd
    public final InterfaceC1411705fn LIZJ(String str) {
        return C05RE.LIZIZ(str);
    }

    @Override // X.InterfaceC891770Yyd
    public final void LIZLLL(Context context) {
        FragmentManager supportFragmentManager;
        String str;
        C11GO c11go;
        C11GO c11go2;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            this.LJFF = C05RE.LIZ();
            View viewSd = C786410Ut5.Sd(R.layout.ab6, C786410Ut5.ne(context), null);
            C127K c127k = (C127K) viewSd.findViewById(R.id.fiw);
            C127M accessory = c127k.getAccessory();
            if ((accessory instanceof AnonymousClass1278) && (c11go2 = (C11GO) accessory) != null) {
                c11go2.LJIILLIIL(new C913870ZtB(this, 4));
            }
            this.LJI = c127k;
            C127K c127k2 = (C127K) viewSd.findViewById(R.id.d6c);
            c127k2.setSubtitle(context.getString(2131845307, context.getString(2131828189)));
            C127M accessory2 = c127k2.getAccessory();
            if ((accessory2 instanceof AnonymousClass1278) && (c11go = (C11GO) accessory2) != null) {
                c11go.LJIILLIIL(new C913870ZtB(this, 5));
            }
            this.LJII = c127k2;
            C197039127h c197039127h = (C197039127h) viewSd.findViewById(R.id.wuc);
            if (c197039127h != null) {
                C786410Ut5.U8(c197039127h, new ACListenerS80S0300000_14(this, context, viewSd, 7));
            } else {
                c197039127h = null;
            }
            this.LJIIIIZZ = c197039127h;
            C197039127h c197039127h2 = (C197039127h) viewSd.findViewById(R.id.wud);
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS149S0100000_14(viewSd, 60));
            }
            LJIIIIZZ();
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = context.getString(2131845303);
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZJ(new AwS558S0100000_14(viewSd, 1383));
            c0om1.LIZIZ(c1251150ifB);
            TuxSheet tuxSheet = new C1390920mIc(false, 0).LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            tuxSheet.LLJJIII = viewSd;
            tuxSheet.LL = new DialogInterfaceOnCancelListenerC913890ZtD(this, 3);
            this.LJIIIZ = tuxSheet;
            tuxSheet.show(supportFragmentManager, "switch_inbox_type_sheet");
            if (this.LIZ.invoke().booleanValue()) {
                str = "notification_page";
            } else {
                str = "click_messaging_settings_option";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_method", str));
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("inbox_mode_switch_popup_show", mapLIZJ);
        }
    }

    public final void LJII(String str) {
        String str2;
        Pair[] pairArr = new Pair[2];
        if (this.LIZ.invoke().booleanValue()) {
            str2 = "notification_page";
        } else {
            str2 = "click_messaging_settings_option";
        }
        pairArr[0] = new Pair("enter_method", str2);
        pairArr[1] = new Pair("action_type", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("inbox_mode_switch_popup_action", mapLJIIIIZZ);
    }
}
