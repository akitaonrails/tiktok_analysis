package X;

import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0PmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654890PmR extends AbstractViewOnAttachStateChangeListenerC654600Ply {
    public SearchLiveStruct LLIZ;
    public Aweme LLIZLLLIL;
    public final SmartImageView LLJ;
    public final SmartImageView LLJI;
    public final TextView LLJIJIL;
    public final TextView LLJILJIL;
    public final View LLJILJILJ;
    public InterfaceC654920PmU LLJILLL;

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply
    public final View getView() {
        return this.itemView;
    }

    public C654890PmR(View view) {
        super(view);
        this.LLJ = (SmartImageView) view.findViewById(R.id.mvv);
        view.findViewById(R.id.mvx);
        this.LLJI = (SmartImageView) view.findViewById(R.id.myx);
        this.LLJIJIL = (TextView) view.findViewById(R.id.n8e);
        this.LLJILJIL = (TextView) view.findViewById(R.id.n2l);
        view.findViewById(R.id.n87);
        this.LLJILJILJ = view.findViewById(R.id.m4c);
        view.findViewById(R.id.exa);
        view.findViewById(R.id.p0o);
        C786410Ut5.I7(new ACListenerS145S0100000_10(this, 32), view);
    }
}
