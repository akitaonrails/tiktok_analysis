package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS659S0100000_10;

/* JADX INFO: renamed from: X.0Prp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658230Prp extends RecyclerView.ViewHolder {
    public static final float LLJILLL = C418040GaI.LIZ(3);
    public final InterfaceC656470Poz LL;
    public final InterfaceC1631620sYq<View, Integer, Aweme, Unit> LLILLJJLI;
    public final View LLILLL;
    public final SmartImageView LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final View LLIZ;
    public final boolean LLIZLLLIL;
    public Aweme LLJ;
    public final TuxIconView LLJI;
    public int LLJIJIL;
    public SearchRefreshPredictMobCanShowVM LLJILJIL;
    public boolean LLJILJILJ;

    public C658230Prp(View view, InterfaceC656470Poz interfaceC656470Poz, AwS659S0100000_10 awS659S0100000_10) {
        super(view);
        this.LL = interfaceC656470Poz;
        this.LLILLJJLI = awS659S0100000_10;
        this.LLILLL = view;
        this.LLILZ = (SmartImageView) view.findViewById(R.id.cover);
        this.LLILZIL = (TextView) view.findViewById(R.id.mnh);
        this.LLILZLL = (TextView) view.findViewById(R.id.p75);
        this.LLIZ = view.findViewById(R.id.video_mask);
        this.LLIZLLLIL = C444960Hcc.LIZJ(view.getContext());
        this.LLJI = (TuxIconView) view.findViewById(R.id.ey7);
        view.addOnAttachStateChangeListener(new C0R45(this, 41));
        C1524805y2.LIZIZ(0L, new AwS411S0200000_10(this, view, 100));
    }
}
