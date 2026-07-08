package X;

import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0QJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668320QJi extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILZLL = 0;
    public final ArrayList<SearchHistory> LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public final C0QF6 LLILZIL;

    public final void I5() {
        SearchHistory next;
        Iterator<SearchHistory> it2 = this.LL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.musicId != null) {
                    break;
                }
            }
        }
        C668020QIe.LIZIZ(this.LLILLL, this.LLILZ, "clear_all", null, null, null, null, null, null, next != null, null, null, false, false, this.LLILLJJLI, null, 97784);
        this.LL.clear();
        C0QEE c0qee = C0QEE.LIZ;
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        C13BV c13bv = C13BV.INSTANCE;
        C19EG c19egLIZ = C657990PrR.LIZ(this.itemView);
        c0qee.getClass();
        C0QEE.LIZIZ(fragmentLIZ, c13bv, true, c19egLIZ, "del_his_native");
        this.LLILZIL.LJIIIIZZ();
        C0QKL.LIZ.getClass();
        C0QKL.LIZ();
        C1440005kM.LIZ(new C667560QGk(null));
    }

    public C668320QJi(final View view) {
        super(view);
        this.LL = new ArrayList<>();
        this.LLILLL = "";
        this.LLILZ = "";
        this.LLILZIL = C0QPJ.LJIJI(null);
        final Context context = view.getContext();
        AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0QK5
            @Override // X.AbstractViewOnTouchListenerC446430Hez
            public final void LIZ(boolean z) {
                if (z) {
                    C786410Ut5.B5((TuxTextView) view.findViewById(R.id.tv_title_clear), 0.2f);
                } else {
                    C786410Ut5.B5((TuxTextView) view.findViewById(R.id.tv_title_clear), 1.0f);
                }
            }
        };
        abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS444S0100000_10(this, 12);
        view.findViewById(R.id.tv_title_clear).setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
    }
}
