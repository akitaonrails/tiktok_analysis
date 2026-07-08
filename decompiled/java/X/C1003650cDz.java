package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.component.slideupcompoent.model.AnoleUpSlideComponetDataModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003650cDz extends AbstractC1014240cV4 implements InterfaceC1035160d2o {
    public TuxTextView LLJLIL;
    public long LLJLILLLLZIIL;
    public Rect LLJLL;
    public final C01GW LLJLLIL;
    public boolean LLJLLL;
    public final C1077570e9D LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleUpSlideComponent,type:");
        sbLIZ.append(this.LL.type);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        super.LJIJI();
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLLF.getValue());
        }
        ViewGroup viewGroup2 = this.LLJJIII;
        if (viewGroup2 != null) {
            viewGroup2.setOnTouchListener(null);
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        String str;
        String str2;
        Long lValueOf;
        super.LJII(anoleComponentAppearModel);
        AnoleLogInfo logInfo = this.LL.getLogInfo();
        if (logInfo == null || (str = logInfo.tag) == null) {
            str = "incentive_ad";
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, "othershow", this.LLILLJJLI.LIZLLL);
        AnoleLogInfo logInfo2 = this.LL.getLogInfo();
        if (logInfo2 == null || (str2 = logInfo2.refer) == null) {
            str2 = "up_slide";
        }
        c1022820ciuLIZLLL.LIZJ(str2, "refer");
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(this.LL.getID()), "component_id");
        AnoleModel anoleModel = this.LLILLJJLI.LIZLLL.getAnoleModel();
        if (anoleModel != null) {
            lValueOf = Long.valueOf(anoleModel.templateID);
        } else {
            lValueOf = null;
        }
        c1022820ciuLIZLLL.LIZIZ(lValueOf, "template_id");
        c1022820ciuLIZLLL.LIZIZ(this.LL.type, "component_type");
        c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
        c1022820ciuLIZLLL.LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        TuxTextView tuxTextView;
        ViewGroup viewGroup2;
        int childCount;
        ViewParent parent;
        C1295960jpS c1295960jpS;
        super.Fk(viewGroup, interfaceC1014340cVE);
        AnoleUpSlideComponetDataModel anoleUpSlideComponetDataModel = (AnoleUpSlideComponetDataModel) this.LLJLLIL.getValue();
        if (anoleUpSlideComponetDataModel != null) {
            boolean z = false;
            int i = 0;
            z = false;
            z = false;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.pd, this.LLJJIII, false);
            this.LLJJIJIL = viewTd;
            ViewParent parent2 = null;
            if (viewTd != null) {
                tuxTextView = (TuxTextView) viewTd.findViewById(R.id.up_slide_text);
            } else {
                tuxTextView = null;
            }
            this.LLJLIL = tuxTextView;
            if (tuxTextView != null) {
                tuxTextView.setText(anoleUpSlideComponetDataModel.getUpSlideText());
            }
            View view = this.LLJJIJIL;
            if (view != null && (c1295960jpS = (C1295960jpS) view.findViewById(R.id.up_slide_lottie)) != null) {
                c1295960jpS.setRepeatCount(-1);
                c1295960jpS.playAnimation();
            }
            ViewGroup viewGroup3 = this.LLJJIII;
            if (viewGroup3 != null) {
                viewGroup3.addOnLayoutChangeListener((View.OnLayoutChangeListener) this.LLLF.getValue());
            }
            ViewGroup viewGroup4 = this.LLJJIII;
            if (viewGroup4 != null) {
                viewGroup4.setOnTouchListener((View.OnTouchListener) this.LLL.getValue());
            }
            ViewGroup viewGroup5 = this.LLJJIII;
            if (viewGroup5 != null && (parent = viewGroup5.getParent()) != null) {
                parent2 = parent.getParent();
            }
            if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null && (childCount = viewGroup2.getChildCount()) > 0) {
                C013C c013c = new C013C();
                do {
                    View childAt = viewGroup2.getChildAt(i);
                    if (childAt instanceof InterfaceC1003660cE0) {
                        ((InterfaceC1003660cE0) childAt).setScrollViewOutListener(this);
                        c013c.element = true;
                    } else if (childAt instanceof ViewGroup) {
                        C1003640cDy.LIZ((ViewGroup) childAt, AFwS252S0000000_16.get$arr$(15), new AwS382S0200000_16(this, c013c, 6));
                    }
                    i++;
                } while (i < childCount);
                z = c013c.element;
            }
            LJIILL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initUpSlideLayout addSuccess=");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC1035160d2o
    public final boolean LIZIZ(float f, float f2) {
        return this.LLJLL.contains((int) f, (int) f2);
    }

    @Override // X.InterfaceC1035160d2o
    public final boolean LJI(float f, float f2, float f3) {
        if (!this.LLJLL.contains((int) f2, (int) f3) || f3 >= f) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJLILLLLZIIL >= 500) {
            this.LLJLILLLLZIIL = jCurrentTimeMillis;
            return false;
        }
        AnoleUpSlideComponetDataModel anoleUpSlideComponetDataModel = (AnoleUpSlideComponetDataModel) this.LLJLLIL.getValue();
        if (anoleUpSlideComponetDataModel != null) {
            C1003640cDy.LIZIZ(this, anoleUpSlideComponetDataModel);
        }
        return true;
    }

    public C1003650cDz(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLL = new Rect();
        this.LLJLLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 11));
        this.LLJZ = new C1077570e9D(this, 0);
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS417S0200000_16(context, this, 2));
        this.LLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 10));
        this.LLLF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 12));
    }
}
