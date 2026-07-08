package Y;

import X.C189200o6;
import X.C23260099m;
import X.C500840JkY;
import X.C758060ToS;
import X.C758880Tpm;
import X.C758920Tpq;
import X.InterfaceC1364105Vn;
import X.InterfaceC743640TFa;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AcS83S0400000_12 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS83S0400000_12 acS83S0400000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Function2) acS83S0400000_12.l0).invoke((Context) acS83S0400000_12.l1, (PerceptionDialogInfo) acS83S0400000_12.l2);
        Function2 function2 = (Function2) acS83S0400000_12.l3;
        if (function2 != null) {
            function2.invoke("click", "suggest_tab");
        }
    }

    public static final void LIZ$1(AcS83S0400000_12 acS83S0400000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function2 function2 = (Function2) acS83S0400000_12.l0;
        if (function2 != null) {
            function2.invoke("click", "default_tab");
        }
        ((Function2) acS83S0400000_12.l1).invoke((Context) acS83S0400000_12.l2, (PerceptionDialogInfo) acS83S0400000_12.l3);
    }

    public static final void LIZ$2(AcS83S0400000_12 acS83S0400000_12, LiveDialog liveDialog) {
        Function0<Unit> function0;
        liveDialog.dismiss();
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) acS83S0400000_12.l0;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        C758920Tpq c758920Tpq = (C758920Tpq) acS83S0400000_12.l1;
        if (c758920Tpq != null && (function0 = c758920Tpq.LJFF) != null) {
            function0.invoke();
        }
        ((C758880Tpm) acS83S0400000_12.l2).getClass();
        C758880Tpm.LIZLLL("hide");
        C758060ToS.LIZIZ(((C500840JkY) acS83S0400000_12.l3).LIZIZ, "click_remove");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AcS83S0400000_12(android.content.Context r2, com.bytedance.android.livesdk.model.message.PerceptionDialogInfo r3, kotlin.jvm.functions.Function2 r4, kotlin.jvm.functions.Function2 r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r5
            r0.l2 = r2
            r0.l3 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
            r0.l3 = r5
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AcS83S0400000_12.<init>(android.content.Context, com.bytedance.android.livesdk.model.message.PerceptionDialogInfo, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int):void");
    }

    public AcS83S0400000_12(C23260099m c23260099m, C758920Tpq c758920Tpq, C758880Tpm c758880Tpm, C500840JkY c500840JkY, int i) {
        this.$t = i;
        this.l0 = c23260099m;
        this.l1 = c758920Tpq;
        this.l2 = c758880Tpm;
        this.l3 = c500840JkY;
    }
}
