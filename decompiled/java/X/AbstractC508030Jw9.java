package X;

import X.C507580JvQ;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: X.0Jw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC508030Jw9<ITEM extends C507580JvQ> extends C0K07<ITEM> {
    public boolean LL;

    public AbstractC508030Jw9(View view) {
        super(view);
    }

    public Map<String, String> P5(ITEM item) {
        return C2097608Jq.LJ();
    }

    public final void R5(ITEM item) {
        if (!this.LL && (!(this instanceof C507140Jui))) {
            View view = this.itemView;
            if (view != null) {
                C2211631BhB.LJ(view, new C507820Jvo(item, this));
            }
            this.LL = true;
        }
    }
}
