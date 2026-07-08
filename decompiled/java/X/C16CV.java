package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.16CV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16CV extends UserVisibleHintGroupScene implements C16CS {
    public InterfaceC20735516Cb LLJJIJIIJIL;
    public TikTokMediaModel LLJJIJIL;
    public C1322110kVd LLJJJ;
    public View LLJJJIL;
    public ImageView LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;

    public static C16CY LLLLIILL() {
        Pair pair = new Pair(new PointF(0.445f, 0.05f), new PointF(0.55f, 0.95f));
        C16CY c16cy = new C16CY();
        c16cy.LIZJ = 220L;
        c16cy.LIZLLL = 220L;
        c16cy.LIZ = new InterpolatorC1088790eRJ((PointF) pair.getFirst(), (PointF) pair.getSecond());
        new InterpolatorC1088790eRJ((PointF) pair.getFirst(), (PointF) pair.getSecond());
        c16cy.LIZIZ = new InterpolatorC1088790eRJ((PointF) pair.getFirst(), (PointF) pair.getSecond());
        new InterpolatorC1088790eRJ((PointF) pair.getFirst(), (PointF) pair.getSecond());
        return c16cy;
    }

    public final void exit() {
        final View viewLIZJ;
        C16CX c16cx;
        InterfaceC20735516Cb interfaceC20735516Cb = this.LLJJIJIIJIL;
        if (interfaceC20735516Cb == null || (viewLIZJ = interfaceC20735516Cb.LIZJ()) == null) {
            return;
        }
        C16CW c16cw = new C16CW() { // from class: X.16Cc
            @Override // X.C16CW
            public final View LIZ() {
                return viewLIZJ;
            }
        };
        KeyEvent.Callback callback = this.LLJJJIL;
        Rect rect = null;
        if (!(callback instanceof C16CX) || (c16cx = (C16CX) callback) == null) {
            return;
        }
        Rect rectLIZIZ = c16cw.LIZIZ();
        View viewLIZ = c16cw.LIZ();
        if (viewLIZ != null && viewLIZ.isAttachedToWindow()) {
            rect = new Rect();
            viewLIZ.getGlobalVisibleRect(rect);
        }
        c16cx.LIZIZ(rectLIZIZ, rect, new C417900Ga4(), LLLLIILL(), new AwS575S0100000_31(this, 1362));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJJIL;
        if (anonymousClass0956 == null || !(!anonymousClass0956.isCompleted())) {
            return;
        }
        anonymousClass0956.LIZIZ(null);
    }

    @Override // X.C16CS
    public final void onBackPress() {
        exit();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene
    public final void LLLLIIIILLL(boolean z) {
        C16CX c16cx;
        super.LLLLIIIILLL(z);
        if (!z) {
            KeyEvent.Callback callback = this.LLJJJIL;
            if ((callback instanceof C16CX) && (c16cx = (C16CX) callback) != null) {
                c16cx.reset();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C16CX c16cx;
        super.onActivityCreated(bundle);
        this.LLJJJJ = (ImageView) requireViewById(R.id.kgj);
        this.LLJJJ = (C1322110kVd) requireViewById(R.id.g_o);
        View viewRequireViewById = requireViewById(R.id.iuv);
        this.LLJJJIL = viewRequireViewById;
        InterfaceC21574319bx interfaceC21574319bx = new InterfaceC21574319bx() { // from class: X.16Ca
            @Override // X.InterfaceC21574319bx
            public final void onExit() {
                this.LIZ.exit();
            }

            @Override // X.InterfaceC21574319bx
            public final void LIZJ(float f) {
                InterfaceC20735516Cb interfaceC20735516Cb = this.LIZ.LLJJIJIIJIL;
                if (interfaceC20735516Cb != null) {
                    interfaceC20735516Cb.LJIIIZ(f);
                }
            }
        };
        if ((viewRequireViewById instanceof C16CX) && (c16cx = (C16CX) viewRequireViewById) != null) {
            c16cx.setGestureListener(interfaceC21574319bx);
        }
        this.LLJJJJJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C314920CWc(this, null), 3);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ava, viewGroup, false);
    }
}
