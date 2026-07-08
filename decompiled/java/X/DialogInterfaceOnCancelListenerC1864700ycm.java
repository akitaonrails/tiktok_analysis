package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ViewerHighLightIntroDialogFragment;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import kotlin.jvm.functions.Function0;
import tikcast.api.wallet.tiktok.GetABSStatusResponse;

/* JADX INFO: renamed from: X.0ycm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class DialogInterfaceOnCancelListenerC1864700ycm implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
            case 2:
                onCancel$2(this, dialogInterface);
                break;
            case 3:
                onCancel$3(this, dialogInterface);
                break;
            case 4:
                onCancel$4(this, dialogInterface);
                break;
            case 5:
                onCancel$5(this, dialogInterface);
                break;
            case 6:
                onCancel$6(this, dialogInterface);
                break;
            case 7:
                onCancel$7(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnCancelListenerC1864700ycm(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnCancelListenerC1864700ycm.l0).invoke();
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm, DialogInterface dialogInterface) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) dialogInterfaceOnCancelListenerC1864700ycm.l0;
        C189200o6.m2constructorimpl(3);
        interfaceC20236714Gf.resumeWith(3);
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm, DialogInterface dialogInterface) {
        ((SystemShareActivity) dialogInterfaceOnCancelListenerC1864700ycm.l0).finish();
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm, DialogInterface dialogInterface) {
        ((C013C) dialogInterfaceOnCancelListenerC1864700ycm.l0).element = true;
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm, DialogInterface dialogInterface) {
        ((C013C) dialogInterfaceOnCancelListenerC1864700ycm.l0).element = true;
    }

    public static final void onCancel$5(DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm, DialogInterface dialogInterface) {
        Runnable runnable;
        C1802820x0y c1802820x0y = (C1802820x0y) dialogInterfaceOnCancelListenerC1864700ycm.l0;
        int i = c1802820x0y.LJIIIZ;
        if (i != 1) {
            if (i == 2 && (runnable = c1802820x0y.LJIIJJI) != null) {
                runnable.run();
            }
        } else {
            Runnable runnable2 = c1802820x0y.LJIIL;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        C1802820x0y c1802820x0y2 = (C1802820x0y) dialogInterfaceOnCancelListenerC1864700ycm.l0;
        C1802410x0J c1802410x0J = c1802820x0y2.LJIILIIL;
        if (c1802410x0J != null) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            CustomErrorExtra customErrorExtra = c1802820x0y2.LJIILJJIL;
            String str = c1802820x0y2.LJIILL;
            c1803800x2Y.getClass();
            C1803800x2Y.LJJIJIIJIL(c1802410x0J, "dismiss", "dismiss", customErrorExtra, str);
        }
        InterfaceC1802860x12 interfaceC1802860x12 = c1802820x0y2.LIZIZ;
        if (interfaceC1802860x12 != null) {
            interfaceC1802860x12.LIZIZ();
        }
    }

    public static final void onCancel$6(DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm, DialogInterface dialogInterface) {
        ((ViewerHighLightIntroDialogFragment) dialogInterfaceOnCancelListenerC1864700ycm.l0).MR("click", "blank");
    }

    public static final void onCancel$7(DialogInterfaceOnCancelListenerC1864700ycm dialogInterfaceOnCancelListenerC1864700ycm, DialogInterface dialogInterface) {
        InterfaceC1796910wrR interfaceC1796910wrR = ((DialogC1803170x1X) dialogInterfaceOnCancelListenerC1864700ycm.l0).LLJIJIL;
        if (interfaceC1796910wrR != null) {
            EnumC1796980wrY enumC1796980wrY = EnumC1796980wrY.CANCEL;
            GetABSStatusResponse.ABSData aBSData = C1797220wrw.LL;
            interfaceC1796910wrR.LJII(new C1796960wrW(enumC1796980wrY, null, C1797220wrw.LIZ(null)));
        }
    }
}
