package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS376S0200000_10;
import u4.q0;

/* JADX INFO: renamed from: X.0QVF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QVF {
    public static void LIZ(View view, int i, String str, View.OnClickListener onClickListener, int i2) {
        C20094413jq c20094413jqLIZ;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            onClickListener = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C1397760mTe c1397760mTe = new C1397760mTe();
                            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
                            c1397760mTe.LIZJ = null;
                            c1397760mTe.LJIIIZ = new AwS376S0200000_10(view, (Function0) null, 87);
                            c20094413jqLIZ = c1397760mTe.LIZ();
                        } else {
                            return;
                        }
                    } else {
                        C1397760mTe c1397760mTe2 = new C1397760mTe();
                        if (str == null) {
                            return;
                        }
                        c1397760mTe2.LIZ = str;
                        c1397760mTe2.LIZIZ = EnumC1397840mTm.BUTTON;
                        c1397760mTe2.LIZJ = null;
                        if (onClickListener == null) {
                            return;
                        }
                        c1397760mTe2.LJ = onClickListener;
                        c1397760mTe2.LJFF = view.getContext().getString(2131823293);
                        c20094413jqLIZ = c1397760mTe2.LIZ();
                    }
                } else {
                    C1397760mTe c1397760mTe3 = new C1397760mTe();
                    if (str == null) {
                        return;
                    }
                    c1397760mTe3.LIZ = str;
                    c1397760mTe3.LIZIZ = EnumC1397840mTm.BUTTON;
                    c1397760mTe3.LIZJ = null;
                    if (onClickListener == null) {
                        return;
                    }
                    c1397760mTe3.LJ = onClickListener;
                    c1397760mTe3.LJFF = view.getContext().getString(2131823294);
                    c20094413jqLIZ = c1397760mTe3.LIZ();
                }
            } else {
                C1397760mTe c1397760mTe4 = new C1397760mTe();
                c1397760mTe4.LIZ = view.getContext().getString(2131823295);
                c20094413jqLIZ = c1397760mTe4.LIZ();
            }
        } else {
            C1397760mTe c1397760mTe5 = new C1397760mTe();
            c1397760mTe5.LIZ = view.getContext().getString(2131823350);
            c20094413jqLIZ = c1397760mTe5.LIZ();
        }
        if (c20094413jqLIZ != null) {
            int i3 = C20094413jq.LJIIZILJ;
            q0.LJIJ(view, c20094413jqLIZ);
        }
    }
}
