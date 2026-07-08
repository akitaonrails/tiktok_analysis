package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344790DfR {
    public static View LIZ(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        C127K c127k = new C127K(context, null, 6);
        c127k.setId(R.id.wvj);
        c127k.setAccessory(new C127A(context));
        frameLayout.addView(c127k, new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}
