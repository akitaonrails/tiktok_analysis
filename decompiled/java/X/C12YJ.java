package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YJ implements DialogInterface.OnCancelListener {
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
        }
    }

    public C12YJ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCancel$1(C12YJ c12yj, DialogInterface dialogInterface) {
        AbstractC19511111Vd abstractC19511111Vd = ((C19510811Va) c12yj.l0).LLILLJJLI;
        if (abstractC19511111Vd == null) {
            abstractC19511111Vd = null;
        }
        abstractC19511111Vd.getClass();
    }

    public static final void onCancel$2(C12YJ c12yj, DialogInterface dialogInterface) {
        ((C12D1) c12yj.l0).K4();
    }

    public static final void onCancel$3(C12YJ c12yj, DialogInterface dialogInterface) {
        Function0<Unit> function0 = ((DialogC194307110f) c12yj.l0).LLJJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onCancel$4(C12YJ c12yj, DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = ((CreativeLoadingDialogBuilder) c12yj.l0).getConfig().cancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public static final void onCancel$5(C12YJ c12yj, DialogInterface dialogInterface) {
        ((InterfaceC784910Uqf) c12yj.l0).cancel();
    }

    public static final void onCancel$0(C12YJ c12yj, DialogInterface dialogInterface) {
    }
}
