package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class DialogInterfaceOnCancelListenerC1466620oGi implements DialogInterface.OnCancelListener {
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
        }
    }

    public DialogInterfaceOnCancelListenerC1466620oGi(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1466620oGi dialogInterfaceOnCancelListenerC1466620oGi, DialogInterface dialogInterface) {
        C1402940mc0.LIZJ(((C2173271A3p) dialogInterfaceOnCancelListenerC1466620oGi.l0).LIZJ, "cancel");
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1466620oGi dialogInterfaceOnCancelListenerC1466620oGi, DialogInterface dialogInterface) {
        C1402940mc0.LIZJ(((C2173271A3p) dialogInterfaceOnCancelListenerC1466620oGi.l0).LIZJ, "cancel");
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC1466620oGi dialogInterfaceOnCancelListenerC1466620oGi, DialogInterface dialogInterface) {
        VideoPublishEditModel videoPublishEditModel = ((ImageEditRootScene) dialogInterfaceOnCancelListenerC1466620oGi.l0).LLJL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        C1402610mbT.LJIJJLI(videoPublishEditModel, "cancel");
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC1466620oGi dialogInterfaceOnCancelListenerC1466620oGi, DialogInterface dialogInterface) {
        Function0<Unit> function0;
        C1418430n0z c1418430n0z = ((C1418220n0e) dialogInterfaceOnCancelListenerC1466620oGi.l0).LIZJ;
        if (c1418430n0z != null && (function0 = c1418430n0z.LIZ) != null) {
            function0.invoke();
        }
    }
}
