package X;

import android.content.DialogInterface;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionTextFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class DialogInterfaceOnClickListenerC391560FWw implements DialogInterface.OnClickListener {
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
        }
    }

    public DialogInterfaceOnClickListenerC391560FWw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC391560FWw dialogInterfaceOnClickListenerC391560FWw, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC391560FWw.l0).invoke();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC391560FWw dialogInterfaceOnClickListenerC391560FWw, DialogInterface dialogInterface, int i) {
        ((Function0) dialogInterfaceOnClickListenerC391560FWw.l0).invoke();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC391560FWw dialogInterfaceOnClickListenerC391560FWw, DialogInterface dialogInterface, int i) {
        C351510DqH c351510DqH = C351510DqH.LIZ;
        C0E48 c0e48 = ((InlineCaptionTextFragment) dialogInterfaceOnClickListenerC391560FWw.l0).LL;
        c351510DqH.getClass();
        C351510DqH.LJJJI(c0e48);
        C0E48 c0e482 = ((InlineCaptionTextFragment) dialogInterfaceOnClickListenerC391560FWw.l0).LL;
        if (c0e482 != null) {
            C350870DpF.LIZ(c0e482, false);
        }
        C0EJ3 c0ej3 = ((InlineCaptionTextFragment) dialogInterfaceOnClickListenerC391560FWw.l0).LLLIIIIL;
        if (c0ej3 != null) {
            c0ej3.Rc();
        }
        ((InlineCaptionTextFragment) dialogInterfaceOnClickListenerC391560FWw.l0).jT();
    }
}
