package Y;

import X.AbstractC947703n9;
import X.C03AQ;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AObserverS205S0100000_1 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public AObserverS205S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS205S0100000_1 aObserverS205S0100000_1, Object obj) {
        V v = ((AbstractC947703n9) aObserverS205S0100000_1.l0).LIZ;
        if (v != 0) {
            v.LJFF();
        }
    }

    public static final void onChanged$1(AObserverS205S0100000_1 aObserverS205S0100000_1, Object obj) {
        List list = (List) obj;
        if (list != null) {
            C03AQ c03aq = ((SearchStickerViewContainer) aObserverS205S0100000_1.l0).LLJJJ;
            if (c03aq == null) {
                c03aq = null;
            }
            c03aq.getClass();
            if (!list.isEmpty()) {
                ((ArrayList) c03aq.LLILLJJLI).clear();
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        ((ArrayList) c03aq.LLILLJJLI).add(obj2);
                    }
                }
                c03aq.notifyDataSetChanged();
            }
        }
    }
}
