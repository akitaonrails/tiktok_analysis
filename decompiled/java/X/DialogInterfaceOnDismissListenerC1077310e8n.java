package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitNavTabFilterCell;

/* JADX INFO: renamed from: X.0e8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class DialogInterfaceOnDismissListenerC1077310e8n implements DialogInterface.OnDismissListener {
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

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1077310e8n dialogInterfaceOnDismissListenerC1077310e8n, DialogInterface dialogInterface) {
        C1076030e6j c1076030e6j = ((PoiRevisitNavTabFilterCell) dialogInterfaceOnDismissListenerC1077310e8n.l0).N5().LLILLJJLI;
        if (c1076030e6j != null && !c1076030e6j.LL) {
            ((PoiRevisitNavTabFilterCell) dialogInterfaceOnDismissListenerC1077310e8n.l0).T5((C1076030e6j) dialogInterfaceOnDismissListenerC1077310e8n.l1);
        }
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1077310e8n dialogInterfaceOnDismissListenerC1077310e8n, DialogInterface dialogInterface) {
        C1076030e6j c1076030e6j = ((PoiRevisitNavTabFilterCell) dialogInterfaceOnDismissListenerC1077310e8n.l0).N5().LL;
        if (c1076030e6j != null && !c1076030e6j.LL) {
            ((PoiRevisitNavTabFilterCell) dialogInterfaceOnDismissListenerC1077310e8n.l0).T5((C1076030e6j) dialogInterfaceOnDismissListenerC1077310e8n.l1);
        }
    }

    public DialogInterfaceOnDismissListenerC1077310e8n(PoiRevisitNavTabFilterCell poiRevisitNavTabFilterCell, C1076030e6j c1076030e6j, int i) {
        this.$t = i;
        this.l0 = poiRevisitNavTabFilterCell;
        this.l1 = c1076030e6j;
    }
}
