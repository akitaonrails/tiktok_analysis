package X;

import android.util.Property;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429540Gsq extends Property<ViewGroup, Float> {
    public static final C429540Gsq LIZ = new C429540Gsq();

    public C429540Gsq() {
        super(Float.class, "childrenAlpha");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, java.lang.Object] */
    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        ?? tag = viewGroup.getTag(R.id.omu);
        if (tag == 0) {
            return Float.valueOf(1.0f);
        }
        return tag;
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float fFloatValue = f.floatValue();
        viewGroup2.setTag(R.id.omu, Float.valueOf(fFloatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C786410Ut5.T4(viewGroup2.getChildAt(i), fFloatValue);
        }
    }
}
