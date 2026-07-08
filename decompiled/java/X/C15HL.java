package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15HL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15HL extends C15H8 {
    public final Context LLILLJJLI;
    public final List<C15IP> LLILLL;
    public final LinearLayout LLILZ;
    public final LinearLayout LLILZIL;
    public final TextView LLILZLL;
    public final View LLIZ;
    public final int LLIZLLLIL;
    public final C15HO LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public C15HL(int i, View view) {
        super(view);
        this.LLILLJJLI = view.getContext();
        this.LLILZ = (LinearLayout) view.findViewById(R.id.nbj);
        this.LLILZIL = (LinearLayout) view.findViewById(R.id.nbk);
        this.LLILZLL = (TextView) view.findViewById(R.id.tvw_content);
        this.LLIZ = view.findViewById(R.id.vw_line_divider);
        this.LLILLL = new ArrayList();
        this.LLIZLLLIL = i;
        float fLIZJ = C12ES.LIZJ(16.0f, this.LLILLJJLI);
        this.LLILZ.setPadding(0, 0, 0, 0);
        this.LLILZ.setBackgroundColor(0);
        ((ViewGroup.MarginLayoutParams) this.LLILZ.getLayoutParams()).rightMargin = 0;
        this.LLILZ.requestLayout();
        int i2 = (int) fLIZJ;
        ((ViewGroup.MarginLayoutParams) this.LLILZLL.getLayoutParams()).rightMargin += i2;
        ((ViewGroup.MarginLayoutParams) this.LLIZ.getLayoutParams()).rightMargin = i2;
        C786410Ut5.LJLLLLLL(0, this.LLIZ);
        C15HO c15ho = new C15HO("change_music_page", "attached_song", "", C15IK.LIZ);
        this.LLJ = c15ho;
        c15ho.LIZIZ = "prop";
    }
}
