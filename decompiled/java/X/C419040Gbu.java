package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Gbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419040Gbu extends LinearLayout {
    public static final int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public TuxTextView LL;
    public SmartImageView LLILLJJLI;
    public TuxIconView LLILLL;
    public int LLILZ;

    public C419040Gbu(Context context) {
        super(context, null, 0);
        setOrientation(0);
        setGravity(16);
    }

    public final void LIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int marginStart = marginLayoutParams.getMarginStart();
            int i = this.LLILZ;
            if (marginStart != i) {
                marginLayoutParams.setMarginStart(i);
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
    }

    public final void setInternalSpace(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        if (this.LLILZ == iLIZIZ) {
            return;
        }
        this.LLILZ = iLIZIZ;
        LIZ(this.LLILLJJLI);
        LIZ(this.LLILLL);
    }
}
