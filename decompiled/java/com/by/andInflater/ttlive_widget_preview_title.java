package com.by.andInflater;

import X.C0WZX;
import X.C2204961BRm;
import X.InterfaceC20742716Ev;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.zhiliaoapp.musically.R;
import dc.a;
import java.lang.reflect.Field;
import psf.d;

/* JADX INFO: loaded from: classes32.dex */
public class ttlive_widget_preview_title implements InterfaceC20742716Ev {
    @Override // X.InterfaceC20742716Ev
    public final View LIZ(Context context, ViewGroup viewGroup, boolean z) throws Throwable {
        Resources resources = context.getResources();
        LiveEditText liveEditText = new LiveEditText(context, null);
        liveEditText.setMaxLines(3);
        liveEditText.setPadding(liveEditText.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), liveEditText.getPaddingRight(), liveEditText.getPaddingBottom());
        liveEditText.setPadding(liveEditText.getPaddingLeft(), liveEditText.getPaddingTop(), liveEditText.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        liveEditText.setEllipsize(TextUtils.TruncateAt.END);
        liveEditText.setBackgroundColor(resources.getColor(R.color.a1d));
        liveEditText.setGravity(8388659);
        liveEditText.setImeOptions(6);
        liveEditText.setTextAlignment(5);
        liveEditText.setTextColor(resources.getColorStateList(R.color.f569bc));
        liveEditText.setHintTextColor(resources.getColor(R.color.be));
        if (Build.VERSION.SDK_INT <= 28) {
            Integer numValueOf = Integer.valueOf(R.drawable.een);
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(liveEditText, numValueOf);
        } else {
            C2204961BRm.a0(a.LJFF(TextView.class, Drawable.class), liveEditText, new Object[]{context.getResources().getDrawable(R.drawable.een)}, new C0WZX("dzBzEgAjEcvSUX4vQx6FchA04S/u9RCI17P6siYuTRVq517edkneoTP1StI8Ew==", null));
        }
        liveEditText.setTextSize(1, 17.0f);
        ViewGroup.MarginLayoutParams marginLayoutParamsLJ = a.LJ(-1, -2, viewGroup);
        new d();
        d.LIZ("app:fontType", new a.c("medium"), liveEditText);
        android.view.a.LIZ(liveEditText);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(liveEditText);
        liveEditText.setLayoutParams(marginLayoutParamsLJ);
        if (viewGroup != null && z) {
            viewGroup.addView(liveEditText);
        }
        return liveEditText;
    }
}
