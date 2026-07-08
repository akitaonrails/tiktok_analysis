package X;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521920KdS implements C0XTR {
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
        }
    }

    public C521920KdS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C521920KdS c521920KdS, int i, int i2, Object obj) {
        Function1 function1 = (Function1) c521920KdS.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    public static final void onResult$1(C521920KdS c521920KdS, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                C519480KYw c519480KYw = C519480KYw.LIZ;
                Context context = (Context) c521920KdS.l0;
                c519480KYw.getClass();
                C519480KYw.LJIIJJI(context);
                return;
            }
            C519480KYw.LIZ.getClass();
            C519480KYw.LJII = false;
        }
    }
}
