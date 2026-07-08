package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Ytp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888790Ytp implements InterfaceC888860Ytw {
    public final ViewGroup LIZ;
    public final EnumC871430YGn LIZIZ;
    public final Function0<List<AbstractC885540Yoa<?>>> LIZJ;
    public final Function0<Boolean> LIZLLL;
    public final Function0<Boolean> LJ;
    public Function0<Unit> LJFF;

    @Override // X.InterfaceC888860Ytw
    public final EnumC610450Nwx getType() {
        return EnumC610450Nwx.MESSAGE_REQUEST_TURN_ON_PUSH_PERMISSION;
    }

    @Override // X.InterfaceC888860Ytw
    public final void LJI(Context context) {
        Function0<Unit> function0 = this.LJFF;
        if (function0 != null) {
            function0.invoke();
        }
        this.LJFF = null;
    }

    @Override // X.InterfaceC888860Ytw
    public final void LJII(Context context) {
        C0Z4E.LIZ.getClass();
        C888640Yta c888640YtaLJ = C0Z4E.LJ(context, "message_request_banner");
        if (c888640YtaLJ != null) {
            C0Z4E.LJIIJ("message_request_banner");
            c888640YtaLJ.LJII.invoke();
            C894410Z6x c894410Z6x = new C894410Z6x(this.LIZ.getContext());
            String str = c888640YtaLJ.LIZ;
            String str2 = c888640YtaLJ.LIZJ;
            TextView textView = (TextView) c894410Z6x.findViewById(R.id.o9x);
            if (textView != null) {
                textView.setText(str);
            }
            TextView textView2 = (TextView) c894410Z6x.findViewById(R.id.o9w);
            if (textView2 != null) {
                textView2.setText(str2);
            }
            c894410Z6x.setOnAction(new AwS415S0200000_14(c888640YtaLJ, this, 112));
            c894410Z6x.setOnDismiss(new AwS415S0200000_14(c888640YtaLJ, this, 113));
            this.LIZ.addView(c894410Z6x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    @Override // X.InterfaceC888860Ytw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(android.content.Context r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C888790Ytp.LJIIIIZZ(android.content.Context, X.05Vn):java.lang.Object");
    }

    public C888790Ytp(ViewGroup viewGroup, EnumC871430YGn enumC871430YGn, AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142, AwS558S0100000_14 awS558S0100000_143) {
        this.LIZ = viewGroup;
        this.LIZIZ = enumC871430YGn;
        this.LIZJ = awS558S0100000_14;
        this.LIZLLL = awS558S0100000_142;
        this.LJ = awS558S0100000_143;
    }
}
