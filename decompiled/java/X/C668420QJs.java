package X;

import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0QJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668420QJs extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final ArrayList<SearchHistory> LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public final TuxTextView LLILZIL;
    public final C21415018rM LLILZLL;
    public final C01GW LLIZ;

    public C668420QJs(final View view) {
        View viewLJLLLL;
        View viewLJLLLL2;
        super(view);
        this.LL = new ArrayList<>();
        this.LLILLJJLI = "";
        this.LLILLL = "";
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1057));
        this.LLIZ = c01gwLIZIZ;
        final Context context = view.getContext();
        AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0QJy
            @Override // X.AbstractViewOnTouchListenerC446430Hez
            public final void LIZ(boolean z) {
                View view2;
                if (C0BRA.LIZJ()) {
                    view2 = this.LLJIJIL.LLILZLL;
                } else {
                    view2 = this.LLJIJIL.LLILZIL;
                }
                if (z) {
                    if (view2 != null) {
                        C786410Ut5.T4(view2, 0.2f);
                    }
                    C786410Ut5.x5((TuxIconView) view.findViewById(R.id.k58), 0.2f);
                } else {
                    if (view2 != null) {
                        C786410Ut5.T4(view2, 1.0f);
                    }
                    C786410Ut5.x5((TuxIconView) view.findViewById(R.id.k58), 1.0f);
                }
            }
        };
        abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS444S0100000_10(this, 13);
        TuxTextView tuxTextView = null;
        c21415018rM = null;
        C21415018rM c21415018rM = null;
        tuxTextView = null;
        if (C0BRA.LIZJ()) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.vs_viewmore_tvl);
            if (viewStub != null && (viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub)) != null) {
                c21415018rM = (C21415018rM) viewLJLLLL2.findViewById(R.id.tvl_view_more);
            }
            this.LLILZLL = c21415018rM;
        } else {
            ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.vs_viewmore_tv);
            if (viewStub2 != null && (viewLJLLLL = C786410Ut5.LJLLLL(viewStub2)) != null) {
                tuxTextView = (TuxTextView) viewLJLLLL.findViewById(R.id.tv_view_more);
            }
            this.LLILZIL = tuxTextView;
        }
        View view2 = (View) c01gwLIZIZ.getValue();
        if (view2 != null) {
            view2.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
        }
    }
}
