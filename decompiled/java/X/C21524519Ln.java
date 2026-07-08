package X;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.loginapproval.ConfirmLoginPageFragment;
import com.ss.android.ugc.aweme.account.loginapproval.LoginApprovalDeviceData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.text.u;

/* JADX INFO: renamed from: X.19Ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21524519Ln implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            default:
                return null;
        }
    }

    public C21524519Ln(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C21524519Ln c21524519Ln, C15O7 c15o7) {
        String str;
        C1C7U.LIZ("ConfirmLoginPageFragment@4fe.getData$1");
        if (C09UZ.LIZLLL(c15o7) && u.LJIJI("success", ((LoginApprovalDeviceData) c15o7.LJIIL()).message, true)) {
            LoginApprovalDeviceData.Data data = ((LoginApprovalDeviceData) c15o7.LJIIL()).data;
            C786410Ut5.LJIIJ(((ConfirmLoginPageFragment) c21524519Ln.l0).UR());
            View view = ((ConfirmLoginPageFragment) c21524519Ln.l0).LLIZLLLIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            ConfirmLoginPageFragment confirmLoginPageFragment = (ConfirmLoginPageFragment) c21524519Ln.l0;
            String str2 = data.username;
            if (str2 == null) {
                str2 = "";
            }
            confirmLoginPageFragment.LLJJLIIIJLLLLLLLZ = str2;
            ConstraintLayout constraintLayout = confirmLoginPageFragment.LLJILJIL;
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
            }
            TextView textView = confirmLoginPageFragment.LLJILJILJ;
            if (textView != null) {
                textView.setText(data.deviceName);
            }
            String str3 = data.location;
            if (str3 != null && str3.length() != 0) {
                TextView textView2 = confirmLoginPageFragment.LLJJ;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 0);
                }
                TextView textView3 = confirmLoginPageFragment.LLJJ;
                if (textView3 != null) {
                    textView3.setText(data.location);
                }
            } else {
                TextView textView4 = confirmLoginPageFragment.LLJJ;
                if (textView4 != null) {
                    C786410Ut5.LLIL(textView4, 8);
                }
            }
            TextView textView5 = confirmLoginPageFragment.LLJILLL;
            if (textView5 != null) {
                textView5.setText(data.authenticationMethod);
            }
            TextView textView6 = confirmLoginPageFragment.LLJJI;
            if (textView6 != null) {
                Long l = data.timestamp;
                if (l != null) {
                    str = new SimpleDateFormat("MMMM dd, yyyy, hh:mm a", Locale.getDefault()).format(new Date(l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                } else {
                    str = null;
                }
                textView6.setText(str);
            }
            confirmLoginPageFragment.LLJJJJJIL = data.latitude;
            confirmLoginPageFragment.LLJJJJLIIL = data.longitude;
            confirmLoginPageFragment.bS();
            LoginApprovalDeviceData.Extra extra = data.extra;
            if (extra != null) {
                TuxTextView tuxTextView = confirmLoginPageFragment.LLJ;
                if (tuxTextView != null) {
                    tuxTextView.setText(extra.title);
                }
                TuxTextView tuxTextView2 = confirmLoginPageFragment.LLJI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(extra.description);
                }
                C197039127h c197039127h = confirmLoginPageFragment.LLJJIII;
                if (c197039127h != null) {
                    c197039127h.setText(extra.denyButton);
                }
                C197039127h c197039127h2 = confirmLoginPageFragment.LLJJIJI;
                if (c197039127h2 != null) {
                    c197039127h2.setText(extra.approveButton);
                }
                confirmLoginPageFragment.LLJL = extra.approveToast;
                confirmLoginPageFragment.LLJLIL = extra.denyToast;
            }
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(((ConfirmLoginPageFragment) c21524519Ln.l0).requireActivity());
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIIZ(2131834217);
            c1389890mGx.LJIIJJI();
            ((ConfirmLoginPageFragment) c21524519Ln.l0).VR();
        }
        C1C7U.LIZIZ("ConfirmLoginPageFragment@4fe.getData$1");
        return c15o7;
    }

    public static final Object then$1(C21524519Ln c21524519Ln, C15O7 c15o7) {
        C1C7U.LIZ("ConfirmLoginPageFragment@4fe.onApproveLoginButtonClick$1");
        C786410Ut5.LJIIJ(((ConfirmLoginPageFragment) c21524519Ln.l0).UR());
        ConfirmLoginPageFragment confirmLoginPageFragment = (ConfirmLoginPageFragment) c21524519Ln.l0;
        ConfirmLoginPageFragment.iS(confirmLoginPageFragment, c15o7, new AwS611S0100000_32(confirmLoginPageFragment, 27));
        C1C7U.LIZIZ("ConfirmLoginPageFragment@4fe.onApproveLoginButtonClick$1");
        return c15o7;
    }

    public static final Object then$2(C21524519Ln c21524519Ln, C15O7 c15o7) {
        C1C7U.LIZ("ConfirmLoginPageFragment@4fe.onCloseButtonCLick$1");
        C786410Ut5.LJIIJ(((ConfirmLoginPageFragment) c21524519Ln.l0).UR());
        ConfirmLoginPageFragment confirmLoginPageFragment = (ConfirmLoginPageFragment) c21524519Ln.l0;
        ConfirmLoginPageFragment.iS(confirmLoginPageFragment, c15o7, new AwS611S0100000_32(confirmLoginPageFragment, 28));
        C1C7U.LIZIZ("ConfirmLoginPageFragment@4fe.onCloseButtonCLick$1");
        return c15o7;
    }

    public static final Object then$3(C21524519Ln c21524519Ln, C15O7 c15o7) {
        C1C7U.LIZ("ConfirmLoginPageFragment@4fe.onPreventLoginButtonClick$1");
        C786410Ut5.LJIIJ(((ConfirmLoginPageFragment) c21524519Ln.l0).UR());
        ConfirmLoginPageFragment confirmLoginPageFragment = (ConfirmLoginPageFragment) c21524519Ln.l0;
        ConfirmLoginPageFragment.iS(confirmLoginPageFragment, c15o7, new AwS611S0100000_32(confirmLoginPageFragment, 29));
        C1C7U.LIZIZ("ConfirmLoginPageFragment@4fe.onPreventLoginButtonClick$1");
        return c15o7;
    }

    public static final Object then$4(C21524519Ln c21524519Ln, C15O7 c15o7) {
        CharSequence charSequence;
        EnumC19388010tC enumC19388010tC;
        C1C7U.LIZ("CropActivity@51a9.bindViewById$1$2");
        if (c15o7.LJIILJJIL() && (charSequence = (CharSequence) ((Pair) c15o7.LJIIL()).getFirst()) != null && charSequence.length() != 0) {
            CropActivity cropActivity = (CropActivity) c21524519Ln.l0;
            String str = (String) ((Pair) c15o7.LJIIL()).getFirst();
            if (str == null) {
                str = "";
            }
            cropActivity.LLJZIJLIL = str;
            CropActivity cropActivity2 = (CropActivity) c21524519Ln.l0;
            C19HG c19hg = cropActivity2.LLJJI;
            Bitmap bitmap = null;
            if (c19hg == null) {
                c19hg = null;
            }
            Bitmap bitmap2 = cropActivity2.LLLII;
            if (bitmap2 != null) {
                bitmap = bitmap2;
            }
            Bitmap first = cropActivity2.LLLLZLLLI(c19hg, bitmap).getFirst();
            if (first != null) {
                CropActivity cropActivity3 = (CropActivity) c21524519Ln.l0;
                GradientDrawable gradientDrawableLIZ = C0H1V.LIZ(first);
                if (cropActivity3.LLZLI()) {
                    enumC19388010tC = EnumC19388010tC.ROUND_CORNER_RECT;
                } else {
                    enumC19388010tC = EnumC19388010tC.DEFAULT;
                }
                cropActivity3.LLLLZIL(first, gradientDrawableLIZ, enumC19388010tC);
                cropActivity3.LLZZ(cropActivity3.LLJLIL);
            }
        } else if (c15o7.LJIILJJIL()) {
            C1233040iBy c1233040iBy = new C1233040iBy((CropActivity) c21524519Ln.l0);
            c1233040iBy.LIZIZ(((Number) ((Pair) c15o7.LJIIL()).getSecond()).intValue());
            c1233040iBy.LIZLLL();
        } else {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZJ("CropActivity", c15o7.LJIIJJI());
            C1233040iBy c1233040iBy2 = new C1233040iBy((CropActivity) c21524519Ln.l0);
            c1233040iBy2.LIZIZ(2131834205);
            c1233040iBy2.LIZLLL();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CropActivity@51a9.bindViewById$1$2");
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$5(X.C21524519Ln r11, X.C15O7 r12) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21524519Ln.then$5(X.19Ln, X.15O7):java.lang.Object");
    }

    public static final Object then$6(C21524519Ln c21524519Ln, C15O7 c15o7) {
        C21516719In c21516719In = (C21516719In) c21524519Ln.l0;
        c21516719In.getClass();
        C1C7U.LIZ("FeedLiveWindowView@5fa1.initView$2L");
        c21516719In.LLIZLLLIL.setText((CharSequence) c15o7.LJIIL());
        C1C7U.LIZIZ("FeedLiveWindowView@5fa1.initView$2L");
        return null;
    }

    public static final Object then$7(C21524519Ln c21524519Ln, C15O7 c15o7) {
        C1C7U.LIZ("ImageCompressUtil@7985.compressLivePhoto$2");
        C2208311Bbp c2208311Bbp = (C2208311Bbp) c15o7.LJIIL();
        if (c15o7.LJIILJJIL() && c2208311Bbp != null) {
            ((C19H5) c21524519Ln.l0).LIZ(c2208311Bbp);
        } else {
            ((C19H5) c21524519Ln.l0).LIZJ();
        }
        C1C7U.LIZIZ("ImageCompressUtil@7985.compressLivePhoto$2");
        return null;
    }
}
