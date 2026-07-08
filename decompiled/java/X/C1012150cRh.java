package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.SearchSummaryModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012150cRh extends AbstractC1014240cV4 {
    public final InterfaceC1003440cDe LLJLIL;
    public Aweme LLJLILLLLZIIL;
    public final SearchSummaryModel LLJLL;
    public FrameLayout LLJLLIL;
    public TuxTextView LLJLLL;
    public C337000DJa LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;

    public final void LJJI() {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "othershow", this.LLILLJJLI.LIZLLL);
        c1022820ciuLIZLLL.LIZJ("ai_agent_summary", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LLJZIJLIL), "ai_agent_summary_type");
        c1022820ciuLIZLLL.LJII();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        C337000DJa c337000DJa;
        if (abstractC1003980cEW instanceof C991210btv) {
            C991210btv c991210btv = (C991210btv) abstractC1003980cEW;
            int i = c991210btv.LIZ;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!this.LLL) {
                            this.LLL = true;
                            View view = this.LLJJIJIL;
                            if (view != null) {
                                HandlerHook.viewPost(view, new ARunnableS116S0100000_16(this, 231));
                            }
                            TuxTextView tuxTextView = this.LLJLLL;
                            if (tuxTextView != null) {
                                HandlerHook.viewPost(tuxTextView, new ARunnableS116S0100000_16(this, 230));
                            }
                        }
                        LJJI();
                        return;
                    }
                    return;
                }
                View view2 = this.LLJJIJIL;
                if (view2 != null) {
                    HandlerHook.viewPost(view2, new ARunnableS116S0100000_16(this, 231));
                }
                TuxTextView tuxTextView2 = this.LLJLLL;
                if (tuxTextView2 == null) {
                    return;
                }
                HandlerHook.viewPost(tuxTextView2, new ARunnableS116S0100000_16(this, 229));
                return;
            }
            if (!this.LLL) {
                this.LLL = true;
                View view3 = this.LLJJIJIL;
                if (view3 != null) {
                    HandlerHook.viewPost(view3, new ARunnableS116S0100000_16(this, 231));
                }
                if (C1533950q1J.LJ(c991210btv.LIZIZ)) {
                    this.LLJZIJLIL = 1;
                }
            }
            String str = c991210btv.LIZIZ;
            if (str == null || (c337000DJa = this.LLJZ) == null || c337000DJa.LJI) {
                return;
            }
            c337000DJa.LJ = str;
            if (c337000DJa.LJII != null && !(!r0.isActive())) {
                return;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            c337000DJa.LJII = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0DJZ(c337000DJa, null), 3);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        Aweme aweme;
        TuxTextView tuxTextView;
        super.Fk(viewGroup, interfaceC1014340cVE);
        Object obj = this.LLILLJJLI.LIZJ;
        C337000DJa c337000DJa = null;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        this.LLJLILLLLZIIL = aweme;
        View viewLIZIZ = C21146717pB.LIZIZ(this.LLILZ, R.layout.qi, this.LLJJIII, false);
        this.LLJJIJIL = viewLIZIZ;
        this.LLJLLIL = (FrameLayout) viewLIZIZ.findViewById(R.id.wp6);
        View view = this.LLJJIJIL;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.woq);
        } else {
            tuxTextView = null;
        }
        this.LLJLLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setOnLongClickListener(new ViewOnLongClickListenerC1077280e8k(this, 3));
        }
        TuxTextView tuxTextView2 = this.LLJLLL;
        if (tuxTextView2 != null) {
            c337000DJa = new C337000DJa(tuxTextView2, new AwS560S0100000_16(this, 918));
        }
        this.LLJZ = c337000DJa;
    }

    public static CharSequence LJJ(C1012150cRh c1012150cRh, TuxTextView tuxTextView, String str) {
        int measuredWidth = (tuxTextView.getMeasuredWidth() - tuxTextView.getPaddingLeft()) - tuxTextView.getPaddingRight();
        CharSequence charSequence = str;
        if (measuredWidth > 0) {
            TextPaint paint = tuxTextView.getPaint();
            String string = tuxTextView.getContext().getString(R.string.loy);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("... ");
            sbLIZ.append(string);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int iIntValue = 0;
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), paint, measuredWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(tuxTextView.getLineSpacingExtra(), tuxTextView.getLineSpacingMultiplier()).setMaxLines(2).build();
            charSequence = str;
            if (staticLayoutBuild.getLineCount() >= 2) {
                int lineStart = staticLayoutBuild.getLineStart(1);
                int iBreakText = lineStart + paint.breakText(str.substring(lineStart, staticLayoutBuild.getLineVisibleEnd(1)), true, measuredWidth - paint.measureText(strLIZIZ), null);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str.substring(0, iBreakText));
                sbLIZ2.append("... ");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                spannableStringBuilder.append((CharSequence) string);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uh, tuxTextView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
                charSequence = spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public C1012150cRh(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1003440cDe;
        this.LLJZIJLIL = 2;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (SearchSummaryModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), SearchSummaryModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anoleComponentModel.type);
            sbLIZ.append(": parse success");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(anoleComponentModel.type);
            sbLIZ2.append(": parse failed, reason = ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLJLL = (SearchSummaryModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
