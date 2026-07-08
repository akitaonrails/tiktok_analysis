package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveKYCVerifyUrlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveKYCViewDetailUrlSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802340x0C {
    public static final /* synthetic */ int LIZ = 0;

    public static Uri LIZLLL(String str, C1802410x0J c1802410x0J) {
        Uri uri = UriProtector.parse(new C495520Jby(str).LIZLLL());
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        C1803800x2Y.LIZ.getClass();
        return C011H.LIZ(uri, "url", C011H.LIZ(uri2, "enter_from", C1803800x2Y.LJIIJJI(c1802410x0J)).toString());
    }

    public static void LIZ(final Context context, EnumC1802470x0P enumC1802470x0P, String str, final int i, final C1802410x0J c1802410x0J) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJIIZ(i, c1802410x0J);
        final Uri uriLIZLLL = LIZLLL(LiveKYCVerifyUrlSetting.INSTANCE.getValue(), c1802410x0J);
        C19GO c19go = new C19GO(context);
        c19go.LJI(enumC1802470x0P.getTitleResId());
        c19go.LJII = str;
        c19go.LJ(enumC1802470x0P.getPositiveResId(), new DialogInterface.OnClickListener() { // from class: X.0x0D
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, uriLIZLLL);
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                int i3 = i;
                C1802410x0J c1802410x0J2 = c1802410x0J;
                c1803800x2Y.getClass();
                C1803800x2Y.LJJIIJZLJL(i3, c1802410x0J2, true, false);
                InterfaceC1802380x0G interfaceC1802380x0G = c1802410x0J.LJIIJ;
                if (interfaceC1802380x0G != null) {
                    interfaceC1802380x0G.LIZ();
                }
                dialogInterface.dismiss();
            }
        }, false);
        c19go.LIZJ(enumC1802470x0P.getNegativeResId(), new DialogInterface.OnClickListener() { // from class: X.0x0E
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                int i3 = i;
                C1802410x0J c1802410x0J2 = c1802410x0J;
                c1803800x2Y.getClass();
                C1803800x2Y.LJJIIJZLJL(i3, c1802410x0J2, false, false);
                InterfaceC1802380x0G interfaceC1802380x0G = c1802410x0J.LJIIJ;
                if (interfaceC1802380x0G != null) {
                    interfaceC1802380x0G.LIZIZ();
                }
                dialogInterface.dismiss();
            }
        }, false);
        c19go.LJJIIJ = false;
        C786410Ut5.M4(c19go.LIZ());
    }

    public static void LIZIZ(final Context context, EnumC1802470x0P enumC1802470x0P, String str, final int i, final C1802410x0J c1802410x0J) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJIIZ(i, c1802410x0J);
        final Uri uriLIZLLL = LIZLLL(LiveKYCVerifyUrlSetting.INSTANCE.getValue(), c1802410x0J);
        C19GO c19go = new C19GO(context);
        c19go.LJI(enumC1802470x0P.getTitleResId());
        c19go.LJII = str;
        c19go.LJ(enumC1802470x0P.getPositiveResId(), new DialogInterface.OnClickListener() { // from class: X.0wsB
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, uriLIZLLL);
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                int i3 = i;
                C1802410x0J c1802410x0J2 = c1802410x0J;
                c1803800x2Y.getClass();
                C1803800x2Y.LJJIIJZLJL(i3, c1802410x0J2, true, false);
                dialogInterface.dismiss();
            }
        }, false);
        c19go.LIZJ(enumC1802470x0P.getNegativeResId(), new DialogInterface.OnClickListener() { // from class: X.0wsC
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                int i3 = i;
                C1802410x0J c1802410x0J2 = c1802410x0J;
                c1803800x2Y.getClass();
                C1803800x2Y.LJJIIJZLJL(i3, c1802410x0J2, false, false);
                dialogInterface.dismiss();
            }
        }, false);
        c19go.LJJIIJ = false;
        C786410Ut5.M4(c19go.LIZ());
    }

    public static void LIZJ(final Context context, EnumC1802470x0P enumC1802470x0P, String str, final int i, final C1802410x0J c1802410x0J) {
        View viewFindViewById;
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJIIZ(i, c1802410x0J);
        final Uri uriLIZLLL = LIZLLL(LiveKYCViewDetailUrlSetting.INSTANCE.getValue(), c1802410x0J);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.grw, null);
        if (viewLJLLJ != null) {
            TextView textView = (TextView) viewLJLLJ.findViewById(R.id.zsy);
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = (TextView) viewLJLLJ.findViewById(R.id.zsx);
            if (textView2 != null) {
                textView2.setText(enumC1802470x0P.getNegativeResId());
            }
        }
        C19GO c19go = new C19GO(context);
        c19go.LJI(enumC1802470x0P.getTitleResId());
        c19go.LJIJJLI = viewLJLLJ;
        c19go.LJ(enumC1802470x0P.getPositiveResId(), new DialogInterface.OnClickListener() { // from class: X.0wsD
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                int i3 = i;
                C1802410x0J c1802410x0J2 = c1802410x0J;
                c1803800x2Y.getClass();
                C1803800x2Y.LJJIIJZLJL(i3, c1802410x0J2, true, false);
                dialogInterface.dismiss();
            }
        }, false);
        c19go.LJJIIJ = false;
        final C19GN c19gnLIZ = c19go.LIZ();
        if (viewLJLLJ != null && (viewFindViewById = viewLJLLJ.findViewById(R.id.njl)) != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0wsA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, uriLIZLLL);
                    C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                    int i2 = i;
                    C1802410x0J c1802410x0J2 = c1802410x0J;
                    c1803800x2Y.getClass();
                    C1803800x2Y.LJJIIJZLJL(i2, c1802410x0J2, false, false);
                    C19GN c19gn = c19gnLIZ;
                    c19gn.dismiss();
                    C785410UrT.LIZ(c19gn);
                }
            }, viewFindViewById);
        }
        C786410Ut5.M4(c19gnLIZ);
    }

    public static final C1149670g1V LJ(Context context, Throwable th, final Runnable runnable, final Runnable runnable2, int i, int i2, boolean z) {
        int errorCode;
        Exception exc;
        if (context == null) {
            return new C1149670g1V(false, false);
        }
        if (th instanceof C501470JlZ) {
            errorCode = ((C501520Jle) th).getErrorCode();
        } else if (th instanceof C1811850xFX) {
            errorCode = ((C1811850xFX) th).statusCode;
        } else {
            errorCode = -1;
        }
        C1802410x0J c1802410x0J = new C1802410x0J();
        c1802410x0J.LIZIZ = errorCode;
        c1802410x0J.LJIIJJI = i;
        c1802410x0J.LJIIL = i2;
        c1802410x0J.LJIILIIL = z;
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        c1802410x0J.LIZLLL = exc;
        c1802410x0J.LJIIJ = new InterfaceC1802380x0G() { // from class: X.0x0F
            @Override // X.InterfaceC1802380x0G
            public final void LIZ() {
                Runnable runnable3 = runnable2;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }

            @Override // X.InterfaceC1802380x0G
            public final void LIZIZ() {
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        };
        return C1802580x0a.LJ(context, c1802410x0J);
    }
}
