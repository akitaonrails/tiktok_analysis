package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195720hDm extends FrameLayout {
    public final C1195710hDl LL;
    public final C423320Gio LLILLJJLI;
    public final C1195600hDa LLILLL;
    public final RecyclerView LLILZ;

    public final void setOnScrollIdleListener(InterfaceC1195880hE2 interfaceC1195880hE2) {
    }

    public final Set<Integer> getSelectedPositions() {
        return C13LP.LLIIJI(this.LL.LLILLL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILLL.LIZ();
    }

    public final RecyclerView getRecyclerView() {
        return this.LLILZ;
    }

    public final void setAppearance(EnumC1195670hDh enumC1195670hDh) {
        C1195710hDl c1195710hDl = this.LL;
        if (c1195710hDl.LLILZ instanceof C1195800hDu) {
            enumC1195670hDh = EnumC1195670hDh.STROKED;
        }
        c1195710hDl.LLIZ = enumC1195670hDh;
        c1195710hDl.notifyItemRangeChanged(0, c1195710hDl.LLILLJJLI.size());
    }

    public final void setChips(Iterable<C789130UxT> iterable) {
        C1195710hDl c1195710hDl = this.LL;
        c1195710hDl.getClass();
        c1195710hDl.LLILLJJLI = C13LP.LLIIIJ(iterable);
        c1195710hDl.LLILLL = new LinkedHashSet();
        c1195710hDl.notifyDataSetChanged();
    }

    public final void setHorizontalMargin(int i) {
        this.LLILLJJLI.LLILLL = i;
        C1195710hDl c1195710hDl = this.LL;
        if (!c1195710hDl.LLILLJJLI.isEmpty()) {
            c1195710hDl.notifyItemChanged(0);
            if (c1195710hDl.LLILLJJLI.size() > 1) {
                c1195710hDl.notifyItemChanged(C1697810uHb.LJIIJ(c1195710hDl.LLILLJJLI));
            }
        }
    }

    public final void setOnReselectedListener(InterfaceC1195850hDz interfaceC1195850hDz) {
        this.LL.LLJ = interfaceC1195850hDz;
    }

    public final void setOnSelectedChangeListener(InterfaceC1195790hDt interfaceC1195790hDt) {
        this.LL.LLIZLLLIL = interfaceC1195790hDt;
    }

    public final void setSelectionMode(AbstractC1195750hDp abstractC1195750hDp) {
        EnumC1195670hDh enumC1195670hDh;
        EnumC1195670hDh enumC1195670hDh2;
        C1195710hDl c1195710hDl = this.LL;
        if (Intrinsics.LJFF(c1195710hDl.LLILZ, abstractC1195750hDp)) {
            EnumC1195670hDh enumC1195670hDh3 = c1195710hDl.LLIZ;
            if (c1195710hDl.LLILZ instanceof C1195800hDu) {
                enumC1195670hDh2 = EnumC1195670hDh.STROKED;
            } else {
                enumC1195670hDh2 = enumC1195670hDh3;
            }
            if (enumC1195670hDh3 != enumC1195670hDh2) {
                c1195710hDl.LLIZ = enumC1195670hDh2;
                c1195710hDl.notifyItemRangeChanged(0, c1195710hDl.LLILLJJLI.size());
                return;
            }
            return;
        }
        AbstractC1195750hDp abstractC1195750hDp2 = c1195710hDl.LLILZ;
        c1195710hDl.LLILZ = abstractC1195750hDp;
        EnumC1195670hDh enumC1195670hDh4 = c1195710hDl.LLIZ;
        if (abstractC1195750hDp instanceof C1195800hDu) {
            enumC1195670hDh = EnumC1195670hDh.STROKED;
        } else {
            enumC1195670hDh = enumC1195670hDh4;
        }
        if (enumC1195670hDh4 != enumC1195670hDh) {
            c1195710hDl.LLIZ = enumC1195670hDh;
            c1195710hDl.notifyItemRangeChanged(0, c1195710hDl.LLILLJJLI.size());
        }
        if (!(abstractC1195750hDp2 instanceof C1195800hDu) || !(abstractC1195750hDp instanceof C1195810hDv) || c1195710hDl.LLILLL.size() <= 1) {
            return;
        }
        List listLJLLJ = C13LP.LJLLJ(c1195710hDl.LLILLL);
        int iIntValue = ((Number) C13LP.LJJJJZI(listLJLLJ)).intValue();
        List listLJJJJIZL = C13LP.LJJJJIZL(listLJLLJ, 1);
        c1195710hDl.LLILLL = C093Y.LJ(Integer.valueOf(iIntValue));
        Iterator it2 = listLJJJJIZL.iterator();
        while (it2.hasNext()) {
            c1195710hDl.LLLFZ(((Number) it2.next()).intValue(), false, new AbstractC1195770hDr() { // from class: X.0hDx
            }, false);
        }
    }

    public final void setSize(EnumC1195650hDf enumC1195650hDf) {
        C1195710hDl c1195710hDl = this.LL;
        c1195710hDl.LLILZIL = enumC1195650hDf;
        c1195710hDl.notifyItemRangeChanged(0, c1195710hDl.LLILLJJLI.size());
    }

    public final void setStyle(C1194900hCS c1194900hCS) {
        C1195710hDl c1195710hDl = this.LL;
        c1195710hDl.getClass();
        c1195710hDl.LLILZIL = c1194900hCS.LIZ;
        c1195710hDl.LLILZLL = c1194900hCS.LIZIZ;
        EnumC1195670hDh enumC1195670hDh = c1194900hCS.LIZJ;
        if (c1195710hDl.LLILZ instanceof C1195800hDu) {
            enumC1195670hDh = EnumC1195670hDh.STROKED;
        }
        c1195710hDl.LLIZ = enumC1195670hDh;
        c1195710hDl.notifyItemRangeChanged(0, c1195710hDl.LLILLJJLI.size());
    }

    public final void setTrackParams(C1174900ggC c1174900ggC) {
        C1195600hDa c1195600hDa = this.LLILLL;
        c1195600hDa.LIZLLL = c1174900ggC;
        c1195600hDa.LIZ();
    }

    public final void setVariant(EnumC1175460gh6 enumC1175460gh6) {
        C1195710hDl c1195710hDl = this.LL;
        c1195710hDl.LLILZLL = enumC1175460gh6;
        c1195710hDl.notifyItemRangeChanged(0, c1195710hDl.LLILLJJLI.size());
    }

    public C1195720hDm(Context context, AttributeSet attributeSet) {
        EnumC1195670hDh enumC1195670hDh;
        EnumC1175460gh6 enumC1175460gh6;
        EnumC1195650hDf enumC1195650hDf;
        AbstractC1195750hDp abstractC1195750hDp;
        super(context, attributeSet, 0);
        C1195710hDl c1195710hDl = new C1195710hDl(context);
        this.LL = c1195710hDl;
        C423320Gio c423320Gio = new C423320Gio(this, new AwS562S0100000_18(this, 2544));
        this.LLILLJJLI = c423320Gio;
        this.LLILLL = new C1195600hDa(this, EnumC1195620hDc.CHIPS, null);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(c1195710hDl);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(c423320Gio);
        recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0hDo
            public boolean LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                if (i != 0) {
                    if (i == 1) {
                        this.LL = true;
                    }
                } else {
                    if (!this.LL) {
                        return;
                    }
                    this.LLILLJJLI.getClass();
                    this.LL = false;
                }
            }
        });
        this.LLILZ = recyclerView;
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -2));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LsChips, 0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LsChips_lsChipsSelectionMode)) {
            if (typedArrayObtainStyledAttributes.getInt(R$styleable.LsChips_lsChipsSelectionMode, 0) == 1) {
                abstractC1195750hDp = C1195800hDu.LIZ;
            } else {
                abstractC1195750hDp = C1195810hDv.LIZ;
            }
            setSelectionMode(abstractC1195750hDp);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LsChips_lsChipsSize)) {
            if (typedArrayObtainStyledAttributes.getInt(R$styleable.LsChips_lsChipsSize, 0) == 1) {
                enumC1195650hDf = EnumC1195650hDf.LARGE;
            } else {
                enumC1195650hDf = EnumC1195650hDf.MEDIUM;
            }
            setSize(enumC1195650hDf);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LsChips_lsChipsVariant)) {
            if (typedArrayObtainStyledAttributes.getInt(R$styleable.LsChips_lsChipsVariant, 0) == 1) {
                enumC1175460gh6 = EnumC1175460gh6.RECTANGLE;
            } else {
                enumC1175460gh6 = EnumC1175460gh6.CAPSULE;
            }
            setVariant(enumC1175460gh6);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LsChips_lsChipsAppearance)) {
            int i = typedArrayObtainStyledAttributes.getInt(R$styleable.LsChips_lsChipsAppearance, 0);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        enumC1195670hDh = EnumC1195670hDh.STROKED;
                    } else {
                        enumC1195670hDh = EnumC1195670hDh.TUX_FILL;
                    }
                } else {
                    enumC1195670hDh = EnumC1195670hDh.QUIET;
                }
            } else {
                enumC1195670hDh = EnumC1195670hDh.FILL;
            }
            setAppearance(enumC1195670hDh);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LsChips_lsChipsHorizontalMargin, -1);
        if (dimensionPixelSize >= 0) {
            setHorizontalMargin((int) (dimensionPixelSize / getContext().getResources().getDisplayMetrics().density));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
