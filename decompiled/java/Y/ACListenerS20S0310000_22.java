package Y;

import X.C336680DHu;
import X.InterfaceC1631620sYq;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: loaded from: classes23.dex */
public class ACListenerS20S0310000_22 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS20S0310000_22 aCListenerS20S0310000_22, View view) {
        if (!aCListenerS20S0310000_22.z3) {
            ((TuxSheet) aCListenerS20S0310000_22.l0).dismiss();
        }
        ((InterfaceC1631620sYq) aCListenerS20S0310000_22.l1).invoke((TuxSheet) aCListenerS20S0310000_22.l0, (C336680DHu) aCListenerS20S0310000_22.l2, Boolean.valueOf(aCListenerS20S0310000_22.z3));
    }

    public static final void onClick$1(ACListenerS20S0310000_22 aCListenerS20S0310000_22, View view) {
        ((InterfaceC1631620sYq) aCListenerS20S0310000_22.l0).invoke((TuxSheet) aCListenerS20S0310000_22.l1, (C336680DHu) aCListenerS20S0310000_22.l2, Boolean.valueOf(aCListenerS20S0310000_22.z3));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS20S0310000_22(com.bytedance.tux.sheet.sheet.TuxSheet r2, X.C336680DHu r3, X.C1408770mlP r4, boolean r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
            r0.z3 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.z3 = r5
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS20S0310000_22.<init>(com.bytedance.tux.sheet.sheet.TuxSheet, X.0DHu, X.0mlP, boolean, int):void");
    }
}
