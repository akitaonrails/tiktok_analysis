package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364510EQv extends AbstractC375510Ent<C364490EQt, Unit> {
    public InterfaceC364550EQz LLJJIJIL;
    public final C0E48 LLJJJIL;
    public final CreativeBottomSheetBehavior<View> LLJJJJ;
    public final C0FXH LLJJJJJIL;
    public EnumC362260EIe LLJJJJLIIL;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 614));
    public String LLJJJ = "";

    @Override // X.AbstractC375510Ent
    public final Function1<C539960LFq, Unit> LLLLIIIILLL() {
        return new AwS584S0100000_5(this, 542);
    }

    @Override // X.AbstractC375510Ent
    public final Function1<C1DRF, Unit> LLLLIILL() {
        return new AwS584S0100000_5(this, 543);
    }

    public final int LLLLL() {
        C0EJ2 c0ej2;
        C364490EQt c364490EQt = (C364490EQt) this.LLJILLL;
        if (c364490EQt != null && (c0ej2 = c364490EQt.LLJILJIL) != null) {
            return c0ej2.LIZ;
        }
        int iLIZ = (int) (C1415610mwR.LIZ() * 0.4f);
        int i = C0ES4.LIZIZ;
        return iLIZ + C0ES4.LIZJ;
    }

    public final void LLLLLIL() {
        C0EJ2 c0ej2;
        C0EJ2 c0ej22;
        C0E48 c0e48;
        C364490EQt c364490EQt;
        InterfaceC362230EIb interfaceC362230EIb;
        View viewFindViewById;
        C0E55 c0e55LJIIJJI;
        C0E55 c0e55LJIIJJI2;
        Function0<Unit> function0;
        C364490EQt c364490EQt2 = (C364490EQt) this.LLJILLL;
        if (c364490EQt2 != null && (function0 = c364490EQt2.LLJILLL) != null) {
            function0.invoke();
        }
        C364490EQt c364490EQt3 = (C364490EQt) this.LLJILLL;
        if (c364490EQt3 != null && (c0e55LJIIJJI2 = c364490EQt3.LJIIJJI()) != null) {
            c0e55LJIIJJI2.LJIJJLI();
        }
        C364490EQt c364490EQt4 = (C364490EQt) this.LLJILLL;
        if (c364490EQt4 != null && (c0e55LJIIJJI = c364490EQt4.LJIIJJI()) != null) {
            c0e55LJIIJJI.pause(false);
        }
        C364490EQt c364490EQt5 = (C364490EQt) this.LLJILLL;
        if (c364490EQt5 == null || (c0ej2 = c364490EQt5.LLJILJIL) == null || !c0ej2.LIZLLL) {
            return;
        }
        C19A3 c19a3 = c364490EQt5.LLJ;
        if (c19a3 != null && (viewFindViewById = c19a3.findViewById(R.id.gct)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        EnumC362260EIe enumC362260EIe = this.LLJJJJLIIL;
        EnumC362260EIe enumC362260EIe2 = EnumC362260EIe.MIN;
        if (enumC362260EIe == enumC362260EIe2 && (c364490EQt = (C364490EQt) this.LLJILLL) != null && (interfaceC362230EIb = (InterfaceC362230EIb) c364490EQt.LLJJJJ.getValue(c364490EQt, C364490EQt.LLJJL[8])) != null) {
            interfaceC362230EIb.td1(enumC362260EIe2);
        }
        C364490EQt c364490EQt6 = (C364490EQt) this.LLJILLL;
        if (c364490EQt6 == null || (c0ej22 = c364490EQt6.LLJILJIL) == null || c0ej22.LIZIZ || (c0e48 = c364490EQt6.LLILLJJLI) == null) {
            return;
        }
        c0e48.S7().LIZIZ(new C0E2C(LLLLL(), "INLINE_CAPTION_word_filter", false), "panel_bounce_event", false);
    }

    public C364510EQv() {
        I i = this.LLJILLL;
        this.LLJJJIL = i != 0 ? i.LLILLJJLI : null;
        CreativeBottomSheetBehavior<View> creativeBottomSheetBehavior = new CreativeBottomSheetBehavior<>();
        creativeBottomSheetBehavior.LJJ = false;
        creativeBottomSheetBehavior.LJIIJ = false;
        this.LLJJJJ = creativeBottomSheetBehavior;
        this.LLJJJJJIL = new C0FXH(this, 3);
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
            navigationSceneLIZ.LLLLLLLZIL(this.LLJJJJJIL);
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
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ER4
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
            navigationSceneLIZ.LLLIILIL(this, this.LLJJJJJIL);
        }
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg == null) {
            return;
        }
        this.LLJJIJIL = (InterfaceC364550EQz) c1drg.LJIIL(null, InterfaceC364550EQz.class);
    }

    @Override // X.AbstractC375510Ent
    public final void LLLLJI(C18YA c18ya, Activity activity) {
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLLII = false;
        c214799194j.LLJL = R.style.y0;
        c214799194j.LLJLILLLLZIIL = this.LLJJJJ;
        c18ya.LIZIZ(EnumC214804194o.FIXED);
        C214799194j c214799194j2 = c18ya.LIZ;
        c214799194j2.LLLFZ = false;
        c214799194j2.LLJJLIIIJLLLLLLLZ = false;
        c214799194j2.LLJJJJLIIL = false;
        c18ya.LIZ.LLJZ = new AwS549S0100000_5(this, 615);
    }

    @Override // X.AbstractC375510Ent, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0EJ2 c0ej2;
        InterfaceC362230EIb interfaceC362230EIb;
        C0EJ2 c0ej22;
        C0E48 c0e48;
        View viewFindViewById;
        InterfaceC360800ECo interfaceC360800ECo;
        I i;
        C0E48 c0e482;
        String uuid;
        NLECommit head;
        C0E48 c0e483;
        NLEEditor nLEEditorLJI;
        NLEBranch branch;
        NLECommit head2;
        String uuid2;
        setTheme(R.style.y0);
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c09, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = LLLLL();
            C786410Ut5.W5(viewGroup2, layoutParams);
            I i2 = this.LLJILLL;
            if (i2 != 0 && (c0e483 = i2.LLILLJJLI) != null && (nLEEditorLJI = c0e483.LLFII().LJI()) != null && (branch = nLEEditorLJI.getBranch()) != null && (head2 = branch.getHead()) != null && (uuid2 = head2.getUUID()) != null) {
                this.LLJJJ = uuid2;
            }
            C364490EQt c364490EQt = (C364490EQt) this.LLJILLL;
            EnumC362260EIe enumC362260EIePg0 = null;
            if (c364490EQt != null && (interfaceC360800ECo = (InterfaceC360800ECo) c364490EQt.LLJJIJIIJIL.getValue(c364490EQt, C364490EQt.LLJJL[4])) != null && (i = this.LLJILLL) != 0 && (c0e482 = i.LLILLJJLI) != null) {
                NLEBranch branch2 = c0e482.LLFII().LJI().getBranch();
                if (branch2 != null && (head = branch2.getHead()) != null) {
                    uuid = head.getUUID();
                } else {
                    uuid = null;
                }
                if (c0e482.Bo().LIZ()) {
                    Intrinsics.LJFF(uuid, this.LLJJJ);
                }
                if (c0e482.Bo().LJFF()) {
                    Intrinsics.LJFF(uuid, this.LLJJJ);
                }
                C0EB4.LIZIZ(interfaceC360800ECo, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO}, null, Boolean.FALSE, null, null, 26);
            }
            C364490EQt c364490EQt2 = (C364490EQt) this.LLJILLL;
            if (c364490EQt2 != null && (c0ej2 = c364490EQt2.LLJILJIL) != null && c0ej2.LIZLLL) {
                C19A3 c19a3 = c364490EQt2.LLJ;
                if (c19a3 != null && (viewFindViewById = c19a3.findViewById(R.id.gct)) != null) {
                    C786410Ut5.LJLLLLLL(4, viewFindViewById);
                }
                C364490EQt c364490EQt3 = (C364490EQt) this.LLJILLL;
                if (c364490EQt3 != null) {
                    interfaceC362230EIb = (InterfaceC362230EIb) c364490EQt3.LLJJJJ.getValue(c364490EQt3, C364490EQt.LLJJL[8]);
                    if (interfaceC362230EIb != null) {
                        enumC362260EIePg0 = interfaceC362230EIb.pg0();
                    }
                } else {
                    interfaceC362230EIb = null;
                }
                this.LLJJJJLIIL = enumC362260EIePg0;
                if (enumC362260EIePg0 == EnumC362260EIe.MIN && interfaceC362230EIb != null) {
                    interfaceC362230EIb.td1(EnumC362260EIe.MAX);
                }
                C364490EQt c364490EQt4 = (C364490EQt) this.LLJILLL;
                if (c364490EQt4 != null && (c0ej22 = c364490EQt4.LLJILJIL) != null && !c0ej22.LIZIZ && (c0e48 = c364490EQt4.LLILLJJLI) != null) {
                    c0e48.S7().LIZIZ(new C0E2C(LLLLL(), "INLINE_CAPTION_word_filter", true), "panel_bounce_event", false);
                }
            }
            return viewGroup2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
