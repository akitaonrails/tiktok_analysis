package X;

import Y.ACListenerS155S0100000_21;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.ExploreDetailComponentOptExperiment;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388860mFI extends AbstractC2172971A2l<C1388870mFJ, C1388890mFL> {
    public final Set<Integer> LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public final Set<String> LLILZIL;
    public AnchorEventCenter LLILZLL;

    public C1388860mFI() {
        super(C1388900mFM.LIZ);
        this.LLILLJJLI = new LinkedHashSet();
        this.LLILLL = -1;
        this.LLILZIL = C13LQ.LJLIIL(new String[]{String.valueOf(EnumC1430380nKG.ANCHOR_SHOP_WINDOW.getTYPE()), String.valueOf(EnumC1430380nKG.ANCHOR_SHOP_MIX.getTYPE())});
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLILLJJLI.clear();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1357620lQu c1357620lQu;
        super.onViewAttachedToWindow(viewHolder);
        InterfaceC1393560mMs interfaceC1393560mMs = LLLFZ(viewHolder.getLayoutPosition()).LIZJ;
        if ((interfaceC1393560mMs instanceof ShopWindowAnchorMaker) && viewHolder.getLayoutPosition() > this.LLILLL) {
            ShopWindowAnchorMaker shopWindowAnchorMaker = (ShopWindowAnchorMaker) interfaceC1393560mMs;
            int layoutPosition = viewHolder.getLayoutPosition();
            InterfaceC1394860mOy interfaceC1394860mOy = shopWindowAnchorMaker.LLJ;
            InterfaceC1392640mLO interfaceC1392640mLO = shopWindowAnchorMaker.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            interfaceC1394860mOy.LJIIZILJ(layoutPosition, interfaceC1392640mLO);
        }
        if ((interfaceC1393560mMs instanceof C1392780mLc) && viewHolder.getLayoutPosition() > this.LLILLL) {
            ((C1392780mLc) interfaceC1393560mMs).LLJ.LJIILIIL(viewHolder.getLayoutPosition());
        }
        if (viewHolder.getLayoutPosition() == 0) {
            List<T> list = this.LL.LJFF;
            ArrayList<C1388870mFJ> arrayList = new ArrayList();
            for (Object obj : list) {
                C1388870mFJ c1388870mFJ = (C1388870mFJ) obj;
                if (!(c1388870mFJ.LIZJ instanceof C721840STe) && !this.LLILLJJLI.contains(Integer.valueOf(c1388870mFJ.hashCode()))) {
                    arrayList.add(obj);
                }
            }
            for (C1388870mFJ c1388870mFJ2 : arrayList) {
                this.LLILLJJLI.add(Integer.valueOf(c1388870mFJ2.hashCode()));
                if (C04UD.LIZ() && (c1357620lQu = (C1357620lQu) C1361900lXo.LIZ("event_show")) != null) {
                    c1357620lQu.LIZJ = true;
                    AnchorEventCenter anchorEventCenter = this.LLILZLL;
                    if (anchorEventCenter != null) {
                        anchorEventCenter.kF(c1357620lQu, c1388870mFJ2.LIZJ);
                    }
                }
            }
        }
        this.LLILLL = Math.max(this.LLILLL, viewHolder.getLayoutPosition());
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        Object c098200Yq;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        C1388840mFG c1388840mFG;
        float f;
        C1388890mFL c1388890mFL = (C1388890mFL) viewHolder;
        ExploreDetailComponentOptExperiment exploreDetailComponentOptExperiment = ExploreDetailComponentOptExperiment.INSTANCE;
        boolean z5 = true;
        if (exploreDetailComponentOptExperiment.anchorStyleOptEnabled(this.LLILZ) && this.LL.LJFF.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        C1388870mFJ c1388870mFJLLLFZ = LLLFZ(i);
        TuxTextView tuxTextView = (TuxTextView) c1388890mFL.LL.findViewById(R.id.rk7);
        tuxTextView.setText(c1388870mFJLLLFZ.LIZIZ);
        boolean zAnchorStyleOptEnabled = exploreDetailComponentOptExperiment.anchorStyleOptEnabled(c1388870mFJLLLFZ.LIZJ.LJII().Cf());
        if (zAnchorStyleOptEnabled) {
            if (z) {
                f = 270.0f;
            } else {
                f = 225.0f;
            }
            tuxTextView.setMaxWidth((int) C12ES.LIZJ(f, c1388890mFL.LL.getContext()));
        }
        if (!zAnchorStyleOptEnabled) {
            c1388870mFJLLLFZ.LIZJ.LJJJI((SmartImageView) c1388890mFL.LL.findViewById(R.id.rk4));
        } else {
            SmartImageView smartImageView = (SmartImageView) c1388890mFL.LL.findViewById(R.id.rk4);
            TuxIconView tuxIconView = (TuxIconView) c1388890mFL.LL.findViewById(R.id.rk5);
            TuxIconView tuxIconView2 = (TuxIconView) c1388890mFL.LL.findViewById(R.id.rk6);
            try {
                c098200Yq = Integer.valueOf(c1388870mFJLLLFZ.LIZJ.type());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Integer numValueOf = Integer.valueOf(EnumC1430380nKG.NO_TYPE.getTYPE());
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = numValueOf;
            }
            int iIntValue = ((Number) c098200Yq).intValue();
            boolean zLJFF = Intrinsics.LJFF(c1388870mFJLLLFZ.LIZ, "SEARCH");
            if (iIntValue == EnumC1430380nKG.POI.getTYPE()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (iIntValue == EnumC1430380nKG.TEXT_TO_IMAGE_ANCHOR.getTYPE()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (iIntValue != EnumC1430380nKG.PROP.getTYPE() && iIntValue != EnumC1430380nKG.PROP_COMMERCIAL_EFFECT.getTYPE()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!zLJFF && !z2 && !z3 && !z4) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                C786410Ut5.LLFF(0, smartImageView);
                c1388870mFJLLLFZ.LIZJ.LJJJI(smartImageView);
            } else {
                C786410Ut5.LLFF(8, smartImageView);
                if (zLJFF) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    InterfaceC1393560mMs interfaceC1393560mMs = c1388870mFJLLLFZ.LIZJ;
                    if (!(interfaceC1393560mMs instanceof C1388840mFG) || (c1388840mFG = (C1388840mFG) interfaceC1393560mMs) == null || !c1388840mFG.LLJI) {
                        z5 = false;
                    }
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    if (z5) {
                        c419910GdJ.LIZ = R.raw.icon_arrow_broken_line_up;
                    } else {
                        c419910GdJ.LIZ = R.raw.icon_magnifying_glass_fill;
                    }
                    tuxIconView2.setTuxIcon(c419910GdJ);
                    tuxIconView2.setTintColorRes(R.attr.a1h);
                    try {
                        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                        if (layoutParams instanceof LinearLayout.LayoutParams) {
                            ((LinearLayout.LayoutParams) layoutParams).setMarginStart(0);
                            C786410Ut5.R6(tuxTextView, layoutParams);
                        } else if (layoutParams instanceof C19ME) {
                            ((C19ME) layoutParams).setMarginStart(0);
                            ((C19ME) layoutParams).startToStart = 0;
                            ((C19ME) layoutParams).startToEnd = -1;
                            C786410Ut5.R6(tuxTextView, layoutParams);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    String str = c1388870mFJLLLFZ.LIZIZ;
                    if (str == null) {
                        str = "";
                    }
                    int iLJJIZ = a0.LJJIZ(str, ' ', 0, false, 6);
                    if (iLJJIZ > 0) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, c1388890mFL.LL.getContext());
                        if (numLIZJ == null) {
                            return;
                        }
                        int iIntValue2 = numLIZJ.intValue();
                        SpannableString spannableString = new SpannableString(str);
                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue2), 0, iLJJIZ, 33);
                        tuxTextView.setText(spannableString);
                    }
                } else {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                    if (z2) {
                        i2 = R.raw.icon_map_thumbtack_fill;
                    } else if (z3) {
                        i2 = R.raw.icon_pen_star_fill;
                    } else {
                        i2 = R.raw.icon_effect_fill;
                    }
                    tuxIconView.setIconRes(i2);
                }
            }
        }
        C786410Ut5.I7(new ACListenerS155S0100000_21(c1388870mFJLLLFZ, 116), c1388890mFL.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (ExploreDetailComponentOptExperiment.INSTANCE.anchorStyleOptEnabled(this.LLILZ)) {
            i2 = R.layout.e_n;
        } else {
            i2 = R.layout.e_m;
        }
        C1388890mFL c1388890mFL = new C1388890mFL(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i2, viewGroup, false));
        try {
            View view = c1388890mFL.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1388890mFL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1388890mFL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1388890mFL.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1388890mFL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1388890mFL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1388890mFL.class.getName();
        return c1388890mFL;
    }
}
