package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j31, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class DialogInterfaceOnCancelListenerC1265930j31 implements DialogInterface.OnCancelListener {
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
        }
    }

    public DialogInterfaceOnCancelListenerC1265930j31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1265930j31 dialogInterfaceOnCancelListenerC1265930j31, DialogInterface dialogInterface) {
        AnonymousClass0956 anonymousClass0956 = ((ManageGroupViewModel) dialogInterfaceOnCancelListenerC1265930j31.l0).LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1265930j31 dialogInterfaceOnCancelListenerC1265930j31, DialogInterface dialogInterface) {
        if (((C1255650imR) dialogInterfaceOnCancelListenerC1265930j31.l0).LJ()) {
            return;
        }
        C810650Vr5.LIZ(((C1255650imR) dialogInterfaceOnCancelListenerC1265930j31.l0).LIZ, "live_image_popup", "cancel");
    }

    public static final void onCancel$2(DialogInterfaceOnCancelListenerC1265930j31 dialogInterfaceOnCancelListenerC1265930j31, DialogInterface dialogInterface) {
        C810650Vr5.LIZ(((C1255650imR) dialogInterfaceOnCancelListenerC1265930j31.l0).LIZ, "live_image_popup", "cancel");
    }

    public static final void onCancel$3(DialogInterfaceOnCancelListenerC1265930j31 dialogInterfaceOnCancelListenerC1265930j31, DialogInterface dialogInterface) {
        C1255650imR c1255650imR = (C1255650imR) dialogInterfaceOnCancelListenerC1265930j31.l0;
        c1255650imR.LJFF.LIZIZ(EnumC1255640imQ.CANCEL, c1255650imR.LIZ);
    }

    public static final void onCancel$4(DialogInterfaceOnCancelListenerC1265930j31 dialogInterfaceOnCancelListenerC1265930j31, DialogInterface dialogInterface) {
        String str = TuxSheet._pnsPageId;
        if (Intrinsics.LJFF(C1391190mJ3.LJIIJ(dialogInterface), C343980De8.LIZ)) {
            C0DOO c0doo = C0DOO.LIZ;
            EnumC1245820iWa enumC1245820iWa = EnumC1245820iWa.CLOSE;
            C1245860iWe c1245860iWe = ((C1245810iWZ) dialogInterfaceOnCancelListenerC1265930j31.l0).LLILLJJLI;
            c0doo.getClass();
            C0DOO.LJ(enumC1245820iWa, c1245860iWe);
            return;
        }
        C0DOO c0doo2 = C0DOO.LIZ;
        EnumC1245820iWa enumC1245820iWa2 = EnumC1245820iWa.CLOSE_BLANK;
        C1245860iWe c1245860iWe2 = ((C1245810iWZ) dialogInterfaceOnCancelListenerC1265930j31.l0).LLILLJJLI;
        c0doo2.getClass();
        C0DOO.LJ(enumC1245820iWa2, c1245860iWe2);
    }

    public static final void onCancel$5(DialogInterfaceOnCancelListenerC1265930j31 dialogInterfaceOnCancelListenerC1265930j31, DialogInterface dialogInterface) {
        C1261270ivV c1261270ivV = (C1261270ivV) dialogInterfaceOnCancelListenerC1265930j31.l0;
        if (c1261270ivV != null) {
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261300ivY enumC1261300ivY = EnumC1261300ivY.CANCEL;
            c1261250ivT.getClass();
            C1261250ivT.LIZJ(enumC1261300ivY, c1261270ivV);
        }
    }

    public static final void onCancel$6(DialogInterfaceOnCancelListenerC1265930j31 dialogInterfaceOnCancelListenerC1265930j31, DialogInterface dialogInterface) {
        C1261270ivV c1261270ivV = (C1261270ivV) dialogInterfaceOnCancelListenerC1265930j31.l0;
        if (c1261270ivV != null) {
            C1261250ivT c1261250ivT = C1261250ivT.LIZ;
            EnumC1261300ivY enumC1261300ivY = EnumC1261300ivY.CANCEL;
            c1261250ivT.getClass();
            C1261250ivT.LIZJ(enumC1261300ivY, c1261270ivV);
        }
    }
}
