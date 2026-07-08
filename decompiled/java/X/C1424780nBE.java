package X;

import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nBE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424780nBE extends AbstractC1664490tPr<C1422810n83, C1422170n71> {
    public C1424850nBL LLJJJJ;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 423));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 421));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 420));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 422));
    public final C1424800nBG LLJJLIIIJLLLLLLLZ = new InterfaceC1424900nBQ() { // from class: X.0nBG
        @Override // X.InterfaceC1424900nBQ
        public final boolean LIZ(TemplateCategoryData templateCategoryData) {
            return C1422460n7U.LIZ(templateCategoryData);
        }

        @Override // X.InterfaceC1424900nBQ
        public final View LIZIZ(TemplateCategoryData templateCategoryData) {
            if (C1422460n7U.LIZ(templateCategoryData)) {
                return (View) this.LIZ.LLJJL.getValue();
            }
            return null;
        }

        @Override // X.InterfaceC1424900nBQ
        public final boolean LIZJ(TemplateCategoryData templateCategoryData) {
            return C1422460n7U.LIZ(templateCategoryData);
        }
    };

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        ViewGroup viewGroup;
        TemplateCategoryData templateCategoryData = LLLLILI().LIZ.LIZIZ;
        C1424850nBL c1424850nBL = new C1424850nBL((C19EG) requireActivity(), this, templateCategoryData, null, new AwS566S0100000_22(templateCategoryData, 424), this.LLJJLIIIJLLLLLLLZ, new C1422940n8G(LLLLIL().LIZ));
        c1424850nBL.setDiContainer(LLLLILI().LIZ.LIZ);
        c1424850nBL.LLJI.setScrollMode(EnumC481060Itk.NONE);
        c1424850nBL.LLJI.setNestedHeader(null);
        View view = this.mView;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(c1424850nBL);
        }
        HandlerHook.viewPost(c1424850nBL, new ARunnableS103S0100000_3((Object) c1424850nBL, 51));
        this.LLJJJJ = c1424850nBL;
    }

    public final Context LLLLLJIL() {
        return (Context) this.LLJJJIL.getValue();
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        ViewGroup viewGroup;
        C1424850nBL c1424850nBL = this.LLJJJJ;
        if (c1424850nBL != null) {
            c1424850nBL.LLJLLIL = false;
            c1424850nBL.LJIJJLI(true);
            View view = this.mView;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                C786410Ut5.LJJJLZIJ(c1424850nBL, viewGroup);
            }
        }
        this.LLJJJJ = null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n85
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1422810n83) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 289));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0n86
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1422810n83) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 290));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nB8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1422810n83) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 269));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0n84
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1422810n83) obj).LJFF;
            }
        }, new AwS601S0100000_22(this, 275));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nB9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1422810n83) obj).LJI;
            }
        }, new AwS601S0100000_22(this, 287));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(C1425570nCV.LIZIZ.LIZLLL());
        FrameLayout frameLayout = new FrameLayout(LLLLLJIL());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackground(C1308910kAL.LJ(R.attr.fut, LLLLLJIL()));
        return frameLayout;
    }
}
