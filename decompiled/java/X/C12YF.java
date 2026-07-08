package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12YF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YF implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(C12YF c12yf, View view) {
    }

    public static final void onViewAttachedToWindow$1(C12YF c12yf, View view) {
    }

    public static final void onViewAttachedToWindow$4(C12YF c12yf, View view) {
    }

    public static final void onViewDetachedFromWindow$6(C12YF c12yf, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
        }
    }

    public C12YF(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$2(C12YF c12yf, View view) {
        AnonymousClass1142 anonymousClass1142 = (AnonymousClass1142) c12yf.l0;
        if (!anonymousClass1142.LLJJI) {
            anonymousClass1142.LLJJI = true;
            C036E.LIZ.LIZ(anonymousClass1142.LLJJIII);
        }
    }

    public static final void onViewAttachedToWindow$3(C12YF c12yf, View view) {
        AnonymousClass1141 anonymousClass1141 = (AnonymousClass1141) c12yf.l0;
        if (!anonymousClass1141.LLJJI) {
            anonymousClass1141.LLJJI = true;
            C036E.LIZ.LIZ(anonymousClass1141.LLJJIII);
        }
    }

    public static final void onViewAttachedToWindow$5(C12YF c12yf, View view) {
        ((C11EV) c12yf.l0).I5();
    }

    public static final void onViewAttachedToWindow$6(C12YF c12yf, View view) {
        String str;
        C0HWW c0hww = C0HWW.LIZ;
        boolean zBooleanValue = ((Boolean) ((C19598911m7) c12yf.l0).LJI.getValue()).booleanValue();
        List<String> expressions = ((C19598911m7) c12yf.l0).LJI().getExpressions();
        if (expressions == null || (str = (String) C13LP.LJJJLL(expressions)) == null) {
            str = "";
        }
        boolean zLJJIJIL = C729510SjV.LJJIJIL(((C19598911m7) c12yf.l0).LJFF);
        c0hww.getClass();
        C0HWW.LJIL("show", str, zBooleanValue, zLJJIJIL);
    }

    public static final void onViewDetachedFromWindow$0(C12YF c12yf, View view) {
        C11G2[] c11g2ArrLIZ = C111A.LIZ((TextView) c12yf.l0);
        if (c11g2ArrLIZ != null && c11g2ArrLIZ.length > 0) {
            for (C11G2 c11g2 : c11g2ArrLIZ) {
                c11g2.LL = null;
            }
        }
        ((TextView) c12yf.l0).removeOnAttachStateChangeListener(c12yf);
        ((TextView) c12yf.l0).setTag(R.id.o0u, null);
    }

    public static final void onViewDetachedFromWindow$1(C12YF c12yf, View view) {
        ((Function0) c12yf.l0).invoke();
        view.removeOnAttachStateChangeListener(c12yf);
    }

    public static final void onViewDetachedFromWindow$2(C12YF c12yf, View view) {
        AnonymousClass1142 anonymousClass1142 = (AnonymousClass1142) c12yf.l0;
        if (anonymousClass1142.LLJJI) {
            anonymousClass1142.LLJJI = false;
            C036E.LIZ.LIZLLL(anonymousClass1142.LLJJIII);
        }
    }

    public static final void onViewDetachedFromWindow$3(C12YF c12yf, View view) {
        AnonymousClass1141 anonymousClass1141 = (AnonymousClass1141) c12yf.l0;
        if (anonymousClass1141.LLJJI) {
            anonymousClass1141.LLJJI = false;
            C036E.LIZ.LIZLLL(anonymousClass1141.LLJJIII);
        }
    }

    public static final void onViewDetachedFromWindow$4(C12YF c12yf, View view) {
        AnonymousClass1119.LIZIZ((TextView) c12yf.l0);
        view.removeOnAttachStateChangeListener(c12yf);
        view.setTag(R.id.o0q, null);
    }

    public static final void onViewDetachedFromWindow$5(C12YF c12yf, View view) {
        ((C11EV) c12yf.l0).P5();
    }
}
