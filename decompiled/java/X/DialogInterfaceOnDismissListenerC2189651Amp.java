package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Amp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class DialogInterfaceOnDismissListenerC2189651Amp implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC2189651Amp(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC2189651Amp dialogInterfaceOnDismissListenerC2189651Amp, DialogInterface dialogInterface) {
        ((C2176311AFh) dialogInterfaceOnDismissListenerC2189651Amp.l0).LIZJ();
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC2189651Amp dialogInterfaceOnDismissListenerC2189651Amp, DialogInterface dialogInterface) {
        String string;
        String string2;
        String string3;
        Boolean boolValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_loading_dialog_dismiss");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Boolean.valueOf(C520010KaN.LJIIJJI((Context) dialogInterfaceOnDismissListenerC2189651Amp.l0)), "context_valid");
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ((Context) dialogInterfaceOnDismissListenerC2189651Amp.l0);
        Boolean boolValueOf2 = null;
        if (interfaceC214902198iLJIIIIZZ != null) {
            string = Boolean.valueOf(SAFExtensionKt.LJIIZILJ(interfaceC214902198iLJIIIIZZ)).toString();
        } else {
            string = null;
        }
        c474500IjALIZ.LJJII(string, "saf_fragment_destroyed");
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ2 = SAFExtensionKt.LJIIIIZZ((Context) dialogInterfaceOnDismissListenerC2189651Amp.l0);
        if (interfaceC214902198iLJIIIIZZ2 != null) {
            string2 = Boolean.valueOf(SAFExtensionKt.LJIJ(interfaceC214902198iLJIIIIZZ2)).toString();
        } else {
            string2 = null;
        }
        c474500IjALIZ.LJJII(string2, "saf_fragment_released");
        c474500IjALIZ.LJJII(C786410Ut5.u3().toString(), "current_thread");
        Activity activityLIZ = C1388190mED.LIZ((Context) dialogInterfaceOnDismissListenerC2189651Amp.l0);
        if (activityLIZ != null) {
            string3 = activityLIZ.toString();
        } else {
            string3 = null;
        }
        c474500IjALIZ.LJJII(string3, "current_activity");
        Activity activityLIZ2 = C1388190mED.LIZ((Context) dialogInterfaceOnDismissListenerC2189651Amp.l0);
        if (activityLIZ2 != null) {
            boolValueOf = Boolean.valueOf(activityLIZ2.isFinishing());
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(boolValueOf, "activity_finishing");
        Activity activityLIZ3 = C1388190mED.LIZ((Context) dialogInterfaceOnDismissListenerC2189651Amp.l0);
        if (activityLIZ3 != null) {
            boolValueOf2 = Boolean.valueOf(activityLIZ3.isDestroyed());
        }
        c474500IjALIZ.LJJII(boolValueOf2, "activity_destroyed");
        c474500IjALIZ.LIZ();
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC2189651Amp dialogInterfaceOnDismissListenerC2189651Amp, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) dialogInterfaceOnDismissListenerC2189651Amp.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC2189651Amp dialogInterfaceOnDismissListenerC2189651Amp, DialogInterface dialogInterface) {
        InterfaceC21635519lp interfaceC21635519lp = ((AbstractC21634219lc) dialogInterfaceOnDismissListenerC2189651Amp.l0).LLILZ;
        if (interfaceC21635519lp != null) {
            C21635119ll c21635119ll = (C21635119ll) interfaceC21635519lp;
            AbstractC21634219lc abstractC21634219lc = c21635119ll.LIZ;
            if (!abstractC21634219lc.LLIZ && abstractC21634219lc.LJFF().LIZ != null) {
                c21635119ll.LIZ.LJFF().LIZ.onCancel();
            }
        }
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC2189651Amp dialogInterfaceOnDismissListenerC2189651Amp, DialogInterface dialogInterface) {
        if (((EcTakePhotoActivity) dialogInterfaceOnDismissListenerC2189651Amp.l0).getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) dialogInterfaceOnDismissListenerC2189651Amp.l0;
            ecTakePhotoActivity.LLLII = true;
            ecTakePhotoActivity.N();
        }
        IEcExtendAlbumAbility iEcExtendAlbumAbility = (IEcExtendAlbumAbility) C1558520qew.LIZ(C1558360qeg.LJI((EcTakePhotoActivity) dialogInterfaceOnDismissListenerC2189651Amp.l0, null), IEcExtendAlbumAbility.class, null);
        if (iEcExtendAlbumAbility != null) {
            iEcExtendAlbumAbility.dismiss();
        }
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC2189651Amp dialogInterfaceOnDismissListenerC2189651Amp, DialogInterface dialogInterface) {
        if (((EcTakePhotoActivity) dialogInterfaceOnDismissListenerC2189651Amp.l0).getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) dialogInterfaceOnDismissListenerC2189651Amp.l0;
            ecTakePhotoActivity.LLLII = true;
            ecTakePhotoActivity.N();
        }
    }
}
