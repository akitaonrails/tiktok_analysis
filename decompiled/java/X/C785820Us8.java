package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: X.0Us8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785820Us8 extends Property {
    public final int $t;

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.$t) {
            case 0:
                return get$0(this, obj);
            case 1:
                return get$1(this, obj);
            case 2:
                return get$2(this, obj);
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
            case 2:
                set$2(this, obj, obj2);
                break;
            default:
                super.set(obj, obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C785820Us8(Class cls, Class<Integer> cls2) {
        super(cls, "backgroundColor");
        this.$t = cls2;
    }

    public static final Object get$0(C785820Us8 c785820Us8, Object obj) {
        int color;
        ColorDrawable colorDrawable;
        Drawable background = ((View) obj).getBackground();
        if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
            color = colorDrawable.getColor();
        } else {
            color = 0;
        }
        return Integer.valueOf(color);
    }

    public static final Object get$1(C785820Us8 c785820Us8, Object obj) {
        int color;
        ColorDrawable colorDrawable;
        Drawable background = ((View) obj).getBackground();
        if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
            color = colorDrawable.getColor();
        } else {
            color = -1;
        }
        return Integer.valueOf(color);
    }

    public static final Object get$2(C785820Us8 c785820Us8, Object obj) {
        int color;
        ColorDrawable colorDrawable;
        Drawable background = ((View) obj).getBackground();
        if ((background instanceof ColorDrawable) && (colorDrawable = (ColorDrawable) background) != null) {
            color = colorDrawable.getColor();
        } else {
            color = 0;
        }
        return Integer.valueOf(color);
    }

    public static final void set$0(C785820Us8 c785820Us8, Object obj, Object obj2) {
        ((View) obj).setBackgroundColor(((Number) obj2).intValue());
    }

    public static final void set$1(C785820Us8 c785820Us8, Object obj, Object obj2) {
        ((View) obj).setBackgroundColor(((Number) obj2).intValue());
    }

    public static final void set$2(C785820Us8 c785820Us8, Object obj, Object obj2) {
        ((View) obj).setBackgroundColor(((Number) obj2).intValue());
    }
}
