package X;

import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0QJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668440QJu extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C0QF6 LL;
    public final ArrayList<SearchHistory> LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;

    public C668440QJu(final View view) {
        super(view);
        this.LL = C0QPJ.LJIJI(null);
        this.LLILLJJLI = new ArrayList<>();
        this.LLILZ = "";
        this.LLILZIL = "";
        final Context context = view.getContext();
        AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0QK4
            @Override // X.AbstractViewOnTouchListenerC446430Hez
            public final void LIZ(boolean z) {
                if (z) {
                    C786410Ut5.B5((TuxTextView) view.findViewById(R.id.zdt), 0.2f);
                } else {
                    C786410Ut5.B5((TuxTextView) view.findViewById(R.id.zdt), 1.0f);
                }
            }
        };
        abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS444S0100000_10(this, 11);
        view.findViewById(R.id.zdt).setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
    }
}
