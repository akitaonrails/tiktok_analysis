package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.model.SearchEffect;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0QpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682310QpZ extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLIZ = 0;
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final C424560Gko LLILZ;
    public final FrameLayout LLILZIL;
    public SearchEffect LLILZLL;

    public C682310QpZ(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.title);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.usage);
        this.LLILLL = (TextView) view.findViewById(R.id.desc);
        C424560Gko c424560Gko = (C424560Gko) view.findViewById(R.id.cover);
        this.LLILZ = c424560Gko;
        this.LLILZIL = (FrameLayout) view.findViewById(R.id.d9r);
        C0R06.LIZ(c424560Gko, R.dimen.b5);
    }

    public final void I5(SearchEffect searchEffect, String str) {
        C651970Phj.LLILLL.getClass();
        Map mapLIZJ = C651980Phk.LIZJ();
        C682320Qpa c682320Qpa = new C682320Qpa();
        c682320Qpa.LJIIZILJ("search_id", (String) mapLIZJ.get("search_id"));
        c682320Qpa.LJIJI("search_result_id", searchEffect.getDocId());
        c682320Qpa.LJIJJ("search_result");
        c682320Qpa.LJIIZILJ("search_keyword", (String) mapLIZJ.get("search_keyword"));
        c682320Qpa.LJIIZILJ("token_type", "tiktok_effects");
        c682320Qpa.LJJIII(0);
        c682320Qpa.LJJIIZ(Integer.valueOf(getAdapterPosition()));
        c682320Qpa.LJIIZILJ("prop_id", searchEffect.getEffectId());
        c682320Qpa.LJIIZILJ("button_type", str);
        c682320Qpa.LJIILJJIL();
    }
}
