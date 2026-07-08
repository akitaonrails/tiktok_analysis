package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119220fEO implements InterfaceC517220KQe {
    public final Function1<Boolean, Unit> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1119220fEO(Function1<? super Boolean, Unit> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC517220KQe
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        C20744116Fj c20744116Fj;
        boolean zIsChecked = false;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gaw, viewGroup, false);
        if (viewTd instanceof C20744116Fj) {
            c20744116Fj = (C20744116Fj) viewTd;
            if (c20744116Fj != null) {
                C786410Ut5.z7(c20744116Fj, new C1151630g4f(this, 1));
            }
        } else {
            c20744116Fj = null;
        }
        Function1<Boolean, Unit> function1 = this.LIZ;
        if (c20744116Fj != null) {
            zIsChecked = c20744116Fj.isChecked();
        }
        function1.invoke(Boolean.valueOf(zIsChecked));
        return c20744116Fj;
    }
}
