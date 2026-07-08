package X;

import X.AbstractC1652980t7I;
import Y.ALAdapterS19S0200000_25;
import Y.ALAdapterS20S0100000_25;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import ion.l;
import ion.l.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractViewOnLayoutChangeListenerC1657530tEd<OPTION extends AbstractC1652980t7I, VIEW_HOLDER extends l.d> extends LinearLayout implements View.OnLayoutChangeListener {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final boolean LLILLL;
    public List<? extends OPTION> LLILZ;
    public final Map<OPTION, VIEW_HOLDER> LLILZIL;
    public AbstractC1652980t7I LLILZLL;
    public View LLIZ;
    public Rect LLIZLLLIL;
    public InterfaceC1657540tEe<OPTION, VIEW_HOLDER> LLJ;
    public final C01GW LLJI;

    private final Function1<OPTION, Unit> getOpOptionSelected() {
        return (Function1) this.LLJI.getValue();
    }

    private final C11PQ<Boolean> getPanelVisibilitySubject() {
        return (C11PQ) this.LLILLJJLI.getValue();
    }

    public final void LJ() {
        InterfaceC1657540tEe<OPTION, VIEW_HOLDER> interfaceC1657540tEe = this.LLJ;
        if (interfaceC1657540tEe == null || this.LLILZ.isEmpty()) {
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        ((LinkedHashMap) this.LLILZIL).clear();
        int i = 0;
        for (OPTION option : this.LLILZ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            VIEW_HOLDER view_holderLIZ = interfaceC1657540tEe.LIZ(getContext(), (AbstractC1652980t7I) ListProtector.get(this.LLILZ, i), i2, this.LLILZ.size(), getOpOptionSelected());
            this.LLILZIL.put(option, view_holderLIZ);
            addView(view_holderLIZ.getItemView());
            i = i2;
        }
    }

    public final C11PQ<OPTION> getSelectOptionSubject() {
        return (C11PQ) this.LL.getValue();
    }

    private final Pair<Integer, Integer> getPanelWH() {
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            return new Pair<>(Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
        }
        measure(0, 0);
        return new Pair<>(Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()));
    }

    public final C19475711Hn LIZJ() {
        C11PQ<Boolean> panelVisibilitySubject = getPanelVisibilitySubject();
        panelVisibilitySubject.getClass();
        return new C19475711Hn(panelVisibilitySubject);
    }

    public final void LIZ(Function0<Unit> function0) {
        View view;
        int iWidth;
        if (getVisibility() == 8 || (view = this.LLIZ) == null) {
            return;
        }
        getPanelVisibilitySubject().onNext(Boolean.FALSE);
        Rect rect = new Rect();
        int iIntValue = getPanelWH().getSecond().intValue();
        view.getGlobalVisibleRect(rect);
        if (this.LLILLL) {
            iWidth = (rect.left + rect.width()) - ScreenUtils.getScreenWidth(getContext());
        } else {
            iWidth = rect.left;
        }
        animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).translationX(iWidth).translationY(((rect.top + rect.bottom) - iIntValue) / 2.0f).setInterpolator(C1619980sG4.LIZLLL()).setDuration(200L).setListener(new ALAdapterS19S0200000_25(this, function0, 3)).start();
        view.removeOnLayoutChangeListener(this);
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    public final void LIZIZ(Rect rect) {
        int iWidth;
        float fWidth;
        this.LLIZLLLIL = rect;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleX(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setScaleY(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        Pair<Integer, Integer> panelWH = getPanelWH();
        int iIntValue = panelWH.getFirst().intValue();
        int iIntValue2 = panelWH.getSecond().intValue();
        if (this.LLILLL) {
            iWidth = (rect.left + rect.width()) - ScreenUtils.getScreenWidth(getContext());
        } else {
            iWidth = rect.left;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationX(iWidth);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setTranslationY(((rect.top + rect.bottom) - iIntValue2) / 2.0f);
        if (this.LLILLL) {
            fWidth = (((rect.left + rect.width()) + iIntValue) + 6.0f) - ScreenUtils.getScreenWidth(getContext());
        } else {
            fWidth = (rect.left - iIntValue) - 6.0f;
        }
        animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationX(fWidth).translationY(((rect.top + rect.bottom) - iIntValue2) / 2.0f).setInterpolator(C1619980sG4.LIZLLL()).setDuration(200L).setListener(new ALAdapterS20S0100000_25(this, 6)).start();
    }

    public final void LIZLLL(View view) {
        this.LLIZ = view;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        getPanelVisibilitySubject().onNext(Boolean.TRUE);
        LIZIZ(rect);
        view.addOnLayoutChangeListener(this);
    }

    public final void setAdapter(InterfaceC1657540tEe<OPTION, VIEW_HOLDER> interfaceC1657540tEe) {
        this.LLJ = interfaceC1657540tEe;
        LJ();
    }

    public final void setData(List<? extends OPTION> list) {
        this.LLILZ = list;
        LJ();
    }

    public final void setOption(OPTION option) {
        if (Intrinsics.LJFF(this.LLILZLL, option)) {
            return;
        }
        InterfaceC1657550tEf interfaceC1657550tEf = (InterfaceC1657550tEf) ((LinkedHashMap) this.LLILZIL).get(this.LLILZLL);
        if (interfaceC1657550tEf != null) {
            interfaceC1657550tEf.LIZ(false);
        }
        this.LLILZLL = option;
        InterfaceC1657550tEf interfaceC1657550tEf2 = (InterfaceC1657550tEf) ((LinkedHashMap) this.LLILZIL).get(option);
        if (interfaceC1657550tEf2 != null) {
            interfaceC1657550tEf2.LIZ(true);
        }
    }

    public AbstractViewOnLayoutChangeListenerC1657530tEd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractViewOnLayoutChangeListenerC1657530tEd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(432));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(431));
        this.LLILLL = C426750GoL.LIZLLL(context);
        this.LLILZ = new ArrayList();
        this.LLILZIL = new LinkedHashMap();
        this.LLILZLL = new AbstractC1652980t7I() { // from class: X.0t7L
        };
        this.LLJI = C452501pT.LIZIZ(new AwS569S0100000_25((AbstractViewOnLayoutChangeListenerC1657530tEd) this, 830));
        setOrientation(1);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.asy);
        setBackground(c384050F3z.LIZ(context));
        setOutlineProvider(new C580760MqA(1));
        setClipChildren(true);
        setClipToOutline(true);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.LLIZ;
        if (view2 != null) {
            Rect rect = new Rect();
            view2.getGlobalVisibleRect(rect);
            if (!Intrinsics.LJFF(this.LLIZLLLIL, rect)) {
                LIZIZ(rect);
            }
        }
    }
}
