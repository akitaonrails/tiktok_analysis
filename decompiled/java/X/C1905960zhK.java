package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905960zhK extends AbstractC1542070qEP {
    public C1749280vcc LLILLJJLI;
    public Context LLILLL;

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        return null;
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        this.LLILLL = context;
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        c1749280vcc.setLayoutVariant(0);
        this.LLILLJJLI = c1749280vcc;
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
        String string;
        Resources resources;
        String string2;
        Resources resources2;
        int i = C2187451AjH.LIZ;
        Context context = this.LLILLL;
        if (context != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            Context context2 = this.LLILLL;
            String str = "";
            if (context2 == null || (resources2 = context2.getResources()) == null || (string = resources2.getString(2131822205)) == null) {
                string = "";
            }
            Context context3 = this.LLILLL;
            if (context3 != null && (resources = context3.getResources()) != null && (string2 = resources.getString(2131822204)) != null) {
                str = string2;
            }
            C1893080zMY.LIZJ(c1722300uv6, string, str, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(72.0d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(72.0d))), R.raw.icon_2pt_refresh, new AwS572S0100000_28(interfaceC1051240dSk, 815));
            c1722300uv6.LJIIIZ = new AwS607S0100000_28(context, 244);
            C1749280vcc c1749280vcc = this.LLILLJJLI;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            c1749280vcc.setStatus(c1722300uv6);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1f, context);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                C1749280vcc c1749280vcc2 = this.LLILLJJLI;
                if (c1749280vcc2 == null) {
                    c1749280vcc2 = null;
                }
                c1749280vcc2.setBackgroundColor(iIntValue);
            }
        }
        C1749280vcc c1749280vcc3 = this.LLILLJJLI;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        C1749280vcc c1749280vcc4 = this.LLILLJJLI;
        if (c1749280vcc4 == null) {
            return null;
        }
        return c1749280vcc4;
    }
}
