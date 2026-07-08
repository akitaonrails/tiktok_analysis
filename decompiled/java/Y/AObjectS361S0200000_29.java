package Y;

import X.C196868120s;
import X.C196870120u;
import X.C196871120v;
import X.C196874120y;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AObjectS361S0200000_29 implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS361S0200000_29(C196868120s c196868120s, C196874120y c196874120y, int i) {
        this.$t = i;
        this.l0 = c196868120s;
        this.l1 = c196874120y;
    }

    public static final Object invoke$0(AObjectS361S0200000_29 aObjectS361S0200000_29, Object obj, Object obj2) {
        C196870120u c196870120u;
        C196868120s c196868120s = (C196868120s) aObjectS361S0200000_29.l0;
        C196874120y c196874120y = (C196874120y) aObjectS361S0200000_29.l1;
        Float f = (Float) obj;
        Float f2 = (Float) obj2;
        C196871120v c196871120v = c196868120s.LLILLL;
        if (c196871120v != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            c196870120u.LJI(c196874120y, f.floatValue(), f2.floatValue());
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS361S0200000_29 aObjectS361S0200000_29, Object obj, Object obj2) {
        C196870120u c196870120u;
        C196868120s c196868120s = (C196868120s) aObjectS361S0200000_29.l0;
        C196874120y c196874120y = (C196874120y) aObjectS361S0200000_29.l1;
        Float f = (Float) obj;
        Float f2 = (Float) obj2;
        C196871120v c196871120v = c196868120s.LLILLL;
        if (c196871120v != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            c196870120u.LJI(c196874120y, f.floatValue(), f2.floatValue());
            return null;
        }
        return null;
    }
}
