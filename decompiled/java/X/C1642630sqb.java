package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642630sqb extends C194449115r {
    public final C19517811Xs LLILZLL;
    public final C19517811Xs LLIZ;
    public List<? extends Pair<? extends EffectCategoryModel, ? extends List<C1642670sqf>>> LLIZLLLIL;
    public InterfaceC1642660sqe LLJ;
    public final Drawable LLJI;
    public final Drawable LLJIJIL;
    public C1642610sqZ LLJILJIL;

    public final C1642610sqZ getFilterBoxViewConfigure() {
        return this.LLJILJIL;
    }

    @Override // X.C194449115r
    public final View LIZ(Context context) {
        return new Space(context);
    }

    @Override // X.C194449115r
    public final View LIZIZ(Context context) {
        return new Space(context);
    }

    @Override // X.C194449115r
    public final void LIZLLL(int i) {
        int i2;
        int i3;
        int i4;
        View view = this.LL;
        int i5 = 0;
        if (view != null) {
            if (i == 0) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            C786410Ut5.LJLLLLLL(i4, view);
        }
        View view2 = this.LLILLJJLI;
        if (i == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view2);
        View view3 = this.LLILZ;
        if (i == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, view3);
        View view4 = this.LLILLL;
        if (i != 3) {
            i5 = 8;
        }
        C786410Ut5.LJLLLLLL(i5, view4);
    }

    public final EffectCategoryModel LJ(C1639880smA c1639880smA) {
        Pair<? extends EffectCategoryModel, ? extends List<C1642670sqf>> next;
        EffectCategoryModel first;
        List<? extends Pair<? extends EffectCategoryModel, ? extends List<C1642670sqf>>> list = this.LLIZLLLIL;
        if (list != null) {
            Iterator<? extends Pair<? extends EffectCategoryModel, ? extends List<C1642670sqf>>> it2 = list.iterator();
            while (true) {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                Iterator<T> it3 = next.getSecond().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (Intrinsics.LJFF(((C1642670sqf) next2).LIZ.LIZ.LIZLLL, c1639880smA.LIZ.LIZLLL)) {
                            if (next2 != null) {
                                break;
                            }
                        }
                    }
                }
            }
            Pair<? extends EffectCategoryModel, ? extends List<C1642670sqf>> pair = next;
            if (pair != null && (first = pair.getFirst()) != null) {
                return first;
            }
        }
        throw new NoSuchElementException();
    }

    public final void LJFF(EffectCategoryModel effectCategoryModel) {
        Object next;
        AbstractC1640090smV abstractC1640090smV = (AbstractC1640090smV) this.LLIZ.getAdapter();
        if (effectCategoryModel == null) {
            abstractC1640090smV.LLLFZ(C13BV.INSTANCE);
            abstractC1640090smV.notifyDataSetChanged();
            return;
        }
        List<? extends Pair<? extends EffectCategoryModel, ? extends List<C1642670sqf>>> list = this.LLIZLLLIL;
        List list2 = null;
        if (list != null) {
            C1638440sjq c1638440sjq = C1638720skI.LIZ;
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2((Object) effectCategoryModel, (Object) 402);
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((Boolean) awS581S0100000_2.invoke(((Pair) next).getFirst())).booleanValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Pair pair = (Pair) next;
            if (pair != null) {
                list2 = (List) pair.getSecond();
            }
        }
        abstractC1640090smV.LLLFZ(list2);
        abstractC1640090smV.notifyDataSetChanged();
    }

    public final void setCallback(InterfaceC1642660sqe interfaceC1642660sqe) {
        this.LLJ = interfaceC1642660sqe;
    }

    public final void setCategoryMap(List<? extends Pair<? extends EffectCategoryModel, ? extends List<C1639880smA>>> list) {
        setState(0);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Pair<? extends EffectCategoryModel, ? extends List<C1639880smA>> pair : list) {
            EffectCategoryModel first = pair.getFirst();
            List<C1639880smA> second = pair.getSecond();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(second, 10));
            Iterator<T> it2 = second.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C1642670sqf((C1639880smA) it2.next()));
            }
            arrayList.add(new Pair(first, arrayList2));
        }
        this.LLIZLLLIL = arrayList;
        C1642710sqj c1642710sqj = new C1642710sqj(this);
        this.LLILZLL.setAdapter(c1642710sqj);
        c1642710sqj.LLLI(C1638720skI.LJFF(list));
        LJFF((EffectCategoryModel) C13LP.LJJJLL(C1638720skI.LJFF(list)));
    }

    public final void setFilterBoxViewConfigure(C1642610sqZ c1642610sqZ) {
        this.LLJILJIL = c1642610sqZ;
        AbstractC21673619ry adapter = this.LLILZLL.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        AbstractC21673619ry adapter2 = this.LLIZ.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    public C1642630sqb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJILJIL = new C1642610sqZ();
        final C19517811Xs c19517811Xs = new C19517811Xs(getContext(), null, 6, 0);
        c19517811Xs.setLayoutManager(new LinearLayoutManager(c19517811Xs.getContext(), 1, false));
        c19517811Xs.setAdapter(new C1642710sqj(this));
        final int iLIZIZ = (int) C11VU.LIZIZ(8.0f, c19517811Xs.getContext());
        c19517811Xs.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0sqd
            public final int LL;

            {
                this.LL = iLIZIZ;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (recyclerView.getChildAdapterPosition(view) == 0) {
                    rect.top = this.LL;
                }
            }
        });
        this.LLILZLL = c19517811Xs;
        int color = getContext().getResources().getColor(R.color.a0s);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.fo);
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZIZ(color);
        c1643380sro.LJ(color, 0);
        float f = dimensionPixelSize;
        c1643380sro.LJI = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        c19517811Xs.setBackground(c1643380sro.LIZ());
        c19517811Xs.setAccessibilityDelegateCompat(new C20094913jv(c19517811Xs) { // from class: X.0sql
            @Override // X.C20094913jv, X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                List<? extends Pair<? extends EffectCategoryModel, ? extends List<C1642670sqf>>> list = this.LIZJ.LLIZLLLIL;
                if (list != null) {
                    accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZ(((ArrayList) list).size(), 1));
                }
            }
        });
        C19517811Xs c19517811Xs2 = new C19517811Xs(getContext(), null, 6, 0);
        c19517811Xs2.setLayoutManager(new LinearLayoutManager(c19517811Xs2.getContext(), 1, false));
        c19517811Xs2.setAdapter(new C1642600sqY(this));
        final int iLIZIZ2 = (int) C11VU.LIZIZ(8.0f, c19517811Xs2.getContext());
        c19517811Xs2.addItemDecoration(new C0DXR(iLIZIZ2) { // from class: X.0sqd
            public final int LL;

            {
                this.LL = iLIZIZ2;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (recyclerView.getChildAdapterPosition(view) == 0) {
                    rect.top = this.LL;
                }
            }
        });
        this.LLIZ = c19517811Xs2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(c19517811Xs, new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(c19517811Xs2, new LinearLayout.LayoutParams(0, -1, 2.0f));
        addView(linearLayout);
        setState(1);
        this.LLJI = C19734012Iw.LIZLLL(getContext().getResources().getDrawable(R.drawable.bxl), getContext().getResources().getColor(R.color.a0v));
        this.LLJIJIL = getContext().getResources().getDrawable(R.drawable.bxd);
    }

    @Override // X.C194449115r
    public final View LIZJ(Context context, AttributeSet attributeSet) {
        return new C0DRO(context, attributeSet, 0);
    }
}
