package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS116S0100000_16;
import Y.AsS43S0100000_16;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model.CommerceAgentActiveActionItem;
import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0e8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1076940e8C extends AbstractC421070GfB<CommerceAgentActiveActionItem> {
    public boolean LLILZLL;
    public C1076950e8D LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;
    public C1076930e8B LLJI;

    public void LIZIZ() {
        CommerceAgentHint commerceAgentHint;
        Integer num;
        String str;
        TuxTextView name = getName();
        if (name != null) {
            C1076930e8B c1076930e8B = this.LLJI;
            if (c1076930e8B == null || (str = c1076930e8B.LIZIZ) == null) {
                str = "";
            }
            name.setText(str);
        }
        C1076930e8B c1076930e8B2 = this.LLJI;
        if (c1076930e8B2 == null || (commerceAgentHint = c1076930e8B2.LJI) == null || (num = commerceAgentHint.type) == null || num.intValue() != 1) {
            TuxTextView name2 = getName();
            if (name2 != null) {
                HandlerHook.viewPost(name2, new ARunnableS106S0100000_6((Object) this, 275));
            }
            View root = getRoot();
            if (root != null) {
                root.setBackgroundResource(R.drawable.b1g);
            }
            TuxIconView icon = getIcon();
            if (icon != null) {
                C786410Ut5.LJLLLLLL(8, icon);
                return;
            }
            return;
        }
        TuxTextView name3 = getName();
        if (name3 != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.afy, name3.getContext());
            name3.setTextColor(numLIZJ != null ? numLIZJ.intValue() : -1);
            name3.getPaint().setShader(null);
            name3.invalidate();
        }
        View root2 = getRoot();
        if (root2 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{-9487105, -7391310});
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            gradientDrawable.setCornerRadius(C341940Daq.LIZ(14.0d));
            root2.setBackground(gradientDrawable);
        }
        TuxIconView icon2 = getIcon();
        if (icon2 != null) {
            C786410Ut5.LJLLLLLL(0, icon2);
            icon2.setIconRes(R.raw.icon_twinkle_star_fill);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.afy, icon2.getContext());
            icon2.setTintColor(numLIZJ2 != null ? numLIZJ2.intValue() : -1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0e8F] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0e8E] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final C1076950e8D c1076950e8D = new C1076950e8D(this, new AwS595S0100000_16(this, 376));
        this.LLIZ = c1076950e8D;
        ViewGroup viewGroupLIZIZ = C1076950e8D.LIZIZ(this);
        if (viewGroupLIZIZ instanceof RecyclerView) {
            AsS43S0100000_16 asS43S0100000_16 = new AsS43S0100000_16(c1076950e8D, 4);
            c1076950e8D.LIZJ = asS43S0100000_16;
            ((RecyclerView) viewGroupLIZIZ).addOnScrollListener(asS43S0100000_16);
            HandlerHook.viewPost(c1076950e8D.LIZ, new ARunnableS116S0100000_16(c1076950e8D, 225));
            return;
        }
        c1076950e8D.LIZLLL = new ViewTreeObserverOnGlobalLayoutListenerC1077390e8v(c1076950e8D, 4);
        C786410Ut5.x3(getViewTreeObserver(), c1076950e8D.LIZLLL);
        c1076950e8D.LJ = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0e8F
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                c1076950e8D.LIZ();
            }
        };
        C786410Ut5.z3(getViewTreeObserver(), c1076950e8D.LJ);
        c1076950e8D.LJFF = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0e8E
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                if (!z) {
                    c1076950e8D.LIZIZ.invoke(Boolean.FALSE);
                } else {
                    c1076950e8D.LIZ();
                }
            }
        };
        getViewTreeObserver().addOnWindowFocusChangeListener(c1076950e8D.LJFF);
        HandlerHook.viewPost(c1076950e8D.LIZ, new ARunnableS116S0100000_16(c1076950e8D, 224));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        ViewTreeObserver viewTreeObserver3;
        RecyclerView recyclerView;
        super.onDetachedFromWindow();
        C1076950e8D c1076950e8D = this.LLIZ;
        if (c1076950e8D != null) {
            AsS43S0100000_16 asS43S0100000_16 = c1076950e8D.LIZJ;
            if (asS43S0100000_16 != null) {
                ViewGroup viewGroupLIZIZ = C1076950e8D.LIZIZ(c1076950e8D.LIZ);
                if ((viewGroupLIZIZ instanceof RecyclerView) && (recyclerView = (RecyclerView) viewGroupLIZIZ) != null) {
                    recyclerView.removeOnScrollListener(asS43S0100000_16);
                }
            }
            ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v = c1076950e8D.LIZLLL;
            if (viewTreeObserverOnGlobalLayoutListenerC1077390e8v != null && (viewTreeObserver3 = c1076950e8D.LIZ.getViewTreeObserver()) != null) {
                viewTreeObserver3.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1077390e8v);
                C2187701Ajg.LIZIZ(viewTreeObserver3, viewTreeObserverOnGlobalLayoutListenerC1077390e8v, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            ViewTreeObserverOnScrollChangedListenerC1076970e8F viewTreeObserverOnScrollChangedListenerC1076970e8F = c1076950e8D.LJ;
            if (viewTreeObserverOnScrollChangedListenerC1076970e8F != null && (viewTreeObserver2 = c1076950e8D.LIZ.getViewTreeObserver()) != null) {
                viewTreeObserver2.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1076970e8F);
                C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC1076970e8F, ViewTreeObserver.OnScrollChangedListener.class);
            }
            if (c1076950e8D.LJFF != null && (viewTreeObserver = c1076950e8D.LIZ.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnWindowFocusChangeListener(c1076950e8D.LJFF);
            }
            c1076950e8D.LIZJ = null;
            c1076950e8D.LIZLLL = null;
            c1076950e8D.LJ = null;
        }
        this.LLIZ = null;
    }

    public final boolean getEnableDisableReport() {
        return this.LLILZLL;
    }

    public final C1076930e8B getRenderData() {
        return this.LLJI;
    }

    public final String getViewTag() {
        return this.LLJ;
    }

    public final void LIZ(boolean z) {
        C1076930e8B c1076930e8B;
        if (z && !this.LLILZLL && (c1076930e8B = this.LLJI) != null) {
            String str = c1076930e8B.LIZJ;
            String str2 = c1076930e8B.LIZIZ;
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(str2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                ConcurrentHashMap<String, Boolean> concurrentHashMap = C321630CjB.LIZ;
                if (!concurrentHashMap.containsKey(strLIZIZ) && concurrentHashMap.put(strLIZIZ, Boolean.TRUE) == null) {
                    C07GV.LIZ(new AwS417S0200000_16(c1076930e8B, this, 103));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public final void setEnableDisableReport(boolean z) {
        this.LLILZLL = z;
    }

    public final void setRenderData(C1076930e8B c1076930e8B) {
        this.LLJI = c1076930e8B;
        LIZIZ();
    }

    public final void setViewTag(String str) {
        this.LLJ = str;
    }

    public AbstractC1076940e8C(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = "";
    }
}
