package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0eVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091670eVx extends FrameLayout {
    public static final Field LLILLL;
    public static final Field LLILZ;
    public int LL;
    public int LLILLJJLI;

    static {
        Field declaredField;
        Field field = null;
        try {
            declaredField = View.class.getDeclaredField("mAttachInfo");
            declaredField.setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            declaredField = null;
        }
        LLILLL = declaredField;
        try {
            Field declaredField2 = Class.forName("android.view.View$AttachInfo").getDeclaredField("mVisibleInsets");
            declaredField2.setAccessible(true);
            field = declaredField2;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LLILZ = field;
    }

    public C1091670eVx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object obj;
        try {
            if (Build.VERSION.SDK_INT < 30) {
                Field field = LLILLL;
                Object obj2 = null;
                if (field != null) {
                    obj = field.get(this);
                } else {
                    obj = null;
                }
                Field field2 = LLILZ;
                if (field2 != null) {
                    obj2 = field2.get(obj);
                }
                Rect rect = (Rect) obj2;
                int i3 = this.LL;
                int i4 = rect.top;
                if (i3 != i4 || this.LLILLJJLI != rect.bottom) {
                    this.LL = i4;
                    this.LLILLJJLI = rect.bottom;
                    setPadding(getPaddingLeft(), this.LL, getPaddingRight(), this.LLILLJJLI);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onMeasure(i, i2);
    }

    public C1091670eVx(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = -1;
        this.LLILLJJLI = -1;
    }
}
