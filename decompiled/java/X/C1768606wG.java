package X;

import Y.ARunnableS102S0100000_2;
import android.app.Activity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06wG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768606wG implements C0XTR {
    public final int $t;
    public Object l0;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                break;
            case 1:
                onResult$1(this, i, i2, obj);
                break;
            case 2:
                onResult$2(this, i, i2, obj);
                break;
        }
    }

    public C1768606wG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C1768606wG c1768606wG, int i, int i2, Object obj) {
        if (i2 == 1) {
            Activity activity = (Activity) c1768606wG.l0;
            activity.runOnUiThread(new ARunnableS102S0100000_2(activity, 12));
        }
    }

    public static final void onResult$1(C1768606wG c1768606wG, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            ((Function1) c1768606wG.l0).invoke(Boolean.TRUE);
        } else {
            ((Function1) c1768606wG.l0).invoke(Boolean.FALSE);
        }
    }

    public static final void onResult$2(C1768606wG c1768606wG, int i, int i2, Object obj) {
        ((InterfaceC1631620sYq) c1768606wG.l0).invoke(Integer.valueOf(i), Integer.valueOf(i2), obj);
    }
}
