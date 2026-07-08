package X;

import Y.ACListenerS114S0200000_10;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Pok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656320Pok extends AbstractViewOnAttachStateChangeListenerC654600Ply {
    public static final /* synthetic */ int LLJJIII = 0;
    public final TuxTextView LLIZ;
    public final TextView LLIZLLLIL;
    public Challenge LLJ;
    public String LLJI;
    public String LLJIJIL;
    public Boolean LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public final int LLJJ;
    public C662710Pz3 LLJJI;

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply
    public final View getView() {
        return this.itemView;
    }

    public C656320Pok(View view) {
        super(view);
        this.LLJILJIL = Boolean.FALSE;
        this.LLJILJILJ = "";
        this.LLJILLL = "";
        this.LLJJ = -1;
        this.LLJJI = null;
        this.LLIZ = (TuxTextView) view.findViewById(R.id.zcw);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.tv_participate_count);
        view.findViewById(R.id.u80);
        C786410Ut5.I7(new ACListenerS114S0200000_10(this, view, 13), view);
    }
}
