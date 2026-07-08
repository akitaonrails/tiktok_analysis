package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529750Kq5 extends RecyclerView.ViewHolder {
    public C433800Gzi LL;
    public int LLILLJJLI;
    public TextView LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public TextView LLIZ;
    public View LLIZLLLIL;
    public ViewStub LLJ;
    public FrameLayout LLJI;
    public View LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public TikTokMediaModel LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public ViewStub LLJJIII;
    public ViewStub LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public TextView LLJJJIL;
    public ViewStub LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public ViewStub LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public AbstractC1320710kTN LLJLIL;
    public InterfaceC420801kM LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;

    public C529750Kq5(View view) {
        super(view);
    }

    public final void I5(Boolean bool) {
        float f;
        View viewFindViewById = this.itemView.findViewById(R.id.c2v);
        this.LLJJJJLIIL = viewFindViewById;
        if (this.LLILLJJLI == 5 && viewFindViewById != null) {
            if (!bool.booleanValue()) {
                C786410Ut5.LJLLLLLL(0, this.LLJJJJLIIL);
                return;
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLJJJJLIIL);
                return;
            }
        }
        View view = this.itemView;
        if (bool.booleanValue()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.T4(view, f);
    }

    public final void L5(float f) {
        if (this.LLILLJJLI == 5 && this.LLJJJJLIIL != null) {
            if (Math.abs(f - 1.0f) > 0.01f) {
                C786410Ut5.LJLLLLLL(0, this.LLJJJJLIIL);
                return;
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLJJJJLIIL);
                return;
            }
        }
        if (this.LL != null) {
            C433800Gzi c433800Gzi = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c433800Gzi);
            c433800Gzi.setAlpha(f);
        }
    }

    public final void N5(Context context) {
        if (this.LLJJIII.getParent() != null) {
            C523350Kfl.LIZ(this.LLJJIII);
            this.LLJIJIL = this.itemView.findViewById(R.id.uy1);
            this.LLIZ = (TextView) this.itemView.findViewById(R.id.gco);
            float fLIZ = C366700EZg.LIZ(1.0d);
            this.LLIZ.setShadowLayer(fLIZ, 0.0f, fLIZ, C960203pA.LIZ(R.attr.oz, context));
            this.LLIZLLLIL = this.itemView.findViewById(R.id.gcf);
        }
    }
}
