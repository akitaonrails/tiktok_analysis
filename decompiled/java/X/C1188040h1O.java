package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0h1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188040h1O extends FrameLayout {
    public static final /* synthetic */ int LLILZLL = 0;
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public ViewGroup LLILLL;
    public InterfaceC665370Q7z LLILZ;
    public PageFinder LLILZIL;

    public C1188040h1O(Context context) {
        super(context, null);
    }

    public static void LIZ(LinearLayout linearLayout, boolean z) {
        linearLayout.setClickable(z);
        Iterator<View> it2 = new C09RD(linearLayout).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                ((View) c09re.next()).setClickable(z);
            } else {
                return;
            }
        }
    }
}
