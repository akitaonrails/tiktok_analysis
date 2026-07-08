package X;

import android.app.Dialog;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ldl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365590ldl extends C09AY implements Function2<AbstractC1375550ltp, Boolean, Unit> {
    public final /* synthetic */ InterfaceC1369790lkX LL;
    public final /* synthetic */ DialogC1369990lkr LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365590ldl(int i, InterfaceC1369790lkX interfaceC1369790lkX, DialogC1369990lkr dialogC1369990lkr) {
        super(2);
        this.LL = interfaceC1369790lkX;
        this.LLILLJJLI = dialogC1369990lkr;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AbstractC1375550ltp abstractC1375550ltp, Boolean bool) {
        boolean zLJJIIJ;
        AbstractC1375550ltp abstractC1375550ltp2 = abstractC1375550ltp;
        if (bool.booleanValue()) {
            zLJJIIJ = this.LL.LJJIIJ(abstractC1375550ltp2, this.LLILLJJLI.LLIZ, null);
        } else {
            zLJJIIJ = false;
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIIIZ(false, this.LLILLJJLI.LLIZLLLIL.LJIJJ, this.LLILLL);
        DialogC1369990lkr dialogC1369990lkr = this.LLILLJJLI;
        C1371590lnR c1371590lnR = dialogC1369990lkr.LLIZLLLIL;
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LIZ(this.LL, zLJJIIJ, c1371590lnR.LJIJJ, dialogC1369990lkr.LLIZ);
        }
        if (C1366550lfJ.LIZ(this.LL.key())) {
            C0FNV.LIZ((Dialog) this.LLILLJJLI.LLJ.getValue());
        }
        if (!this.LL.LIZJ()) {
            C786410Ut5.LJIILJJIL(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
