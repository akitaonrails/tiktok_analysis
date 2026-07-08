package X;

import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0IeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC471430IeD extends AbstractC471420IeC<FeedItem> {
    public final C11RK<FeedItem> LLJJIJI;
    public final C11RK<Object> LLJJIJIIJIL;
    public final C11RK<Object> LLJJIJIL;
    public final C11RK<Pair<Boolean, String>> LLJJJ;
    public final C11RK<Object> LLJJJIL;
    public final AtomicBoolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final Map<Integer, InterfaceC468510IYv> LLJJL;
    public Object[] LLJJLIIIJLLLLLLLZ;

    public abstract int LLLLIILL(int i);

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0IeW] */
    public AbstractC471430IeD(Map<Integer, InterfaceC468510IYv> map) {
        final int i = 0;
        super(new AbstractC339510DSr<FeedItem>(i) { // from class: X.0IeW
            @Override // X.AbstractC339510DSr
            public final /* bridge */ /* synthetic */ boolean LIZ(FeedItem feedItem, FeedItem feedItem2) {
                return false;
            }

            @Override // X.AbstractC339510DSr
            public final /* bridge */ /* synthetic */ boolean LIZIZ(FeedItem feedItem, FeedItem feedItem2) {
                return false;
            }
        });
        C11RK<FeedItem> c11rk = new C11RK<>();
        this.LLJJIJI = c11rk;
        this.LLJJIJIIJIL = new C11RK<>();
        this.LLJJIJIL = new C11RK<>();
        this.LLJJJ = new C11RK<>();
        this.LLJJJIL = new C11RK<>();
        this.LLJJJJ = new AtomicBoolean();
        this.LLJJJJLIIL = true;
        this.LLJJL = map;
        c11rk.LJJLL(new AfS176S0100000_7(this, 206), new AfS132S0000000_7(27));
    }

    @Override // X.AbstractC471420IeC
    public final int LLLIL(Object obj) {
        FeedItem feedItem = (FeedItem) obj;
        if (feedItem == null) {
            return -8888;
        }
        return LLLLIILL(feedItem.type);
    }

    @Override // X.AbstractC471420IeC, X.AbstractC21673619ry
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (this.LLJJJJJIL) {
            return;
        }
        EnumC486990J7x enumC486990J7x = EnumC486990J7x.LiveFeedInit;
        String string = viewHolder.getClass().toString();
        boolean z = C486980J7w.LIZ;
        HashMap map = new HashMap();
        map.put("viewholder", string);
        C486980J7w.LJ(enumC486990J7x, map);
    }

    @Override // X.AbstractC471420IeC
    public final AbstractC468490IYt LLLL(int i, final ViewGroup viewGroup) {
        InterfaceC468510IYv interfaceC468510IYv = this.LLJJL.get(Integer.valueOf(i));
        if (interfaceC468510IYv == null) {
            return new AbstractC468490IYt<Object>(viewGroup) { // from class: X.0IeH
                public final ViewGroup LLILLL;

                {
                    super(new View(viewGroup.getContext()));
                    this.LLILLL = viewGroup;
                }

                @Override // X.AbstractC468490IYt
                public final void I5(int i2, Object obj) {
                    C786410Ut5.W5(this.itemView, new RecyclerView.LayoutParams(this.LLILLL.getMeasuredWidth(), 1));
                }
            };
        }
        return interfaceC468510IYv.LIZ(viewGroup, this.LLJJLIIIJLLLLLLLZ);
    }

    public final void LLLLIILLL(String str, boolean z) {
        this.LLJJJJLIIL = z;
        this.LLJJJ.onNext(new Pair<>(Boolean.valueOf(z), str));
    }
}
