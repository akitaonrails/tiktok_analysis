package X;

import Y.AcS356S0200000_27;
import Y.AcS85S0400000_27;
import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0x0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802660x0i extends AbstractC1802540x0W {
    public static final void LIZJ(C1797250wrz c1797250wrz, String str) {
        int i;
        String str2;
        String message;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        C1802410x0J c1802410x0J = c1797250wrz.LJIIIIZZ;
        if (c1802410x0J != null) {
            i = c1802410x0J.LJFF;
        } else {
            i = 0;
        }
        String str3 = "";
        if (c1802410x0J == null || (str2 = c1802410x0J.LJ) == null) {
            str2 = "";
        }
        int i2 = c1797250wrz.LIZ;
        int i3 = c1797250wrz.LIZIZ;
        int i4 = c1797250wrz.LJI;
        Exception exc = c1797250wrz.LIZJ;
        if (exc != null && (message = exc.getMessage()) != null) {
            str3 = message;
        }
        C1803800x2Y.LJIIZILJ(c1803800x2Y, i, "pay", "google-apple", str2, i2, i3, i4, str3, str, null, null, null, Boolean.TRUE, null, 24064);
    }

    @Override // X.AbstractC1802540x0W
    public final C1802630x0f LIZIZ(Context context, C1797250wrz c1797250wrz) {
        if (context == null) {
            return C1802640x0g.LIZ();
        }
        if (c1797250wrz.LIZ == 203 && c1797250wrz.LJI != 1 && C1797270ws1.LIZJ().LIZLLL()) {
            LIZLLL(context, c1797250wrz, true);
            return C1802640x0g.LIZIZ();
        }
        if (c1797250wrz.LJI == 2) {
            LIZLLL(context, c1797250wrz, false);
            return C1802640x0g.LIZIZ();
        }
        return C1802640x0g.LIZ();
    }

    public final void LIZLLL(final Context context, final C1797250wrz c1797250wrz, boolean z) {
        String strLIZJ;
        Dialog dialogLIZ;
        String message;
        String strValueOf;
        int i;
        String str;
        String strLIZ;
        String message2;
        String strValueOf2 = "unknown";
        String str2 = "";
        if (z) {
            dialogLIZ = new DialogC1802700x0m(context, c1797250wrz);
        } else {
            IapService iapService = (IapService) C1161920gLG.LIZJ(IapService.class);
            CustomErrorExtra.PopContentReplace popContentReplace = new CustomErrorExtra.PopContentReplace(new CustomErrorExtra());
            C1802410x0J c1802410x0J = c1797250wrz.LJIIIIZZ;
            popContentReplace.replaceValue = C497740JfY.LJIJI(2131842042);
            if (c1802410x0J != null) {
                C1802580x0a c1802580x0a = C1802580x0a.LIZ;
                int i2 = c1797250wrz.LIZ;
                int i3 = c1797250wrz.LIZIZ;
                int i4 = c1797250wrz.LJI;
                Exception exc = c1797250wrz.LIZJ;
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                if (c1797250wrz.LJIIIZ.get("request_page") == null) {
                    strValueOf = "unknown";
                } else {
                    strValueOf = String.valueOf(c1797250wrz.LJIIIZ.get("request_page"));
                }
                c1802580x0a.getClass();
                strLIZJ = C1802580x0a.LIZJ(c1802410x0J, i2, i3, i4, message, strValueOf);
            } else {
                strLIZJ = null;
            }
            popContentReplace.valueSchema = strLIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C497740JfY.LJIJI(2131842047));
            sbLIZ.append("\n\n%{placeholder}%");
            SpannableStringBuilder spannableStringBuilderLIZJ = AbstractC1802960x1C.LIZJ(context, C2188811AlT.LIZIZ(sbLIZ), C2097908Jt.LIZJ(new Pair("placeholder", popContentReplace)), new InterfaceC1802940x1A() { // from class: X.0x0k
                @Override // X.InterfaceC1802940x1A
                public final void LIZ(String str3) {
                    C1802660x0i.LIZJ(c1797250wrz, "contact_us");
                    if (C497740JfY.LJIL()) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, str3);
                        return;
                    }
                    C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                    c784440UpuLIZ.LIZIZ(new C0IF2(1));
                    c784440UpuLIZ.LIZIZ(new C1146860fwy("NormalRechargePanel"));
                    C786410Ut5.LJLIIL(500L, C820670WHh.LIZ, new RunnableC514901zX(context, str3, 7));
                }
            });
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131842048);
            c782110Um9.LJIIIZ(spannableStringBuilderLIZJ);
            c782110Um9.LIZJ(C495560Jc2.LIZLLL(C497740JfY.LJIJI(2131842043), new AcS85S0400000_27(this, c1797250wrz, iapService, context, 0), C497740JfY.LJIJI(2131842041), new AcS356S0200000_27(this, c1797250wrz, 0)));
            c782110Um9.LJIILLIIL = true;
            c782110Um9.LJIJI = new DialogInterfaceOnCancelListenerC1864660yci(this, c1797250wrz, 1);
            dialogLIZ = c782110Um9.LIZ();
        }
        C786410Ut5.B4(dialogLIZ);
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        C1802410x0J c1802410x0J2 = c1797250wrz.LJIIIIZZ;
        if (c1802410x0J2 != null) {
            i = c1802410x0J2.LJFF;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        C1802410x0J c1802410x0J3 = c1797250wrz.LJIIIIZZ;
        if (c1802410x0J3 == null || (str = c1802410x0J3.LJ) == null) {
            str = "";
        }
        int i5 = c1797250wrz.LIZ;
        int i6 = c1797250wrz.LIZIZ;
        int i7 = c1797250wrz.LJI;
        Exception exc2 = c1797250wrz.LIZJ;
        if (exc2 != null && (message2 = exc2.getMessage()) != null) {
            str2 = message2;
        }
        if (c1797250wrz.LJIIIZ.get("request_page") != null) {
            strValueOf2 = String.valueOf(c1797250wrz.LJIIIZ.get("request_page"));
        }
        if (z) {
            strLIZ = C1797420wsG.LIZ(context, c1797250wrz);
        } else {
            strLIZ = null;
        }
        C1803800x2Y.LJIJ(c1803800x2Y, numValueOf, "pay", "google-apple", str, "popup", i5, i6, i7, str2, strValueOf2, strLIZ, null, null, null, 30720);
    }
}
