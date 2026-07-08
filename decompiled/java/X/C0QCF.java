package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QCF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QCF extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;
    public Function1<? super View, Unit> LLIZ;
    public Function1<? super View, Unit> LLIZLLLIL;
    public Function2<? super C0QCE, ? super Integer, Unit> LLJ;

    private final TuxIconView getExpandView() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    private final Drawable getItemBackgroundWithRadius() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1e, getContext());
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(5));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(5));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(5));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(5));
        return c384050F3z.LIZ(getContext());
    }

    public final TuxIconView LIZ() {
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        tuxIconView.setBackground(getItemBackgroundWithRadius());
        tuxIconView.setTintColorRes(R.attr.a1j);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C786410Ut5.M6(tuxIconView, marginLayoutParams);
        return tuxIconView;
    }

    public final Map<String, String> getCommonEventParams() {
        return (Map) this.LLILZLL.getValue();
    }

    public final C426160GnO getFlowLayout() {
        return (C426160GnO) this.LL.getValue();
    }

    public final TuxIconView getFoldView() {
        return (TuxIconView) this.LLILLL.getValue();
    }

    public final boolean getIsExpanded() {
        return this.LLILZIL;
    }

    public final View LIZIZ(C426160GnO c426160GnO) {
        View viewTd;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        if (layoutInflaterNe != null && (viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.f2s, c426160GnO, false)) != null) {
            viewTd.setBackground(getItemBackgroundWithRadius());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26)));
            if (C426750GoL.LIZLLL(viewTd.getContext())) {
                marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C786410Ut5.W5(viewTd, marginLayoutParams);
            C427690Gpr.LJ(viewTd, C418440Gaw.LIZIZ(5));
            return viewTd;
        }
        return null;
    }

    public final void setCommonMobParams(Map<String, String> map) {
        getCommonEventParams().clear();
        getCommonEventParams().putAll(map);
    }

    public final void setMaxLines(int i) {
        this.LLILZ = i;
        getFlowLayout().setMaxTagLines(i);
    }

    public final void setOnClickExpandButtonCallback(Function1<? super View, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void setOnClickFoldButtonCallback(Function1<? super View, Unit> function1) {
        this.LLIZLLLIL = function1;
    }

    public final void setOnClickItemCallback(Function2<? super C0QCE, ? super Integer, Unit> function2) {
        this.LLJ = function2;
    }

    public final void setQuoteItems(List<C0QCE> list) {
        CharSequence text;
        C426160GnO flowLayout = getFlowLayout();
        TuxIconView expandView = getExpandView();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(flowLayout, expandView);
        flowLayout.removeView(expandView);
        C426160GnO flowLayout2 = getFlowLayout();
        TuxIconView foldView = getFoldView();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(flowLayout2, foldView);
        flowLayout2.removeView(foldView);
        final int i = 0;
        this.LLILZIL = false;
        getFlowLayout().setMaxTagLines(this.LLILZ);
        C426160GnO flowLayout3 = getFlowLayout();
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 273);
        int size = list.size() - flowLayout3.getChildCount();
        while (size != 0) {
            if (size > 0) {
                View view = (View) awS554S0100000_10.invoke();
                if (view != null) {
                    flowLayout3.addView(view);
                }
                size--;
            } else {
                C786410Ut5.LJJLIL(flowLayout3.getChildCount() - 1, flowLayout3);
                size++;
            }
        }
        for (C0QCE c0qce : list) {
            int i2 = i + 1;
            CharSequence text2 = null;
            if (i >= 0) {
                final C0QCE c0qce2 = c0qce;
                View childAt = getFlowLayout().getChildAt(i);
                if (childAt != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) childAt.findViewById(R.id.sov);
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) childAt.findViewById(R.id.sot);
                    String strValueOf = String.valueOf(i2);
                    if (appCompatTextView != null) {
                        text = appCompatTextView.getText();
                    } else {
                        text = null;
                    }
                    if (!Intrinsics.LJFF(strValueOf, String.valueOf(text)) && appCompatTextView != null) {
                        appCompatTextView.setText(String.valueOf(i2));
                    }
                    String str = c0qce2.LIZ;
                    if (appCompatTextView2 != null) {
                        text2 = appCompatTextView2.getText();
                    }
                    if (!Intrinsics.LJFF(str, String.valueOf(text2)) && appCompatTextView2 != null) {
                        appCompatTextView2.setText(c0qce2.LIZ);
                    }
                    C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0QCD
                        @Override // X.AbstractViewOnClickListenerC420730Ged
                        public final void LIZ(View view2) throws JSONException {
                            Context context;
                            if (view2 != null && (context = this.LLILZ.getContext()) != null) {
                                JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIZILJ(this.LLILZ.getCommonEventParams()));
                                jSONObject.put("card_url", c0qce2.LIZIZ);
                                jSONObject.put("card_title", c0qce2.LIZ);
                                jSONObject.put("page_type", c0qce2.LIZJ);
                                String strJ3 = C786410Ut5.J3(jSONObject);
                                if (this.LLILZ.getCommonEventParams().containsKey("search_result_id")) {
                                    String str2 = this.LLILZ.getCommonEventParams().get("search_result_id");
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    jSONObject.put("object_id", str2);
                                }
                                String strJ32 = C786410Ut5.J3(jSONObject);
                                C066P c066p = C066P.LIZ;
                                String str3 = c0qce2.LIZIZ;
                                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("need_disclaimer", "true"), new Pair("business_event_tracking", strJ3), new Pair("report_event_tracking", strJ32));
                                c066p.getClass();
                                C066P.LIZ(context, str3, mapLJIIJ);
                                Function2<? super C0QCE, ? super Integer, Unit> function2 = this.LLILZ.LLJ;
                                if (function2 != null) {
                                    function2.invoke(c0qce2, Integer.valueOf(i));
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(700L);
                        }
                    }, childAt);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C426160GnO flowLayout4 = getFlowLayout();
        TuxIconView expandView2 = getExpandView();
        flowLayout4.LLJI = expandView2;
        flowLayout4.addView(expandView2);
    }

    public C0QCF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS545S0100000_1(context, 1));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 3));
        this.LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 4));
        this.LLILZLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(19));
        addView(getFlowLayout());
        C426160GnO flowLayout = getFlowLayout();
        flowLayout.setMaxTagLines(this.LLILZ);
        flowLayout.setShowMore(true);
        flowLayout.setGravity(-1);
        C786410Ut5.I7(new AjS65S0100000_10(this, 0), getExpandView());
        C786410Ut5.I7(new AjS65S0100000_10(this, 1), getFoldView());
    }
}
