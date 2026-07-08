package X;

import Y.ATListenerS464S0100000_32;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import irm.AkS98S0100000_32;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21348618ge extends AbstractC1664490tPr<C21348918gh, C21350218gu> {
    public static final int LLJZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 629));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 637));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 636));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 632));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 631));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 634));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 635));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 630));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 633));
    public float LLJLL;
    public float LLJLLIL;
    public boolean LLJLLL;

    public final View LLLLLJIL() {
        return (View) this.LLJLIL.getValue();
    }

    public final View LLLLLJLJLL() {
        return (View) this.LLJLILLLLZIIL.getValue();
    }

    public final C197039127h LLLLLL() {
        return (C197039127h) this.LLJL.getValue();
    }

    public final C1322110kVd LLLLLLIL() {
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
        C1322110kVd c1322110kVdLLLLLLIL = LLLLLLIL();
        if (c1322110kVdLLLLLLIL != null && (hierarchy = c1322110kVdLLLLLLIL.getHierarchy()) != null) {
            hierarchy.LJJIII(c1331100kk8LIZLLL);
        }
        if (LLLLILI().LIZ.LJI) {
            View viewLLLLLJIL = LLLLLJIL();
            if (viewLLLLLJIL != null) {
                C786410Ut5.LJLLLLLL(0, viewLLLLLJIL);
            }
        } else {
            View viewLLLLLJIL2 = LLLLLJIL();
            if (viewLLLLLJIL2 != null) {
                C786410Ut5.LJLLLLLL(8, viewLLLLLJIL2);
            }
        }
        View viewLLLLLJIL3 = LLLLLJIL();
        if (viewLLLLLJIL3 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 13), viewLLLLLJIL3);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21348918gh) obj).LJI);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 309));
        if (LLLLILI().LIZ.LJ) {
            View viewLLLLLJLJLL = LLLLLJLJLL();
            if (viewLLLLLJLJLL != null) {
                C786410Ut5.LJLLLLLL(0, viewLLLLLJLJLL);
            }
        } else {
            View viewLLLLLJLJLL2 = LLLLLJLJLL();
            if (viewLLLLLJLJLL2 != null) {
                C786410Ut5.LJLLLLLL(8, viewLLLLLJLJLL2);
            }
        }
        View viewLLLLLJLJLL3 = LLLLLJLJLL();
        if (viewLLLLLJLJLL3 != null) {
            viewLLLLLJLJLL3.setOnTouchListener(new ATListenerS464S0100000_32(this, 5));
        }
        View viewLLLLLJLJLL4 = LLLLLJLJLL();
        if (viewLLLLLJLJLL4 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 14), viewLLLLLJLJLL4);
        }
        View viewLLLLLJLJLL5 = LLLLLJLJLL();
        if (viewLLLLLJLJLL5 != null) {
            viewLLLLLJLJLL5.setOnLongClickListener(new C19LZ(this, 0));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21348918gh) obj).LJ);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 310));
        C197039127h c197039127hLLLLLL = LLLLLL();
        if (c197039127hLLLLLL != null) {
            c197039127hLLLLLL.LJJJJL(AFwS229S0000000_2.get$arr$(728));
        }
        C197039127h c197039127hLLLLLL2 = LLLLLL();
        if (c197039127hLLLLLL2 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 6), c197039127hLLLLLL2);
        }
        if (LLLLILI().LIZ.LJFF) {
            C197039127h c197039127hLLLLLL3 = LLLLLL();
            if (c197039127hLLLLLL3 != null) {
                C786410Ut5.LJLLLLLL(0, c197039127hLLLLLL3);
            }
        } else {
            C197039127h c197039127hLLLLLL4 = LLLLLL();
            if (c197039127hLLLLLL4 != null) {
                C786410Ut5.LJLLLLLL(8, c197039127hLLLLLL4);
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21348918gh) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 307));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21348918gh) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 308));
        View view = (View) this.LLJJJIL.getValue();
        if (view != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 9), view);
        }
        View view2 = (View) this.LLJJJJLIIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 11), view2);
        }
        View view3 = (View) this.LLJJJJ.getValue();
        if (view3 != null) {
            C786410Ut5.I7(new AkS98S0100000_32(this, 12), view3);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21348918gh) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 304));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21348918gh) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 668));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21348918gh) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 669));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18gf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C21348918gh) obj).LJII);
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 305));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.oh, viewGroup, false);
    }
}
