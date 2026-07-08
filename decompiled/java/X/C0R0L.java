package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.ISearchList;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS96S0201000_10;

/* JADX INFO: renamed from: X.0R0L, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0L extends C1319030kQf {
    public final UIList LLJLILLLLZIIL;
    public final C0R0K LLJLL;

    public final void LLLLIL(JavaOnlyMap javaOnlyMap) {
        ReadableArray array = javaOnlyMap.getArray("itemkeys");
        if (array instanceof JavaOnlyArray) {
            JavaOnlyArray javaOnlyArray = (JavaOnlyArray) array;
            if (javaOnlyArray.size() != this.LLJLL.LIZIZ.size()) {
                ((RecyclerView) this.LLJLILLLLZIIL.mView).invalidateItemDecorations();
            }
            this.LLJLL.LIZIZ = javaOnlyArray;
        }
    }

    @Override // X.C1319030kQf
    public final void LLLFZ(C1318570kPv c1318570kPv, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.LLLFZ(c1318570kPv, i);
        if (!this.LLJLILLLLZIIL.LJJJJI() && c1318570kPv != null) {
            LLLLIILLL(c1318570kPv, i);
        }
        C644690PQl.LJIJJ += System.currentTimeMillis() - jCurrentTimeMillis;
    }

    @Override // X.C1319030kQf
    /* JADX INFO: renamed from: LLLJ */
    public final void onBindViewHolder(C1318570kPv c1318570kPv, int i) {
        super.onBindViewHolder(c1318570kPv, i);
        LLLLIILLL(c1318570kPv, i);
    }

    @Override // X.C1319030kQf
    public final C1318570kPv LLLJIL(int i, ViewGroup viewGroup) {
        int iLIZ;
        Float preferItemWidth;
        C1318570kPv c1318570kPvLLLJIL = super.LLLJIL(i, viewGroup);
        ViewGroup.LayoutParams layoutParams = c1318570kPvLLLJIL.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
        }
        c1318570kPvLLLJIL.itemView.setTag(R.id.u74, Unit.LIZ);
        ISearchList.HorizontalStyle horizontalStyle = this.LLJLL.LJ;
        if (horizontalStyle != null && (preferItemWidth = horizontalStyle.getPreferItemWidth()) != null) {
            iLIZ = C0HCL.LIZ(preferItemWidth.floatValue(), viewGroup.getContext());
            if (iLIZ > 0) {
            }
            return c1318570kPvLLLJIL;
        }
        iLIZ = 400;
        c1318570kPvLLLJIL.LL.LLILZIL = iLIZ;
        return c1318570kPvLLLJIL;
    }

    public final void LLLLIILLL(C1318570kPv c1318570kPv, int i) {
        UIComponent uIComponent;
        int i2;
        JavaOnlyArray javaOnlyArray = this.LLJLL.LJIJ;
        if (javaOnlyArray != null && javaOnlyArray.contains(Integer.valueOf(i)) && !this.LLJLL.LJJI && (uIComponent = c1318570kPv.LL.LLILLJJLI) != null) {
            if (uIComponent.getWidth() == 0 && (i2 = this.LLJLL.LJIL) > 0) {
                uIComponent.setWidth(i2);
            }
            View view = c1318570kPv.itemView;
            ViewTreeObserverOnPreDrawListenerC688950R0r viewTreeObserverOnPreDrawListenerC688950R0r = new ViewTreeObserverOnPreDrawListenerC688950R0r(view, new AwS96S0201000_10(this, i, uIComponent, 1));
            C786410Ut5.y3(view.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC688950R0r);
            view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC688950R0r);
        }
    }

    @Override // X.C1319030kQf, X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C1318570kPv) viewHolder, i);
    }

    @Override // X.C1319030kQf, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1318570kPv c1318570kPvLLLJIL = LLLJIL(i, viewGroup);
        try {
            View view = c1318570kPvLLLJIL.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1318570kPvLLLJIL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1318570kPvLLLJIL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1318570kPv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1318570kPvLLLJIL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1318570kPvLLLJIL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1318570kPv.class.getName();
        return c1318570kPvLLLJIL;
    }

    public C0R0L(UIList uIList, C688790R0b c688790R0b, C0R0K c0r0k) {
        super(uIList, c688790R0b);
        this.LLJLILLLLZIIL = uIList;
        this.LLJLL = c0r0k;
    }
}
