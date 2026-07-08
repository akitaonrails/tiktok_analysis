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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ERB, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ERB extends AbstractC375510Ent<C0ERA, Unit> {
    public C0ERC LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 629));
    public final CreativeBottomSheetBehavior<View> LLJJJ;
    public final C0FXH LLJJJIL;
    public EnumC362260EIe LLJJJJ;

    @Override // X.AbstractC375510Ent
    public final Function1<C539960LFq, Unit> LLLLIIIILLL() {
        return new AwS584S0100000_5(this, 549);
    }

    @Override // X.AbstractC375510Ent
    public final Function1<C1DRF, Unit> LLLLIILL() {
        return new AwS584S0100000_5(this, 550);
    }

    public final void LLLLL() {
        C1914207ee c1914207ee;
        C0ERA c0era;
        InterfaceC362230EIb interfaceC362230EIb;
        View viewFindViewById;
        C0E48 c0e48;
        C0E55 player;
        C0E48 c0e482;
        Function0<Unit> function0;
        C0ERA c0era2 = (C0ERA) this.LLJILLL;
        if (c0era2 != null && (function0 = c0era2.LLJILJIL) != null) {
            function0.invoke();
        }
        I i = this.LLJILLL;
        if (i != 0 && (c0e482 = i.LLILLJJLI) != null) {
            c0e482.S7().LIZIZ(Boolean.FALSE, "is_bottom_panel_showing", false);
        }
        I i2 = this.LLJILLL;
        if (i2 != 0 && (c0e48 = i2.LLILLJJLI) != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
        C0ERA c0era3 = (C0ERA) this.LLJILLL;
        if (c0era3 == null || (c1914207ee = c0era3.LLJIJIL) == null || !c1914207ee.LIZIZ) {
            return;
        }
        C19A3 c19a3 = c0era3.LLJ;
        if (c19a3 != null && (viewFindViewById = c19a3.findViewById(R.id.gct)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        EnumC362260EIe enumC362260EIe = this.LLJJJJ;
        EnumC362260EIe enumC362260EIe2 = EnumC362260EIe.MIN;
        if (enumC362260EIe != enumC362260EIe2 || (c0era = (C0ERA) this.LLJILLL) == null || (interfaceC362230EIb = (InterfaceC362230EIb) c0era.LLJJI.getValue(c0era, C0ERA.LLJJIJIIJIL[7])) == null) {
            return;
        }
        interfaceC362230EIb.td1(enumC362260EIe2);
    }

    public C0ERB() {
        CreativeBottomSheetBehavior<View> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = true;
        creativeBottomSheetBehavior.LJIIJ = false;
        this.LLJJJ = creativeBottomSheetBehavior;
        this.LLJJJIL = new C0FXH(this, 4);
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
            navigationSceneLIZ.LLLLLLLZIL(this.LLJJJIL);
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
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ERD
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
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLIILIL(this, this.LLJJJIL);
        }
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        C0ERC c0erc = null;
        if (c1drg != null) {
            c0erc = (C0ERC) c1drg.LJIIL(null, C0ERC.class);
        }
        this.LLJJIJIIJIL = c0erc;
    }

    @Override // X.AbstractC375510Ent
    public final void LLLLJI(C18YA c18ya, Activity activity) {
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLLII = false;
        c214799194j.LLJL = R.style.y0;
        c214799194j.LLJLILLLLZIIL = this.LLJJJ;
        c18ya.LIZIZ(EnumC214804194o.FIXED);
        C214799194j c214799194j2 = c18ya.LIZ;
        c214799194j2.LLLFZ = false;
        c214799194j2.LLJJJJLIIL = false;
        c214799194j2.LLJJLIIIJLLLLLLLZ = false;
        c18ya.LIZ.LLJZ = new AwS549S0100000_5(this, 630);
        c18ya.LIZ.LLJLLIL = new AwS549S0100000_5(this, 631);
    }

    @Override // X.AbstractC375510Ent, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iLIZIZ;
        C0E48 c0e48;
        C1914207ee c1914207ee;
        InterfaceC362230EIb interfaceC362230EIb;
        C19A3 c19a3;
        View viewFindViewById;
        InterfaceC360800ECo interfaceC360800ECo;
        C1914207ee c1914207ee2;
        setTheme(R.style.y0);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bzx, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (layoutParams != null) {
            C0ERA c0era = (C0ERA) this.LLJILLL;
            if (c0era != null && (c1914207ee2 = c0era.LLJIJIL) != null) {
                iLIZIZ = c1914207ee2.LIZ;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(319));
            }
            layoutParams.height = iLIZIZ;
            C786410Ut5.W5(viewGroup2, layoutParams);
            C0ERA c0era2 = (C0ERA) this.LLJILLL;
            if (c0era2 != null && (interfaceC360800ECo = (InterfaceC360800ECo) c0era2.LLJJ.getValue(c0era2, C0ERA.LLJJIJIIJIL[4])) != null) {
                EnumC373450EkZ[] enumC373450EkZArr = {EnumC373450EkZ.FULL_SCREEN};
                Boolean bool = Boolean.FALSE;
                C0EB4.LIZIZ(interfaceC360800ECo, enumC373450EkZArr, null, bool, null, null, 26);
                C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO}, null, bool, null, null, 26);
                C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.REDO}, null, bool, null, null, 26);
            }
            C0ERA c0era3 = (C0ERA) this.LLJILLL;
            if (c0era3 != null && (c1914207ee = c0era3.LLJIJIL) != null && c1914207ee.LIZIZ) {
                EnumC362260EIe enumC362260EIePg0 = null;
                if (c0era3 != null && (c19a3 = c0era3.LLJ) != null && (viewFindViewById = c19a3.findViewById(R.id.gct)) != null) {
                    C786410Ut5.LJLLLLLL(4, viewFindViewById);
                }
                C0ERA c0era4 = (C0ERA) this.LLJILLL;
                if (c0era4 != null) {
                    interfaceC362230EIb = (InterfaceC362230EIb) c0era4.LLJJI.getValue(c0era4, C0ERA.LLJJIJIIJIL[7]);
                    if (interfaceC362230EIb != null) {
                        enumC362260EIePg0 = interfaceC362230EIb.pg0();
                    }
                } else {
                    interfaceC362230EIb = null;
                }
                this.LLJJJJ = enumC362260EIePg0;
                if (enumC362260EIePg0 == EnumC362260EIe.MIN && interfaceC362230EIb != null) {
                    interfaceC362230EIb.td1(EnumC362260EIe.MAX);
                }
            }
            I i = this.LLJILLL;
            if (i != 0 && (c0e48 = i.LLILLJJLI) != null) {
                c0e48.S7().LIZIZ(Boolean.TRUE, "is_bottom_panel_showing", false);
            }
            return viewGroup2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
