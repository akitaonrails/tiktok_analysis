package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901560ZYk implements InterfaceC901580ZYm<C0ZQA> {
    public final C01GW LIZ;
    public final View LIZIZ;

    @Override // X.InterfaceC901580ZYm
    public final View getView() {
        return this.LIZIZ;
    }

    public final void LIZ(C0ZQ8 c0zq8) {
        ((C1390410mHn) this.LIZ.getValue()).LIZJ();
    }

    public C901560ZYk(Context context, C901500ZYe c901500ZYe) {
        this.LIZ = C452501pT.LIZIZ(new AwS558S0100000_14(c901500ZYe, 168));
        this.LIZIZ = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cso, c901500ZYe, false);
    }
}
