package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0maS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogInterfaceOnClickListenerC1401980maS implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC1401980maS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC1401980maS dialogInterfaceOnClickListenerC1401980maS, DialogInterface dialogInterface, int i) {
        ((PushCameraBlurActivity) dialogInterfaceOnClickListenerC1401980maS.l0).LLLLLZL();
        dialogInterface.dismiss();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC1401980maS dialogInterfaceOnClickListenerC1401980maS, DialogInterface dialogInterface, int i) {
        ((PushCameraBlurActivity) dialogInterfaceOnClickListenerC1401980maS.l0).finish();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC1401980maS dialogInterfaceOnClickListenerC1401980maS, DialogInterface dialogInterface, int i) {
        C1380030m13 c1380030m13 = (C1380030m13) dialogInterfaceOnClickListenerC1401980maS.l0;
        C19232210Lw c19232210Lw = c1380030m13.LLILLL;
        final String aid = c1380030m13.LL.getAid();
        AbstractC728630Si5 abstractC728630Si5 = (AbstractC728630Si5) c19232210Lw.LL;
        abstractC728630Si5.getClass();
        C1BVK.LIZIZ().LIZ(abstractC728630Si5.LL, new Callable() { // from class: X.0m15
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("RestrictAwemeModel@46f1.restricAweme$1");
                CommonResponse commonResponseLIZIZ = C1380090m19.LIZIZ(aid);
                C1C7U.LIZIZ("RestrictAwemeModel@46f1.restricAweme$1");
                return commonResponseLIZIZ;
            }
        }, 0);
        dialogInterface.dismiss();
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC1401980maS dialogInterfaceOnClickListenerC1401980maS, DialogInterface dialogInterface, int i) {
        ((Activity) dialogInterfaceOnClickListenerC1401980maS.l0).finish();
    }
}
