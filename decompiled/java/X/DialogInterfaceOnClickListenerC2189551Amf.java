package X;

import android.content.DialogInterface;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Amf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class DialogInterfaceOnClickListenerC2189551Amf implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onClick$1(DialogInterfaceOnClickListenerC2189551Amf dialogInterfaceOnClickListenerC2189551Amf, DialogInterface dialogInterface, int i) {
        C1AJO.B0((C1AJO) dialogInterfaceOnClickListenerC2189551Amf.l0, (Function0) dialogInterfaceOnClickListenerC2189551Amf.l1, dialogInterface);
    }

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
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC2189551Amf(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC2189551Amf dialogInterfaceOnClickListenerC2189551Amf, DialogInterface dialogInterface, int i) {
        CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) dialogInterfaceOnClickListenerC2189551Amf.l0;
        Room room = (Room) dialogInterfaceOnClickListenerC2189551Amf.l1;
        copyrightViolationHelper.getClass();
        dialogInterface.dismiss();
        CopyrightViolationHelper.LIZJ(room, false, "cancel");
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC2189551Amf dialogInterfaceOnClickListenerC2189551Amf, DialogInterface dialogInterface, int i) {
        if (!((C21566819ak) dialogInterfaceOnClickListenerC2189551Amf.l0).LIZIZ) {
            dialogInterface.dismiss();
        }
        DialogInterface.OnClickListener onClickListener = ((C21566819ak) dialogInterfaceOnClickListenerC2189551Amf.l0).LIZJ;
        if (onClickListener != null) {
            onClickListener.onClick((C21566519ah) dialogInterfaceOnClickListenerC2189551Amf.l1, i);
        }
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC2189551Amf dialogInterfaceOnClickListenerC2189551Amf, DialogInterface dialogInterface, int i) {
        if (!((C21566819ak) dialogInterfaceOnClickListenerC2189551Amf.l0).LIZIZ) {
            dialogInterface.dismiss();
        }
        DialogInterface.OnClickListener onClickListener = ((C21566819ak) dialogInterfaceOnClickListenerC2189551Amf.l0).LIZJ;
        if (onClickListener != null) {
            onClickListener.onClick((C21566519ah) dialogInterfaceOnClickListenerC2189551Amf.l1, i);
        }
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC2189551Amf dialogInterfaceOnClickListenerC2189551Amf, DialogInterface dialogInterface, int i) {
        if (!((C21566819ak) dialogInterfaceOnClickListenerC2189551Amf.l0).LIZIZ) {
            dialogInterface.dismiss();
        }
        DialogInterface.OnClickListener onClickListener = ((C21566819ak) dialogInterfaceOnClickListenerC2189551Amf.l0).LIZJ;
        if (onClickListener != null) {
            onClickListener.onClick((C21566519ah) dialogInterfaceOnClickListenerC2189551Amf.l1, i);
        }
    }
}
