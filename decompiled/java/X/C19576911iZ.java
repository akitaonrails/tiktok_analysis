package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogService;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.11iZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19576911iZ implements CreativeLoadingDialogService {
    public static String LIZJ;
    public static final C19576911iZ LIZ = new C19576911iZ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3418));
    public static final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());

    public static long LIZ() {
        return ((Number) LIZIZ.getValue()).longValue();
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogService
    public final CreativeLoadingDialog createLoadingDialog(Context context, final int i, final CreativeLoadingDialogBuilder creativeLoadingDialogBuilder) {
        final C0LEP c0lep;
        final C0LD3 c0ld3;
        String str;
        String str2;
        String str3;
        String str4;
        int i2 = C19577411ie.LIZ[creativeLoadingDialogBuilder.getConfig().cancelViewVisibleType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        c0lep = C0LEP.OTHER;
                    } else {
                        c0lep = C0LEP.CLOSE_GONE;
                    }
                } else {
                    c0lep = C0LEP.CLOSE_VISIBLE_15S;
                }
            } else {
                c0lep = C0LEP.CLOSE_VISIBLE_5S;
            }
        } else {
            c0lep = C0LEP.CLOSE_VISIBLE;
        }
        if (creativeLoadingDialogBuilder.getConfig().isShowProgress() && ((str4 = creativeLoadingDialogBuilder.getConfig().message) == null || str4.length() == 0)) {
            c0ld3 = C0LD3.PROGRESS;
        } else if (creativeLoadingDialogBuilder.getConfig().isShowProgress() && (str3 = creativeLoadingDialogBuilder.getConfig().message) != null && str3.length() != 0) {
            c0ld3 = C0LD3.PROGRESS_WITH_MESSAGE;
        } else if (!creativeLoadingDialogBuilder.getConfig().isShowProgress() && ((str2 = creativeLoadingDialogBuilder.getConfig().message) == null || str2.length() == 0)) {
            c0ld3 = C0LD3.DUAL_BALL;
        } else if (!creativeLoadingDialogBuilder.getConfig().isShowProgress() && (str = creativeLoadingDialogBuilder.getConfig().message) != null && str.length() != 0) {
            c0ld3 = C0LD3.DUAL_BALL_WITH_MESSAGE;
        } else {
            c0ld3 = C0LD3.OTHER;
        }
        final CreativeDialogWrapper creativeDialogWrapper = new CreativeDialogWrapper(context, creativeLoadingDialogBuilder);
        DialogInterface.OnShowListener onShowListener = new DialogInterface.OnShowListener() { // from class: X.11ib
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C194353111z.LIZ.LIZLLL(i, C0MVY.SHOW, c0ld3, c0lep, creativeLoadingDialogBuilder.getConfig().message, creativeDialogWrapper);
                DialogInterface.OnShowListener onShowListener2 = creativeLoadingDialogBuilder.getConfig().showListener;
                if (onShowListener2 != null) {
                    onShowListener2.onShow(dialogInterface);
                }
            }
        };
        C0KW5 c0kw5 = creativeDialogWrapper.LIZLLL;
        if (c0kw5 != null) {
            c0kw5.setOnShowListener(onShowListener);
        }
        DialogC1390150mHN dialogC1390150mHN = creativeDialogWrapper.LJ;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.setOnShowListener(onShowListener);
        }
        DialogC1389620mGW dialogC1389620mGW = creativeDialogWrapper.LJFF;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.setOnShowListener(onShowListener);
        }
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.11ic
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C194353111z.LIZ.LIZLLL(i, C0MVY.DISMISS, c0ld3, c0lep, creativeLoadingDialogBuilder.getConfig().message, creativeDialogWrapper);
                DialogInterface.OnDismissListener onDismissListener2 = creativeLoadingDialogBuilder.getConfig().dismissListener;
                if (onDismissListener2 != null) {
                    onDismissListener2.onDismiss(dialogInterface);
                }
            }
        };
        C0KW5 c0kw52 = creativeDialogWrapper.LIZLLL;
        if (c0kw52 != null) {
            c0kw52.setOnDismissListener(onDismissListener);
        }
        DialogC1390150mHN dialogC1390150mHN2 = creativeDialogWrapper.LJ;
        if (dialogC1390150mHN2 != null) {
            dialogC1390150mHN2.setOnDismissListener(onDismissListener);
        }
        DialogC1389620mGW dialogC1389620mGW2 = creativeDialogWrapper.LJFF;
        if (dialogC1389620mGW2 != null) {
            dialogC1389620mGW2.setOnDismissListener(onDismissListener);
        }
        C12YJ c12yj = new C12YJ(creativeLoadingDialogBuilder, 4);
        C0KW5 c0kw53 = creativeDialogWrapper.LIZLLL;
        if (c0kw53 != null) {
            c0kw53.setOnCancelListener(c12yj);
        }
        DialogC1390150mHN dialogC1390150mHN3 = creativeDialogWrapper.LJ;
        if (dialogC1390150mHN3 != null) {
            dialogC1390150mHN3.setOnCancelListener(c12yj);
        }
        DialogC1389620mGW dialogC1389620mGW3 = creativeDialogWrapper.LJFF;
        if (dialogC1389620mGW3 != null) {
            dialogC1389620mGW3.setOnCancelListener(c12yj);
        }
        final C19577011ia c19577011ia = new C19577011ia(i, c0ld3, c0lep, creativeLoadingDialogBuilder, creativeDialogWrapper);
        DialogC1390150mHN dialogC1390150mHN4 = creativeDialogWrapper.LJ;
        if (dialogC1390150mHN4 != null) {
            dialogC1390150mHN4.LLILZLL = new InterfaceC1389630mGX() { // from class: X.11if
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    c19577011ia.invoke(dialogC19728412Gs);
                }
            };
        }
        DialogC1389620mGW dialogC1389620mGW4 = creativeDialogWrapper.LJFF;
        if (dialogC1389620mGW4 != null) {
            dialogC1389620mGW4.LLILZLL = new InterfaceC1389630mGX() { // from class: X.11ig
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    c19577011ia.invoke(dialogC19728412Gs);
                }
            };
        }
        return creativeDialogWrapper;
    }
}
