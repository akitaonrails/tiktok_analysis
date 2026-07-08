package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0aU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936740aU4 implements InterfaceC517220KQe {
    public final Function1<Boolean, Unit> LIZ;

    public C936740aU4(AwS584S0100000_5 awS584S0100000_5) {
        this.LIZ = awS584S0100000_5;
    }

    @Override // X.InterfaceC517220KQe
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        C20744116Fj c20744116Fj = (C20744116Fj) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.g4f, viewGroup, false);
        C786410Ut5.z7(c20744116Fj, new C986950bn3(this, 11));
        this.LIZ.invoke(Boolean.valueOf(c20744116Fj.isChecked()));
        return c20744116Fj;
    }
}
