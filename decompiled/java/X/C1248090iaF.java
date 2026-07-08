package X;

import android.content.Context;
import android.widget.TextView;
import com.bytedance.tux.tag.TuxTag;

/* JADX INFO: renamed from: X.0iaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248090iaF extends C430750Gun<TuxTag> {
    public C1248090iaF(Context context) {
        super(new TuxTag(context, null, 6));
    }

    public final void LIZ(int i) {
        ((TuxTag) this.LL).setTagBackgroundColor(i);
    }

    public final void LIZIZ(int i) {
        ((TuxTag) this.LL).setTagSize(i);
    }

    public final void LIZJ(String str) {
        ((TextView) this.LL).setText(str);
    }

    public final void LIZLLL(int i) {
        ((TuxTag) this.LL).setTagTextColor(i);
    }
}
