package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901550ZYj implements InterfaceC901580ZYm<C0ZQ9> {
    public final C01GW LIZ;
    public final View LIZIZ;

    @Override // X.InterfaceC901580ZYm
    public final View getView() {
        return this.LIZIZ;
    }

    public final void LIZ(C0ZQ8 c0zq8) {
        ((C1390410mHn) this.LIZ.getValue()).LIZJ();
    }

    public C901550ZYj(Context context, C901500ZYe c901500ZYe) {
        this.LIZ = C452501pT.LIZIZ(new AwS558S0100000_14(c901500ZYe, 166));
        this.LIZIZ = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.csk, c901500ZYe, false);
    }
}
