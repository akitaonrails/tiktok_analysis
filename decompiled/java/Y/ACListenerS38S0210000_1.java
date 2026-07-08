package Y;

import X.C1391190mJ3;
import X.C343970De7;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class ACListenerS38S0210000_1 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void onClick$0(ACListenerS38S0210000_1 aCListenerS38S0210000_1, View view) {
        ((Function0) aCListenerS38S0210000_1.l0).invoke();
        if (aCListenerS38S0210000_1.z2) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJ((View) aCListenerS38S0210000_1.l1, C343970De7.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS38S0210000_1 r19, android.view.View r20) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS38S0210000_1.onClick$1(Y.ACListenerS38S0210000_1, android.view.View):void");
    }

    public ACListenerS38S0210000_1(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.z2 = z;
        this.l1 = obj;
    }
}
