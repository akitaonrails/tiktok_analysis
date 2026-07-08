package X;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.020C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020C extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f101i0;
    public int i1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020C c020c, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        layoutParams.width = c020c.f101i0;
        layoutParams.height = c020c.i1;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C020C c020c, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        layoutParams.width = c020c.f101i0;
        layoutParams.height = c020c.i1;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020C c020c, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        layoutParams.width = c020c.f101i0;
        layoutParams.height = c020c.i1;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C020C c020c, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        if (c020c.f101i0 <= iIntValue && iIntValue <= c020c.i1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(C020C c020c, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        if (c020c.f101i0 <= iIntValue && iIntValue <= c020c.i1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020C(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f101i0 = i;
        this.i1 = i2;
    }
}
