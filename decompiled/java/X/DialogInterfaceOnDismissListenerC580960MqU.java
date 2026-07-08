package X;

import android.content.DialogInterface;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import lth.o;

/* JADX INFO: renamed from: X.0MqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class DialogInterfaceOnDismissListenerC580960MqU implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC580960MqU dialogInterfaceOnDismissListenerC580960MqU, DialogInterface dialogInterface) {
        ((C20656615sK) dialogInterfaceOnDismissListenerC580960MqU.l0).LIZ();
        C573760Mes c573760Mes = (C573760Mes) dialogInterfaceOnDismissListenerC580960MqU.l1;
        C2259308tD.LIZ(c573760Mes.LLILLJJLI, c573760Mes.LLILLL, c573760Mes.LLILZ, c573760Mes.LLILZIL, "cancel");
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC580960MqU dialogInterfaceOnDismissListenerC580960MqU, DialogInterface dialogInterface) {
        MvThemeData mvThemeData = (MvThemeData) dialogInterfaceOnDismissListenerC580960MqU.l0;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) dialogInterfaceOnDismissListenerC580960MqU.l1;
        if (!C810670Vr7.LIZJ(o.LIZ, 0, "mv_template").getBoolean(mvThemeData.effect.getId(), false) && onClickListener != null) {
            onClickListener.onClick(null, 0);
        }
    }

    public DialogInterfaceOnDismissListenerC580960MqU(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
