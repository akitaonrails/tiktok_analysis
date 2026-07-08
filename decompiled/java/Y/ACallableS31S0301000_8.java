package Y;

import X.C0MV0;
import X.C1C7U;
import X.C2188811AlT;
import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS94S0201000_8;

/* JADX INFO: loaded from: classes9.dex */
public class ACallableS31S0301000_8 implements Callable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS31S0301000_8 aCallableS31S0301000_8) {
        C1C7U.LIZ("CheckPointServiceImpl@1176.saveDraftOnV3PushShow$1");
        AwemeDraft awemeDraftLJIIIIZZ = ((C0MV0) aCallableS31S0301000_8.l0).LJIIIIZZ();
        if (awemeDraftLJIIIIZZ == null) {
            C0MV0 c0mv0 = (C0MV0) aCallableS31S0301000_8.l0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveDraftOnV3PushShow: no draft for scene=");
            C0MV0 c0mv02 = (C0MV0) aCallableS31S0301000_8.l0;
            int i = aCallableS31S0301000_8.i3;
            c0mv02.getClass();
            sbLIZ.append(C0MV0.LJIJJ(i));
            sbLIZ.append(", skip");
            C2188811AlT.LIZIZ(sbLIZ);
            c0mv0.getClass();
            ((Function0) aCallableS31S0301000_8.l1).invoke();
        } else {
            ((C0MV0) aCallableS31S0301000_8.l0).getClass();
            if (!C0MV0.LJIL(awemeDraftLJIIIIZZ) && !awemeDraftLJIIIIZZ.LJJJI) {
                C0MV0 c0mv03 = (C0MV0) aCallableS31S0301000_8.l0;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("saveDraftOnV3PushShow: already formal draft, skip re-save, keep checkpoint scene=");
                C0MV0 c0mv04 = (C0MV0) aCallableS31S0301000_8.l0;
                int i2 = aCallableS31S0301000_8.i3;
                c0mv04.getClass();
                sbLIZ2.append(C0MV0.LJIJJ(i2));
                sbLIZ2.append(", ");
                ((C0MV0) aCallableS31S0301000_8.l0).getClass();
                sbLIZ2.append(C0MV0.LJJI(awemeDraftLJIIIIZZ));
                C2188811AlT.LIZIZ(sbLIZ2);
                c0mv03.getClass();
                ((Function0) aCallableS31S0301000_8.l1).invoke();
            } else {
                C0MV0.LJJIIJZLJL((C0MV0) aCallableS31S0301000_8.l0, (Activity) aCallableS31S0301000_8.l2, 34, false, 0, new AwS581S0100000_2((Function0) aCallableS31S0301000_8.l1, (Function0<Unit>) 717), 8);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.saveDraftOnV3PushShow$1");
        return unit;
    }

    public static final Object call$1(ACallableS31S0301000_8 aCallableS31S0301000_8) {
        C1C7U.LIZ("CheckPointServiceImpl@1176.saveDraftOnV3PushShow$2");
        C0MV0 c0mv0 = (C0MV0) aCallableS31S0301000_8.l0;
        C0MV0.LJJIIZ(c0mv0, (Activity) aCallableS31S0301000_8.l1, 34, new AwS94S0201000_8(c0mv0, (C0MV0) aCallableS31S0301000_8.i3, (int) aCallableS31S0301000_8.l2, (Function0<Unit>) 8), false, 0, 32);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.saveDraftOnV3PushShow$2");
        return unit;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACallableS31S0301000_8(int r2, android.app.Activity r3, X.C0MV0 r4, kotlin.jvm.internal.AwS148S0101000_8 r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.i3 = r2
            r0.l2 = r5
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.i3 = r2
            r0.l1 = r5
            r0.l2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS31S0301000_8.<init>(int, android.app.Activity, X.0MV0, kotlin.jvm.internal.AwS148S0101000_8, int):void");
    }
}
