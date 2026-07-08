package X;

import Y.ACListenerS133S0200000_31;
import Y.ACListenerS165S0100000_31;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.15Hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20494915Hn extends RecyclerView.ViewHolder {
    public boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final TuxIconView LLILZ;
    public final SmartImageView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxIconView LLJI;
    public MusicModel LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public C15IB LLJILLL;
    public InterfaceC20494515Hj<C15HP> LLJJ;
    public final C20495215Hq LLJJI;

    public final void I5() {
        String string;
        CharSequence text;
        C15IS.LIZIZ(this.LLILZ, !this.LL ? 1 : 0);
        String str = this.LL ? this.LLILLJJLI : this.LLILLL;
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null && str != null) {
            HashMap map = new HashMap();
            TuxTextView tuxTextView = this.LLILZLL;
            if (tuxTextView == null || (text = tuxTextView.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            map.put("soundTitleOrSound", string);
            tuxIconView.setContentDescription(C1356620lPI.LIZ(str, map));
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 != null) {
            if (this.LL) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            } else {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.15Hq] */
    public C20494915Hn(View view) {
        super(view);
        this.LLILZIL = (SmartImageView) view.findViewById(R.id.ld7);
        view.findViewById(R.id.lvt);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.zym);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.tv_singer);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.zy9);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.lq6);
        this.LLILZ = tuxIconView;
        this.LLJ = (TuxTextView) view.findViewById(R.id.yyu);
        this.LLJI = (TuxIconView) view.findViewById(R.id.y4a);
        View viewFindViewById = view.findViewById(R.id.nfx);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS133S0200000_31(this, viewFindViewById, 22), viewFindViewById);
        }
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS165S0100000_31(this, 124));
        }
        this.LLILLL = C20642515q3.LJI(2131823192);
        this.LLILLJJLI = C20642515q3.LJI(2131823197);
        this.LLJJI = new C15IT() { // from class: X.15Hq
            @Override // X.C15IT
            public final void LIZ() {
                C20494915Hn c20494915Hn = this.LIZ;
                c20494915Hn.getClass();
                C1440005kM.LIZ(new C629770On1(c20494915Hn.LLJIJIL, c20494915Hn.LL ? 1 : 0));
            }

            @Override // X.C15IT
            public final void onStateChange(int i) {
                if (i == 1) {
                    this.LIZ.I5();
                }
            }
        };
    }
}
