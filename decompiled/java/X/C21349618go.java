package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import irm.AkS98S0100000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21349618go extends AbstractC1664490tPr<C21349018gi, C21350118gt> {
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 622));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 628));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 627));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 625));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 624));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 626));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 623));

    public final C1322110kVd LLLLLJIL() {
        return (C1322110kVd) this.LLJJJJJIL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C1331070kk5 hierarchy;
        super.onActivityCreated(bundle);
        C1331100kk8 c1331100kk8LIZLLL = C1331100kk8.LIZLLL(C418440Gaw.LIZIZ(8));
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            c1331100kk8LIZLLL.LJ(4.0f, C960203pA.LIZ(R.attr.ee, sceneContext));
        }
        c1331100kk8LIZLLL.LIZIZ = false;
        C1322110kVd c1322110kVdLLLLLJIL = LLLLLJIL();
        if (c1322110kVdLLLLLJIL != null && (hierarchy = c1322110kVdLLLLLJIL.getHierarchy()) != null) {
            hierarchy.LJJIII(c1331100kk8LIZLLL);
        }
        View view = (View) this.LLJL.getValue();
        if (view != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 4), view);
        }
        View view2 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (view2 != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
            gradientDrawable.setColors(C0GZ3.LIZLLL(view2.getContext()));
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
            view2.setBackground(gradientDrawable);
        }
        View view3 = (View) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (view3 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 5), view3);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21349018gi) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 665));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21349018gi) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 666));
        View view4 = (View) this.LLJJJIL.getValue();
        if (view4 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 7), view4);
        }
        View view5 = (View) this.LLJJJJLIIL.getValue();
        if (view5 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 8), view5);
        }
        View view6 = (View) this.LLJJJJ.getValue();
        if (view6 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 10), view6);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21349018gi) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 306));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21349018gi) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 670));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.nr, viewGroup, false);
    }
}
