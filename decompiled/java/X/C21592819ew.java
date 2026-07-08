package X;

import android.animation.Animator;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21592819ew extends AbstractC1664490tPr<C21593019ey, C1647960szC> {
    public C21592519et LLJJJIL;
    public ViewGroup LLJJJJ;
    public boolean LLJJJJLIIL;
    public Animator LLJJL;
    public Scene LLJL;
    public float LLJJJJJIL = -1.0f;
    public int LLJJLIIIJLLLLLLLZ = -1;

    public final void LLLLLJIL() {
        Activity activity;
        if (this.LLJJJJLIIL || (activity = this.mActivity) == null) {
            return;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.LLJJJJJIL = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        this.LLJJJJLIIL = true;
    }

    public final void LLLLLJLJLL() {
        Activity activity;
        if (!this.LLJJJJLIIL || (activity = this.mActivity) == null) {
            return;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = this.LLJJJJJIL;
        window.setAttributes(attributes);
        this.LLJJJJLIIL = false;
    }

    public final void LLLLLLIL() {
        if (C545820Lau.LIZIZ(this) == null) {
            return;
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (Intrinsics.LJFF(navigationSceneLIZ != null ? navigationSceneLIZ.LLLLIIIILLL() : null, this.LLJL)) {
            TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ((C19EG) requireActivity());
            tuxImmersionBarLJ.LIZ(false);
            tuxImmersionBarLJ.LJIIIZ(0);
            tuxImmersionBarLJ.LIZIZ.LJIIJ(false);
            tuxImmersionBarLJ.LIZIZ.LJII(false);
            tuxImmersionBarLJ.LJ(R.attr.e1);
            tuxImmersionBarLJ.LIZLLL();
        }
    }

    public final void LLLLLL(int i) {
        Scene sceneLLLLIIIILLL;
        if (C545820Lau.LIZIZ(this) == null) {
            return;
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            sceneLLLLIIIILLL = navigationSceneLIZ.LLLLIIIILLL();
        } else {
            sceneLLLLIIIILLL = null;
        }
        if (!Intrinsics.LJFF(sceneLLLLIIIILLL, this.LLJL)) {
            return;
        }
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ((C19EG) requireActivity());
        tuxImmersionBarLJ.LIZ(false);
        tuxImmersionBarLJ.LJIIIZ(0);
        tuxImmersionBarLJ.LIZIZ.LJIIJ(true);
        tuxImmersionBarLJ.LJFF(i);
        tuxImmersionBarLJ.LIZIZ.LJII(true);
        tuxImmersionBarLJ.LIZLLL();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Scene sceneLLLLIIIILLL;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ept, viewGroup, false);
        this.LLJJJJ = (ViewGroup) viewTd.findViewById(R.id.gn_);
        C21592519et c21592519et = new C21592519et(requireSceneContext(), LLLLILI().LIZ.LIZ);
        C786410Ut5.LLII(c21592519et, 8);
        this.LLJJJIL = c21592519et;
        ViewGroup viewGroup2 = this.LLJJJJ;
        if (viewGroup2 != null) {
            viewGroup2.addView(c21592519et, -1, -1);
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            sceneLLLLIIIILLL = navigationSceneLIZ.LLLLIIIILLL();
        } else {
            sceneLLLLIIIILLL = null;
        }
        this.LLJL = sceneLLLLIIIILLL;
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19f1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21593019ey) obj).LIZIZ;
            }
        }, new AwS612S0100000_33(this, 120));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19f2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21593019ey) obj).LJII;
            }
        }, new AwS612S0100000_33(this, 121));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.19ex
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21593019ey) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 122));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19f3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21593019ey) obj).LIZLLL;
            }
        }, new AwS612S0100000_33(this, 123));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19f4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21593019ey) obj).LJFF;
            }
        }, new AwS612S0100000_33(this, 117));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19ez
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21593019ey) obj).LJ;
            }
        }, new AwS612S0100000_33(this, 118));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.19f0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21593019ey) obj).LJI;
            }
        }, new AwS612S0100000_33(this, 119));
        return (ViewGroup) viewTd;
    }
}
