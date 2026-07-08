package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS144S0110000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.108t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C191981108t extends AbstractC191963108b {
    public final C191848103q LLJ;
    public final C107O LLJI;
    public final C191983108v LLJIJIL;

    public boolean LJJI() {
        return false;
    }

    public void LJJIII(int i, int i2, BaseResponse baseResponse) {
    }

    @Override // X.AbstractC191843103l
    public final List<AbstractC191840103i> LJ(Context context) {
        boolean z;
        boolean z2;
        CharSequence charSequenceLIZ;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        C191986108y c191986108yLIZLLL = C191985108x.LIZLLL(LJIJJLI());
        boolean z4 = c191986108yLIZLLL.LIZ;
        boolean z5 = c191986108yLIZLLL.LIZIZ;
        C191986108y c191986108yLJ = C191985108x.LJ(C856230XiP.LIZ(LJIJJLI(), Integer.valueOf(this.LLJI.LJIIJJI)));
        boolean z6 = c191986108yLJ.LIZ;
        boolean z7 = c191986108yLJ.LIZIZ;
        if (z5 && z7) {
            z = true;
        } else {
            z = false;
        }
        if (LJIJI(z)) {
            Integer value = this.LLIZ.LLILLL.getValue();
            int i = this.LLJI.LJIIJJI;
            if (value != null && value.intValue() == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            CharSequence charSequenceLIZ2 = this.LLJI.LJ.LIZ(context);
            C103N c103n = this.LLJI.LJFF;
            if (c103n == null || (charSequenceLIZ = c103n.LIZ(context)) == null) {
                charSequenceLIZ = "";
            }
            CharSequence charSequenceLJIIZILJ = LJIIZILJ(context, charSequenceLIZ);
            boolean zLJJI = LJJI();
            boolean zLJFF = Intrinsics.LJFF(this.LLIZ.LLILZ.getValue(), Boolean.TRUE);
            if (z4 && z6) {
                z3 = true;
            } else {
                z3 = false;
            }
            C10FD c10fd = new C10FD(null, charSequenceLIZ2, charSequenceLJIIZILJ, new AwS642S0100000_28(this, 105), new AwS607S0100000_28(this, 393), new AwS642S0100000_28(this, 106), z2, zLJFF, z3, zLJJI, null, false, new AwS144S0110000_28(this, z2, 9), 23552);
            this.LLJIJIL.LIZJ = Boolean.valueOf(c10fd.LJIIJ);
            arrayList.add(c10fd);
        }
        return arrayList;
    }

    public C191981108t(C191848103q c191848103q, C107O c107o) {
        super(c191848103q, c107o.LJIIIIZZ, c107o.LJIIIZ, null);
        this.LLJ = c191848103q;
        this.LLJI = c107o;
        this.LLJIJIL = new C191983108v(c107o.LIZ, "Switch");
    }

    public void LJJIFFI(int i, View view) {
        this.LLIZ.wQ2(i, null, new C191982108u(this), new C191980108s(this));
    }

    public void LJJII(int i, int i2, Throwable th) {
        C632200Oqw c632200Oqw;
        String errorMsg;
        if ((th instanceof C632200Oqw) && (c632200Oqw = (C632200Oqw) th) != null && (errorMsg = c632200Oqw.getErrorMsg()) != null && errorMsg.length() != 0) {
            C191960107y.LJ(this.LLJ, errorMsg);
            return;
        }
        C191848103q c191848103q = this.LLJ;
        C191960107y.LIZ();
        C191960107y.LIZLLL(c191848103q, 2131835079);
    }
}
