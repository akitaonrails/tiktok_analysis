package X;

import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15HI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15HI extends C15H8 {
    public final TextView LLILLJJLI;
    public final C117N LLILLL;
    public final View LLILZ;
    public C15HQ LLILZIL;
    public InterfaceC469360Ias LLILZLL;
    public InterfaceC20494515Hj<C15HP> LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public C15HO LLJI;
    public final C15HH LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final boolean LLJJI;

    public C15HI(int i, View view, boolean z) {
        super(view);
        this.LLIZLLLIL = -1;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title_right);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_title_left);
        C117N c117n = (C117N) view.findViewById(R.id.vp_music_container);
        this.LLILLL = c117n;
        this.LLILZ = view.findViewById(R.id.fyx);
        C844470XAv.LIZ.getClass();
        this.LLJILJIL = (int) C12ES.LIZJ(84.0f, C844470XAv.LIZ());
        C15HH c15hh = new C15HH(this);
        this.LLJIJIL = c15hh;
        c117n.setAdapter(c15hh);
        this.LLJILJILJ = i;
        this.LLJJI = z;
        C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31(this, 125));
        tuxTextView.setTuxFont(62);
    }
}
