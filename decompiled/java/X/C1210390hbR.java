package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210390hbR extends C1210330hbL {
    public final C1106210etP LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.C1210330hbL, X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_heart_broken;
    }

    @Override // X.C1210330hbL, X.InterfaceC1370310llN
    public final EnumC1216710hld LJJJZ() {
        return ((Number) this.LLILLL.getValue()).intValue() == 2 ? EnumC1216710hld.DISLIKEMORE2 : EnumC1216710hld.NORMAL;
    }

    public C1210390hbR(C1106210etP c1106210etP) {
        super(c1106210etP);
        this.LLILLJJLI = c1106210etP;
        this.LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3301));
    }

    @Override // X.C1210330hbL, X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        boolean z = baseSharePackage.extras.getBoolean("ignore_version", false);
        C1106210etP c1106210etP = this.LLILLJJLI;
        InterfaceC1106730euF interfaceC1106730euF = c1106210etP.LJJJJJL;
        if (interfaceC1106730euF != null) {
            interfaceC1106730euF.LIZ(true, z, c1106210etP);
        } else {
            super.LJIILIIL(context, baseSharePackage);
        }
    }
}
