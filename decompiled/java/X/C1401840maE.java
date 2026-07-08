package X;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: X.0maE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401840maE extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1401840maE c1401840maE, View view) {
        if (view != null) {
            C786410Ut5.LIZIZ((Dialog) c1401840maE.l0);
            ((C1399360mWE) c1401840maE.l1).LJJJLL(view, (C2344009Gk) c1401840maE.l2);
        }
    }

    public static final void LIZ$1(C1401840maE c1401840maE, View view) {
        if (view != null) {
            C786410Ut5.LIZIZ((Dialog) c1401840maE.l0);
            ((C1394670mOf) c1401840maE.l1).LJJJLL(view, (C2344009Gk) c1401840maE.l2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401840maE(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
