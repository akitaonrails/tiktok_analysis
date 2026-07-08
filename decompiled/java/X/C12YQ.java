package X;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12YQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YQ implements DialogInterface.OnDismissListener {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12YQ(Object obj, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
    }

    public static final void onDismiss$0(C12YQ c12yq, DialogInterface dialogInterface) {
        Function0 function0 = (Function0) c12yq.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onDismiss$1(C12YQ c12yq, DialogInterface dialogInterface) {
        ((Function0) c12yq.l0).invoke();
    }

    public static final void onDismiss$2(C12YQ c12yq, DialogInterface dialogInterface) {
        ((Function0) c12yq.l0).invoke();
    }

    public static final void onDismiss$3(C12YQ c12yq, DialogInterface dialogInterface) {
        InterfaceC455470HtZ interfaceC455470HtZ;
        C705930RmZ c705930RmZ = ((C19600611mO) c12yq.l0).LLILLJJLI;
        if (c705930RmZ != null && (interfaceC455470HtZ = c705930RmZ.LJIILLIIL) != null) {
            interfaceC455470HtZ.LJIILLIIL();
        }
    }
}
