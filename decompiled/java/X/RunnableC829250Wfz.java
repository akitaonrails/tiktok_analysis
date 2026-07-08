package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: X.0Wfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC829250Wfz implements Runnable {
    public final C829280Wg2 LL;
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC829260Wg0 LLILLJJLI;

    public RunnableC829250Wfz(AbstractDialogInterfaceOnCancelListenerC829260Wg0 abstractDialogInterfaceOnCancelListenerC829260Wg0, C829280Wg2 c829280Wg2) {
        this.LLILLJJLI = abstractDialogInterfaceOnCancelListenerC829260Wg0;
        this.LL = c829280Wg2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ() throws Exception {
        if (this.LLILLJJLI.LLILLJJLI) {
            ConnectionResult connectionResult = this.LL.LIZIZ;
            if (connectionResult.LJLZ()) {
                AbstractDialogInterfaceOnCancelListenerC829260Wg0 abstractDialogInterfaceOnCancelListenerC829260Wg0 = this.LLILLJJLI;
                InterfaceC831130Wj1 interfaceC831130Wj1 = abstractDialogInterfaceOnCancelListenerC829260Wg0.LL;
                Activity activityLIZIZ = abstractDialogInterfaceOnCancelListenerC829260Wg0.LIZIZ();
                PendingIntent pendingIntent = connectionResult.zzc;
                C0W3J.LJIIIIZZ(pendingIntent);
                int i = this.LL.LIZ;
                Intent intent = new Intent(activityLIZIZ, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                interfaceC831130Wj1.startActivityForResult(intent, 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC829260Wg0 abstractDialogInterfaceOnCancelListenerC829260Wg02 = this.LLILLJJLI;
            if (abstractDialogInterfaceOnCancelListenerC829260Wg02.LLILZIL.getErrorResolutionIntent(abstractDialogInterfaceOnCancelListenerC829260Wg02.LIZIZ(), connectionResult.zzb, null) != null) {
                AbstractDialogInterfaceOnCancelListenerC829260Wg0 abstractDialogInterfaceOnCancelListenerC829260Wg03 = this.LLILLJJLI;
                GoogleApiAvailability googleApiAvailability = abstractDialogInterfaceOnCancelListenerC829260Wg03.LLILZIL;
                Activity activityLIZIZ2 = abstractDialogInterfaceOnCancelListenerC829260Wg03.LIZIZ();
                AbstractDialogInterfaceOnCancelListenerC829260Wg0 abstractDialogInterfaceOnCancelListenerC829260Wg04 = this.LLILLJJLI;
                googleApiAvailability.zag(activityLIZIZ2, abstractDialogInterfaceOnCancelListenerC829260Wg04.LL, connectionResult.zzb, 2, abstractDialogInterfaceOnCancelListenerC829260Wg04);
                return;
            }
            if (connectionResult.zzb == 18) {
                AbstractDialogInterfaceOnCancelListenerC829260Wg0 abstractDialogInterfaceOnCancelListenerC829260Wg05 = this.LLILLJJLI;
                final Dialog dialogZab = abstractDialogInterfaceOnCancelListenerC829260Wg05.LLILZIL.zab(abstractDialogInterfaceOnCancelListenerC829260Wg05.LIZIZ(), this.LLILLJJLI);
                AbstractDialogInterfaceOnCancelListenerC829260Wg0 abstractDialogInterfaceOnCancelListenerC829260Wg06 = this.LLILLJJLI;
                abstractDialogInterfaceOnCancelListenerC829260Wg06.LLILZIL.zac(C786410Ut5.L3(abstractDialogInterfaceOnCancelListenerC829260Wg06.LIZIZ()), new AbstractC2420509e7() { // from class: X.0Wg1
                    @Override // X.AbstractC2420509e7
                    public final void LIZ() {
                        this.LIZIZ.LLILLJJLI.LJIIJJI();
                        if (dialogZab.isShowing()) {
                            C786410Ut5.LIZIZ(dialogZab);
                        }
                    }
                });
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC829260Wg0 abstractDialogInterfaceOnCancelListenerC829260Wg07 = this.LLILLJJLI;
            int i2 = this.LL.LIZ;
            abstractDialogInterfaceOnCancelListenerC829260Wg07.LLILLL.set(null);
            abstractDialogInterfaceOnCancelListenerC829260Wg07.LJIIIZ(connectionResult, i2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zao@41a0.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zao@41a0.run");
    }
}
