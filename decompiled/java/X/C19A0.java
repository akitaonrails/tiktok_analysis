package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;

/* JADX INFO: renamed from: X.19A0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19A0 {
    public static final /* synthetic */ int LJFF = 0;
    public final C214932199m LIZ;
    public final ViewGroup LIZIZ;
    public final C19AK<C214932199m> LIZJ;
    public SAFFragmentRootScene LIZLLL;
    public C19A1 LJ = C19A1.LL;

    public final void LIZJ() {
        C19A1 c19a1 = this.LJ;
        if (c19a1 == C19A1.LLILZLL || c19a1 == C19A1.LLILLJJLI) {
            this.LJ = C19A1.LL;
            this.LIZJ.LJI();
        }
    }

    public final void LIZLLL() {
        if (this.LJ != C19A1.LLILZ) {
            return;
        }
        this.LJ = C19A1.LLILZIL;
        this.LIZJ.LIZIZ();
    }

    public final void LJ() {
        C19A1 c19a1 = this.LJ;
        if (c19a1 == C19A1.LLILLL || c19a1 == C19A1.LLILZIL) {
            this.LJ = C19A1.LLILZ;
            this.LIZJ.LIZJ();
        }
    }

    public final void LJFF() {
        C19A1 c19a1 = this.LJ;
        if (c19a1 == C19A1.LLILLJJLI || c19a1 == C19A1.LLILZLL) {
            this.LJ = C19A1.LLILLL;
            this.LIZJ.LJ();
        }
    }

    public final void LJI() {
        C19A1 c19a1 = this.LJ;
        if (c19a1 == C19A1.LLILZIL || c19a1 == C19A1.LLILLL) {
            this.LJ = C19A1.LLILZLL;
            this.LIZJ.LJFF();
        }
    }

    public final Activity LJII() {
        Activity activityLJFF = SAFExtensionKt.LJFF(this.LIZIZ.getContext());
        if (activityLJFF != null) {
            return activityLJFF;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no activity found for: ");
        sbLIZ.append(this.LIZIZ.getContext());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void LJIIIIZZ() {
        C19A1 c19a1 = this.LJ;
        if (c19a1 == C19A1.LL) {
            return;
        }
        int iOrdinal = c19a1.ordinal();
        while (iOrdinal < C19A1.values().length) {
            iOrdinal++;
            if (iOrdinal == 2) {
                LJFF();
            } else if (iOrdinal == 3) {
                LJ();
            } else if (iOrdinal == 4) {
                LIZLLL();
            } else if (iOrdinal == 5) {
                LJI();
            }
        }
        LIZJ();
    }

    public final void LIZIZ(Bundle bundle) {
        if (this.LJ != C19A1.LL) {
            return;
        }
        this.LJ = C19A1.LLILLJJLI;
        this.LIZJ.LIZ(LJII(), bundle);
    }

    public C19A0(C214932199m c214932199m, ViewGroup viewGroup) {
        this.LIZ = c214932199m;
        this.LIZIZ = viewGroup;
        this.LIZJ = new C19AK<>(viewGroup.getId(), new InterfaceC19394510uF() { // from class: X.19A2
            @Override // X.InterfaceC19394510uF
            public final <T extends View> T LIZ(int i) {
                return this.LIZ.LIZIZ;
            }
        }, c214932199m, C214937199r.LJI, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C19A0 c19a0, C19EG c19eg) {
        InterfaceC20622815ms interfaceC20622815ms;
        NavigationScene navigationScene;
        Bundle bundle;
        InterfaceC214897198d interfaceC214897198d;
        ComponentCallbacks2 componentCallbacks2LJII = c19a0.LJII();
        if ((componentCallbacks2LJII instanceof InterfaceC214897198d) && (interfaceC20622815ms = (InterfaceC20622815ms) componentCallbacks2LJII) != null && (navigationScene = interfaceC20622815ms.getNavigationScene()) != null) {
            boolean zBooleanValue = ((Boolean) C18067075t.LIZ.getValue()).booleanValue();
            Bundle bundle2 = c19a0.LIZ.mArguments;
            if (bundle2 != null && (bundle = bundle2.getBundle("child_scene_class_arguments")) != null) {
                C214932199m c214932199mLIZ = AnonymousClass1998.LIZ(bundle, false, false, ((Boolean) C1107604Uw.LIZ.getValue()).booleanValue());
                if ((c19eg instanceof InterfaceC214897198d) && (interfaceC214897198d = (InterfaceC214897198d) c19eg) != null) {
                    interfaceC214897198d.setDynamicParentScene(c214932199mLIZ);
                }
                C569760MWg c569760MWg = new C569760MWg();
                c569760MWg.LIZJ = new C214798194i();
                if (zBooleanValue) {
                    c569760MWg.LJ = true;
                }
                navigationScene.LLLLLLLLLL(c214932199mLIZ, c569760MWg.LIZ());
                if (zBooleanValue) {
                    navigationScene.LLLJL();
                }
                C214932199m c214932199m = c19a0.LIZ;
                SAFFragmentRootScene sAFFragmentRootScene = c214932199m.LLJI;
                if (sAFFragmentRootScene != null) {
                    c214932199m.LLJI = null;
                    View view = sAFFragmentRootScene.mView;
                    if (view != null) {
                        C19BL.LJFF(view);
                    }
                    c19a0.LIZLLL = sAFFragmentRootScene;
                    c214932199mLIZ.LLLII(sAFFragmentRootScene);
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("original scene has no arguments: ");
            sbLIZ.append(c19a0.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("no navigation scene found for ");
        sbLIZ2.append(c19a0.LIZIZ);
        sbLIZ2.append('(');
        sbLIZ2.append(c19a0.LIZIZ.getId());
        sbLIZ2.append(')');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }
}
