package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19PE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PE {
    public final C19RU LIZ;
    public final C19RU LIZIZ;
    public final C19RU LIZJ;
    public final C19RU LIZLLL;
    public final C19RU LJ;
    public final C19RU LJFF;
    public final C19RU LJI;
    public final Paint LJII;

    public C19PE(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C19PF.LIZIZ(context, R.attr.f3n, MaterialCalendar.class.getCanonicalName()), R$styleable.MaterialCalendar);
        this.LIZ = C19RU.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayStyle, 0), context);
        this.LJI = C19RU.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayInvalidStyle, 0), context);
        this.LIZIZ = C19RU.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_daySelectedStyle, 0), context);
        this.LIZJ = C19RU.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayTodayStyle, 0), context);
        ColorStateList colorStateListLIZ = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.MaterialCalendar_rangeFillColor);
        this.LIZLLL = C19RU.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearStyle, 0), context);
        this.LJ = C19RU.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearSelectedStyle, 0), context);
        this.LJFF = C19RU.LIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearTodayStyle, 0), context);
        Paint paint = new Paint();
        this.LJII = paint;
        paint.setColor(colorStateListLIZ.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
