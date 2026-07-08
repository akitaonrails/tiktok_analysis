package X;

import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchSugMobHelper;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* JADX INFO: renamed from: X.0QTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671040QTu extends RecyclerView.ViewHolder implements C0QUA {
    public static final int LLJJJJLIIL = C418440Gaw.LIZ(48);
    public long LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final C425430GmD LLILZLL;
    public final TuxIconView LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final SmartImageView LLJILJIL;
    public final C429940GtU LLJILJILJ;
    public final ViewGroup LLJILLL;
    public final InterfaceC425440GmE LLJJ;
    public final C0QU6 LLJJI;
    public SearchSugEntity LLJJIII;
    public final String LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public String LLJJJ;
    public int LLJJJIL;
    public EcSearchSugMobHelper LLJJJJ;
    public String LLJJJJJIL;

    @Override // X.C0QUA
    public final void onViewDetachedFromWindow() {
    }

    @Override // X.C0QUA
    public final void onViewAttachedToWindow() {
        int i;
        String str;
        C0QU6 c0qu6 = this.LLJJI;
        if (c0qu6 == null || c0qu6.LIZJ() == null || this.LLJJI.LIZJ().pD2() == null) {
            i = 0;
            str = null;
        } else {
            i = this.LLJJI.LIZJ().pD2().LIZ;
            str = this.LLJJI.LIZJ().pD2().LIZIZ;
        }
        C670100QQe.LJ(C946803n0.LIZ(this.itemView), this.LLJJJ, this.LLJJJIL, this.LLJJIII, this.LLJJJJJIL, this.LLJJIJI, i, C640270P9l.LIZJ(C946803n0.LIZ(this.itemView), C1388190mED.LIZIZ(this.itemView.getContext())), str);
    }

    public C671040QTu(View view, C0QT7 c0qt7, C0QTK c0qtk, String str) {
        super(view);
        this.LLJJJJJIL = "normal_sug";
        this.LLJJIJI = str;
        this.LLJJ = c0qtk;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_sug);
        this.LLILLL = (TextView) view.findViewById(R.id.tv_sug_new);
        this.LLILZ = (TextView) view.findViewById(R.id.tv_sug_hint);
        this.LLILZIL = (TextView) view.findViewById(R.id.tv_sug_hint_point);
        C425430GmD c425430GmD = (C425430GmD) view.findViewById(R.id.lwd);
        this.LLILZLL = c425430GmD;
        this.LLIZ = (TuxIconView) view.findViewById(R.id.lu8);
        this.LLIZLLLIL = view.findViewById(R.id.ccv);
        this.LLJ = view.findViewById(R.id.lka);
        this.LLJI = view.findViewById(R.id.eu1);
        this.LLJIJIL = view.findViewById(R.id.view_search_icon_bg);
        this.LLJILJIL = (SmartImageView) view.findViewById(R.id.kex);
        this.LLJILJILJ = (C429940GtU) view.findViewById(R.id.zz3);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.tz1);
        this.LLJJI = c0qt7;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_up_left_ltr;
        c425430GmD.setImageDrawable(c419910GdJ.LIZ(view.getContext()));
        C786410Ut5.Q9(c425430GmD, new ACListenerS145S0100000_10(this, 64));
        c425430GmD.setKeyboardDismissHandler(c0qtk);
        int i = LLJJJJLIIL;
        if (this.LLJJIJIL != i) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.height = i;
            this.LLJJIJIL = i;
            C786410Ut5.W5(this.itemView, layoutParams);
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        if (c19egLIZIZ != null) {
            this.LLJJJJ = (EcSearchSugMobHelper) C679340Qkm.LIZ(this.itemView, c19egLIZIZ).get(EcSearchSugMobHelper.class);
        }
    }

    public static C671040QTu I5(ViewGroup viewGroup, C0QT7 c0qt7, C0QTK c0qtk, String str) {
        View viewTd;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(viewGroup.getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(viewGroup, c19egLIZIZ);
        if (lifecycleOwnerLJIJI != null && C0QNG.LIZ(lifecycleOwnerLJIJI) != null) {
            InterfaceC530790Krl interfaceC530790KrlLIZ = C0QNG.LIZ(lifecycleOwnerLJIJI);
            Objects.requireNonNull(interfaceC530790KrlLIZ);
            viewTd = interfaceC530790KrlLIZ.getInflater().LIZIZ(R.layout.br_);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.br_, viewGroup, false);
        }
        return new C671040QTu(viewTd, c0qt7, c0qtk, str);
    }
}
