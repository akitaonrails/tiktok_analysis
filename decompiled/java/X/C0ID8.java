package X;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0ID8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID8 extends Property {
    public final int $t;

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.$t) {
            case 0:
                return get$0(this, obj);
            case 1:
                return get$1(this, obj);
            default:
                return super.get(obj);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                set$0(this, obj, obj2);
                break;
            case 1:
                set$1(this, obj, obj2);
                break;
            default:
                super.set(obj, obj2);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C0ID8(java.lang.Class r3, java.lang.Class<java.lang.Integer> r4) {
        /*
            r2 = this;
            r2.$t = r4
            if (r4 == 0) goto Lb
            r0 = r2
            java.lang.String r1 = "width"
        L7:
            r0.<init>(r3, r1)
            return
        Lb:
            r0 = r2
            java.lang.String r1 = "height"
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ID8.<init>(java.lang.Class, int):void");
    }

    public static final Object get$0(C0ID8 c0id8, Object obj) {
        return Integer.valueOf(((View) obj).getHeight());
    }

    public static final Object get$1(C0ID8 c0id8, Object obj) {
        return Integer.valueOf(((View) obj).getLayoutParams().width);
    }

    public static final void set$0(C0ID8 c0id8, Object obj, Object obj2) {
        View view = (View) obj;
        int iIntValue = ((Number) obj2).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iIntValue;
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void set$1(C0ID8 c0id8, Object obj, Object obj2) {
        View view = (View) obj;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = ((Integer) obj2).intValue();
        C786410Ut5.W5(view, layoutParams);
    }
}
