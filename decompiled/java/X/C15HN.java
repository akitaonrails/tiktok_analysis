package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15HN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15HN extends C15H8 {
    public final Context LLILLJJLI;
    public final List<C15IP> LLILLL;
    public final LinearLayout LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final LinearLayout LLIZ;
    public final View LLIZLLLIL;
    public final int LLJ;
    public final C15HO LLJI;

    public C15HN(int i, View view) {
        super(view);
        this.LLILLJJLI = view.getContext();
        this.LLILZ = (LinearLayout) view.findViewById(R.id.nbj);
        this.LLILZIL = (TextView) view.findViewById(R.id.tvw_content);
        this.LLILZLL = (TextView) view.findViewById(R.id.zp1);
        this.LLIZ = (LinearLayout) view.findViewById(R.id.nbk);
        this.LLIZLLLIL = view.findViewById(R.id.vw_line_divider);
        this.LLILLL = new ArrayList();
        this.LLJ = i;
        float fLIZJ = C12ES.LIZJ(16.0f, this.LLILLJJLI);
        this.LLILZ.setPadding(0, 0, 0, 0);
        this.LLILZ.setBackgroundColor(0);
        ((ViewGroup.MarginLayoutParams) this.LLILZ.getLayoutParams()).rightMargin = 0;
        this.LLILZ.requestLayout();
        ((ViewGroup.MarginLayoutParams) this.LLIZLLLIL.getLayoutParams()).rightMargin = (int) fLIZJ;
        C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
        this.LLJI = new C15HO("change_music_page", "attached_song", "", C15IK.LIZ);
    }
}
