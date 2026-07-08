package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ESh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364890ESh extends AbstractC375510Ent<C362760EKc, Unit> {
    public C0E48 LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 661));
    public final CreativeBottomSheetBehavior<View> LLJJJ;
    public InterfaceC364910ESj LLJJJIL;
    public final C0FXH LLJJJJ;

    @Override // X.AbstractC375510Ent
    public final Function1<C539960LFq, Unit> LLLLIIIILLL() {
        return new AwS584S0100000_5(this, 561);
    }

    @Override // X.AbstractC375510Ent
    public final Function1<C1DRF, Unit> LLLLIILL() {
        return new AwS584S0100000_5(this, 562);
    }

    public final int LLLLL() {
        C361860EGq c361860EGq;
        C362760EKc c362760EKc = (C362760EKc) this.LLJILLL;
        return (c362760EKc == null || (c361860EGq = c362760EKc.LLJIJIL) == null) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)) : c361860EGq.LIZIZ;
    }

    public C364890ESh() {
        CreativeBottomSheetBehavior<View> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = false;
        creativeBottomSheetBehavior.LJIIJ = false;
        this.LLJJJ = creativeBottomSheetBehavior;
        this.LLJJJJ = new C0FXH(this, 5);
    }

    @Override // X.AbstractC375510Ent
    public final Integer LLLLIL() {
        return Integer.valueOf(R.id.gcw);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLLLLLZIL(this.LLJJJJ);
        }
    }

    @Override // X.AbstractC375510Ent, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        if (!C0E47.LIZ()) {
            return;
        }
        Scene scene = this.mParentScene;
        if (scene != null && (view = scene.mView) != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ESk
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            View viewFindViewById = view.findViewById(R.id.yg_);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
        }
        C1447800nmM.LIZIZ(this).LLLIILIL(this, this.LLJJJJ);
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg == null) {
            return;
        }
        this.LLJJJIL = (InterfaceC364910ESj) c1drg.LJIIL(null, InterfaceC364910ESj.class);
        this.LLJJIJIIJIL = C349830DnZ.LIZ(c1drg);
    }

    @Override // X.AbstractC375510Ent
    public final void LLLLJI(C18YA c18ya, Activity activity) {
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLLII = false;
        c214799194j.LLJL = R.style.y0;
        c214799194j.LLJLILLLLZIIL = this.LLJJJ;
        c18ya.LIZIZ(EnumC214804194o.FIXED);
        C0ETP c0etp = new C0ETP() { // from class: X.0ETO
            @Override // X.C0ETP
            public final void LIZ(C214800194k c214800194k, AwS576S0100000_32 awS576S0100000_32) throws Throwable {
                awS576S0100000_32.invoke();
            }

            @Override // X.C0ETP
            public final void LIZIZ(C214800194k c214800194k, AwS549S0100000_5 awS549S0100000_5) {
                awS549S0100000_5.invoke();
            }
        };
        C214799194j c214799194j2 = c18ya.LIZ;
        c214799194j2.LLLFFI = c0etp;
        c214799194j2.LLLFZ = false;
        c214799194j2.LLJJLIIIJLLLLLLLZ = false;
        c214799194j2.LLJJJJLIIL = false;
        c18ya.LIZ.LLJLLIL = new AwS549S0100000_5(this, 662);
    }

    @Override // X.AbstractC375510Ent, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c08, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = LLLLL();
            C786410Ut5.W5(viewGroup2, layoutParams);
            C786410Ut5.bd(LLLLL(), viewGroup2);
            viewGroup2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ESi
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
            return viewGroup2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
