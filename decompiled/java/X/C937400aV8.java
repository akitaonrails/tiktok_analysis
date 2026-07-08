package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aV8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937400aV8 implements InterfaceC517220KQe {
    public final Function1<Boolean, Unit> LIZ;

    public C937400aV8(AwS594S0100000_15 awS594S0100000_15) {
        this.LIZ = awS594S0100000_15;
    }

    @Override // X.InterfaceC517220KQe
    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        C20744116Fj c20744116Fj = (C20744116Fj) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.g4h, viewGroup, false);
        C786410Ut5.z7(c20744116Fj, new C986950bn3(this, 9));
        this.LIZ.invoke(Boolean.valueOf(c20744116Fj.isChecked()));
        return c20744116Fj;
    }
}
