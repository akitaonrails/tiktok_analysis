package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935140aRU implements InterfaceC517220KQe {
    public final Function1<Boolean, Unit> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C935140aRU(Function1<? super Boolean, Unit> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC517220KQe
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        C20744116Fj c20744116Fj = (C20744116Fj) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.g4g, viewGroup, false);
        C786410Ut5.z7(c20744116Fj, new C986950bn3(this, 8));
        this.LIZ.invoke(Boolean.valueOf(c20744116Fj.isChecked()));
        return c20744116Fj;
    }
}
