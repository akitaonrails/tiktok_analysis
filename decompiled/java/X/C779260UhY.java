package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779260UhY extends C779160UhO {
    public InterfaceC779250UhX LJI;
    public DataChannel LJII;
    public boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final TextView LJIIJ;
    public final TextView LJIIJJI;

    @Override // X.C779160UhO, X.InterfaceC779170UhP
    public final int getResId() {
        return R.id.my9;
    }

    @Override // X.C779160UhO
    public final void LJIIIIZZ() {
        TextView textView = this.LJIIJ;
        if (textView != null) {
            C439101nJ.LJI(textView);
        }
        TextView textView2 = this.LJIIJJI;
        if (textView2 != null) {
            C439101nJ.LJI(textView2);
        }
        View view = this.LIZLLL;
        if (view != null) {
            C439101nJ.LJI(view);
        }
        this.LJIIIIZZ = false;
    }

    @Override // X.C779160UhO, X.InterfaceC779170UhP
    public final void LJ(ConstraintFloatWindowLayout constraintFloatWindowLayout) {
        super.LJ(constraintFloatWindowLayout);
        new C19O5(this.LIZLLL).LIZ(4, R.id.myd, 4, (C439101nJ.LIZ(28) - this.LJIIIZ) + C439101nJ.LIZ(4));
    }

    public final void LJIILL(int i) {
        if (i == 1) {
            C786410Ut5.Ib(this.LIZLLL, 0.0f);
            TextView textView = this.LJIIJ;
            if (textView != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
                textView.setRotationY(0.0f);
            }
            TextView textView2 = this.LJIIJJI;
            if (textView2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView2);
                textView2.setRotationY(0.0f);
            }
        } else {
            C786410Ut5.Ib(this.LIZLLL, 180.0f);
            TextView textView3 = this.LJIIJ;
            if (textView3 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView3);
                textView3.setRotationY(180.0f);
            }
            TextView textView4 = this.LJIIJJI;
            if (textView4 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView4);
                textView4.setRotationY(180.0f);
            }
        }
        View view = this.LIZLLL;
        if (view != null) {
            C12ES.LJIILL(0, view);
        }
        this.LJIIIIZZ = true;
    }

    public C779260UhY(Context context, View view) {
        super(context);
        int iLIZIZ = (int) C497740JfY.LIZIZ(36.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(15.0f);
        this.LJIIIZ = iLIZIZ2;
        this.LJIIJ = (TextView) view.findViewById(R.id.f689cxo);
        this.LJIIJJI = (TextView) view.findViewById(R.id.cxp);
        this.LIZLLL = view;
        LJIIL(iLIZIZ, iLIZIZ2);
        LJII(-iLIZIZ, -C439101nJ.LIZ(36));
    }
}
