package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.114w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194428114w extends AbstractC683590Qrd<C114D> {
    public final C0FMR LL;
    public final C114C LLILLJJLI;
    public int LLILLL;

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
    }

    public C194428114w(C0FMR c0fmr, C114C c114c) {
        super(false);
        this.LL = c0fmr;
        this.LLILLJJLI = c114c;
        this.LLILLL = -1;
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<T> list;
        C114D c114d;
        List<String> urlList;
        String str;
        if ((viewHolder instanceof C194429114x) && (list = this.mmItems) != 0 && (c114d = (C114D) C13LP.LJJJLZIJ(i, list)) != null) {
            C194429114x c194429114x = (C194429114x) viewHolder;
            c194429114x.LLILZIL = c114d;
            UrlModel iconUrl = c114d.LIZ.getIconUrl();
            if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                C1324750kZt.LJIIIZ(c194429114x.LLILZLL, str, -1, -1);
            }
            if (Intrinsics.LJFF(c114d.LIZ.getEffectId(), c194429114x.LLILZ.LIZ)) {
                c114d.LIZIZ = 0;
                View view = c194429114x.LLIZ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
            } else {
                View view2 = c194429114x.LLIZ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
            }
            C114D c114d2 = c194429114x.LLILZIL;
            if (c114d2 != null && c114d2.LIZJ == 2) {
                TuxSpinner tuxSpinner = c194429114x.LLIZLLLIL;
                if (tuxSpinner != null) {
                    C786410Ut5.LLZILL(tuxSpinner, 0);
                }
            } else {
                TuxSpinner tuxSpinner2 = c194429114x.LLIZLLLIL;
                if (tuxSpinner2 != null) {
                    C786410Ut5.LLZILL(tuxSpinner2, 8);
                }
            }
            C114C c114c = c194429114x.LLILLL;
            new Pair(Integer.valueOf(c194429114x.LL), Integer.valueOf(c194429114x.getBindingAdapterPosition()));
            c114c.onBind();
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup.LayoutParams layoutParams;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        int i2 = C194429114x.LLJ;
        C194429114x c194429114x = new C194429114x(this.LLILLL, C786410Ut5.Td(layoutInflaterNe, R.layout.ud, viewGroup, false), this.LLILLJJLI, this.LL);
        ViewGroup.LayoutParams layoutParams2 = c194429114x.LLILLJJLI.getLayoutParams();
        Context context = c194429114x.LLILLJJLI.getContext();
        if (TextTemplateTools.LIZIZ == 0) {
            TextTemplateTools.LJII(context);
        }
        layoutParams2.width = TextTemplateTools.LIZIZ;
        Context context2 = c194429114x.LLILLJJLI.getContext();
        if (TextTemplateTools.LIZJ == 0) {
            TextTemplateTools.LJII(context2);
        }
        layoutParams2.height = TextTemplateTools.LIZJ;
        C786410Ut5.W5(c194429114x.LLILLJJLI, layoutParams2);
        C1322110kVd c1322110kVd = (C1322110kVd) c194429114x.LLILLJJLI.findViewById(R.id.view_image);
        c194429114x.LLILZLL = c1322110kVd;
        C1331070kk5 hierarchy = null;
        if (c1322110kVd != null) {
            layoutParams = c1322110kVd.getLayoutParams();
            if (layoutParams != null) {
                Context context3 = c194429114x.LLILLJJLI.getContext();
                if (TextTemplateTools.LIZJ == 0) {
                    TextTemplateTools.LJII(context3);
                }
                layoutParams.width = TextTemplateTools.LIZJ;
                Context context4 = c194429114x.LLILLJJLI.getContext();
                if (TextTemplateTools.LIZJ == 0) {
                    TextTemplateTools.LJII(context4);
                }
                layoutParams.height = TextTemplateTools.LIZJ;
            }
        } else {
            layoutParams = null;
        }
        C1322110kVd c1322110kVd2 = c194429114x.LLILZLL;
        if (c1322110kVd2 != null) {
            C786410Ut5.c7(c1322110kVd2, layoutParams);
        }
        Context context5 = c194429114x.LLILLJJLI.getContext();
        if (TextTemplateTools.LIZIZ == 0) {
            TextTemplateTools.LJII(context5);
        }
        float fLIZIZ = TextTemplateTools.LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        Context context6 = c194429114x.LLILLJJLI.getContext();
        if (TextTemplateTools.LIZJ == 0) {
            TextTemplateTools.LJII(context6);
        }
        float f = fLIZIZ / TextTemplateTools.LIZJ;
        C1322110kVd c1322110kVd3 = c194429114x.LLILZLL;
        if (c1322110kVd3 != null) {
            C786410Ut5.jc(c1322110kVd3, f);
        }
        C1322110kVd c1322110kVd4 = c194429114x.LLILZLL;
        if (c1322110kVd4 != null) {
            C786410Ut5.Ec(c1322110kVd4, f);
        }
        C1322110kVd c1322110kVd5 = c194429114x.LLILZLL;
        if (c1322110kVd5 != null && (hierarchy = c1322110kVd5.getHierarchy()) != null) {
            hierarchy.LJIIZILJ(InterfaceC1320380kSq.LIZ);
        }
        C1322110kVd c1322110kVd6 = c194429114x.LLILZLL;
        if (c1322110kVd6 != null) {
            c1322110kVd6.setHierarchy(hierarchy);
        }
        c194429114x.LLIZ = c194429114x.LLILLJJLI.findViewById(R.id.ulw);
        c194429114x.LLIZLLLIL = (TuxSpinner) c194429114x.LLILLJJLI.findViewById(R.id.lno);
        C786410Ut5.I7(new ACListenerS163S0100000_29(c194429114x, 289), c194429114x.LLILLJJLI);
        return c194429114x;
    }
}
