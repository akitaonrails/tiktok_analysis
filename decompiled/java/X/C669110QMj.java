package X;

import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.middle.AbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669110QMj extends RecyclerView.ViewHolder implements InterfaceC669260QMy {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final String LL;
    public final InterfaceC669220QMu LLILLJJLI;
    public final C0QN6 LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public SearchSugEntity LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public String LLJI;

    @Override // X.InterfaceC669260QMy
    public final void onViewDetachedFromWindow() {
    }

    @Override // X.InterfaceC669260QMy
    public final void onVisibilityChanged(boolean z) {
    }

    @Override // X.InterfaceC669260QMy
    public final void onViewAttachedToWindow() {
        LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(this.itemView);
        if (lifecycleOwnerLIZ != null) {
            C948503nH.LJ(lifecycleOwnerLIZ, C0PEM.LIZJ, new C669130QMl(this, null));
        }
        C0QJY.LIZLLL(this.LL, this.LLIZLLLIL, this.LLIZ, "enrich_sug", null, 0, C946803n0.LIZ(this.itemView), C1388190mED.LIZIZ(this.itemView.getContext()), null, null, true, null, 2864);
    }

    public C669110QMj(View view, String str, AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew, C669210QMt c669210QMt) {
        super(view);
        this.LL = str;
        this.LLILLJJLI = abstractSearchIntermediateFragmentNew;
        this.LLILLL = c669210QMt;
        this.LLJ = "";
        this.LLJI = "";
        this.LLILZ = (TuxIconView) view.findViewById(R.id.x7o);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.title);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.desc);
        Context context = this.itemView.getContext();
        if (context != null) {
            if (C467860IWi.LIZ(context)) {
                TuxIconView tuxIconView = this.LLILZ;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_tako_new);
                }
                TuxIconView tuxIconView2 = this.LLILZ;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTintColorRes(R.attr.a0p);
                }
                TuxIconView tuxIconView3 = this.LLILZ;
                if (tuxIconView3 != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bitmap_tako_background_dark;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    tuxIconView3.setBackground(c419910GdJ.LIZ(context));
                }
            } else {
                TuxIconView tuxIconView4 = this.LLILZ;
                if (tuxIconView4 != null) {
                    tuxIconView4.setIconRes(R.raw.icon_bitmap_tako_new_light);
                }
                TuxIconView tuxIconView5 = this.LLILZ;
                if (tuxIconView5 != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                    tuxIconView5.setBackground(c384050F3z.LIZ(context));
                }
            }
        }
        this.itemView.setClickable(true);
        this.itemView.setFocusable(true);
        C786410Ut5.I7(new ACListenerS145S0100000_10(this, 62), this.itemView);
        C427690Gpr.LJ(this.itemView, 0.0f);
        this.itemView.setOnLongClickListener(new C0R46(this, 5));
    }
}
