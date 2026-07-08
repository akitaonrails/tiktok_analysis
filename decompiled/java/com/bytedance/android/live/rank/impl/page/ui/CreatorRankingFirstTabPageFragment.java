package com.bytedance.android.live.rank.impl.page.ui;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C1166310gSL;
import X.C1785470wYz;
import X.C1785510wZ3;
import X.C1786030wZt;
import X.C1786160wa6;
import X.C1786170wa7;
import X.C1845930y8V;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C1864580yca;
import X.C20441214yg;
import X.C20632315oP;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C860820Xpo;
import X.InterfaceC1781190wS5;
import X.InterfaceC1846110y8n;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingFirstTabPageFragment;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CreatorRankingFirstTabPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZjUtLiHELIOSp9PSxiCj02KTEjOx0yJi4lJygVITc/PRsyKhUtLioVOiQrJCo9PA==";
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public View LLILZIL;
    public C1846060y8i LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public C20632315oP LLJI;
    public C1786030wZt LLJIJIL;
    public final C01GW LLJILJIL;
    public C1785510wZ3 LLJILJILJ;
    public C1785470wYz LLJILLL;
    public InterfaceC1781190wS5 LLJJ;
    public final C1786160wa6 LLJJI;
    public final C1864580yca LLJJIII;

    public final int PR() {
        return ((Number) this.LLILLL.getValue()).intValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1846060y8i c1846060y8i = this.LLILZLL;
        if (c1846060y8i != null) {
            c1846060y8i.LJIIL(this.LLJJI);
        }
        C20632315oP c20632315oP = this.LLJI;
        if (c20632315oP != null) {
            c20632315oP.LJI(this.LLJJIII);
        }
        C20632315oP c20632315oP2 = this.LLJI;
        if (c20632315oP2 != null) {
            c20632315oP2.setAdapter(null);
        }
        this.LLILZ = false;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0wa6] */
    public CreatorRankingFirstTabPageFragment() {
        super(R.layout.gh8);
        this.LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 94));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 96));
        this.LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 93));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 95));
        this.LLJJI = new InterfaceC1846110y8n() { // from class: X.0wa6
            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                this.LIZ.MR(c1845940y8W);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSubTabSelectedByClick firstRankType=");
                sbLIZ.append(this.LIZ.PR());
                sbLIZ.append(" position=");
                sbLIZ.append(c1845940y8W.LIZLLL);
                sbLIZ.append(" programmatic=");
                sbLIZ.append(this.LIZ.LLILZ);
                C20441214yg.LIZIZ("CreatorRankingFirstTabPageFragment", C2188811AlT.LIZIZ(sbLIZ));
                CreatorRankingFirstTabPageFragment creatorRankingFirstTabPageFragment = this.LIZ;
                if (creatorRankingFirstTabPageFragment.LLILZ || creatorRankingFirstTabPageFragment.LLJILJILJ == null) {
                    return;
                }
                ((InterfaceC1786180wa8) creatorRankingFirstTabPageFragment.LL.getValue()).tw().LIZJ();
                ((CreatorRankingPageViewModel) this.LIZ.LLILLJJLI.getValue()).onEvent(new C991810but(c1845940y8W.LIZLLL));
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
                this.LIZ.NR(c1845940y8W);
            }
        };
        this.LLJJIII = new C1864580yca(this, 0);
    }

    public final void MR(C1845940y8W c1845940y8W) {
        C1845930y8V c1845930y8V;
        Context context = getContext();
        if (context != null && c1845940y8W != null && (c1845930y8V = c1845940y8W.LJFF) != null) {
            CardView cardView = (CardView) c1845930y8V.findViewById(R.id.xlh);
            if (cardView != null) {
                cardView.setCardBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey7, context));
            }
            TextView textView = (TextView) c1845930y8V.findViewById(android.R.id.text1);
            if (textView != null) {
                textView.setTextColor(C20736316Cj.LIZIZ(R.attr.eyv, context));
            }
            ImageView imageView = (ImageView) c1845930y8V.findViewById(android.R.id.icon);
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
        }
    }

    public final void NR(C1845940y8W c1845940y8W) {
        C1845930y8V c1845930y8V;
        Context context = getContext();
        if (context != null && (c1845930y8V = c1845940y8W.LJFF) != null) {
            CardView cardView = (CardView) c1845930y8V.findViewById(R.id.xlh);
            if (cardView != null) {
                cardView.setCardBackgroundColor(C20736316Cj.LIZIZ(R.attr.ey_, context));
            }
            TextView textView = (TextView) c1845930y8V.findViewById(android.R.id.text1);
            if (textView != null) {
                textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, context));
            }
            ImageView imageView = (ImageView) c1845930y8V.findViewById(android.R.id.icon);
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated enter firstRankType=");
        sbLIZ.append(PR());
        C20441214yg.LIZIZ("CreatorRankingFirstTabPageFragment", C2188811AlT.LIZIZ(sbLIZ));
        super.onViewCreated(view, bundle);
        this.LLILZIL = view.findViewById(R.id.f98);
        this.LLILZLL = (C1846060y8i) view.findViewById(R.id.f9a);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.f9b);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.f93);
        this.LLJ = (TuxTextView) view.findViewById(R.id.f97);
        this.LLJI = (C20632315oP) view.findViewById(R.id.f99);
        this.LLJIJIL = (C1786030wZt) view.findViewById(R.id.f8u);
        C20632315oP c20632315oP = this.LLJI;
        if (c20632315oP != null) {
            c20632315oP.setUserInputEnabled(false);
        }
        C20632315oP c20632315oP2 = this.LLJI;
        if (c20632315oP2 != null) {
            c20632315oP2.setAdapter((AbstractC21673619ry) this.LLJILJIL.getValue());
        }
        C1846060y8i c1846060y8i = this.LLILZLL;
        if (c1846060y8i != null) {
            c1846060y8i.setLayoutVariant(1);
        }
        C1846060y8i c1846060y8i2 = this.LLILZLL;
        if (c1846060y8i2 != null) {
            c1846060y8i2.LJIJJLI(false);
        }
        C1846060y8i c1846060y8i3 = this.LLILZLL;
        if (c1846060y8i3 != null) {
            c1846060y8i3.setTabSelectedIndicator(new ColorDrawable(0));
        }
        C1846060y8i c1846060y8i4 = this.LLILZLL;
        if (c1846060y8i4 != null) {
            C20632315oP c20632315oP3 = this.LLJI;
            if (c20632315oP3 == null) {
                return;
            }
            C20441214yg.LIZIZ("TuxTabBarViewPager2Exts", "setupWithViewPager2 enter");
            c1846060y8i4.LIZ(new C1786170wa7(c20632315oP3));
            c20632315oP3.LIZIZ(new C1166310gSL(c1846060y8i4));
        }
        C1846060y8i c1846060y8i5 = this.LLILZLL;
        if (c1846060y8i5 != null) {
            c1846060y8i5.LIZ(this.LLJJI);
        }
        C20632315oP c20632315oP4 = this.LLJI;
        if (c20632315oP4 != null) {
            c20632315oP4.LIZIZ(this.LLJJIII);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C860820Xpo(this, null), 3);
    }

    public static void OR(C1845940y8W c1845940y8W, String str, boolean z) {
        int iLIZIZ;
        C1845930y8V c1845930y8V = c1845940y8W.LJFF;
        if (c1845930y8V == null) {
            return;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c1845930y8V.getContext()), R.layout.g40, c1845930y8V, false);
        TextView textView = (TextView) viewTd.findViewById(android.R.id.text1);
        if (textView != null) {
            textView.setText(str);
        }
        ImageView imageView = (ImageView) viewTd.findViewById(android.R.id.icon);
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        View viewFindViewById = viewTd.findViewById(R.id.xlh);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z) {
                    iLIZIZ = 0;
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
                marginLayoutParams.setMarginStart(iLIZIZ);
                marginLayoutParams.setMarginEnd(0);
                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1845930y8V, null);
        c1845930y8V.removeAllViews();
        c1845930y8V.addView(viewTd);
    }
}
