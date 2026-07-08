package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.MixStudioFlowController;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IDY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDY implements DialogInterface.OnDismissListener {
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

    public static final void onDismiss$0(C0IDY c0idy, DialogInterface dialogInterface) {
        ((InterfaceC332260D0u) ((MixStudioFlowController) c0idy.l0).LIZ.getValue()).setValue(Boolean.FALSE);
        Function0 function0 = (Function0) c0idy.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$1(C0IDY c0idy, DialogInterface dialogInterface) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJ((TuxSheet) ((C259800zU) c0idy.l0).element, ((C1226350i1B) c0idy.l1).LLILLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0IDY(Object obj, MixStudioFlowController mixStudioFlowController, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = mixStudioFlowController;
    }
}
