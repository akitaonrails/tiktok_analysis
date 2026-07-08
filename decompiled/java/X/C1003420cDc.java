package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.searchcomponent.SearchAdComponentDataModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003420cDc extends AbstractC1014240cV4 {
    public final InterfaceC1003440cDe LLJLIL;
    public final String LLJLILLLLZIIL;
    public final SearchAdComponentDataModel LLJLL;
    public final int LLJLLIL;
    public final int LLJLLL;
    public ViewGroup LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxIconView LLL;
    public boolean LLLF;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        ViewGroup viewGroup = this.LLJZ;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(this.LLJLLIL);
        }
        TuxTextView tuxTextView = this.LLJZIJLIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.eh);
        }
        LJIIZILJ();
        this.LLLF = false;
        super.LJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        ViewGroup viewGroup = this.LLJZ;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(this.LLJLLIL);
        }
        TuxTextView tuxTextView = this.LLJZIJLIL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.eh);
        }
        LJIIZILJ();
        this.LLLF = false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        if (abstractC1003980cEW instanceof C1005130cGN) {
            this.LLILLL.a3("search_cta_component_change_color", new ARunnableS116S0100000_16(this, 228), (int) (this.LLJLL.getColorChangeTime() * LSPassThroughRecordSizeConfig.DEFAULT));
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        ViewGroup viewGroup2;
        TuxTextView tuxTextView;
        C19ME c19me;
        int i;
        super.Fk(viewGroup, interfaceC1014340cVE);
        this.LLJJIJIL = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.qo, this.LLJJIII, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initButtonLayout   searchCTAView");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append("  contentView");
        sbLIZ.append(this.LLJJIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = this.LLJJIJIL;
        TuxIconView tuxIconView = null;
        if (view != null) {
            viewGroup2 = (ViewGroup) view.findViewById(R.id.b5x);
        } else {
            viewGroup2 = null;
        }
        this.LLJZ = viewGroup2;
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            tuxTextView = (TuxTextView) view2.findViewById(R.id.b5w);
        } else {
            tuxTextView = null;
        }
        this.LLJZIJLIL = tuxTextView;
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            tuxIconView = (TuxIconView) view3.findViewById(R.id.b5v);
        }
        this.LLL = tuxIconView;
        ViewGroup viewGroup3 = this.LLJZ;
        if (viewGroup3 != null) {
            viewGroup3.setBackgroundColor(this.LLJLLIL);
            C786410Ut5.K7(viewGroup3, new ACListenerS151S0100000_16(this, 137));
            viewGroup3.setClipToOutline(true);
            viewGroup3.setOutlineProvider(new C1077150e8X(this, 1));
            C427690Gpr.LJ(viewGroup3, 0.0f);
        }
        TuxIconView tuxIconView2 = this.LLL;
        if (tuxIconView2 != null) {
            if (this.LLJLL.getHaveArrow()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, i);
        }
        TuxTextView tuxTextView2 = this.LLJZIJLIL;
        if (tuxTextView2 != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                int textMarginStart = this.LLJLL.getTextMarginStart();
                if (textMarginStart == -1) {
                    c19me.startToStart = 0;
                    c19me.endToEnd = 0;
                } else {
                    c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(textMarginStart))));
                }
                C786410Ut5.R6(tuxTextView2, c19me);
            }
            tuxTextView2.setText(this.LLJLL.getButtonText());
            tuxTextView2.setTextColorRes(R.attr.eh);
        }
    }

    public C1003420cDc(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        int iIntValue;
        Integer numLIZJ;
        Integer numLIZJ2;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1003440cDe;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAdCTAComponent,type:");
        sbLIZ.append(anoleComponentModel.type);
        this.LLJLILLLLZIIL = C2188811AlT.LIZIZ(sbLIZ);
        SearchAdComponentDataModel searchAdComponentDataModelLIZ = C1011660cQu.LIZ(this);
        this.LLJLL = searchAdComponentDataModelLIZ;
        int iIntValue2 = 0;
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.e9, context)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJLLIL = iIntValue;
        String ctaBgColor = searchAdComponentDataModelLIZ.getCtaBgColor();
        if (ctaBgColor.length() > 0) {
            iIntValue2 = ColorProtector.parseColor(ctaBgColor);
        } else if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context)) != null) {
            iIntValue2 = numLIZJ.intValue();
        }
        this.LLJLLL = iIntValue2;
    }
}
